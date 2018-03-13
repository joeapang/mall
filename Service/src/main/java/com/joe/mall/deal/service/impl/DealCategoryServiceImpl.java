package com.joe.mall.deal.service.impl;

import com.joe.mall.deal.dao.DealCategoryDao;
import com.joe.mall.deal.entity.DealCategory;
import com.joe.mall.deal.service.DealCategoryService;
import com.joe.mall.framework.base.commons.Const;
import com.joe.mall.framework.base.dao.BaseDao;
import com.joe.mall.framework.base.service.impl.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service("dealCategoryService")
public class DealCategoryServiceImpl extends AbstractService<DealCategory, Long> implements DealCategoryService {
    @Autowired
    DealCategoryDao dealCategoryDao;

    @Override
    public BaseDao<DealCategory, Long> getDao() {
        return dealCategoryDao;
    }

    @Override
    public List<DealCategory> getCategories() {

        //获取所有未被删除的节点
        List<DealCategory> dealCategories = getAllWithoutDeleted();
        //找出根节点
        List<DealCategory> roots = dealCategories.stream().filter(dealCategory -> dealCategory.getParentId() == 0)
                .sorted(Comparator.comparingInt(DealCategory::getOrderNum)).collect(Collectors.toList());
        //找到所有的子节点
        List<DealCategory> children = dealCategories.stream().filter(dealCategory -> dealCategory.getParentId() != 0)
                .collect(Collectors.toList());
        //对节点结构化
        roots.forEach(root->buildSubs(root,children));
        return dealCategories;
    }


    private List<DealCategory> getAllWithoutDeleted() {
        DealCategory dealCategory = new DealCategory();
        dealCategory.setPublishStatus(Const.DealPublistStatusConst.DEAL_PUBLISH_STATUS_DELETED.getCode());
        List<DealCategory> allDealCategory = dealCategoryDao.selectByKeySelective(dealCategory);
        return allDealCategory;
    }

    /**
     * 递归构建子分类
     * @param parent 父节点
     * @param subs 子节点
     */
    private void buildSubs(DealCategory parent,List<DealCategory> subs){
        List<DealCategory> children= subs.stream().filter(sub->sub.getParentId()==parent.getId()).collect(Collectors.toList());
        if(!CollectionUtils.isEmpty(children)){
            parent.setChild(children);

            children.forEach(child->buildSubs(child,subs));
        }

    }

}

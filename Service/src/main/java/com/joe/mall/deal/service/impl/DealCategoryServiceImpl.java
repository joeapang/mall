package com.joe.mall.deal.service.impl;

import com.joe.mall.deal.dao.DealCategoryDao;
import com.joe.mall.deal.entity.DealCategory;
import com.joe.mall.deal.service.DealCategoryService;
import com.joe.mall.framework.base.commons.Const;
import com.joe.mall.framework.base.dao.BaseDao;
import com.joe.mall.framework.base.service.impl.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DealCategoryServiceImpl extends AbstractService<DealCategory, Long> implements DealCategoryService {
    @Autowired
    DealCategoryDao dealCategoryDao;

    @Override
    public BaseDao<DealCategory, Long> getDao() {
        return dealCategoryDao;
    }

    @Override
    public List<DealCategory> getCategories() {

        List<DealCategory> dealCategories=getAllWithoutDeleted();
        dealCategories.stream().filter(dealCategory -> dealCategory.getParentId()==0);
        return null;
    }


    private List<DealCategory> getAllWithoutDeleted() {
        DealCategory dealCategory = new DealCategory();
        dealCategory.setPublishStatus(Const.DealPublistStatusConst.DEAL_PUBLISH_STATUS_DELETED.getCode());
        List<DealCategory> allDealCategory = dealCategoryDao.selectByKeySelective(dealCategory);
        return allDealCategory;
    }


}

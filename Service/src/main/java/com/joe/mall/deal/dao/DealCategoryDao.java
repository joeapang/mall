package com.joe.mall.deal.dao;

import com.joe.mall.deal.entity.DealCategory;
import com.joe.mall.framework.base.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DealCategoryDao extends BaseDao<DealCategory,Long> {
    /**
     * 通过父id得到类目列表
     * @param parentId
     * @return
     */
    List<DealCategory> selectByParent(@Param("parentId") Long parentId);
}

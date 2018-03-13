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




}

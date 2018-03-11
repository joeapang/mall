package com.joe.mall.deal.entity;

import com.joe.mall.deal.dao.DealCategoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DealCategoryService{

    @Autowired
    private DealCategoryDao dealCategoryDao;

    public int insert(DealCategory pojo){
        return dealCategoryDao.insert(pojo);
    }

    public int insertSelective(DealCategory pojo){
        return dealCategoryDao.insertSelective(pojo);
    }

    public int insertList(List<DealCategory> pojos){
        return dealCategoryDao.insertList(pojos);
    }

    public int update(DealCategory pojo){
        return dealCategoryDao.update(pojo);
    }
}

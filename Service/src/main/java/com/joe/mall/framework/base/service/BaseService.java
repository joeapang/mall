package com.joe.mall.framework.base.service;

import com.joe.mall.framework.base.dao.BaseDao;

import java.io.Serializable;
import java.util.List;

public interface BaseService<T,ID extends Serializable>{
    public abstract BaseDao<T, ID> getDao() ;
    int deleteByPrimaryKey(ID id);
    List<T> selectByKeySelective(T record);
    int insert(T record);
    int insertList(List<T> list);
    int insertSelective(T record);
    T selectByPrimaryKey(ID id);
    int updateByPrimaryKeySelective(T record);
    int updateByPrimaryKey(T record);
}

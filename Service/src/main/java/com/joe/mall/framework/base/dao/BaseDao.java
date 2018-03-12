package com.joe.mall.framework.base.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDao<T,ID extends Serializable>{

    int deleteByPrimaryKey(ID id);
    int insert(T record);
    int insertSelective(T record);
    int insertList(List<T> pojos);
    T selectByPrimaryKey(ID id);
    List<T> selectByKeySelective(T record);
    int updateByPrimaryKeySelective(T record);
    int updateByPrimaryKey(T record);

}

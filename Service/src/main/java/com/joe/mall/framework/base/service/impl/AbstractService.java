package com.joe.mall.framework.base.service.impl;

import com.joe.mall.framework.base.dao.BaseDao;
import com.joe.mall.framework.base.service.BaseService;

import java.io.Serializable;
import java.util.List;

public abstract class AbstractService<T, ID extends Serializable> implements BaseService<T, ID> {
    public abstract BaseDao<T, ID> getDao() ;

    @Override
    public int deleteByPrimaryKey(ID id) {
        return getDao().deleteByPrimaryKey(id);
    }
    public List<T> selectByKeySelective(T record){
        return getDao().selectByKeySelective(record);
    }
    @Override
    public int insertSelective(T record) {
        return getDao().insertSelective(record);
    }

    @Override
    public T selectByPrimaryKey(ID id) {
        return getDao().selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(T record) {
        return getDao().updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKey(T record) {
        return getDao().updateByPrimaryKey(record);
    }

    @Override
    public int insert(T record) {
        return getDao().insert(record);
    }

    @Override
    public int insertList(List<T> list) {
        return getDao().insertList(list);
    }

}

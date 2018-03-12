package com.joe.mall.framework.base.service.impl;

import com.joe.mall.framework.base.dao.BaseDao;
import com.joe.mall.framework.base.service.BaseService;

import java.io.Serializable;

public abstract class AbstractService<T,ID extends Serializable> implements BaseService<T,ID> {
    private BaseDao<T, ID> baseDao;
    public void setBaseDao(BaseDao<T, ID> baseDao) {
        this.baseDao = baseDao;
    }
    @Override
    public int deleteByPrimaryKey(ID id) {
        return baseDao.deleteByPrimaryKey(id);
    }
    @Override
    public int insertSelective(T record) {
        return baseDao.insertSelective(record);
    }
    @Override
    public T selectByPrimaryKey(ID id) {
        return baseDao.selectByPrimaryKey(id);
    }
    @Override
    public int updateByPrimaryKeySelective(T record) {
        return baseDao.updateByPrimaryKey(record);
    }
    @Override
    public int updateByPrimaryKeyWithBLOBs(T record) {
        return baseDao.updateByPrimaryKeyWithBLOBs(record);
    }
    @Override
    public int updateByPrimaryKey(T record) {
        return baseDao.updateByPrimaryKey(record);
    }
    @Override
    public int insert(T record) {
        return baseDao.insert(record);
    }
}

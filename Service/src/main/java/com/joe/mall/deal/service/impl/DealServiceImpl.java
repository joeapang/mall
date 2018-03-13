package com.joe.mall.deal.service.impl;

import com.joe.mall.deal.entity.Deal;
import com.joe.mall.deal.service.DealService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("dealService")
public class DealServiceImpl implements DealService{
    @Override
    public List<Deal> getDealForIndex() {
        return null;
    }
}

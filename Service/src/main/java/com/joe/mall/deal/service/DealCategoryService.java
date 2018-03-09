package com.joe.mall.deal.service;

import com.joe.mall.deal.entity.DealCategory;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DealCategoryService {

    List<DealCategory> getCategories();

}

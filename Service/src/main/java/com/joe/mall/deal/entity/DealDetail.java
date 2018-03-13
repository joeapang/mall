package com.joe.mall.deal.entity;

import com.joe.mall.framework.base.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

public class DealDetail extends BaseEntity {
    @Getter
    @Setter
    private Long dealId;

    @Getter
    @Setter
    private String dealDetail; // 商品详细描述信息

}

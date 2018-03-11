package com.joe.mall.framework.base.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

public abstract class BaseEntity implements Serializable {

    private static final long serialVersionUID = 690780204448004620L;
    @Getter@Setter private Long id;

    @Getter@Setter private String routerCall;

}

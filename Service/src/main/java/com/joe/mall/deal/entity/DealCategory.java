package com.joe.mall.deal.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.joe.mall.framework.base.entity.BaseEntity;
import lombok.*;

import java.util.Date;
import java.util.List;

/**
 * deal分类
 */
@Data
@EqualsAndHashCode(of = {"id", "parentId"}, callSuper = true)
@NoArgsConstructor
@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class DealCategory extends BaseEntity {

    private String name;// 类别名称
    private String urlName;//url 名称
    private Long parentId;//父类别Id
    private Integer publishStatus;//发布状态
    private Date createDate;//创建时间
    private Integer deep;//层级深度
    private Integer orderNum;//排序序号
    private List<DealCategory> child;//子项目


}

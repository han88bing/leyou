package com.leyou.cart.entity;

import lombok.Data;

/**
 * @Author: 姜光明
 * @Date: 2019/5/20 9:59
 */
@Data
public class Cart {
    private Long skuId; //商品id
    private String title;// 标题
    private String image;// 图片
    private Long price;// 加入购物车时的价格
    private Integer num;// 购买数量
    private String ownSpec;// 商品规格参数
}

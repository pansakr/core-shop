package com.ayoh.coreshop.entity;

public enum ProductSellStatus {

    FOR_SALE("판매중"),
    SOLD_OUT("매진");

    private String koreanName;

    ProductSellStatus(String koreanName){this.koreanName = koreanName;}

    public String getKoreanName(){return koreanName;}
}

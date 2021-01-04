package com.bdqn.mall.entity;

/**
 * 地区表
 */
public class Address {
    private String addressAreaId;
    private String addressName;         //地址名称
    private Address addressRegionId;    //邮政编码

    public Address() {
    }

    public Address(String addressAreaId) {
        this.addressAreaId = addressAreaId;
    }

    public String getAddressAreaId() {
        return addressAreaId;
    }

    public void setAddressAreaId(String addressAreaId) {
        this.addressAreaId = addressAreaId;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public Address getAddressRegionId() {
        return addressRegionId;
    }

    public void setAddressRegionId(Address addressRegionId) {
        this.addressRegionId = addressRegionId;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressAreaId='" + addressAreaId + '\'' +
                ", addressName='" + addressName + '\'' +
                ", addressRegionId=" + addressRegionId +
                '}';
    }

    public Address(String addressAreaId, String addressName, Address addressRegionId) {
        this.addressAreaId = addressAreaId;
        this.addressName = addressName;
        this.addressRegionId = addressRegionId;
    }


}

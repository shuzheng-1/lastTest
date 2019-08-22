package com.qf.test.pojo;

import java.util.Date;

public class Orders {

    private int id;
    private int userId;
    private float totalPrice;
    private Date createTime;
    private String note;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", userId=" + userId +
                ", totalPrice=" + totalPrice +
                ", createTime=" + createTime +
                ", note='" + note + '\'' +
                '}';
    }

    public Orders(int userId, float totalPrice, Date createTime, String note) {
        this.userId = userId;
        this.totalPrice = totalPrice;
        this.createTime = createTime;
        this.note = note;
    }
}

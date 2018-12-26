package com.pojo;

import java.util.Date;

public class AuthenticationInfo {
    private String userId;
    private boolean sex;
    private String card;
    private String cardImg;
    private String brand;
    private String plateNumber;
    private java.util.Date startTime;
    private java.util.Date endTime;
    private boolean remind;
    private String drivingImg;
    private String drivsingImg;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getCardImg() {
        return cardImg;
    }

    public void setCardImg(String cardImg) {
        this.cardImg = cardImg;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public boolean isRemind() {
        return remind;
    }

    public void setRemind(boolean remind) {
        this.remind = remind;
    }

    public String getDrivingImg() {
        return drivingImg;
    }

    public void setDrivingImg(String drivingImg) {
        this.drivingImg = drivingImg;
    }

    public String getDrivsingImg() {
        return drivsingImg;
    }

    public void setDrivsingImg(String drivsingImg) {
        this.drivsingImg = drivsingImg;
    }
}

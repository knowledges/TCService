package com.pojo;

public class AuthenticationInfo {
    private String userId;
    private Boolean sex;
    private String card;
    private String cardImg;
    private String brand;
    private String plateNumber;
    private DateTime startTime;
    private DateTime endTime;
    private Boolean remind;
    private String drivingImg;
    private String drivsingImg;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
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

    public DateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(DateTime startTime) {
        this.startTime = startTime;
    }

    public DateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(DateTime endTime) {
        this.endTime = endTime;
    }

    public Boolean getRemind() {
        return remind;
    }

    public void setRemind(Boolean remind) {
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

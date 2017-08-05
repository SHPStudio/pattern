package com.flyweight.impl;

/**
 * Created by Shape on 2017/8/5.
 * 考试信息
 */
public class SignInfo {
    //编号
    private String id;
    //考场地点
    private String location;
    //考试科目
    private String subject;
    //准考证邮寄地点
    private String examLocation;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getExamLocation() {
        return examLocation;
    }

    public void setExamLocation(String examLocation) {
        this.examLocation = examLocation;
    }

    @Override
    public String toString() {
        return "SignInfo{" +
                "id='" + id + '\'' +
                ", location='" + location + '\'' +
                ", subject='" + subject + '\'' +
                ", examLocation='" + examLocation + '\'' +
                '}';
    }
}

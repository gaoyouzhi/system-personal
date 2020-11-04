package com.haochang.model;

import java.io.Serializable;

/**
 *
 * @author gaoyouzhi
 * @date 2020/3/7
 */
public class Student implements Serializable {

    private static final long serialVersionUID = 3592317091599396468L;

    private Long id;

    private String name;

    private String sex;

    private String serialNo;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

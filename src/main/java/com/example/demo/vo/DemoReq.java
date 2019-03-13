package com.example.demo.vo;

import java.io.Serializable;

public class DemoReq implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DemoReq{" +
                "name='" + name + '\'' +
                '}';
    }
}

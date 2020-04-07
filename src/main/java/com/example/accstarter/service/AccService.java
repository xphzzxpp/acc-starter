package com.example.accstarter.service;

import com.example.accstarter.AccProperties;

public class AccService {

    private AccProperties accProperties;

    public AccService(AccProperties accProperties) {
        this.accProperties = accProperties;
    }

    /**
     * 打印信息
     * @return
     */
    public String getInfo(){
        return String.format("name:%s,desc:%s",accProperties.getName(),accProperties.getDesc());
    }
}

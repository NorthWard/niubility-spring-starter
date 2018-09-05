package com.north.lat.service.impl;


import com.north.lat.service.AbstractSaveTheWorldService;

/**
 * 普通人拯救世界
 * @author laihaohua
 */
public class CommonSaveTheWorldServiceImpl extends AbstractSaveTheWorldService {
    private final static int DIE_RATE = 99;

    @Override
    public int getDieRate() {
        return DIE_RATE;
    }
}

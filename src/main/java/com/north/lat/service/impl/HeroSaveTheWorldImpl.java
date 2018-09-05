package com.north.lat.service.impl;

import com.north.lat.service.AbstractSaveTheWorldService;

/**
 * 英雄拯救世界
 * @author laihaohua
 */
public class HeroSaveTheWorldImpl extends AbstractSaveTheWorldService {
    private final static int DIE_RATE = 1;
    @Override
    public int getDieRate() {
        return DIE_RATE;
    }
}

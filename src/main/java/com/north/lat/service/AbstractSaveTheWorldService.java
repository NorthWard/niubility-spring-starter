package com.north.lat.service;

import lombok.extern.log4j.Log4j;

import java.util.Random;

/**
 * @author laihaohua
 */
@Log4j
public abstract  class AbstractSaveTheWorldService implements SaveTheWorldService {
    private final static Random RANDOM = new Random();
    private final static String SUCCESS_MSG = "你不要问这是什么, 总之就好厉害.";
    private final static String FAIL_MSG = "拯救世界是个高风险行业";

    @Override
    public String saveTheWorld(String name) {
        int randomInt = RANDOM.nextInt(100);
        String msg;
        if((randomInt +  1) > getDieRate()){
            msg = SUCCESS_MSG +"," + name + "拯救了这个世界!";
        }else{
            msg = FAIL_MSG + "," + name + ",你失败了,下辈子再来吧";

        }
        log.info(msg);
        return msg;
    }

    /**
     * 指定死亡率
     * @return
     */
    public abstract int getDieRate();
}

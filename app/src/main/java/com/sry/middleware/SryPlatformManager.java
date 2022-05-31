package com.sry.middleware;

import com.sry.module.face.ISrySystemManager;
import com.sry.module.SrySystemModule;

public enum SryPlatformManager implements SryBaseManager{
    INSTANCE;


    @Override
    public void init() {
        SrySystemModule.INSTANCE.init();
    }

    @Override
    public void initlater() {
        SrySystemModule.INSTANCE.initlater();
    }

    public ISrySystemManager getSystemManager(){
        return SrySystemModule.INSTANCE.getSrySystemManager();
    }

}

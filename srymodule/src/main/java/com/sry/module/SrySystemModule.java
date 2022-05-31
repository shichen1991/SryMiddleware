package com.sry.module;

import com.sry.middleware.SryBaseManager;
import com.sry.module.face.ISrySystemManager;
import com.sry.sryutil.SryPropertyUtils;

public enum SrySystemModule implements SryBaseManager{
    INSTANCE;

    private String deviceName = SryPropertyUtils.PROPERTY_DEVICE_NAME;
    private SrySystemManager mSrySystemManager;

    @Override
    public void init() {

    }

    @Override
    public void initlater() {

    }

    //提供给SryPlatformManager的方法
    public SrySystemManager getSrySystemManager(){
        if(mSrySystemManager == null){
            mSrySystemManager = new SrySystemManager();
        }
        return mSrySystemManager;
    }

    //提供给AllFunction的接口
    public class SrySystemManager extends ISrySystemManager {
        @Override
        public String getDeviceName(){
            return deviceName;
        }

        @Override
        public boolean setDeviceName(String name){
            deviceName = name;
            return true;
        }
    }

}

package com.sry.middleware;

import com.sry.sryutil.SryFunctionUtils;

public enum  AllFunction {
    INSTANCE;

    private SryPlatformManager mSryPlatformManager;

    public void init(SryPlatformManager manager){
        mSryPlatformManager = manager;
    }

    public boolean getBooleanFunction(int funId,int arg1,int arg2,String[] strArr){
        switch (funId){
            case 0:
                return true;
        }
        return false;
    }

    public String getStringFunction(int funId,int arg1,int arg2,String[] strArr){
        switch (funId){
            case SryFunctionUtils.FUNCTION_SYSTEM_GETDEVICENAME:
                return mSryPlatformManager.getSystemManager().getDeviceName();
        }
        return null;
    }

    public boolean setFunction(int funId,int arg1,int arg2,String[] strArr){
        switch (funId){
            case SryFunctionUtils.FUNCTION_SYSTEM_SETDEVICENAME:
                return mSryPlatformManager.getSystemManager().setDeviceName(strArr[0]);
        }
        return false;
    }


}

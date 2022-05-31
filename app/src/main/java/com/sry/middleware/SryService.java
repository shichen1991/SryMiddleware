package com.sry.middleware;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class SryService extends Service implements SryBaseManager{

    private static final int INIT_LATER_DELAYED_TIME = 1*1000;

    private static final int MSG_INIT_LATER_DELAYED = 0;

    private WorkHandler mHandler;

    private class WorkHandler extends Handler{

        public WorkHandler(Looper mainLooper) {
            super(mainLooper);
        }

        @Override
        public void handleMessage(@NonNull Message msg) {
            int what = msg.what;
            switch(what){
                case MSG_INIT_LATER_DELAYED:
                    initlater();
                    break;
            }
        }
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mHandler = new WorkHandler(getMainLooper());
        init();
        mHandler.sendEmptyMessageDelayed(MSG_INIT_LATER_DELAYED,INIT_LATER_DELAYED_TIME);
    }

    @Override
    public void init() {
        SryPlatformManager.INSTANCE.init();
        AllFunction.INSTANCE.init(SryPlatformManager.INSTANCE);
    }

    @Override
    public void initlater() {
        SryPlatformManager.INSTANCE.initlater();
    }
}

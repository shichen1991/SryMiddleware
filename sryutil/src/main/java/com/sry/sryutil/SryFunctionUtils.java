package com.sry.sryutil;

public class SryFunctionUtils {
    public static final int INT_SKIP = -1;
    public static final String STR_SKIP = "";
    public static final String[] STR_ARR_SKIP = new String[]{""};

    //SYSTEM
    private static final int FUNCTION_SYSTEM_BEGIN                                                  = 0X1000;
    public static final int FUNCTION_SYSTEM_GETDEVICENAME                                           = FUNCTION_SYSTEM_BEGIN + 1;
    public static final int FUNCTION_SYSTEM_SETDEVICENAME                                           = FUNCTION_SYSTEM_BEGIN + 2;

    //AUDIO
    private static final int FUNCTION_AUDIO_BEGIN                                                   = 0X2000;

    //PICTURE
    private static final int FUNCTION_PICTURE_BEGIN                                                 = 0X3000;

    //SOURCE
    private static final int FUNCTION_SOURCE_BEGIN                                                  = 0X4000;

    //NET
    private static final int FUNCTION_NET_BEGIN                                                     = 0X5000;

    //OTHER
    private static final int FUNCTION_OTHER_BEGIN                                                   = 0X6000;

}

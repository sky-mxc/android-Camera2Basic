package com.example.android.camera2basic;

import android.util.Log;

import com.arcsoft.facerecognition.AFR_FSDKEngine;
import com.arcsoft.facerecognition.AFR_FSDKError;

/**
 * Created by mxc on 2017/9/13.
 * description:
 */

public class AFRUtil {

    public static AFR_FSDKEngine engine ;

    public static void init(){
        engine = new AFR_FSDKEngine();
        AFR_FSDKError afr_fsdkError = engine.AFR_FSDK_InitialEngine("GHGbziRqpSNgbnvGgGobSuBfqP3713UyqNfbDVkXT6eU", "D2Rbxyb5zxLEJPgDSg3LMHz7N3cgNfG3JbvRGkjUR8Bx");
        Log.e("init","code->"+afr_fsdkError.getCode());
    }
}

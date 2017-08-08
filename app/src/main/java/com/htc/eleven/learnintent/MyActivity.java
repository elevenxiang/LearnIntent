package com.htc.eleven.learnintent;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by eleven on 17-8-8.
 */

public class MyActivity extends Activity {

    public static final String  ACTION = "com.htc.eleven.learnintent.intent.action.MyActivity";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.myactivity_layout);
    }

}

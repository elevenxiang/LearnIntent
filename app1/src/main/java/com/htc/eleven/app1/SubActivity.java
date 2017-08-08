package com.htc.eleven.app1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class SubActivity extends AppCompatActivity {

    public static final String ACTION = "com.htc.eleven.app1.intent.action.SubActivity";
    private ImageView image = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);


        image = (ImageView) findViewById(R.id.my_image);
        image.setImageResource(R.drawable.download);
    }
}

package com.htc.eleven.learnintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnStartMyActivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // explicit intent start
//                startActivity(new Intent(MainActivity.this,MyActivity.class));

                // implicit intent start
//                startActivity(new Intent("com.htc.eleven.learnintent.intent.action.MyActivity"));

                // implicit intent start with ACTION String.
//                startActivity(new Intent(MyActivity.ACTION));

                // implicit intent start a Activity from different Application.
                try {
                    startActivity(new Intent("com.htc.eleven.app1.intent.action.SubActivity"));

                } catch (Exception e) {
                    Toast.makeText(MainActivity.this,"无法启动指定的 Activity !", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
}

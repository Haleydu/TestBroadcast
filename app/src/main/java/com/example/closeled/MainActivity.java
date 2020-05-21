package com.example.closeled;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent("com.google.cardboard.action.EXIT_APP"); //广播名
                intent.setPackage("com.google.cardboard");      //安卓10.0发广播需要设置包名
                sendBroadcast(intent);
            }
        });
    }
}

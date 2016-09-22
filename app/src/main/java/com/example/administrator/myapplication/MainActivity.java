package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
private static  final String TAG="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart() claaed with:"+"");
    }
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume() called  with:"+"我走到前台了");
    }



    protected void onStop() {
        super.onStop();
        Log.d(TAG,"我被挡住了");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"我失去控制权了");
    }
}

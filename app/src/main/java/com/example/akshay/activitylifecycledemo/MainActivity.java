package com.example.akshay.activitylifecycledemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("LifeCycle","onCreate Invoked");
        Toast.makeText(getApplicationContext(),"onCreate Invoked",Toast.LENGTH_SHORT).show();

        btn=(Button)findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),NextActivity.class);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onStart()
    {
        super.onStart();
        Log.d("LifeCycle","onStart Invoked");
        Toast.makeText(getApplicationContext(),"onStart Invoked",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume()
    {
        super.onResume();
        Log.d("LifeCycle","onResume Invoked");
        Toast.makeText(getApplicationContext(),"onResume Invoked",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause()
    {
        super.onPause();
        Log.d("LifeCycle","onPause Invoked");
        Toast.makeText(getApplicationContext(),"onPause Invoked",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop()
    {
        super.onStop();
        Log.d("LifeCycle","onStop Invoked");
        Toast.makeText(getApplicationContext(),"onStop Invoked",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d("lifecycle","onDestroy invoked");
        Toast.makeText(getApplicationContext(),"onDestroy invoked",Toast.LENGTH_SHORT).show();
    }
}

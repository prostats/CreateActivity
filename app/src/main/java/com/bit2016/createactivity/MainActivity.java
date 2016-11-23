package com.bit2016.createactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static String LOG_TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LOG_TAG,"onCreate called");
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                System.out.println("clicked");
                Log.d("MainActivity","clicked");
                Log.e("MainActivity","clicked");
                Toast.makeText(MainActivity.this, "clicked!!",Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, NewActivity.class);
                startActivity( intent );

            }
        });

        }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOG_TAG,"onRestart called");
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG_TAG,"onStart called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG_TAG,"onResume called");
    }

    @Override
    protected void onPause() {
        Log.d(LOG_TAG,"onPause called");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d(LOG_TAG,"onStop called");
        super.onStop();
    }


    @Override
    protected void onDestroy() {
        Log.d(LOG_TAG,"onDestroy called");
        super.onDestroy();
    }



}


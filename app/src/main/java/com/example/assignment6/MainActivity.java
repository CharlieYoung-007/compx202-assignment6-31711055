package com.example.assignment6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickButtonStart(View v){
//        Toast.makeText(this, "message", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, ListActivity.class);
        startActivity(intent);
    }
}

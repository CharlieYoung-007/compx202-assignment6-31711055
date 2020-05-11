package com.example.assignment6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        TextView textView = (TextView) findViewById(R.id.textviewDetailTitle);
        textView.setText(title);
        ImageView imageView = (ImageView) findViewById(R.id.imageviewDetailImage);
        int drawableId; //the Variable to store pictures
        String[] array;
        TextView detailView = (TextView) findViewById(R.id.textviewDetailContent);

        if (title.equals("Bachelor of Computer Graphic Design")) {
            drawableId = getResources().getIdentifier("bcgd", "drawable", getPackageName());
            imageView.setImageResource(drawableId);
            array = getResources().getStringArray(R.array.Bachelor_of_Computer_Graphic_Design);
            detailView.setText(array[2]);
        }else if(title.equals("Bachelor of Media and Creative Technologies")){
            drawableId = getResources().getIdentifier("bmct", "drawable", getPackageName());
            imageView.setImageResource(drawableId);
            array = getResources().getStringArray(R.array.Bachelor_of_Media_and_Creative_Technologies);
            detailView.setText(array[2]);
        }else if(title.equals("Bachelor of Business Analysis")){
            drawableId = getResources().getIdentifier("bba", "drawable", getPackageName());
            imageView.setImageResource(drawableId);
            array = getResources().getStringArray(R.array.Bachelor_of_Business_Analysis);
            detailView.setText(array[2]);
        }else if(title.equals("English Foundation Program")){
            drawableId = getResources().getIdentifier("efp", "drawable", getPackageName());
            imageView.setImageResource(drawableId);
            array = getResources().getStringArray(R.array.English_Foundation_Program);
            detailView.setText(array[2]);
        }


    }
}

package com.example.assignment6;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class DetailActivity extends AppCompatActivity {

    String context; //store the detail information to share

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        String title = intent.getStringExtra("title"); //get the title name
        TextView textView = (TextView) findViewById(R.id.textviewDetailTitle);
        textView.setText(title);

        String titleArray;
        titleArray = title.replace(" ", "_"); //replace the space with '_'

        //get the detail text
        int detail_id = getResources().getIdentifier(titleArray,"array",this.getPackageName());
        String[] detailArray = getResources().getStringArray(detail_id);
        TextView detailView = (TextView)findViewById(R.id.textviewDetailContent);
        detailView.setText(detailArray[2]);
        context = detailArray[2];

        //get the image
        String imageArray;
        int drawableId; //the Variable to store pictures
        imageArray = detailArray[0];
        ImageView imageView = (ImageView) findViewById(R.id.imageviewDetailImage);
        drawableId = getResources().getIdentifier(imageArray, "drawable", getPackageName());
        imageView.setImageResource(drawableId);

    }

    public void onClickShare(View v) {
//        Toast.makeText(this, "message", Toast.LENGTH_SHORT).show();
        Intent shareIntent = new Intent();
        shareIntent.setAction(Intent.ACTION_SEND);
        shareIntent.putExtra(Intent.EXTRA_TEXT, context);
        shareIntent.setType("text/plain");
        startActivity(shareIntent);
    }
}

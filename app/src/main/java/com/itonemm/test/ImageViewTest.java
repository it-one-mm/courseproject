package com.itonemm.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ImageViewTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view_test);
        ImageView imageView=findViewById(R.id.imgview);
        Glide.with(getApplicationContext())
                .load("https://image.tmdb.org/t/p/w185/mo0FP1GxOFZT4UDde7RFDz5APXF.jpg")
                .override(100,200)
                .into(imageView);
    }
}

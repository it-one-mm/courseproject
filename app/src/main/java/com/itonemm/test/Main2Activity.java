package com.itonemm.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void bushow(View view) {
        LayoutInflater mylayoutInflater=getLayoutInflater();
        View view1=mylayoutInflater.inflate(R.layout.itemimage,null);
        TextView txtname=view1.findViewById(R.id.itemimage);
        txtname.setText("Super Natural");
        Toast mytoas=new Toast(getApplicationContext());
        mytoas.setView(view1);
        mytoas.setDuration(Toast.LENGTH_LONG);
        mytoas.setGravity(Gravity.CENTER_VERTICAL,0,0);
        mytoas.show();
    }
}

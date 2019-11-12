package com.itonemm.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Average extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_average);
    }

    public void  calcualateAvg(View view)
    {
        EditText edtnum1=findViewById(R.id.edtavgnum1);
        EditText edtnum2=findViewById(R.id.edtavgnum2);
        EditText edtnum3=findViewById(R.id.edtavgnum3);
        EditText edttotal=findViewById(R.id.edttotal);
        EditText edtavg=findViewById(R.id.edtavg);


        int num1=Integer.parseInt(edtnum1.getText().toString().trim());
        int num2=Integer.parseInt(edtnum2.getText().toString().trim());
        int num3=Integer.parseInt(edtnum3.getText().toString().trim());

        int total=num1+num2+num3;
        edttotal.setText(String.valueOf(total));
        double avg=total/3.0;
        edtavg.setText(String.valueOf(avg));

    }

}

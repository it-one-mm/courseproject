package com.itonemm.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;

public class ButtonTest extends AppCompatActivity {

    CheckBox chbstatus;
    RadioButton rbtmale,rbtfemale;
    Switch swgrad;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_test);
        chbstatus=findViewById(R.id.chbstatus);
        rbtmale=findViewById(R.id.rbtmale);
        rbtfemale=findViewById(R.id.rbtfemale);
        swgrad=findViewById(R.id.swgrad);
        result=findViewById(R.id.txtresult);

    }

    public void btnCheckNow(View view) {

        StringBuffer res=new StringBuffer();
       if(chbstatus.isChecked())
       {
           res.append("Status is Checked");
       }
       if(rbtmale.isChecked())
       {
          res.append("Male is Checked");
       }
       if(rbtfemale.isChecked())
       {
           res.append("Female is Checked");
       }
       if(swgrad.isChecked())
       {
           res.append("Is Graduated");
       }
       else
       {
           res.append("Is Not Graduated");
       }
       result.setText(res.toString());

    }
    public  void btnShow(View view)
    {

    }

}

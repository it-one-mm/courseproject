package com.itonemm.test;

import androidx.appcompat.app.AppCompatActivity;
import es.dmoral.toasty.Toasty;

import android.app.SearchManager;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.SearchView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    String s="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.topmenu,menu);
        SearchView sv=(SearchView)menu.findItem(R.id.search).getActionView();
        SearchManager sm=(SearchManager)getSystemService(Context.SEARCH_SERVICE);
        sv.setSearchableInfo(sm.getSearchableInfo(getComponentName()));
        sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                Toast.makeText(getApplicationContext(),query,Toast.LENGTH_LONG).show();;
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                Toast.makeText(getApplicationContext(),newText,Toast.LENGTH_LONG).show();;
                return true;
            }
        });
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        switch (item.getItemId())
        {

            case R.id.gps:
                Toasty.success(getApplicationContext(),"Success",Toasty.LENGTH_LONG).show();
                break;
            case R.id.refresh:
                Toasty.error(getApplicationContext(),"Error",Toasty.LENGTH_LONG).show();
                break;
        }


        return true;
    }

    public void btncalculate(View  v)
    {

        EditText edtnum1=findViewById(R.id.edtnum1);
        EditText edtnum2=findViewById(R.id.edtnum2);
        EditText edtresult=findViewById(R.id.edtresult);

        int num1=Integer.parseInt(edtnum1.getText().toString().trim());
        int num2=Integer.parseInt(edtnum2.getText().toString().trim());
        int res=num1+num2;
        edtresult.setText(String.valueOf(res));





    }

    public void btnsubstract(View  v)
    {


        EditText edtnum1=findViewById(R.id.edtnum1);
        EditText edtnum2=findViewById(R.id.edtnum2);
        EditText edtresult=findViewById(R.id.edtresult);

        int num1=Integer.parseInt(edtnum1.getText().toString().trim());
        int num2=Integer.parseInt(edtnum2.getText().toString().trim());
        int res=num1-num2;
        edtresult.setText(String.valueOf(res));





    }

}

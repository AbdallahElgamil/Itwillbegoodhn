package com.example.eljoker.itwillbegood;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class caller extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caller);
        TextView vname =(TextView) findViewById(R.id.vname);
        TextView vphone =(TextView) findViewById(R.id.vphone);
        vname.setText(" name is :  " + getIntent().getExtras().getString("username"));
        vphone.setText("phone is :  "+getIntent().getExtras().getString("userphone"));
        Button btncall =(Button) findViewById(R.id.btncall);
        btncall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("userphone"));
            }
        });
    }
}

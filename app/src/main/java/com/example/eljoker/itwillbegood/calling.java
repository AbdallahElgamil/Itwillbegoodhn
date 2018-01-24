package com.example.eljoker.itwillbegood;

import android.content.Intent;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class calling extends AppCompatActivity {
   EditText txtname ;
    EditText txtphone ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calling);
        final EditText txtname = (EditText) findViewById(R.id.txtname);
        final EditText txtphone = (EditText) findViewById(R.id.txtphone);
        Button btnshow = (Button) findViewById(R.id.btnshow);

        btnshow.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent intent =new Intent(calling.this,caller.class );
                intent.putExtra("username" , txtname.getText().toString());
                intent.putExtra("userphone" , txtphone.getText().toString());
                startActivity(intent);
            }
        });
    }

}

package com.alfaisal.mawadah_mid2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    int count =1;
    DatabaseHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button bttnfirstAct=(Button)findViewById(R.id.buttonView);
        Button bttnSearch=(Button)findViewById(R.id.bttnDelete);

        EditText val=(EditText)findViewById(R.id.editTextId);

        bttnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String idvalue = val.getText().toString();
                    db.getSpecificResult(idvalue);
                }
                catch (Exception e){
                    count=1;
                    Toast.makeText(MainActivity2.this,"Unsuccessful Search please insert id",Toast.LENGTH_LONG).show();
                }
            }});

        bttnfirstAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this,MainActivity.class));
            }
        });
    }
}
    }
}
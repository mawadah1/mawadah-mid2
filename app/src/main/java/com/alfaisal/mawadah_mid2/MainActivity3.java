package com.alfaisal.mawadah_mid2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    DatabaseHelper db;
    int count =1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button del=(Button)findViewById(R.id.bttnDel);
        Button view=(Button)findViewById(R.id.buttView);
        EditText val=(EditText)findViewById(R.id.edittxtId);
        Button bttnforAct1=(Button)findViewById(R.id.bttnforAct1);

        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String user_id =val.getText().toString();
                db.del(user_id);

                Toast.makeText(MainActivity3.this,"Successful Delete",Toast.LENGTH_LONG).show();
            }
        });

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    db.getListContents();
                    Toast.makeText(MainActivity3.this,"Successful View",Toast.LENGTH_LONG).show();
                }
                catch (Exception e){
                    count=1;
                    Toast.makeText(MainActivity3.this,"Unsuccessful View please insert id",Toast.LENGTH_LONG).show();
                }
            }

        });

        bttnforAct1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity3.this,MainActivity.class));
            }
        });


    }
}
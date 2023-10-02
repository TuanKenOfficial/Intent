package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TrucTiepIntentActivity extends AppCompatActivity {

    private TextView txtData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_truc_tiep_intent);
        addControls();

    }
    private void addControls() {
        txtData= (TextView) findViewById(R.id.txtData);
        Intent intent=getIntent();
        int a=intent.getIntExtra("int",0);
        double b=intent.getDoubleExtra("double",0.0);
        boolean c=intent.getBooleanExtra("boolean",false);
        String s=intent.getStringExtra("string");
        DanhBa x= (DanhBa) intent.getSerializableExtra("s");
        txtData.setText("");
        txtData.append("int="+a+"\n");
        txtData.append("double="+b+"\n");
        txtData.append("boolean="+c+"\n");
        txtData.append("string="+s+"\n");
        txtData.append("danhba="+x+"\n");
    }
}
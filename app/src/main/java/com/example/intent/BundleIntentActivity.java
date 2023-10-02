package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class BundleIntentActivity extends AppCompatActivity {

    private TextView txtData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bundle_intent);
        addControls();
    }


    private void addControls() {
        txtData= (TextView) findViewById(R.id.txtData);

        Intent intent=getIntent();
        Bundle bundle=intent.getBundleExtra("mybundle");
        int a=bundle.getInt("a",0);
        double b=bundle.getDouble("b",0.0);
        boolean c=bundle.getBoolean("c",false);
        String s=bundle.getString("s","");
        DanhBa x= (DanhBa) bundle.getSerializable("x");

        txtData.setText("");
        txtData.append("int="+a+"\n");
        txtData.append("double="+b+"\n");
        txtData.append("boolean="+c+"\n");
        txtData.append("string="+s+"\n");
        txtData.append("danhba="+x+"\n");
    }
}
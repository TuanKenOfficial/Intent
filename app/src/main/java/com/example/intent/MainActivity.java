package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void moIntentTrucTiep(View view) {
        Intent ttIntent = new Intent(MainActivity.this, TrucTiepIntentActivity.class);
        ttIntent.putExtra("int", 113);
        ttIntent.putExtra("double", 17.03);
        ttIntent.putExtra("boolean", true);
        ttIntent.putExtra("string", "Khang là dân coder gà Android");
        DanhBa db = new DanhBa(1,"Tuấn Ken","0939570046");
        ttIntent.putExtra("s", db);

        startActivity(ttIntent);

    }

    public void moBundleIntent(View view) {
        Intent intent=new Intent(MainActivity.this,BundleIntentActivity.class);

        Bundle bundle=new Bundle();
        bundle.putInt("a",113);
        bundle.putDouble("b",5.5);
        bundle.putBoolean("c",true);
        bundle.putString("s","Intent có thật sự khó không?");
        DanhBa bill=new DanhBa(1,"Khang","0981234567");
        bundle.putSerializable("x",bill);

        intent.putExtra("mybundle",bundle);

        startActivity(intent);
    }
}
package com.rahul.farmerproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public void btnlogin(View view){
        Intent it=new Intent(MainActivity.this,LoginActivity.class);
        startActivity(it);
    }
    public void btnRegFarmer(View view){
        Intent it =new Intent(MainActivity.this,FarmerRegisterActivity.class);
        startActivity(it);
    }
    public void btnRegBuyer(View view){
        Intent it=new Intent(MainActivity.this,BuyerRegisterActivity.class);
        startActivity(it);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

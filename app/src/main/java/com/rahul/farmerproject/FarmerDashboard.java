package com.rahul.farmerproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FarmerDashboard extends AppCompatActivity {
    private Button Profile;
    private Button AddProduct;
    private Button MyOrders;
    private Button SignOut;
    public void profileclick(View view)
    {
        Intent ifd1=new Intent(FarmerDashboard.this ,FarmerProfile.class);
        startActivity(ifd1);
    }
    public void addproductclick(View view)
    {
        Intent ifd2=new Intent(FarmerDashboard.this ,FarmerAddProduct.class);
        startActivity(ifd2);
    }
    public void myordersclick(View view)
    {
        Intent ifd3=new Intent(FarmerDashboard.this ,FarmerMyOrders.class);
        startActivity(ifd3);
    }
    public void signoutclick(View view)
    {
        Intent ifd4=new Intent(FarmerDashboard.this ,MainActivity.class);
        startActivity(ifd4);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmer_dashboard);

        Profile=(Button)findViewById(R.id.fdprofile);
        AddProduct=(Button)findViewById(R.id.fdaddproduct);
        MyOrders=(Button)findViewById(R.id.fdmyorders);
        SignOut=(Button)findViewById(R.id.fdsignout);


    }
}

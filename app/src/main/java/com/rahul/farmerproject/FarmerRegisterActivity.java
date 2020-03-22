package com.rahul.farmerproject;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FarmerRegisterActivity extends AppCompatActivity {
    private EditText Fname,Lname,Email,Password,number;
    private Button Reg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmer_register);
        Fname=findViewById(R.id.bfirst_name);
        Lname=findViewById(R.id.blast_name);
        Email=findViewById(R.id.bemail);
        Password=findViewById(R.id.bpassword);
        number=findViewById(R.id.bmob_no);
        Reg=findViewById(R.id.bbutton);
    }
    public boolean validateEmail(String emilip){
        System.out.println("Validate Email");
        //String emilip= ContactsContract.CommonDataKinds.Email.getText().toString().trim();
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";
        Pattern pat = Pattern.compile(emailRegex);
        if (emilip == null)
            return false;
        return pat.matcher(emilip).matches();
        //System.out.println(emilip);
    }
    public boolean validatePhone(String no){
        Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}");
        Matcher m = p.matcher(no);
        return (m.find() && m.group().equals(no));
    }
    public void btnClick(View view){
        String email=Email.getText().toString().trim();
        String No=number.getText().toString().trim();
        if (validateEmail(email) && validatePhone(No)){
            Intent i=new Intent(FarmerRegisterActivity.this,FarmerDashboard.class);
            startActivity(i);
        }
        else{
            Toast.makeText(FarmerRegisterActivity.this,"enter valid details",Toast.LENGTH_SHORT).show();

        }

    }


}

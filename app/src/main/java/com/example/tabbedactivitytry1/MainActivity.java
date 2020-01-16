package com.example.tabbedactivitytry1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TabHost;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TabHost avi;
    TabHost.TabSpec avi1,avi2,avi3;
    EditText login_name,login_password,regis_email,regis_name,regis_password,phonenumber,address;
    Button LOGIN, SUBMIT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        avi=findViewById(android.R.id.tabhost);
        avi.setup();
        avi1=avi.newTabSpec("Tab1");
        avi1.setIndicator("Log In");
        avi1.setContent(R.id.tab1);

        avi2=avi.newTabSpec("Tab2");
        avi2.setIndicator("Registration");
        avi2.setContent(R.id.tab2);

        avi3=avi.newTabSpec("Tab3");
        avi3.setIndicator("Personal Details");
        avi3.setContent(R.id.tab3);

        avi.addTab(avi1);
        avi.addTab(avi2);
        avi.addTab(avi3);

        avi.setCurrentTab(1);

        login_name=findViewById(R.id.editTextemail);
        login_password=findViewById(R.id.editText2);

        regis_name=findViewById(R.id.editText2tab2);
        regis_email=findViewById(R.id.editTextemail2);
        regis_password=findViewById(R.id.editTextpasstab2);

        phonenumber=findViewById(R.id.editText1tab3);
        address=findViewById(R.id.editText2tab3);

        LOGIN=findViewById(R.id.login);
        SUBMIT=findViewById(R.id.submit);

        LOGIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=login_name.getText().toString();
                String pass=login_password.getText().toString();
                if(name.equals("avi")&&pass.equals("123456")){
                    Intent avi=new Intent(MainActivity.this,welcome.class);
                    avi.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(avi);
                }
                else
                    Toast.makeText(MainActivity.this,"Invalid Credentials",Toast.LENGTH_SHORT).show();
            }
        });

        SUBMIT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info=regis_name.getText().toString();
                Intent avi=new Intent(MainActivity.this,welcome.class);
                avi.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                avi.putExtra("Name",info);
                startActivity(avi);

            }
        });




    }
}

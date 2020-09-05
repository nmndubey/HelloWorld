package com.example.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activ   ity_main);
    }

    public void funcLogin(View view) {
        EditText usernaame = (EditText) findViewById(R.id.editText2);
        EditText passwo
        rd = (EditText) findViewById(R.id.editText3);
        if(username.getText().toString().equals("admin") &&
                     password.getText().toString().equals("admin")){

            //correcct password
        }else{
            //wrong password
        }

    }
}



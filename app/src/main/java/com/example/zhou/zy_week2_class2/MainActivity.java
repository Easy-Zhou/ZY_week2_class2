package com.example.zhou.zy_week2_class2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_main_layout);

        Button bt = (Button) findViewById(R.id.button);
        final EditText username = (EditText) findViewById(R.id.editText);
        final EditText password = (EditText) findViewById(R.id.editText2);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "username:" + username.getText().toString() +
                        "\npassword:" + password.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}

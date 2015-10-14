package com.example.gemintek_rd1.contentview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    Button previousPageButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        previousPageButton2  = (Button) findViewById(R.id.previousPageButton2);

        previousPageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jumpPreviousPage();
            }
        });

    }

    public void jumpPreviousPage(){

        Intent intent = new Intent();
        intent.setClass(Main2Activity.this, MainActivity.class);
        startActivity(intent);
        Main2Activity.this.finish();

    }

}

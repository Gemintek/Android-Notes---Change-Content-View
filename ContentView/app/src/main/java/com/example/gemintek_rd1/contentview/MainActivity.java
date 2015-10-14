package com.example.gemintek_rd1.contentview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button nextPageButton;
    Button previousPageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // 這兩行要先執行
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nextPageButton = (Button) findViewById(R.id.nextPageButton);

        nextPageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jumpNextPage();
            }
        });
    }

    public void jumpNextPage(){

        setContentView(R.layout.layout2);

        Button previousPageButton = (Button) findViewById(R.id.previousPageButton);

        previousPageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jumpPreviousPage();
            }
        });
    }

    public void jumpPreviousPage(){

        setContentView(R.layout.activity_main);

        Button nextPageButton = (Button) findViewById(R.id.nextPageButton);

        nextPageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jumpNextPage();
            }
        });

    }

}

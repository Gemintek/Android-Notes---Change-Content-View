package com.example.gemintek_rd1.contentview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button nextPageButton;
    Button previousPageButton;

    /* 假設手機頁面切換只需要置換背景圖示、文字內容、文字顏色及排版等等，只需要用到setContent就可以置換layout
            但如果是要Activity的置換就不能僅靠改變layout就好，需要移交主控權到另外一個Activity，移交主控權的方法，可在主程式裡使用startActivity()這方法來呼叫另外一個Activity，
            但是關鍵並不是在這一個startActivity這個方法，而是在Intent(就如同英文字意一樣，想要、企圖之意)這個物件，告訴主程式自己是什麼，想要到什麼地方去，這就是intent物件所處理的事。
        */

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

        Intent intent = new Intent();
        intent.setClass(MainActivity.this, Main2Activity.class);
        startActivity(intent);
        MainActivity.this.finish();
    }



}

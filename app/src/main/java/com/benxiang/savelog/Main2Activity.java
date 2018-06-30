package com.benxiang.savelog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView tv_text2;
    private Button btn_getlog2;
    private String String;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String = getIntent().getStringExtra("STRING");
//        tv_text2 = findViewById(R.id.tv_text2);
        btn_getlog2 = findViewById(R.id.btn_getlog2);

//        Log.i("BBBBBBBBBBB","BBBBBBBBBBBBB");


        btn_getlog2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("BBBBBBBBBBB","BBBBBBBBBBBBB");
                tv_text2.setText(String);

            }
        });
    }
}

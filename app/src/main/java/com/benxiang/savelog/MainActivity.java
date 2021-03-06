package com.benxiang.savelog;

import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private LogCatHelper logCatHelper;
    private String path;
    private TextView tv_text,tv_text1;
    private Button btn_getlog,btn_action;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initDate();

        logCatHelper.start();

        tv_text.setText("这是一个保存Log的小Demo");
        Log.i("AAAAAAAAAAAA","AAAAAAAAAAAAAAA");

    }

    private void initView(){
        tv_text = findViewById(R.id.tv_text);
//        tv_text1 = findViewById(R.id.tv_text1);
        btn_getlog = findViewById(R.id.btn_getlog);
        btn_action = findViewById(R.id.btn_action);

        btn_getlog.setOnClickListener(this);
        btn_action.setOnClickListener(this);
    }

    private void initDate(){
        path = Environment.getExternalStorageDirectory()+"/Log";
        logCatHelper = LogCatHelper.getInstance(this,path);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_getlog:
                tv_text1.setText("获取错误日志");
                break;
            case R.id.btn_action:
                Intent intent = new Intent(this,Main2Activity.class);
                intent.putExtra("STRING","这是传过来的值");
                startActivity(intent);
                break;
                default:
                    break;
        }
    }
}

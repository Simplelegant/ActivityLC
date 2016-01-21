package com.example.simpleelegant.activitylc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/1/20/0020.
 */
public class Aty1 extends Activity{

    private Button btnClose;
    private TextView tvOut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.aty1);

        btnClose = (Button)findViewById(R.id.btnclose);
        btnClose.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent();
                i.putExtra("result", "Because i coded this program!");
                setResult(0, i);
                finish();
            }
        });

        tvOut = (TextView)findViewById(R.id.tvout);
        //tvOut.setText(getIntent().getStringExtra("txt"));

        Bundle data = getIntent().getExtras();
        String txt = data.getString("txt");
        tvOut.setText(txt);
    }
}

package com.example.exambatteryindicator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView ivBattery;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        ivBattery = (ImageView) findViewById(R.id.iv_battery);
        //ivBattery.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        /*
        switch (v.getId()) {
            case R.id.iv_battery:
                ivBattery.setImageLevel(count);
                count++;
                if(count>=6) {
                    count = 0;
                }
                break;
            default:
                break;
        }
         */
    }

    public void decrease_battery(View view) {
        count--;
        if(count<0) {
            count = 0;
        }
        ivBattery.setImageLevel(count);
    }

    public void increase_battery(View view) {
        count++;
        if(count>=6) {
            count = 6;
        }
        ivBattery.setImageLevel(count);
    }
}

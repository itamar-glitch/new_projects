package com.example.MainActivityz;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.MainActivityz.R;

public class MainActivity extends AppCompatActivity {

    private int mCount=0;
    private TextView mShowCount;
    private TextView mShowZero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount=(TextView) findViewById(R.id.count);
        mShowZero=(TextView) findViewById(R.id.ZERO);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this,R.string.app_name,Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        if (mShowCount != null && mShowZero != null) {
            if(mCount%2==0) {
                mShowZero.setBackgroundColor(Color.RED);
            }
            else{
                mShowZero.setBackgroundColor(Color.GRAY);
            }
            mCount++;
            mShowCount.setText(Integer.toString(mCount));
        }
    }

    public void ZERO(View view) {
        if  (mShowCount != null && mShowZero != null) {
            mCount=0;
            mShowCount.setText(Integer.toString(mCount));
            mShowZero.setBackgroundColor(Color.GRAY);
        }

    }
}
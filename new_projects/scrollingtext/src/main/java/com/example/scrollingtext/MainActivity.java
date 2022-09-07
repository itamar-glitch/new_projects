package com.example.scrollingtext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText name_b;
    private EditText comment_b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name_b=findViewById(R.id.Comment_name);
        comment_b=findViewById(R.id.Comment);
    }

    public void send(View view) {
        String name=name_b.getText().toString();
        String comment=comment_b.getText().toString();
        Toast toast = Toast.makeText(this, "Hello "+ name + " Thank you for your comment  ", Toast.LENGTH_LONG);
        toast.show();
    }
}

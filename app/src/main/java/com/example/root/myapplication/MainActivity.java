package com.example.root.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.tv1);

        SpannableStringBuilder builder = new SpannableStringBuilder();
        builder.append("My string. I ").append(" ");
        builder.setSpan(new ImageSpan(this, R.drawable.ic_launcher),
                builder.length() - 1, builder.length(), 0);
        builder.append(" Cree by Dexode");

        textView.setText(builder);

    }
}

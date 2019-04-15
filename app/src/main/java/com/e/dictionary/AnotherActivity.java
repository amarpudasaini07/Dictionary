package com.e.dictionary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class AnotherActivity extends AppCompatActivity {

    private TextView tvoutput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        Bundle bundle =getIntent().getExtras();

        if (bundle!=null){
            String meaning=bundle.getString("meaning");
            tvoutput=findViewById(R.id.tvoutput);
            tvoutput.setText(meaning);

        }
        else
        {
            Toast.makeText(this, "NO meaning", Toast.LENGTH_SHORT).show();
        }
    }
}

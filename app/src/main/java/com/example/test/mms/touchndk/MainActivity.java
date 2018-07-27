package com.example.test.mms.touchndk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView txvCount = findViewById(R.id.txv_count);
        Button btnCount = findViewById(R.id.btn_count);
        txvCount.setText(getString(R.string.count_is_1, 0));

        btnCount.setOnClickListener(new View.OnClickListener() {
            int count;

            @Override
            public void onClick(View view) {
                count++;
                txvCount.setText(getString(R.string.count_is_1, count));
            }
        });
    }
}

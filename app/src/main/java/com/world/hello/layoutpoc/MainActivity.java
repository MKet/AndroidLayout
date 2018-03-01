package com.world.hello.layoutpoc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button tableButton = findViewById(R.id.TableButton);
        Button gridButton = findViewById(R.id.GridButton);

        tableButton.setOnClickListener(v -> {
            Intent intent = new Intent(this, Table.class);
            startActivity(intent);
        });

        gridButton.setOnClickListener(v -> {
            Intent intent = new Intent(this, GridActivity.class);
            startActivity(intent);
        });

    }
}

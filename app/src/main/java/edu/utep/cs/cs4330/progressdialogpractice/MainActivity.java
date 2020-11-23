package edu.utep.cs.cs4330.progressdialogpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        go = findViewById(R.id.go);

        go.setOnClickListener(this::goTo);
    }

    private void goTo(View view) {
        Intent intent = new Intent(this,Parser.class);
        startActivity(intent);

    }

}
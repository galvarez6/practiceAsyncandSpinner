package edu.utep.cs.cs4330.progressdialogpractice;

import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Parser extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AsyncTask myTask = new AsyncTask(this);
        myTask.execute();
    }


}

package com.example.coursework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.res.Resources;
import android.widget.Button;
import android.widget.TextView;

import java.io.InputStream;

public class StartScreen extends AppCompatActivity {

    NodeMap nodeMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);

        InputStream prc = getCSVRes();
        nodeMap = new NodeMap(prc);

        TextView description = (TextView) findViewById(R.id.Description);
        TextView question = (TextView) findViewById(R.id.Question);

        description.setText(nodeMap.currentNode().getDescription());
        question.setText(nodeMap.currentNode().getQuestion());

    }

    protected InputStream getCSVRes(){
        Resources res = getResources();
        return res.openRawResource(R.raw.datacorrected);
    }
    public void LeftClickHandler(View view){

        nodeMap.decision(1);
        TextView description = (TextView) findViewById(R.id.Description);
        TextView question = (TextView) findViewById(R.id.Question);


        description.setText(nodeMap.currentNode().getDescription());
        question.setText(nodeMap.currentNode().getQuestion());

    }

    public void RightClickHandler(View view){

        nodeMap.decision(3);
        TextView description = (TextView) findViewById(R.id.Description);
        TextView question = (TextView) findViewById(R.id.Question);

        description.setText(nodeMap.currentNode().getDescription());
        question.setText(nodeMap.currentNode().getQuestion());
    }

    public void MiddleClickHandler(View view){

        nodeMap.decision(2);
        TextView description = (TextView) findViewById(R.id.Description);
        TextView question = (TextView) findViewById(R.id.Question);

        description.setText(nodeMap.currentNode().getDescription());
        question.setText(nodeMap.currentNode().getQuestion());
    }

}
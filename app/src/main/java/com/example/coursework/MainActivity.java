    package com.example.coursework;

    import androidx.appcompat.app.AppCompatActivity;

    import android.content.res.Resources;
    import android.os.Bundle;
    import android.view.View;
    import android.content.*;
    import java.io.InputStream;

    public class MainActivity extends AppCompatActivity {

        NodeMap nodeMap;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            InputStream prc = getCSVRes();
            nodeMap = new NodeMap(prc);
        }

        protected InputStream getCSVRes(){
            Resources res = getResources();
            return res.openRawResource(R.raw.datacorrected);
        }

        //* Next page
        public void onclickHandler(View view){
            Intent myIntent = new Intent(MainActivity.this,StartScreen.class);
            startActivity(myIntent);
        }
    }
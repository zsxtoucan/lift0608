package com.example.lift0608;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity<onStart> extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnDial = findViewById(R.id.button);
        Button btnSecond = findViewById(R.id.button2);
        Button btnFinish = findViewById(R.id.button3);

        btnDial.setOnClickListener(myListener);
        btnSecond.setOnClickListener(myListener);
        btnFinish.setOnClickListener(myListener);

        Toast.makeText(getApplicationContext(), "onCreate(1)", Toast.LENGTH_LONG).show();
    }
    protected void onStart(){
        super.onStart();
        Toast.makeText(this,"onStart(1)",Toast.LENGTH_LONG).show();
    }
    protected void onResume(){
        super.onResume();
        Toast.makeText(this,"onResume(1)",Toast.LENGTH_LONG).show();
    }
    protected void onRestart(){
        super.onRestart();
        Toast.makeText(this,"onRestart(1)",Toast.LENGTH_LONG).show();
    }
    protected void onPause(){
        super.onPause();
        Toast.makeText(this,"onPause(1)",Toast.LENGTH_LONG).show();
    }
    protected void onStop(){
        super.onStop();
        Toast.makeText(this,"onStop(1)",Toast.LENGTH_LONG).show();
    }
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(this,"onDestroy(1)",Toast.LENGTH_LONG).show();
    }
    protected Button.OnClickListener myListener = new Button.OnClickListener(){
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.button:
                    Uri uri = Uri.parse("tel:0999123456");
                    Intent intent = new Intent(Intent.ACTION_DIAL,uri);
                    startActivity(intent);
                    break;
                case R.id.button2:
                    Intent intent1 = new Intent(MainActivity.this,SecondActivity.class);
                    startActivity(intent1);
                    break;
                case R.id.button3:
                    finish();
                    break;
            }
        }
    };
}

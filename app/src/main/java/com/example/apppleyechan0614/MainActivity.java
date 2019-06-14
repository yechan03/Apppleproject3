package com.example.apppleyechan0614;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button plus,minus;
    TextView main_result;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (resultCode==RESULT_OK){
            if (requestCode==3000){

                String s=data.getStringExtra("result");

                main_result.setText(s);
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        plus=findViewById(R.id.plus);
        minus=findViewById(R.id.minus);
        main_result=findViewById(R.id.main_result);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ResultActivity.class);
                intent.putExtra("input","+");
                startActivity(intent);
                startActivityForResult(intent,3000);
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ResultActivity.class);
                intent.putExtra("input","-");
                startActivity(intent);
                startActivityForResult(intent,3000);
            }
        });


//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, SubActivity.class);
//                String s = main_editText.getText().toString();
//                intent.putExtra("input",s);
//                startActivity(intent);
//            }
//        });
    }
}

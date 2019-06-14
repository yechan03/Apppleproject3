package com.example.apppleyechan0614;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    int fn,sn,result;
    EditText result_firstnum,result_secondnum;
    TextView result_text;
    Button result_result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        result_text=findViewById(R.id.result_text);
        result_firstnum=findViewById(R.id.result_firstnum);
        result_secondnum=findViewById(R.id.result_secondnum);
        result_result=findViewById(R.id.result_result);

        final Intent intent=getIntent();

        final String p =intent.getStringExtra("input");

        result_text.setText(p);

        result_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fn=Integer.parseInt(result_firstnum.getText().toString());
                sn=Integer.parseInt(result_secondnum.getText().toString());
                switch (p){
                    case"+":
                        result=fn+sn;
                        break;
                    case"-":
                        result=fn-sn;
                        break;
                }
                Intent resultintent=new Intent();
                resultintent.putExtra("result","연산결과"+result+"입니당");
                setResult(RESULT_OK,resultintent);
                finish();
            }
        });
        }
}

package com.codewithdj.calculatorometrix;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText  etFirstValue , etSecondValue;
    TextView tvAns;
    Button add , sub , multi , div ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirstValue = findViewById(R.id.etFirstValue);
        etSecondValue = findViewById(R.id.etSecondValue);

        tvAns = findViewById(R.id.tvAns);
        add = findViewById(R.id.btnAdd);
        sub = findViewById(R.id.btnSub);
        multi = findViewById(R.id.btnMul);
        div = findViewById(R.id.btnDiv);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               int firstvalue , secondvalue , ans ;

               firstvalue = Integer.parseInt(etFirstValue.getText().toString());
               secondvalue = Integer.parseInt(etSecondValue.getText().toString());

               ans = firstvalue + secondvalue ;

               tvAns.setText("Ans is = "+ans);


            }

        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int firstvalue , secondvalue , ans ;

                firstvalue = Integer.parseInt(etFirstValue.getText().toString());
                secondvalue = Integer.parseInt(etSecondValue.getText().toString());

                ans = firstvalue - secondvalue ;

                tvAns.setText("Ans is = "+ans);


            }

        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int firstvalue , secondvalue , ans ;

                firstvalue = Integer.parseInt(etFirstValue.getText().toString());
                secondvalue = Integer.parseInt(etSecondValue.getText().toString());

                ans = firstvalue * secondvalue ;

                tvAns.setText("Ans is = "+ans);


            }

        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int firstvalue , secondvalue , ans ;

                firstvalue = Integer.parseInt(etFirstValue.getText().toString());
                secondvalue = Integer.parseInt(etSecondValue.getText().toString());

                ans = firstvalue / secondvalue ;

                tvAns.setText("Ans is = "+ans);


            }

        });


    }
}
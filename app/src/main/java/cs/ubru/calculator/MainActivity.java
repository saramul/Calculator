package cs.ubru.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9,
            btnPoint, btnResult, btnPlus, btnMinus, btnDivide, btnMultiply,
            btnClear, btnPercent, btnSign;
    private TextView tvResult;
    private String tmp = "", op;
    private double result, a, b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponent();

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tmp = tmp + 9;
                tvResult.setText(tmp);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tmp = tmp + 8;
                tvResult.setText(tmp);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tmp = tmp + 7;
                tvResult.setText(tmp);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tmp = tmp + 6;
                tvResult.setText(tmp);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tmp = tmp + 5;
                tvResult.setText(tmp);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tmp = tmp + 4;
                tvResult.setText(tmp);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tmp = tmp + 3;
                tvResult.setText(tmp);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tmp = tmp + 2;
                tvResult.setText(tmp);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tmp = tmp + 1;
                tvResult.setText(tmp);
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tmp.length()>0 ) {
                    tmp = tmp + 0;
                    tvResult.setText(tmp);
                }
            }
        });
        btnPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tmp.length()>0 ) {
                    tmp = tmp + ".";
                    tvResult.setText(tmp);
                } else {
                    tmp = 0 + ".";
                    tvResult.setText(tmp);
                }
            }
        });
        btnPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Double.parseDouble(tmp);
                result = a/100;

                if(result != (int)result)
                    tvResult.setText(String.format("%f", result));
                else
                    tvResult.setText(String.format("%.0f", result));
                tmp = "";
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tmp = "";
                tvResult.setText("0");
            }
        });
        btnSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tmp.length()>0) {
                    if (tmp.charAt(0) == '-') {
                        tmp = tmp.substring(1);
                    } else {
                        tmp = "-" + tmp;
                    }
                    tvResult.setText(tmp);
                }
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op = "+";
                a = Double.parseDouble(tmp);
                tmp = "";
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op = "-";
                a = Double.parseDouble(tmp);
                tmp = "";
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op = "*";
                a = Double.parseDouble(tmp);
                tmp = "";
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op = "/";
                a = Double.parseDouble(tmp);
                tmp = "";
            }
        });
        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b = Double.parseDouble(tmp);
                switch (op) {
                    case "+" : result = a+b;break;
                    case "-" : result = a-b;break;
                    case "*" : result = a*b;break;
                    case "/" : result = a/b;break;
                }
                if(result != (int)result)
                    tvResult.setText(String.format("%f", result));
                else
                    tvResult.setText(String.format("%.0f", result));
                tmp = "";
            }
        });


    }

    private void initComponent() {
        tvResult = findViewById(R.id.tv_result);
        btn0 = findViewById(R.id.btn_0);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);
        btn5 = findViewById(R.id.btn_5);
        btn6 = findViewById(R.id.btn_6);
        btn7 = findViewById(R.id.btn_7);
        btn8 = findViewById(R.id.btn_8);
        btn9 = findViewById(R.id.btn_9);
        btnPlus = findViewById(R.id.btn_plus);
        btnMinus = findViewById(R.id.btn_minus);
        btnMultiply = findViewById(R.id.btn_multiply);
        btnDivide = findViewById(R.id.btn_divide);
        btnResult = findViewById(R.id.btn_result);
        btnPoint = findViewById(R.id.btn_point);
        btnSign = findViewById(R.id.btn_sign);
        btnPercent = findViewById(R.id.btn_percent);
        btnClear = findViewById(R.id.btn_clear);

    }
}
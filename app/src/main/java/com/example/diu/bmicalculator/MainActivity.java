package com.example.diu.bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText height;
    private EditText weight;
    private TextView result;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        height=(EditText) findViewById(R.id.height);
        weight=(EditText) findViewById(R.id.weight);
        result=(TextView) findViewById(R.id.result);
        button=(Button) findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bmi();
            }
        });
    }
    private void bmi()
    {
        float a , b , c , x , y;
        a = Float.parseFloat(height.getText().toString());
        x = a* 12;
        y = (float) (x* 0.0254);
        b = Float.parseFloat(weight.getText().toString());
        c = (b/(y*y));
        result.setText("" +c);


            if (c<=18.5)
            {
                Toast.makeText(getApplicationContext(),"Underweight",Toast.LENGTH_LONG).show();
            }
            else if (c >18.5 && c <= 25)
            {
                Toast.makeText(getApplicationContext(),"Healthy Weight",Toast.LENGTH_LONG).show();
            }
            else if (c >25)
            {
                Toast.makeText(getApplicationContext(),"OverWeight",Toast.LENGTH_LONG).show();
            }
    }
//    public void CalculateBMI (View V)
//    {
//        String h = height.getText().toString();
//        String w = weight.getText().toString();
//        if (h != null && !"" .equals(h) && w != null && !"".equals(w))
//        {
//            float hf=Float.parseFloat(h);
//            float wf=Float.parseFloat(w);
//            float bmi=(wf/(hf*hf))*10000;
//            String ibl="";
//            if (bmi<=18.5)
//            {
//                ibl=getString(R.string.under);
//            }
//            else if (bmi >18.5 && bmi <= 25)
//            {
//                ibl=getString(R.string.normal);
//            }
//            else if (bmi >25 && bmi <= 30)
//            {
//                ibl=getString(R.string.over);
//            }
//            result.setText(bmi+"\n\n"+ibl);
//        }
//    }
}

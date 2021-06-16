package com.poulstar.sun_16;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Bmi {
    EditText weight;
    EditText height;
    EditText age;
    Button btn;
    TextView status_txt;
    Float weight_float;
    Float height_float;
    Float age_float;
    Float height_meter;


    public void init(LinearLayout layout, Context context) {
        weight = new EditText(context);
        height = new EditText(context);
        age = new EditText(context);
        btn = new Button(context);
        btn.setText("send");
        status_txt = new TextView(context);

        weight.setHint("Weight");
        height.setHint("height");
        age.setHint("Age");

        layout.addView(weight);
        layout.addView(height);
        layout.addView(age);
        layout.addView(btn);
        layout.addView(status_txt);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                convert();
                Float bmi = personBmi();
                String status=personStatus(bmi);

                Integer opt_bmi = optimalBmi();
                Float opt_weight = optimal_weight(opt_bmi);
                Float over_weight = weight_float - opt_weight;
                status_txt.setText(status.toString() +"   " +over_weight.toString());



            }
        });


    }

    public void convert(){

        String weight_str = weight.getText().toString();
        weight_float = Float.parseFloat(weight_str);

        String height_str = height.getText().toString();
        height_float = Float.parseFloat(height_str);
        height_meter = height_float / 100;


        String age_str = age.getText().toString();
        age_float = Float.parseFloat(age_str);

    }

    public Float personBmi(){
        Float bmi = weight_float / (height_meter * height_meter);
        return bmi;
    }
    public String personStatus(Float bmi){
        String status ="";
        if ( bmi <= 19){
            status = "weight less";
        }
        else if ( bmi > 19 & bmi<25 ){
            status =  "optimal weight";
        }
        else if (bmi>=25 & bmi<30){
            status = "over weight";
        }
        else if(bmi >=30){
            status = "fat";
        }
        return status;
    }

    public Integer optimalBmi(){
        Integer opt_bmi = null;
        if (age_float >=14 & age_float>19 ){
            opt_bmi = 21;
        }
        else if (age_float >=19 & age_float>24 ){
            opt_bmi = 22;
        }
        return opt_bmi;
    }

    public Float optimal_weight(Integer opt_bmi){
        Float opt_weight = opt_bmi * (height_meter * height_meter);
        return opt_weight;
     }

}

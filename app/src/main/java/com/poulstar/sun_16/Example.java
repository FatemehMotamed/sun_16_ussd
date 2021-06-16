package com.poulstar.sun_16;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Example {
    public void init(LinearLayout layout, Context context){
        String[] my_array;
        my_array = new String[]{"red", "blue", "yellow"};

        my_array[0] = "red";

        ArrayList<String> my_list = new ArrayList<String>();
        my_list.add("test");
        String item = my_list.get(0);
        my_list.remove(0);


        HashMap<String, Integer> my_map = new HashMap<String, Integer>();
        my_map.put("pizza", 5000);
        my_map.put("sandwich", 1000);
        Integer items = my_map.get("pizza");

        for (int i=0; i < my_array.length; i+=1){
            Log.d("test", my_array[i]+"");
        }

        for (String i: my_array){
            Log.d("", i+"");
        }

        for(Map.Entry i: my_map.entrySet()){

            Log.d("", i.getKey()+"");
            Log.d("", i.getValue()+"");
        }


        EditText txt_box= new EditText(context);
        txt_box.setHint("Enter Number");

        RadioGroup option = new RadioGroup(context);
        RadioButton meter= new RadioButton(context);
        meter.setText("Meter");

        RadioButton cm = new RadioButton(context);
        cm.setText("Cm");

        Button btn= new Button(context);
        btn.setText("send");

        TextView result = new TextView(context);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txt_box_string= txt_box.getText().toString();
                if (txt_box_string.isEmpty()){
                    result.setText("please enter a number");
                }
                else{
                    Float number = Float.parseFloat(txt_box_string);
                    if (meter.isChecked()){
                        number = number/ 100;
                    }
                    else if (cm.isChecked()){
                        number = number * 100;
                    }
                    result.setText(number.toString());
                }
            }
        });

        layout.addView(txt_box);
        layout.addView(option);
        option.addView(meter);
        option.addView(cm);
        layout.addView(btn);
        layout.addView(result);



    }
}

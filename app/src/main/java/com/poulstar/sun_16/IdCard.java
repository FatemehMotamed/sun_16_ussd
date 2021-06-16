package com.poulstar.sun_16;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class IdCard {
    EditText id;
    Button btn;
    TextView result;

    public void init(LinearLayout layout, Context context){
        id= new EditText(context);
        btn= new Button(context);
        btn.setText("send");
        result = new TextView(context);
        layout.addView(id);
        layout.addView(btn);
        layout.addView(result);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<Integer> id_array = convert_to_array();
               result.setText( validation(id_array));
//                validation(id_array);
            }
        });

    }

    public ArrayList<Integer> convert_to_array(){
        ArrayList<Integer> id_array = new ArrayList<Integer>();
        String id_code = id.getText().toString();
        for (char x:id_code.toCharArray()){
            id_array.add(Integer.parseInt(String.valueOf(x)));
        }

        return id_array;
    }

    public String validation(ArrayList<Integer> id_array){
        Integer sum=0;
//        Log.d("tesssst", id_array.toString());
//        for (int i=0; i<id_array.size()-1 ; i++){
//            Log.d("tesssstyyy", id_array.get(i)+"");
//            sum += (id_array.get(i) * i);
//        }

        int c=10;
        for (int i : id_array){
            sum += (i * c);
            c= c-1;
            if (c == 1){
                break;
            }
        }
        Integer r = sum % 11;
        Log.d("printtttt", sum.toString());
        if (r<2){
           if(id_array.get(9) == r){
               return "valid";
           }
           else{
               return "invalid";
           }
        }
        else {
            if (id_array.get(9) == (11-r)){
                return "valid";
            }
            else {
                return "invalid";
            }
        }

    }
}

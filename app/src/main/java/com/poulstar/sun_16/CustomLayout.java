package com.poulstar.sun_16;

import android.content.Context;
import android.widget.LinearLayout;

public class CustomLayout extends LinearLayout {
    public CustomLayout(Context context) {
        super(context);
        this.setOrientation(VERTICAL);

        IdCard main= new IdCard();
        main.init(this, context);

    }

}

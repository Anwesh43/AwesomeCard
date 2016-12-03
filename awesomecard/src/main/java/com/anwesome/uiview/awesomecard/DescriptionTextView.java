package com.anwesome.uiview.awesomecard;

import android.content.Context;
import android.graphics.Color;
import android.widget.TextView;

/**
 * Created by anweshmishra on 03/12/16.
 */
public class DescriptionTextView extends TextView {
    public DescriptionTextView(Context context,String description) {
        super(context);
        setText(description);
        setTextSize(10);
        setTextColor(Color.WHITE);
        setElevation(5);
    }
}

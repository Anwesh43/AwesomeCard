package com.anwesome.uiview.awesomecard;

import android.content.Context;
import android.graphics.Color;
import android.widget.TextView;

/**
 * Created by anweshmishra on 03/12/16.
 */
public class TitleTextView extends TextView{
    private String title;
    public TitleTextView(Context context,String title) {
        super(context);
        this.title = title;
        setText(title);
        setTextSize(15);
        setTextColor(Color.WHITE);
        setElevation(5);
    }

}

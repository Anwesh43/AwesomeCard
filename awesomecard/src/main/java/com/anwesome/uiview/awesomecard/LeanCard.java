package com.anwesome.uiview.awesomecard;

import android.content.Context;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Point;
import android.view.ViewGroup;

/**
 * Created by anweshmishra on 03/12/16.
 */
public class LeanCard extends ViewGroup {
    private int w,h;
    private final int backgroundColor = Color.parseColor("#2c3e50");
    private Bitmap bitmap;
    private String title,description;
    private CircleImageView circleImageView;
    private TitleTextView titleTextView;
    private DescriptionTextView descriptionTextView;
    private boolean loaded = false,layoutFlag=false;
    public LeanCard(Context context, Bitmap bitmap,String title,String description) {
        super(context);
        this.bitmap = bitmap;
        this.title = title;
        this.description = description;
    }
    public void onMeasure(int widthConfig,int heightConfig) {
        if(!loaded) {
            Point size = new Point();
            getDisplay().getRealSize(size);
            w = size.x;
            h = size.y;
            circleImageView = new CircleImageView(getContext(),bitmap);
            titleTextView = new TitleTextView(getContext(),title);
            descriptionTextView = new DescriptionTextView(getContext(),description);
            addView(circleImageView,new ViewGroup.LayoutParams(w/3,w/3));
            addView(titleTextView,new ViewGroup.LayoutParams(2*w/5,w/10));
            addView(descriptionTextView,new ViewGroup.LayoutParams(3*w/5,w/3));
            for(int i=0;i<getChildCount();i++) {
                measureChild(getChildAt(i),widthConfig,heightConfig);
            }
            loaded = true;
        }
        if (h > w) {
            setMeasuredDimension(w, h / 3);
        } else {
            setMeasuredDimension(w / 3, h);
        }
    }
    public void onLayout(boolean changed,int a,int b,int w,int h) {
        if(!layoutFlag) {
            setBackgroundColor(backgroundColor);
            setElevation(20);
            circleImageView.layout(w / 2 - w / 6, h / 20, w / 2 + h / 6, h / 20 + w / 3);
            titleTextView.layout(w / 2 - w / 5, h / 20 + w / 3 + h/200, w / 2 + w / 5, h / 20 + w / 3 + h/200+w/10);
            descriptionTextView.layout(w/2-3*w/10, h / 10 + w / 3 + h / 40 + w / 20, w/2+3*w/10, h / 10 + w / 3 + h / 40 + w / 20 + w / 3);
            layoutFlag = true;
        }
    }
}

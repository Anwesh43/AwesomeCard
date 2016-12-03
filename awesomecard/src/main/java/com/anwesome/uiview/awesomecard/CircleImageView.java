package com.anwesome.uiview.awesomecard;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;

/**
 * Created by anweshmishra on 03/12/16.
 */
public class CircleImageView extends ImageView {
    public CircleImageView(Context context, Bitmap bitmap) {
        super(context);
        CircleImageDrawable drawable = new CircleImageDrawable(bitmap);
        setImageDrawable(drawable);
    }

}

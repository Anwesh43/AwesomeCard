package com.anwesome.uiview.awesomecard;

import android.graphics.*;
import android.graphics.Path;
import android.graphics.drawable.Drawable;

/**
 * Created by anweshmishra on 03/12/16.
 */
public class CircleImageDrawable extends Drawable{
    private Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private Bitmap bitmap;
    public CircleImageDrawable(Bitmap bitmap) {
        this.bitmap = bitmap;
    }
    public void setAlpha(int alpha) {
        paint.setAlpha(alpha);
    }
    public void setColorFilter(ColorFilter colorFilter) {
        paint.setColorFilter(colorFilter);
    }
    public int getOpacity() {
        return 0;
    }
    public void draw(Canvas canvas) {
        int w = canvas.getWidth(),h = canvas.getHeight();
        Path path = new Path();
        path.addCircle(w/2,w/2,w/2, Path.Direction.CCW);
        canvas.clipPath(path);
        canvas.drawBitmap(bitmap,new Rect(0,0,bitmap.getWidth(),bitmap.getHeight()),new RectF(0,0,w,w),paint);
    }
}

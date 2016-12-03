package com.anwesome.uiview.awesomecarddemos;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.ViewGroup;

import com.anwesome.uiview.awesomecard.LeanCard;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        DisplayManager displayManager = (DisplayManager)getSystemService(Context.DISPLAY_SERVICE);
        Point screenSize = new Point();
        displayManager.getDisplay(0).getRealSize(screenSize);
        int h = screenSize.y;
        LeanCard leanCard = new LeanCard(this, BitmapFactory.decodeResource(getResources(),R.drawable.wenger_out),"Arsene Wenger","Arsenal fc football manager. 3 times Premier league winner and 6 times fa cup winner");
        addContentView(leanCard,new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        LeanCard mouCard = new LeanCard(this,BitmapFactory.decodeResource(getResources(),R.drawable.mou),"Jose Mourinho","Manchester United Manager. 3 time premier league winner and 2 times Champions league winner");
        mouCard.setX(0);
        mouCard.setY(h/3+h/30);
        addContentView(mouCard,new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
    }

}

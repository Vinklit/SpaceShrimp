package com.poolmut.spaceshrimp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

import java.sql.RowId;
import java.util.Vector;

public class PlayerShrimp {

    private Bitmap bitmap;
    private Drawable drawable;
    private int x, y;
    private int speed = 0;

    public PlayerShrimp(Context context) {
        x = 50;
        y = 50;
        speed = 1;
        bitmap = BitmapFactory.decodeResource
                (context.getResources(), R.drawable.shrimp);
        drawable = context.getResources().getDrawable(R.drawable.shrimp);
    }

    public void update() {x++;}

    public Bitmap getBitmap() {
        Bitmap bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(),
                drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        return bitmap;
    }
    public int getSpeed() {
        return speed;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
}

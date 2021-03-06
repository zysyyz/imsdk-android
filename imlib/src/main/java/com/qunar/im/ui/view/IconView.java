package com.qunar.im.ui.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;

public class IconView extends TextView {
    public IconView(Context context) {
        this(context,null);
    }

    public IconView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public IconView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public IconView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context);
    }

    private void init(Context context) {

        Typeface tf = Typeface.createFromAsset(context.getAssets(),
                "QTalk-QChat.ttf");
        setTypeface(tf);

    }
}
package com.enamakel.backseattester.views;


import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

import com.enamakel.backseattester.util.FontUtil;


public class TextView extends AppCompatTextView {
    public TextView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }


    public TextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        Typeface font = FontUtil.get(context, "Roboto.ttf");
        Typeface fontBold = FontUtil.get(context, "Roboto-bold.ttf");

        if (!isInEditMode()) setTypeface(font);

        try {
            int style = attrs.getAttributeIntValue(
                    "http://schemas.android.com/apk/res/android",
                    "textStyle",
                    Typeface.NORMAL);

            if (style == Typeface.BOLD) setTypeface(fontBold, Typeface.BOLD);
        } catch (Exception e) {

        }
    }
}

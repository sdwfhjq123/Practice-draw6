package com.hencoder.hencoderpracticedraw6.practice;

import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.hencoder.hencoderpracticedraw6.R;

public class Practice03Scale extends RelativeLayout {
    Button animateBt;
    ImageView imageView;
    private int mFlag;

    public Practice03Scale(Context context) {
        super(context);
    }

    public Practice03Scale(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice03Scale(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        animateBt = (Button) findViewById(R.id.animateBt);
        imageView = (ImageView) findViewById(R.id.imageView);

        animateBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                // TODO 在这里处理点击事件，通过 View.animate().scaleX/Y() 来让 View 放缩
                switch (mFlag) {
                    case 0:
                        imageView.animate().scaleX(1.5f).start();
                        if (mFlag == 0) mFlag++;
                        break;
                    case 1:
                        imageView.animate().scaleX(1).start();
                        if (mFlag == 1) mFlag++;
                        break;
                    case 2:
                        imageView.animate().scaleY(0.5f).start();
                        if (mFlag == 2) mFlag++;
                        break;
                    case 3:
                        imageView.animate().scaleY(1).start();
                        if (mFlag == 3) mFlag = 0;
                        break;
                }
            }
        });
    }
}

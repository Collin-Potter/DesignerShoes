package com.example.capar.designershoes;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.support.v4.view.ViewPager;

public class CustomViewPager extends ViewPager{

    private boolean enabled;

    public CustomViewPager(Context context, AttributeSet attrs) {
        super(context,attrs);
        this.enabled = true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        if(this.enabled){
            return super.onTouchEvent(event);
        }
        return false;
    }
    @Override
    public boolean onInterceptTouchEvent(MotionEvent event){
        if(this.enabled){
            return super.onTouchEvent(event);
        }
        return false;
    }
    @Override
    public void setCurrentItem(int item, boolean smoothScroll) {
        super.setCurrentItem(item, false);
    }

    @Override
    public void setCurrentItem(int item) {
        super.setCurrentItem(item, false);
    }
    public void setPagingEnabled(Boolean enabled){
        this.enabled = enabled;
    }
}

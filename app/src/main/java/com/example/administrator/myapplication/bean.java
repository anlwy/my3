package com.example.administrator.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Administrator on 2017\12\25 0021.
 */

public class bean {
    private  int img;
    private String text;

    public bean(int img, String text) {
        this.img = img;
        this.text = text;
    }

    public bean(List<bean> mbean) {
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }



}

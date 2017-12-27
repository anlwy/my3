package com.example.administrator.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public List<bean> mbean=new ArrayList<>();
    public  RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         recyclerView=findViewById(R.id.recyview);
        TextView textView =findViewById(R.id.tz);
        SpannableString spannableString = new SpannableString("通知：你们要的全部课表来了，点击全部课表即可查看！！如还有其他建议和疑问请及时反馈或加群咨询。");
        ForegroundColorSpan colorSpan = new ForegroundColorSpan(Color.parseColor("#FF1E49CC"));
        spannableString.setSpan(colorSpan, 2, spannableString.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        textView.setText(spannableString);
        ImageButton imageButton=findViewById(R.id.index);
        ImageButton imageButton1=findViewById(R.id.me);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });
        init();


    }

    private void init() {

        bean a = new bean(R.drawable.holly, "成绩查询");
        mbean.add(a);
            bean b = new bean(R.drawable.holly, "我的课表");
            mbean.add(b);
            bean c = new bean(R.drawable.reindeer, "阳光平台");
            mbean.add(c);
            bean d = new bean(R.drawable.mail, "失物招领");
            mbean.add(d);
            bean e = new bean(R.drawable.mail, "微图书馆");
            mbean.add(e);
            bean f = new bean(R.drawable.mail, "音乐台");
            mbean.add(f);
            bean g = new bean(R.drawable.mail, "校园卡");
            mbean.add(g);
            bean h = new bean(R.drawable.mail, "空教室");
            mbean.add(h);
            bean k = new bean(R.drawable.mail, "教室查询");
            mbean.add(k);
            bean j = new bean(R.drawable.mail, "校园地图");
            mbean.add(j);

        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.HORIZONTAL));
        recyclerView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {

                outRect.left = 10;
                outRect.top = 10;
                outRect.top = 10;
            }
        });
        recyclerView.setAdapter(new inadapter(mbean));

    }

}

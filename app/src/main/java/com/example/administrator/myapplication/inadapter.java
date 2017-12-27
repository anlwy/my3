package com.example.administrator.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2017\12\25 0021.
 */

public class inadapter extends RecyclerView.Adapter<inadapter.ViewHolder> {
    private List<bean> mBean;


    public inadapter(List<bean> mbean) {
        mBean=mbean;
    }

    @Override
    public inadapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(inadapter.ViewHolder holder, int position) {
        bean inadapter= mBean.get(position);
        holder.imageView.setImageResource(inadapter.getImg());
        holder.tv.setText(inadapter.getText());

    }

    @Override
    public int getItemCount() {
        return mBean.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
         TextView tv;
        public ViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.iv);
            tv = (TextView) itemView.findViewById(R.id.tv);
        }
    }
}

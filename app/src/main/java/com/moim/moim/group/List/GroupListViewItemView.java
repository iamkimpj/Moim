package com.moim.moim.group.List;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.moim.moim.R;

public class GroupListViewItemView extends LinearLayout{
    TextView textView;
    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;

    public GroupListViewItemView(Context context){
        super(context);
        init(getContext());
    }

    public GroupListViewItemView(Context context, AttributeSet attrs){
        super(context, attrs);
        init(context);
    }
    public void init(Context context) {
        LayoutInflater inflater = (LayoutInflater)
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.group_listview, this, true);

        textView = (TextView) findViewById(R.id.gtextView);
        textView1 = (TextView) findViewById(R.id.textView1);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        textView4 = (TextView) findViewById(R.id.textView4);
        textView5 = (TextView) findViewById(R.id.textView5);

    }
    public void setgOrder_num(int gOrder_num){
        textView.setText(gOrder_num+"");
    }
    public void setgUser_num(int gUser_num){
        textView4.setText(gUser_num+"");
    }
    public void setgLocal(String gLocal){
        textView1.setText(gLocal);
    }
    public void setgTitle(String gTitle){
        textView2.setText(gTitle);
    }
    public void setgmTodaytime(String gmTodaytime){
        textView5.setText(gmTodaytime);
    }
    public void setgmPlace(String gmPlace){
        textView3.setText(gmPlace);
    }

}

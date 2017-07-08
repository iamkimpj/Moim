package com.moim.moim.meet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.moim.moim.R;

public class MeetListviewItemView extends LinearLayout{
    TextView textView;
    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    TextView textView6;
    TextView textView7;
    //TextView textView8;
    //TextView textView9;
    //TextView textView10;
    ImageView imageView;
    ImageView imageView1;

    public MeetListviewItemView(Context context){
        super(context);
        init(getContext());
    }

    public MeetListviewItemView(Context context, AttributeSet attrs){
        super(context, attrs);
        init(context);
    }
    public void init(Context context) {
        LayoutInflater inflater = (LayoutInflater)
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.meet_listview, this, true);

        textView = (TextView) findViewById(R.id.textView);
        textView1 = (TextView) findViewById(R.id.textView1);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        textView4 = (TextView) findViewById(R.id.textView4);
        textView5 = (TextView) findViewById(R.id.textView5);
        textView6 = (TextView) findViewById(R.id.textView6);
        textView7 = (TextView) findViewById(R.id.textView7);
        imageView = (ImageView) findViewById(R.id.imageView);
        imageView1 = (ImageView) findViewById(R.id.imageView1);

    }
    public void setDayofweek(String dayofweek){
        textView.setText(dayofweek);
    }
    public void setToday(String today){
        textView1.setText(today);
    }
    public void setTotime(String totime){
        textView2.setText(totime);
    }
    public void setTodaytime(String todaytime){
        textView3.setText(todaytime);
    }
    public void setPlace(String place){
        textView4.setText(place);
    }
    public void setPrice(String price){
        textView5.setText(price);
    }
    public void setPricetext(String pricetext){
        textView6.setText(pricetext);
    }
    public void setTitle(String title){
        textView7.setText(title);
    }
    public void setImg_time(int resId){
        imageView.setImageResource(resId);
    }
    public void setImg_map(int resId1){
        imageView1.setImageResource(resId1);
    }
}
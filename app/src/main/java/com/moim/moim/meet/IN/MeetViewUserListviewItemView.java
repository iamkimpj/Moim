package com.moim.moim.meet.IN;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.moim.moim.R;

/**
 * Created by ltcare on 2017-07-18.
 */

public class MeetViewUserListviewItemView extends LinearLayout{
    TextView textView;
    TextView textView1;
    ImageView imageView;
    ImageView imageView1;
    ImageView imageView2;

    public MeetViewUserListviewItemView(Context context){
        super(context);
        init(getContext());
    }

    public MeetViewUserListviewItemView(Context context, AttributeSet attrs){
        super(context, attrs);
        init(context);
    }
    public void init(Context context) {
        LayoutInflater inflater = (LayoutInflater)
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.meet_view_userlist_item_view, this, true);

        textView = (TextView) findViewById(R.id.textView);
        textView1 = (TextView) findViewById(R.id.textView1);
        imageView = (ImageView) findViewById(R.id.imageView);
        imageView1 = (ImageView) findViewById(R.id.imageView1);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
    }

    public void setNames(String names){
        textView.setText(names);
    }
    public void setIntros(String intros){ textView1.setText(intros); }
    public void setImg_face(int resId){
        imageView.setImageResource(resId);
    }
    public void setImg_icon1(int resId1){
        imageView1.setImageResource(resId1);
    }
    public void setImg_icon2(int resId2){
        imageView2.setImageResource(resId2);
    }
}
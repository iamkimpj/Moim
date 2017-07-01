package com.moim.moim.Model;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by developer on 2017. 7. 1..
 */

public class Meet {
    private int meet_id;
    private JSONObject meet = new JSONObject();

    public Meet ( int meet_id ) {
        setMeetId( meet_id );
        setInit();
        setMeet();
    }

    public JSONObject get(){
        return this.meet;
    }

    public void setMeetId( int meet_id ) {
        this.meet_id = meet_id;
        this.setName( "test" );
    }

    public void setInit() {
        this.setName( "" );
        this.setGroupId( "" );
        this.setDate("");
        this.setTime( 0 , "" );
        this.setPlace( "" );
    }

    public void setMeet(){
        this.setName( "test" );
        this.setGroupId( "0" );
        this.setDate("2017-07-01");
        this.setTime( 0 , "14:00" );
        this.setPlace( "썬팁스" );
    }

    public Meet setId( String id ){
        try {
            this.meet.put("id", id );
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return this;
    }

    public Meet setName( String name ){
        try {
            this.meet.put("name", name );
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return this;
    }

    public Meet setGroupId( String group_id ){
        try {
            this.meet.put("name", group_id );
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return this;
    }

    public Meet setDate( String date ){
        try {
            this.meet.put("date", date );
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return this;
    }

    public Meet setTime( int type, String value ){
        //type : 0 = 시간지정 ,1 = 선 지정 조건, 2 = text직접 입력
        JSONObject time = new JSONObject();
        try {
            time.put("type", type);
            time.put("value", value);
            this.meet.put("time", time );
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return this;
    }

    public Meet setPlace( String place ){
        try {
            this.meet.put("place", place );
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return this;
    }

    public String id(  ){
        String s = "";
        try {
            s = this.meet.getString("id");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return s;
    }
    public String name(  ){
        String s = "";
        try {
            s = this.meet.getString("name");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return s;
    }
    public String group_id(  ){
        String s = "";
        try {
            s = this.meet.getString("group_id");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return s;
    }
    public String date(  ){
        String s = "";
        try {
            s = this.meet.getString("date");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return s;
    }
    public String place(  ){
        String s = null;
        try {
            s = this.meet.getString("place");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return s;
    }
    public String timeValue(  ){
        String s = null;
        try {
             s = this.meet.getJSONObject("time").getString("value");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return s;
    }

    public String timeType(  ){
        String s = null;
        try {
            s = this.meet.getJSONObject("time").getString("type");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return s;
    }

}

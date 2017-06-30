package com.moim.moim.Model;

/**
 * Created by iamkimpj on 2017-06-29.
 */

public class User {
    private String name = "test name";

    public User ( int user_id ) {}


    public String getName() {
        return this.name;
    }

    public User name( String name ) {
        this.name = name;
        return this;
    }



}

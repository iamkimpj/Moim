package com.moim.moim.Model;

/**
 * Created by iamkimpj on 2017-06-29.
 */

public class User {
    private User () {}
    private static class Singleton {
        private static final User instance = new User();
    }

    public static User getInstance() {
        System.out.println("User Singleton use");

        return Singleton.instance;
    }
}

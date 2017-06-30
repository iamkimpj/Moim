package com.moim.moim.Comp;

import com.moim.moim.Model.User;

/**
 * Created by iamkimpj on 2017-06-29.
 */

public class Auth {
    private User user;

    private Auth () {}
    private static class Singleton {
        private static final Auth instance = new Auth();
    }

    public static Auth getInstance() {
        System.out.println("User Singleton use");

        return Singleton.instance;
    }

    public boolean chkToken() {
        // TODO: 2017-06-30  디비에 토큰이 있는지 확인
        // 없으면 false,
        // 있으면 서버와 통신 시도
        // 서버에서 ok 떨어지면 사용자 정보 세팅 후 return true
        // nok 떨어지면 return false
        return false;
    }

    public boolean login( String user_id, String user_pw ) {
        // TODO: 2017-06-30 로그인 프로세스

        Boolean auto_login = false;

        return false;

    }


}

package com.moim.moim.Login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.moim.moim.KakaoSDK.KakaoLoginActivity;
import com.moim.moim.MainActivity;
import com.moim.moim.R;

import java.util.zip.Inflater;

public class LoginActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btn_kakao_login = (Button) findViewById(R.id.btn_kakao_login);
        btn_kakao_login.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Intent intent = new Intent(getApplicationContext(), KakaoLoginActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }
}

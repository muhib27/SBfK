package app.sbk.com.sbk.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import app.sbk.com.sbk.R;
import app.sbk.com.sbk.utils.AppSharedPreference;

public class SplashActivity extends Activity {
    ImageView imageView;
    @Override
    protected void onStart() {
        super.onStart();

        int SPLASH_TIME_OUT = 2500;
        new Handler().postDelayed(new Runnable() {


            @Override
            public void run() {
                boolean isFirstTime = AppSharedPreference.getUsingFirstTime();
                Intent intent;
                if (isFirstTime) {
                    intent = new Intent(SplashActivity.this, LoginActivity.class);
                } else {
                    intent = new Intent(SplashActivity.this, MainActivity.class);
                }
                startActivity(intent);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);
        imageView = (ImageView) findViewById(R.id.logo);


    }
}

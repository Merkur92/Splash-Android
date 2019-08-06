package pe.qwando.splashportafolio;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class TwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //http://www.codeplayon.com/2019/06/how-to-make-gif-splash-screen-in-android-studio-animated/

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_two);

        new Handler().postDelayed(new Runnable() {
            public void run() {
                startActivity(new Intent(TwoActivity.this, MainActivity.class));
                finish();
            }
        }, 5000);

    }
}

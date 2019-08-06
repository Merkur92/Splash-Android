package pe.qwando.splashportafolio;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class FourActivity extends AppCompatActivity {

    ImageView circle_one, circle_two;
    Animation anim_one, anim_two, bganim;
    TextView textSplash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);

        anim_one = AnimationUtils.loadAnimation(this,R.anim.circle_one);
        anim_two = AnimationUtils.loadAnimation(this,R.anim.circle_two);
        bganim = AnimationUtils.loadAnimation(this,R.anim.bg_anim);
        circle_one = findViewById(R.id.first_circle);
        circle_two = findViewById(R.id.second_circle);
        textSplash = findViewById(R.id.textSplash);

        circle_one.startAnimation(anim_one);
        circle_two.startAnimation(anim_two);
        textSplash.startAnimation(bganim);

        new Handler().postDelayed(new Runnable() {
            public void run() {
                startActivity(new Intent(FourActivity.this, MainActivity.class));
                finish();
            }
        }, 10000);

    }
}

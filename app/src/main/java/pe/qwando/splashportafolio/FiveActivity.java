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

public class FiveActivity extends AppCompatActivity {

    Animation anim, anim2;
    ImageView img, img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);
        img = findViewById(R.id.arc_1);
        img2 = findViewById(R.id.arc_2);
        anim = AnimationUtils.loadAnimation(this,R.anim.rotate);
        anim2 = AnimationUtils.loadAnimation(this,R.anim.rotate_inv);
        img.startAnimation(anim);
        img2.startAnimation(anim2);

        new Handler().postDelayed(new Runnable() {
            public void run() {
                startActivity(new Intent(FiveActivity.this, MainActivity.class));
                finish();
            }
        }, 5000);
    }
}

package pe.qwando.splashportafolio;

import android.content.Intent;
import android.media.Image;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class ThreeActivity extends AppCompatActivity {

    ImageView bg_img;
    LinearLayout txt_three;
    LinearLayout txt_back;
    Animation anim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        anim = AnimationUtils.loadAnimation(this,R.anim.bg_anim);
        bg_img = findViewById(R.id.img_three);
        txt_three = findViewById(R.id.text_three);
        txt_back = findViewById(R.id.text_back);
        bg_img.animate().translationY(-700).setDuration(800).setStartDelay(1000);
        txt_three.animate().translationY(200).alpha(0).setDuration(800).setStartDelay(800);

        txt_back.startAnimation(anim);

        new Handler().postDelayed(new Runnable() {
            public void run() {
                startActivity(new Intent(ThreeActivity.this, MainActivity.class));
                finish();
            }
        }, 3000);

        //https://www.youtube.com/watch?v=uUnap0j8wfc
    }
}

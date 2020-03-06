package mg.studio.android.lab001;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    ImageView mouth, arms, ears, eyebrows, eyes, glasses, hat, mustache, nose, shoes;
    CheckBox mouthcb, armscb, earscb, eyebrowscb, eyescb, glassescb, hatcb, mustachecb, nosecb, shoescb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mouth = findViewById(R.id.mouth);
        arms = findViewById(R.id.arms);
        ears = findViewById(R.id.ears);
        eyebrows = findViewById(R.id.eyebrows);
        eyes = findViewById(R.id.eyes);
        glasses = findViewById(R.id.glasses);
        hat = findViewById(R.id.hat);
        mustache = findViewById(R.id.mustache);
        nose = findViewById(R.id.nose);
        shoes = findViewById(R.id.shoes);

        mouthcb = findViewById(R.id.cb_mouth);
        armscb = findViewById(R.id.cb_arms);
        earscb = findViewById(R.id.cb_ears);
        eyebrowscb = findViewById(R.id.cb_eyebrow);
        eyescb = findViewById(R.id.cb_eye);
        glassescb = findViewById(R.id.cb_glasses);
        hatcb = findViewById(R.id.cb_hat);
        mustachecb = findViewById(R.id.cb_mustache);
        nosecb = findViewById(R.id.cb_nose);
        shoescb = findViewById(R.id.cb_shoes);
    }
    public void onConfigurationChanged(Configuration newConfig)
    {
        super.onConfigurationChanged(newConfig);
        if (this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE)
        {
            setContentView(R.layout.activity_main_land);
            mouth = findViewById(R.id.mouth);
            arms = findViewById(R.id.arms);
            ears = findViewById(R.id.ears);
            eyebrows = findViewById(R.id.eyebrows);
            eyes = findViewById(R.id.eyes);
            glasses = findViewById(R.id.glasses);
            hat = findViewById(R.id.hat);
            mustache = findViewById(R.id.mustache);
            nose = findViewById(R.id.nose);
            shoes = findViewById(R.id.shoes);

            mouthcb = findViewById(R.id.cb_mouth);
            armscb = findViewById(R.id.cb_arms);
            earscb = findViewById(R.id.cb_ears);
            eyebrowscb = findViewById(R.id.cb_eyebrow);
            eyescb = findViewById(R.id.cb_eye);
            glassescb = findViewById(R.id.cb_glasses);
            hatcb = findViewById(R.id.cb_hat);
            mustachecb = findViewById(R.id.cb_mustache);
            nosecb = findViewById(R.id.cb_nose);
            shoescb = findViewById(R.id.cb_shoes);


        }

        else if (this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT)
        {
            setContentView(R.layout.activity_main);
            mouth = findViewById(R.id.mouth);
            arms = findViewById(R.id.arms);
            ears = findViewById(R.id.ears);
            eyebrows = findViewById(R.id.eyebrows);
            eyes = findViewById(R.id.eyes);
            glasses = findViewById(R.id.glasses);
            hat = findViewById(R.id.hat);
            mustache = findViewById(R.id.mustache);
            nose = findViewById(R.id.nose);
            shoes = findViewById(R.id.shoes);

            mouthcb = findViewById(R.id.cb_mouth);
            armscb = findViewById(R.id.cb_arms);
            earscb = findViewById(R.id.cb_ears);
            eyebrowscb = findViewById(R.id.cb_eyebrow);
            eyescb = findViewById(R.id.cb_eye);
            glassescb = findViewById(R.id.cb_glasses);
            hatcb = findViewById(R.id.cb_hat);
            mustachecb = findViewById(R.id.cb_mustache);
            nosecb = findViewById(R.id.cb_nose);
            shoescb = findViewById(R.id.cb_shoes);


        }

    }
        public void cbmouth (View v)
        {
            if (mouthcb.isChecked()) {
                mouth.setVisibility(View.VISIBLE);
            } else {
                mouth.setVisibility(View.GONE);
            }
        }

        public void cbarms (View v)
        {
            if (armscb.isChecked()) {
                arms.setVisibility(View.VISIBLE);
            } else {
                arms.setVisibility(View.GONE);
            }
        }

        public void cbears (View v)
        {
            if (earscb.isChecked()) {
                ears.setVisibility(View.VISIBLE);
            } else {
                ears.setVisibility(View.GONE);
            }
        }

        public void cbeye (View v)
        {
            if (eyescb.isChecked()) {
                eyes.setVisibility(View.VISIBLE);
            } else {
                eyes.setVisibility(View.GONE);
            }
        }
        public void cbeyebrow (View v)
        {
            if (eyebrowscb.isChecked()) {
                eyebrows.setVisibility(View.VISIBLE);
            } else {
                eyebrows.setVisibility(View.GONE);
            }
        }

        public void cbglasses (View v)
        {
            if (glassescb.isChecked()) {
                glasses.setVisibility(View.VISIBLE);
            } else {
                glasses.setVisibility(View.GONE);
            }
        }

        public void cbhat (View v)
        {
            if (hatcb.isChecked()) {
                hat.setVisibility(View.VISIBLE);
            } else {
                hat.setVisibility(View.GONE);
            }
        }

        public void cbmustache (View v)
        {
            if (mustachecb.isChecked()) {
                mustache.setVisibility(View.VISIBLE);
            } else {
                mustache.setVisibility(View.GONE);
            }
        }

        public void cbnose (View v)
        {
            if (nosecb.isChecked()) {
                nose.setVisibility(View.VISIBLE);
            } else {
                nose.setVisibility(View.GONE);
            }
        }

        public void cbshoes (View v)
        {
            if (shoescb.isChecked()) {
                shoes.setVisibility(View.VISIBLE);
            } else {
                shoes.setVisibility(View.GONE);
            }
        }
    }


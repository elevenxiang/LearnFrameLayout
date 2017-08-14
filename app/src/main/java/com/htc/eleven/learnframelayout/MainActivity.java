package com.htc.eleven.learnframelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView img1, img2;
    FrameLayout root = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1 = (ImageView) findViewById(R.id.image1);
        img2 = (ImageView) findViewById(R.id.image2);

        root = (FrameLayout) findViewById(R.id.root);

        // we could set ImageView click listener, also on root view frameLayout.
        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
//        root.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                switchImage();
//            }
//        });
    }

    private void switchImage() {
        if(img1.getVisibility()==View.INVISIBLE) {
            img1.setVisibility(View.VISIBLE);
            img2.setVisibility(View.INVISIBLE);
        }
        else {
            img1.setVisibility(View.INVISIBLE);
            img2.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public void onClick(View view) {
        switchImage();
    }
}

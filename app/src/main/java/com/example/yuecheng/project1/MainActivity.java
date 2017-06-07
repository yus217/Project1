package com.example.yuecheng.project1;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.ToggleButton;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    public static String a = "Lehigh University, Bethlehem BS in CHE and CS";
    public static String b = "Java, Matlab, Aspen";
    public static String c = "Dance, Music, Running";
    public static String d = "Unit Operation Lab 2015 fall - 2016 Spring";

    ImageView img;
    VideoView vView;


    public int[] imageId = {R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4, R.drawable.img5};


    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = (ImageView) findViewById(R.id.imageView);
        vView = (VideoView) findViewById(R.id.vView1);

    }



    public void onClick(View view) {

        if(count % imageId.length == 0) {

            img.setImageResource(imageId[0]);

            img.animate().alpha(1f).setDuration(5000);

        }

        if(count % imageId.length == 1) {

            img.setImageResource(imageId[1]);
            img.animate().alpha(0f).setDuration(5000);

        }
        if(count % imageId.length == 2) {

            img.setImageResource(imageId[2]);
            img.animate().rotation(360f).setDuration(5000);
            img.animate().alpha(1f).setDuration(5000);



        }
        if(count % imageId.length == 3) {

            img.setImageResource(imageId[3]);
            img.animate().alpha(0f).setDuration(5000);

        }
        if(count % imageId.length == 4) {

            img.setImageResource(imageId[4]);

            img.animate().alpha(1f).setDuration(5000);




        }

        count ++;

    }


    public void tbtnFunction(View view) {
        ToggleButton tbt = (ToggleButton) findViewById(R.id.toggleButton);
        if (tbt.getText().equals("photo")) {
            img.setVisibility(view.VISIBLE);
        }

        else{
            img.setVisibility(view.GONE);
        }

    }

    public void tbtnFunction5(View view) {
        ToggleButton tbt = (ToggleButton) findViewById(R.id.toggleButton5);
        VideoView vView = (VideoView) findViewById(R.id.vView1);

            //find the video view

            MediaController mc = new MediaController(this);

            //video path
            String vidPath = "android.resource://" + getPackageName() + "/" + R.raw.videodemo1;
            //(1) assign path directly
            vView.setVideoPath(vidPath);

            //(2) using URI
            Uri uri = Uri.parse(vidPath);
            vView.setVideoURI(uri);

            mc.setAnchorView(vView);
            vView.setMediaController(mc);

            vView.start();

        if (tbt.getText().equals("video")) {
            vView.setVisibility(view.VISIBLE);
        }
        else {
            vView.setVisibility(view.GONE);
        }
    }




    public void tbtnFunction1(View view) {
        ToggleButton tbt = (ToggleButton) findViewById(R.id.toggleButton1);

        TextView txv1 = (TextView) findViewById(R.id.textView1);


        if (tbt.getText().equals("education")) {
            txv1.setText(a);
        } else {
            txv1.setText("");
        }
    }

    public void tbtnFunction2(View view) {
        ToggleButton tbt = (ToggleButton) findViewById(R.id.toggleButton2);

        TextView txv2 = (TextView) findViewById(R.id.textView2);


        if (tbt.getText().equals("skills")) {
            txv2.setText(b);
        } else {
            txv2.setText("");
        }
    }

    public void tbtnFunction3(View view) {
        ToggleButton tbt = (ToggleButton) findViewById(R.id.toggleButton3);

        TextView txv3 = (TextView) findViewById(R.id.textView3);


        if (tbt.getText().equals("hobbies")) {
            txv3.setText(c);
        } else {
            txv3.setText("");
        }
    }

    public void tbtnFunction4(View view) {
        ToggleButton tbt = (ToggleButton) findViewById(R.id.toggleButton4);

        TextView txv4 = (TextView) findViewById(R.id.textView4);


        if (tbt.getText().equals("professional")) {
            txv4.setText(d);
        } else {
            txv4.setText("");
        }
    }



}

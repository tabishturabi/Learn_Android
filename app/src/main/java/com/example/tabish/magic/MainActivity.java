package com.example.tabish.magic;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView temp;
    Button dialphone,toast,showLocation,openWebPage,viewIntent,letsGetPro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Log.i("tag","inOnCreate");
        temp = (TextView) findViewById(R.id.push_me);

        dialphone = (Button) findViewById(R.id.dial_phone);
        toast = (Button) findViewById(R.id.toast);
        showLocation = (Button) findViewById(R.id.show_location);
        openWebPage = (Button) findViewById(R.id.open_web);
        viewIntent = (Button) findViewById(R.id.view_intent);
        letsGetPro = (Button) findViewById(R.id.lets_go_pro);


        dialphone.setOnClickListener(this);
        toast.setOnClickListener(this);
        showLocation.setOnClickListener(this);
        openWebPage.setOnClickListener(this);
        viewIntent.setOnClickListener(this);
        letsGetPro.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("tag","in onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("tag","in onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("tag","in onResume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("tag","in onDesroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("tag","in onRestart");
    }


    @Override
    public void onClick(View v) {

        Log.i("tag","inOnclick");


        switch(v.getId()){

            case R.id.dial_phone :
                Intent intent1 = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:03154335922"));
                startActivity(intent1);
                break;
            case R.id.toast :
                Intent intent = new Intent(MainActivity.this,otherActivity.class);
                intent.putExtra("KEY","value pass by intent");
                startActivity(intent);
                break;
            case R.id.open_web :
                Intent intent3 = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.edureka.co"));
                startActivity(intent3);
                break;
            case R.id.view_intent :
                Intent intent4 = new Intent(Intent.ACTION_VIEW);
                startActivity(intent4);
                break;
            case R.id.lets_go_pro :
                Intent intent5 = new Intent("com.example.tabish.magic.otherActivity");
                startActivity(intent5);


                break;
            case R.id.show_location :
                Intent intent2 = new Intent(Intent.ACTION_VIEW,Uri.parse("geo:31.4689021,74.2425645,19z=9"));
                startActivity(intent2);
                break;
        }


    }
}



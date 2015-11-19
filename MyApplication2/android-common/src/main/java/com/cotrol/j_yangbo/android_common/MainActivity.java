package com.cotrol.j_yangbo.android_common;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.cotrol.j_yangbo.android_common.views.BezelImageView;

import butterknife.Bind;
import butterknife.ButterKnife;

import static com.cotrol.j_yangbo.android_common.utils.LogUtils.LOGI;
import static com.cotrol.j_yangbo.android_common.utils.LogUtils.makeLogTag;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = makeLogTag("MAIN");

//    @Bind(R.id.bezel_imageview)
    BezelImageView mBezelImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        mBezelImageView = (BezelImageView) findViewById(R.id.bezel_imageview);
        setSupportActionBar(toolbar);
        LOGI(TAG, "onCreate---->");
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        mBezelImageView.setImageResource(R.mipmap.avatar);
        mBezelImageView.set
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

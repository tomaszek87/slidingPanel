package com.tomek.slidingpanel.panel.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.tomek.slidingpanel.R;
import com.tomek.slidingpanel.panel.view.SlidingDialog;
import com.tomek.slidingpanel.utils.activity.BaseActivity;

import butterknife.Bind;

public class PanelActivity extends BaseActivity {

    @Bind(R.id.fab)
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panel);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showNewDialog();
            }
        });
    }

    private void showNewDialog() {
        SlidingDialog dialog = SlidingDialog.newInstance();
        dialog.show(getSupportFragmentManager(), "dialog");
    }

}

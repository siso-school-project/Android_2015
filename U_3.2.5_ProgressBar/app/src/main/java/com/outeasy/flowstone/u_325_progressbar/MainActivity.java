package com.outeasy.flowstone.u_325_progressbar;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    private Button button = null;
    private ProgressBar progressBar = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button);
        progressBar = (ProgressBar)findViewById(R.id.progressBar);

        button.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case  R.id.button:

                if (progressBar.getVisibility()==View.GONE){
                    progressBar.setVisibility(View.VISIBLE);
                }else{
                    progressBar.setVisibility(View.GONE);
                }

                int progress = progressBar.getProgress();
                progress = progress + 10 ;
                progressBar.setProgress(progress);
            break;
        }
    }
}

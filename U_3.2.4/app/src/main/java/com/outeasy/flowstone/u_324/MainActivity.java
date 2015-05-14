package com.outeasy.flowstone.u_324;
//ImageView
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity  implements View.OnClickListener{

    private ImageView imageView = null;
    private Button button = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView)findViewById(R.id.imageView);
        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                imageView.setImageResource(R.drawable.new_launcher);
                break;
        }
    }
}

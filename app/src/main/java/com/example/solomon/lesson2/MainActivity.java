package com.example.solomon.lesson2;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.TOP);

        TextView txtTitle = new TextView(this);
        TextView txtBody = new TextView(this);
        TextView txtRemark = new TextView(this);

        Float desiredSp = 30.0f;
        float density  = getResources().getDisplayMetrics().density;

        txtTitle.setTextSize(TypedValue.COMPLEX_UNIT_SP,desiredSp/density);
        txtTitle.setText("This is my second app");

        desiredSp = 60.0f;
        txtBody.setTextSize(TypedValue.COMPLEX_UNIT_SP,desiredSp/density);
        txtBody.setText("This is the body of the application");
//        LinearLayout centerLayout = new LinearLayout(this);
//        centerLayout.setGravity(Gravity.CENTER);
        desiredSp = 40.0f;
        txtRemark.setTextSize(TypedValue.COMPLEX_UNIT_SP,desiredSp/density);
        txtRemark.setText("This is the conclusion");

        layout.setBackgroundColor(Color.BLUE);

        layout.addView(txtTitle);
        layout.addView(txtBody);
        layout.addView(txtRemark);

        setContentView(layout);
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

package com.example.user_pc.notes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.List;
import java.util.ArrayList;

public class Mainpage extends AppCompatActivity {


    private LinearLayout MyLayout;
    private ScrollView sv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_mainpage, menu);
        sv = new ScrollView(this);
        MyLayout = new LinearLayout(this);
        MyLayout.setOrientation(LinearLayout.VERTICAL);
        sv.addView(MyLayout);
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
        else if (id == R.id.action_add) {

           // EditText txtbox = new EditText(this);
           // MyLayout.addView(txtbox);
            //this.setContentView(sv);

            EditText et = new EditText(this);
            TextView vt = new TextView(this);
            et.setText("weeeeeeeeeee~!");
            MyLayout.addView(et);

            this.setContentView(sv);


            return true;
        }
        else if (id == R.id.action_delete) {
            return true;
        }
        else if (id == R.id.action_search) {
            return true;
        }
        else if (id == R.id.action_send) {
            return true;
        }
        return super.onOptionsItemSelected(item);
        }


}



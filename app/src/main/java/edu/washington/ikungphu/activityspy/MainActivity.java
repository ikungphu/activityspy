package edu.washington.ikungphu.activityspy;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {
    private static final String MYTAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(MYTAG, "onCreate event fired" + getIntent());
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(MYTAG, "onPause event fired" + getIntent());
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(MYTAG, "onResume event fired" + getIntent());
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(MYTAG, "onStop event fired");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(MYTAG, "onStart event fired" + getIntent());
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(MYTAG, "onRestart event fired" + getIntent());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(MYTAG, "We're going down, Captain!");
        finish();
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

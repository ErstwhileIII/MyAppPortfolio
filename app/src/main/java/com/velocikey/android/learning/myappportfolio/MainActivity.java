package com.velocikey.android.learning.myappportfolio;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void launchSpotify(View view) {
        showToast(view, getString(R.string.msgLaunchSpotifyStreamer));
    }
    public void launchScores(View view) {
        showToast(view, getString(R.string.msgLaunchScores));
    }
    public void launchLibrary(View view) {
        showToast(view, getString(R.string.msgLaunchLibrary));
    }
    public void launchBuildIt(View view) {
        showToast(view, getString(R.string.msgLaunchBuildIt));
    }
    public void launchXYZReader(View view) {
        showToast(view, getString(R.string.msgLaunchReader));
    }
    public void launchCapstone(View view) {
        showToast(view, getString(R.string.msgLaunchCapstone));
    }

    // Private methods
    private void showToast(Context context, String text, int duration) {
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    private void showToast(Context context, String text) {
        showToast(context, text, Toast.LENGTH_SHORT);
    }
    private void showToast(View view, String text) {
        showToast(view.getContext(), text, Toast.LENGTH_SHORT);
    }
    private void showToast(String text, int duration) {
        showToast(this.getApplicationContext(), text, duration);
    }
    private void showToast(String text) {
        showToast(text, Toast.LENGTH_SHORT);
    }
}

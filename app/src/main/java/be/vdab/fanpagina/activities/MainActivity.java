package be.vdab.fanpagina.activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import be.vdab.fanpagina.R;
import be.vdab.fanpagina.utils.PreferencesHelper;
import timber.log.Timber;

public class MainActivity extends BaseActivity{

    private TextView titleView;
    private TextView textView;
    private ImageView picasso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("A toolbar");
        setSupportActionBar(toolbar);
        titleView = (TextView) findViewById(R.id.titleView);
        titleView.setText(R.string.title);
        textView = (TextView) findViewById(R.id.textView);
        textView.setText(R.string.text);
        Intent intent = getIntent();
        Timber.d("------CREATE-----");
        picasso = (ImageView) findViewById(R.id.picasso);
        Picasso.with(this)
                .load("http://ashvegas.com/wp-content/uploads/2013/04/pain_gain_red_band.jpg").into(picasso);

    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item){
        int id = item.getItemId();
        if (id == R.id.action_settings){
            return true;
        }
        if (id == R.id.radio_en){
            PreferencesHelper.setLanguagePreference(this, "en");
            setLocale("en");
        }
        if (id == R.id.radio_nl){
            PreferencesHelper.setLanguagePreference(this, "nl");
            setLocale("nl");
        }
        if (id == R.id.action_video){
            String value = "gvYfRiJQIX8";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=" + value));
            intent.putExtra("https://www.youtube.com/watch?v=", value);
            MainActivity.this.startActivity(intent);
        }
        if (id == R.id.action_table){
            Intent inte = new Intent(this, TableActivity.class);
            startActivity(inte);
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Timber.d("------DESTROY-----");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Timber.d("------STOP-----");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Timber.d("------RESUME-----");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Timber.d("------START-----");
    }
}

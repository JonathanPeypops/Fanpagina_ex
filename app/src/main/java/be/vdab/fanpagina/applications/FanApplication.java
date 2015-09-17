package be.vdab.fanpagina.applications;

import android.app.Application;

import timber.log.Timber;

public class FanApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Timber.plant(new Timber.DebugTree());
    }
}

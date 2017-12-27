package com.gaf.android.sunshine.sync;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;

/**
 * Created by Amani on 27-12-2017.
 */

public class SunshineSyncIntentService extends IntentService {

    public SunshineSyncIntentService(){
        super("SunshineSyncIntentService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        SunshineSyncTask.syncWeather(this);
    }
}

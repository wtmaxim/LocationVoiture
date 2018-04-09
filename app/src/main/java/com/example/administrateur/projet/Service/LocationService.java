package com.example.administrateur.projet.Service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;

public class LocationService extends Service {
    private IBinder binder;

    public class LocationServiceBinder extends Binder {
        public LocationService getService() { return LocationService.this; }
    }

    public LocationService() {
        this.binder = new LocationService.LocationServiceBinder();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return binder;
    }
}

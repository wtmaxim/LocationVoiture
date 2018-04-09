package com.example.administrateur.projet.Service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;

public class LoginService extends Service {
    private IBinder binder;

    public class LoginServiceBinder extends Binder {
        public LoginService getService() { return LoginService.this; }
    }

    public LoginService() {
        this.binder = new LoginServiceBinder();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return binder;
    }

    public void Event(String type, String valeur) {

    }
}

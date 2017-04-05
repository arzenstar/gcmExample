package com.example.putra.gcmexample;

import android.widget.Toast;

import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by putra on 4/5/17.
 */

public class MyFirebaseID extends FirebaseInstanceIdService {
    public static final String TAG= "FirebaseInstanID";

    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();
        Toast.makeText(this,TAG,Toast.LENGTH_SHORT).show();
    }
}

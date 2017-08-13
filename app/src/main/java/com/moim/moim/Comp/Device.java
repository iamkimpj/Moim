package com.moim.moim.Comp;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;

import com.moim.moim.Model.User;

import java.io.UnsupportedEncodingException;
import java.util.UUID;

public class Device {

    protected static final String PREFS_FILE = "device_id.xml";
    protected static final String PREFS_DEVICE_ID = "device_id";
    protected volatile static UUID uuid;

    private User user;

    private Device () {}
    private static class Singleton {
        private static final Device instance = new Device();
    }

    public static Device getInstance() {
        System.out.println("User Singleton use");

        return Device.Singleton.instance;
    }

    private void setUUID( Context context ) {
        if (uuid == null) {
//            Context context = (new Activity).getApplicationContext();
            synchronized (Device.class) {
                if (uuid == null) {
                    final SharedPreferences prefs = context
                            .getSharedPreferences(PREFS_FILE, 0);
                    final String id = prefs.getString(PREFS_DEVICE_ID, null);
                    if (id != null) {
                        // Use the ids previously computed and stored in the
                        // prefs file
                        uuid = UUID.fromString(id);
                    } else {
                        final String androidId = Secure.getString(
                                context.getContentResolver(), Secure.ANDROID_ID);
                        // Use the Android ID unless it's broken, in which case
                        // fallback on deviceId,
                        // unless it's not available, then fallback on a random
                        // number which we store to a prefs file
                        try {
                            if (!"9774d56d682e549c".equals(androidId)) {
                                uuid = UUID.nameUUIDFromBytes(androidId
                                        .getBytes("utf8"));
                            } else {
                                final String deviceId = (
                                        (TelephonyManager) context
                                                .getSystemService(Context.TELEPHONY_SERVICE))
                                        .getDeviceId();
                                uuid = deviceId != null ? UUID
                                        .nameUUIDFromBytes(deviceId
                                                .getBytes("utf8")) : UUID
                                        .randomUUID();
                            }
                        } catch (UnsupportedEncodingException e) {
                            throw new RuntimeException(e);
                        }
                        // Write the value out to the prefs file
                        prefs.edit()
                                .putString(PREFS_DEVICE_ID, uuid.toString())
                                .commit();
                    }
                }
            }
        }
    }

    public UUID id( Context context ) {
        setUUID( context );
        return uuid;
    }
}
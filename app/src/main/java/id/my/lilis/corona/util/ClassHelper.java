package id.my.lilis.corona.util;

import android.app.Application;

public class ClassHelper extends Application {

    private static ClassHelper mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
    }

    public static ClassHelper getContext() {
        return mContext;
    }
}

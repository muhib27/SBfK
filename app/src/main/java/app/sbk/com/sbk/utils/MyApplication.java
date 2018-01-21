package app.sbk.com.sbk.utils;

import android.app.Application;
import android.content.Context;

import app.sbk.com.sbk.retrofit.ApiInterface;
import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by RR on 21-Jan-17.
 */

public class MyApplication extends Application {
    //DatabaseHandler databaseHandler;
    //private SQLiteDatabase mDatabase;
    private static MyApplication mInstance;
    private static Context context;
    ApiInterface apiInterface;

    @Override
    public void onCreate() {
        super.onCreate();
        //DBManager.initializeInstance();
        mInstance = this;
        context = this;
    }

    public static MyApplication getInstance() {
        return mInstance;
    }

    public static void setmInstance(MyApplication mInstance) {
        MyApplication.mInstance = mInstance;
    }
    public void dbInitialize(){
        //DBManager.initializeInstance();
        // databaseHandler = new DatabaseHandler();
        //mDatabase = databaseHandler.getWritableDatabase();
    }
    public static Context getContext() {
        return context;
    }

    public Realm getRealm(){
        RealmConfiguration config = new RealmConfiguration.Builder(this).build();
        Realm.setDefaultConfiguration(config);
        Realm realm = Realm.getDefaultInstance();

        return realm;
    }


//    public NetworkInterface getNetworkCallInterface(){
//        Retrofit retrofit = RetrofitApiClient.getInstance(this);
//        apiInterface = retrofit.create(ApiInterface.class);
//
//        return networkCallInterface;
//    }
}

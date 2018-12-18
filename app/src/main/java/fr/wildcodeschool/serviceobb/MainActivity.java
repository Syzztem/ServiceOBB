package fr.wildcodeschool.serviceobb;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;

public class MainActivity extends AppCompatActivity {

    private static final String TAG  = "MainActivity";
    private static Context appContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MainActivity.appContext = getApplicationContext();
        setContentView(R.layout.activity_main);
        URI fileName = this.getObbDir().toURI();
        Log.d(TAG, fileName.toString());
        File obb = new File(fileName);
        boolean open_failed = false;
        try {
            BufferedReader br = new BufferedReader(new FileReader(obb));
            open_failed = false;
            Log.d(TAG, "open success");
        } catch (IOException e) {
            open_failed = true;
        }

        if (open_failed) {
            // request R36EAD_EXTERNAL_STORAGE permission before reading OBB file
           Log.d(TAG, "open failed");
        }
    }

    public static Context getAppContext() {
        return appContext;
    }

    public static void setAppContext(Context appContext) {
        MainActivity.appContext = appContext;
    }
}

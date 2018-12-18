package fr.wildcodeschool.serviceobb;

import android.content.Context;
import android.os.storage.OnObbStateChangeListener;
import android.os.storage.StorageManager;

public class OBBManager {

    private StorageManager mStorageManager;
    private OnObbStateChangeListener listener;
    private String filename;
    private boolean mounted = false;

    public OBBManager(Context context, OnObbStateChangeListener listener){
       this.mStorageManager = (StorageManager) context.getSystemService(Context.STORAGE_SERVICE);
       this.listener = listener;
       this.filename = context.getObbDir().getAbsolutePath();
    }

    public void mount() {
        if (!mounted)
            mStorageManager.mountObb(filename,"a", listener);
    }

    public void unmount(){
        if (mounted)
            mStorageManager.unmountObb(filename, false, listener);
    }

    public String getFilename() {
        return filename;
    }
}

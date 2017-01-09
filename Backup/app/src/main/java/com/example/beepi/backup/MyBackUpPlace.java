package com.example.beepi.backup;

import android.app.backup.BackupAgentHelper;
import android.app.backup.SharedPreferencesBackupHelper;

/**
 * Created by beepi on 09/01/2017.
 */

public class MyBackUpPlace extends BackupAgentHelper {
    static final String File_Name_Of_Prefrences = "myPrefrences";
    static final String PREFS_BACKUP_KEY = "backup";

    @Override
    public void onCreate() {
        super.onCreate();

        SharedPreferencesBackupHelper helper = new SharedPreferencesBackupHelper
                (this, File_Name_Of_Prefrences);
        addHelper(PREFS_BACKUP_KEY, helper);
    }
}

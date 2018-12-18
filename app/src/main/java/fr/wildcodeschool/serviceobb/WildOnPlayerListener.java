package fr.wildcodeschool.serviceobb;

import android.media.MediaPlayer;

public interface WildOnPlayerListener {
    void onPrepared(MediaPlayer mp);
    void onCompletion(MediaPlayer mp);
}
package com.radioplayer;
import java.io.IOException;
import android.media.MediaPlayer;

public class AudioStream {

    public void audioPlayer(String path, String fileName){
        //set up MediaPlayer        android:background=""
        MediaPlayer mp = new MediaPlayer();
     
        try {
            mp.setDataSource(path+"/"+fileName);
        } catch (IllegalArgumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalStateException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            mp.prepare();
        } catch (IllegalStateException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        mp.start();
    }

}

package com.radioplayer;

import java.io.Console;
import java.io.IOException;

import com.radioplayer.R;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.TabActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TabHost;
import android.content.Context;
import android.content.res.Resources;

public class MainActivity extends TabActivity {
    /** Called when the activity is first created. */
	TabHost mTabHost;
	
 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Resources res = getResources(); 
        mTabHost = getTabHost();
    
        
        mTabHost.addTab(mTabHost.newTabSpec("tab_test1").setIndicator("Stream",res.getDrawable(R.drawable.ic_tab_play)).setContent(R.id.player1));
        mTabHost.addTab(mTabHost.newTabSpec("tab_test2").setIndicator("Palimpsest", res.getDrawable(R.drawable.ic_tab_palimpsest)).setContent(R.id.textview2));
        mTabHost.addTab(mTabHost.newTabSpec("tab_test3").setIndicator("Photo", res.getDrawable(R.drawable.ic_tab_photo)).setContent(R.id.textview3));
        mTabHost.addTab(mTabHost.newTabSpec("tab_test4").setIndicator("Chat", res.getDrawable(R.drawable.ic_tab_chat)).setContent(R.id.textview4));
        
        // listener 
        Button button1  =  (Button)findViewById(R.id.button1);
        
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
            	MediaPlayer mediaPlayer = new MediaPlayer();
            	try
            	{
            		mediaPlayer.setDataSource("http://www.radiocicletta.it:8000/stream");
            		mediaPlayer.prepare();
            	}catch(Exception e)
            	{
            		Log.e("Stica", e.getMessage());
            	}
            	
       
            	mediaPlayer.start();
            	
            	
            	
            }
        });

		
        // --------
        
        
        mTabHost.setCurrentTab(1);
    }
    
    
}
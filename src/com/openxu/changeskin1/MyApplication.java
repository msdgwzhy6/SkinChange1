package com.openxu.changeskin1;

import android.app.Application;

public class MyApplication extends Application {
	public static SkinUtil skin;
	
	@Override
	public void onCreate() {
		super.onCreate();
		skin = new SkinUtil(getApplicationContext());
	}
}

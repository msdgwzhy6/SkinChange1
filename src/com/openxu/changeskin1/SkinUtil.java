package com.openxu.changeskin1;

import android.content.Context;
import android.content.SharedPreferences;

public class SkinUtil {
	private SharedPreferences sp;
	//KEY
	private final String KEY_PF = "skin";  //皮肤
	//VALUE
	public static final int VALUE_SKIN_1 = 1;   //天蓝
	public static final int VALUE_SKIN_2 = 2;   //草绿
	
	//当前皮肤资源ID
	public int activity_bg;
	public int item_bg;
	public int textColor;
	
	public SkinUtil(Context context){
		sp = context.getSharedPreferences("mySkin", Context.MODE_PRIVATE); 
		loadPf();
	}
	/**
	 * 设置使用那一套皮肤
	 * @param witch
	 */
	public void setSkin(int witch){
		sp.edit().putInt(KEY_PF, witch).commit();
		loadPf();
	}
	/**
	 * 加载皮肤资源
	 */
	public void loadPf(){
		//默认第一套皮肤（如果没有设置过）
		int pf_num =  sp.getInt(KEY_PF, VALUE_SKIN_1);
		switch (pf_num) {
		case VALUE_SKIN_1:
			setSkin1();
			break;
		case VALUE_SKIN_2:
			setSkin2();
			break;
		}
	}

	//加载第一套皮肤资源ID
	private void setSkin1() {
		activity_bg = R.drawable.skin1_activity_bg;
		item_bg = R.drawable.skin1_main_item_bg;
		textColor = R.color.pf1_text_color;
	}
	
	//加载第二套皮肤资源ID
	private void setSkin2() {
		activity_bg = R.drawable.skin2_activity_bg;
		item_bg = R.drawable.skin2_main_item_bg;
		textColor = R.color.pf2_text_color;
	}
	
}

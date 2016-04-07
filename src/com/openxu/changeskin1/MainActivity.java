package com.openxu.changeskin1;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends BaseActivity{
	private LinearLayout ll_bg;
	private TextView tv_skin1, tv_skin2;

	@Override
	protected void initView() {
        setContentView(R.layout.activity_main);
        ll_bg = (LinearLayout) findViewById(R.id.ll_bg);
        tv_skin1 = (TextView) findViewById(R.id.tv_skin1);
        tv_skin2 = (TextView) findViewById(R.id.tv_skin2);
        tv_skin1.setOnClickListener(this);
        tv_skin2.setOnClickListener(this);
	}
    protected void setSkin() {
    	ll_bg.setBackgroundResource(MyApplication.skin.activity_bg);
    	tv_skin1.setBackgroundResource(MyApplication.skin.item_bg);
    	tv_skin2.setBackgroundResource(MyApplication.skin.item_bg);
    	tv_skin1.setTextColor(getResources().getColor(MyApplication.skin.textColor));
    	tv_skin2.setTextColor(getResources().getColor(MyApplication.skin.textColor));
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.tv_skin1:
			//使用第一套皮肤
			MyApplication.skin.setSkin(SkinUtil.VALUE_SKIN_1);
			setSkin();
			break;
		case R.id.tv_skin2:
			//使用第二套皮肤
			MyApplication.skin.setSkin(SkinUtil.VALUE_SKIN_2);
			setSkin();
			break;
		default:
			break;
		}
	}
}

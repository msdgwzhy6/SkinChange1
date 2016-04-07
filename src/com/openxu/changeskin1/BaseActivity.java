package com.openxu.changeskin1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;


public abstract class BaseActivity extends Activity implements OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        setSkin();
    }

    protected abstract void initView();
    protected abstract void setSkin();

	@Override
	public void onClick(View v) {
	}

}

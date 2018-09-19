/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.branch;

import com.github.fangyun.yunqi.支;
import com.github.fangyun.yunqi.月;
import com.github.fangyun.yunqi.脏腑;
import com.github.fangyun.yunqi.month.五月;
import com.github.fangyun.yunqi.viscera.心;

/**
 * @author FangYun
 *
 */
public class 午 implements 支 {

	private static final 午 INSTANCE = new 午();

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.github.fangyun.yunqi.zhi.Zhi#chineseName()
	 */
	@Override
	public String chineseName() {
		return "午";
	}

	@Override
	public int getOrder() {
		return 7;
	}

	public static 午 getInstance() {
		return INSTANCE;
	}

	@Override
	public 月 getMonth() {
		return 五月.getInstance();
	}
	
	public 脏腑 getViscera() {
		return 心.getInstance();
	}
}

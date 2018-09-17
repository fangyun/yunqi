/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.zhi;

import com.github.fangyun.yunqi.支;
import com.github.fangyun.yunqi.月;
import com.github.fangyun.yunqi.yue.五月;

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
}

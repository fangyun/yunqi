/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.zhi;

import com.github.fangyun.yunqi.支;
import com.github.fangyun.yunqi.月;
import com.github.fangyun.yunqi.yue.四月;

/**
 * @author FangYun
 *
 */
public class 巳 implements 支 {

	private static final 巳 INSTANCE = new 巳();

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.github.fangyun.yunqi.zhi.Zhi#chineseName()
	 */
	@Override
	public String chineseName() {
		return "巳";
	}

	@Override
	public int getOrder() {
		return 6;
	}

	public static 巳 getInstance() {
		return INSTANCE;
	}

	@Override
	public 月 getMonth() {
		return 四月.getInstance();
	}

}

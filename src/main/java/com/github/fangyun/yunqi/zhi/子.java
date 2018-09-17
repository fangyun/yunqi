/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.zhi;

import com.github.fangyun.yunqi.支;
import com.github.fangyun.yunqi.月;
import com.github.fangyun.yunqi.yue.十一月;

/**
 * @author FangYun
 *
 */
public class 子 implements 支 {

	private static final 子 INSTANCE = new 子();

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.github.fangyun.yunqi.zhi.Zhi#chineseName()
	 */
	@Override
	public String chineseName() {
		return "子";
	}

	@Override
	public int getOrder() {
		return 1;
	}

	public static 子 getInstance() {
		return INSTANCE;
	}

	@Override
	public 月 getMonth() {
		return 十一月.getInstance();
	}

	
}

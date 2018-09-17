/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.zhi;

import com.github.fangyun.yunqi.支;
import com.github.fangyun.yunqi.月;
import com.github.fangyun.yunqi.yue.七月;

/**
 * @author FangYun
 *
 */
public class 申 implements 支 {

	private static final 申 INSTANCE = new 申();

	/* (non-Javadoc)
	 * @see com.github.fangyun.yunqi.zhi.Zhi#chineseName()
	 */
	@Override
	public String chineseName() {
		return "申";
	}

	@Override
	public int getOrder() {
		return 9;
	}

	public static 申 getInstance() {
		return INSTANCE;
	}

	@Override
	public 月 getMonth() {
		return 七月.getInstance();
	}
	
}

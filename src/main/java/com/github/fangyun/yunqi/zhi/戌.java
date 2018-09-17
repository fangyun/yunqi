/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.zhi;

import com.github.fangyun.yunqi.支;
import com.github.fangyun.yunqi.月;
import com.github.fangyun.yunqi.yue.九月;

/**
 * @author FangYun
 *
 */
public class 戌 implements 支 {

	private static final 戌 INSTANCE = new 戌();

	/* (non-Javadoc)
	 * @see com.github.fangyun.yunqi.zhi.Zhi#chineseName()
	 */
	@Override
	public String chineseName() {
		return "戌";
	}

	@Override
	public int getOrder() {
		return 11;
	}

	public static 戌 getInstance() {
		return INSTANCE;
	}

	@Override
	public 月 getMonth() {
		return 九月.getInstance();
	}

	
	
}

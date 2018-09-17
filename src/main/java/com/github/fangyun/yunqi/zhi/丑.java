/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.zhi;

import com.github.fangyun.yunqi.支;
import com.github.fangyun.yunqi.月;
import com.github.fangyun.yunqi.yue.十二月;

/**
 * @author FangYun
 *
 */
public class 丑 implements 支 {
	private final static 丑 INSTANCE = new 丑();

	/* (non-Javadoc)
	 * @see com.github.fangyun.yunqi.zhi.Zhi#chineseName()
	 */
	@Override
	public String chineseName() {
		return "丑";
	}

	private 丑() {
	}
	
	@Override
	public int getOrder() {
		return 2;
	}

	public static 支 getInstance() {
		return INSTANCE;
	}

	@Override
	public 月 getMonth() {
		return 十二月.getInstance();
	}
}

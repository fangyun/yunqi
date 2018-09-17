/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.zhi;

import com.github.fangyun.yunqi.支;
import com.github.fangyun.yunqi.月;
import com.github.fangyun.yunqi.yue.十月;

/**
 * @author FangYun
 *
 */
public class 亥 implements 支 {

	private static final 亥 INSTANCE = new 亥();

	/* (non-Javadoc)
	 * @see com.github.fangyun.yunqi.zhi.Zhi#chineseName()
	 */
	@Override
	public String chineseName() {
		return "亥";
	}

	@Override
	public int getOrder() {
		return 12;
	}

	public static 亥 getInstance() {
		return INSTANCE;
	}

	@Override
	public 月 getMonth() {
		return 十月.getInstance();
	}
	
	
}

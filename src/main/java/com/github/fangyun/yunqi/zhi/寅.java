/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.zhi;

import com.github.fangyun.yunqi.yue.一月;
import com.github.fangyun.yunqi.yue.月;

/**
 * @author FangYun
 *
 */
public class 寅 implements 支 {
	private final static 寅 INSTANCE = new 寅();
	
	/* (non-Javadoc)
	 * @see com.github.fangyun.yunqi.zhi.Zhi#chineseName()
	 */
	@Override
	public String chineseName() {
		return "寅";
	}

	public 月 month() {
		return 一月.getInstance();
	}

	public static 寅 getInstance() {
		return INSTANCE;
	}

	@Override
	public int order() {
		return 3;
	}


}

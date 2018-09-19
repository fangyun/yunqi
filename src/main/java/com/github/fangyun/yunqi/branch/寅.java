/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.branch;

import com.github.fangyun.yunqi.支;
import com.github.fangyun.yunqi.月;
import com.github.fangyun.yunqi.脏腑;
import com.github.fangyun.yunqi.month.一月;
import com.github.fangyun.yunqi.viscera.肺;

/**
 * @author FangYun
 *
 */
public class 寅 implements 支 {
	private final static 寅 INSTANCE = new 寅();

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.github.fangyun.yunqi.zhi.Zhi#chineseName()
	 */
	@Override
	public String chineseName() {
		return "寅";
	}

	public 月 getMonth() {
		return 一月.getInstance();
	}

	public static 寅 getInstance() {
		return INSTANCE;
	}

	@Override
	public int getOrder() {
		return 3;
	}
	
	public 脏腑 getViscera() {
		return 肺.getInstance();
	}
}

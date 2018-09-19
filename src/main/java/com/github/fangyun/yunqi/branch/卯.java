/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.branch;

import com.github.fangyun.yunqi.支;
import com.github.fangyun.yunqi.月;
import com.github.fangyun.yunqi.脏腑;
import com.github.fangyun.yunqi.month.二月;
import com.github.fangyun.yunqi.viscera.大肠;

/**
 * @author FangYun
 *
 */
public class 卯 implements 支 {
	private final static 卯 INSTANCE = new 卯();

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.github.fangyun.yunqi.zhi.Zhi#chineseName()
	 */
	@Override
	public String chineseName() {
		return "卯";
	}

	public static 卯 getInstance() {
		return INSTANCE;
	}

	@Override
	public int getOrder() {
		return 4;
	}

	@Override
	public 月 getMonth() {
		return 二月.getInstance();
	}

	public 脏腑 getViscera() {
		return 大肠.getInstance();
	}
}

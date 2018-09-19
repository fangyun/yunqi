/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.branch;

import com.github.fangyun.yunqi.支;
import com.github.fangyun.yunqi.月;
import com.github.fangyun.yunqi.脏腑;
import com.github.fangyun.yunqi.month.六月;
import com.github.fangyun.yunqi.viscera.小肠;

/**
 * @author FangYun
 *
 */
public class 未 implements 支 {

	private static final 未 INSTANCE = new 未();

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.github.fangyun.yunqi.zhi.Zhi#chineseName()
	 */
	@Override
	public String chineseName() {
		return "未";
	}

	@Override
	public int getOrder() {
		return 8;
	}

	public static 未 getInstance() {
		return INSTANCE;
	}

	@Override
	public 月 getMonth() {
		return 六月.getInstance();
	}

	public 脏腑 getViscera() {
		return 小肠.getInstance();
	}
}

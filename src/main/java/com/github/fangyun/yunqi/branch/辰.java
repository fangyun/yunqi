/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.branch;

import com.github.fangyun.yunqi.支;
import com.github.fangyun.yunqi.月;
import com.github.fangyun.yunqi.脏腑;
import com.github.fangyun.yunqi.month.三月;
import com.github.fangyun.yunqi.viscera.胃;

/**
 * @author FangYun
 *
 */
public class 辰 implements 支 {
	private static final 辰 INSTANCE = new 辰();

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.github.fangyun.yunqi.zhi.Zhi#chineseName()
	 */
	@Override
	public String chineseName() {
		return "辰";
	}

	@Override
	public int getOrder() {
		return 5;
	}

	public static 辰 getInstance() {
		return INSTANCE;
	}


	@Override
	public 月 getMonth() {
		return 三月.getInstance();
	}

	public 脏腑 getViscera() {
		return 胃.getInstance();
	}
}

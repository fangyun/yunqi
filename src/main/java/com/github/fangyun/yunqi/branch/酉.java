/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.branch;

import com.github.fangyun.yunqi.支;
import com.github.fangyun.yunqi.月;
import com.github.fangyun.yunqi.脏腑;
import com.github.fangyun.yunqi.month.八月;
import com.github.fangyun.yunqi.viscera.肾;

/**
 * @author FangYun
 *
 */
public class 酉 implements 支 {

	private static final 酉 INSTANCE = new 酉();

	/* (non-Javadoc)
	 * @see com.github.fangyun.yunqi.zhi.Zhi#chineseName()
	 */
	@Override
	public String chineseName() {
		return "酉";
	}

	@Override
	public int getOrder() {
		return 10;
	}

	public static 酉 getInstance() {
		return INSTANCE;
	}

	@Override
	public 月 getMonth() {
		return 八月.getInstance();
	}

	public 脏腑 getViscera() {
		return 肾.getInstance();
	}
}

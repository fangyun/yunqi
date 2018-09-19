/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.month;

import com.github.fangyun.yunqi.季;
import com.github.fangyun.yunqi.支;
import com.github.fangyun.yunqi.月;
import com.github.fangyun.yunqi.branch.酉;
import com.github.fangyun.yunqi.season.秋;

/**
 * @author FangYun
 *
 */
public class 八月 implements 月 {
	private static final 八月 INSTANCE = new 八月();

	public String chineseName() {
		return "八月";
	}

	@Override
	public int order() {
		return 8;
	}

	@Override
	public 支 build() {
		return 酉.getInstance();
	}

	@Override
	public 季 getSeason() {
		return 秋.getInstance();
	}
	
	public static 八月 getInstance() {
		return INSTANCE;
	}
}

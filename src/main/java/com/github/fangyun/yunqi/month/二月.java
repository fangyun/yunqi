/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.month;

import com.github.fangyun.yunqi.季;
import com.github.fangyun.yunqi.支;
import com.github.fangyun.yunqi.月;
import com.github.fangyun.yunqi.branch.卯;
import com.github.fangyun.yunqi.season.春;

/**
 * @author FangYun
 *
 */
public class 二月 implements 月 {
	private final static 二月 INSTANCE = new 二月();
	public String chineseName() {
		return "二月";
	}

	@Override
	public int order() {
		return 2;
	}

	@Override
	public 支 build() {
		return 卯.getInstance();
	}
	
	public static 二月 getInstance() {
		return INSTANCE;
	}

	@Override
	public 季 getSeason() {
		return 春.getInstance();
	}
}

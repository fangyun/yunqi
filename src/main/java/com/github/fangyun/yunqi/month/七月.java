/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.month;

import com.github.fangyun.yunqi.季;
import com.github.fangyun.yunqi.支;
import com.github.fangyun.yunqi.月;
import com.github.fangyun.yunqi.branch.申;
import com.github.fangyun.yunqi.season.秋;

/**
 * @author FangYun
 *
 */
public class 七月 implements 月 {
	private static final 七月 INSTANCE = new 七月();

	public String chineseName() {
		return "七月";
	}

	@Override
	public int order() {
		return 7;
	}

	@Override
	public 支 build() {
		return 申.getInstance();
	}

	@Override
	public 季 getSeason() {
		return 秋.getInstance();
	}

	public static 七月 getInstance() {
		return INSTANCE;
	}
}

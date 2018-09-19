/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.month;

import com.github.fangyun.yunqi.季;
import com.github.fangyun.yunqi.支;
import com.github.fangyun.yunqi.月;
import com.github.fangyun.yunqi.branch.寅;
import com.github.fangyun.yunqi.season.春;

/**
 * @author FangYun
 *
 */
public class 一月 implements 月 {
	private final static 一月 INSTANCE = new 一月();

	public String chineseName() {
		return "一月";
	}

	public String[] aliasName() {
		return new String[] { "正月" };
	}

	@Override
	public 支 build() {
		return 寅.getInstance();
	}

	public int order() {
		return 1;
	}

	public static 一月 getInstance() {
		return INSTANCE;
	}

	@Override
	public 季 getSeason() {
		return 春.getInstance();
	}
}

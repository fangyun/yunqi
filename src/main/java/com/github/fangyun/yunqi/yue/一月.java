/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.yue;

import com.github.fangyun.yunqi.zhi.寅;
import com.github.fangyun.yunqi.zhi.支;

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
}

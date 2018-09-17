/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.yue;

import com.github.fangyun.yunqi.季;
import com.github.fangyun.yunqi.支;
import com.github.fangyun.yunqi.月;
import com.github.fangyun.yunqi.ji.夏;
import com.github.fangyun.yunqi.zhi.午;

/**
 * @author FangYun
 *
 */
public class 五月 implements 月 {
	private static final 五月 INSTANCE = new 五月();
	public String chineseName() {
		return "五月";
	}

	@Override
	public int order() {
		return 5;
	}

	@Override
	public 支 build() {
		return 午.getInstance();
	}

	@Override
	public 季 getSeason() {
		return 夏.getInstance();
	}
	public static 五月 getInstance() {
		return INSTANCE;
	}
	
}

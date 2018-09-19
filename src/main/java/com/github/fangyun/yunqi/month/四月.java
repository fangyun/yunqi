/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.month;

import com.github.fangyun.yunqi.季;
import com.github.fangyun.yunqi.支;
import com.github.fangyun.yunqi.月;
import com.github.fangyun.yunqi.branch.巳;
import com.github.fangyun.yunqi.season.夏;

/**
 * @author FangYun
 *
 */
public class 四月 implements 月 {
	private static final 四月 INSTANCE = new 四月();

	public String chineseName() {
		return "四月";
	}

	@Override
	public int order() {
		return 4;
	}

	@Override
	public 支 build() {
		return 巳.getInstance();
	}

	public static 四月 getInstance() {
		return INSTANCE;
	}

	@Override
	public 季 getSeason() {
		return 夏.getInstance();
	}
	
	
}

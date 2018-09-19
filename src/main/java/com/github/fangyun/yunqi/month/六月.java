/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.month;

import com.github.fangyun.yunqi.季;
import com.github.fangyun.yunqi.支;
import com.github.fangyun.yunqi.月;
import com.github.fangyun.yunqi.branch.未;
import com.github.fangyun.yunqi.season.夏;

/**
 * @author FangYun
 *
 */
public class 六月 implements 月 {
	
	private static final 六月 INSTANCE = new 六月();

	public String chineseName() {
		return "六月";
	}

	@Override
	public int order() {
		return 6;
	}

	@Override
	public 支 build() {
		return 未.getInstance();
	}

	@Override
	public 季 getSeason() {
		return 夏.getInstance();
	}
	
	public static 六月 getInstance() {
		return INSTANCE;
	}
}

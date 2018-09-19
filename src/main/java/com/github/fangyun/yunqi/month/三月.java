/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.month;

import com.github.fangyun.yunqi.季;
import com.github.fangyun.yunqi.支;
import com.github.fangyun.yunqi.月;
import com.github.fangyun.yunqi.branch.辰;
import com.github.fangyun.yunqi.season.春;

/**
 * @author FangYun
 *
 */
public class 三月 implements 月 {
	private static final 三月 INSTANCE = new 三月();

	public String chineseName() {
		return "三月";
	}

	@Override
	public int order() {
		return 3;
	}

	@Override
	public 支 build() {
		return 辰.getInstance();
	}

	public static 三月 getInstance() {
		return INSTANCE;
	}

	@Override
	public 季 getSeason() {
		return 春.getInstance();
	}
}

/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.yue;

import com.github.fangyun.yunqi.季;
import com.github.fangyun.yunqi.支;
import com.github.fangyun.yunqi.月;
import com.github.fangyun.yunqi.ji.秋;
import com.github.fangyun.yunqi.zhi.戌;

/**
 * @author FangYun
 *
 */
public class 九月 implements 月 {
	private static final 九月 INSTANCE = new 九月();

	public String chineseName() {
		return "九月";
	}

	@Override
	public int order() {
		return 9;
	}

	@Override
	public 支 build() {
		return 戌.getInstance();
	}

	@Override
	public 季 getSeason() {
		return 秋.getInstance();
	}
	
	public static 九月 getInstance() {
		return INSTANCE;
	} 
}

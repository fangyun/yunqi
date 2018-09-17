/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.yue;

import com.github.fangyun.yunqi.季;
import com.github.fangyun.yunqi.支;
import com.github.fangyun.yunqi.月;
import com.github.fangyun.yunqi.ji.冬;
import com.github.fangyun.yunqi.zhi.丑;

/**
 * @author FangYun
 *
 */
public class 十二月 implements 月 {
	private static final 十二月 INSTANCE = new 十二月();
	public String chineseName() {
		return "十二月";
	}

	@Override
	public int order() {
		return 12;
	}

	@Override
	public 支 build() {
		return 丑.getInstance();
	}
	
	@Override
	public 季 getSeason() {
		return 冬.getInstance();
	}
	public static 十二月 getInstance() {
		return INSTANCE;
	} 
}

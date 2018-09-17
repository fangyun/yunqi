/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.yue;

import com.github.fangyun.yunqi.季;
import com.github.fangyun.yunqi.支;
import com.github.fangyun.yunqi.月;
import com.github.fangyun.yunqi.ji.冬;
import com.github.fangyun.yunqi.zhi.亥;

/**
 * @author FangYun
 *
 */
public class 十月 implements 月 {
	private static final 十月 INSTANCE = new 十月();
	
	public String chineseName() {
		return "十月";
	}

	@Override
	public int order() {
		return 10;
	}

	@Override
	public 支 build() {
		return 亥.getInstance();
	}

	@Override
	public 季 getSeason() {
		return 冬.getInstance();
	}
	
	public static 十月 getInstance() {
		return INSTANCE;
	} 
}

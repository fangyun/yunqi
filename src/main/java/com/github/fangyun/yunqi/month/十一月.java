/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.month;

import com.github.fangyun.yunqi.季;
import com.github.fangyun.yunqi.支;
import com.github.fangyun.yunqi.月;
import com.github.fangyun.yunqi.branch.子;
import com.github.fangyun.yunqi.season.冬;

/**
 * @author FangYun
 *
 */
public class 十一月 implements 月 {
	private static final 十一月 INSTANCE = new 十一月();
	public String chineseName() {
		return "十一月";
	}

	@Override
	public int order() {
		return 11;
	}

	@Override
	public 支 build() {
		return 子.getInstance();
	}
	
	@Override
	public 季 getSeason() {
		return 冬.getInstance();
	}
	public static 十一月 getInstance() {
		return INSTANCE;
	} 
}

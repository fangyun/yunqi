/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.yue;

import com.github.fangyun.yunqi.zhi.巳;
import com.github.fangyun.yunqi.zhi.支;

/**
 * @author FangYun
 *
 */
public class 四月 implements 月 {
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
	
	
}

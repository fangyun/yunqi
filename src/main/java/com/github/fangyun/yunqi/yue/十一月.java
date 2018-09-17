/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.yue;

import com.github.fangyun.yunqi.zhi.子;
import com.github.fangyun.yunqi.zhi.支;

/**
 * @author FangYun
 *
 */
public class 十一月 implements 月 {
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
	
	
}

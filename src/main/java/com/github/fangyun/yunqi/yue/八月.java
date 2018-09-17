/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.yue;

import com.github.fangyun.yunqi.zhi.酉;
import com.github.fangyun.yunqi.zhi.支;

/**
 * @author FangYun
 *
 */
public class 八月 implements 月 {
	public String chineseName() {
		return "八月";
	}

	@Override
	public int order() {
		return 8;
	}

	@Override
	public 支 build() {
		return 酉.getInstance();
	}
	
	
}

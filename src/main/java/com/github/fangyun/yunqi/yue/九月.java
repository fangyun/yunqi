/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.yue;

import com.github.fangyun.yunqi.zhi.戌;
import com.github.fangyun.yunqi.zhi.支;

/**
 * @author FangYun
 *
 */
public class 九月 implements 月 {
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
	
	
}

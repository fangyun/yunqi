/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.yue;

import com.github.fangyun.yunqi.zhi.申;
import com.github.fangyun.yunqi.zhi.支;

/**
 * @author FangYun
 *
 */
public class 七月 implements 月 {
	public String chineseName() {
		return "七月";
	}

	@Override
	public int order() {
		return 7;
	}

	@Override
	public 支 build() {
		return 申.getInstance();
	}
}

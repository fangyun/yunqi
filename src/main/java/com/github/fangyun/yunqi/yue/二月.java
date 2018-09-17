/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.yue;

import com.github.fangyun.yunqi.zhi.卯;
import com.github.fangyun.yunqi.zhi.支;

/**
 * @author FangYun
 *
 */
public class 二月 implements 月 {
	public String chineseName() {
		return "二月";
	}

	@Override
	public int order() {
		return 2;
	}

	@Override
	public 支 build() {
		return 卯.getInstance();
	}
}

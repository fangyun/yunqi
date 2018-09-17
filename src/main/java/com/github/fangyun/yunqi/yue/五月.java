/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.yue;

import com.github.fangyun.yunqi.zhi.午;
import com.github.fangyun.yunqi.zhi.支;

/**
 * @author FangYun
 *
 */
public class 五月 implements 月 {
	public String chineseName() {
		return "五月";
	}

	@Override
	public int order() {
		return 5;
	}

	@Override
	public 支 build() {
		return 午.getInstance();
	}
}

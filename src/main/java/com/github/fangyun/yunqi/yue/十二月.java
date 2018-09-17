/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.yue;

import com.github.fangyun.yunqi.zhi.丑;
import com.github.fangyun.yunqi.zhi.支;

/**
 * @author FangYun
 *
 */
public class 十二月 implements 月 {
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
}

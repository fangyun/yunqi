/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.yue;

import com.github.fangyun.yunqi.zhi.亥;
import com.github.fangyun.yunqi.zhi.支;

/**
 * @author FangYun
 *
 */
public class 十月 implements 月 {
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
}

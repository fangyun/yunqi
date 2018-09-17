/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.yue;

import com.github.fangyun.yunqi.zhi.未;
import com.github.fangyun.yunqi.zhi.支;

/**
 * @author FangYun
 *
 */
public class 六月 implements 月 {
	public String chineseName() {
		return "六月";
	}

	@Override
	public int order() {
		return 6;
	}

	@Override
	public 支 build() {
		return 未.getInstance();
	}
}

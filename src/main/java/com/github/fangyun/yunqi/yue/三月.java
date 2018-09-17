/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.yue;

import com.github.fangyun.yunqi.zhi.辰;
import com.github.fangyun.yunqi.zhi.支;

/**
 * @author FangYun
 *
 */
public class 三月 implements 月 {
	public String chineseName() {
		return "三月";
	}

	@Override
	public int order() {
		return 3;
	}

	@Override
	public 支 build() {
		return 辰.getInstance();
	}
	
	
}

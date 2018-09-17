/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.yun;

import com.github.fangyun.yunqi.克;
import com.github.fangyun.yunqi.生;

/**
 * @author FangYun
 *
 */
public interface 运 extends 生<运>, 克<运> {
	default String metaName() {
		return "运";
	}

	String chineseName();
}

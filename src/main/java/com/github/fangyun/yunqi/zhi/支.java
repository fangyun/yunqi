/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.zhi;

import com.github.fangyun.yunqi.序;

/**
 * @author FangYun
 *
 */
public interface 支 extends 序<支> {
	default String metaName() {
		return "支";
	}
	
	String chineseName();
}

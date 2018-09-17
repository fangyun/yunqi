/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.gan;

/**
 * @author FangYun
 *
 */
public interface Gan {
	default String metaName() {
		return "干";
	}
	
	String chineseName();
}

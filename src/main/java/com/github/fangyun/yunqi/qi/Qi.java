/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.qi;

/**
 * @author FangYun
 *
 */
public interface Qi {
	default String metaName() {
		return "气";
	}
	
	String chineseName();
}

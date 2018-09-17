/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi;

/**
 * @author FangYun
 *
 */
public interface 月 {
	
	default String metaName() {
		return "月";
	}
	
	String chineseName();
	
	default String[] aliasName() {
		return null;
	}
	
	int order();
	
	支 build();
	
	季 getSeason();
}

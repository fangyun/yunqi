/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi;

/**
 * @author FangYun
 *
 */
public interface 支 extends 序<支>, 极 {
	default String metaName() {
		return "支";
	}

	default public 季 getSeason() {
		return getMonth().getSeason();
	}

	String chineseName();

	月 getMonth();
	
	default public 极 getPolarity() {
		return getOrder() % 2 == 0 ? 阴.getInstance() : 阳.getInstance();
	}
}

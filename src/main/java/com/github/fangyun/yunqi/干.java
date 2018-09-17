/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi;

/**
 * @author FangYun
 *
 */
public interface 干 extends 序<干>, 极 {
	default String metaName() {
		return "干";
	}

	String chineseName();

	default public 极 getPolarity() {
		return getOrder() % 2 == 0 ? 阴.getInstance() : 阳.getInstance();
	}
}

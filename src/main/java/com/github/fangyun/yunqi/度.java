/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi;

/**
 * @author FangYun
 *
 */
public interface 度 {
	极 getPolarity();
	
	default public String asString() {
		return this.getClass().getName();
	}
}

/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.yun;

/**
 * @author FangYun
 *
 */
public class 金 implements 运 {
	private final static 金 INSTANCE = new 金();
	@Override
	public String chineseName() {
		return "金";
	}

	@Override
	public 运 bring() {
		return 水.getInstance();
	}

	@Override
	public 运 restrain() {
		return 木.getInstance();
	}

	public static 运 getInstance() {
		return INSTANCE;
	}
	
	
}

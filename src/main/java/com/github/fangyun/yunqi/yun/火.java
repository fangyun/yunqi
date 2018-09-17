/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.yun;

/**
 * @author FangYun
 *
 */
public class 火 implements 运 {
	private final static 火 INSTANCE = new 火();

	@Override
	public String chineseName() {
		return "火";
	}

	@Override
	public 运 bring() {
		return 土.getInstance();
	}

	@Override
	public 运 restrain() {
		return 金.getInstance();
	}

	public static 火 getInstance() {
		return INSTANCE;
	}

}

/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.yun;

/**
 * @author FangYun
 *
 */
public class 木 implements 运 {
	private final static 木 INSTANCE = new 木();
	@Override
	public String chineseName() {
		return "木";
	}

	public static 木 getInstance() {
		return INSTANCE;
	}

	@Override
	public 运 bring() {
		return 火.getInstance();
	}

	@Override
	public 运 restrain() {
		return 土.getInstance();
	}
	
}

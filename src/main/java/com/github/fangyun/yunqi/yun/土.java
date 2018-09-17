/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.yun;

/**
 * @author FangYun
 *
 */
public class 土 implements 运 {
	private static final 土 INSTANCE = new 土();

	@Override
	public String chineseName() {
		return "土";
	}

	@Override
	public 运 restrain() {
		return 水.getInstance();
	}



	@Override
	public 运 bring() {
		return 金.getInstance();
	}



	public static 土 getInstance() {
		return INSTANCE;
	}

}

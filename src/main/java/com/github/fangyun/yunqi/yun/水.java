/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.yun;

/**
 * @author FangYun
 *
 */
public class 水 implements 运 {
	private final static 水 INSTANCE = new 水();
	@Override
	public String chineseName() {
		return "水";
	}

	public static 水 getInstance() {
		return INSTANCE;
	}

	@Override
	public 运 restrain() {
		return 火.getInstance();
	}

	@Override
	public 运 bring() {
		return 木.getInstance();
	}
	
	

}

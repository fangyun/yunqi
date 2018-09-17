/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.zhi;

/**
 * @author FangYun
 *
 */
public class 丑 implements 支 {
	private final static 丑 INSTANCE = new 丑();

	/* (non-Javadoc)
	 * @see com.github.fangyun.yunqi.zhi.Zhi#chineseName()
	 */
	@Override
	public String chineseName() {
		return "丑";
	}

	private 丑() {
	}
	
	@Override
	public int order() {
		return 2;
	}

	public static 支 getInstance() {
		return INSTANCE;
	}
}

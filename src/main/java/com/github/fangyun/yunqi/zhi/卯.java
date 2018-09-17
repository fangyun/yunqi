/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.zhi;

/**
 * @author FangYun
 *
 */
public class 卯 implements 支 {
	private final static 卯 INSTANCE = new 卯();

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.github.fangyun.yunqi.zhi.Zhi#chineseName()
	 */
	@Override
	public String chineseName() {
		return "卯";
	}

	public static 卯 getInstance() {
		return INSTANCE;
	}

	@Override
	public int order() {
		return 4;
	}

}

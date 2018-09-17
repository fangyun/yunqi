/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.zhi;

/**
 * @author FangYun
 *
 */
public class 酉 implements 支 {

	private static final 酉 INSTANCE = new 酉();

	/* (non-Javadoc)
	 * @see com.github.fangyun.yunqi.zhi.Zhi#chineseName()
	 */
	@Override
	public String chineseName() {
		return "酉";
	}

	@Override
	public int order() {
		return 10;
	}

	public static 酉 getInstance() {
		return INSTANCE;
	}

}

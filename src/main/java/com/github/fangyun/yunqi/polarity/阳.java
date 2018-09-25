/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.polarity;

import com.github.fangyun.yunqi.度;
import com.github.fangyun.yunqi.极;
import com.github.fangyun.yunqi.degree.太过;

/**
 * @author FangYun
 *
 */
public class 阳 implements 极 {
	private static final 阳 INSTANCE = new 阳();
	
	public static 阳 getInstance() {
		return INSTANCE;
	}


	@Override
	public 度 getDegree() {
		return 太过.getInstance();
	}
}

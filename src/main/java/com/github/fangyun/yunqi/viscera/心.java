/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.viscera;

import com.github.fangyun.yunqi.脏腑;

/**
 * @author FangYun
 *
 */
public class 心 implements 脏腑 {
	private static final 心 INSTANCE= new 心();
	
	public static 心 getInstance() {
		return INSTANCE;
	}
}

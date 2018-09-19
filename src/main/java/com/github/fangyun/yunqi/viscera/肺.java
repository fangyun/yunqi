/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.viscera;

import com.github.fangyun.yunqi.脏腑;

/**
 * @author FangYun
 *
 */
public class 肺 implements 脏腑 {
	private static final 肺 INSTANCE= new 肺();
	
	public static 肺 getInstance() {
		return INSTANCE;
	}
}

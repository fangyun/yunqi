/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.viscera;

import com.github.fangyun.yunqi.脏腑;

/**
 * @author FangYun
 *
 */
public class 肾 implements 脏腑 {
	private static final 肾 INSTANCE= new 肾();
	
	public static 肾 getInstance() {
		return INSTANCE;
	}
}

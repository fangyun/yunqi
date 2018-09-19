/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.viscera;

import com.github.fangyun.yunqi.脏腑;

/**
 * @author FangYun
 *
 */
public class 胃 implements 脏腑 {
	private static final 胃 INSTANCE= new 胃();
	
	public static 胃 getInstance() {
		return INSTANCE;
	}
}

/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.viscera;

import com.github.fangyun.yunqi.脏腑;

/**
 * @author FangYun
 *
 */
public class 脾 implements 脏腑 {
	private static final 脾 INSTANCE= new 脾();
	
	public static 脾 getInstance() {
		return INSTANCE;
	}
}

/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.viscera;

import com.github.fangyun.yunqi.脏腑;

/**
 * @author FangYun
 *
 */
public class 肝 implements 脏腑 {
	private static final 肝 INSTANCE= new 肝();
	
	public static 肝 getInstance() {
		return INSTANCE;
	}
}

/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.viscera;

import com.github.fangyun.yunqi.脏腑;

/**
 * @author FangYun
 *
 */
public class 大肠 implements 脏腑 {
	private static final 大肠 INSTANCE= new 大肠();
	
	public static 大肠 getInstance() {
		return INSTANCE;
	}
}

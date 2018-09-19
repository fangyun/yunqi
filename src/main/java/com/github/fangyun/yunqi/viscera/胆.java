/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.viscera;

import com.github.fangyun.yunqi.脏腑;

/**
 * @author FangYun
 *
 */
public class 胆 implements 脏腑 {
	private static final 胆 INSTANCE= new 胆();
	
	public static 胆 getInstance() {
		return INSTANCE;
	}
}

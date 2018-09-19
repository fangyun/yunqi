/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.viscera;

import com.github.fangyun.yunqi.脏腑;

/**
 * @author FangYun
 *
 */
public class 小肠 implements 脏腑 {
	private static final 小肠 INSTANCE= new 小肠();
	
	public static 小肠 getInstance() {
		return INSTANCE;
	}
}

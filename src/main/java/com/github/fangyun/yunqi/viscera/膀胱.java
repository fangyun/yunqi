/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.viscera;

import com.github.fangyun.yunqi.脏腑;

/**
 * @author FangYun
 *
 */
public class 膀胱 implements 脏腑 {
	private static final 膀胱 INSTANCE= new 膀胱();
	
	public static 膀胱 getInstance() {
		return INSTANCE;
	}
}

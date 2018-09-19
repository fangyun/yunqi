/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.viscera;

import com.github.fangyun.yunqi.脏腑;

/**
 * @author FangYun
 *
 */
public class 包络 implements 脏腑 {
	private static final 包络 INSTANCE= new 包络();
	
	public static 包络 getInstance() {
		return INSTANCE;
	}
}

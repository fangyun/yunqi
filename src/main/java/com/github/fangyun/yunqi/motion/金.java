/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.motion;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.github.fangyun.yunqi.干;
import com.github.fangyun.yunqi.运;
import com.github.fangyun.yunqi.stem.乙;
import com.github.fangyun.yunqi.stem.庚;

/**
 * @author FangYun
 *
 */
public class 金 implements 运 {
	private final static 金 INSTANCE = new 金();

	public static 金 getInstance() {
		return INSTANCE;
	}
	
	public List<干> getStems(){
		return Collections.unmodifiableList(Arrays.asList(庚.getInstance(),乙.getInstance()));
	}
}

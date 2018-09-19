/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.motion;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.github.fangyun.yunqi.干;
import com.github.fangyun.yunqi.运;
import com.github.fangyun.yunqi.stem.丙;
import com.github.fangyun.yunqi.stem.辛;

/**
 * @author FangYun
 *
 */
public class 水 implements 运 {
	private final static 水 INSTANCE = new 水();

	public static 水 getInstance() {
		return INSTANCE;
	}

	public List<干> getStems(){
		return Collections.unmodifiableList(Arrays.asList(丙.getInstance(),辛.getInstance()));
	}
}

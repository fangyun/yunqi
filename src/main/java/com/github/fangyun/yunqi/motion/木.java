/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.motion;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.github.fangyun.yunqi.干;
import com.github.fangyun.yunqi.运;
import com.github.fangyun.yunqi.stem.丁;
import com.github.fangyun.yunqi.stem.壬;

/**
 * @author FangYun
 *
 */
public class 木 implements 运 {
	private final static 木 INSTANCE = new 木();

	public static 木 getInstance() {
		return INSTANCE;
	}
	
	public List<干> getStems(){
		return Collections.unmodifiableList(Arrays.asList(壬.getInstance(),丁.getInstance()));
	}
}

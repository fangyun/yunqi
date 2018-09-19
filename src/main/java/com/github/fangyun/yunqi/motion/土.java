/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.motion;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.github.fangyun.yunqi.干;
import com.github.fangyun.yunqi.运;
import com.github.fangyun.yunqi.stem.己;
import com.github.fangyun.yunqi.stem.甲;

/**
 * @author FangYun
 *
 */
public class 土 implements 运 {
	private static final 土 INSTANCE = new 土();

	public static 土 getInstance() {
		return INSTANCE;
	}
	public List<干> getStems(){
		return Collections.unmodifiableList(Arrays.asList(甲.getInstance(),己.getInstance()));
	}
}

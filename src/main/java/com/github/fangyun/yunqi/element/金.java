/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.element;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.github.fangyun.yunqi.干;
import com.github.fangyun.yunqi.行;
import com.github.fangyun.yunqi.stem.庚;
import com.github.fangyun.yunqi.stem.辛;

/**
 * @author FangYun
 *
 */
public class 金 implements 行 {
	private final static 金 INSTANCE = new 金();

	@Override
	public 行 bring() {
		return 水.getInstance();
	}

	@Override
	public 行 restrain() {
		return 木.getInstance();
	}

	public static 金 getInstance() {
		return INSTANCE;
	}
	
	public List<干> getStems(){
		return Collections.unmodifiableList(Arrays.asList(庚.getInstance(),辛.getInstance()));
	}
}

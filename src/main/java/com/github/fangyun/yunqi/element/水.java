/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.element;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.github.fangyun.yunqi.干;
import com.github.fangyun.yunqi.行;
import com.github.fangyun.yunqi.stem.壬;
import com.github.fangyun.yunqi.stem.癸;

/**
 * @author FangYun
 *
 */
public class 水 implements 行 {
	private final static 水 INSTANCE = new 水();

	public static 水 getInstance() {
		return INSTANCE;
	}

	@Override
	public 行 restrain() {
		return 火.getInstance();
	}

	@Override
	public 木 bring() {
		return 木.getInstance();
	}
	
	
	public List<干> getStems(){
		return Collections.unmodifiableList(Arrays.asList(壬.getInstance(),癸.getInstance()));
	}
}

/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.element;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.github.fangyun.yunqi.干;
import com.github.fangyun.yunqi.行;
import com.github.fangyun.yunqi.音;
import com.github.fangyun.yunqi.music.徵;
import com.github.fangyun.yunqi.stem.丁;
import com.github.fangyun.yunqi.stem.丙;

/**
 * @author FangYun
 *
 */
public class 火 implements 行 {
	private final static 火 INSTANCE = new 火();

	@Override
	public 行 bring() {
		return 土.getInstance();
	}

	@Override
	public 行 restrain() {
		return 金.getInstance();
	}

	public static 火 getInstance() {
		return INSTANCE;
	}
	public List<干> getStems(){
		return Collections.unmodifiableList(Arrays.asList(丙.getInstance(),丁.getInstance()));
	}

	@Override
	public 音 getMusic() {
		return 徵.getInstance();
	}

}

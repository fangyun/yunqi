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
import com.github.fangyun.yunqi.music.宫;
import com.github.fangyun.yunqi.stem.己;
import com.github.fangyun.yunqi.stem.戊;

/**
 * @author FangYun
 *
 */
public class 土 implements 行 {
	private static final 土 INSTANCE = new 土();

	@Override
	public 行 restrain() {
		return 水.getInstance();
	}

	@Override
	public 行 bring() {
		return 金.getInstance();
	}

	public static 土 getInstance() {
		return INSTANCE;
	}
	public List<干> getStems(){
		return Collections.unmodifiableList(Arrays.asList(戊.getInstance(),己.getInstance()));
	}

	@Override
	public 音 getMusic() {
		return 宫.getInstance();
	}
	
}

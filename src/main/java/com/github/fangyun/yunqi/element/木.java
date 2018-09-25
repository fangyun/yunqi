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
import com.github.fangyun.yunqi.music.角;
import com.github.fangyun.yunqi.stem.乙;
import com.github.fangyun.yunqi.stem.甲;

/**
 * @author FangYun
 *
 */
public class 木 implements 行 {
	private final static 木 INSTANCE = new 木();

	public static 木 getInstance() {
		return INSTANCE;
	}

	@Override
	public 行 bring() {
		return 火.getInstance();
	}

	@Override
	public 行 restrain() {
		return 土.getInstance();
	}
	
	public List<干> getStems(){
		return Collections.unmodifiableList(Arrays.asList(甲.getInstance(),乙.getInstance()));
	}

	@Override
	public 音 getMusic() {
		return 角.getInstance();
	}

}

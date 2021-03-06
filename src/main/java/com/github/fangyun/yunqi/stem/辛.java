/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.stem;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.github.fangyun.yunqi.干;
import com.github.fangyun.yunqi.支;
import com.github.fangyun.yunqi.脏腑;
import com.github.fangyun.yunqi.运;
import com.github.fangyun.yunqi.音;
import com.github.fangyun.yunqi.branch.酉;
import com.github.fangyun.yunqi.motion.金;
import com.github.fangyun.yunqi.music.羽;
import com.github.fangyun.yunqi.viscera.肺;

/**
 * @author FangYun
 *
 */
public class 辛 implements 干 {
	private static final 辛 INSTANCE = new 辛();
	
	public static  辛  getInstance() {
		return INSTANCE;
	}


	@Override
	public int getOrder() {
		return 8;
	}

	@Override
	public 运 getMotion() {
		return 金.getInstance();
	}
	@Override
	public List<支> getBranches() {
		return Collections.unmodifiableList(Arrays.asList(酉.getInstance()));
	}
	@Override
	public List<脏腑> getVisceras() {
		return Arrays.asList(肺.getInstance());
	}


	@Override
	public 音 getMusic() {
		return 羽.getInstance();
	}	
	
	
}

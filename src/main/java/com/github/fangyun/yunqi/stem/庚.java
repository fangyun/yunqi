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
import com.github.fangyun.yunqi.branch.申;
import com.github.fangyun.yunqi.motion.金;
import com.github.fangyun.yunqi.music.商;
import com.github.fangyun.yunqi.viscera.大肠;

/**
 * @author FangYun
 *
 */
public class 庚 implements 干 {
	private static final 庚 INSTANCE = new 庚();
	
	public static  庚  getInstance() {
		return INSTANCE;
	}


	@Override
	public int getOrder() {
		return 7;
	}

	@Override
	public 运 getMotion() {
		return 金.getInstance();
	}	
	
	@Override
	public List<支> getBranches() {
		return Collections.unmodifiableList(Arrays.asList(申.getInstance()));
	}
	@Override
	public List<脏腑> getVisceras() {
		return Arrays.asList(大肠.getInstance());
	}


	@Override
	public 音 getMusic() {
		return 商.getInstance();
	}
	
}

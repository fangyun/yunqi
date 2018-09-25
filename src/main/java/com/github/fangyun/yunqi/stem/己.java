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
import com.github.fangyun.yunqi.branch.丑;
import com.github.fangyun.yunqi.branch.未;
import com.github.fangyun.yunqi.motion.土;
import com.github.fangyun.yunqi.music.宫;
import com.github.fangyun.yunqi.viscera.脾;

/**
 * @author FangYun
 *
 */
public class 己 implements 干 {
	private static final 己 INSTANCE = new 己();
	
	public static  己  getInstance() {
		return INSTANCE;
	}


	@Override
	public int getOrder() {
		return 6;
	}

	@Override
	public 运 getMotion() {
		return 土.getInstance();
	}	
	
	@Override
	public List<支> getBranches() {
		return Collections.unmodifiableList(Arrays.asList(未.getInstance(), 丑.getInstance()));
	}
	@Override
	public List<脏腑> getVisceras() {
		return Arrays.asList(脾.getInstance());
	}


	@Override
	public 音 getMusic() {
		return 宫.getInstance();
	}
	
}

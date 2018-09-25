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
import com.github.fangyun.yunqi.branch.子;
import com.github.fangyun.yunqi.motion.水;
import com.github.fangyun.yunqi.music.角;
import com.github.fangyun.yunqi.viscera.膀胱;

/**
 * @author FangYun
 *
 */
public class 壬 implements 干 {
	private static final 壬 INSTANCE = new 壬();
	
	public static  壬  getInstance() {
		return INSTANCE;
	}



	@Override
	public int getOrder() {
		return 9;
	}

	@Override
	public 运 getMotion() {
		return 水.getInstance();
	}	
	
	@Override
	public List<支> getBranches() {
		return Collections.unmodifiableList(Arrays.asList(子.getInstance()));
	}

	@Override
	public List<脏腑> getVisceras() {
		return Arrays.asList(膀胱.getInstance());
	}



	@Override
	public 音 getMusic() {
		return 角.getInstance();
	}
}

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
import com.github.fangyun.yunqi.branch.巳;
import com.github.fangyun.yunqi.motion.火;
import com.github.fangyun.yunqi.music.角;
import com.github.fangyun.yunqi.viscera.包络;
import com.github.fangyun.yunqi.viscera.心;

/**
 * @author FangYun
 *
 */
public class 丁 implements 干 {
	private static final 丁 INSTANCE = new 丁();
	
	public static  丁  getInstance() {
		return INSTANCE;
	}


	@Override
	public int getOrder() {
		return 4;
	}

	@Override
	public 运 getMotion() {
		return 火.getInstance();
	}
	
	@Override
	public List<支> getBranches() {
		return Collections.unmodifiableList(Arrays.asList(巳.getInstance()));
	}

	@Override
	public List<脏腑> getVisceras() {
		return Arrays.asList(心.getInstance(), 包络.getInstance());
	}


	@Override
	public 音 getMusic() {
		return 角.getInstance();
	}
}

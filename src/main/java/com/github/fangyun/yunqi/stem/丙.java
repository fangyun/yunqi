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
import com.github.fangyun.yunqi.branch.午;
import com.github.fangyun.yunqi.motion.火;
import com.github.fangyun.yunqi.music.羽;
import com.github.fangyun.yunqi.viscera.三焦;
import com.github.fangyun.yunqi.viscera.小肠;

/**
 * @author FangYun
 *
 */
public class 丙 implements 干 {
	private static final 丙 INSTANCE = new 丙();
	
	public static  丙  getInstance() {
		return INSTANCE;
	}


	@Override
	public int getOrder() {
		return 3;
	}

	@Override
	public 运 getMotion() {
		return 火.getInstance();
	}
	
	@Override
	public List<支> getBranches() {
		return Collections.unmodifiableList(Arrays.asList(午.getInstance()));
	}
	@Override
	public List<脏腑> getVisceras() {
		return Arrays.asList(小肠.getInstance(),三焦.getInstance());
	}


	@Override
	public 音 getMusic() {
		return 羽.getInstance();
	}
	
}

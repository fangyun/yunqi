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
import com.github.fangyun.yunqi.branch.子;
import com.github.fangyun.yunqi.motion.水;
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

	/* (non-Javadoc)
	 * @see com.github.fangyun.yunqi.gan.Gan#chineseName()
	 */
	@Override
	public String chineseName() {
		return "壬";
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
}

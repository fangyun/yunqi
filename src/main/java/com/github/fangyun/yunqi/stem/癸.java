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
import com.github.fangyun.yunqi.branch.亥;
import com.github.fangyun.yunqi.motion.水;
import com.github.fangyun.yunqi.viscera.肾;

/**
 * @author FangYun
 *
 */
public class 癸 implements 干 {
	private static final 癸 INSTANCE = new 癸();
	
	public static  癸  getInstance() {
		return INSTANCE;
	}


	@Override
	public int getOrder() {
		return 10;
	}
	
	@Override
	public 运 getMotion() {
		return 水.getInstance();
	}
	
	@Override
	public List<支> getBranches() {
		return Collections.unmodifiableList(Arrays.asList(亥.getInstance()));
	}
	@Override
	public List<脏腑> getVisceras() {
		return Arrays.asList(肾.getInstance());
	}
}

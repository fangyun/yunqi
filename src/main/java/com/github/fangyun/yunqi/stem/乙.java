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
import com.github.fangyun.yunqi.branch.卯;
import com.github.fangyun.yunqi.motion.木;
import com.github.fangyun.yunqi.viscera.肝;

/**
 * @author FangYun
 *
 */
public class 乙 implements 干 {
	private static final 乙 INSTANCE = new 乙();
	
	public static  乙  getInstance() {
		return INSTANCE;
	}



	@Override
	public int getOrder() {
		return 2;
	}

	@Override
	public 运 getMotion() {
		return 木.getInstance();
	}
	
	@Override
	public List<支> getBranches() {
		return Collections.unmodifiableList(Arrays.asList(卯.getInstance()));
	}

	@Override
	public List<脏腑> getVisceras() {
		return Arrays.asList(肝.getInstance());
	}
	
	
}

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
import com.github.fangyun.yunqi.branch.戌;
import com.github.fangyun.yunqi.branch.辰;
import com.github.fangyun.yunqi.motion.土;
import com.github.fangyun.yunqi.viscera.胃;

/**
 * @author FangYun
 *
 */
public class 戊 implements 干 {
	private static final 戊 INSTANCE = new 戊();

	public static 戊 getInstance() {
		return INSTANCE;
	}



	@Override
	public int getOrder() {
		return 5;
	}

	@Override
	public 运 getMotion() {
		return 土.getInstance();
	}

	@Override
	public List<支> getBranches() {
		return Collections.unmodifiableList(Arrays.asList(辰.getInstance(), 戌.getInstance()));
	}

	@Override
	public List<脏腑> getVisceras() {
		return Arrays.asList(胃.getInstance());
	}
	
	
}

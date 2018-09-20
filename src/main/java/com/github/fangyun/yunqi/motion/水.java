/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.motion;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.github.fangyun.yunqi.干;
import com.github.fangyun.yunqi.度;
import com.github.fangyun.yunqi.运;
import com.github.fangyun.yunqi.polarity.阳;
import com.github.fangyun.yunqi.polarity.阴;
import com.github.fangyun.yunqi.stem.丙;
import com.github.fangyun.yunqi.stem.辛;

/**
 * @author FangYun
 *
 */
public class 水 implements 运 {
	private final static 水 INSTANCE = new 水();

	public static 水 getInstance() {
		return INSTANCE;
	}

	public List<干> getStems() {
		return Collections.unmodifiableList(Arrays.asList(丙.getInstance(), 辛.getInstance()));
	}
	
	public 干 getStem(度 degree) {
		if (degree.getPolarity() instanceof 阳) {
			return 丙.getInstance();
		} else if (degree.getPolarity() instanceof 阴) {
			return 辛.getInstance();
		}
		return null;
	}

	public String getClimate(度 degree) {
		if (degree.getPolarity() instanceof 阳) {
			return "寒气流行";
		} else if (degree.getPolarity() instanceof 阴) {
			return "湿乃大行";
		}
		return null;
	}
}

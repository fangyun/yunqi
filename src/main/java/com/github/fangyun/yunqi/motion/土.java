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
import com.github.fangyun.yunqi.stem.己;
import com.github.fangyun.yunqi.stem.甲;

/**
 * @author FangYun
 *
 */
public class 土 implements 运 {
	private static final 土 INSTANCE = new 土();

	public static 土 getInstance() {
		return INSTANCE;
	}

	public List<干> getStems() {
		return Collections.unmodifiableList(Arrays.asList(甲.getInstance(), 己.getInstance()));
	}
	
	public 干 getStem(度 degree) {
		if (degree.getPolarity() instanceof 阳) {
			return 甲.getInstance();
		} else if (degree.getPolarity() instanceof 阴) {
			return 己.getInstance();
		}
		return null;
	}

	public String getClimate(度 degree) {
		if (degree.getPolarity() instanceof 阳) {
			return "雨湿流行";
		} else if (degree.getPolarity() instanceof 阴) {
			return "风乃大行";
		}
		return null;
	}
}

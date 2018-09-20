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
import com.github.fangyun.yunqi.stem.戊;
import com.github.fangyun.yunqi.stem.癸;

/**
 * @author FangYun
 *
 */
public class 火 implements 运 {
	private final static 火 INSTANCE = new 火();

	public static 火 getInstance() {
		return INSTANCE;
	}
	public List<干> getStems(){
		return Collections.unmodifiableList(Arrays.asList(戊.getInstance(),癸.getInstance()));
	}
	
	public 干 getStem(度 degree) {
		if (degree.getPolarity() instanceof 阳) {
			return 戊.getInstance();
		} else if (degree.getPolarity() instanceof 阴) {
			return 癸.getInstance();
		}
		return null;
	}

	public String getClimate(度 degree) {
		if (degree.getPolarity() instanceof 阳) {
			return "炎暑流行";
		} else if (degree.getPolarity() instanceof 阴) {
			return "寒乃大行";
		}
		return null;
	}
}

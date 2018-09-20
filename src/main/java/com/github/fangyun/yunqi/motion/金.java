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
import com.github.fangyun.yunqi.stem.乙;
import com.github.fangyun.yunqi.stem.庚;

/**
 * @author FangYun
 *
 */
public class 金 implements 运 {
	private final static 金 INSTANCE = new 金();

	public static 金 getInstance() {
		return INSTANCE;
	}
	
	public List<干> getStems(){
		return Collections.unmodifiableList(Arrays.asList(庚.getInstance(),乙.getInstance()));
	}
	
	public 干 getStem(度 degree) {
		if (degree.getPolarity() instanceof 阳) {
			return 庚.getInstance();
		} else if (degree.getPolarity() instanceof 阴) {
			return 乙.getInstance();
		}
		return null;
	}

	public String getClimate(度 degree) {
		if (degree.getPolarity() instanceof 阳) {
			return "燥气流行";
		} else if (degree.getPolarity() instanceof 阴) {
			return "炎火乃行";
		}
		return null;
	}
}

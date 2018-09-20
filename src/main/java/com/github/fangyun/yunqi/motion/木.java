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
import com.github.fangyun.yunqi.stem.丁;
import com.github.fangyun.yunqi.stem.壬;

/**
 * @author FangYun
 *
 */
public class 木 implements 运 {
	private final static 木 INSTANCE = new 木();

	public static 木 getInstance() {
		return INSTANCE;
	}
	
	public List<干> getStems(){
		return Collections.unmodifiableList(Arrays.asList(壬.getInstance(),丁.getInstance()));
	}
	
	public 干 getStem(度 degree) {
		if (degree.getPolarity() instanceof 阳) {
			return 壬.getInstance();
		} else if (degree.getPolarity() instanceof 阴) {
			return 丁.getInstance();
		}
		return null;
	}

	public String getClimate(度 degree) {
		if (degree.getPolarity() instanceof 阳) {
			return "风气流行";
		} else if (degree.getPolarity() instanceof 阴) {
			return "燥乃大行";
		}
		return null;
	}
}

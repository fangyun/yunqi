/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi;

import java.util.List;

/**
 * @author FangYun
 *
 */
public interface 运 {
	default String metaName() {
		return "运";
	}
	
	List<干> getStems();
	
	干 getStem(度 degree);
	
	String getClimate(度 degree);
}

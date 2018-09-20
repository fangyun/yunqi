/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi;

import java.util.List;

import com.github.fangyun.yunqi.polarity.阳;
import com.github.fangyun.yunqi.polarity.阴;

/**
 * @author FangYun
 *
 */
public interface 干 extends 序<干>, 极 {
	default String metaName() {
		return "干";
	}

	default public 极 getPolarity() {
		return getOrder() % 2 == 0 ? 阴.getInstance() : 阳.getInstance();
	}
	
	运 getMotion();
	
	List<支> getBranches();
	
	List<脏腑> getVisceras();
}

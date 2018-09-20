/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.degree;

import com.github.fangyun.yunqi.度;
import com.github.fangyun.yunqi.极;
import com.github.fangyun.yunqi.polarity.阴;

/**
 * @author FangYun
 *
 */
public class 不及 implements 度 {

	@Override
	public 极 getPolarity() {
		return 阴.getInstance();
	}

}

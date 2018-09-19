/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.climate;

import java.util.Arrays;
import java.util.List;

import com.github.fangyun.yunqi.支;
import com.github.fangyun.yunqi.极;
import com.github.fangyun.yunqi.气;
import com.github.fangyun.yunqi.行;
import com.github.fangyun.yunqi.branch.卯;
import com.github.fangyun.yunqi.branch.酉;
import com.github.fangyun.yunqi.element.金;
import com.github.fangyun.yunqi.polarity.阳明;

/**
 * @author FangYun
 *
 */
public class 燥 implements 气 {
	public 行 getElement() {
		return 金.getInstance();
	}
	
	@Override
	public 极 getPolarity() {
		return 阳明.getInstance();
	}
	
	public List<支> getBranches(){
		return Arrays.asList(卯.getInstance(),酉.getInstance());
	}
}

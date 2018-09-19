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
import com.github.fangyun.yunqi.branch.戌;
import com.github.fangyun.yunqi.branch.辰;
import com.github.fangyun.yunqi.element.水;
import com.github.fangyun.yunqi.polarity.太阳;

/**
 * @author FangYun
 *
 */
public class 寒 implements 气 {
	public 行 getElement() {
		return 水.getInstance();
	}
	
	@Override
	public 极 getPolarity() {
		return 太阳.getInstance();
	}
	
	public List<支> getBranches(){
		return Arrays.asList(辰.getInstance(),戌.getInstance());
	}
}

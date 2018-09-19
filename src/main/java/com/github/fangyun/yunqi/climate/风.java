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
import com.github.fangyun.yunqi.branch.亥;
import com.github.fangyun.yunqi.branch.巳;
import com.github.fangyun.yunqi.element.木;
import com.github.fangyun.yunqi.polarity.厥阴;

/**
 * @author FangYun
 *
 */
public class 风 implements 气 {
	public 行 getElement() {
		return 木.getInstance();
	}
	
	@Override
	public 极 getPolarity() {
		return 厥阴.getInstance();
	}
	
	public List<支> getBranches(){
		return Arrays.asList(巳.getInstance(),亥.getInstance());
	}
}

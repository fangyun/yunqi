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
import com.github.fangyun.yunqi.branch.寅;
import com.github.fangyun.yunqi.branch.申;
import com.github.fangyun.yunqi.polarity.少阳;

/**
 * @author FangYun
 *
 */
public class 火 implements 气 {

	public List<String> aliasNames() {
		return Arrays.asList("相火");
	}
	
	public 行 getElement() {
		return com.github.fangyun.yunqi.element.火.getInstance();
	}
	
	@Override
	public 极 getPolarity() {
		return 少阳.getInstance();
	}
	public List<支> getBranches(){
		return Arrays.asList(寅.getInstance(),申.getInstance());
	}
}

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
import com.github.fangyun.yunqi.branch.午;
import com.github.fangyun.yunqi.branch.子;
import com.github.fangyun.yunqi.polarity.少阴;

/**
 * @author FangYun
 *
 */
public class 暑 implements 气 {

	public List<String> aliasNames() {
		return Arrays.asList("热","君火");
	}
	
	public 行 getElement() {
		return com.github.fangyun.yunqi.element.火.getInstance();
	}
	
	@Override
	public 极 getPolarity() {
		return 少阴.getInstance();
	}
	
	public List<支> getBranches(){
		return Arrays.asList(子.getInstance(),午.getInstance());
	}
}

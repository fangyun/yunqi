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
import com.github.fangyun.yunqi.branch.丑;
import com.github.fangyun.yunqi.branch.未;
import com.github.fangyun.yunqi.element.土;
import com.github.fangyun.yunqi.polarity.太阴;

/**
 * @author FangYun
 *
 */
public class 湿 implements 气 {

	public 行 getElement() {
		return 土.getInstance();
	}
	
	@Override
	public 极 getPolarity() {
		return 太阴.getInstance();
	}
	
	public List<支> getBranches(){
		return Arrays.asList(丑.getInstance(),未.getInstance());
	}
}

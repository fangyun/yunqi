/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.season;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.github.fangyun.yunqi.季;
import com.github.fangyun.yunqi.月;
import com.github.fangyun.yunqi.month.七月;
import com.github.fangyun.yunqi.month.九月;
import com.github.fangyun.yunqi.month.八月;

/**
 * @author FangYun
 *
 */
public class 秋 implements 季 {
	private static final 秋 INSTANCE = new 秋();

	public static 秋 getInstance() {
		return INSTANCE;
	}

	@Override
	public int getOrder() {
		return 3;
	}

	@Override
	public List<月> getMonths() {
		return Collections.unmodifiableList(Arrays.asList( 七月.getInstance(), 八月.getInstance(), 九月.getInstance()));
	}
	
	
}

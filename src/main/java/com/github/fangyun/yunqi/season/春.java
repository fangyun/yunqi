/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.season;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.github.fangyun.yunqi.季;
import com.github.fangyun.yunqi.月;
import com.github.fangyun.yunqi.month.一月;
import com.github.fangyun.yunqi.month.三月;
import com.github.fangyun.yunqi.month.二月;

/**
 * @author FangYun
 *
 */
public class 春 implements 季 {

	private static final 春 INSTANCE = new 春();

	public static 春 getInstance() {
		return INSTANCE;
	}

	@Override
	public int getOrder() {
		return 1;
	}

	@Override
	public List<月> getMonths() {
		return Collections.unmodifiableList(Arrays.asList( 一月.getInstance(), 二月.getInstance(), 三月.getInstance()));
	}

}

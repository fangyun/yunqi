/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.season;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.github.fangyun.yunqi.季;
import com.github.fangyun.yunqi.月;
import com.github.fangyun.yunqi.month.十一月;
import com.github.fangyun.yunqi.month.十二月;
import com.github.fangyun.yunqi.month.十月;

/**
 * @author FangYun
 *
 */
public class 冬 implements 季 {
	private static final 冬 INSTANCE = new 冬();

	public static 冬 getInstance() {
		return INSTANCE;
	}

	@Override
	public int getOrder() {
		return 4;
	}

	@Override
	public List<月> getMonths() {
		return Collections.unmodifiableList(Arrays.asList(十月.getInstance(), 十一月.getInstance(), 十二月.getInstance()));
	}

}

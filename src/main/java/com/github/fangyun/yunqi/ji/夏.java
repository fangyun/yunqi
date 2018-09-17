/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.ji;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.github.fangyun.yunqi.季;
import com.github.fangyun.yunqi.月;
import com.github.fangyun.yunqi.yue.五月;
import com.github.fangyun.yunqi.yue.六月;
import com.github.fangyun.yunqi.yue.四月;

/**
 * @author FangYun
 *
 */
public class 夏 implements 季 {
	private static final 夏 INSTANCE = new 夏();

	public static 夏 getInstance() {
		return INSTANCE;
	}

	@Override
	public int getOrder() {
		return 2;
	}

	@Override
	public List<月> getMonths() {
		return Collections.unmodifiableList(Arrays.asList( 四月.getInstance(), 五月.getInstance(), 六月.getInstance()));
	}
}

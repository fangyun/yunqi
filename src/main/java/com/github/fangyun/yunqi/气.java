/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi;

import java.util.List;

/**
 * @author FangYun
 *
 */
public interface 气 {
	default String metaName() {
		return "气";
	}
	
	default List<String> aliasNames()  {
		return null;
	}
	
	行 getElement();
	
	极 getPolarity();
	
	List<支> getBranches();
}

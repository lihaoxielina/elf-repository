package com.lihao.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lihao.mapper.TbItemMapper;
import com.lihao.entity.TbItem;
import com.lihao.entity.TbItemExample;
import com.lihao.entity.TbItemExample.Criteria;
import com.lihao.service.ItemService;

/**
 * 商品管理Service
 * <p>Title: ItemServiceImpl</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.cn</p> 
 * @version 1.0
 */
@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private TbItemMapper itemMapper;
	
	@Override
	public Map getItemById(long itemId) {
		//根据主键查询
		Map map = itemMapper.selectByPrimaryKey(itemId);
//		TbItemExample example = new TbItemExample();
//		Criteria criteria = example.createCriteria();
//		//设置查询条件
//		criteria.andIdEqualTo(itemId);
//		//执行查询
//		List<TbItem> list = itemMapper.selectByExample(example);
//		if (list != null && list.size() > 0) {
//			return list.get(0);
//		}
		return map;
	}

}

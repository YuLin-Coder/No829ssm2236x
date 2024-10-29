package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZaixianxuexiDao;
import com.entity.ZaixianxuexiEntity;
import com.service.ZaixianxuexiService;
import com.entity.vo.ZaixianxuexiVO;
import com.entity.view.ZaixianxuexiView;

@Service("zaixianxuexiService")
public class ZaixianxuexiServiceImpl extends ServiceImpl<ZaixianxuexiDao, ZaixianxuexiEntity> implements ZaixianxuexiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZaixianxuexiEntity> page = this.selectPage(
                new Query<ZaixianxuexiEntity>(params).getPage(),
                new EntityWrapper<ZaixianxuexiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZaixianxuexiEntity> wrapper) {
		  Page<ZaixianxuexiView> page =new Query<ZaixianxuexiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZaixianxuexiVO> selectListVO(Wrapper<ZaixianxuexiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZaixianxuexiVO selectVO(Wrapper<ZaixianxuexiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZaixianxuexiView> selectListView(Wrapper<ZaixianxuexiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZaixianxuexiView selectView(Wrapper<ZaixianxuexiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

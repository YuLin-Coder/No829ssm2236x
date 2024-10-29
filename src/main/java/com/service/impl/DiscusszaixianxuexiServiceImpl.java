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


import com.dao.DiscusszaixianxuexiDao;
import com.entity.DiscusszaixianxuexiEntity;
import com.service.DiscusszaixianxuexiService;
import com.entity.vo.DiscusszaixianxuexiVO;
import com.entity.view.DiscusszaixianxuexiView;

@Service("discusszaixianxuexiService")
public class DiscusszaixianxuexiServiceImpl extends ServiceImpl<DiscusszaixianxuexiDao, DiscusszaixianxuexiEntity> implements DiscusszaixianxuexiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusszaixianxuexiEntity> page = this.selectPage(
                new Query<DiscusszaixianxuexiEntity>(params).getPage(),
                new EntityWrapper<DiscusszaixianxuexiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusszaixianxuexiEntity> wrapper) {
		  Page<DiscusszaixianxuexiView> page =new Query<DiscusszaixianxuexiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusszaixianxuexiVO> selectListVO(Wrapper<DiscusszaixianxuexiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusszaixianxuexiVO selectVO(Wrapper<DiscusszaixianxuexiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusszaixianxuexiView> selectListView(Wrapper<DiscusszaixianxuexiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusszaixianxuexiView selectView(Wrapper<DiscusszaixianxuexiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

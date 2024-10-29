package com.dao;

import com.entity.ZaixianxuexiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZaixianxuexiVO;
import com.entity.view.ZaixianxuexiView;


/**
 * 在线学习
 * 
 * @author 
 * @email 
 * @date 2021-03-22 15:27:19
 */
public interface ZaixianxuexiDao extends BaseMapper<ZaixianxuexiEntity> {
	
	List<ZaixianxuexiVO> selectListVO(@Param("ew") Wrapper<ZaixianxuexiEntity> wrapper);
	
	ZaixianxuexiVO selectVO(@Param("ew") Wrapper<ZaixianxuexiEntity> wrapper);
	
	List<ZaixianxuexiView> selectListView(@Param("ew") Wrapper<ZaixianxuexiEntity> wrapper);

	List<ZaixianxuexiView> selectListView(Pagination page,@Param("ew") Wrapper<ZaixianxuexiEntity> wrapper);
	
	ZaixianxuexiView selectView(@Param("ew") Wrapper<ZaixianxuexiEntity> wrapper);
	
}

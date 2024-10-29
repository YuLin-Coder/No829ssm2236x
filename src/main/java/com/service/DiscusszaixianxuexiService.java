package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusszaixianxuexiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusszaixianxuexiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusszaixianxuexiView;


/**
 * 在线学习评论表
 *
 * @author 
 * @email 
 * @date 2021-03-22 15:27:19
 */
public interface DiscusszaixianxuexiService extends IService<DiscusszaixianxuexiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusszaixianxuexiVO> selectListVO(Wrapper<DiscusszaixianxuexiEntity> wrapper);
   	
   	DiscusszaixianxuexiVO selectVO(@Param("ew") Wrapper<DiscusszaixianxuexiEntity> wrapper);
   	
   	List<DiscusszaixianxuexiView> selectListView(Wrapper<DiscusszaixianxuexiEntity> wrapper);
   	
   	DiscusszaixianxuexiView selectView(@Param("ew") Wrapper<DiscusszaixianxuexiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusszaixianxuexiEntity> wrapper);
   	
}


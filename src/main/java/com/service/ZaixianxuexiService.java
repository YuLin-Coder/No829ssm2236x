package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZaixianxuexiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZaixianxuexiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZaixianxuexiView;


/**
 * 在线学习
 *
 * @author 
 * @email 
 * @date 2021-03-22 15:27:19
 */
public interface ZaixianxuexiService extends IService<ZaixianxuexiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZaixianxuexiVO> selectListVO(Wrapper<ZaixianxuexiEntity> wrapper);
   	
   	ZaixianxuexiVO selectVO(@Param("ew") Wrapper<ZaixianxuexiEntity> wrapper);
   	
   	List<ZaixianxuexiView> selectListView(Wrapper<ZaixianxuexiEntity> wrapper);
   	
   	ZaixianxuexiView selectView(@Param("ew") Wrapper<ZaixianxuexiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZaixianxuexiEntity> wrapper);
   	
}


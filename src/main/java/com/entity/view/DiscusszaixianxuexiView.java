package com.entity.view;

import com.entity.DiscusszaixianxuexiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 在线学习评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-22 15:27:19
 */
@TableName("discusszaixianxuexi")
public class DiscusszaixianxuexiView  extends DiscusszaixianxuexiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusszaixianxuexiView(){
	}
 
 	public DiscusszaixianxuexiView(DiscusszaixianxuexiEntity discusszaixianxuexiEntity){
 	try {
			BeanUtils.copyProperties(this, discusszaixianxuexiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

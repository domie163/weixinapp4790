package com.dao;

import com.entity.HesuanbaogaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HesuanbaogaoVO;
import com.entity.view.HesuanbaogaoView;


/**
 * 核酸报告
 * 
 * @author 
 * @email 
 * @date 2022-01-21 11:08:11
 */
public interface HesuanbaogaoDao extends BaseMapper<HesuanbaogaoEntity> {
	
	List<HesuanbaogaoVO> selectListVO(@Param("ew") Wrapper<HesuanbaogaoEntity> wrapper);
	
	HesuanbaogaoVO selectVO(@Param("ew") Wrapper<HesuanbaogaoEntity> wrapper);
	
	List<HesuanbaogaoView> selectListView(@Param("ew") Wrapper<HesuanbaogaoEntity> wrapper);

	List<HesuanbaogaoView> selectListView(Pagination page,@Param("ew") Wrapper<HesuanbaogaoEntity> wrapper);
	
	HesuanbaogaoView selectView(@Param("ew") Wrapper<HesuanbaogaoEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<HesuanbaogaoEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<HesuanbaogaoEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<HesuanbaogaoEntity> wrapper);
}

package com.entity.model;

import com.entity.YiyuanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 医院信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-01-21 11:08:10
 */
public class YiyuanxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 医院名称
	 */
	
	private String yiyuanmingcheng;
		
	/**
	 * 医院地址
	 */
	
	private String yiyuandizhi;
		
	/**
	 * 医院等级
	 */
	
	private String yiyuandengji;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
				
	
	/**
	 * 设置：医院名称
	 */
	 
	public void setYiyuanmingcheng(String yiyuanmingcheng) {
		this.yiyuanmingcheng = yiyuanmingcheng;
	}
	
	/**
	 * 获取：医院名称
	 */
	public String getYiyuanmingcheng() {
		return yiyuanmingcheng;
	}
				
	
	/**
	 * 设置：医院地址
	 */
	 
	public void setYiyuandizhi(String yiyuandizhi) {
		this.yiyuandizhi = yiyuandizhi;
	}
	
	/**
	 * 获取：医院地址
	 */
	public String getYiyuandizhi() {
		return yiyuandizhi;
	}
				
	
	/**
	 * 设置：医院等级
	 */
	 
	public void setYiyuandengji(String yiyuandengji) {
		this.yiyuandengji = yiyuandengji;
	}
	
	/**
	 * 获取：医院等级
	 */
	public String getYiyuandengji() {
		return yiyuandengji;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
			
}

package com.entity.vo;

import com.entity.HesuanjianceEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 核酸检测
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-01-21 11:08:10
 */
public class HesuanjianceVO  implements Serializable {
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
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 检测方式
	 */
	
	private String jiancefangshi;
		
	/**
	 * 检测日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jianceriqi;
		
	/**
	 * 号数
	 */
	
	private Integer haoshu;
		
	/**
	 * 检测费用
	 */
	
	private Integer jiancefeiyong;
				
	
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
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：检测方式
	 */
	 
	public void setJiancefangshi(String jiancefangshi) {
		this.jiancefangshi = jiancefangshi;
	}
	
	/**
	 * 获取：检测方式
	 */
	public String getJiancefangshi() {
		return jiancefangshi;
	}
				
	
	/**
	 * 设置：检测日期
	 */
	 
	public void setJianceriqi(Date jianceriqi) {
		this.jianceriqi = jianceriqi;
	}
	
	/**
	 * 获取：检测日期
	 */
	public Date getJianceriqi() {
		return jianceriqi;
	}
				
	
	/**
	 * 设置：号数
	 */
	 
	public void setHaoshu(Integer haoshu) {
		this.haoshu = haoshu;
	}
	
	/**
	 * 获取：号数
	 */
	public Integer getHaoshu() {
		return haoshu;
	}
				
	
	/**
	 * 设置：检测费用
	 */
	 
	public void setJiancefeiyong(Integer jiancefeiyong) {
		this.jiancefeiyong = jiancefeiyong;
	}
	
	/**
	 * 获取：检测费用
	 */
	public Integer getJiancefeiyong() {
		return jiancefeiyong;
	}
			
}

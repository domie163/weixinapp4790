package com.entity.vo;

import com.entity.HesuanbaogaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 核酸报告
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-01-21 11:08:11
 */
public class HesuanbaogaoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 医院名称
	 */
	
	private String yiyuanmingcheng;
		
	/**
	 * 检测方式
	 */
	
	private String jiancefangshi;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 检测日期
	 */
	
	private String jianceriqi;
		
	/**
	 * 核酸报告
	 */
	
	private String hesuanbaogao;
		
	/**
	 * 核酸结果
	 */
	
	private String hesuanjieguo;
		
	/**
	 * 登记时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjishijian;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 跨表用户id
	 */
	
	private Long crossuserid;
		
	/**
	 * 跨表主键id
	 */
	
	private Long crossrefid;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
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
	 * 设置：检测日期
	 */
	 
	public void setJianceriqi(String jianceriqi) {
		this.jianceriqi = jianceriqi;
	}
	
	/**
	 * 获取：检测日期
	 */
	public String getJianceriqi() {
		return jianceriqi;
	}
				
	
	/**
	 * 设置：核酸报告
	 */
	 
	public void setHesuanbaogao(String hesuanbaogao) {
		this.hesuanbaogao = hesuanbaogao;
	}
	
	/**
	 * 获取：核酸报告
	 */
	public String getHesuanbaogao() {
		return hesuanbaogao;
	}
				
	
	/**
	 * 设置：核酸结果
	 */
	 
	public void setHesuanjieguo(String hesuanjieguo) {
		this.hesuanjieguo = hesuanjieguo;
	}
	
	/**
	 * 获取：核酸结果
	 */
	public String getHesuanjieguo() {
		return hesuanjieguo;
	}
				
	
	/**
	 * 设置：登记时间
	 */
	 
	public void setDengjishijian(Date dengjishijian) {
		this.dengjishijian = dengjishijian;
	}
	
	/**
	 * 获取：登记时间
	 */
	public Date getDengjishijian() {
		return dengjishijian;
	}
				
	
	/**
	 * 设置：用户名
	 */
	 
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：跨表用户id
	 */
	 
	public void setCrossuserid(Long crossuserid) {
		this.crossuserid = crossuserid;
	}
	
	/**
	 * 获取：跨表用户id
	 */
	public Long getCrossuserid() {
		return crossuserid;
	}
				
	
	/**
	 * 设置：跨表主键id
	 */
	 
	public void setCrossrefid(Long crossrefid) {
		this.crossrefid = crossrefid;
	}
	
	/**
	 * 获取：跨表主键id
	 */
	public Long getCrossrefid() {
		return crossrefid;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}

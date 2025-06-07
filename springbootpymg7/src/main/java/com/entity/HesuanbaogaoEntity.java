package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 核酸报告
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-01-21 11:08:11
 */
@TableName("hesuanbaogao")
public class HesuanbaogaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HesuanbaogaoEntity() {
		
	}
	
	public HesuanbaogaoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 医院编号
	 */
					
	private String yiyuanbianhao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：医院编号
	 */
	public void setYiyuanbianhao(String yiyuanbianhao) {
		this.yiyuanbianhao = yiyuanbianhao;
	}
	/**
	 * 获取：医院编号
	 */
	public String getYiyuanbianhao() {
		return yiyuanbianhao;
	}
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

package com.yz.service;

import java.util.List;

import com.yz.model.Daymanage;

public interface IDaymanageService {

	// 添加对象
	public abstract void add(Daymanage daymanage) throws Exception;

	// 删除对象
	public abstract void delete(Daymanage daymanage);

	// 删除某个id的对象
	public abstract void deleteById(int id);

	// 修改对象
	public abstract void update(Daymanage daymanage);

	// 获取所有对象
	public abstract List<Daymanage> getDaymanages();

	// 加载一个id的对象
	public abstract Daymanage loadById(int id);

	// 后台管理-页数获取
	public abstract int getPageCount(int totalCount, int size);

	// 后台管理-获取总记录数
	public abstract int getTotalCount(int con, String convalue,
			Daymanage daymanage);

	// 后台管理-获取符合条件的记录
	public abstract List<Daymanage> queryList(int con, String convalue,
			Daymanage daymanage, int page, int size);

	public abstract Daymanage getDaymanageByDaymanagename(String daymanagename);

}
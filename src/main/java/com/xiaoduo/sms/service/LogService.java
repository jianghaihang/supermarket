package com.xiaoduo.sms.service;

import java.util.List;

import com.xiaoduo.sms.entity.Log;
import org.springframework.stereotype.Component;

/**
 * 系统日志Service接口
 */
@Component("logService")
public interface LogService {


	
	/**
	 * 修改或者修改日志信息
	 * @param log
	 */
	public void save(Log log);
	
	/**
	 * 根据条件分页查询日志信息
	 * @param log
	 * @param page
	 * @param pageSize
	 * @param direction
	 * @param properties
	 * @return
	 */
//	public List<Log> list(Log log, Integer page, Integer pageSize, Direction direction, String... properties);
	
	/**
	 * 获取总记录数
//	 * @param user
	 * @return
	 */
	public Long getCount(Log log);

}

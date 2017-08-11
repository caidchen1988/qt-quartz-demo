package com.qtbdp.quartz.demo.service;


import com.github.pagehelper.PageInfo;
import com.qtbdp.quartz.demo.entity.JobAndTrigger;

public interface IJobAndTriggerService {
	public PageInfo<JobAndTrigger> getJobAndTriggerDetails(int pageNum, int pageSize);
}

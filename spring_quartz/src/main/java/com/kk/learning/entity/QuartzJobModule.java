package com.kk.learning.entity;

import java.util.Date;

import lombok.Data;
import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.springframework.util.ClassUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

/**
 * @description: 定时任务实体类
 * @author: Kk
 * @create: 2020-12-13 17:32
 **/
@Data
public class QuartzJobModule {
    /**
     * 触发器开始时间
     */
    private Date startTime;
    /**
     * 触发器结束时间
     */
    private Date endTime;
    /**
     * job名称
     */
    private String jobName;
    /**
     * job组名
     */
    private String jobGroupName;
    /**
     * 定时器名称
     */
    private String triggerName;
    /**
     * 定时器组名
     */
    private String triggerGroupName;
    /**
     * 执行定时任务的具体操作
     */
    private Class jobClass;
    /**
     * cron表达式
     */
    private String cron;
    /**
     * job的附加信息 MAP存储结构
     */
    private JobDataMap jobDataMap = new JobDataMap();

    /**
     * 校验
     * @return
     */
    public boolean verify(){
        return !(StringUtils.isEmpty(jobName)
                || StringUtils.isEmpty(jobGroupName)
                || StringUtils.isEmpty(triggerName)
                || StringUtils.isEmpty(triggerGroupName)
                || StringUtils.isEmpty(cron)
//        || CollectionUtils.isEmpty(jobDataMap)
                || ObjectUtils.isEmpty(startTime)
                || ObjectUtils.isEmpty(endTime)
                || !ClassUtils.hasMethod(Job.class, "execute", JobExecutionContext.class)
        );
    }
}

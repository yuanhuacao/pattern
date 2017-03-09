package com.houbank.quartz;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.time.LocalDate;
import java.util.Date;

/**
 * Created by Administrator on 2017/3/9.
 */
public class SimpleQuartzJob implements Job {

    // 1、作业通过实现 org.quartz.job 接口，可以使 Java 类变成可执行的。这个类用一条非常简单的输出语句覆盖了
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("In SimpleQuartzJob - excuting its JOB at"+LocalDate.now()+"by "+ jobExecutionContext.getTrigger());
    }
    //2. 触发器和调度器

    public void task() throws SchedulerException {
        // 通过 StdSchedulerFactory 来引进一个调度器
        Scheduler scheduler= StdSchedulerFactory.getDefaultScheduler();
        scheduler.start();

        //引进作业程序
        JobDetail jobDetail = JobBuilder.newJob(SimpleQuartzJob.class)
            .withIdentity("jobDetailGroup-s1", Scheduler.DEFAULT_GROUP).storeDurably(true).build();
        // new 一个触发器

        // 创建Trigger 触发器
        Trigger trigger = TriggerBuilder.newTrigger().forJob(jobDetail)
            .withIdentity("jobDetailGroup-s1", Scheduler.DEFAULT_GROUP)
            .startAt(new Date())
            .withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInMilliseconds(30*1000).repeatForever()).build();
        scheduler.addJob(jobDetail,false);
        //作业和触发器设置到调度器中
        scheduler.scheduleJob(trigger);



    }

    public static void main(String[] args) throws SchedulerException {
        SimpleQuartzJob simpleQuartzJob=new SimpleQuartzJob();
        simpleQuartzJob.task();
    }


}

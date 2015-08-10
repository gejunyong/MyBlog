package cn.gejunyong.blog.web;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class AutoDealTask {
	
    @Scheduled(cron="0/5 * *  * * ? ")   //每5秒执行一次    
	public void autoDeal(){
  
		System.out.println("自动执行任务："+new Date());
	}

}

package com.epam.edu.student;

import org.springframework.context.annotation.Configuration;


@Configuration
//@ComponentScan("com.epam.edu.student")
public class SpringBatchAdmin {
//	extends SpringBootServletInitializer {
//
//
//	public static void main(String[] args) {
//		SpringApplication.run(SpringBatchAdmin.class, args);
//
//		//SpringBatchAdmin s = new SpringBatchAdmin();
//		//s.doJob();
//
//	}
//
////	private void doJob() {
////		ApplicationContext  ctx = new AnnotationConfigApplicationContext(SpringBatchAdmin.class);
////		JobLauncher jobLauncher = ctx.getBean(JobLauncher.class);
////		Job restTemplateJob = (Job) ctx.getBean("restTemplateJob");
////		JobParameters params = new JobParametersBuilder()
////				.addLong("time", System.currentTimeMillis())
////				.addLong("alertTypeId", (long) 2)
////				.addLong("alertCount", (long) 3).toJobParameters();
////		try {
////			jobLauncher.run(restTemplateJob, params);
////		} catch (JobExecutionAlreadyRunningException | JobRestartException
////				| JobInstanceAlreadyCompleteException
////				| JobParametersInvalidException e) {
////
////		}
////	}
//
//	@Override
//	protected SpringApplicationBuilder configure(
//			SpringApplicationBuilder application) {
//		return application.sources(SpringBatchAdmin.class);
//	}

}
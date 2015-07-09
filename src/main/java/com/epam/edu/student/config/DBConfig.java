package com.epam.edu.student.config;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.init.DatabasePopulatorUtils;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;

@Configuration
public class DBConfig {
	//private static final Logger LOG = Logger.getLogger(DBConfig.class);

	//@Autowired
	//private Environment env;
	
	@Value("classpath:org/springframework/batch/core/schema-drop-mysql.sql")
	private Resource dropScript;

	@Value("classpath:org/springframework/batch/core/schema-mysql.sql")
	private Resource createScript;

	@PostConstruct
	protected void initialize() {
		ResourceDatabasePopulator populator = new ResourceDatabasePopulator();
		populator.addScript(dropScript);
		populator.addScript(createScript);
		populator.setContinueOnError(true);

		DatabasePopulatorUtils.execute(populator, dataSource());
	}
	
	@Bean (name = "myDataSource")
	public DataSource dataSource() {
		//what is the differnce?
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		//BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");//env.getProperty("DriverClassName"));
		dataSource.setUrl("jdbc:mysql://localhost:3306/batchsql");//env.getProperty("Url"));
		dataSource.setUsername("root");//env.getProperty("Username"));
		dataSource.setPassword("");//env.getProperty("Password"));
		return dataSource;
	}

	
}

//package com.movieticket.cloudConfig;
//
//import javax.sql.DataSource;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.cloud.config.java.AbstractCloudConfig;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.context.annotation.Profile;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//
//import com.zaxxer.hikari.HikariDataSource;
//
//@Configuration
//@Profile("cloud")
//public class CloudDatabaseConfig extends AbstractCloudConfig {
//	
//	@Bean
//	@Primary
//	public DataSource dataSource(
//			@Value("${vcap.services.movie.credentials.url}")final String url,
//			@Value("${vcap.services.movie.credentials.user}")final String user,
//			@Value("${vcap.services.movie.credentials.password}")final String password
//			) {
//		return DataSourceBuilder.create()
//				.type(HikariDataSource.class)
//				.driverClassName(com.sap.db.jdbc.Driver.class.getName())
//				.url(url)
//				.username(user)
//				.password(password)
//				.build();
//	}
////	
//////	//@Value("${db.driver}")
//////		private String DRIVER="com.sap.db.jdbc.Driver";
//////	 
//////		//@Value("${db.password}")
//////		private String PASSWORD="Ny0k3DJdZKQurHM4DmJOvpK8AMtRgFrogjhRXHHJxcb1h3WMJ0QG5IUq_973IoVa-mDbqGWygRy7N2WVQ.ndy587gZsmr5HBojh80o.gxriRGFDO9WWyxUlrm1AQTZpZ";
//////		
//////	 
//////		//@Value("${db.url}")
//////		private String URL="jdbc:sap://zeus.hana.prod.eu-central-1.whitney.dbaas.ondemand.com:23803?encrypt=true&validateCertificate=true&currentschema=USR_1ACNSHVB0QQA51XLHCOS9JCYW";
//////	 
//////		//@Value("${db.username}")
//////		private String USERNAME="USR_1ACNSHVB0QQA51XLHCOS9JCYW";
//////	 
////////		//@Value("${hibernate.dialect}")
////////		private String DIALECT="org.hibernate.dialect.HANAColumnStoreDialect";
////////	 
////////		//@Value("${hibernate.show_sql}")
////////		private String SHOW_SQL="false";
////////	 
////////		//@Value("${hibernate.hbm2ddl.auto}")
////////		private String HBM2DDL_AUTO="update";
////////	 
////////		//@Value("${entitymanager.packagesToScan}")
////////		private String PACKAGES_TO_SCAN="oneapp.incture.workbox.demo";
////// 
//////	@Bean
//////	public DataSource dataSource() {
//////		DriverManagerDataSource dataSource = new DriverManagerDataSource();
//////		dataSource.setDriverClassName(DRIVER);
//////		dataSource.setUrl(URL);
//////		dataSource.setUsername(USERNAME);
//////		dataSource.setPassword(PASSWORD);
//////		return dataSource;
//	//}
//}
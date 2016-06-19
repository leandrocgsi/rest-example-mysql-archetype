#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class DatabaseConfig {
	
    @Value("${symbol_dollar}{dataSource.driverClassName}")
    private String driver;
    @Value("${symbol_dollar}{dataSource.url}")
    private String url;
    @Value("${symbol_dollar}{dataSource.username}")
    private String username;
    @Value("${symbol_dollar}{dataSource.password}")
    private String password;
    @Value("${symbol_dollar}{hibernate.dialect}")
    private String dialect;
    @Value("${symbol_dollar}{hibernate.hbm2ddl.auto}")
    private String hbm2ddlAuto;
    @Value("${symbol_dollar}{hibernate.show_sql}")
    private String show_sql;
    @Value("${symbol_dollar}{hibernate.format_sql}")
    private String format_sql;
    @Value("${symbol_dollar}{entitymanager.packagesToScan}")
    private String entitymanagerPackagesToScan;

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(driver);
		dataSource.setUrl(url);
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		return dataSource;
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();

		entityManagerFactoryBean.setDataSource(dataSource);

		entityManagerFactoryBean.setPackagesToScan(entitymanagerPackagesToScan);
		entityManagerFactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		Properties jpaProperties = new Properties();
		jpaProperties.put(org.hibernate.cfg.Environment.DIALECT, dialect);
		jpaProperties.put(org.hibernate.cfg.Environment.SHOW_SQL, show_sql);
		jpaProperties.put(org.hibernate.cfg.Environment.HBM2DDL_AUTO, hbm2ddlAuto);
		jpaProperties.put(org.hibernate.cfg.Environment.FORMAT_SQL, format_sql);
		entityManagerFactoryBean.setJpaProperties(jpaProperties);
		
		return entityManagerFactoryBean;
	}
	
	@Bean
	public JpaTransactionManager transactionManager() {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entityManagerFactory.getObject());
		return transactionManager;
	}
	
	@Bean
	public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
		return new PersistenceExceptionTranslationPostProcessor();
	}

	@Autowired
	private DataSource dataSource;

	@Autowired
	private LocalContainerEntityManagerFactoryBean entityManagerFactory;
	

}
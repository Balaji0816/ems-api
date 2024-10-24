package com.example.ems.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

public class DatabaseConfig {
    /*@Bean(name = "serversEntityManager")
    public LocalContainerEntityManagerFactoryBean getServersEntityManager(EntityManagerFactoryBuilder builder,
                                                                          @Qualifier("serversDataSource") DataSource serversDataSource){


        return builder
                .dataSource(serversDataSource)
                .packages("org.springdemo.multiple.datasources.domain.servers")
                .persistenceUnit("servers")
                .properties(additionalJpaProperties())
                .build();

    }

    Map<String,?> additionalJpaProperties(){
        Map<String,String> map = new HashMap<>();

        map.put("hibernate.hbm2ddl.auto", "create");
        map.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
        map.put("hibernate.show_sql", "true");

        return map;
    }


    @Bean("serversDataSourceProperties")
    @Primary
    @ConfigurationProperties("app.datasource.servers")
    public DataSourceProperties serversDataSourceProperties(){
        return new DataSourceProperties();
    }



    @Bean("serversDataSource")
    @Primary
    @ConfigurationProperties("app.datasource.servers")
    public DataSource serversDataSource(@Qualifier("serversDataSourceProperties") DataSourceProperties serversDataSourceProperties) {
        return serversDataSourceProperties().initializeDataSourceBuilder().build();
    }

    @Bean(name = "serversTransactionManager")
    public JpaTransactionManager transactionManager(@Qualifier("serversEntityManager") EntityManagerFactory serversEntityManager){
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(serversEntityManager);

        return transactionManager;
    }*/
}

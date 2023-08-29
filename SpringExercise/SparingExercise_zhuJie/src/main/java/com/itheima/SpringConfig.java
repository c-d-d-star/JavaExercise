package com.itheima;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@ComponentScan("com.itheima")
@Configuration
public class SpringConfig {
    @Bean
    public DataSource dataSource(){
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/spring_db");
        ds.setUsername("root");
        ds.setPassword("root");
        return ds;
    }
}



// 怎么让Spring知道自己的扫描的包在哪里
// 各个业务开展的不一样，那么所用到的注解也是各不相同的记住@Component、@Controller、@Service、@Repository这四个注解
// 配置类里面返回第三方的对象的管理

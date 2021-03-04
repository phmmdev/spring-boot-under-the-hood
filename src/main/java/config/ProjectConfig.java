package config;

import beans.Dog;
import beans.MyBean;
import beans.Owner;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"services", "repositories", "beans"})
public class ProjectConfig
{


    // -- Manual way to put beans in context
    /*@Bean("method1")
    // @Primary can be used if ''name'' has not been defined
    public MyBean getMyBean1()
    {
        MyBean myBean =  new MyBean();
        myBean.setText(" >> Hello from Method 1");
        return myBean;
    }

    @Bean("method2")
    public MyBean getMyBean2()
    {
        MyBean myBean =  new MyBean();
        myBean.setText(" >> Hello from Method 2");
        return myBean;
    }*/

   /* @Bean
    public Dog dog()
    {
        Dog dog =  new Dog();
        dog.setName("Mike");
        return dog;
    }

    @Bean
    public Owner owner()
    {
        Owner owner = new Owner();
        owner.setDog(dog());
        return owner;
    }*/

    @Bean
    @Qualifier("dog1")
    public Dog dog1()
    {
        Dog dog =  new Dog();
        dog.setName("Mike");
        return dog;
    }

    @Bean
    @Qualifier("dog2")
    public Dog dog2()
    {
        Dog dog =  new Dog();
        dog.setName("Marco");
        return dog;
    }

    @Bean
    public DataSource dataSource()
    {
        var dataSource =  new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost/demo");
        dataSource.setUsername("phmm");
        dataSource.setPassword("phmm");
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate()
    {
        return new JdbcTemplate(dataSource());
    }
}

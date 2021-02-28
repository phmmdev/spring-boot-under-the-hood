package config;

import beans.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = {"services", "repositories"})
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
}

package main;

import beans.Dog;
import beans.MyBean;
import beans.Owner;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.ProductService;

public class Main
{
    public static void main(String[] args)
    {
        try(var context = new AnnotationConfigApplicationContext(ProjectConfig.class))
        {

            //first way to get beans from context
            /*MyBean myBean1 = context.getBean("method1", MyBean.class);
            MyBean myBean2 = context.getBean("method2", MyBean.class);

            System.out.println("Text from Bean Method 1 "+ myBean1.getText());
            System.out.println("Text from Bean Method 2 "+ myBean2.getText());*/


            /*MyBean myBean1 = context.getBean(MyBean.class);
            MyBean myBean2 = context.getBean(MyBean.class);

            System.out.println("Text from Bean Method 1 "+ myBean1.getText());
            System.out.println("Text from Bean Method 2 "+ myBean2.getText());*/

           /* ProductService productService =  context.getBean(ProductService.class);

            productService.addProduct();
            productService.addProduct();*/


            /*Dog dog =  context.getBean(Dog.class);
            dog.setName("Marco");*/


            Owner owner = context.getBean(Owner.class);
            System.out.println(owner);
        }
    }

}

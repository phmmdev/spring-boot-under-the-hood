package main;

import beans.Dog;
import beans.MyBean;
import beans.Owner;
import config.ProjectConfig;
import model.Product;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import repositories.ProductRepository;
import services.ProductService;

import java.util.List;

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


           /* Owner owner = context.getBean(Owner.class);
            System.out.println(owner);*/

            ProductRepository productRepository = context.getBean(ProductRepository.class);

           /* Product product =  new Product(0, "product1", 10.00);
            productRepository.addProduct(product);
            */

            List<Product> productList =  productRepository.getProducts();
            productList.forEach(System.out::println);
        }
    }

}

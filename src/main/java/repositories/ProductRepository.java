package repositories;

import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository
{
    public void addProduct()
    {
        System.out.println("one product was added");
    }
}

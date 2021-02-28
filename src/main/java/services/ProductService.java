package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.ProductRepository;

@Service
public class ProductService
{
    /* -- field autowired way
    @Autowired
    private ProductRepository productRepository;*/

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository)
    {
        this.productRepository = productRepository;
    }

    public void addProduct()
    {
        productRepository.addProduct();
    }
}

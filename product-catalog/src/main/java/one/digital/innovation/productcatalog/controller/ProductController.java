package one.digital.innovation.productcatalog.controller;

import one.digital.innovation.productcatalog.model.Product;
import one.digital.innovation.productcatalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;
@RestController
@RequestMapping(value = "/product")
public class ProductController {

    private ProductRepository productRepository;

    @Autowired
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @RequestMapping(method = RequestMethod.POST)
    public Product create(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<Product> findById(@PathVariable Integer id) {
        return productRepository.findById(id);
    }
}

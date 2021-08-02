package one.digital.innovation.productcatalog.repository;

import one.digital.innovation.productcatalog.model.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
//import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends ElasticsearchRepository<Product, Integer> {
}

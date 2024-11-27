package iuh.fit.se.service;

import java.util.List;

import org.springframework.stereotype.Service;

import iuh.fit.se.domain.Product;
import iuh.fit.se.repository.ProductRepository;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product createProduct(Product pr) {
        return this.productRepository.save(pr);
    }

    public List<Product> fetchProducts() {
        return this.productRepository.findAll();
    }
}
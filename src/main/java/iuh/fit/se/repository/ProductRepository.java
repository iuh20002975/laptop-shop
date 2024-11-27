package iuh.fit.se.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import iuh.fit.se.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
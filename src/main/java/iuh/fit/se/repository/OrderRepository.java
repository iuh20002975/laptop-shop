package iuh.fit.se.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import iuh.fit.se.domain.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
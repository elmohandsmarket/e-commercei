package com.moaaz.modernhome.Order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order , Long> {

    @Query(value="SELECT o FROM  Order o  WHERE o.creationDate>= :fromDate AND o.creationDate<= :toDate AND o.status= :orderStatus" )
    List<Order> getAllOrdersFromDateToDateWithStatus(LocalDate fromDate, LocalDate toDate, OrderStatus orderStatus);
}

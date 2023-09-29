package com.moaaz.modernhome.Order;

import com.moaaz.modernhome.Cart.ProductCart;
import com.moaaz.modernhome.User.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "user_order")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToMany(cascade = {CascadeType.DETACH , CascadeType.MERGE , CascadeType.PERSIST , CascadeType.REFRESH })
    private List<ProductCart> productCarts;

    private LocalDate creationDate;


    @ManyToOne
    private User user;

    private double total;


    @Enumerated(EnumType.STRING)
    private OrderStatus status;


//    public static Order convertOrderRequestToOrder(OrderRequest orderRequest){
//        Order newOrder = new Order();
//        newOrder.setId(orderRequest.getId());
//        newOrder.setProductCarts(orderRequest.getProductCarts());
//        newOrder.
//    }
}

package com.moaaz.modernhome.Order;

import com.moaaz.modernhome.Cart.ProductCart;
import com.moaaz.modernhome.User.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class OrderRequest {

    private long id;

    private List<ProductCart>productCarts;

    private

}

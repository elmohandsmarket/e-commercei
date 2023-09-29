package com.moaaz.modernhome.User;

import com.moaaz.modernhome.Cart.CartResponse;

import com.moaaz.modernhome.Order.OrderResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {
    private long id;
    private String name;

    private String email;
    private String phone1;
    private String phone2;
    private String address;
    private String city;
    private String password;

    private Role role;

    private CartResponse cartResponse;

    private List<OrderResponse> orders;


    public static UserResponse convertUserToUserResponse(User user) {

        if(user.getOrders()==null)
            user.setOrders(new ArrayList<>());
        return UserResponse.
                builder()
                .id(user.getId())
                .name(user.getName())
                .email(user.getEmail())
                .password(user.getPassword())
                .phone1(user.getPhone1())
                .phone2(user.getPhone2())
                .role(user.getRole())
                .address(user.getAddress())
                .city(user.getCity())
                .cartResponse(CartResponse.convertCartToCartResponse(user.getCart()))
                .orders(user.getOrders().stream().map(OrderResponse::convertOrderToOrderResponse).toList())
                .build();
    }

}

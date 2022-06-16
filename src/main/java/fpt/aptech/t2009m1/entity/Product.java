package fpt.aptech.t2009m1.entity;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Builder
@AllArgsConstructor
public class Product {

    private  int id;
    private String name; // điều hoà nhiệt độ u2022
    private String slug; // dieu-hoa-nhiet-do-u2022 ->http://localhost.com/product/detail/dieu-hoa-nhiet-do-u2022-1
    private String thumbnail;
    private double price;
    private String description;
    private int status;
}

package fpt.aptech.t2009m1.entity;

import com.mysql.cj.protocol.ColumnDefinition;
import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Builder
@AllArgsConstructor
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private  int id;
    private String name; // điều hoà nhiệt độ u2022
    private String slug; // dieu-hoa-nhiet-do-u2022 ->http://localhost.com/product/detail/dieu-hoa-nhiet-do-u2022-1
    private String thumbnail;
    private double price;
//    @Column(ColumnDefinition = "Text")
    private String description;
    private int status;

}

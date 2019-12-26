package geektime.spring.springbucks.jpademo.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "T_ORDER")
@Data
/** 这里需要注意加上 callSuper = true 使其可以调用父类的 ToString 一起来打印 */
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CoffeeOrder extends BaseEntity implements Serializable {

    private String customer;

    @ManyToMany
    @JoinTable(name = "T_ORDER_COFFEE")
    @OrderBy("id")
    private List<Coffee> items;

    /**
     * 订单状态
     * 使用枚举做一个映射
     */
    @Enumerated
    @Column(nullable = false)
    private OrderState state;

}

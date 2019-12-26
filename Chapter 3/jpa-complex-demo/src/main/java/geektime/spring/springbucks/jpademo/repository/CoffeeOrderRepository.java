package geektime.spring.springbucks.jpademo.repository;

import geektime.spring.springbucks.jpademo.model.CoffeeOrder;

import java.util.List;

public interface CoffeeOrderRepository extends BaseRepository<CoffeeOrder, Long> {

    List<CoffeeOrder> findByCustomerOrderById(String customer);

    /**
     * 按咖啡的名字来做查找
     *
     * @param name
     * @return
     */
    List<CoffeeOrder> findByItems_Name(String name);

}

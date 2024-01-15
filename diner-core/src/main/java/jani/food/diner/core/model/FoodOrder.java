package jani.food.diner.core.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Set;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class FoodOrder extends BaseEntity{

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "dish_food_order",
        joinColumns = @JoinColumn(name = "food_order_id"),
        inverseJoinColumns = @JoinColumn(name = "dish_id"))
    private  Set<Dish> dishes;

    @OneToOne
    private Customer customer;

    @OneToOne
    private Waiter waiter;
    private int totalBill;

}

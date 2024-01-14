package jani.food.diner.core.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Set;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class Order extends BaseEntity{

    @OneToMany
    private  Set<Dish> dishes;

    @OneToOne
    private Customer customer;

    @OneToOne
    private Waiter waiter;
    private int totalBill;

}

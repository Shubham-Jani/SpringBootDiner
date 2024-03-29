package jani.food.diner.core.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Dish extends  BaseEntity{
    private String name;

    @Lob
    private String description;
    @ManyToOne
    private DishType dishType;
    private Integer price;

    @Lob
    private Byte[] image;

    @ManyToMany(mappedBy = "dishes")
    private Set<FoodOrder> foodOrders;

}

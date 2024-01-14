package jani.food.diner.core.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
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
public class DishType extends  BaseEntity {
    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dishType")
    private Set<Dish> dishes;
}

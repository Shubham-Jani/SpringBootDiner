package jani.food.diner.core.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class Person extends BaseEntity{
    private  String firstName;
    private  String lastName;
}

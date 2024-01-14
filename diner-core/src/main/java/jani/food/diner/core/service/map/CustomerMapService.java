package jani.food.diner.core.service.map;

import jani.food.diner.core.model.Customer;
import jani.food.diner.core.service.CustomerService;
import org.springframework.stereotype.Service;

@Service
public class CustomerMapService extends AbstractMapService<Customer,Long> implements CustomerService {
}

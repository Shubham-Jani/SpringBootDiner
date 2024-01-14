package jani.food.diner.core.service.map;

import jani.food.diner.core.model.Employee;
import jani.food.diner.core.service.EmployeeService;
import org.springframework.stereotype.Service;


@Service
public class EmployeeMapService extends AbstractMapService<Employee,Long> implements EmployeeService {
}

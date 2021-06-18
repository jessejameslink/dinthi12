package CaseStudy.Models.EmployeeModels;

import CaseStudy.Models.EmployeeModels.Employee;

import java.util.List;
import java.util.Map;

public class SaleMarketing {
Map<String,Employee> numberEmployee;

    public SaleMarketing() {
    }

    public SaleMarketing(Map<String, Employee> numberEmployee) {
        this.numberEmployee = numberEmployee;
    }

    public Map<String, Employee> getNumberEmployee() {
        return numberEmployee;
    }

    public void setNumberEmployee(Map<String, Employee> numberEmployee) {
        this.numberEmployee = numberEmployee;
    }
}

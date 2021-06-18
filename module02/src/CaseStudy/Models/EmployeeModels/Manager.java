package CaseStudy.Models.EmployeeModels;

import CaseStudy.Models.EmployeeModels.Employee;

import java.util.Map;

public class Manager {
    Map<String, Employee> numberEmployee;

    public Manager(Map<String, Employee> numberEmployee) {
        this.numberEmployee = numberEmployee;
    }

    public Map<String, Employee> getNumberEmployee() {
        return numberEmployee;
    }

    public void setNumberEmployee(Map<String, Employee> numberEmployee) {
        this.numberEmployee = numberEmployee;
    }
}

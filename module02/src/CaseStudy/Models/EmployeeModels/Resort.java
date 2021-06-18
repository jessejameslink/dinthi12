package CaseStudy.Models.EmployeeModels;

import java.util.List;

public class Resort {
    List<SaleMarketing> saleMarketings;
    List<Manager> managers;

    public Resort() {
    }

    public Resort(List<SaleMarketing> saleMarketings, List<Manager> managers) {
        this.saleMarketings = saleMarketings;
        this.managers = managers;
    }

    public List<SaleMarketing> getSaleMarketings() {
        return saleMarketings;
    }

    public void setSaleMarketings(List<SaleMarketing> saleMarketings) {
        this.saleMarketings = saleMarketings;
    }

    public List<Manager> getManagers() {
        return managers;
    }

    public void setManagers(List<Manager> managers) {
        this.managers = managers;
    }
}

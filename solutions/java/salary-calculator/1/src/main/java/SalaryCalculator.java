public class SalaryCalculator {

    private double baseSalary = 1000.00;
    
    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped < 5 ? 1.0 : 0.85; 
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold < 20 ? 10 : 13;
    }

    public double bonusForProductsSold(int productsSold) {
        return bonusMultiplier(productsSold) * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double uncappedSalary = salaryMultiplier(daysSkipped) * baseSalary + bonusForProductsSold(productsSold);
        return uncappedSalary < 2000.0 ? uncappedSalary : 2000.0;
    } 
}

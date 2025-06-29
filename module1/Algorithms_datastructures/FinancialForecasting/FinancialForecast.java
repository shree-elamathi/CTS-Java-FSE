public class FinancialForecast {

    // Recursive method to compute future value
    public static double forecast(double principal, double growthRate, int years) {
        if (years == 0) {
            return principal; // base case
        } else {
            return forecast(principal, growthRate, years - 1) * (1 + growthRate);
        }
    }

    // Optimized version using memoization (optional)
    public static double forecastMemo(double principal, double growthRate, int years, double[] memo) {
        if (years == 0) return principal;
        if (memo[years] != 0) return memo[years];

        memo[years] = forecastMemo(principal, growthRate, years - 1, memo) * (1 + growthRate);
        return memo[years];
    }

    public static void main(String[] args) {
        double initialInvestment = 10000;
        double growthRate = 0.08; // 8% per year
        int years = 5;

        // Basic recursive approach
        double futureValue = forecast(initialInvestment, growthRate, years);
        System.out.printf("Future Value (recursive): ₹%.2f\n", futureValue);

        // Optimized recursive with memoization
        double[] memo = new double[years + 1];
        double optimizedFutureValue = forecastMemo(initialInvestment, growthRate, years, memo);
        System.out.printf("Future Value (memoized): ₹%.2f\n", optimizedFutureValue);
    }
}

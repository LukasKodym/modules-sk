package pl.lukas.polishPayroll;

import pl.lukas.payroll.PayrollService;

public class PayrollServiceImpl implements PayrollService {
    @Override
    public String getCurrency() {
        return "PLN";
    }
}

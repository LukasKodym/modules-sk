module pl.lukas.PolishPayroll {
    requires pl.lukas.PayrollService;
    provides pl.lukas.payroll.PayrollService with pl.lukas.polishPayroll.PayrollServiceImpl;
}
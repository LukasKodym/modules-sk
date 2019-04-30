module pl.lukas.AccountingModule {
    requires java.logging;
    requires pl.lukas.PayrollService;
    requires pl.lukas.PolishPayroll;
    exports pl.lukas.accounting;
    uses pl.lukas.payroll.PayrollService;
}
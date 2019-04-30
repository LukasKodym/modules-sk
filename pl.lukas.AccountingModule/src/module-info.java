module pl.lukas.AccountingModule {
    requires java.logging;
    requires pl.lukas.PayrollService;
    exports pl.lukas.accounting;
}
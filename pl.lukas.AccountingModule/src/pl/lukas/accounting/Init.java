package pl.lukas.accounting;

import pl.lukas.payroll.PayrollService;

import java.util.logging.Logger;

public class Init {

    private static final Logger LOG = Logger.getLogger(Init.class.getName());

    public static void init() {

        LOG.info("Accounting Module has been initialized");

        PayrollService instance = PayrollService.getInstance();

        LOG.info(instance.getCurrency());

    }
}
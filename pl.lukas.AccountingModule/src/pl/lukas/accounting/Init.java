package pl.lukas.accounting;

import pl.lukas.payroll.PayrollService;

import java.util.ServiceLoader;
import java.util.logging.Logger;

public class Init {

    private static final Logger LOG = Logger.getLogger(Init.class.getName());

    public static void init() {

        LOG.info("Accounting Module has been initialized");

        ServiceLoader<PayrollService> services = ServiceLoader.load(PayrollService.class);
        services.findFirst().ifPresent(s -> LOG.info(s.getCurrency()));
    }
}
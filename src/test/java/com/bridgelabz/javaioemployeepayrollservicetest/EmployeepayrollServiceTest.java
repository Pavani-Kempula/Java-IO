package com.bridgelabz.javaioemployeepayrollservicetest;

import com.bridgelabz.javaioemployeepayrollservice.EmployeePayrollData;
import com.bridgelabz.javaioemployeepayrollservice.EmployeePayrollService;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**********************************************************
 * @author Pavani
 *
 * This class hold all the test cases for the same project.
 *********************************************************/

public class EmployeepayrollServiceTest {
    @Test
    public void given3EmployeesWhenWrittenToFileShouldMatchEmployeeEntries()
    {
        EmployeePayrollData[] arrayOfEmps = {
                new EmployeePayrollData(1, "Naruto", 1000000.0),
                new EmployeePayrollData(2, "Hinata", 2000000.0),
                new EmployeePayrollData(3, "Sasuke", 3000000.0)
        };
        EmployeePayrollService employeePayrollService;
        employeePayrollService = new EmployeePayrollService(Arrays.asList(arrayOfEmps));
        employeePayrollService.writeEmployeePayrollData(EmployeePayrollService.IOService.FILE_IO);
        employeePayrollService.printData(EmployeePayrollService.IOService.FILE_IO);
        long entries = employeePayrollService.countEntries(EmployeePayrollService.IOService.FILE_IO);
        Assert.assertEquals(3, entries);
    }
}

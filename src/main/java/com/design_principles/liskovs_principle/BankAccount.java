// liskov's principle suggests that subclasses should be substitute of parent, i.e subclasses must work wherever parent is needed 
// this interface has 2 methods withdraw and deposit, currentAccount make use of all of these methods
// but amount cannot be withdrawn from fixed deposit, so it raise an exception.
// since in this case fixed deposit class which is a subclass cannot be taken as substitute of parent interface, liskovs principle breaks here.
package com.design_principles.liskovs_principle;

public interface BankAccount {
    public void withdraw();

    public void deposit();
}

package com.design_principles.liskovs_principle.fixed_liskovs_principle;

public interface WithdrawableAccounts extends NonWithdrawableAccounts {
    public void withdraw();
}

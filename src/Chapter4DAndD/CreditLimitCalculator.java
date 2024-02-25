package Chapter4DAndD;

public class CreditLimitCalculator {

    int accountNumber;
    int balanceAtTheBeginningOfTheMonth;
    int totalOfAllItemsChargedByTheCustomerThisMonth;
    int totalCreditsAppliedToTheCustomersAccountThisMonth;
    int allowedCreditLimit;

    public CreditLimitCalculator(int accountNumber, int balanceAtTheBeginningOfTheMonth, int totalOfAllItemsChargedByTheCustomerThisMonth, int totalCreditsAppliedToTheCustomersAccountThisMonth, int allowedCreditLimit) {
        this.accountNumber = accountNumber;
        this.balanceAtTheBeginningOfTheMonth = balanceAtTheBeginningOfTheMonth;
        this.totalOfAllItemsChargedByTheCustomerThisMonth = totalOfAllItemsChargedByTheCustomerThisMonth;
        this.totalCreditsAppliedToTheCustomersAccountThisMonth = totalCreditsAppliedToTheCustomersAccountThisMonth;
        this.allowedCreditLimit = allowedCreditLimit;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setBalanceAtTheBeginningOfTheMonth(int balanceAtTheBeginningOfTheMonth) {
        this.balanceAtTheBeginningOfTheMonth = balanceAtTheBeginningOfTheMonth;
    }

    public int getBalanceAtTheBeginningOfTheMonth() {
        return balanceAtTheBeginningOfTheMonth;
    }

    public void setTotalOfAllItemsChargedByTheCustomerThisMonth(int totalOfAllItemsChargedByTheCustomerThisMonth) {
        this.totalOfAllItemsChargedByTheCustomerThisMonth = totalOfAllItemsChargedByTheCustomerThisMonth;
    }

    public int getTotalOfAllItemsChargedByTheCustomerThisMonth() {
        return totalOfAllItemsChargedByTheCustomerThisMonth;
    }

    public void setTotalCreditsAppliedToTheCustomersAccountThisMonth(int totalCreditsAppliedToTheCustomersAccountThisMonth) {
        this.totalCreditsAppliedToTheCustomersAccountThisMonth = totalCreditsAppliedToTheCustomersAccountThisMonth;
    }

    public int getTotalCreditsAppliedToTheCustomersAccountThisMonth() {
        return totalCreditsAppliedToTheCustomersAccountThisMonth;
    }

    public void setAllowedCreditLimit(int allowedCreditLimit) {
        this.allowedCreditLimit = allowedCreditLimit;
    }

    public int getAllowedCreditLimit() {
        return allowedCreditLimit;
    }

}
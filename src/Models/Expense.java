package Models;

import java.util.HashMap;

public class Expense {
    private String paidUser;
    private Double amount;
    private int noOfOwedUsers;
    HashMap<String, Double> userOwedAmounts;
    private String ExpenseType;

    public HashMap<String, Double> getuserOwedAmounts() {
        return userOwedAmounts;
    }

    public void getuserOwedAmounts(HashMap<String, Double> userOwedAmounts) {
        this.userOwedAmounts = userOwedAmounts;
    }

    public String getPaidUser() {
        return paidUser;
    }

    public String getExpenseType() {
        return ExpenseType;
    }

    public void setExpenseType(String expenseType) {
        this.ExpenseType = expenseType;
    }

    public int getNoOfOwedUsers() {
        return noOfOwedUsers;
    }

    public void setNoOfOwedUsers(int noOfOwedUsers) {
        this.noOfOwedUsers = noOfOwedUsers;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public void setPaidUser(String paidUser) {
        this.paidUser = paidUser;
    }

}

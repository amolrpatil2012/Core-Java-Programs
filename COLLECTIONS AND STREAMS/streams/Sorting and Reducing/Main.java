import java.util.*;
import java.util.stream.*;

/*
 * 
 * You have a list of Transaction objects. 
 * Sort the transactions by amount in descending order and 
 * find the transaction with the highest amount.
 * 
 */

class Transaction {
    int id;
    double amount;

    
    public double getAmount() {
        return amount;
    }


    public void setAmount(double amount) {
        this.amount = amount;
    }


    Transaction(int id, double amount) {
        this.id = id;
        this.amount = amount;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction(1, 500.0),
                new Transaction(2, 1500.0),
                new Transaction(3, 800.0),
                new Transaction(4, 2000.0)
        );

        List<Transaction> sorted = transactions.stream()
                .sorted(Comparator.comparingDouble(Transaction::getAmount).reversed()) // Descending order
                .collect(Collectors.toList());

        Transaction highestTransaction = transactions.stream()
                .reduce((t1, t2) -> t1.amount > t2.amount ? t1 : t2) // Find max by amount
                .orElse(null);

        System.out.println("Sorted Transactions: " + sorted.stream()
                .map(t -> "ID: " + t.id + ", Amount: " + t.amount)
                .collect(Collectors.toList()));
        // Output: Sorted Transactions: [ID: 4, Amount: 2000.0, ID: 2, Amount: 1500.0, ID: 3, Amount: 800.0, ID: 1, Amount: 500.0]

        System.out.println("Highest Transaction: ID: " + (highestTransaction != null ? highestTransaction.id : "None")
                + ", Amount: " + (highestTransaction != null ? highestTransaction.amount : "None"));
        // Output: Highest Transaction: ID: 4, Amount: 2000.0
    }
}

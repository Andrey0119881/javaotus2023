package DZ6;

import java.util.Objects;

public class Accounts {
    public Integer accountNumber;
    public Clients clients;

    public Accounts(Integer numAccount, Clients clients) {
        this.accountNumber = numAccount;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Accounts accounts = (Accounts) o;
        return accountNumber == accounts.accountNumber && Objects.equals(accountNumber, accounts.accountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, clients);
    }
}

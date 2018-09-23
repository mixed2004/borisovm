package ru.job4j.bank;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * class BankTest.
 *
 * @author Maxim Borisov (mailto: mixed2004@mail.ru)
 * @version 1
 * @since 23.09.2018
 */
public class BankTest {
    /**
     * public void whenAddUserThenAddUser().
     */
    @Test
    public void whenAddUserThenAddUser() {
        BankTracker bankTracker = new BankTracker();
        User user = new User("Max", "MaxPassport");
        bankTracker.addUser(user);
        assertThat(bankTracker.findUserByPassport("MaxPassport").getName(), is("Max"));
    }

    /**
     * public void whenAddUserAccountThenAddUserAccount().
     */
    @Test
    public void whenAddUserAccountThenAddUserAccount() {
        BankTracker bankTracker = new BankTracker();
        User user = new User("Max", "MaxPassport");
        bankTracker.addUser(user);
        Account account = new Account(12.0, 12345);
        bankTracker.addAccountToUser("MaxPassport", account);
        assertThat(bankTracker.findAccount("MaxPassport", 12345), is(account));
    }

    /**
     * public void whenDeleteUserThenDeleteUser().
     */
    @Test
    public void whenDeleteUserThenDeleteUser() {
        BankTracker bankTracker = new BankTracker();
        User user = new User("Max", "MaxPassport");
        bankTracker.addUser(user);
        bankTracker.deleteUser(user);
        assertTrue(bankTracker.getBankTracker().isEmpty());
    }

    /**
     * public void whenDeleteUserAccountThenDeleteUserAccount().
     */
    @Test
    public void whenDeleteUserAccountThenDeleteUserAccount() {
        BankTracker bankTracker = new BankTracker();
        User user = new User("Max", "MaxPassport");
        bankTracker.addUser(user);
        Account account = new Account(12.0, 12345);
        bankTracker.addAccountToUser("MaxPassport", account);
        bankTracker.deleteAccountFromUser("MaxPassport", account);
        assertNull(bankTracker.findAccount("MaxPassport", 12345));
    }

    /**
     *  public void whenFindUserAccountsThenFindAllUserAccount().
     */
    @Test
    public void whenFindUserAccountsThenFindAllUserAccount() {
        BankTracker bankTracker = new BankTracker();
        User user = new User("Max", "MaxPassport");
        bankTracker.addUser(user);
        Account account1 = new Account(12.0, 12345);
        Account account2 = new Account(24.0, 56789);
        bankTracker.addAccountToUser("MaxPassport", account1);
        bankTracker.addAccountToUser("MaxPassport", account2);
        List<Account> expectList = new ArrayList<Account>();
        expectList.add(account1);
        expectList.add(account2);
        assertThat(bankTracker.getUserAccounts("MaxPassport"), is(expectList));
    }

    /**
     * public void whenFindUserByPasspotrThenFindUser().
     */
    @Test
    public void whenFindUserByPasspotrThenFindUser() {
        BankTracker bankTracker = new BankTracker();
        User user = new User("Max", "MaxPassport");
        bankTracker.addUser(user);
        assertThat(bankTracker.findUserByPassport("MaxPassport").getName(), is("Max"));
    }

    /**
     * public void whenFindAccountsByRequisitesThenFindAccount().
     */
    @Test
    public void whenFindAccountsByRequisitesThenFindAccount() {
        BankTracker bankTracker = new BankTracker();
        User user = new User("Max", "MaxPassport");
        bankTracker.addUser(user);
        Account account1 = new Account(12.0, 12345);
        bankTracker.addAccountToUser("MaxPassport", account1);
        assertThat(bankTracker.findAccount("MaxPassport", 12345), is(account1));
    }

    /**
     * public void wheTransferMoneyUserAccountsThenTransferMoney().
     */
    @Test
    public void wheTransferMoneyUserAccountsThenTransferMoney() {
        BankTracker bankTracker = new BankTracker();
        User user = new User("Max", "MaxPassport");
        bankTracker.addUser(user);
        Account account1 = new Account(12.0, 12345);
        Account account2 = new Account(24.0, 56789);
        bankTracker.addAccountToUser("MaxPassport", account1);
        bankTracker.addAccountToUser("MaxPassport", account2);
        bankTracker.transferMoney("MaxPassport", 56789, "MaxPassport", 12345, 20.0);
        assertThat(account1.getValue(), is(32.0));
    }
}

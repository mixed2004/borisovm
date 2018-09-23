package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * class BankTracker.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 20.09.2018
 */
public class BankTracker {
    /**
     * bankTracker.
     */
    private Map<User, List<Account>> bankTracker = new HashMap<>();

    /**
     * getBankTracker.
     * @return bankTracker
     */
    public Map<User, List<Account>> getBankTracker() {
        return bankTracker;
    }

    /**
     * method add user.
     * @param user user
     */
    public void addUser(User user) {
        bankTracker.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * method of delete User.
     * @param user user
     */
    public void deleteUser(User user) {
        bankTracker.remove(user);
    }

    /**
     * method add account to user.
     * @param passport passport
     * @param account account
     */
    public void addAccountToUser(String passport, Account account) {
        bankTracker.get(findUserByPassport(passport)).add(account);
    }

    /**
     * method delete account from user.
     * @param passport passport
     * @param account account
     */
    public void deleteAccountFromUser(String passport, Account account) {
        bankTracker.get(findUserByPassport(passport)).remove(account);
    }

    /**
     * method find all accounts.
     * @param passport passport
     * @return list accounts
     */
    public List<Account> getUserAccounts(String passport) {

        return bankTracker.get(findUserByPassport(passport));
    }

    /**
     * method transfer money fron one account to an other.
     * @param srcPassport source passport
     * @param srcRequisite source Requisite
     * @param destPassport destination passport
     * @param dstRequisite destination Requisite
     * @param amount value
     * @return boolean
     */
    public boolean transferMoney(String srcPassport, Integer srcRequisite, String destPassport, Integer dstRequisite, double amount) {

        boolean resalt = false;
        Account sourceAcc = findAccount(srcPassport, srcRequisite);
        Account destinationAcc = findAccount(destPassport, dstRequisite);
        if (sourceAcc.getValue() >= amount) {
            sourceAcc.setValue(sourceAcc.getValue() - amount);
            destinationAcc.setValue(destinationAcc.getValue() + amount);
            resalt = true;
        }
        return resalt;
    }

    /**
     * method find user by passport.
     * @param passport passport
     * @return user user
     */
    public User findUserByPassport(String passport) {
        User resaltUser = null;
        for (User user: bankTracker.keySet()) {
            if (user.getPassport().equals(passport)) {
                resaltUser = user;
                break;
            }
        }
        return resaltUser;
    }

    /**
     * method find account by passport and Requisites.
     * @param passport passport
     * @param requisite Requisites
     * @return account account
     */
    public Account findAccount(String passport, Integer requisite) {
        Account resalt = null;
        if (findUserByPassport(passport) != null) {
            for (Account account : getUserAccounts(passport)) {
                if (requisite.equals(account.getRequisites())) {
                    resalt = account;
                    break;
                }
            }
        }
        return resalt;
    }
}

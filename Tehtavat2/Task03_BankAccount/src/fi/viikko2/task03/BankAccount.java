/**
 * Tehtävä 3 – BankAccount (kapselointi, konstruktorit, toString, equals)
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Kentät: accountNumber (String), balance (double).
 *  2. Konstruktori: jos initialBalance < 0 -> nollaa.
 *  3. `deposit(amount)` ja `withdraw(amount)` säännöillä.
 *  4. `toString()` ja `equals(Object)` (tilinumero).
 *
 * VINKIT:
 *  - equals: pelkkä tilinumero riittää; vältä double-vertailua.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task03;

public class BankAccount {
   
    private String accountNumber;
    private double balance;

    BankAccount(String accountNumber, double initialBalance){
        this.accountNumber = accountNumber;
        this.balance = (initialBalance < 0) ? 0 : initialBalance;
    }

    public boolean deposit(double amount){
        if(amount>0){
            this.balance += amount;
            return true;
        }
        return false;

    }

    public boolean withdraw(double amount){
        if(amount>0 && (this.balance - amount)>=0){
            this.balance -= amount;
            return true;
        }
        return false;
    }
    public double getBalance(){
        return this.balance;
    }

    @Override
    public String toString(){
        //  Toteuta ja palauta merkkijono. Kun olet valmis, POISTA alla oleva rivi.
        return "BankAccount{accountNumber='"+accountNumber+"',balance="+balance+"}";
       
    }

    @Override
    public boolean equals(Object o){
        //  Toteuta ja palauta merkkijono. Kun olet valmis, POISTA alla oleva rivi.
        if(this == o) return true;
        if(!(o instanceof BankAccount)) return false;
        BankAccount other = (BankAccount)o;
        return java.util.Objects.equals(this.accountNumber, other.accountNumber);
        
    }
}
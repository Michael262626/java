//package chapterThree;
//
//import java.util.Iterator;
//import java.util.List;
//
//public class recycle {
//    public void removeAccount(BankAccount accountNumber, String fromPin) throws InvalidAccountException {
//        Iterator<BankAccount> accountIterator = accounts.iterator();
//        for (Iterator<BankAccount> it = accountIterator; it.hasNext(); ) {
//            BankAccount account = it.next();
//            if(!account.equals(accountNumber) && !pin.equals(fromPin)) throw new InvalidAccountException("Invalid account being removed");
//            if(account.equals(10)) {
//                this.accounts.remove(accountNumber);
//            }
//        }
//        public void withdrawCash(int accountNumber, int amount, String fromPin) throws InsufficientFundsException, InvalidPinException, InvalidAccountException {
//            if (balance == 0 ||  amount > balance) throw new InsufficientFundsException("insufficient funds");
//            if(validatePin(fromPin)) throw new InvalidPinException("Invalid pin");
//            if(validateAccountNumber(accountNumber)) throw new InvalidAccountException("invalid account");
//            withdraw(amount, fromPin);
//            deposit(amount);
//            balance -= amount;
//        }
//        public List<BankAccount> registerCustomer(String id, String name, String fromPin) throws InvalidPinException {
//            Customer newCustomer = new Customer(id, name, pin);
//            if(validatePin(fromPin)) throw new InvalidPinException("Invalid pin");
//            customer.add(newCustomer);
//            return accounts;
//        }
//        public List<BankAccount> findAccount(int accountNumber) {
//            for(Customer customer1: customer){
//                if(customer1.equals(getAccount()) || this.accountNumber()==(accountNumber)){
//                    return accounts;
//                }
//            }
//            return null;
//}

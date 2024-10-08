package July3;

    class InsufficientFundsException extends Exception {
        public InsufficientFundsException(String message) {
            super(message);
        }
    }

    class BankAccount {
        private double balance;

        public BankAccount(double balance) {
            this.balance = balance;
        }

        public void withdraw(double amount) throws InsufficientFundsException {
            if (amount > balance) {
                throw new InsufficientFundsException("Insufficient funds to withdraw " + amount);
            }
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
        }
    }



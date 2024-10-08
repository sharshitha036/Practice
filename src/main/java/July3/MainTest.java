package July3;

public  class MainTest {
    public static void main(String[] args) {

        BusinessService service = new BusinessService();
        try {
            service.performBusinessLogic();
        } catch (ServiceException e) {
            e.printStackTrace();
        }

        BankAccount account = new BankAccount(100.0);
        try {
            account.withdraw(80.0);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

    FileManager fileManager = new FileManager();
            fileManager.readFile("example.txt");
}
}


package July3;

import java.sql.SQLException;
 class DatabaseException extends Exception {
        public DatabaseException(String message, Throwable cause) {
            super(message, cause);
        }
    }

     class ServiceException extends Exception {
        public ServiceException(String message, Throwable cause) {
            super(message, cause);
        }
    }

    class DataAccess {
        public void connect() throws DatabaseException {
            try {
                // Simulating a connection error
                throw new SQLException("Connection failed");
            } catch (SQLException e) {
                throw new DatabaseException("Unable to connect to the database", e);
            }
        }
    }

    class BusinessService {

        private DataAccess dataAccess = new DataAccess();

        public void performBusinessLogic() throws ServiceException {
            try {
                dataAccess.connect();
            } catch (DatabaseException e) {
                throw new ServiceException("Business logic failed", e);
            }
        }
    }


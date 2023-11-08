package board;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        // 기능 부터 구현하자!
    }
}
//abstract class
class User {

    private final String userId;
    private final String password;
    private final List<String> userAccount;

    public User(String userId, String password) {
        this.userId = userId;
        this.password = password;
        this.userAccount = List.of(userId, password);
    }

    private String getUserId() {
        return userId;
    }

    private String getPassword() {
        return password;
    }

    public List<String> getUserAccount() {
        return userAccount;
    }
}
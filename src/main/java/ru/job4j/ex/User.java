package ru.job4j.ex;

public class User {
    private String username;
    private boolean valid;

    public User(String username, boolean valid) {
        this.username = username;
        this.valid = valid;
    }

    public String getUsername() throws UserInvalidException {
        return username;
    }

    public boolean isValid() throws UserInvalidException {
        if (username.length() < 3) {
            valid = false;
            throw new UserInvalidException("Количество символов меньшше 3. Пользователь не валидный");
        }
        return valid;
    }
}

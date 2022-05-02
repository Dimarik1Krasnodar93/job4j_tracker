package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User result = null;
        for (User user : users) {
            if (user.getUsername().equals(login)) {
                result = user;
            }
        }
        if (result == null) {
                throw new UserNotFoundException("Не найден пользователь " + login);
        }
        return result;
    }

    public static boolean validate(User user) throws UserInvalidException {
        boolean result = false;
        try {
            user.isValid();
            result = true;
        } catch (UserInvalidException ex) {
            ex.printStackTrace();
        }
        if (!user.isValid()) {
            throw new UserInvalidException("Пользователь не валидный");
        }
        return result;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ex) {
            ex.printStackTrace();
        } catch (UserNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}

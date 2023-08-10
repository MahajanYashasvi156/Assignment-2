package com.navi.UserDetailsAPI.repository;

import com.navi.UserDetailsAPI.entity.User;

import java.util.HashMap;

public class UserRepositoryImp implements UserRepository{

    private final HashMap<String, User> userDb;

    /**
     * Creates a new instance of UserRepositoryImpl with an empty user database (HashMap).
     */
    public UserRepositoryImp() {
        this.userDb = new HashMap<>();
    }

    /**
     * Creates a new user in the data repository.
     *
     * @param user The User object representing the new user to be created.
     * @return The User object representing the newly created user.
     * @throws UserAlreadyExistException If a user with the same username already exists in the repository.
     */
    public User createUser(User user)
    {
        if (userDb.containsKey(user.getEmail())) {
            throw new RuntimeException("User already exist");
        }
        userDb.put(user.getEmail(), user);
        return userDb.get(user.getEmail());
    }

    /**
     * Fetches the user information for the given username from the data repository.
     *
     * @param email The username of the user to fetch.
     * @return The User object representing the user with the specified username,
     *         or null if no user is found with the given username.
     */
    public User fetchUser(String email) {
        return userDb.get(email);
    }

}

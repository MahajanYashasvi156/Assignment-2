package com.navi.UserDetailsAPI.repository;


import com.navi.UserDetailsAPI.entity.User;

/**
 * The UserRepository interface represents the contract for managing user data storage and retrieval. Implementations of this interface provide methods to
 * create and fetch user information.
 */
public interface UserRepository {

    /**
     * Creates a new user in the data repository.
     *
     * @param user The User object representing the new user to be created.
     * @return The User object representing the newly created user.
     */
    public User createUser(User user);

    public User fetchUser(String email);
}
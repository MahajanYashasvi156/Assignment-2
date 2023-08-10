package com.navi.UserDetailsAPI.services;
import com.navi.UserDetailsAPI.entity.User;
import com.navi.UserDetailsAPI.repository.UserRepository;
import org.springframework.stereotype.Service;

/**
 * The UserService interface represents the contract for managing user-related operations.
 * Implementations of this interface provide methods to create and fetch user information.
 */
@Service
public class UserService {

    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * Creates a new user with the given username.
     * @return The User object representing the newly created user.
     */

    public User createUser(User user) {
        return userRepository.createUser(user);
    }

    /**
     * Fetches the user information for the given username.
     *
     * @param email The email of the user to fetch.
     * @return The User object representing the user with the specified username,
     *         or null if no user is found with the given username.
     */

    public User fetchUser(String email) {
        return userRepository.fetchUser(email);
    }



}

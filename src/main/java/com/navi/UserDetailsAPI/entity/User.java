package com.navi.UserDetailsAPI.entity;


import java.util.ArrayList;

/**
 * The User class represents a basic user entity with properties such as username, full name, and email,address.
 * This class provides methods to get and set these properties.
 */
public class User
{
    private String email;
    private String selected_category;
    private String selected_country;

    private String phoneNumber;
    public User(String email, String selected_category,String selected_country) {
        this.selected_category =  selected_category;
        this.email = email;
        this.selected_country = selected_country;
    }

    /**
     * Constructs a new User object with the specified username.
     *
     * @param email  for the user.
     */
    public User(String email) {
        this.email = email;
    }

    /**
     * Retrieves the username of the user.
     *
     * @return The username of the user.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the username of the user.
     *
     * @param email The new username for the user.
     */
    public void setEmail(String email) {
        this.email = email;
    }


    /**
     * Retrieves the selected_category of the user.
     *
     * @return The selected_category by the user.
     */
    public String getSelected_category() {
        return selected_category;
    }

    /**
     * Sets the selected_category  of the user.
     *
     * @param selected_category  for the user.
     */
    public void setSelected_category(String selected_category) {
        this.selected_category = selected_category;
    }


    /**
     * Retrieves the selected_country of the user.
     *
     * @return The selected_country by the user.
     */
    public String getSelected_country() {
        return selected_country;
    }

    /**
     * Sets the selected_country  of the user.
     *
     * @param selected_country  for the user.
     */
    public void setSelected_country(String selected_country) {
        this.selected_country = selected_country;
    }
}

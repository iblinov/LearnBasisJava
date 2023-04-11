package com.epam.array.service.learn.cube.service;


import java.util.Optional;

/**
 * The interface User service.
 */
public interface UserService {
    /**
     * Find page by user role.
     *
     * @param content    the content
     * @param rowsOnPage the rows on page
     * @throws ServiceException the service exception
     */
    void findPageByUserRole(SessionRequestContent content, long rowsOnPage) throws ServiceException;

    /**
     * Login.
     *
     * @param content the content
     * @throws ServiceException the service exception
     */
    void login(SessionRequestContent content) throws ServiceException;

    /**
     * Update password boolean.
     *
     * @param userId      the user id
     * @param password    the password
     * @param email       the email
     * @param contextPath the context path
     * @param requestUrl  the request url
     * @param tariffId    the tariff id
     * @return the boolean
     * @throws ServiceException the service exception
     */
    boolean updatePassword(long userId,
                           String password,
                           String email,
                           String contextPath,
                           String requestUrl,
                           long tariffId) throws ServiceException;

    /**
     * Update activation code status.
     *
     * @param activateCode the activate code
     * @param userStatus   the user status
     * @throws ServiceException the service exception
     */
    void updateActivationCodeStatus(String activateCode, UserStatus userStatus) throws ServiceException;

    /**
     * Verification of activation code boolean.
     *
     * @param activateCode the activate code
     * @return the boolean
     * @throws ServiceException the service exception
     */
    boolean verificationOfActivationCode(String activateCode) throws ServiceException;

    /**
     * Update tariff plan boolean.
     *
     * @param userId   the user id
     * @param tariffId the tariff id
     * @return the boolean
     * @throws ServiceException the service exception
     */
    boolean updateTariffPlan(long userId, long tariffId) throws ServiceException;

    /**
     * Activate payment card.
     *
     * @param content the content
     * @throws ServiceException the service exception
     */
    void activatePaymentCard(SessionRequestContent content) throws ServiceException;

    /**
     * Add user.
     *
     * @param content the content
     * @throws ServiceException the service exception
     */
    void addUser(SessionRequestContent content) throws ServiceException;

    /**
     * Find by id optional.
     *
     * @param id the id
     * @return the optional
     * @throws ServiceException the service exception
     */
    Optional<User> findById(long id) throws ServiceException;

    /**
     * Update user personal data.
     *
     * @param content the content
     * @throws ServiceException the service exception
     */
    void updateUserPersonalData(SessionRequestContent content) throws ServiceException;

    /**
     * Block or unblock user.
     *
     * @param userId the user id
     * @throws ServiceException the service exception
     */
    void blockOrUnblockUser(long userId) throws ServiceException;

    /**
     * Change user role.
     *
     * @param userId the user id
     * @throws ServiceException the service exception
     */
    void changeUserRole(long userId) throws ServiceException;

    /**
     * Search users.
     *
     * @param content the content
     * @throws ServiceException the service exception
     */
    void searchUsers(SessionRequestContent content) throws ServiceException;
}
package de.bht.app.usermanagement.infrastructure.persistence;

import de.bht.app.usermanagement.domain.model.user.User;
import de.bht.app.usermanagement.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public abstract class JpaCitizenRepository  {

    private final UserRepository userRepository;

    @Autowired
    public JpaCitizenRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public User save(User user) {
        return userRepository.save(user);
    }

}
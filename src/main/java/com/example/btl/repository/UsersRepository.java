package com.example.btl.repository;

import com.example.btl.Base.BaseRepository;
import com.example.btl.model.Users;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsersRepository extends BaseRepository<Users> {
    @Query(value="from Users user where user.username= ?1")
    Optional<Users> getUsersByUsername(String username);

    @Modifying
    @Query(value="update users set password= :password where username = :username", nativeQuery=true)
    void updateUsersByUsername(String username, String password);

    @Query(value = "from Users user where (user.username=?1 and user.password=?2)")
    Optional<Users> findByUsernameAndPassword(String username, String password);
}

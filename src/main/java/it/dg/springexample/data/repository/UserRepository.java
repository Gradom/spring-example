package it.dg.springexample.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import it.dg.springexample.data.domain.entity.UserEntity;

/**
 * @author Grasso Domenico
 *
 *         Time: 15:10:41 Date: 24 apr 2020
 * 
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

	@Query("Select user from UserEntity user where user.username = ?1 and user.password = ?2")
	public UserEntity findByUsernameAndPssword(String username, String password);

}

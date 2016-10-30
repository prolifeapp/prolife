package br.com.prolife.repository;

import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Repository;

import br.com.prolife.model.User;

@Repository(forEntity = User.class)
public interface UserRepository extends EntityRepository<User, Long>{

	User findByEmailAndPassword(String email, String password);
	
	User findByEmail(String email);

	User findOptionalByEmail(String email);
	
}

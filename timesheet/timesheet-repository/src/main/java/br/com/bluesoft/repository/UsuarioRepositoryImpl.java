package br.com.bluesoft.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.bluesoft.model.Usuario;

@Repository
public class UsuarioRepositoryImpl  implements UsuarioRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void salvar(Usuario usuario) {
		entityManager.persist(usuario);
	}
}

package com.grs.wms.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.grs.wms.bean.Usuario;
import com.grs.wms.dao.UsuarioDao;

public class UsuarioDaoImpl implements UsuarioDao{
	@Autowired
	public SessionFactory session;
	@Override
	public void add(Usuario usuario) {
		session.getCurrentSession().save(usuario);
	}

	@Override
	public void edit(Usuario usuario) {
		session.getCurrentSession().update(usuario);
	}

	@Override
	public void delete(int idUsuario) {
		session.getCurrentSession().delete(session.getCurrentSession().get(Usuario.class, idUsuario));
	}

	@Override
	public Usuario autenticarUsuario(String nick, String contrasena) { 
		return (Usuario)session.getCurrentSession().createSQLQuery("CALL sp_autenticarUsuario('"+nick+"','"+contrasena+"')");
	}
	
}

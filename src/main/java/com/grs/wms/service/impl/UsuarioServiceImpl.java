package com.grs.wms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grs.wms.bean.Usuario;
import com.grs.wms.dao.UsuarioDao;
import com.grs.wms.service.UsuarioService;
public class UsuarioServiceImpl implements UsuarioService {
	@Autowired
	private UsuarioDao usuarioDao;
	@Override
	public void add(Usuario usuario) {
		usuarioDao.add(usuario);
		
	}
	@Override
	public void edit(Usuario usuario) {
		usuarioDao.edit(usuario);
	}

	@Override
	public void delete(int idUsuario) {
		usuarioDao.delete(idUsuario);
	}

	@Override
	public Usuario autenticarUsuario(String nick, String contrasena) {
		return usuarioDao.autenticarUsuario(nick, contrasena);
	}

}

package com.grs.wms.service;

import com.grs.wms.bean.Usuario;

public interface UsuarioService {
	public void add(Usuario usuario);
	public void edit(Usuario usuario);
	public void delete(int  idUsuario);
	public Usuario autenticarUsuario(String nick,String contrasena);
}

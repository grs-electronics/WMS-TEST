package com.grs.wms.dao;

import com.grs.wms.bean.Usuario;

public interface UsuarioDao {
	public void add(Usuario usuario);
	public void edit(Usuario usuario);
	public void delete(int  idUsuario);
	public Usuario autenticarUsuario(String nick,String contrasena);
}

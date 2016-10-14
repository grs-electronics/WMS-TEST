import com.grs.wms.dao.UsuarioDao;
import com.grs.wms.service.impl.UsuarioServiceImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsuarioDao usr = null;
		System.out.println(usr.autenticarUsuario("retana", "123"));
	}

}

package com.grs.wms.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.grs.wms.sap.controller.OrdenDeVentaController;
import com.grs.wms.service.UsuarioService;
import com.sap.smb.sbo.api.SBOCOMException;

@Controller
@RequestMapping(value="/v1")
public class UsuarioController {
	
	@RequestMapping(value="/Entrega", method=RequestMethod.GET,produces="application/json;charset=UTF-8")
	public void autenticar(HttpServletRequest peticion,HttpServletResponse respuesta)throws IOException, SBOCOMException{
		respuesta.getWriter().println(OrdenDeVentaController.getInstancia().getAll());
	}
	@RequestMapping(value="/test", method=RequestMethod.GET,produces="application/json;charset=UTF-8")
	public void test(HttpServletRequest peticion,HttpServletResponse respuesta)throws IOException, SBOCOMException{
		
	}
}

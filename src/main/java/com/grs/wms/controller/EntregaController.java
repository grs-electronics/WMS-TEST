package com.grs.wms.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.grs.wms.sap.controller.OrdenDeVentaController;

import com.sap.smb.sbo.api.SBOCOMException;

//@Controller
//@RequestMapping(value="/v1/")
public class EntregaController {
	

	//@RequestMapping(value="/Entrega", method=RequestMethod.GET,produces="application/json;charset=UTF-8")
	public void getAll(HttpServletRequest peticion,HttpServletResponse respuesta)throws IOException, SBOCOMException{
		respuesta.getWriter().println(OrdenDeVentaController.getInstancia().getAll());
	}
	//@RequestMapping(value="/EntregaItems", method=RequestMethod.GET)
	public void get(HttpServletRequest peticion,HttpServletResponse respuesta)throws IOException, SBOCOMException{
		Integer docEntry=Integer.parseInt(peticion.getParameter("docEntry"));
		respuesta.getWriter().println(OrdenDeVentaController.getInstancia().getAllItems(docEntry));
	}
	
	//@RequestMapping(value="/", method=RequestMethod.GET)
	public String index(HttpServletRequest peticion,HttpServletResponse respuesta)throws IOException{
		return "index";
	}
}

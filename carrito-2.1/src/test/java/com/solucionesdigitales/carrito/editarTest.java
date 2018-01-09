package com.solucionesdigitales.carrito;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.solucionesdigitales.carrito.Application;
import com.solucionesdigitales.carrito.modelo.entidad.Producto;
import com.solucionesdigitales.carrito.servicio.ProductoServicio;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( classes = Application.class, loader = AnnotationConfigContextLoader.class)
public class editarTest {
	
	private static final Logger LOG = LoggerFactory.getLogger(AgregarTests.class);
	
	@Autowired
	@Qualifier("productoServicio")
	private ProductoServicio servico;
	public final Long  ID_TEMPORAL = 1L;
	@Before
	public void setup() 
	{
       LOG.info("-----------------");
       LOG.info("Inicializando componentes ...");
       LOG.info("-----------------");
	}
	
	
	 @Test
	   public void actualizarProducto()
	   {
		   String respuestaEsperada = "EXITO";
		   Producto producto = new Producto("PAPAS",27.0);
		   producto.setIdProducto(ID_TEMPORAL);
		   LOG.info("PRODUCTO ACTUALIZADO A: " + producto);
		   String respuesta = servico.actualizarProducto(producto);
		   Assert.assertEquals(respuestaEsperada, respuesta);
	   }


}


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
public class EliminarTest {
	
	private static final Logger LOG = LoggerFactory.getLogger(AgregarTests.class);
	
	@Autowired
	@Qualifier("productoServicio")
	private ProductoServicio servico;
	public final Long  ID_TEMPORAL = 2L;
	@Before
	public void setup() 
	{
       LOG.info("-----------------");
       LOG.info("Inicializando componentes ...");
       LOG.info("-----------------");
	}
	
   @Test
   public void eliminarProducto()
   {
	   String respuestaEsperada = "EXITO";
	   LOG.info("PRODUCTO A ELIMINAR: ID(" + ID_TEMPORAL+")");
	   String respuesta = servico.eliminarProducto(ID_TEMPORAL);
	   Assert.assertEquals(respuestaEsperada, respuesta);
	   
   }
	
}
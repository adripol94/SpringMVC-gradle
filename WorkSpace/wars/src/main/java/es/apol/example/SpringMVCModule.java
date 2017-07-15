package es.apol.example;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

/**
 * String MVC clase controladora para la vista.
 * @author apolalca
 *
 */

@Controller
@RequestMapping("VIEW")
public class SpringMVCModule {
	
	/**
	 * Devuelve una viesta normal
	 * @param request
	 * @param response
	 * @return
	 */
	@RenderMapping
	public String view(RenderRequest request, RenderResponse response) {
		return "view";
	}
	
	/**
	 * Devuelve la vista cuando la accion key es <code>view</code>
	 * @param request
	 * @param response
	 * @return
	 */
	@RenderMapping(params = "action=view")
	public String view2(RenderRequest request, RenderResponse response) {
		return "view";
	}
}

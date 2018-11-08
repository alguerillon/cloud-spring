/**
 * 
 */
package fr.ms.manager.services;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author VRIGNAUD
 *
 */
@RestController
@RequestMapping
public class SOAService {
	
	@RequestMapping("/register")
    public void register(@RequestParam(value="nom")String nomService, @RequestParam(value="version")String versionService, @RequestParam(value="url")String urlService) {
		
		
		
    }
	
	@RequestMapping("/unregister")
    public void unregister(@RequestParam(value="url")String urlService) {
		
		
		
    }
	
	@RequestMapping("/list")
    public void list(@RequestParam(value="nom")String nomService) {
		
		
		
    }

}

package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
//@RestController
//@EnableJpaRepositories("com.example.demo")
public class ContactoController {

	@Autowired
	private ContactoRepository contactoRepository;
	
	@GetMapping("/")
	public String index(Model model, @PageableDefault(size = 3) Pageable pageanable) {
//		List<Contacto> contactos = contactoRepository.findAll();
		Page<Contacto> contactos = contactoRepository.findAll(pageanable);
		model.addAttribute("contactos", contactos);
//		model.addAttribute("mensaje", "Esto es una prueba para ver si fufa");
		return "index.html";
	}
	
	@GetMapping("/nuevo")
	public String nuevo(Model model) {
		model.addAttribute("contacto", new Contacto());
		return "form.html";
	}
	
//	@RequestMapping(value="/all", method=RequestMethod.GET)
//    public List<Contacto> findAll() {
//		List<Contacto> contactos = contactoRepository.findAll();
//        return contactos;
//    }
	

	@PostMapping("/nuevo")
	public String crear(Contacto contacto, RedirectAttributes re) {
		// TODO Persistir el contacto
		contacto.asignarFechaRegistro();
		contactoRepository.save(contacto);
		re.addFlashAttribute("msgExito", "El contacto ha sido creado correctamente.");
		return "redirect:/";// redirigimos a la ruta principal
	}
}

package imdb.controller;

import imdb.entity.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import imdb.bindingModel.FilmBindingModel;
import imdb.repository.FilmRepository;

import java.util.List;

@Controller
public class FilmController {

	private final FilmRepository filmRepository;

	@Autowired
	public FilmController(FilmRepository filmRepository) {
		this.filmRepository = filmRepository;
	}

	@GetMapping("/")
	public String index(Model model) {

		List<Film> films = filmRepository.findAll();
		model.addAttribute("view", "film/index");
		model.addAttribute("films", films);


		return "base-layout";
	}

	@GetMapping("/create")
	public String create(Model model) {
		model.addAttribute("view", "film/create");
		return "base-layout";
	}

	@PostMapping("/create")
	public String createProcess(Model model, FilmBindingModel filmBindingModel) {

		Film film = new Film(
				filmBindingModel.getName(),
				filmBindingModel.getGenre(),
				filmBindingModel.getDirector(),
				filmBindingModel.getYear()
		);

		this.filmRepository.saveAndFlush(film);

		return "redirect:/";

	}

	@GetMapping("/edit/{id}")
	public String edit(Model model, @PathVariable int id) {
		if (!this.filmRepository.exists(id)){
			return "redirect:/";
		}

		Film project = filmRepository.findOne(id);
		model.addAttribute("film", project);
		model.addAttribute("view", "film/edit");
		return "base-layout";

	}

	@PostMapping("/edit/{id}")
	public String editProcess(Model model, @PathVariable int id, FilmBindingModel filmBindingModel) {
		if (!this.filmRepository.exists(id)){
			return "redirect:/";
		}

		Film film = filmRepository.findOne(id);
		film.setName(filmBindingModel.getName());
		film.getGenre(filmBindingModel.getGenre());
		film.getDirector(filmBindingModel.getDirector());
		film.getYear(filmBindingModel.getYear());
		this.filmRepository.saveAndFlush(film);

		return "redirect:/";
	}

	@GetMapping("/delete/{id}")
	public String delete(Model model, @PathVariable int id) {
		if (!this.filmRepository.exists(id)){
			return "redirect:/";
		}

		Film project = filmRepository.findOne(id);
		model.addAttribute("project", project);
		model.addAttribute("view", "film/edit");
		return "base-layout";

	}

	@PostMapping("/delete/{id}")
	public String deleteProcess(@PathVariable int id) {
		Film project = filmRepository.findOne(id);
		filmRepository.delete(project);

		return "redirect:/";

	}
}

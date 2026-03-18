package com.klu;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/library")
public class LibraryController {
	
	
	@GetMapping("/welcome")
    public String welcome() {
		return "welcome to library";
	}
	@GetMapping("/count")
	public int count() {
		return 150;
	}
	@GetMapping("/price")
	public double price() {
		return 122000;
	}
	@GetMapping("/title")
	public String title() {
		return "java devolepment, frameworks";
	}
	@GetMapping("/books/{id}")
	public int getId(@PathVariable("a") int a) {
		return a;
	}
	@GetMapping("/search")
		public String search(@RequestParam String title) {
			return "u are checking for" + title;
		}
	@GetMapping("/author/{name}")
    public String getAuthor(@PathVariable String name) {
        return "Books written by author: " + name;
    }
	@GetMapping("/view")
	public String viewBooks() {
		return "Java python frontend";
	}
}

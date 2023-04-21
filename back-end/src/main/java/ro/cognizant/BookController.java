package ro.cognizant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.cognizant.coderun2023.BookRepository;

import java.awt.print.Book;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookRepository bookRepository; // assuming you have a BookRepository that extends JpaRepository<Book, Long>

    @GetMapping("/retrieve")
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
}


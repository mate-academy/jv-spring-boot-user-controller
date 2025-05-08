package mate.academy.springboot.web.service.impl;

import java.util.List;
import lombok.RequiredArgsConstructor;
import mate.academy.springboot.web.dto.BookDto;
import mate.academy.springboot.web.dto.CreateBookRequestDto;
import mate.academy.springboot.web.exception.EntityNotFoundException;
import mate.academy.springboot.web.mapper.BookMapper;
import mate.academy.springboot.web.model.Book;
import mate.academy.springboot.web.repository.BookRepository;
import mate.academy.springboot.web.service.BookService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    @Override
    public List<BookDto> findAll() {
        return bookRepository.findAll()
                .stream()
                .map(bookMapper::toDto)
                .toList();
    }

    @Override
    public BookDto findById(Long id) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() ->
                        new EntityNotFoundException("Book by ID " + id + " not found"));
        return bookMapper.toDto(book);
    }

    @Override
    public BookDto create(CreateBookRequestDto requestDto) {
        return bookMapper.toDto(bookRepository.save(bookMapper.toModel(requestDto)));
    }
}

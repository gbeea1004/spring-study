package com.geon.springstudy.service.book;

import com.geon.springstudy.domain.book.Book;
import com.geon.springstudy.domain.book.BookRepository;
import com.geon.springstudy.domain.book.BookStatus;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

@ExtendWith(SpringExtension.class)
class BookServiceTest {

    @Mock
    private BookRepository bookRepository;

    @Test
    void save() {
        // given
        Book book = new Book();
        given(bookRepository.save(book)).willReturn(book);
        BookService bookService = new BookService(bookRepository);

        // when
        Book result = bookService.save(book);

        // then
        assertThat(book.getCreated()).isNotNull();
        assertThat(book.getBookStatus()).isEqualTo(BookStatus.DRAFT);
        assertThat(result).isNotNull();
    }
}
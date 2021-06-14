package com.geon.springstudy.domain.book;

import java.time.LocalDateTime;

public class Book {
    private LocalDateTime created;
    private BookStatus bookStatus;

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public BookStatus getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(BookStatus bookStatus) {
        this.bookStatus = bookStatus;
    }
}

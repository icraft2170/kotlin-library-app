package com.group.libraryapp.domain.book

import com.group.libraryapp.dto.book.response.BookStatsResponse
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface BookRepository : JpaRepository<Book, Long> {
    fun findByName(bookName: String) : Book?

    @Query(
        "SELECT new com.group.libraryapp.dto.book.response.BookStatsResponse(b.type, COUNT(b.id)) " +
            "FROM Book b group by b.type"
    )
    fun getStats(): List<BookStatsResponse>
}
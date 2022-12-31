package com.group.libraryapp.repository.book

import com.group.libraryapp.domain.book.QBook.book
import com.group.libraryapp.dto.book.response.BookStatsResponse
import com.querydsl.core.types.Projections
import com.querydsl.jpa.impl.JPAQueryFactory
import org.springframework.stereotype.Component

@Component
class BookQuerydslRepository(
    private val queryFactory:JPAQueryFactory,
) {
    fun getStats(): List<BookStatsResponse> {
        return queryFactory.select(Projections.constructor(
            BookStatsResponse::class.java,
            book.type,
            book.id.count(),
        ))
            .from(book)
            .groupBy(book.type)
            .fetch()
    }
}
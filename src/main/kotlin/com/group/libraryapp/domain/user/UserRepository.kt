package com.group.libraryapp.domain.user

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface UserRepository : JpaRepository<User, Long> {
    fun findByName(name: String): User?

    @Query("select DISTINCT u from User u LEFT JOIN FETCH UserLoanHistory uh on u = uh.user ")
    fun findAllWithHistories(): List<User>
}
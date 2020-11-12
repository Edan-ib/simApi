package ru.mtuci.simapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.mtuci.simapi.model.Book;
import org.springframework.transaction.annotation.Transactional;


@Transactional(readOnly = true)
public interface BookRepository extends JpaRepository<Book, Long> {
    @Transactional
    @Modifying
    @Query("DELETE FROM Book p WHERE p.id=:id")
    int delete(@Param("id") Long id);
}

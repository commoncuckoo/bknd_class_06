package kr.ac.cu.dgict.bknd_class_06;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardPostRepositoy extends JpaRepository<BoardPost, Long>{
    
    public List<BoardPost> findByAuthor(String author);
    public List<BoardPost> findByAuthorAndEmail(String author, String email);

    public List<BoardPost> findByAuthorByCreateAtDESC(String author);
}

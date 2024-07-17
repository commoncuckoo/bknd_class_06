package kr.ac.cu.dgict.bknd_class_06;

import java.util.List;

public interface BoardService {
    
    public List<BoardPost> readAll();
    public BoardPost create(BoardPost post);
    public BoardPost readOne(Long id);
    public List<BoardPost> readByAuthor(String author);
    public List<BoardPost> update(Long id, BoardPost post);
    public boolean delete(Long id);
}

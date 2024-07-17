package kr.ac.cu.dgict.bknd_class_06;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardPostServiceImpl implements BoardService{

    @Autowired
    private BoardPostRepositoy repo;

    @Override
    public List<BoardPost> readAll() {
        return repo.findAll();
    }

    @Override
    public BoardPost create(BoardPost post) {
        BoardPost added = repo.save(post);
        return added;
    }

    @Override
    public BoardPost readOne(Long id) {
        BoardPost found = repo.findById(id).orElse(null);
        return found;
    }

    @Override
    public List<BoardPost> update(Long id, BoardPost post) {
        BoardPost found = repo.findById(id).orElse(null);
        if(found == null) return null;

        found.setSubject(post.getSubject());
        found.setContent(post.getContent());
        BoardPost update = repo.save(found);

        List<BoardPost> result = new ArrayList<>();
        result.add(found);
        result.add(update);

        return result;
    }

    @Override
    public boolean delete(Long id) {
        BoardPost found = repo.findById(id).orElse(null);
        if(found == null) return false;

        repo.delete(found);
        return true;
    }

    @Override
    public List<BoardPost> readByAuthor(String author) {
        List<BoardPost> post = repo.findByAuthorByCreateAtDESC(author);
        return post;
    }
    
}

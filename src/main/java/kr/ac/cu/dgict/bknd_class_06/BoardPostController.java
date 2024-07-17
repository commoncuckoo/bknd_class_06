package kr.ac.cu.dgict.bknd_class_06;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardPostController {

    @Autowired
    private BoardService serv;

    @PostMapping("/board")
    public BoardPost create(@RequestBody BoardPost entity){
        return serv.create(entity);
    }

    @GetMapping("/board")
    public List<BoardPost> readAll(){
        return serv.readAll();
    }

    @GetMapping("/board/{postid}")
    public BoardPost read(@PathVariable("postid") Long postid){
        return serv.readOne(postid);
    }

    @GetMapping("/board/{postid}")
    public List<BoardPost> update(@PathVariable("postid") Long id, @RequestBody BoardPost post){
        return serv.update(id, post);
    }

    @GetMapping("/board/{postid}")
    public boolean delete(@PathVariable("postid") Long id){
        return serv.delete(id);
    }

}

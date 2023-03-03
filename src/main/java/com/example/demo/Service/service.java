package com.example.demo.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Repository.repository;
import com.example.demo.model.Book;
@Service
public class service {
@Autowired
 repository r;
public String add(Book m) {
	r.save(m);
	return "Added";
}
public List<Book> getDetails(){
	return r.findAll();
}
public Book updateDetails(Book e1) {
	return r.saveAndFlush(e1);
}
public void deleteDetails(int id) {
	r.deleteById(id	);
}
}
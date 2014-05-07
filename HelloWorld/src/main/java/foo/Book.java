package foo;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class Book {
	private Book book;
	private List<Book> books; 
	//指定格式为 <book id="1"/><book id="2"/>  
	@XmlElement(name = "book")  
	public List<Book> getBooks() {  
	    return books;  
	}  
	           
	//格式为<books><book id="1"/><book id="2"/></books>  
//	@XmlElementWrapper(name = "books")  
//	@XmlElement(name = "book")  
//	public List<Book> getBooks {  
//	    return books;  
//	}  
}

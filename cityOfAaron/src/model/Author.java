package model;

import java.io.Serializable;

/**
 *
 * @author gj3593
 */
public class Author implements Serializable {

    private String name;
    private String title;

    public Author() {
        //empty constructor for JavaBeans
    }
    
    public Author(String name, String title) {
        setName(name);
        setTitle(title);
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
     public String getTitle() {
         return title;
     }
     
     public void setTitle(String title) {
         this.title = title;
     }
     
     @Override
     public String toString() {
         return "Author {"
                 + " name = " + name
                 + ", title = " + title
                 + " }";
     }
}

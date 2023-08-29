import com.itheima.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForInstanceBook {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();
    }
}

//这个就是为了看看Bean是怎么来进行创建的
//自动装配不是说将属性给自动装配了，而是将对象给自动装配到里面了
//可以选择要装配的类型是什么来进行
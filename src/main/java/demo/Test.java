package demo;

import com.example.ouyu_blog.dao.ArticleDao;
import com.example.ouyu_blog.entity.Article;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @FileName Test
 * @Description
 * @Author ouyu
 * @Date 2025-02-26
 **/
public class Test {
    public static void main(String[] args) throws IOException {
        InputStream config = Resources.getResourceAsStream("MybatisConfig.xml");
        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(config);
        SqlSession ss = ssf.openSession();
        ArticleDao articleDao = ss.getMapper(ArticleDao.class) ;
        List<Article> list = articleDao.findAllArticle() ;
        list.forEach(System.out::println);
        ss.commit();
        ss.close();
    }
}

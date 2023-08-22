import com.mario.kotlintutorial.Article
import com.mario.kotlintutorial.User
import org.springframework.data.repository.CrudRepository

interface Repositories : CrudRepository<Article, Long> {
    fun findBySlug(slug: String): Article?
    fun findAllByOrderByAddedAtDesc(): Iterable<Article>
}

interface UserRepository : CrudRepository<User, Long> {
    fun findByLogin(login: String): User?
}
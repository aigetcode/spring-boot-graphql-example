package graphql.demo.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import graphql.demo.model.User;
import graphql.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {

    private final UserService userService;

    @Autowired
    public Query(UserService userService) {
        this.userService = userService;
    }

    public Iterable<User> getUsers() {
        return userService.getAllUsers();
    }

    public User getUserById(long id) {
        return userService.getById(id);
    }
}

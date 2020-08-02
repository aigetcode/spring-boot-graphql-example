package graphql.demo.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import graphql.demo.model.City;
import graphql.demo.model.User;
import graphql.demo.service.CityService;
import graphql.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class Mutation implements GraphQLMutationResolver {

    private final UserService userService;
    private final CityService cityService;

    @Autowired
    public Mutation(UserService userService, CityService cityService) {
        this.userService = userService;
        this.cityService = cityService;
    }

    @Transactional
    public User addUser(String nameCity, String username, Boolean isMarried) {
        City city = cityService.getByName(nameCity).isPresent() ?
                cityService.getByName(nameCity).get()
                : new City(nameCity);
        User user = new User(city, username, isMarried);
        return userService.addUser(user);
    }

}

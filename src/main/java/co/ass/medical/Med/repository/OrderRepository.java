package co.ass.medical.Med.repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import co.ass.medical.Med.model.*;
public interface OrderRepository  extends MongoRepository<Order,String>{

}

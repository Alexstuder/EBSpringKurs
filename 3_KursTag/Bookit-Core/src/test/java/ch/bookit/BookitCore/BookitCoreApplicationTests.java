package ch.bookit.BookitCore;

import ch.bookit.model.Client;
import ch.bookit.model.Reservation;
import ch.bookit.model.Restaurant;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.time.LocalTime;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookitCoreApplicationTests {

	@Test
	public void contextLoads() {

		Client client = new Client("Webber","Carl","FoodStreet", "AnyTown");
		Restaurant restaurant = new Restaurant("BestFood","All you can Eat Street" , "SchlemmerCity");

		Reservation reservation = new Reservation(client,restaurant,4, LocalDate.of(2019,06,27), LocalTime.of(18,30,00));


		System.out.println(reservation.toString());

	}

}

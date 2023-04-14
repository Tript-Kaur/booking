package in.aws.practice.SpringBootApigateWay.Model;

import lombok.*;
import org.springframework.context.annotation.ComponentScan;

@Getter @Setter  @AllArgsConstructor @ NoArgsConstructor
public class Ticket {
private String movieName;
private float ticketPrice;
private String  MovieHall;

}

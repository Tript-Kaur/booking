package in.aws.practice.SpringBootApigateWay.Controller;

import in.aws.practice.SpringBootApigateWay.Model.Ticket;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path ="/cinema")
public class BookingController {
    List<Ticket> ticketList = new ArrayList<>();

    @PostMapping(path="/tickets")
    public Ticket addTicket(@RequestBody Ticket ticket) {
        ticketList.add(ticket);
        return ticket;
    }
   // @RequestMapping(method = RequestMethod.GET , value = "/tickets")
    @GetMapping(path="/tickets")
    public List<Ticket> showTickets() {
        return ticketList;
    }

}

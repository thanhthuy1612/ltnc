package com.example.btl.Repository;

import com.example.btl.Base.BaseRepository;
import com.example.btl.Model.Ticket;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TicketRepository extends BaseRepository<Ticket> {
    @Query(value = "from Ticket ticket where ( ticket.rowTicket=?1 and ticket.columnTicket=?2)")
    Optional<Ticket> findByRowColumn(Integer rowTicket, Integer columnTicket);
}

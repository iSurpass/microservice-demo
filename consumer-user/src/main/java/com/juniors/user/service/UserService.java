package com.juniors.user.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.juniors.ticket.service.TicketService;
import org.springframework.stereotype.Service;

/**
 * @author Juniors
 */
@Service
public class UserService {

    @Reference
    TicketService ticketService;

    public String micro(){

        return ticketService.getTicket();
    }
}

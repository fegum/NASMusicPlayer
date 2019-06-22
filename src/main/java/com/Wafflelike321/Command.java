package com.Wafflelike321;

import discord4j.core.event.domain.message.MessageCreateEvent;
import reactor.core.publisher.Mono;

interface Command {
    Mono<Void> execute(MessageCreateEvent event);


}

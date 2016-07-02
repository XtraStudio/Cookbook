package com.xtra.cookbook;

import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameInitializationEvent;
import org.spongepowered.api.event.game.state.GamePreInitializationEvent;
import org.spongepowered.api.plugin.Plugin;

import com.xtra.core.Core;
import com.xtra.core.command.CommandHandler;

@Plugin(name = "CommandBasic", id = "commandbasic")
public class CommandBasic {

    @Listener
    public void onPreInit(GamePreInitializationEvent event) {
        Core.initialize(this);
    }

    public void onInit(GameInitializationEvent event) {
        CommandHandler.create(this);
    }
}

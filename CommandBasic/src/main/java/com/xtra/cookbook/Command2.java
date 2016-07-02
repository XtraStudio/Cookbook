package com.xtra.cookbook;

import org.spongepowered.api.command.CommandResult;
import org.spongepowered.api.command.args.CommandContext;
import org.spongepowered.api.command.args.CommandElement;
import org.spongepowered.api.command.args.GenericArguments;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.text.Text;

import com.xtra.core.command.annotation.RegisterCommand;
import com.xtra.core.command.base.CommandBase;

@RegisterCommand(async = true)
public class Command2 extends CommandBase<Player> {

    public String[] aliases() {
        // Note that the at least one alias is always required. The first one is
        // the primary one and is used for other various things.
        return new String[] {"command2", "command-2"};
    }

    public CommandElement[] args() {
        return new CommandElement[] {GenericArguments.string(Text.of("somestring"))};
    }

    public String description() {
        // No description
        return null;
    }

    public String permission() {
        // No permission
        return null;
    }

    @Override
    public CommandResult executeCommand(Player src, CommandContext args) throws Exception {
        String s = args.<String>getOne("somestring").get();

        src.sendMessage(Text.of("This command is a bit different from Command1 in that it is ran asynchronously from the main thread."));
        src.sendMessage(Text.of("This is specified by the 'async = true' parameter to @RegisterCommand."));
        src.sendMessage(Text.of("Note that this command can also only ever be ran by a player, as specified in the generic for CommandBase."));
        return CommandResult.success();
    }
}

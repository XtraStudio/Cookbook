package com.xtra.cookbook;

import org.spongepowered.api.command.CommandResult;
import org.spongepowered.api.command.CommandSource;
import org.spongepowered.api.command.args.CommandContext;
import org.spongepowered.api.command.args.CommandElement;
import org.spongepowered.api.text.Text;

import com.xtra.core.command.annotation.RegisterCommand;
import com.xtra.core.command.base.CommandBase;

@RegisterCommand
public class Command1 extends CommandBase<CommandSource> {

    public String[] aliases() {
        return new String[] {"command1"};
    }

    public CommandElement[] args() {
        // No arguments
        return null;
    }

    public String description() {
        return "This is command 1!";
    }

    public String permission() {
        return "myplugin.command1";
    }

    @Override
    public CommandResult executeCommand(CommandSource src, CommandContext args) throws Exception {
        src.sendMessage(Text.of("This is the executeCommand method of Command1."));
        src.sendMessage(Text.of("It is similar to the traditional execute method in that your command execution "));
        src.sendMessage(Text.of("code goes in here. The primary difference is all of the added functionality"));
        src.sendMessage(Text.of("and scaffolding that is provided by CommandBase."));

        src.sendMessage(Text.of("If your plugin ever experiences a user error (example: incorrect arguments)"));
        src.sendMessage(Text.of("it is reccomended to throw a TextMessageException (thus the throws Exception on this method)."));
        src.sendMessage(Text.of("A CommandResult#empty is returned in the instance of an error."));
        return CommandResult.success();
    }
}

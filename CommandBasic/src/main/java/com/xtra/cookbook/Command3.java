package com.xtra.cookbook;

import org.spongepowered.api.command.CommandResult;
import org.spongepowered.api.command.CommandSource;
import org.spongepowered.api.command.args.CommandContext;
import org.spongepowered.api.command.args.CommandElement;
import org.spongepowered.api.text.Text;

import com.xtra.core.command.annotation.RegisterCommand;
import com.xtra.core.command.base.CommandBase;

@RegisterCommand(childOf = Command1.class)
public class Command3 extends CommandBase<CommandSource> {

    public String[] aliases() {
        return new String[] {"command3"};
    }

    public CommandElement[] args() {
        return null;
    }

    public String description() {
        return "Coomaand 3!";
    }

    public String permission() {
        return "myplugin.command3";
    }

    @Override
    public CommandResult executeCommand(CommandSource src, CommandContext args) throws Exception {
        src.sendMessage(Text.of("This one is different from the others in that it is a child command to Command1.class."));
        src.sendMessage(Text.of("This means that, to execute it, you must perform:"));
        src.sendMessage(Text.of("/command1 command3"));
        return CommandResult.success();
    }
}

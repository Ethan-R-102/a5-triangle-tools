package triangle.abstractSyntaxTrees.commands;

import triangle.abstractSyntaxTrees.expressions.Expression;
import triangle.abstractSyntaxTrees.visitors.CommandVisitor;
import triangle.syntacticAnalyzer.SourcePosition;

public class IncrementCommand extends Command {


    public IncrementCommand(Expression eAST position) {
        super(position);
    }


    }
}

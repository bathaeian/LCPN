import java.lang.Exception;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {

    public static void main(String[] args) throws Exception {

        if (args.length == 0) {
            args = new String[]{"input.plc"};
        }

        System.out.println("parsing: " + args[0]);

        lcpnLexer lexer = new lcpnLexer(new ANTLRFileStream(args[0]));
        lcpnParser parser = new lcpnParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.lcpn();
        BuildLCPN visitor = new BuildLCPN();
        visitor.visitLcpn(tree);
    }
}
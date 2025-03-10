package visitor;

import org.antlr.v4.runtime.tree.TerminalNode;
import parser.ExpressoesBaseVisitor;
import parser.ExpressoesParser;

/**
 *
 * @author Prof. Dr. David Buzatto
 */
public class ExpressoesVisitorImpl extends ExpressoesBaseVisitor<Number> {
    
    public Number valorFinal;
    
    @Override
    public Number visitExpressao( ExpressoesParser.ExpressaoContext ctx ) {
        
        Number valor = 0;
        
        for ( int i = 0; i < ctx.getChildCount(); i += 2 ) {
            
            if ( i == 0 ) {
                valor = visit( ctx.getChild( i ) );
            } else {

                int op = ( ( TerminalNode ) ctx.getChild( i - 1 ) ).getSymbol().getType();
                Number tv = visit( ctx.getChild( i ) );

                switch ( op ) {
                    
                    case ExpressoesParser.ADI:
                        valor = valor.doubleValue() + tv.doubleValue();
                        break;
                        
                    case ExpressoesParser.SUB:
                        valor = valor.doubleValue() - tv.doubleValue();
                        break;

                }

            }

        }
        
        this.valorFinal = valor;
        return valor;
        
    }
    
    @Override
    public Number visitTermo( ExpressoesParser.TermoContext ctx ) {
        
        Number valor = 0;

        for ( int i = 0; i < ctx.getChildCount(); i += 2 ) {

            if ( i == 0 ) {
                valor = visit( ctx.getChild( i ) );
            } else {

                int op = ( ( TerminalNode ) ctx.getChild( i - 1 ) ).getSymbol().getType();
                Number fv = visit( ctx.getChild( i ) );

                switch ( op ) {
                    
                    case ExpressoesParser.MUL:
                        valor = valor.doubleValue() * fv.doubleValue();
                        break;
                        
                    case ExpressoesParser.DIV:
                        valor = valor.doubleValue() / fv.doubleValue();
                        break;
                        
                    case ExpressoesParser.MOD:
                        valor = valor.doubleValue() % fv.doubleValue();
                        break;

                }

            }

        }

        return valor;
        
    }
    
    @Override
    public Number visitFatorDec( ExpressoesParser.FatorDecContext ctx ) {
        return Double.valueOf( ctx.getChild( 0 ).getText() );
    }

    @Override
    public Number visitFatorInt( ExpressoesParser.FatorIntContext ctx ) {
        return Integer.valueOf( ctx.getChild( 0 ).getText() );
    }

    @Override
    public Number visitFatorParenteses( ExpressoesParser.FatorParentesesContext ctx ) {
        return visit( ctx.getChild( 1 ) );
    }
    
}

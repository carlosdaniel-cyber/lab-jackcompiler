package br.ufma.ecp;

import static br.ufma.ecp.token.TokenType.*;



import br.ufma.ecp.token.Token;
import br.ufma.ecp.token.TokenType; 

public class App 
{

    
    public static void main( String[] args )
    {

    
        String input = """
                /*
                 * sla kkkkkkkkkkkkkkkkkkkkkkkkkkkkk
                */
                let x = 5 * (3 + 4) / 2 - 10

                void genericFunction() {
                    while (condition) {
                        if (anotherCondition) do something;
                    }

                    return value;
                }
                """;;
        Scanner scan = new Scanner (input.getBytes());
        for (Token tk = scan.nextToken(); tk.type != TokenType.EOF; tk = scan.nextToken()) {
                System.out.println(tk);
        }

        /*
        Parser p = new Parser (input.getBytes());
        p.parse();
        */


        //Parser p = new Parser (fromFile().getBytes());
        //p.parse();

        /*
        String input = "489-85+69";
        Scanner scan = new Scanner (input.getBytes());
        System.out.println(scan.nextToken());
        System.out.println(scan.nextToken());
        System.out.println(scan.nextToken());
        System.out.println(scan.nextToken());
        System.out.println(scan.nextToken());
        Token tk = new Token(NUMBER, "42");
        System.out.println(tk);
        */
    }
}

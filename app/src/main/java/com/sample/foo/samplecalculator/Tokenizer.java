package com.sample.foo.samplecalculator;

import java.util.LinkedList;
import java.util.regex.Pattern;

/**
 * Created by darcy on 25/4/17.
 */

public class Tokenizer {
    private LinkedList<TokenInfo> tokenInfos;
    private LinkedList<Token> tokens;

    private class TokenInfo{
        public final Pattern regex;
        public final int token;

        public TokenInfo(Pattern regex, int token){
            super();
            this.regex = regex;
            this.token = token;

        }
    }

    public Tokenizer(){
        tokenInfos = new LinkedList<TokenInfo>();
        tokens = new LinkedList<Token>();
    }

    public void add(String regex, int token){
        tokenInfos.add(
                new TokenInfo(
                        Pattern.compile("^("+regex+")"), token
                )
        );
    }

    public class Token {
        public final int token;
        public final String seq;

        public Token(int token, String seq){
            super();
            this.token = token;
            this.seq = seq;
        }
    }


}

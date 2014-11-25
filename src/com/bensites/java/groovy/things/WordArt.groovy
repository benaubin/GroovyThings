package com.bensites.java.groovy.things

/**
 * Created by Ben on 11/24/14.
 */
class WordArt {

    static final def letters = [
            'A' : """
     /\\
    /  \\
   / /\\ \\
  / ____ \\
 /_/    \\_\\""",
            'B' : """  ____
 |  _ \\
 | |_) |
 |  _ <
 | |_) |
 |____/ """,
            'C' : """   _____
  / ____|
 | |
 | |
 | |____
  \\_____|""",
            'D' : """  _____
 |  __ \\
 | |  | |
 | |  | |
 | |__| |
 |_____/ """]

    static String fromLetter(String Letter){
        letters.get(Letter + '\n')
    }
}

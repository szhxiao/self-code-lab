/**
 * Core Java Volume I-Fundamentals
 *
 * @version 10th
 * @author Cay S. Horstmann
 * @see http://horstmann.com/corejava
 */

import java.awt.GraphicsEnvironment;

/**
 * This program lists all fonts.
 */
public class ListFonts {
    public static void main(String[] args) {
        String[] fontNames = GraphicsEnvironment.getLocalGraphicsEnvironment()
            .getAvailableFontFamilyNames();

        for (String fontName : fontNames) {
            System.out.println(fontName);
        }
    }
}

/*
output:
Abyssinica SIL
Ani
AnjaliOldLipi
AR PL UKai CN
AR PL UKai HK
AR PL UKai TW
AR PL UKai TW MBE
AR PL UMing CN
AR PL UMing HK
AR PL UMing TW
AR PL UMing TW MBE
Arvo
Bitstream Charter
Bitstream Vera Sans
Bitstream Vera Sans Mono
Bitstream Vera Serif
...
Ubuntu
Ubuntu Condensed
Ubuntu Light
Ubuntu Mono
Umpush
Uroob
URW Bookman L
URW Chancery L
URW Gothic L
URW Palladio L
utkal
Vemana2000
Waree
 */
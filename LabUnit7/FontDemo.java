package LabUnit7;

import java.awt.Font;

public class FontDemo {
    public static void main(String[] args) {
        // Create font: TimesRoman, Bold + Italic, Size 12
        Font myFont = new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12);

        // Displaying attributes using font methods
        System.out.println("Font Name: " + myFont.getName());
        System.out.println("Font Family: " + myFont.getFamily());
        System.out.println("Font Style: " + myFont.getStyle());
        System.out.println("Font Size: " + myFont.getSize());
        
        // Checking specific styles
        System.out.println("Is Bold: " + myFont.isBold());
        System.out.println("Is Italic: " + myFont.isItalic());
    }
}

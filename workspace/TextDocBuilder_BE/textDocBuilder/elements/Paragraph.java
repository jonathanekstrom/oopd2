package textDocBuilder.elements;

import textDocBuilder.interfaces.IElement;

public class Paragraph implements IElement
{

    @Override
    public void render() {
        System.out.println("I'm a Paragraph");
    }
}
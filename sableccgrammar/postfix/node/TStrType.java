/* This file was generated by SableCC (http://www.sablecc.org/). */

package postfix.node;

import postfix.analysis.*;

@SuppressWarnings("nls")
public final class TStrType extends Token
{
    public TStrType()
    {
        super.setText("string");
    }

    public TStrType(int line, int pos)
    {
        super.setText("string");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TStrType(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTStrType(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TStrType text.");
    }
}

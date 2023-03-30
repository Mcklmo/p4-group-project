/* This file was generated by SableCC (http://www.sablecc.org/). */

package postfix.node;

import postfix.analysis.*;

@SuppressWarnings("nls")
public final class AValExpr2 extends PExpr2
{
    private PVal _val_;

    public AValExpr2()
    {
        // Constructor
    }

    public AValExpr2(
        @SuppressWarnings("hiding") PVal _val_)
    {
        // Constructor
        setVal(_val_);

    }

    @Override
    public Object clone()
    {
        return new AValExpr2(
            cloneNode(this._val_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAValExpr2(this);
    }

    public PVal getVal()
    {
        return this._val_;
    }

    public void setVal(PVal node)
    {
        if(this._val_ != null)
        {
            this._val_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._val_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._val_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._val_ == child)
        {
            this._val_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._val_ == oldChild)
        {
            setVal((PVal) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

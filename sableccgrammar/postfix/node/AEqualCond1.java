/* This file was generated by SableCC (http://www.sablecc.org/). */

package postfix.node;

import postfix.analysis.*;

@SuppressWarnings("nls")
public final class AEqualCond1 extends PCond1
{
    private PCond2 _cond2_;

    public AEqualCond1()
    {
        // Constructor
    }

    public AEqualCond1(
        @SuppressWarnings("hiding") PCond2 _cond2_)
    {
        // Constructor
        setCond2(_cond2_);

    }

    @Override
    public Object clone()
    {
        return new AEqualCond1(
            cloneNode(this._cond2_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEqualCond1(this);
    }

    public PCond2 getCond2()
    {
        return this._cond2_;
    }

    public void setCond2(PCond2 node)
    {
        if(this._cond2_ != null)
        {
            this._cond2_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._cond2_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._cond2_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._cond2_ == child)
        {
            this._cond2_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._cond2_ == oldChild)
        {
            setCond2((PCond2) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

/* This file was generated by SableCC (http://www.sablecc.org/). */

package postfix.node;

import postfix.analysis.*;

@SuppressWarnings("nls")
public final class AAndCond1 extends PCond1
{
    private PCond2 _cond2_;
    private TAnd _and_;
    private PCond1 _cond1_;

    public AAndCond1()
    {
        // Constructor
    }

    public AAndCond1(
        @SuppressWarnings("hiding") PCond2 _cond2_,
        @SuppressWarnings("hiding") TAnd _and_,
        @SuppressWarnings("hiding") PCond1 _cond1_)
    {
        // Constructor
        setCond2(_cond2_);

        setAnd(_and_);

        setCond1(_cond1_);

    }

    @Override
    public Object clone()
    {
        return new AAndCond1(
            cloneNode(this._cond2_),
            cloneNode(this._and_),
            cloneNode(this._cond1_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAndCond1(this);
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

    public TAnd getAnd()
    {
        return this._and_;
    }

    public void setAnd(TAnd node)
    {
        if(this._and_ != null)
        {
            this._and_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._and_ = node;
    }

    public PCond1 getCond1()
    {
        return this._cond1_;
    }

    public void setCond1(PCond1 node)
    {
        if(this._cond1_ != null)
        {
            this._cond1_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._cond1_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._cond2_)
            + toString(this._and_)
            + toString(this._cond1_);
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

        if(this._and_ == child)
        {
            this._and_ = null;
            return;
        }

        if(this._cond1_ == child)
        {
            this._cond1_ = null;
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

        if(this._and_ == oldChild)
        {
            setAnd((TAnd) newChild);
            return;
        }

        if(this._cond1_ == oldChild)
        {
            setCond1((PCond1) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

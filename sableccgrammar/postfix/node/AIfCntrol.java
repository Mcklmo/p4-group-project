/* This file was generated by SableCC (http://www.sablecc.org/). */

package postfix.node;

import postfix.analysis.*;

@SuppressWarnings("nls")
public final class AIfCntrol extends PCntrol
{
    private PIfStmt _ifStmt_;

    public AIfCntrol()
    {
        // Constructor
    }

    public AIfCntrol(
        @SuppressWarnings("hiding") PIfStmt _ifStmt_)
    {
        // Constructor
        setIfStmt(_ifStmt_);

    }

    @Override
    public Object clone()
    {
        return new AIfCntrol(
            cloneNode(this._ifStmt_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIfCntrol(this);
    }

    public PIfStmt getIfStmt()
    {
        return this._ifStmt_;
    }

    public void setIfStmt(PIfStmt node)
    {
        if(this._ifStmt_ != null)
        {
            this._ifStmt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ifStmt_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._ifStmt_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._ifStmt_ == child)
        {
            this._ifStmt_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._ifStmt_ == oldChild)
        {
            setIfStmt((PIfStmt) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

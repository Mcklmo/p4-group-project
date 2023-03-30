/* This file was generated by SableCC (http://www.sablecc.org/). */

package postfix.node;

import postfix.analysis.*;

@SuppressWarnings("nls")
public final class ANumDcl extends PDcl
{
    private TNumType _numType_;
    private PAssignStmt _assignStmt_;

    public ANumDcl()
    {
        // Constructor
    }

    public ANumDcl(
        @SuppressWarnings("hiding") TNumType _numType_,
        @SuppressWarnings("hiding") PAssignStmt _assignStmt_)
    {
        // Constructor
        setNumType(_numType_);

        setAssignStmt(_assignStmt_);

    }

    @Override
    public Object clone()
    {
        return new ANumDcl(
            cloneNode(this._numType_),
            cloneNode(this._assignStmt_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANumDcl(this);
    }

    public TNumType getNumType()
    {
        return this._numType_;
    }

    public void setNumType(TNumType node)
    {
        if(this._numType_ != null)
        {
            this._numType_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._numType_ = node;
    }

    public PAssignStmt getAssignStmt()
    {
        return this._assignStmt_;
    }

    public void setAssignStmt(PAssignStmt node)
    {
        if(this._assignStmt_ != null)
        {
            this._assignStmt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._assignStmt_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._numType_)
            + toString(this._assignStmt_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._numType_ == child)
        {
            this._numType_ = null;
            return;
        }

        if(this._assignStmt_ == child)
        {
            this._assignStmt_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._numType_ == oldChild)
        {
            setNumType((TNumType) newChild);
            return;
        }

        if(this._assignStmt_ == oldChild)
        {
            setAssignStmt((PAssignStmt) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

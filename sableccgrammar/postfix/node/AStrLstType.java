/* This file was generated by SableCC (http://www.sablecc.org/). */

package postfix.node;

import postfix.analysis.*;

@SuppressWarnings("nls")
public final class AStrLstType extends PType
{
    private TStrType _strType_;
    private TListDcl _listDcl_;

    public AStrLstType()
    {
        // Constructor
    }

    public AStrLstType(
        @SuppressWarnings("hiding") TStrType _strType_,
        @SuppressWarnings("hiding") TListDcl _listDcl_)
    {
        // Constructor
        setStrType(_strType_);

        setListDcl(_listDcl_);

    }

    @Override
    public Object clone()
    {
        return new AStrLstType(
            cloneNode(this._strType_),
            cloneNode(this._listDcl_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAStrLstType(this);
    }

    public TStrType getStrType()
    {
        return this._strType_;
    }

    public void setStrType(TStrType node)
    {
        if(this._strType_ != null)
        {
            this._strType_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._strType_ = node;
    }

    public TListDcl getListDcl()
    {
        return this._listDcl_;
    }

    public void setListDcl(TListDcl node)
    {
        if(this._listDcl_ != null)
        {
            this._listDcl_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._listDcl_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._strType_)
            + toString(this._listDcl_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._strType_ == child)
        {
            this._strType_ = null;
            return;
        }

        if(this._listDcl_ == child)
        {
            this._listDcl_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._strType_ == oldChild)
        {
            setStrType((TStrType) newChild);
            return;
        }

        if(this._listDcl_ == oldChild)
        {
            setListDcl((TListDcl) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

package xiao.free.superadapter.listview.base;


import xiao.free.superadapter.listview.ViewHolder;

/**
 * Created by xiaoguochang on 18/10/7.
 */
public interface ItemViewDelegate<T>
{

    public abstract int getItemViewLayoutId();

    public abstract boolean isForViewType(T item, int position);

    public abstract void convert(ViewHolder holder, T t, int position);



}

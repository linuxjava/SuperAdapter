package xiao.free.superadapter.recycview.base;


/**
 * Created by xiaoguochang on 18/10/7.
 */
public interface ItemViewDelegate<T>
{

    int getItemViewLayoutId();

    boolean isForViewType(T item, int position);

    void convert(ViewHolder holder, T t, int position);

}

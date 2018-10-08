package adapter.asuper.com.superadapter.recycview.adapter;

import android.content.Context;

import adapter.asuper.com.superadapter.R;
import adapter.asuper.com.superadapter.recycview.bean.ChatMessage;
import xiao.free.superadapter.recycview.MultiItemTypeAdapter;
import xiao.free.superadapter.recycview.base.ItemViewDelegate;
import xiao.free.superadapter.recycview.base.ViewHolder;

public class MultiAdapter extends MultiItemTypeAdapter<ChatMessage> {
    public MultiAdapter(Context context) {
        super(context);

        addItemViewDelegate(new SendTextHolder());
        addItemViewDelegate(new RecvTextHolder());
    }


    public static class SendTextHolder implements ItemViewDelegate<ChatMessage> {

        @Override
        public int getItemViewLayoutId() {
            return R.layout.item_chat_send_msg;
        }

        @Override
        public boolean isForViewType(ChatMessage item, int position) {
            return item.getItemType() == ChatMessage.ITEM_TYPE_SEND_TEXT;
        }

        @Override
        public void convert(ViewHolder holder, ChatMessage chatMessage, int position) {

        }
    }

    public static class RecvTextHolder implements ItemViewDelegate<ChatMessage> {

        @Override
        public int getItemViewLayoutId() {
            return R.layout.item_chat_recv_msg;
        }

        @Override
        public boolean isForViewType(ChatMessage item, int position) {
            return item.getItemType() == ChatMessage.ITEM_TYPE_RECV_TEXT;
        }

        @Override
        public void convert(ViewHolder holder, ChatMessage chatMessage, int position) {

        }
    }
}

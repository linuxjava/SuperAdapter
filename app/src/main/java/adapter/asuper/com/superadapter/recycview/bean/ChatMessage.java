package adapter.asuper.com.superadapter.recycview.bean;

import java.util.ArrayList;
import java.util.List;

import adapter.asuper.com.superadapter.R;

public class ChatMessage {
    public static final int ITEM_TYPE_SEND_TEXT = 1;
    public static final int ITEM_TYPE_RECV_TEXT = 2;
    public static final int ITEM_TYPE_SEND_VOICE = 3;
    public static final int ITEM_TYPE_RECV_VOICE = 4;

    private int itemType;
    private String name;
    private String content;

    public ChatMessage(int itemType, String name, String content) {
        this.itemType = itemType;
        this.name = name;
        this.content = content;
    }

    public int getItemType() {
        return itemType;
    }

    public void setItemType(int itemType) {
        this.itemType = itemType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static List<ChatMessage> MOCK_DATAS = new ArrayList<>();

    static {
        ChatMessage msg = null;
        msg = new ChatMessage(ITEM_TYPE_SEND_TEXT, "xiaohei", "where are you ");
        MOCK_DATAS.add(msg);
        msg = new ChatMessage(ITEM_TYPE_RECV_TEXT, "xiaohei", "where are you ");
        MOCK_DATAS.add(msg);
        msg = new ChatMessage(ITEM_TYPE_SEND_TEXT, "xiaohei", "where are you ");
        MOCK_DATAS.add(msg);
        msg = new ChatMessage(ITEM_TYPE_RECV_TEXT, "xiaohei", "where are you ");
        MOCK_DATAS.add(msg);
        msg = new ChatMessage(ITEM_TYPE_SEND_TEXT, "xiaohei", "where are you ");
        MOCK_DATAS.add(msg);
        msg = new ChatMessage(ITEM_TYPE_RECV_TEXT, "xiaohei", "where are you ");
        MOCK_DATAS.add(msg);
        msg = new ChatMessage(ITEM_TYPE_SEND_TEXT, "xiaohei", "where are you ");
        MOCK_DATAS.add(msg);
        msg = new ChatMessage(ITEM_TYPE_RECV_TEXT, "xiaohei", "where are you ");
        MOCK_DATAS.add(msg);
        msg = new ChatMessage(ITEM_TYPE_SEND_TEXT, "xiaohei", "where are you ");
        MOCK_DATAS.add(msg);
        msg = new ChatMessage(ITEM_TYPE_RECV_TEXT, "xiaohei", "where are you ");
        MOCK_DATAS.add(msg);
        msg = new ChatMessage(ITEM_TYPE_SEND_TEXT, "xiaohei", "where are you ");
        MOCK_DATAS.add(msg);
        msg = new ChatMessage(ITEM_TYPE_RECV_TEXT, "xiaohei", "where are you ");
        MOCK_DATAS.add(msg);
        msg = new ChatMessage(ITEM_TYPE_SEND_TEXT, "xiaohei", "where are you ");
        MOCK_DATAS.add(msg);
        msg = new ChatMessage(ITEM_TYPE_RECV_TEXT, "xiaohei", "where are you ");
        MOCK_DATAS.add(msg);
        msg = new ChatMessage(ITEM_TYPE_SEND_TEXT, "xiaohei", "where are you ");
        MOCK_DATAS.add(msg);
        msg = new ChatMessage(ITEM_TYPE_RECV_TEXT, "xiaohei", "where are you ");
        MOCK_DATAS.add(msg);
        msg = new ChatMessage(ITEM_TYPE_SEND_TEXT, "xiaohei", "where are you ");
        MOCK_DATAS.add(msg);
        msg = new ChatMessage(ITEM_TYPE_RECV_TEXT, "xiaohei", "where are you ");
        MOCK_DATAS.add(msg);
        msg = new ChatMessage(ITEM_TYPE_SEND_TEXT, "xiaohei", "where are you ");
        MOCK_DATAS.add(msg);
        msg = new ChatMessage(ITEM_TYPE_RECV_TEXT, "xiaohei", "where are you ");
        MOCK_DATAS.add(msg);
        msg = new ChatMessage(ITEM_TYPE_SEND_TEXT, "xiaohei", "where are you ");
        MOCK_DATAS.add(msg);
        msg = new ChatMessage(ITEM_TYPE_RECV_TEXT, "xiaohei", "where are you ");
        MOCK_DATAS.add(msg);
        msg = new ChatMessage(ITEM_TYPE_SEND_TEXT, "xiaohei", "where are you ");
        MOCK_DATAS.add(msg);
        msg = new ChatMessage(ITEM_TYPE_RECV_TEXT, "xiaohei", "where are you ");
        MOCK_DATAS.add(msg);
        msg = new ChatMessage(ITEM_TYPE_SEND_TEXT, "xiaohei", "where are you ");
        MOCK_DATAS.add(msg);
        msg = new ChatMessage(ITEM_TYPE_RECV_TEXT, "xiaohei", "where are you ");
        MOCK_DATAS.add(msg);
        msg = new ChatMessage(ITEM_TYPE_SEND_TEXT, "xiaohei", "where are you ");
        MOCK_DATAS.add(msg);
        msg = new ChatMessage(ITEM_TYPE_RECV_TEXT, "xiaohei", "where are you ");
        MOCK_DATAS.add(msg);
        msg = new ChatMessage(ITEM_TYPE_SEND_TEXT, "xiaohei", "where are you ");
        MOCK_DATAS.add(msg);
        msg = new ChatMessage(ITEM_TYPE_RECV_TEXT, "xiaohei", "where are you ");
        MOCK_DATAS.add(msg);
        msg = new ChatMessage(ITEM_TYPE_SEND_TEXT, "xiaohei", "where are you ");
        MOCK_DATAS.add(msg);
    }
}

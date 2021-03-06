package com.qunar.im.ui.activity;

import android.os.Bundle;

import com.qunar.im.base.util.Constants;
import com.qunar.im.ui.R;
import com.qunar.im.ui.fragment.ConversationFragment;
import com.qunar.im.ui.fragment.GalleryFragment;
import com.qunar.im.ui.util.StatusBarUtil;
import com.qunar.im.ui.view.QtNewActionBar;
import com.qunar.im.ui.view.swipBackLayout.SwipeBackActivity;

public class UnReadChatListActivity extends SwipeBackActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        StatusBarUtil.setTransparentForImageView(this, null);
        setContentView(R.layout.atom_ui_unread_chatlist_activity);
        Bundle bundle = getIntent().getExtras();
        QtNewActionBar actionBar = (QtNewActionBar) this.findViewById(R.id.my_action_bar);
        setNewActionBar(actionBar);
        setActionBarTitle("未读消息");
        initList();
    }

    private void initList() {
        ConversationFragment conversationFragment = new ConversationFragment();

        Bundle bundle = new Bundle();
        bundle.putBoolean("isOnlyUnRead",true);
        conversationFragment.setArguments(bundle);
        getSupportFragmentManager().beginTransaction()

                .replace(R.id.unread_list_view, conversationFragment)

                .commit();
    }
}

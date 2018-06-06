package com.chenguang.weather.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.callback.ItemDragAndSwipeCallback;
import com.chad.library.adapter.base.listener.OnItemDragListener;
import com.chad.library.adapter.base.listener.OnItemSwipeListener;
import com.chenguang.weather.R;
import com.chenguang.weather.adapter.AddressAdapter;
import com.chenguang.weather.base.BaseActivity;
import com.chenguang.weather.bean.AddressBean;
import com.chenguang.weather.event.CityEvent;
import com.chenguang.weather.event.MoveCityEvent;
import com.chenguang.weather.utils.ActivityUtils;

import org.greenrobot.eventbus.EventBus;

import java.io.Serializable;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

public class AddressActivity extends BaseActivity {

    @BindView(R.id.rv_address)
    RecyclerView rvAddress;
    @BindView(R.id.iv_back)
    ImageView ivBack;
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.title_bar)
    ConstraintLayout titleBar;
    @BindView(R.id.fb_add)
    FloatingActionButton fbAdd;
    private AddressAdapter mAdapter;
    private List<AddressBean> mAddresses;
    private ItemTouchHelper itemTouchHelper;

    public static void startActivity(Context context, List<AddressBean> addressBeans) {
        Intent intent = new Intent(context, AddressActivity.class);
        intent.putExtra("address", (Serializable) addressBeans);
        context.startActivity(intent);
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_address;
    }

    @Override
    protected void initData() {
        titleBar.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        tvTitle.setText("城市管理");
        mAddresses = (List<AddressBean>) getIntent().getSerializableExtra
                ("address");
        fbAdd.startAnimation(AnimationUtils.loadAnimation(mActivity, R.anim
                .anim_float_button_action));
    }

    @Override
    protected void initView() {
        rvAddress.setLayoutManager(new LinearLayoutManager(mActivity));
        mAdapter = new AddressAdapter(mAddresses);
        ItemDragAndSwipeCallback itemDragAndSwipeCallback = new ItemDragAndSwipeCallback(mAdapter) {
            /*
            屏蔽第一项的拖拽
             */
            @Override
            public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder source,
                                  RecyclerView.ViewHolder target) {
                if (source.getLayoutPosition() == 0 || target.getLayoutPosition() == 0) {
                    return false;
                }
                return super.onMove(recyclerView, source, target);
            }

            /*
            屏蔽第一项的侧滑
             */
            @Override
            public void onChildDraw(Canvas c, RecyclerView recyclerView, RecyclerView.ViewHolder
                    viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive) {
                if (viewHolder.getAdapterPosition() == 0) {
                    return;
                }
                super.onChildDraw(c, recyclerView, viewHolder, dX, dY, actionState,
                        isCurrentlyActive);
            }

            @Override
            public void onChildDrawOver(Canvas c, RecyclerView recyclerView, RecyclerView
                    .ViewHolder viewHolder, float dX, float dY, int actionState, boolean
                                                isCurrentlyActive) {
                if (viewHolder.getAdapterPosition() == 0) {
                    return;
                }
                super.onChildDrawOver(c, recyclerView, viewHolder, dX, dY, actionState,
                        isCurrentlyActive);
            }

            @Override
            public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
                if (viewHolder.getAdapterPosition() == 0) {
                    return;
                }
                super.onSwiped(viewHolder, direction);
            }
        };
        itemTouchHelper = new ItemTouchHelper(itemDragAndSwipeCallback);
        itemTouchHelper.attachToRecyclerView(rvAddress);
        itemDragAndSwipeCallback.setSwipeMoveFlags(ItemTouchHelper.START | ItemTouchHelper.END);
        itemDragAndSwipeCallback.setDragMoveFlags(ItemTouchHelper.UP | ItemTouchHelper.DOWN);
        mAdapter.enableSwipeItem();
        mAdapter.setOnItemSwipeListener(new OnItemSwipeListener() {
            @Override
            public void onItemSwipeStart(RecyclerView.ViewHolder viewHolder, int pos) {

            }

            @Override
            public void clearView(RecyclerView.ViewHolder viewHolder, int pos) {

            }

            @Override
            public void onItemSwiped(RecyclerView.ViewHolder viewHolder, int pos) {
                AddressBean addressBean = mAdapter.getData().get(pos);
                CityEvent event = new CityEvent(addressBean.city);
                event.isDelete = true;
                EventBus.getDefault().post(event);
            }

            @Override
            public void onItemSwipeMoving(Canvas canvas, RecyclerView.ViewHolder viewHolder,
                                          float dX, float dY, boolean isCurrentlyActive) {
                canvas.drawColor(ContextCompat.getColor(AddressActivity.this, R.color
                        .color_red));

            }
        });
        mAdapter.enableDragItem(itemTouchHelper);
        mAdapter.setOnItemDragListener(new OnItemDragListener() {
            @Override
            public void onItemDragStart(RecyclerView.ViewHolder viewHolder, int pos) {
            }

            @Override
            public void onItemDragMoving(RecyclerView.ViewHolder source, int from, RecyclerView
                    .ViewHolder target, int to) {
                EventBus.getDefault().post(new MoveCityEvent(mAdapter.getData().get(from).city,
                        mAdapter.getData().get(to).city));
            }

            @Override
            public void onItemDragEnd(RecyclerView.ViewHolder viewHolder, int pos) {

            }
        });
        rvAddress.setAdapter(mAdapter);
        mAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                AddressBean addressBean = (AddressBean) adapter.getData().get(position);
                finish();
                EventBus.getDefault().post(new CityEvent(addressBean.city));
            }
        });
    }

    @OnClick(R.id.iv_back)
    public void onClick() {
        finish();
    }

    @OnClick(R.id.fb_add)
    public void add() {
        SearchCityActivity.startActivity(mActivity, mAddresses);
    }
}

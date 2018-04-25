package com.trotri.android.java.sample.data;

import android.content.Context;

import com.trotri.android.java.sample.R;
import com.trotri.android.java.sample.data.bean.ButtonPanelBean;
import com.trotri.android.library.App;

import java.util.ArrayList;
import java.util.List;

/**
 * ButtonPanelService class file
 * 按钮面板数据业务类
 *
 * @author 宋欢 <trotri@yeah.net>
 * @version $Id: ButtonPanelService.java 1 2017-05-01 10:00:06Z huan.song $
 * @since 1.0
 */
public class ButtonPanelService {
    /**
     * 按钮实体列表
     */
    private List<ButtonPanelBean.Item> mItems;

    /**
     * 获取按钮列表
     *
     * @return 按钮列表，a List<ButtonPanelBean.Item> Object
     */
    public List<ButtonPanelBean.Item> findRows() {
        if (mItems == null) {
            mItems = new ArrayList<>();
            Context c = App.getContext();

            mItems.add(new ButtonPanelBean.Item(ButtonPanelBean.DATA_ADAPTER, c.getString(R.string.data_adapter)));
            mItems.add(new ButtonPanelBean.Item(ButtonPanelBean.ROUNDED_IMAGE_VIEW, c.getString(R.string.rounded_image_view)));
        }

        return mItems;
    }

}
package com.component.inter;

import java.awt.color.ICC_ColorSpace;
import java.util.ArrayList;

/**
 * Created by Shape on 2017/7/29.
 * 树枝节点接口
 */
public interface IBranch extends ICrop {
    /**
     * 添加子节点
     * @param iCrop
     */
    public void addSubordinate(ICrop iCrop);

    /**
     * 获取子节点列表
     * @return
     */
    public ArrayList<ICrop> getSubordinate();
}

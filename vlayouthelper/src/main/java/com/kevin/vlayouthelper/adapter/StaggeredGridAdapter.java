/*
 * MIT License
 *
 * Copyright (c) 2017 Kevin zhou
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.kevin.vlayouthelper.adapter;

import com.alibaba.android.vlayout.layout.StaggeredGridLayoutHelper;

import java.util.List;

/**
 * LinearAdapter
 *
 * -------------------------
 * |           |           |
 * |           |           |
 * ------------|           |
 * |           |-----------|
 * |           |           |
 * ------------|           |
 *             |           |
 *             |-----------|
 *
 * @author zwenkai@foxmail.com
 * @date Created on 2017-04-10 02:47:15
 * @since 1.0.0
 */

public abstract class StaggeredGridAdapter<T> extends ClickableAdapter<StaggeredGridLayoutHelper> {

    private int mNumLanes;
    private int mGap;

    protected List<T> mItems;

    public StaggeredGridAdapter(int lanes) {
        this(lanes, 0);
    }

    public StaggeredGridAdapter(int lanes, int gap) {
        this(null, lanes, gap);
    }

    public StaggeredGridAdapter(List<T> items, int lanes) {
        this(items, lanes, 0);
    }

    public StaggeredGridAdapter(List<T> items, int lanes, int gap) {
        this.mItems = items;
        this.mNumLanes = lanes;
        this.mGap = gap;
    }

    @Override
    public StaggeredGridLayoutHelper getLayoutHelper() {
        return new StaggeredGridLayoutHelper(mNumLanes, mGap);
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    @Override
    public int getItemViewType(int position) {
        return getViewType();
    }

    /**
     * get ViewType
     * If the ViewType is same，please use getViewType rather than getViewType.
     *
     * @return
     */
    public int getViewType() {
        return 0;
    }

}

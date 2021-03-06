/*
 * MIT License
 *
 * Copyright (c) 2018 Kevin zhou
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
package com.kevin.vlayouthelper.animation;

import android.animation.ObjectAnimator;
import android.support.v7.widget.RecyclerView;
import android.view.animation.DecelerateInterpolator;

/**
 * Slide In Right Animation
 *
 * @author zwenkai@foxmail.com
 * @date 2018-01-25 11:08:30
 * @since 1.1.0
 */

public class SlideInRightAnimation extends BaseAnimation {

    @Override
    protected void start(RecyclerView.ViewHolder holder) {
        ObjectAnimator translationX = ObjectAnimator
                .ofFloat(holder.itemView, "translationX", holder.itemView.getRootView().getWidth(), 0);
        translationX
                .setDuration(250)
                .setInterpolator(new DecelerateInterpolator());
        translationX.start();
    }

}

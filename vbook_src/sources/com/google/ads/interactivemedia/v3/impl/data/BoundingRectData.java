package com.google.ads.interactivemedia.v3.impl.data;

import android.view.View;
import com.google.ads.interactivemedia.v3.impl.data.AutoValue_BoundingRectData;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public abstract class BoundingRectData {

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes.dex */
    public static abstract class Builder {
        public abstract BoundingRectData build();

        public abstract Builder height(int i);

        public abstract Builder left(int i);

        public Builder locationOnScreenOfView(View view) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            return left(iArr[0]).top(iArr[1]).height(view.getHeight()).width(view.getWidth());
        }

        public abstract Builder top(int i);

        public abstract Builder width(int i);
    }

    public static Builder builder() {
        return new AutoValue_BoundingRectData.Builder();
    }

    public abstract int height();

    public abstract int left();

    public abstract int top();

    public abstract int width();
}

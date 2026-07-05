package com.google.ads.interactivemedia.v3.impl.data;

import android.view.View;
import com.google.ads.interactivemedia.v3.impl.data.AutoValue_FriendlyObstructionImpl;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public abstract class FriendlyObstructionImpl implements rt4 {

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes.dex */
    public interface Builder {
        FriendlyObstructionImpl build();

        Builder detailedReason(String str);

        Builder purpose(st4 st4Var);

        Builder view(View view);
    }

    public static Builder builder() {
        return new AutoValue_FriendlyObstructionImpl.Builder();
    }

    public abstract String detailedReason();

    @Override // defpackage.rt4
    public String getDetailedReason() {
        return detailedReason();
    }

    @Override // defpackage.rt4
    public st4 getPurpose() {
        return purpose();
    }

    @Override // defpackage.rt4
    public View getView() {
        return view();
    }

    public abstract st4 purpose();

    public abstract View view();
}

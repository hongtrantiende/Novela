package defpackage;

import com.google.android.material.carousel.CarouselLayoutManager;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i71  reason: default package */
/* loaded from: classes.dex */
public final class i71 extends ny0 {
    public final /* synthetic */ CarouselLayoutManager c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i71(CarouselLayoutManager carouselLayoutManager) {
        super(0, 1);
        this.c = carouselLayoutManager;
    }

    @Override // defpackage.ny0
    public final int i() {
        CarouselLayoutManager carouselLayoutManager = this.c;
        if (carouselLayoutManager.x0()) {
            return carouselLayoutManager.m;
        }
        return 0;
    }
}

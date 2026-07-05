package defpackage;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pjd  reason: default package */
/* loaded from: classes.dex */
public final class pjd extends ojd {
    public pjd(tjd tjdVar, WindowInsets windowInsets) {
        super(tjdVar, windowInsets);
    }

    @Override // defpackage.ijd, defpackage.qjd
    public List<Rect> f(int i) {
        return this.c.getBoundingRects(sjd.a(i));
    }

    @Override // defpackage.ijd, defpackage.qjd
    public List<Rect> g(int i) {
        return this.c.getBoundingRectsIgnoringVisibility(sjd.a(i));
    }

    public pjd(tjd tjdVar, pjd pjdVar) {
        super(tjdVar, pjdVar);
    }

    @Override // defpackage.ijd, defpackage.qjd
    public void q() {
    }
}

package defpackage;

import android.view.View;
import android.view.WindowInsets;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mjd  reason: default package */
/* loaded from: classes.dex */
public class mjd extends ljd {
    public static final tjd w;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        w = tjd.c(windowInsets, null);
    }

    public mjd(tjd tjdVar, WindowInsets windowInsets) {
        super(tjdVar, windowInsets);
    }

    @Override // defpackage.ijd, defpackage.qjd
    public cx5 i(int i) {
        return cx5.c(this.c.getInsets(rjd.a(i)));
    }

    @Override // defpackage.ijd, defpackage.qjd
    public cx5 j(int i) {
        return cx5.c(this.c.getInsetsIgnoringVisibility(rjd.a(i)));
    }

    @Override // defpackage.ijd, defpackage.qjd
    public boolean u(int i) {
        return this.c.isVisible(rjd.a(i));
    }

    public mjd(tjd tjdVar, mjd mjdVar) {
        super(tjdVar, mjdVar);
    }

    @Override // defpackage.ijd, defpackage.qjd
    public final void d(View view) {
    }
}

package defpackage;

import android.view.View;
import android.view.WindowInsets;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ojd  reason: default package */
/* loaded from: classes.dex */
public class ojd extends njd {
    public static final tjd x;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        x = tjd.c(windowInsets, null);
    }

    public ojd(tjd tjdVar, WindowInsets windowInsets) {
        super(tjdVar, windowInsets);
    }

    @Override // defpackage.mjd, defpackage.ijd, defpackage.qjd
    public cx5 i(int i) {
        return cx5.c(this.c.getInsets(sjd.a(i)));
    }

    @Override // defpackage.mjd, defpackage.ijd, defpackage.qjd
    public cx5 j(int i) {
        return cx5.c(this.c.getInsetsIgnoringVisibility(sjd.a(i)));
    }

    @Override // defpackage.mjd, defpackage.ijd, defpackage.qjd
    public boolean u(int i) {
        return this.c.isVisible(sjd.a(i));
    }

    public ojd(tjd tjdVar, ojd ojdVar) {
        super(tjdVar, ojdVar);
    }

    @Override // defpackage.ijd, defpackage.qjd
    public void p(View view) {
    }
}

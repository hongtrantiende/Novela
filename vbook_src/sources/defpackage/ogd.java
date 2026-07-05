package defpackage;

import android.webkit.ValueCallback;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ogd  reason: default package */
/* loaded from: classes3.dex */
public final class ogd implements ValueCallback {
    public final /* synthetic */ f61 a;

    public ogd(pgd pgdVar, f61 f61Var) {
        this.a = f61Var;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        String a;
        String str = (String) obj;
        f61 f61Var = this.a;
        try {
            q36 q36Var = r36.d;
            str.getClass();
            i56 h = l46.h(q36Var.c(str));
            if (h instanceof a56) {
                a = null;
            } else {
                a = h.a();
            }
            if (a == null) {
                a = "";
            }
            f61Var.resumeWith(a);
        } catch (Throwable unused) {
        }
    }
}

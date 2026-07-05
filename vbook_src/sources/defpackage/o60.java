package defpackage;

import android.os.Handler;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o60  reason: default package */
/* loaded from: classes.dex */
public final class o60 {
    public final Handler a;
    public final n60 b;
    public final /* synthetic */ p60 c;

    public o60(p60 p60Var) {
        this.c = p60Var;
        Handler p = a2d.p(null);
        this.a = p;
        n60 n60Var = new n60(this);
        this.b = n60Var;
        p60Var.a.registerStreamEventCallback(new m60(p, 0), n60Var);
    }

    public static void a(o60 o60Var) {
        o60Var.c.a.unregisterStreamEventCallback(o60Var.b);
        o60Var.a.removeCallbacksAndMessages(null);
    }
}

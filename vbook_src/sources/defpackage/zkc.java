package defpackage;

import org.mozilla.javascript.Context;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zkc  reason: default package */
/* loaded from: classes.dex */
public abstract class zkc {
    public static final eu3 a;
    public static final lz3 b;

    static {
        yj a2 = dk.a();
        a2.i(nae.e, nae.e);
        a2.f(0.05f, nae.e, 0.133333f, 0.06f, 0.166666f, 0.4f);
        a2.f(0.208333f, 0.82f, 0.25f, 1.0f, 1.0f, 1.0f);
        eb5 eb5Var = new eb5(a2);
        rd2 rd2Var = new rd2(0.3f, nae.e, 0.8f, 0.15f);
        a = zt3.g(tte.x(450, 0, eb5Var, 2), 2).a(zt3.j(0.98f, y9e.j(0.5f, 0.5f), tte.x(500, 0, eb5Var, 2)));
        b = zt3.i(tte.x(Context.VERSION_ECMASCRIPT, 0, rd2Var, 2), 2).a(zt3.l(0.98f, y9e.j(0.5f, 0.5f), tte.x(300, 0, rd2Var, 2)));
    }
}

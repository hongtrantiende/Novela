package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kw6  reason: default package */
/* loaded from: classes.dex */
public final class kw6 {
    public static final kw6 b;
    public final z56 a;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, z56] */
    static {
        List A = tl1.A(new jw6(hq7.G));
        ?? obj = new Object();
        obj.a = zh0.a;
        obj.b = A;
        b = new kw6(obj);
    }

    public kw6(z56 z56Var) {
        this.a = z56Var;
    }

    public final void a(iea ieaVar, String str, String str2, Throwable th) {
        str.getClass();
        str2.getClass();
        for (hw6 hw6Var : this.a.b) {
            hw6Var.getClass();
            hw6Var.a(ieaVar, str2, str, th);
        }
    }
}

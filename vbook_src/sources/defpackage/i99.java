package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i99  reason: default package */
/* loaded from: classes.dex */
public final class i99 {
    public final f99 a;
    public final boolean b;
    public final kra c;
    public final xt4 d;
    public final boolean e;
    public final Object f;
    public boolean g = true;

    public i99(f99 f99Var, Object obj, boolean z, kra kraVar, xt4 xt4Var, boolean z2) {
        this.a = f99Var;
        this.b = z;
        this.c = kraVar;
        this.d = xt4Var;
        this.e = z2;
        this.f = obj;
    }

    public final Object a() {
        if (this.b) {
            return null;
        }
        Object obj = this.f;
        if (obj != null) {
            return obj;
        }
        ex1.b("Unexpected form of a provided value");
        ls2.c();
        return null;
    }
}

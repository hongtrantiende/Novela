package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zs1  reason: default package */
/* loaded from: classes3.dex */
public final class zs1 implements h39 {
    public final Object a;
    public final mp6 b;

    public zs1(Object obj, mp6 mp6Var) {
        this.a = obj;
        this.b = mp6Var;
    }

    @Override // defpackage.h39
    public final boolean test(Object obj) {
        return c16.i(this.b.invoke(obj), this.a);
    }
}

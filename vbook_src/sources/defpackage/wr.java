package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wr  reason: default package */
/* loaded from: classes.dex */
public final class wr {
    public final drc a;
    public final Object b;
    public final long c;
    public final vt4 d;
    public final hm8 e;
    public js f;
    public long g;
    public long h = Long.MIN_VALUE;
    public final hm8 i = yae.z(Boolean.TRUE);

    public wr(Object obj, drc drcVar, js jsVar, long j, Object obj2, long j2, vt4 vt4Var) {
        this.a = drcVar;
        this.b = obj2;
        this.c = j2;
        this.d = vt4Var;
        this.e = yae.z(obj);
        this.f = bue.e(jsVar);
        this.g = j;
    }

    public final void a() {
        this.i.setValue(Boolean.FALSE);
        this.d.invoke();
    }

    public final Object b() {
        return this.a.b.invoke(this.f);
    }
}

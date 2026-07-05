package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: om3  reason: default package */
/* loaded from: classes3.dex */
public final class om3 {
    public final hm8 a;
    public final hm8 b;
    public final hm8 c;
    public final hm8 d;
    public final hm8 e;
    public final hm8 f;
    public final hm8 g;
    public final hm8 h;
    public final hm8 i;
    public final hm8 j;
    public final hm8 k;
    public final hm8 l;

    public om3(long j, mv mvVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, dl8 dl8Var, double d, float f, float f2, eo4 eo4Var) {
        mvVar.getClass();
        dl8Var.getClass();
        eo4Var.getClass();
        this.a = yae.z(new zl1(j));
        this.b = yae.z(mvVar);
        this.c = yae.z(Boolean.valueOf(z));
        this.d = yae.z(Boolean.valueOf(z2));
        this.e = yae.z(Boolean.valueOf(z3));
        this.f = yae.z(Boolean.valueOf(z4));
        this.g = yae.z(Boolean.valueOf(z5));
        this.h = yae.z(eo4Var);
        this.i = yae.z(Float.valueOf(f));
        this.j = yae.z(Float.valueOf(f2));
        this.k = yae.z(dl8Var);
        this.l = yae.z(Double.valueOf(d));
    }

    public final float a() {
        return ((Number) this.j.getValue()).floatValue();
    }

    public final float b() {
        return ((Number) this.i.getValue()).floatValue();
    }

    public final long c() {
        return ((zl1) this.a.getValue()).a;
    }

    public final boolean d() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    public final boolean e() {
        return ((Boolean) this.e.getValue()).booleanValue();
    }

    public final boolean f() {
        return ((Boolean) this.g.getValue()).booleanValue();
    }

    public final boolean g() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    public om3(long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, dl8 dl8Var, float f, float f2, eo4 eo4Var) {
        this(j, mv.c, z, z2, z3, z4, z5, dl8Var, 0.0d, f, f2, eo4Var);
    }
}

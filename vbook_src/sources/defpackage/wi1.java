package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wi1  reason: default package */
/* loaded from: classes.dex */
public final class wi1 extends uq7 {
    public final xt9 C;
    public final vt4 D;
    public final yu7 b;
    public final iu5 c;
    public final boolean d;
    public final boolean e;
    public final String f;

    public wi1(yu7 yu7Var, iu5 iu5Var, boolean z, boolean z2, String str, xt9 xt9Var, vt4 vt4Var) {
        this.b = yu7Var;
        this.c = iu5Var;
        this.d = z;
        this.e = z2;
        this.f = str;
        this.C = xt9Var;
        this.D = vt4Var;
    }

    @Override // defpackage.uq7
    public final mq7 b() {
        return new t0(this.b, this.c, this.d, this.e, this.f, this.C, this.D);
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        c00 c00Var = nx5Var.b;
        c00Var.b(Boolean.valueOf(this.e), "enabled");
        c00Var.b(this.D, "onClick");
        c00Var.b(this.f, "onClickLabel");
        c00Var.b(this.C, "role");
        c00Var.b(this.b, "interactionSource");
        c00Var.b(this.c, "indicationNodeFactory");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        ((zi1) mq7Var).Y1(this.b, this.c, this.d, this.e, this.f, this.C, this.D);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && wi1.class == obj.getClass()) {
                wi1 wi1Var = (wi1) obj;
                if (!c16.i(this.b, wi1Var.b) || !c16.i(this.c, wi1Var.c) || this.d != wi1Var.d || this.e != wi1Var.e || !c16.i(this.f, wi1Var.f) || !c16.i(this.C, wi1Var.C) || this.D != wi1Var.D) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        yu7 yu7Var = this.b;
        if (yu7Var != null) {
            i = yu7Var.hashCode();
        } else {
            i = 0;
        }
        int i5 = i * 31;
        iu5 iu5Var = this.c;
        if (iu5Var != null) {
            i2 = iu5Var.hashCode();
        } else {
            i2 = 0;
        }
        int k = eub.k(eub.k((i5 + i2) * 31, 31, this.d), 31, this.e);
        String str = this.f;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i6 = (k + i3) * 31;
        xt9 xt9Var = this.C;
        if (xt9Var != null) {
            i4 = Integer.hashCode(xt9Var.a);
        }
        return this.D.hashCode() + ((i6 + i4) * 31);
    }
}

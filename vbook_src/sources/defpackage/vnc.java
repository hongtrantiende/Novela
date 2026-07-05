package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vnc  reason: default package */
/* loaded from: classes.dex */
public final class vnc extends uq7 {
    public final vt4 C;
    public final rbc b;
    public final yu7 c;
    public final iu5 d;
    public final boolean e;
    public final xt9 f;

    public vnc(rbc rbcVar, yu7 yu7Var, iu5 iu5Var, boolean z, xt9 xt9Var, vt4 vt4Var) {
        this.b = rbcVar;
        this.c = yu7Var;
        this.d = iu5Var;
        this.e = z;
        this.f = xt9Var;
        this.C = vt4Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [mq7, t0, wnc] */
    @Override // defpackage.uq7
    public final mq7 b() {
        ?? t0Var = new t0(this.c, this.d, false, this.e, null, this.f, this.C);
        t0Var.i0 = this.b;
        return t0Var;
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        c00 c00Var = nx5Var.b;
        c00Var.b(this.b, "state");
        c00Var.b(this.c, "interactionSource");
        c00Var.b(this.d, "indicationNodeFactory");
        c00Var.b(Boolean.valueOf(this.e), "enabled");
        c00Var.b(this.f, "role");
        c00Var.b(this.C, "onClick");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        wnc wncVar = (wnc) mq7Var;
        rbc rbcVar = wncVar.i0;
        rbc rbcVar2 = this.b;
        if (rbcVar != rbcVar2) {
            wncVar.i0 = rbcVar2;
            ak0.t(wncVar);
        }
        wncVar.Y1(this.c, this.d, false, this.e, null, this.f, this.C);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && vnc.class == obj.getClass()) {
                vnc vncVar = (vnc) obj;
                if (this.b != vncVar.b || !c16.i(this.c, vncVar.c) || !c16.i(this.d, vncVar.d) || this.e != vncVar.e || !this.f.equals(vncVar.f) || this.C != vncVar.C) {
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
        int hashCode = this.b.hashCode() * 31;
        yu7 yu7Var = this.c;
        if (yu7Var != null) {
            i = yu7Var.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        iu5 iu5Var = this.d;
        if (iu5Var != null) {
            i2 = iu5Var.hashCode();
        } else {
            i2 = 0;
        }
        return this.C.hashCode() + hl5.a(this.f.a, eub.k(eub.k((i3 + i2) * 31, 31, false), 31, this.e), 31);
    }
}

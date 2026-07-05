package defpackage;

import org.mozilla.javascript.ES6Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nbc  reason: default package */
/* loaded from: classes.dex */
public final class nbc extends uq7 {
    public final xt4 C;
    public final boolean b;
    public final yu7 c;
    public final boolean d;
    public final boolean e;
    public final xt9 f;

    public nbc(boolean z, yu7 yu7Var, boolean z2, boolean z3, xt9 xt9Var, xt4 xt4Var) {
        this.b = z;
        this.c = yu7Var;
        this.d = z2;
        this.e = z3;
        this.f = xt9Var;
        this.C = xt4Var;
    }

    @Override // defpackage.uq7
    public final mq7 b() {
        return new qbc(this.b, this.c, this.d, this.e, this.f, this.C);
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        c00 c00Var = nx5Var.b;
        c00Var.b(nx5Var.a, ES6Iterator.VALUE_PROPERTY);
        c00Var.b(this.c, "interactionSource");
        c00Var.b(null, "indicationNodeFactory");
        c00Var.b(Boolean.valueOf(this.e), "enabled");
        c00Var.b(this.f, "role");
        c00Var.b(this.C, "onValueChange");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        qbc qbcVar = (qbc) mq7Var;
        boolean z = qbcVar.i0;
        boolean z2 = this.b;
        if (z != z2) {
            qbcVar.i0 = z2;
            ak0.t(qbcVar);
        }
        qbcVar.j0 = this.C;
        qbcVar.Y1(this.c, null, this.d, this.e, null, this.f, qbcVar.k0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && nbc.class == obj.getClass()) {
                nbc nbcVar = (nbc) obj;
                if (this.b != nbcVar.b || !c16.i(this.c, nbcVar.c) || this.d != nbcVar.d || this.e != nbcVar.e || !this.f.equals(nbcVar.f) || this.C != nbcVar.C) {
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
        int hashCode = Boolean.hashCode(this.b) * 31;
        yu7 yu7Var = this.c;
        if (yu7Var != null) {
            i = yu7Var.hashCode();
        } else {
            i = 0;
        }
        return this.C.hashCode() + hl5.a(this.f.a, eub.k(eub.k((hashCode + i) * 961, 31, this.d), 31, this.e), 31);
    }
}

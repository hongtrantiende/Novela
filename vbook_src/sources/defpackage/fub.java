package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fub  reason: default package */
/* loaded from: classes.dex */
public final class fub extends uq7 {
    public final t86 C;
    public final hvb b;
    public final mkc c;
    public final oyb d;
    public final boolean e;
    public final lu4 f;

    public fub(hvb hvbVar, mkc mkcVar, oyb oybVar, boolean z, lu4 lu4Var, t86 t86Var) {
        this.b = hvbVar;
        this.c = mkcVar;
        this.d = oybVar;
        this.e = z;
        this.f = lu4Var;
        this.C = t86Var;
    }

    @Override // defpackage.uq7
    public final mq7 b() {
        return new gub(this.b, this.c, this.d, this.e, this.f, this.C);
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        boolean z;
        gub gubVar = (gub) mq7Var;
        hvb hvbVar = gubVar.M;
        hvb hvbVar2 = this.b;
        gubVar.M = hvbVar2;
        hvbVar2.b = this.f;
        boolean z2 = this.e;
        gubVar.N = z2;
        boolean z3 = !z2;
        msb msbVar = hvbVar2.a;
        msbVar.getClass();
        if (this.C.c == 4) {
            z = true;
        } else {
            z = false;
        }
        msbVar.a.setValue(new lsb(this.c, this.d, z2, z3, z));
        if (!c16.i(hvbVar, hvbVar2)) {
            av0 av0Var = gubVar.O;
            zu0 zu0Var = hvbVar2.h;
            zu0 zu0Var2 = av0Var.K;
            if (zu0Var2 != null) {
                zu0Var2.a.j(av0Var);
            }
            if (zu0Var != null) {
                zu0Var.a.b(av0Var);
            }
            av0Var.K = zu0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof fub) {
                fub fubVar = (fub) obj;
                if (this.e != fubVar.e || !c16.i(this.b, fubVar.b) || !c16.i(this.c, fubVar.c) || !c16.i(this.d, fubVar.d) || this.f != fubVar.f || !this.C.equals(fubVar.C)) {
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
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        int m = eub.m(this.d, (hashCode2 + ((hashCode + (Boolean.hashCode(this.e) * 31)) * 31)) * 31, 31);
        lu4 lu4Var = this.f;
        if (lu4Var != null) {
            i = lu4Var.hashCode();
        } else {
            i = 0;
        }
        return this.C.hashCode() + ((m + i) * 31);
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
    }
}

package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tt3  reason: default package */
/* loaded from: classes.dex */
public final class tt3 extends uq7 {
    public final lz3 C;
    public final sga D;
    public final vt4 E;
    public final ut3 F;
    public final tkc b;
    public final pkc c;
    public final pkc d;
    public final pkc e;
    public final eu3 f;

    public tt3(tkc tkcVar, pkc pkcVar, pkc pkcVar2, pkc pkcVar3, eu3 eu3Var, lz3 lz3Var, sga sgaVar, vt4 vt4Var, ut3 ut3Var) {
        this.b = tkcVar;
        this.c = pkcVar;
        this.d = pkcVar2;
        this.e = pkcVar3;
        this.f = eu3Var;
        this.C = lz3Var;
        this.D = sgaVar;
        this.E = vt4Var;
        this.F = ut3Var;
    }

    @Override // defpackage.uq7
    public final mq7 b() {
        return new du3(this.b, this.c, this.d, this.e, this.f, this.C, this.D, this.E, this.F);
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        c00 c00Var = nx5Var.b;
        c00Var.b(this.b, "transition");
        c00Var.b(this.c, "sizeAnimation");
        c00Var.b(this.d, "offsetAnimation");
        c00Var.b(this.e, "slideAnimation");
        c00Var.b(this.f, "enter");
        c00Var.b(this.C, "exit");
        c00Var.b(this.D, "mutableTransformState");
        c00Var.b(this.F, "graphicsLayerBlock");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        du3 du3Var = (du3) mq7Var;
        du3Var.L = this.b;
        du3Var.M = this.c;
        du3Var.N = this.d;
        du3Var.O = this.e;
        du3Var.P = this.f;
        du3Var.Q = this.C;
        du3Var.R = this.D;
        du3Var.S = this.E;
        du3Var.T = this.F;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tt3) {
            tt3 tt3Var = (tt3) obj;
            if (c16.i(tt3Var.b, this.b) && c16.i(tt3Var.c, this.c) && c16.i(tt3Var.d, this.d) && c16.i(tt3Var.e, this.e) && tt3Var.f.equals(this.f) && c16.i(tt3Var.C, this.C) && tt3Var.D == this.D && tt3Var.E == this.E && c16.i(tt3Var.F, this.F)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = this.b.hashCode() * 31;
        int i3 = 0;
        pkc pkcVar = this.c;
        if (pkcVar != null) {
            i = pkcVar.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 31;
        pkc pkcVar2 = this.d;
        if (pkcVar2 != null) {
            i2 = pkcVar2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        pkc pkcVar3 = this.e;
        if (pkcVar3 != null) {
            i3 = pkcVar3.hashCode();
        }
        int hashCode2 = this.f.a.hashCode();
        int hashCode3 = this.C.a.hashCode();
        int hashCode4 = this.E.hashCode();
        return this.D.hashCode() + (this.F.hashCode() * 31) + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((i5 + i3) * 31)) * 31)) * 31)) * 31);
    }
}

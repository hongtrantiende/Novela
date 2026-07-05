package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dpb  reason: default package */
/* loaded from: classes.dex */
public final class dpb extends uq7 {
    public final sfc b;
    public final xt4 c;
    public final xt4 d;
    public final xt4 e;

    public dpb(sfc sfcVar, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3) {
        this.b = sfcVar;
        this.c = xt4Var;
        this.d = xt4Var2;
        this.e = xt4Var3;
    }

    @Override // defpackage.uq7
    public final mq7 b() {
        return new epb(this.b, this.c, this.d, this.e);
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        rfc rfcVar;
        epb epbVar = (epb) mq7Var;
        epbVar.M.a = null;
        sfc sfcVar = this.b;
        epbVar.M = sfcVar;
        sfcVar.a = epbVar;
        if (epbVar.J) {
            rfcVar = rfc.c;
        } else {
            rfcVar = rfc.b;
        }
        sfcVar.b = rfcVar;
        epbVar.N = this.c;
        epbVar.O = this.d;
        epbVar.P = this.e;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof dpb) {
                dpb dpbVar = (dpb) obj;
                if (this.b != dpbVar.b || this.c != dpbVar.c || this.d != dpbVar.d || this.e != dpbVar.e) {
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
        int hashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
        xt4 xt4Var = this.d;
        if (xt4Var != null) {
            i = xt4Var.hashCode();
        } else {
            i = 0;
        }
        return this.e.hashCode() + ((hashCode + i) * 31);
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
    }
}

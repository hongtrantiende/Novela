package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nla  reason: default package */
/* loaded from: classes.dex */
public final class nla extends uq7 {
    public final wea b;
    public final lea c;

    public nla(wea weaVar, lea leaVar) {
        this.b = weaVar;
        this.c = leaVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [mq7, ola] */
    @Override // defpackage.uq7
    public final mq7 b() {
        ?? mq7Var = new mq7();
        mq7Var.K = this.b;
        mq7Var.L = this.c;
        return mq7Var;
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        c00 c00Var = nx5Var.b;
        c00Var.b(this.b, "shape");
        c00Var.b(this.c, "dropShadow");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        ola olaVar = (ola) mq7Var;
        wea weaVar = olaVar.K;
        wea weaVar2 = this.b;
        boolean i = c16.i(weaVar, weaVar2);
        lea leaVar = this.c;
        if (!i || !c16.i(olaVar.L, leaVar)) {
            olaVar.M = null;
        }
        olaVar.K = weaVar2;
        olaVar.L = leaVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof nla) {
                nla nlaVar = (nla) obj;
                if (!c16.i(this.b, nlaVar.b) || !this.c.equals(nlaVar.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "SimpleDropShadowElement(shape=" + this.b + ", shadow=" + this.c + ")";
    }
}

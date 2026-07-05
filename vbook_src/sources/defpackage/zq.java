package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zq  reason: default package */
/* loaded from: classes.dex */
public final class zq<S> extends uq7 {
    public final pkc b;
    public final aw7 c;
    public final er d;

    public zq(pkc pkcVar, aw7 aw7Var, er erVar) {
        this.b = pkcVar;
        this.c = aw7Var;
        this.d = erVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [br, mq7, x06] */
    @Override // defpackage.uq7
    public final mq7 b() {
        ?? x06Var = new x06(1);
        x06Var.L = this.b;
        x06Var.M = this.c;
        x06Var.N = this.d;
        x06Var.O = -9223372034707292160L;
        return x06Var;
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        c00 c00Var = nx5Var.b;
        c00Var.b(this.b, "sizeAnimation");
        c00Var.b(this.c, "sizeTransform");
        c00Var.b(this.d, "scope");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        br brVar = (br) mq7Var;
        brVar.L = this.b;
        brVar.M = this.c;
        brVar.N = this.d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zq) {
            zq zqVar = (zq) obj;
            if (c16.i(zqVar.b, this.b) && zqVar.c.equals(this.c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.d.hashCode() * 31;
        pkc pkcVar = this.b;
        if (pkcVar != null) {
            i = pkcVar.hashCode();
        } else {
            i = 0;
        }
        return this.c.hashCode() + ((hashCode + i) * 31);
    }
}

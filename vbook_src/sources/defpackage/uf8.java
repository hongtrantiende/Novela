package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uf8  reason: default package */
/* loaded from: classes.dex */
public final class uf8 extends kwe {
    public final ou9 c;
    public final yj d;

    public uf8(ou9 ou9Var) {
        yj yjVar;
        this.c = ou9Var;
        if (!vte.g(ou9Var)) {
            yjVar = dk.a();
            yj.d(yjVar, ou9Var);
        } else {
            yjVar = null;
        }
        this.d = yjVar;
    }

    @Override // defpackage.kwe
    public final rk9 E() {
        ou9 ou9Var = this.c;
        return new rk9(ou9Var.a, ou9Var.b, ou9Var.c, ou9Var.d);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof uf8) {
                if (!this.c.equals(((uf8) obj).c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}

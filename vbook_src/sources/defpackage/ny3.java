package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ny3  reason: default package */
/* loaded from: classes.dex */
public final class ny3 implements qid {
    public final qid a;
    public final qid b;

    public ny3(qid qidVar, qid qidVar2) {
        this.a = qidVar;
        this.b = qidVar2;
    }

    @Override // defpackage.qid
    public final int a(r13 r13Var) {
        int a = this.a.a(r13Var) - this.b.a(r13Var);
        if (a < 0) {
            return 0;
        }
        return a;
    }

    @Override // defpackage.qid
    public final int b(r13 r13Var, tc6 tc6Var) {
        int b = this.a.b(r13Var, tc6Var) - this.b.b(r13Var, tc6Var);
        if (b < 0) {
            return 0;
        }
        return b;
    }

    @Override // defpackage.qid
    public final int c(r13 r13Var) {
        int c = this.a.c(r13Var) - this.b.c(r13Var);
        if (c < 0) {
            return 0;
        }
        return c;
    }

    @Override // defpackage.qid
    public final int d(r13 r13Var, tc6 tc6Var) {
        int d = this.a.d(r13Var, tc6Var) - this.b.d(r13Var, tc6Var);
        if (d < 0) {
            return 0;
        }
        return d;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ny3) {
                ny3 ny3Var = (ny3) obj;
                if (ny3Var.a.equals(this.a) && c16.i(ny3Var.b, this.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.a + " - " + this.b + ")";
    }
}

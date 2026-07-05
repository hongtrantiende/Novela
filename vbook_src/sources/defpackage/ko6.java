package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ko6  reason: default package */
/* loaded from: classes3.dex */
public final class ko6 implements qid {
    public final qid a;
    public final int b;

    public ko6(qid qidVar, int i) {
        this.a = qidVar;
        this.b = i;
    }

    @Override // defpackage.qid
    public final int a(r13 r13Var) {
        if ((this.b & 16) != 0) {
            return this.a.a(r13Var);
        }
        return 0;
    }

    @Override // defpackage.qid
    public final int b(r13 r13Var, tc6 tc6Var) {
        int i;
        if (tc6Var == tc6.a) {
            i = 4;
        } else {
            i = 1;
        }
        if ((i & this.b) != 0) {
            return this.a.b(r13Var, tc6Var);
        }
        return 0;
    }

    @Override // defpackage.qid
    public final int c(r13 r13Var) {
        if ((this.b & 32) != 0) {
            return this.a.c(r13Var);
        }
        return 0;
    }

    @Override // defpackage.qid
    public final int d(r13 r13Var, tc6 tc6Var) {
        int i;
        if (tc6Var == tc6.a) {
            i = 8;
        } else {
            i = 2;
        }
        if ((i & this.b) != 0) {
            return this.a.d(r13Var, tc6Var);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ko6) {
                ko6 ko6Var = (ko6) obj;
                if (this.a.equals(ko6Var.a) && this.b == ko6Var.b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.b;
        int i2 = owe.c;
        if ((i & i2) == i2) {
            owe.S("Start", sb);
        }
        int i3 = owe.e;
        if ((i & i3) == i3) {
            owe.S("Left", sb);
        }
        if ((i & 16) == 16) {
            owe.S("Top", sb);
        }
        int i4 = owe.d;
        if ((i & i4) == i4) {
            owe.S("End", sb);
        }
        int i5 = owe.f;
        if ((i & i5) == i5) {
            owe.S("Right", sb);
        }
        if ((i & 32) == 32) {
            owe.S("Bottom", sb);
        }
        String n = hl5.n("WindowInsetsSides(", sb.toString(), ")");
        return "(" + this.a + " only " + n + ")";
    }
}

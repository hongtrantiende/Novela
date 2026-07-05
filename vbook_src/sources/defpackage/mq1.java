package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mq1  reason: default package */
/* loaded from: classes.dex */
public final class mq1 implements un3 {
    public final ps a;
    public final int b;

    public mq1(String str, int i) {
        this(new ps(str), i);
    }

    @Override // defpackage.un3
    public final void a(lu0 lu0Var) {
        int length;
        int i = lu0Var.d;
        ps psVar = this.a;
        int i2 = -1;
        if (i != -1) {
            lu0Var.f(i, lu0Var.e, psVar.b);
        } else {
            lu0Var.f(lu0Var.b, lu0Var.c, psVar.b);
        }
        int i3 = lu0Var.b;
        int i4 = lu0Var.c;
        if (i3 == i4) {
            i2 = i4;
        }
        int i5 = this.b;
        if (i5 > 0) {
            length = (i2 + i5) - 1;
        } else {
            length = (i2 + i5) - psVar.b.length();
        }
        int n = dce.n(length, 0, ((cw) lu0Var.f).e());
        lu0Var.h(n, n);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mq1)) {
            return false;
        }
        mq1 mq1Var = (mq1) obj;
        if (c16.i(this.a.b, mq1Var.a.b) && this.b == mq1Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.b.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return s21.k("CommitTextCommand(text='", this.b, this.a.b, "', newCursorPosition=", ")");
    }

    public mq1(ps psVar, int i) {
        this.a = psVar;
        this.b = i;
    }
}

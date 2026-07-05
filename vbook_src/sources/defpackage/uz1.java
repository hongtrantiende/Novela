package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uz1  reason: default package */
/* loaded from: classes.dex */
public final class uz1 implements cw9, qw7 {
    public final cw9 a;
    public final qw7 b;
    public d82 c;
    public Throwable d;

    public uz1(cw9 cw9Var) {
        sw7 sw7Var = new sw7();
        cw9Var.getClass();
        this.a = cw9Var;
        this.b = sw7Var;
    }

    public final void C(StringBuilder sb) {
        if (this.c == null && this.d == null) {
            sb.append("\t\tStatus: Free connection");
            sb.append('\n');
            return;
        }
        sb.append("\t\tStatus: Acquired connection");
        sb.append('\n');
        d82 d82Var = this.c;
        if (d82Var != null) {
            sb.append("\t\tCoroutine: " + d82Var);
            sb.append('\n');
        }
        Throwable th = this.d;
        if (th != null) {
            sb.append("\t\tAcquired:");
            sb.append('\n');
            Iterator it = sl1.Y(k4b.p0(pye.s(th)), 1).iterator();
            while (it.hasNext()) {
                sb.append("\t\t" + ((String) it.next()));
                sb.append('\n');
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.cw9
    public final iw9 h1(String str) {
        str.getClass();
        return this.a.h1(str);
    }

    @Override // defpackage.qw7
    public final Object o(m42 m42Var) {
        return this.b.o(m42Var);
    }

    @Override // defpackage.qw7
    public final void q(Object obj) {
        this.b.q(null);
    }

    public final String toString() {
        return this.a.toString();
    }
}

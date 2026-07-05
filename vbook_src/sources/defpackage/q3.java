package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q3  reason: default package */
/* loaded from: classes3.dex */
public abstract class q3 {
    public r3[] a;
    public int b;
    public int c;
    public s7b d;

    public final r3 g() {
        r3 r3Var;
        s7b s7bVar;
        synchronized (this) {
            try {
                r3[] r3VarArr = this.a;
                if (r3VarArr == null) {
                    r3VarArr = i();
                    this.a = r3VarArr;
                } else if (this.b >= r3VarArr.length) {
                    Object[] copyOf = Arrays.copyOf(r3VarArr, r3VarArr.length * 2);
                    this.a = (r3[]) copyOf;
                    r3VarArr = (r3[]) copyOf;
                }
                int i = this.c;
                do {
                    r3Var = r3VarArr[i];
                    if (r3Var == null) {
                        r3Var = h();
                        r3VarArr[i] = r3Var;
                    }
                    i++;
                    if (i >= r3VarArr.length) {
                        i = 0;
                    }
                } while (!r3Var.a(this));
                this.c = i;
                this.b++;
                s7bVar = this.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (s7bVar != null) {
            s7bVar.y(1);
        }
        return r3Var;
    }

    public abstract r3 h();

    public abstract r3[] i();

    public final void j(r3 r3Var) {
        s7b s7bVar;
        int i;
        m42[] b;
        synchronized (this) {
            try {
                int i2 = this.b - 1;
                this.b = i2;
                s7bVar = this.d;
                if (i2 == 0) {
                    this.c = 0;
                }
                r3Var.getClass();
                b = r3Var.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (m42 m42Var : b) {
            if (m42Var != null) {
                m42Var.resumeWith(pvc.a);
            }
        }
        if (s7bVar != null) {
            s7bVar.y(-1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [pga, s7b] */
    public final s7b k() {
        s7b s7bVar;
        synchronized (this) {
            s7b s7bVar2 = this.d;
            s7bVar = s7bVar2;
            if (s7bVar2 == null) {
                int i = this.b;
                ?? pgaVar = new pga(1, Integer.MAX_VALUE, py0.b);
                pgaVar.f(Integer.valueOf(i));
                this.d = pgaVar;
                s7bVar = pgaVar;
            }
        }
        return s7bVar;
    }
}

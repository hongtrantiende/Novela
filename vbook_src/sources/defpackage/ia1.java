package defpackage;

import java.util.ArrayDeque;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ia1  reason: default package */
/* loaded from: classes.dex */
public abstract class ia1 implements y7b {
    public final ArrayDeque a = new ArrayDeque();
    public final ArrayDeque b;
    public final ArrayDeque c;
    public ga1 d;
    public long e;
    public long f;
    public long g;

    public ia1() {
        for (int i = 0; i < 10; i++) {
            this.a.add(new cr2(1));
        }
        this.b = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            ArrayDeque arrayDeque = this.b;
            q6 q6Var = new q6(this, 4);
            ha1 ha1Var = new ha1();
            ha1Var.D = q6Var;
            arrayDeque.add(ha1Var);
        }
        this.c = new ArrayDeque();
        this.g = -9223372036854775807L;
    }

    @Override // defpackage.zq2
    public final void b(long j) {
        this.g = j;
    }

    @Override // defpackage.y7b
    public final void c(long j) {
        this.e = j;
    }

    @Override // defpackage.zq2
    public final Object e() {
        boolean z;
        if (this.d == null) {
            z = true;
        } else {
            z = false;
        }
        wq9.D(z);
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        ga1 ga1Var = (ga1) arrayDeque.pollFirst();
        this.d = ga1Var;
        return ga1Var;
    }

    @Override // defpackage.zq2
    public final void f(e8b e8bVar) {
        boolean z;
        if (e8bVar == this.d) {
            z = true;
        } else {
            z = false;
        }
        wq9.s(z);
        ga1 ga1Var = (ga1) e8bVar;
        if (!ga1Var.h(4)) {
            long j = ga1Var.C;
            if (j != Long.MIN_VALUE) {
                long j2 = this.g;
                if (j2 != -9223372036854775807L && j < j2) {
                    ga1Var.n();
                    this.a.add(ga1Var);
                    this.d = null;
                }
            }
        }
        long j3 = this.f;
        this.f = 1 + j3;
        ga1Var.G = j3;
        this.c.add(ga1Var);
        this.d = null;
    }

    @Override // defpackage.zq2
    public void flush() {
        ArrayDeque arrayDeque;
        this.f = 0L;
        this.e = 0L;
        while (true) {
            ArrayDeque arrayDeque2 = this.c;
            boolean isEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.a;
            if (isEmpty) {
                break;
            }
            ga1 ga1Var = (ga1) arrayDeque2.poll();
            String str = a2d.a;
            ga1Var.n();
            arrayDeque.add(ga1Var);
        }
        ga1 ga1Var2 = this.d;
        if (ga1Var2 != null) {
            ga1Var2.n();
            arrayDeque.add(ga1Var2);
            this.d = null;
        }
    }

    public abstract ja1 g();

    public abstract void h(ga1 ga1Var);

    @Override // defpackage.zq2
    /* renamed from: i */
    public ha1 d() {
        ArrayDeque arrayDeque = this.b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.c;
            if (!arrayDeque2.isEmpty()) {
                String str = a2d.a;
                if (((ga1) arrayDeque2.peek()).C <= this.e) {
                    ga1 ga1Var = (ga1) arrayDeque2.poll();
                    boolean h = ga1Var.h(4);
                    ArrayDeque arrayDeque3 = this.a;
                    if (h) {
                        ha1 ha1Var = (ha1) arrayDeque.pollFirst();
                        ha1Var.b(4);
                        ga1Var.n();
                        arrayDeque3.add(ga1Var);
                        return ha1Var;
                    }
                    h(ga1Var);
                    if (j()) {
                        ja1 g = g();
                        ha1 ha1Var2 = (ha1) arrayDeque.pollFirst();
                        long j = ga1Var.C;
                        ha1Var2.c = j;
                        ha1Var2.e = g;
                        ha1Var2.f = j;
                        ga1Var.n();
                        arrayDeque3.add(ga1Var);
                        return ha1Var2;
                    }
                    ga1Var.n();
                    arrayDeque3.add(ga1Var);
                } else {
                    return null;
                }
            } else {
                return null;
            }
        }
    }

    public abstract boolean j();

    @Override // defpackage.zq2
    public void a() {
    }
}

package defpackage;

import java.util.ArrayDeque;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mla  reason: default package */
/* loaded from: classes.dex */
public abstract class mla implements zq2 {
    public final lla a;
    public final cr2[] e;
    public final dr2[] f;
    public int g;
    public int h;
    public cr2 i;
    public ab2 j;
    public boolean k;
    public boolean l;
    public final Object b = new Object();
    public long m = -9223372036854775807L;
    public final ArrayDeque c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();

    public mla(cr2[] cr2VarArr, dr2[] dr2VarArr) {
        this.e = cr2VarArr;
        this.g = cr2VarArr.length;
        for (int i = 0; i < this.g; i++) {
            this.e[i] = g();
        }
        this.f = dr2VarArr;
        this.h = dr2VarArr.length;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.f[i2] = h();
        }
        lla llaVar = new lla(this);
        this.a = llaVar;
        llaVar.start();
    }

    @Override // defpackage.zq2
    public final void a() {
        synchronized (this.b) {
            this.l = true;
            this.b.notify();
        }
        try {
            this.a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // defpackage.zq2
    public final void b(long j) {
        boolean z;
        synchronized (this.b) {
            try {
                if (this.g != this.e.length && !this.k) {
                    z = false;
                    wq9.D(z);
                    this.m = j;
                }
                z = true;
                wq9.D(z);
                this.m = j;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.zq2
    public final Object e() {
        boolean z;
        cr2 cr2Var;
        synchronized (this.b) {
            try {
                ab2 ab2Var = this.j;
                if (ab2Var == null) {
                    if (this.i == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    wq9.D(z);
                    int i = this.g;
                    if (i == 0) {
                        cr2Var = null;
                    } else {
                        cr2[] cr2VarArr = this.e;
                        int i2 = i - 1;
                        this.g = i2;
                        cr2Var = cr2VarArr[i2];
                    }
                    this.i = cr2Var;
                } else {
                    throw ab2Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cr2Var;
    }

    @Override // defpackage.zq2
    public final void flush() {
        synchronized (this.b) {
            try {
                this.k = true;
                cr2 cr2Var = this.i;
                if (cr2Var != null) {
                    cr2Var.n();
                    cr2[] cr2VarArr = this.e;
                    int i = this.g;
                    this.g = i + 1;
                    cr2VarArr[i] = cr2Var;
                    this.i = null;
                }
                while (!this.c.isEmpty()) {
                    cr2 cr2Var2 = (cr2) this.c.removeFirst();
                    cr2Var2.n();
                    cr2[] cr2VarArr2 = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    cr2VarArr2[i2] = cr2Var2;
                }
                while (!this.d.isEmpty()) {
                    ((dr2) this.d.removeFirst()).o();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract cr2 g();

    public abstract dr2 h();

    public abstract ab2 i(Throwable th);

    public abstract ab2 j(cr2 cr2Var, dr2 dr2Var, boolean z);

    public final boolean k() {
        boolean z;
        ab2 i;
        boolean z2;
        synchronized (this.b) {
            while (!this.l) {
                try {
                    if (!this.c.isEmpty() && this.h > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        break;
                    }
                    this.b.wait();
                } finally {
                }
            }
            if (this.l) {
                return false;
            }
            cr2 cr2Var = (cr2) this.c.removeFirst();
            dr2[] dr2VarArr = this.f;
            int i2 = this.h - 1;
            this.h = i2;
            dr2 dr2Var = dr2VarArr[i2];
            boolean z3 = this.k;
            this.k = false;
            if (cr2Var.h(4)) {
                dr2Var.b(4);
            } else {
                dr2Var.c = cr2Var.C;
                if (cr2Var.h(134217728)) {
                    dr2Var.b(134217728);
                }
                long j = cr2Var.C;
                synchronized (this.b) {
                    long j2 = this.m;
                    if (j2 != -9223372036854775807L && j < j2) {
                        z = false;
                    }
                    z = true;
                }
                if (!z) {
                    dr2Var.d = true;
                }
                try {
                    i = j(cr2Var, dr2Var, z3);
                } catch (OutOfMemoryError e) {
                    i = i(e);
                } catch (RuntimeException e2) {
                    i = i(e2);
                }
                if (i != null) {
                    synchronized (this.b) {
                        this.j = i;
                    }
                    return false;
                }
            }
            synchronized (this.b) {
                try {
                    if (this.k) {
                        dr2Var.o();
                    } else if (dr2Var.d) {
                        dr2Var.o();
                    } else {
                        this.d.addLast(dr2Var);
                    }
                    cr2Var.n();
                    cr2[] cr2VarArr = this.e;
                    int i3 = this.g;
                    this.g = i3 + 1;
                    cr2VarArr[i3] = cr2Var;
                } finally {
                }
            }
            return true;
        }
    }

    @Override // defpackage.zq2
    /* renamed from: l */
    public final dr2 d() {
        synchronized (this.b) {
            try {
                ab2 ab2Var = this.j;
                if (ab2Var == null) {
                    if (this.d.isEmpty()) {
                        return null;
                    }
                    return (dr2) this.d.removeFirst();
                }
                throw ab2Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.zq2
    /* renamed from: m */
    public final void f(cr2 cr2Var) {
        boolean z;
        synchronized (this.b) {
            try {
                ab2 ab2Var = this.j;
                if (ab2Var == null) {
                    if (cr2Var == this.i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    wq9.s(z);
                    this.c.addLast(cr2Var);
                    if (!this.c.isEmpty() && this.h > 0) {
                        this.b.notify();
                    }
                    this.i = null;
                } else {
                    throw ab2Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n(dr2 dr2Var) {
        synchronized (this.b) {
            dr2Var.n();
            dr2[] dr2VarArr = this.f;
            int i = this.h;
            this.h = i + 1;
            dr2VarArr[i] = dr2Var;
            if (!this.c.isEmpty() && this.h > 0) {
                this.b.notify();
            }
        }
    }
}

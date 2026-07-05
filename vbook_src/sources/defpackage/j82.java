package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j82  reason: default package */
/* loaded from: classes3.dex */
public final class j82 extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater E = AtomicIntegerFieldUpdater.newUpdater(j82.class, "workerCtl$volatile");
    public boolean C;
    public final /* synthetic */ l82 D;
    public final tmd a;
    public final zl9 b;
    public k82 c;
    public long d;
    public long e;
    public int f;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    /* JADX WARN: Type inference failed for: r3v5, types: [zl9, java.lang.Object] */
    public j82(l82 l82Var, int i) {
        this.D = l82Var;
        setDaemon(true);
        setContextClassLoader(l82.class.getClassLoader());
        this.a = new tmd();
        this.b = new Object();
        this.c = k82.d;
        this.nextParkedWorker = l82.G;
        int nanoTime = (int) System.nanoTime();
        this.f = nanoTime == 0 ? 42 : nanoTime;
        f(i);
    }

    public final ykb a(boolean z) {
        ykb e;
        ykb e2;
        long j;
        k82 k82Var = this.c;
        l82 l82Var = this.D;
        boolean z2 = true;
        tmd tmdVar = this.a;
        k82 k82Var2 = k82.a;
        if (k82Var != k82Var2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = l82.E;
            do {
                j = atomicLongFieldUpdater.get(l82Var);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    ykb g = tmdVar.g();
                    if (g == null && (g = (ykb) l82Var.f.d()) == null) {
                        return i(1);
                    }
                    return g;
                }
            } while (!l82.E.compareAndSet(l82Var, j, j - 4398046511104L));
            this.c = k82Var2;
        }
        if (z) {
            if (d(l82Var.a * 2) != 0) {
                z2 = false;
            }
            if (z2 && (e2 = e()) != null) {
                return e2;
            }
            ykb e3 = tmdVar.e();
            if (e3 != null) {
                return e3;
            }
            if (!z2 && (e = e()) != null) {
                return e;
            }
        } else {
            ykb e4 = e();
            if (e4 != null) {
                return e4;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i) {
        int i2 = this.f;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.f = i5;
        int i6 = i - 1;
        if ((i6 & i) == 0) {
            return i6 & i5;
        }
        return (Integer.MAX_VALUE & i5) % i;
    }

    public final ykb e() {
        int d = d(2);
        l82 l82Var = this.D;
        iz4 iz4Var = l82Var.f;
        iz4 iz4Var2 = l82Var.e;
        if (d == 0) {
            ykb ykbVar = (ykb) iz4Var2.d();
            if (ykbVar != null) {
                return ykbVar;
            }
            return (ykb) iz4Var.d();
        }
        ykb ykbVar2 = (ykb) iz4Var.d();
        if (ykbVar2 != null) {
            return ykbVar2;
        }
        return (ykb) iz4Var2.d();
    }

    public final void f(int i) {
        String valueOf;
        StringBuilder sb = new StringBuilder();
        sb.append(this.D.d);
        sb.append("-worker-");
        if (i == 0) {
            valueOf = "TERMINATED";
        } else {
            valueOf = String.valueOf(i);
        }
        sb.append(valueOf);
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(k82 k82Var) {
        boolean z;
        k82 k82Var2 = this.c;
        if (k82Var2 == k82.a) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            l82.E.addAndGet(this.D, 4398046511104L);
        }
        if (k82Var2 != k82Var) {
            this.c = k82Var;
        }
        return z;
    }

    public final ykb i(int i) {
        ykb ykbVar;
        long i2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = l82.E;
        l82 l82Var = this.D;
        int i3 = (int) (atomicLongFieldUpdater.get(l82Var) & 2097151);
        if (i3 < 2) {
            return null;
        }
        int d = d(i3);
        long j = Long.MAX_VALUE;
        for (int i4 = 0; i4 < i3; i4++) {
            boolean z = true;
            d++;
            if (d > i3) {
                d = 1;
            }
            j82 j82Var = (j82) l82Var.C.b(d);
            if (j82Var != null && j82Var != this) {
                tmd tmdVar = j82Var.a;
                tmdVar.getClass();
                if (i == 3) {
                    ykbVar = tmdVar.f();
                } else {
                    if (i != 1) {
                        z = false;
                    }
                    int i5 = tmd.d.get(tmdVar);
                    int i6 = tmd.c.get(tmdVar);
                    while (i5 != i6 && (!z || tmd.e.get(tmdVar) != 0)) {
                        int i7 = i5 + 1;
                        ykbVar = tmdVar.h(i5, z);
                        if (ykbVar != null) {
                            break;
                        }
                        i5 = i7;
                    }
                    ykbVar = null;
                }
                zl9 zl9Var = this.b;
                if (ykbVar != null) {
                    zl9Var.a = ykbVar;
                    i2 = -1;
                } else {
                    i2 = tmdVar.i(i, zl9Var);
                }
                if (i2 == -1) {
                    ykb ykbVar2 = (ykb) zl9Var.a;
                    zl9Var.a = null;
                    return ykbVar2;
                } else if (i2 > 0) {
                    j = Math.min(j, i2);
                }
            }
        }
        if (j == Long.MAX_VALUE) {
            j = 0;
        }
        this.e = j;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x0004, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0004, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0004, code lost:
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j82.run():void");
    }
}

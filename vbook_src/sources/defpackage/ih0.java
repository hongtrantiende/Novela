package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ih0  reason: default package */
/* loaded from: classes.dex */
public abstract class ih0 implements jg2 {
    public final boolean a;
    public final ArrayList b = new ArrayList(1);
    public int c;
    public mg2 d;

    public ih0(boolean z) {
        this.a = z;
    }

    public final void b(int i) {
        boolean z;
        mg2 mg2Var = this.d;
        String str = a2d.a;
        for (int i2 = 0; i2 < this.c; i2++) {
            ys2 ys2Var = (ys2) this.b.get(i2);
            boolean z2 = this.a;
            synchronized (ys2Var) {
                mm9 mm9Var = ys2.p;
                if (z2 && (mg2Var.h & 8) != 8) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    ys2Var.i += i;
                }
            }
        }
    }

    public final void c() {
        boolean z;
        boolean z2;
        mg2 mg2Var = this.d;
        String str = a2d.a;
        for (int i = 0; i < this.c; i++) {
            ys2 ys2Var = (ys2) this.b.get(i);
            boolean z3 = this.a;
            synchronized (ys2Var) {
                try {
                    mm9 mm9Var = ys2.p;
                    if (z3 && (mg2Var.h & 8) != 8) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        if (ys2Var.g > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        wq9.D(z2);
                        ys2Var.d.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        int i2 = (int) (elapsedRealtime - ys2Var.h);
                        ys2Var.j += i2;
                        long j = ys2Var.k;
                        long j2 = ys2Var.i;
                        ys2Var.k = j + j2;
                        if (i2 > 0) {
                            ys2Var.f.a((int) Math.sqrt(j2), (((float) j2) * 8000.0f) / i2);
                            if (ys2Var.j < 2000) {
                                if (ys2Var.k >= 524288) {
                                }
                                ys2Var.b(ys2Var.i, ys2Var.l, i2);
                                ys2Var.h = elapsedRealtime;
                                ys2Var.i = 0L;
                            }
                            ys2Var.l = ys2Var.f.k();
                            ys2Var.b(ys2Var.i, ys2Var.l, i2);
                            ys2Var.h = elapsedRealtime;
                            ys2Var.i = 0L;
                        }
                        ys2Var.g--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.d = null;
    }

    public final void g() {
        for (int i = 0; i < this.c; i++) {
            ((ys2) this.b.get(i)).getClass();
        }
    }

    public final void k(mg2 mg2Var) {
        boolean z;
        this.d = mg2Var;
        for (int i = 0; i < this.c; i++) {
            ys2 ys2Var = (ys2) this.b.get(i);
            boolean z2 = this.a;
            synchronized (ys2Var) {
                try {
                    mm9 mm9Var = ys2.p;
                    if (z2 && (mg2Var.h & 8) != 8) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        if (ys2Var.g == 0) {
                            ys2Var.d.getClass();
                            ys2Var.h = SystemClock.elapsedRealtime();
                        }
                        ys2Var.g++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.jg2
    public final void u(ys2 ys2Var) {
        ys2Var.getClass();
        ArrayList arrayList = this.b;
        if (!arrayList.contains(ys2Var)) {
            arrayList.add(ys2Var);
            this.c++;
        }
    }
}

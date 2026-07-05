package defpackage;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yv4  reason: default package */
/* loaded from: classes.dex */
public final class yv4 implements Runnable {
    public static final ThreadLocal e = new ThreadLocal();
    public static final kn4 f = new kn4(29);
    public ArrayList a;
    public long b;
    public long c;
    public ArrayList d;

    public static rl9 c(RecyclerView recyclerView, int i, long j) {
        int I = recyclerView.f.I();
        for (int i2 = 0; i2 < I; i2++) {
            rl9 F = RecyclerView.F(recyclerView.f.H(i2));
            if (F.c == i && !F.e()) {
                return null;
            }
        }
        kl9 kl9Var = recyclerView.c;
        try {
            recyclerView.L();
            rl9 n = kl9Var.n(i, j);
            if (n != null) {
                if (n.d() && !n.e()) {
                    kl9Var.k(n.a);
                } else {
                    kl9Var.a(n, false);
                }
            }
            recyclerView.M(false);
            return n;
        } catch (Throwable th) {
            recyclerView.M(false);
            throw th;
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.N && this.b == 0) {
            this.b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        wh1 wh1Var = recyclerView.y0;
        wh1Var.a = i;
        wh1Var.b = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(long j) {
        xv4 xv4Var;
        RecyclerView recyclerView;
        long j2;
        RecyclerView recyclerView2;
        xv4 xv4Var2;
        boolean z;
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = this.a;
        int size = arrayList2.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList2.get(i2);
            int windowVisibility = recyclerView3.getWindowVisibility();
            wh1 wh1Var = recyclerView3.y0;
            if (windowVisibility == 0) {
                wh1Var.c(recyclerView3, false);
                i += wh1Var.d;
            }
        }
        arrayList.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList2.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                wh1 wh1Var2 = recyclerView4.y0;
                int abs = Math.abs(wh1Var2.b) + Math.abs(wh1Var2.a);
                for (int i5 = 0; i5 < wh1Var2.d * 2; i5 += 2) {
                    if (i3 >= arrayList.size()) {
                        Object obj = new Object();
                        arrayList.add(obj);
                        xv4Var2 = obj;
                    } else {
                        xv4Var2 = (xv4) arrayList.get(i3);
                    }
                    int[] iArr = wh1Var2.c;
                    int i6 = iArr[i5 + 1];
                    if (i6 <= abs) {
                        z = true;
                    } else {
                        z = false;
                    }
                    xv4Var2.a = z;
                    xv4Var2.b = abs;
                    xv4Var2.c = i6;
                    xv4Var2.d = recyclerView4;
                    xv4Var2.e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList, f);
        for (int i7 = 0; i7 < arrayList.size() && (recyclerView = (xv4Var = (xv4) arrayList.get(i7)).d) != null; i7++) {
            if (xv4Var.a) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = j;
            }
            rl9 c = c(recyclerView, xv4Var.e, j2);
            if (c != null && c.b != null && c.d() && !c.e() && (recyclerView2 = (RecyclerView) c.b.get()) != null) {
                if (recyclerView2.W && recyclerView2.f.I() != 0) {
                    kl9 kl9Var = recyclerView2.c;
                    cl9 cl9Var = recyclerView2.i0;
                    if (cl9Var != null) {
                        cl9Var.e();
                    }
                    el9 el9Var = recyclerView2.I;
                    if (el9Var != null) {
                        el9Var.f0(kl9Var);
                        recyclerView2.I.g0(kl9Var);
                    }
                    ((ArrayList) kl9Var.c).clear();
                    kl9Var.i();
                }
                wh1 wh1Var3 = recyclerView2.y0;
                wh1Var3.c(recyclerView2, true);
                if (wh1Var3.d != 0) {
                    try {
                        int i8 = sic.a;
                        Trace.beginSection("RV Nested Prefetch");
                        nl9 nl9Var = recyclerView2.z0;
                        yk9 yk9Var = recyclerView2.H;
                        nl9Var.c = 1;
                        nl9Var.d = yk9Var.a();
                        nl9Var.f = false;
                        nl9Var.g = false;
                        nl9Var.h = false;
                        for (int i9 = 0; i9 < wh1Var3.d * 2; i9 += 2) {
                            c(recyclerView2, wh1Var3.c[i9], j);
                        }
                        Trace.endSection();
                        xv4Var.a = false;
                        xv4Var.b = 0;
                        xv4Var.c = 0;
                        xv4Var.d = null;
                        xv4Var.e = 0;
                    } catch (Throwable th) {
                        int i10 = sic.a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            xv4Var.a = false;
            xv4Var.b = 0;
            xv4Var.c = 0;
            xv4Var.d = null;
            xv4Var.e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.a;
        try {
            int i = sic.a;
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long j = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i2);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(j) + this.c);
                }
            }
            this.b = 0L;
            Trace.endSection();
        } catch (Throwable th) {
            this.b = 0L;
            int i3 = sic.a;
            Trace.endSection();
            throw th;
        }
    }
}

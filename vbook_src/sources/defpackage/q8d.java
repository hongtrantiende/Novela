package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.Surface;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q8d  reason: default package */
/* loaded from: classes.dex */
public final class q8d {
    public final u47 a;
    public final v8d b;
    public final long c;
    public boolean d;
    public long g;
    public boolean j;
    public boolean m;
    public boolean n;
    public int e = 0;
    public long f = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long i = -9223372036854775807L;
    public float k = 1.0f;
    public xfb l = xfb.a;
    public final boolean o = true;

    public q8d(Context context, u47 u47Var, long j) {
        this.a = u47Var;
        this.c = j;
        this.b = new v8d(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0086, code lost:
        if (r7 != false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0178, code lost:
        if (r3 > 100000) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0186, code lost:
        if (r33 >= r37) goto L142;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02d1 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0196 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(long r31, long r33, long r35, long r37, boolean r39, boolean r40, defpackage.od0 r41) {
        /*
            Method dump skipped, instructions count: 745
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q8d.a(long, long, long, long, boolean, boolean, od0):int");
    }

    public final boolean b(boolean z) {
        if (z && (this.e == 3 || (this.n && (!this.m || !this.o)))) {
            this.i = -9223372036854775807L;
            return true;
        } else if (this.i == -9223372036854775807L) {
            return false;
        } else {
            this.l.getClass();
            if (SystemClock.elapsedRealtime() < this.i) {
                return true;
            }
            this.i = -9223372036854775807L;
            return false;
        }
    }

    public final void c(boolean z) {
        long j;
        this.j = z;
        long j2 = this.c;
        if (j2 > 0) {
            this.l.getClass();
            j = SystemClock.elapsedRealtime() + j2;
        } else {
            j = -9223372036854775807L;
        }
        this.i = j;
    }

    public final void d() {
        s8d s8dVar;
        this.d = true;
        this.l.getClass();
        this.g = a2d.Q(SystemClock.elapsedRealtime());
        v8d v8dVar = this.b;
        v8dVar.d = true;
        v8dVar.b();
        DisplayManager displayManager = (DisplayManager) v8dVar.b.getSystemService("display");
        s8d s8dVar2 = null;
        if (displayManager != null) {
            try {
                Choreographer choreographer = Choreographer.getInstance();
                if (Build.VERSION.SDK_INT >= 33) {
                    s8dVar = new u8d(choreographer, displayManager);
                } else {
                    s8dVar = new s8d(choreographer, displayManager);
                }
                s8dVar2 = s8dVar;
            } catch (RuntimeException e) {
                st0.x("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
            }
        }
        v8dVar.c = s8dVar2;
        if (s8dVar2 != null) {
            s8dVar2.a();
        }
        v8dVar.d(false);
    }

    public final void e(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    this.e = Math.min(this.e, 2);
                } else {
                    vm1.d();
                    return;
                }
            } else {
                this.e = 0;
            }
        } else {
            this.e = 1;
        }
        this.b.b();
    }

    public final void f(float f) {
        v8d v8dVar = this.b;
        v8dVar.f = f;
        lh4 lh4Var = v8dVar.a;
        ((kh4) lh4Var.d).c();
        ((kh4) lh4Var.e).c();
        lh4Var.c = false;
        lh4Var.b = -9223372036854775807L;
        lh4Var.a = 0;
        v8dVar.c();
    }

    public final void g(Surface surface) {
        boolean z;
        if (surface != null) {
            z = true;
        } else {
            z = false;
        }
        this.m = z;
        this.n = false;
        v8d v8dVar = this.b;
        if (v8dVar.e != surface) {
            v8dVar.a();
            v8dVar.e = surface;
            v8dVar.d(true);
        }
        this.e = Math.min(this.e, 1);
    }

    public final void h(float f) {
        boolean z;
        if (f > nae.e) {
            z = true;
        } else {
            z = false;
        }
        wq9.s(z);
        if (f == this.k) {
            return;
        }
        this.k = f;
        v8d v8dVar = this.b;
        v8dVar.i = f;
        v8dVar.d(false);
    }
}

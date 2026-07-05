package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kh  reason: default package */
/* loaded from: classes.dex */
public final class kh implements dv2, View.OnAttachStateChangeListener, Runnable {
    public long D;
    public wu7 E;
    public long F;
    public final wu7 G;
    public c8a H;
    public boolean I;
    public final rg a;
    public final v7 b;
    public q12 c;
    public final kv7 d = new kv7();
    public final long e = 100;
    public hh f = hh.a;
    public boolean C = true;

    public kh(rg rgVar, v7 v7Var) {
        this.a = rgVar;
        this.b = v7Var;
        new Handler(Looper.getMainLooper());
        wu7 wu7Var = oy5.a;
        wu7Var.getClass();
        this.E = wu7Var;
        this.G = new wu7();
        this.H = new c8a(rgVar.getSemanticsOwner().a(), wu7Var);
    }

    public final void a(ny5 ny5Var) {
        int[] iArr;
        int[] iArr2;
        long j;
        char c;
        long j2;
        int i;
        int i2;
        b8a b8aVar;
        long j3;
        ps psVar;
        ps psVar2;
        long j4;
        ps psVar3;
        ny5 ny5Var2 = ny5Var;
        int[] iArr3 = ny5Var2.b;
        long[] jArr = ny5Var2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j5 = jArr[i3];
                char c2 = 7;
                long j6 = -9187201950435737472L;
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8;
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j5 & 255) < 128) {
                            int i7 = iArr3[(i3 << 3) + i6];
                            c = c2;
                            c8a c8aVar = (c8a) this.G.b(i7);
                            d8a d8aVar = (d8a) ny5Var2.b(i7);
                            if (d8aVar != null) {
                                b8aVar = d8aVar.a;
                            } else {
                                b8aVar = null;
                            }
                            if (b8aVar != null) {
                                j2 = j6;
                                int i8 = b8aVar.f;
                                tv7 tv7Var = b8aVar.d.a;
                                if (c8aVar == null) {
                                    Object[] objArr = tv7Var.b;
                                    long[] jArr2 = tv7Var.a;
                                    int length2 = jArr2.length - 2;
                                    iArr2 = iArr3;
                                    if (length2 >= 0) {
                                        int i9 = i4;
                                        int i10 = 0;
                                        while (true) {
                                            long j7 = jArr2[i10];
                                            j = j5;
                                            if ((((~j7) << c) & j7 & j2) != j2) {
                                                int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                                for (int i12 = 0; i12 < i11; i12++) {
                                                    if ((j7 & 255) < 128) {
                                                        j4 = j7;
                                                        k8a k8aVar = h8a.C;
                                                        if (c16.i((k8a) objArr[(i10 << 3) + i12], k8aVar)) {
                                                            Object g = tv7Var.g(k8aVar);
                                                            if (g == null) {
                                                                g = null;
                                                            }
                                                            List list = (List) g;
                                                            if (list != null) {
                                                                psVar3 = (ps) sl1.e0(list);
                                                            } else {
                                                                psVar3 = null;
                                                            }
                                                            g(i8, String.valueOf(psVar3));
                                                        }
                                                    } else {
                                                        j4 = j7;
                                                    }
                                                    j7 = j4 >> i9;
                                                }
                                                if (i11 != i9) {
                                                    break;
                                                }
                                            }
                                            if (i10 == length2) {
                                                break;
                                            }
                                            i10++;
                                            j5 = j;
                                            i9 = 8;
                                        }
                                    } else {
                                        j = j5;
                                    }
                                } else {
                                    iArr2 = iArr3;
                                    j = j5;
                                    Object[] objArr2 = tv7Var.b;
                                    long[] jArr3 = tv7Var.a;
                                    int length3 = jArr3.length - 2;
                                    if (length3 >= 0) {
                                        long[] jArr4 = jArr3;
                                        int i13 = 0;
                                        while (true) {
                                            long j8 = jArr4[i13];
                                            long[] jArr5 = jArr4;
                                            i = i6;
                                            if ((((~j8) << c) & j8 & j2) != j2) {
                                                int i14 = 8 - ((~(i13 - length3)) >>> 31);
                                                int i15 = 0;
                                                while (i15 < i14) {
                                                    if ((j8 & 255) < 128) {
                                                        j3 = j8;
                                                        k8a k8aVar2 = h8a.C;
                                                        if (c16.i((k8a) objArr2[(i13 << 3) + i15], k8aVar2)) {
                                                            Object g2 = c8aVar.a.a.g(k8aVar2);
                                                            if (g2 == null) {
                                                                g2 = null;
                                                            }
                                                            List list2 = (List) g2;
                                                            if (list2 != null) {
                                                                psVar = (ps) sl1.e0(list2);
                                                            } else {
                                                                psVar = null;
                                                            }
                                                            Object g3 = tv7Var.g(k8aVar2);
                                                            if (g3 == null) {
                                                                g3 = null;
                                                            }
                                                            List list3 = (List) g3;
                                                            if (list3 != null) {
                                                                psVar2 = (ps) sl1.e0(list3);
                                                            } else {
                                                                psVar2 = null;
                                                            }
                                                            if (!c16.i(psVar, psVar2)) {
                                                                g(i8, String.valueOf(psVar2));
                                                            }
                                                        }
                                                    } else {
                                                        j3 = j8;
                                                    }
                                                    i15++;
                                                    j8 = j3 >> 8;
                                                }
                                                if (i14 != 8) {
                                                    break;
                                                }
                                            }
                                            if (i13 == length3) {
                                                break;
                                            }
                                            i13++;
                                            i6 = i;
                                            jArr4 = jArr5;
                                        }
                                        i2 = 8;
                                    }
                                }
                                i = i6;
                                i2 = 8;
                            } else {
                                throw a82.f("no value for specified key");
                            }
                        } else {
                            iArr2 = iArr3;
                            j = j5;
                            c = c2;
                            j2 = j6;
                            i = i6;
                            i2 = i4;
                        }
                        j5 = j >> i2;
                        i6 = i + 1;
                        i4 = i2;
                        c2 = c;
                        j6 = j2;
                        iArr3 = iArr2;
                        ny5Var2 = ny5Var;
                    }
                    iArr = iArr3;
                    if (i5 != i4) {
                        return;
                    }
                } else {
                    iArr = iArr3;
                }
                if (i3 != length) {
                    i3++;
                    ny5Var2 = ny5Var;
                    iArr3 = iArr;
                } else {
                    return;
                }
            }
        }
    }

    public final void b(b8a b8aVar, lu4 lu4Var) {
        b8aVar.getClass();
        List j = b8a.j(4, b8aVar);
        int size = j.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = j.get(i2);
            if (c().a(((b8a) obj).f)) {
                lu4Var.invoke(Integer.valueOf(i), obj);
                i++;
            }
        }
    }

    public final ny5 c() {
        if (this.C) {
            this.C = false;
            this.E = bue.i(this.a.getSemanticsOwner(), kg.e);
            this.F = System.currentTimeMillis();
        }
        return this.E;
    }

    public final void d() {
        q12 q12Var = this.c;
        if (q12Var != null && Build.VERSION.SDK_INT >= 29) {
            kv7 kv7Var = this.d;
            if (kv7Var.i()) {
                Object[] objArr = kv7Var.a;
                int i = kv7Var.b;
                for (int i2 = 0; i2 < i; i2++) {
                    n12 n12Var = (n12) objArr[i2];
                    int ordinal = n12Var.c.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            p12 p12Var = (p12) q12Var;
                            AutofillId b = p12Var.b(n12Var.a);
                            if (b != null) {
                                p12Var.e(b);
                            }
                        } else {
                            xk5.o();
                            return;
                        }
                    } else {
                        k57 k57Var = n12Var.d;
                        if (k57Var != null) {
                            ((p12) q12Var).d((ViewStructure) k57Var.b);
                        }
                    }
                }
                ((p12) q12Var).a();
                kv7Var.d();
            }
        }
    }

    public final void e() {
        Handler handler = this.a.getHandler();
        if (handler != null && this.c != null && !this.I) {
            this.I = true;
            long uptimeMillis = (this.D + this.e) - SystemClock.uptimeMillis();
            if (uptimeMillis <= 0) {
                handler.post(this);
            } else {
                handler.postDelayed(this, uptimeMillis);
            }
        }
    }

    public final void f(b8a b8aVar, c8a c8aVar) {
        b(b8aVar, new jh(0, c8aVar, this));
        List j = b8a.j(4, b8aVar);
        int size = j.size();
        for (int i = 0; i < size; i++) {
            b8a b8aVar2 = (b8a) j.get(i);
            ny5 c = c();
            int i2 = b8aVar2.f;
            if (c.a(i2)) {
                wu7 wu7Var = this.G;
                if (wu7Var.a(i2)) {
                    Object b = wu7Var.b(i2);
                    if (b != null) {
                        f(b8aVar2, (c8a) b);
                    } else {
                        throw a82.f("node not present in pruned tree before this change");
                    }
                } else {
                    continue;
                }
            }
        }
    }

    public final void g(int i, String str) {
        q12 q12Var;
        if (Build.VERSION.SDK_INT < 29 || (q12Var = this.c) == null) {
            return;
        }
        p12 p12Var = (p12) q12Var;
        AutofillId b = p12Var.b(i);
        if (b != null) {
            p12Var.f(b, str);
            return;
        }
        throw a82.f("Invalid content capture ID");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0092, code lost:
        if (r1 == null) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0198  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(int r14, defpackage.b8a r15) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kh.h(int, b8a):void");
    }

    public final void i(b8a b8aVar) {
        if (this.c != null) {
            this.d.a(new n12(b8aVar.f, this.F, o12.b, null));
            List j = b8a.j(4, b8aVar);
            int size = j.size();
            for (int i = 0; i < size; i++) {
                i((b8a) j.get(i));
            }
        }
    }

    public final void j() {
        wu7 wu7Var = this.G;
        wu7Var.c();
        ny5 c = c();
        int[] iArr = c.b;
        Object[] objArr = c.c;
        long[] jArr = c.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            wu7Var.i(iArr[i4], new c8a(((d8a) objArr[i4]).a, c()));
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        this.H = new c8a(this.a.getSemanticsOwner().a(), c());
    }

    @Override // defpackage.dv2
    public final void o(un6 un6Var) {
        i(this.a.getSemanticsOwner().a());
        d();
        this.c = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.a.getHandler();
        if (handler != null) {
            handler.removeCallbacks(this);
        }
        this.c = null;
    }

    @Override // defpackage.dv2
    public final void q(un6 un6Var) {
        this.c = (q12) this.b.invoke();
        h(-1, this.a.getSemanticsOwner().a());
        d();
    }

    @Override // java.lang.Runnable
    public final void run() {
        long[] jArr;
        long[] jArr2;
        rg rgVar = this.a;
        this.D = SystemClock.uptimeMillis();
        int i = 0;
        this.I = false;
        if (this.c != null) {
            d();
            Trace.beginSection("ContentCapture:changeChecker");
            try {
                rgVar.u(true);
                wu7 wu7Var = this.G;
                int[] iArr = wu7Var.b;
                long[] jArr3 = wu7Var.a;
                int length = jArr3.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr3[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            int i4 = i;
                            while (i4 < i3) {
                                if ((255 & j) < 128) {
                                    int i5 = iArr[(i2 << 3) + i4];
                                    if (!c().a(i5)) {
                                        jArr2 = jArr3;
                                        this.d.a(new n12(i5, this.F, o12.b, null));
                                        e();
                                        j >>= 8;
                                        i4++;
                                        jArr3 = jArr2;
                                    }
                                }
                                jArr2 = jArr3;
                                j >>= 8;
                                i4++;
                                jArr3 = jArr2;
                            }
                            jArr = jArr3;
                            if (i3 != 8) {
                                break;
                            }
                        } else {
                            jArr = jArr3;
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                        jArr3 = jArr;
                        i = 0;
                    }
                }
                Trace.beginSection("ContentCapture:sendAppearEvents");
                f(rgVar.getSemanticsOwner().a(), this.H);
                Trace.endSection();
                a(c());
                j();
            } finally {
                Trace.endSection();
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}

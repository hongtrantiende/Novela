package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ux1  reason: default package */
/* loaded from: classes.dex */
public final class ux1 implements fk9, ox1 {
    public final tv7 C;
    public final uv7 D;
    public final uv7 E;
    public final tv7 F;
    public final pa1 G;
    public final pa1 H;
    public final tv7 I;
    public tv7 J;
    public boolean K;
    public rka L;
    public qo8 M;
    public ux1 N;
    public int O;
    public final mu9 P;
    public final zm9 Q;
    public final rv4 R;
    public int S;
    public final px1 a;
    public final f0 b;
    public final AtomicReference c = new AtomicReference(null);
    public final Object d = new Object();
    public final wv7 e;
    public final bqa f;

    public ux1(px1 px1Var, f0 f0Var) {
        this.a = px1Var;
        this.b = f0Var;
        uv7 uv7Var = new uv7();
        wv7 wv7Var = uv7Var.e;
        if (wv7Var == null) {
            wv7Var = new wv7(uv7Var);
            uv7Var.e = wv7Var;
        }
        wv7 wv7Var2 = wv7Var;
        this.e = wv7Var2;
        bqa bqaVar = new bqa();
        if (px1Var.e()) {
            bqaVar.G = new wu7();
        }
        if (px1Var.g()) {
            bqaVar.b();
        }
        this.f = bqaVar;
        this.C = axe.h();
        this.D = new uv7();
        this.E = new uv7();
        this.F = axe.h();
        pa1 pa1Var = new pa1();
        this.G = pa1Var;
        pa1 pa1Var2 = new pa1();
        this.H = pa1Var2;
        this.I = axe.h();
        this.J = axe.h();
        mu9 mu9Var = new mu9(px1Var);
        this.P = mu9Var;
        this.Q = new zm9();
        rv4 rv4Var = new rv4(f0Var, px1Var, dqa.d(bqaVar), wv7Var2, pa1Var, pa1Var2, mu9Var, this);
        px1Var.s(rv4Var);
        this.R = rv4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.Set[]] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object[]] */
    public final void A(vz9 vz9Var) {
        vz9 vz9Var2;
        while (true) {
            Object obj = this.c.get();
            if (obj != null && !obj.equals(dpe.c)) {
                if (obj instanceof Set) {
                    vz9Var2 = new Set[]{obj, vz9Var};
                } else if (obj instanceof Object[]) {
                    Set[] setArr = (Set[]) obj;
                    int length = setArr.length;
                    ?? copyOf = Arrays.copyOf(setArr, length + 1);
                    copyOf[length] = vz9Var;
                    vz9Var2 = copyOf;
                } else {
                    cp8.u(this.c, "corrupt pendingModifications: ");
                    return;
                }
            } else {
                vz9Var2 = vz9Var;
            }
            AtomicReference atomicReference = this.c;
            while (!atomicReference.compareAndSet(obj, vz9Var2)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            if (obj == null) {
                synchronized (this.d) {
                    r();
                }
                return;
            }
            return;
        }
    }

    public final void B(Object obj) {
        synchronized (this.d) {
            try {
                w(obj);
                Object g = this.F.g(obj);
                if (g != null) {
                    if (g instanceof uv7) {
                        uv7 uv7Var = (uv7) g;
                        Object[] objArr = uv7Var.b;
                        long[] jArr = uv7Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((255 & j) < 128) {
                                            w((h23) objArr[(i << 3) + i3]);
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
                    } else {
                        w((h23) g);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void C(lu4 lu4Var) {
        boolean m = m();
        t();
        px1 px1Var = this.a;
        if (m) {
            rv4 rv4Var = this.R;
            rv4Var.z = 0;
            rv4Var.y = true;
            px1Var.a(this, lu4Var);
            if (rv4Var.F || rv4Var.z != 0) {
                e39.a("Cannot disable reuse from root if it was caused by other groups");
            }
            rv4Var.z = -1;
            rv4Var.y = false;
            return;
        }
        px1Var.a(this, lu4Var);
    }

    @Override // defpackage.ox1
    public final void a() {
        boolean z;
        synchronized (this.d) {
            try {
                if (this.R.F) {
                    e39.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.S != 3) {
                    this.S = 3;
                    pa1 pa1Var = this.R.L;
                    if (pa1Var != null) {
                        i(pa1Var);
                    }
                    if (this.f.b == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z || !this.e.a.g()) {
                        zm9 zm9Var = this.Q;
                        zm9Var.i(this.e, this.R.C());
                        if (!z) {
                            bqa bqaVar = this.f;
                            zm9 zm9Var2 = this.Q;
                            eqa f = bqaVar.f();
                            f.n(f.t, new sj(zm9Var2, 3));
                            f.J();
                            f.e(true);
                            this.b.d();
                            this.b.q();
                            zm9Var.c();
                        }
                        zm9Var.b();
                        zm9Var.a();
                    }
                    rv4 rv4Var = this.R;
                    rv4Var.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    rv4Var.b.x(rv4Var);
                    rv4Var.E.clear();
                    rv4Var.s.clear();
                    rv4Var.e.d.m();
                    rv4Var.v = null;
                    rv4Var.a.d();
                    Trace.endSection();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a.y(this);
    }

    public final void b() {
        this.c.set(null);
        this.G.d.m();
        this.H.d.m();
        wv7 wv7Var = this.e;
        if (!wv7Var.a.g()) {
            zm9 zm9Var = this.Q;
            try {
                zm9Var.i(wv7Var, this.R.C());
                zm9Var.b();
            } finally {
                zm9Var.a();
            }
        }
    }

    @Override // defpackage.fk9
    public final void c() {
        this.K = true;
        this.P.p();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.fk9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ux1.d(java.lang.Object):void");
    }

    public final void e(Object obj, boolean z) {
        Object g = this.C.g(obj);
        if (g != null) {
            boolean z2 = g instanceof uv7;
            u16 u16Var = u16.a;
            uv7 uv7Var = this.D;
            uv7 uv7Var2 = this.E;
            tv7 tv7Var = this.I;
            if (z2) {
                uv7 uv7Var3 = (uv7) g;
                Object[] objArr = uv7Var3.b;
                long[] jArr = uv7Var3.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    ek9 ek9Var = (ek9) objArr[(i << 3) + i3];
                                    if (!axe.q(tv7Var, obj, ek9Var) && ek9Var.b(obj) != u16Var) {
                                        if (ek9Var.g != null && !z) {
                                            uv7Var2.a(ek9Var);
                                        } else {
                                            uv7Var.a(ek9Var);
                                        }
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                return;
                            }
                        }
                        if (i != length) {
                            i++;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                ek9 ek9Var2 = (ek9) g;
                if (!axe.q(tv7Var, obj, ek9Var2) && ek9Var2.b(obj) != u16Var) {
                    if (ek9Var2.g != null && !z) {
                        uv7Var2.a(ek9Var2);
                    } else {
                        uv7Var.a(ek9Var2);
                    }
                }
            }
        }
    }

    @Override // defpackage.fk9
    public final u16 f(ek9 ek9Var, Object obj) {
        ux1 ux1Var;
        int i = ek9Var.b;
        if ((i & 2) != 0) {
            ek9Var.b = i | 4;
        }
        lv4 lv4Var = ek9Var.c;
        if (lv4Var != null && lv4Var.a()) {
            bqa bqaVar = this.f;
            bqaVar.getClass();
            lv4 lv4Var2 = ek9Var.c;
            if (lv4Var2 != null && bqaVar.g(zbe.m(lv4Var2))) {
                if (ek9Var.d != null) {
                    u16 v = v(ek9Var, lv4Var, obj);
                    if (v != u16.a) {
                        this.P.p();
                    }
                    return v;
                }
                return u16.a;
            }
            synchronized (this.d) {
                ux1Var = this.N;
            }
            if (ux1Var != null) {
                rv4 rv4Var = ux1Var.R;
                if (rv4Var.F && rv4Var.k0(ek9Var, obj)) {
                    return u16.d;
                }
            }
            return u16.a;
        }
        return u16.a;
    }

    public final void g(Set set, boolean z) {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        boolean c2;
        long[] jArr3;
        long j5;
        long[] jArr4;
        long[] jArr5;
        long j6;
        boolean z2;
        long[] jArr6;
        long j7;
        long[] jArr7;
        long[] jArr8;
        char c3;
        long j8;
        int i;
        int i2;
        long[] jArr9;
        boolean z3 = set instanceof vz9;
        tv7 tv7Var = this.F;
        Object obj = null;
        int i3 = 8;
        if (z3) {
            uv7 uv7Var = ((vz9) set).a;
            Object[] objArr = uv7Var.b;
            long[] jArr10 = uv7Var.a;
            int length = jArr10.length - 2;
            if (length >= 0) {
                int i4 = 0;
                j = 128;
                j2 = 255;
                while (true) {
                    long j9 = jArr10[i4];
                    char c4 = 7;
                    j3 = -9187201950435737472L;
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j9 & 255) < 128) {
                                Object obj2 = objArr[(i4 << 3) + i6];
                                c3 = c4;
                                if (obj2 instanceof ek9) {
                                    ((ek9) obj2).b(obj);
                                } else {
                                    e(obj2, z);
                                    Object g = tv7Var.g(obj2);
                                    if (g != null) {
                                        if (g instanceof uv7) {
                                            uv7 uv7Var2 = (uv7) g;
                                            Object[] objArr2 = uv7Var2.b;
                                            long[] jArr11 = uv7Var2.a;
                                            int length2 = jArr11.length - 2;
                                            if (length2 >= 0) {
                                                int i7 = i3;
                                                i = length;
                                                int i8 = 0;
                                                while (true) {
                                                    long j10 = jArr11[i8];
                                                    j8 = j9;
                                                    long[] jArr12 = jArr11;
                                                    if ((((~j10) << c3) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                                        int i10 = 0;
                                                        while (i10 < i9) {
                                                            if ((j10 & 255) < 128) {
                                                                jArr9 = jArr10;
                                                                e((h23) objArr2[(i8 << 3) + i10], z);
                                                            } else {
                                                                jArr9 = jArr10;
                                                            }
                                                            j10 >>= i7;
                                                            i10++;
                                                            jArr10 = jArr9;
                                                        }
                                                        jArr8 = jArr10;
                                                        if (i9 != i7) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr8 = jArr10;
                                                    }
                                                    if (i8 == length2) {
                                                        break;
                                                    }
                                                    i8++;
                                                    jArr11 = jArr12;
                                                    j9 = j8;
                                                    jArr10 = jArr8;
                                                    i7 = 8;
                                                }
                                            }
                                        } else {
                                            jArr8 = jArr10;
                                            j8 = j9;
                                            i = length;
                                            e((h23) g, z);
                                        }
                                        i2 = 8;
                                    }
                                }
                                jArr8 = jArr10;
                                j8 = j9;
                                i = length;
                                i2 = 8;
                            } else {
                                jArr8 = jArr10;
                                c3 = c4;
                                j8 = j9;
                                i = length;
                                i2 = i3;
                            }
                            j9 = j8 >> i2;
                            i6++;
                            length = i;
                            i3 = i2;
                            c4 = c3;
                            jArr10 = jArr8;
                            obj = null;
                        }
                        jArr7 = jArr10;
                        c = c4;
                        int i11 = length;
                        if (i5 != i3) {
                            break;
                        }
                        length = i11;
                    } else {
                        jArr7 = jArr10;
                        c = 7;
                    }
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                    jArr10 = jArr7;
                    obj = null;
                    i3 = 8;
                }
            } else {
                j = 128;
                j2 = 255;
                j3 = -9187201950435737472L;
                c = 7;
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof ek9) {
                    ((ek9) obj3).b(null);
                } else {
                    e(obj3, z);
                    Object g2 = tv7Var.g(obj3);
                    if (g2 != null) {
                        if (g2 instanceof uv7) {
                            uv7 uv7Var3 = (uv7) g2;
                            Object[] objArr3 = uv7Var3.b;
                            long[] jArr13 = uv7Var3.a;
                            int length3 = jArr13.length - 2;
                            if (length3 >= 0) {
                                int i12 = 0;
                                while (true) {
                                    long j11 = jArr13[i12];
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i13 = 8 - ((~(i12 - length3)) >>> 31);
                                        for (int i14 = 0; i14 < i13; i14++) {
                                            if ((j11 & 255) < 128) {
                                                e((h23) objArr3[(i12 << 3) + i14], z);
                                            }
                                            j11 >>= 8;
                                        }
                                        if (i13 != 8) {
                                            break;
                                        }
                                    }
                                    if (i12 != length3) {
                                        i12++;
                                    }
                                }
                            }
                        } else {
                            e((h23) g2, z);
                        }
                    }
                }
            }
        }
        tv7 tv7Var2 = this.C;
        uv7 uv7Var4 = this.D;
        if (z) {
            uv7 uv7Var5 = this.E;
            if (uv7Var5.h()) {
                long[] jArr14 = tv7Var2.a;
                int length4 = jArr14.length - 2;
                if (length4 >= 0) {
                    int i15 = 0;
                    while (true) {
                        long j12 = jArr14[i15];
                        if ((((~j12) << c) & j12 & j3) != j3) {
                            int i16 = 8 - ((~(i15 - length4)) >>> 31);
                            int i17 = 0;
                            while (i17 < i16) {
                                if ((j12 & j2) < j) {
                                    int i18 = (i15 << 3) + i17;
                                    Object obj4 = tv7Var2.b[i18];
                                    Object obj5 = tv7Var2.c[i18];
                                    if (obj5 instanceof uv7) {
                                        uv7 uv7Var6 = (uv7) obj5;
                                        Object[] objArr4 = uv7Var6.b;
                                        long[] jArr15 = uv7Var6.a;
                                        int length5 = jArr15.length - 2;
                                        if (length5 >= 0) {
                                            j6 = j12;
                                            int i19 = 0;
                                            while (true) {
                                                long j13 = jArr15[i19];
                                                Object[] objArr5 = objArr4;
                                                long[] jArr16 = jArr15;
                                                if ((((~j13) << c) & j13 & j3) != j3) {
                                                    int i20 = 8 - ((~(i19 - length5)) >>> 31);
                                                    int i21 = 0;
                                                    while (i21 < i20) {
                                                        if ((j13 & j2) < j) {
                                                            jArr6 = jArr14;
                                                            int i22 = (i19 << 3) + i21;
                                                            j7 = j13;
                                                            ek9 ek9Var = (ek9) objArr5[i22];
                                                            if (uv7Var5.c(ek9Var) || uv7Var4.c(ek9Var)) {
                                                                uv7Var6.m(i22);
                                                            }
                                                        } else {
                                                            jArr6 = jArr14;
                                                            j7 = j13;
                                                        }
                                                        j13 = j7 >> 8;
                                                        i21++;
                                                        jArr14 = jArr6;
                                                    }
                                                    jArr5 = jArr14;
                                                    if (i20 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr5 = jArr14;
                                                }
                                                if (i19 == length5) {
                                                    break;
                                                }
                                                i19++;
                                                objArr4 = objArr5;
                                                jArr15 = jArr16;
                                                jArr14 = jArr5;
                                            }
                                        } else {
                                            jArr5 = jArr14;
                                            j6 = j12;
                                        }
                                        z2 = uv7Var6.g();
                                    } else {
                                        jArr5 = jArr14;
                                        j6 = j12;
                                        obj5.getClass();
                                        ek9 ek9Var2 = (ek9) obj5;
                                        if (!uv7Var5.c(ek9Var2) && !uv7Var4.c(ek9Var2)) {
                                            z2 = false;
                                        } else {
                                            z2 = true;
                                        }
                                    }
                                    if (z2) {
                                        tv7Var2.m(i18);
                                    }
                                } else {
                                    jArr5 = jArr14;
                                    j6 = j12;
                                }
                                j12 = j6 >> 8;
                                i17++;
                                jArr14 = jArr5;
                            }
                            jArr4 = jArr14;
                            if (i16 != 8) {
                                break;
                            }
                        } else {
                            jArr4 = jArr14;
                        }
                        if (i15 == length4) {
                            break;
                        }
                        i15++;
                        jArr14 = jArr4;
                    }
                }
                uv7Var5.b();
                l();
                return;
            }
        }
        if (uv7Var4.h()) {
            long[] jArr17 = tv7Var2.a;
            int length6 = jArr17.length - 2;
            if (length6 >= 0) {
                int i23 = 0;
                while (true) {
                    long j14 = jArr17[i23];
                    if ((((~j14) << c) & j14 & j3) != j3) {
                        int i24 = 8 - ((~(i23 - length6)) >>> 31);
                        int i25 = 0;
                        while (i25 < i24) {
                            if ((j14 & j2) < j) {
                                int i26 = (i23 << 3) + i25;
                                Object obj6 = tv7Var2.b[i26];
                                Object obj7 = tv7Var2.c[i26];
                                if (obj7 instanceof uv7) {
                                    uv7 uv7Var7 = (uv7) obj7;
                                    Object[] objArr6 = uv7Var7.b;
                                    long[] jArr18 = uv7Var7.a;
                                    int length7 = jArr18.length - 2;
                                    if (length7 >= 0) {
                                        j4 = j14;
                                        int i27 = 0;
                                        while (true) {
                                            long j15 = jArr18[i27];
                                            Object[] objArr7 = objArr6;
                                            long[] jArr19 = jArr18;
                                            if ((((~j15) << c) & j15 & j3) != j3) {
                                                int i28 = 8 - ((~(i27 - length7)) >>> 31);
                                                int i29 = 0;
                                                while (i29 < i28) {
                                                    if ((j15 & j2) < j) {
                                                        jArr3 = jArr17;
                                                        int i30 = (i27 << 3) + i29;
                                                        j5 = j15;
                                                        if (uv7Var4.c((ek9) objArr7[i30])) {
                                                            uv7Var7.m(i30);
                                                        }
                                                    } else {
                                                        jArr3 = jArr17;
                                                        j5 = j15;
                                                    }
                                                    j15 = j5 >> 8;
                                                    i29++;
                                                    jArr17 = jArr3;
                                                }
                                                jArr2 = jArr17;
                                                if (i28 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr17;
                                            }
                                            if (i27 == length7) {
                                                break;
                                            }
                                            i27++;
                                            objArr6 = objArr7;
                                            jArr18 = jArr19;
                                            jArr17 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr17;
                                        j4 = j14;
                                    }
                                    c2 = uv7Var7.g();
                                } else {
                                    jArr2 = jArr17;
                                    j4 = j14;
                                    obj7.getClass();
                                    c2 = uv7Var4.c((ek9) obj7);
                                }
                                if (c2) {
                                    tv7Var2.m(i26);
                                }
                            } else {
                                jArr2 = jArr17;
                                j4 = j14;
                            }
                            j14 = j4 >> 8;
                            i25++;
                            jArr17 = jArr2;
                        }
                        jArr = jArr17;
                        if (i24 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr17;
                    }
                    if (i23 == length6) {
                        break;
                    }
                    i23++;
                    jArr17 = jArr;
                }
            }
            l();
            uv7Var4.b();
        }
    }

    public final void h() {
        synchronized (this.d) {
            try {
                i(this.G);
                r();
            } catch (Throwable th) {
                try {
                    if (!this.e.a.g()) {
                        zm9 zm9Var = this.Q;
                        zm9Var.i(this.e, this.R.C());
                        zm9Var.b();
                        zm9Var.a();
                    }
                    throw th;
                } catch (Throwable th2) {
                    b();
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e A[Catch: all -> 0x003e, TRY_LEAVE, TryCatch #7 {all -> 0x003e, blocks: (B:3:0x0013, B:17:0x0035, B:19:0x0039, B:26:0x0047, B:28:0x004b, B:32:0x0056, B:46:0x0081, B:48:0x008e, B:24:0x0043), top: B:152:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(defpackage.pa1 r34) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ux1.i(pa1):void");
    }

    public final void j() {
        synchronized (this.d) {
            try {
                pa1 pa1Var = this.H;
                pa1Var.getClass();
                if (!pa1Var.d.o()) {
                    i(this.H);
                }
            } catch (Throwable th) {
                try {
                    if (!this.e.a.g()) {
                        zm9 zm9Var = this.Q;
                        zm9Var.i(this.e, this.R.C());
                        zm9Var.b();
                        zm9Var.a();
                    }
                    throw th;
                } catch (Throwable th2) {
                    b();
                    throw th2;
                }
            }
        }
    }

    public final void k() {
        synchronized (this.d) {
            try {
                this.R.v = null;
                if (!this.e.a.g()) {
                    zm9 zm9Var = this.Q;
                    zm9Var.i(this.e, this.R.C());
                    zm9Var.b();
                    zm9Var.a();
                }
            } catch (Throwable th) {
                try {
                    if (!this.e.a.g()) {
                        zm9 zm9Var2 = this.Q;
                        zm9Var2.i(this.e, this.R.C());
                        zm9Var2.b();
                        zm9Var2.a();
                    }
                    throw th;
                } catch (Throwable th2) {
                    b();
                    throw th2;
                }
            }
        }
    }

    public final void l() {
        long j;
        char c;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        int i2;
        long j4;
        char c2;
        long j5;
        long j6;
        int i3;
        boolean z;
        int i4;
        int i5;
        tv7 tv7Var = this.F;
        long[] jArr3 = tv7Var.a;
        int length = jArr3.length - 2;
        long j7 = 255;
        char c3 = 7;
        long j8 = -9187201950435737472L;
        int i6 = 8;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j9 = jArr3[i7];
                j3 = 128;
                if ((((~j9) << c3) & j9 & j8) != j8) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j9 & j7) < 128) {
                            j4 = j7;
                            int i10 = (i7 << 3) + i9;
                            Object obj = tv7Var.b[i10];
                            Object obj2 = tv7Var.c[i10];
                            c2 = c3;
                            boolean z2 = obj2 instanceof uv7;
                            j5 = j8;
                            tv7 tv7Var2 = this.C;
                            if (z2) {
                                uv7 uv7Var = (uv7) obj2;
                                Object[] objArr = uv7Var.b;
                                long[] jArr4 = uv7Var.a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    int i11 = i6;
                                    j6 = j9;
                                    int i12 = 0;
                                    while (true) {
                                        long j10 = jArr4[i12];
                                        jArr2 = jArr3;
                                        i = length;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                            int i14 = 0;
                                            while (i14 < i13) {
                                                if ((j10 & j4) < 128) {
                                                    i4 = i14;
                                                    int i15 = (i12 << 3) + i4;
                                                    i5 = i9;
                                                    if (!tv7Var2.c((h23) objArr[i15])) {
                                                        uv7Var.m(i15);
                                                    }
                                                } else {
                                                    i4 = i14;
                                                    i5 = i9;
                                                }
                                                j10 >>= i11;
                                                i14 = i4 + 1;
                                                i9 = i5;
                                            }
                                            i2 = i9;
                                            if (i13 != i11) {
                                                break;
                                            }
                                        } else {
                                            i2 = i9;
                                        }
                                        if (i12 == length2) {
                                            break;
                                        }
                                        i12++;
                                        jArr3 = jArr2;
                                        length = i;
                                        i9 = i2;
                                        i11 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i = length;
                                    i2 = i9;
                                    j6 = j9;
                                }
                                z = uv7Var.g();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                i2 = i9;
                                j6 = j9;
                                obj2.getClass();
                                if (!tv7Var2.c((h23) obj2)) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            }
                            if (z) {
                                tv7Var.m(i10);
                            }
                            i3 = 8;
                        } else {
                            jArr2 = jArr3;
                            i = length;
                            i2 = i9;
                            j4 = j7;
                            c2 = c3;
                            j5 = j8;
                            j6 = j9;
                            i3 = i6;
                        }
                        j9 = j6 >> i3;
                        i9 = i2 + 1;
                        i6 = i3;
                        c3 = c2;
                        j7 = j4;
                        j8 = j5;
                        jArr3 = jArr2;
                        length = i;
                    }
                    jArr = jArr3;
                    int i16 = length;
                    j = j7;
                    c = c3;
                    j2 = j8;
                    if (i8 != i6) {
                        break;
                    }
                    length = i16;
                } else {
                    jArr = jArr3;
                    j = j7;
                    c = c3;
                    j2 = j8;
                }
                if (i7 == length) {
                    break;
                }
                i7++;
                c3 = c;
                j7 = j;
                j8 = j2;
                jArr3 = jArr;
                i6 = 8;
            }
        } else {
            j = 255;
            c = 7;
            j2 = -9187201950435737472L;
            j3 = 128;
        }
        uv7 uv7Var2 = this.E;
        if (uv7Var2.h()) {
            Object[] objArr2 = uv7Var2.b;
            long[] jArr5 = uv7Var2.a;
            int length3 = jArr5.length - 2;
            if (length3 >= 0) {
                int i17 = 0;
                while (true) {
                    long j11 = jArr5[i17];
                    if ((((~j11) << c) & j11 & j2) != j2) {
                        int i18 = 8 - ((~(i17 - length3)) >>> 31);
                        for (int i19 = 0; i19 < i18; i19++) {
                            if ((j11 & j) < j3) {
                                int i20 = (i17 << 3) + i19;
                                if (((ek9) objArr2[i20]).g == null) {
                                    uv7Var2.m(i20);
                                }
                            }
                            j11 >>= 8;
                        }
                        if (i18 != 8) {
                            return;
                        }
                    }
                    if (i17 != length3) {
                        i17++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final boolean m() {
        boolean z;
        synchronized (this.d) {
            z = true;
            if (this.S != 1) {
                z = false;
            }
            if (z) {
                this.S = 0;
            }
        }
        return z;
    }

    public final void n(lu4 lu4Var) {
        try {
            synchronized (this.d) {
                q();
                tv7 tv7Var = this.J;
                this.J = axe.h();
                rv4 rv4Var = this.R;
                rka rkaVar = this.L;
                if (!rv4Var.e.d.o()) {
                    ex1.a("Expected applyChanges() to have been called");
                }
                rv4Var.P = rkaVar;
                rv4Var.o(tv7Var, lu4Var);
                rv4Var.P = null;
            }
        } catch (Throwable th) {
            try {
                if (!this.e.a.g()) {
                    zm9 zm9Var = this.Q;
                    zm9Var.i(this.e, this.R.C());
                    zm9Var.b();
                    zm9Var.a();
                }
                throw th;
            } catch (Throwable th2) {
                b();
                throw th2;
            }
        }
    }

    public final qo8 o(boolean z, lu4 lu4Var) {
        if (this.M != null) {
            e39.b("A pausable composition is in progress");
        }
        qo8 qo8Var = new qo8(this, this.a, this.R, this.e, lu4Var, z, this.b, this.d);
        this.M = qo8Var;
        return qo8Var;
    }

    public final void p() {
        boolean z;
        synchronized (this.d) {
            try {
                if (this.M != null) {
                    e39.b("Deactivate is not supported while pausable composition is in progress");
                }
                if (this.f.b == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (!this.e.a.g()) {
                    }
                    this.C.a();
                    this.F.a();
                    this.J.a();
                    this.G.d.m();
                    this.H.d.m();
                    rv4 rv4Var = this.R;
                    rv4Var.E.clear();
                    rv4Var.s.clear();
                    rv4Var.e.d.m();
                    rv4Var.v = null;
                    this.S = 1;
                }
                Trace.beginSection("Compose:deactivate");
                zm9 zm9Var = this.Q;
                zm9Var.i(this.e, this.R.C());
                if (!z) {
                    bqa bqaVar = this.f;
                    zm9 zm9Var2 = this.Q;
                    eqa f = bqaVar.f();
                    try {
                        f.n(f.t, new sv4(0, zm9Var2, f));
                        f.e(true);
                        this.b.q();
                        zm9Var.c();
                    } catch (Throwable th) {
                        f.e(false);
                        throw th;
                    }
                }
                zm9Var.b();
                zm9Var.a();
                Trace.endSection();
                this.C.a();
                this.F.a();
                this.J.a();
                this.G.d.m();
                this.H.d.m();
                rv4 rv4Var2 = this.R;
                rv4Var2.E.clear();
                rv4Var2.s.clear();
                rv4Var2.e.d.m();
                rv4Var2.v = null;
                this.S = 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void q() {
        Object obj = dpe.c;
        AtomicReference atomicReference = this.c;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (!andSet.equals(obj)) {
                if (andSet instanceof Set) {
                    g((Set) andSet, true);
                    return;
                } else if (andSet instanceof Object[]) {
                    for (Set set : (Set[]) andSet) {
                        g(set, true);
                    }
                    return;
                } else {
                    ex1.b("corrupt pendingModifications drain: " + atomicReference);
                    ls2.c();
                    return;
                }
            }
            ex1.b("pending composition has not been applied");
            ls2.c();
        }
    }

    public final void r() {
        AtomicReference atomicReference = this.c;
        Object andSet = atomicReference.getAndSet(null);
        if (!c16.i(andSet, dpe.c)) {
            if (andSet instanceof Set) {
                g((Set) andSet, false);
            } else if (andSet instanceof Object[]) {
                for (Set set : (Set[]) andSet) {
                    g(set, false);
                }
            } else if (andSet == null) {
                if (this.M == null) {
                    ex1.a("calling recordModificationsOf and applyChanges concurrently is not supported");
                }
            } else {
                ex1.b("corrupt pendingModifications drain: " + atomicReference);
                ls2.c();
            }
        }
    }

    public final void s() {
        rs3 rs3Var = rs3.a;
        AtomicReference atomicReference = this.c;
        Object andSet = atomicReference.getAndSet(rs3Var);
        if (!c16.i(andSet, dpe.c) && andSet != null) {
            if (andSet instanceof Set) {
                g((Set) andSet, false);
            } else if (andSet instanceof Object[]) {
                for (Set set : (Set[]) andSet) {
                    g(set, false);
                }
            } else {
                ex1.b("corrupt pendingModifications drain: " + atomicReference);
                ls2.c();
            }
        }
    }

    public final void t() {
        String str;
        int i = this.S;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        str = "";
                    } else {
                        str = "The composition is disposed";
                    }
                } else {
                    str = "A previous pausable composition for this composition was cancelled. This composition must be disposed.";
                }
            } else {
                str = "The composition should be activated before setting content.";
            }
            e39.b(str);
        }
        if (this.M == null) {
            return;
        }
        e39.b("A pausable composition is in progress");
    }

    public final void u(ArrayList arrayList) {
        wv7 wv7Var = this.e;
        rv4 rv4Var = this.R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((ls7) ((yk8) arrayList.get(i)).a).c != this) {
                ex1.a("Check failed");
                break;
            }
        }
        try {
            rv4Var.getClass();
            Trace.beginSection("Compose:insertMovableContent");
            rv4Var.F(arrayList);
            rv4Var.i();
            Trace.endSection();
        } catch (Throwable th) {
            try {
                if (!wv7Var.a.g()) {
                    zm9 zm9Var = this.Q;
                    zm9Var.i(wv7Var, rv4Var.C());
                    zm9Var.b();
                    zm9Var.a();
                }
                throw th;
            } catch (Throwable th2) {
                b();
                throw th2;
            }
        }
    }

    public final u16 v(ek9 ek9Var, lv4 lv4Var, Object obj) {
        boolean z;
        synchronized (this.d) {
            try {
                ux1 ux1Var = this.N;
                ux1 ux1Var2 = null;
                if (ux1Var != null) {
                    bqa bqaVar = this.f;
                    int i = this.O;
                    if (bqaVar.C) {
                        ex1.a("Writer is active");
                    }
                    if (i < 0 || i >= bqaVar.b) {
                        ex1.a("Invalid group index");
                    }
                    lv4 m = zbe.m(lv4Var);
                    if (bqaVar.g(m)) {
                        int i2 = bqaVar.a[(i * 5) + 3] + i;
                        int i3 = m.a;
                        if (i <= i3 && i3 < i2) {
                            ux1Var2 = ux1Var;
                        }
                    }
                    ux1Var = null;
                    ux1Var2 = ux1Var;
                }
                if (ux1Var2 == null) {
                    rv4 rv4Var = this.R;
                    if (rv4Var.F && rv4Var.k0(ek9Var, obj)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        return u16.d;
                    } else if (obj == null) {
                        this.J.n(ek9Var, ox9.H);
                    } else {
                        boolean z2 = obj instanceof h23;
                        tv7 tv7Var = this.J;
                        if (!z2) {
                            tv7Var.n(ek9Var, ox9.H);
                        } else {
                            Object g = tv7Var.g(ek9Var);
                            if (g != null) {
                                if (g instanceof uv7) {
                                    uv7 uv7Var = (uv7) g;
                                    Object[] objArr = uv7Var.b;
                                    long[] jArr = uv7Var.a;
                                    int length = jArr.length - 2;
                                    if (length >= 0) {
                                        int i4 = 0;
                                        loop0: while (true) {
                                            long j = jArr[i4];
                                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i5 = 8 - ((~(i4 - length)) >>> 31);
                                                for (int i6 = 0; i6 < i5; i6++) {
                                                    if ((255 & j) < 128 && objArr[(i4 << 3) + i6] == ox9.H) {
                                                        break loop0;
                                                    }
                                                    j >>= 8;
                                                }
                                                if (i5 != 8) {
                                                    break;
                                                }
                                            }
                                            if (i4 == length) {
                                                break;
                                            }
                                            i4++;
                                        }
                                    }
                                } else if (g == ox9.H) {
                                }
                            }
                            axe.c(this.J, ek9Var, obj);
                        }
                    }
                }
                if (ux1Var2 != null) {
                    return ux1Var2.v(ek9Var, lv4Var, obj);
                }
                this.a.n(this);
                if (this.R.F) {
                    return u16.c;
                }
                return u16.b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void w(Object obj) {
        Object g = this.C.g(obj);
        if (g != null) {
            boolean z = g instanceof uv7;
            u16 u16Var = u16.d;
            tv7 tv7Var = this.I;
            if (z) {
                uv7 uv7Var = (uv7) g;
                Object[] objArr = uv7Var.b;
                long[] jArr = uv7Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    ek9 ek9Var = (ek9) objArr[(i << 3) + i3];
                                    if (ek9Var.b(obj) == u16Var) {
                                        axe.c(tv7Var, obj, ek9Var);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                return;
                            }
                        }
                        if (i != length) {
                            i++;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                ek9 ek9Var2 = (ek9) g;
                if (ek9Var2.b(obj) == u16Var) {
                    axe.c(tv7Var, obj, ek9Var2);
                }
            }
        }
    }

    public final boolean x() {
        if (this.S == 3) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean y(java.util.Set r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1 instanceof defpackage.vz9
            tv7 r3 = r0.F
            tv7 r0 = r0.C
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L5e
            vz9 r1 = (defpackage.vz9) r1
            uv7 r1 = r1.a
            java.lang.Object[] r2 = r1.b
            long[] r1 = r1.a
            int r6 = r1.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L7b
            r7 = r4
        L1c:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L59
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r4
        L36:
            if (r12 >= r10) goto L57
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L53
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r2[r13]
            boolean r14 = r0.c(r13)
            if (r14 != 0) goto L52
            boolean r13 = r3.c(r13)
            if (r13 == 0) goto L53
        L52:
            return r5
        L53:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L36
        L57:
            if (r10 != r11) goto L7b
        L59:
            if (r7 == r6) goto L7b
            int r7 = r7 + 1
            goto L1c
        L5e:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L64:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7b
            java.lang.Object r2 = r1.next()
            boolean r6 = r0.c(r2)
            if (r6 != 0) goto L7a
            boolean r2 = r3.c(r2)
            if (r2 == 0) goto L64
        L7a:
            return r5
        L7b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ux1.y(java.util.Set):boolean");
    }

    public final boolean z() {
        synchronized (this.d) {
            qo8 qo8Var = this.M;
            boolean z = false;
            if (qo8Var != null && (qo8Var.h.get() != so8.e || qo8Var.i != hc2.i())) {
                AtomicReference atomicReference = qo8Var.h;
                so8 so8Var = so8.f;
                so8 so8Var2 = so8.d;
                while (!atomicReference.compareAndSet(so8Var, so8Var2) && atomicReference.get() == so8Var) {
                }
                ((vu7) qo8Var.l.b).a(9);
                return false;
            }
            q();
            tv7 tv7Var = this.J;
            this.J = axe.h();
            rv4 rv4Var = this.R;
            rka rkaVar = this.L;
            re8 re8Var = rv4Var.e.d;
            if (!re8Var.o()) {
                ex1.a("Expected applyChanges() to have been called");
            }
            if (tv7Var.e > 0 || !rv4Var.s.isEmpty()) {
                rv4Var.P = rkaVar;
                try {
                    rv4Var.o(tv7Var, null);
                    rv4Var.P = null;
                    z = !re8Var.o();
                } catch (Throwable th) {
                    rv4Var.P = null;
                    throw th;
                }
            }
            if (!z) {
                r();
            }
            return z;
        }
    }
}

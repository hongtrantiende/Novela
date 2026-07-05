package defpackage;

import android.os.Build;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q1d  reason: default package */
/* loaded from: classes.dex */
public final class q1d {
    public static final tu1 b = new tu1(new c8(22, (byte) 0), false, 1733214986);
    public static final az c = new az(1);
    public static final o9a[] d = new o9a[0];
    public final /* synthetic */ int a;

    public /* synthetic */ q1d(int i) {
        this.a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x026c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.nq7 r25, defpackage.qe r26, defpackage.jab r27, float r28, defpackage.ou4 r29, defpackage.tu1 r30, defpackage.rv4 r31, int r32) {
        /*
            Method dump skipped, instructions count: 1055
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q1d.a(nq7, qe, jab, float, ou4, tu1, rv4, int):void");
    }

    public static final nq7 b(nq7 nq7Var, final boolean z, final float f, final vt4 vt4Var, int i) {
        nq7Var.getClass();
        vt4Var.getClass();
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            f = 0.96f;
        }
        return lye.j(nq7Var, new mu4() { // from class: pq7
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r13v3 */
            @Override // defpackage.mu4
            public final Object c(Object obj, Object obj2, Object obj3) {
                float f2;
                nq7 nq7Var2 = (nq7) obj;
                rv4 rv4Var = (rv4) obj2;
                ((Integer) obj3).getClass();
                nq7Var2.getClass();
                rv4Var.e0(1133593371);
                boolean z2 = z;
                if (!z2) {
                    rv4Var.q(false);
                    return nq7Var2;
                }
                Object P = rv4Var.P();
                lh9 lh9Var = ax1.a;
                if (P == lh9Var) {
                    P = yae.z(b26.b);
                    rv4Var.o0(P);
                }
                aw7 aw7Var = (aw7) P;
                if (((b26) aw7Var.getValue()) == b26.a) {
                    f2 = f;
                } else {
                    f2 = 1.0f;
                }
                yya b2 = nq.b(f2, null, null, rv4Var, 0, 30);
                boolean f3 = rv4Var.f(b2);
                Object P2 = rv4Var.P();
                if (f3 || P2 == lh9Var) {
                    P2 = new jt0(b2, 4);
                    rv4Var.o0(P2);
                }
                nq7 k = axe.k(nq7Var2, (xt4) P2);
                Object P3 = rv4Var.P();
                if (P3 == lh9Var) {
                    P3 = s21.g(rv4Var);
                }
                nq7 e = lbe.e(k, P3, null, z2, null, vt4Var, 24);
                b26 b26Var = (b26) aw7Var.getValue();
                Object P4 = rv4Var.P();
                if (P4 == lh9Var) {
                    P4 = new vi(aw7Var, 6);
                    rv4Var.o0(P4);
                }
                nq7 b3 = dab.b(e, b26Var, (PointerInputEventHandler) P4);
                rv4Var.q(false);
                return b3;
            }
        });
    }

    public static final nq7 c(int i, vt4 vt4Var, vt4 vt4Var2, rv4 rv4Var, nq7 nq7Var) {
        boolean z;
        nq7Var.getClass();
        vt4Var.getClass();
        Object P = rv4Var.P();
        Object obj = ax1.a;
        if (P == obj) {
            P = s21.g(rv4Var);
        }
        yu7 yu7Var = (yu7) P;
        Object P2 = rv4Var.P();
        if (P2 == obj) {
            P2 = tc4.a(1.0f, 0.01f);
            rv4Var.o0(P2);
        }
        lq lqVar = (lq) P2;
        boolean h = rv4Var.h(lqVar);
        if ((((i & 896) ^ 384) > 256 && rv4Var.c(0.96f)) || (i & 384) == 256) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = z | h;
        Object P3 = rv4Var.P();
        if (z2 || P3 == obj) {
            P3 = new c95(yu7Var, lqVar, (m42) null, 23);
            rv4Var.o0(P3);
        }
        yte.g((lu4) P3, rv4Var, yu7Var);
        boolean h2 = rv4Var.h(lqVar);
        Object P4 = rv4Var.P();
        if (h2 || P4 == obj) {
            P4 = new sa7(lqVar, 1);
            rv4Var.o0(P4);
        }
        return lbe.g(axe.k(nq7Var, (xt4) P4), yu7Var, vt4Var2, vt4Var, 312);
    }

    public static final d0b d(List list, xt4 xt4Var, w9c w9cVar) {
        int i;
        List<nh9> e0 = g9a.e0(new ff4(new c00(list, 1), true, new cn9(15, w9cVar, xt4Var)));
        ArrayList arrayList = new ArrayList(tl1.s(e0, 10));
        for (nh9 nh9Var : e0) {
            arrayList.add(new b0b(nh9Var.c, nh9Var.a, nh9Var.b));
        }
        int size = arrayList.size();
        long j = 0;
        int i2 = 0;
        long j2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            j += ((b0b) obj).b;
        }
        int size2 = arrayList.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList.get(i4);
            i4++;
            j2 += ((b0b) obj2).c;
        }
        rb3 rb3Var = new rb3(new ki4(3, new c00(e0, 1), new ux9(w9cVar, 20)).iterator(), new j9a(0));
        while (rb3Var.hasNext()) {
            rb3Var.next();
            i2++;
            if (i2 < 0) {
                tl1.L();
                throw null;
            }
        }
        if (i2 < 1) {
            i = 1;
        } else {
            i = i2;
        }
        return new d0b(j, j2, i, arrayList);
    }

    public static final Set e(o9a o9aVar) {
        o9aVar.getClass();
        if (o9aVar instanceof h51) {
            return ((h51) o9aVar).b();
        }
        HashSet hashSet = new HashSet(o9aVar.f());
        int f = o9aVar.f();
        for (int i = 0; i < f; i++) {
            hashSet.add(o9aVar.g(i));
        }
        return hashSet;
    }

    public static final o9a[] f(List list) {
        o9a[] o9aVarArr;
        list = (list == null || list.isEmpty()) ? null : null;
        if (list != null && (o9aVarArr = (o9a[]) list.toArray(new o9a[0])) != null) {
            return o9aVarArr;
        }
        return d;
    }

    public static final nq7 h(rv4 rv4Var, nq7 nq7Var) {
        nq7Var.getClass();
        Object P = rv4Var.P();
        lh9 lh9Var = ax1.a;
        if (P == lh9Var) {
            P = s21.g(rv4Var);
        }
        yu7 yu7Var = (yu7) P;
        Object P2 = rv4Var.P();
        if (P2 == lh9Var) {
            P2 = new cd1(15);
            rv4Var.o0(P2);
        }
        return lbe.e(nq7Var, yu7Var, null, true, null, (vt4) P2, 24);
    }

    public static final String i(int i) {
        if (i != 0) {
            if (i != 7) {
                if (i != 15) {
                    if (i != 23) {
                        if (i != 29) {
                            if (i != 36) {
                                if (i != 42) {
                                    return a82.j(i, "#ERR");
                                }
                                return "#N/A";
                            }
                            return "#NUM!";
                        }
                        return "#NAME?";
                    }
                    return "#REF!";
                }
                return "#VALUE!";
            }
            return "#DIV/0!";
        }
        return "#NULL!";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.mu9 j(java.util.ArrayList r18, int r19, java.util.List r20) {
        /*
            Method dump skipped, instructions count: 774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q1d.j(java.util.ArrayList, int, java.util.List):mu9");
    }

    public static final int k(th6 th6Var, Object obj, int i) {
        int e;
        if (obj != null && th6Var.a() != 0 && ((i >= th6Var.a() || !obj.equals(th6Var.b(i))) && (e = th6Var.e(obj)) != -1)) {
            return e;
        }
        return i;
    }

    public static final nq7 l(nq7 nq7Var, rv4 rv4Var, int i) {
        nq7Var.getClass();
        bsa bsaVar = (bsa) rv4Var.j(dy1.q);
        boolean f = rv4Var.f(bsaVar);
        Object P = rv4Var.P();
        if (f || P == ax1.a) {
            P = new oq7(bsaVar, 0);
            rv4Var.o0(P);
        }
        return t(1, (vt4) P, rv4Var, nq7Var, false);
    }

    public static boolean m(int i) {
        if (i == 8 || i == 7) {
            return true;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 && (i == 26 || i == 27)) {
            return true;
        }
        if (i2 >= 33 && i == 30) {
            return true;
        }
        return false;
    }

    public static final gi1 n(t76 t76Var) {
        t76Var.getClass();
        w66 e = t76Var.e();
        if (e instanceof gi1) {
            return (gi1) e;
        }
        if (!(e instanceof ksc)) {
            cp8.s(e, "Only KClass supported as classifier, got ");
            return null;
        }
        throw new IllegalArgumentException("Captured type parameter " + e + " from generic non-reified function. Such functionality cannot be supported because " + e + " is erased, either specify serializer explicitly or make calling function inline with reified " + e + '.');
    }

    public static Task p(Task task, Task task2) {
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        ua2 ua2Var = new ua2(0, taskCompletionSource, new AtomicBoolean(false), cancellationTokenSource);
        az azVar = c;
        task.continueWithTask(azVar, ua2Var);
        task2.continueWithTask(azVar, ua2Var);
        return taskCompletionSource.getTask();
    }

    public static final void q(yz yzVar, xt4 xt4Var) {
        yzVar.getClass();
        jla jlaVar = new jla(999);
        int i = yzVar.c;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            jlaVar.put(yzVar.e(i2), yzVar.h(i2));
            i2++;
            i3++;
            if (i3 == 999) {
                xt4Var.invoke(jlaVar);
                jlaVar.clear();
                i3 = 0;
            }
        }
        if (i3 > 0) {
            xt4Var.invoke(jlaVar);
        }
    }

    public static final qe r(rv4 rv4Var) {
        Object[] objArr = new Object[0];
        yy9 yy9Var = new yy9(new c8(1, (byte) 0), new y4(12));
        boolean d2 = rv4Var.d(ah3.b.ordinal());
        Object P = rv4Var.P();
        if (d2 || P == ax1.a) {
            P = new i(6);
            rv4Var.o0(P);
        }
        return (qe) zpe.m(objArr, yy9Var, (vt4) P, rv4Var, 0);
    }

    public static final void s(gi1 gi1Var) {
        String g = gi1Var.g();
        if (g == null) {
            g = "<local class name not available>";
        }
        throw new IllegalArgumentException(hl5.n("Serializer for class '", g, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n"));
    }

    public static final nq7 t(int i, vt4 vt4Var, rv4 rv4Var, nq7 nq7Var, boolean z) {
        boolean z2;
        nq7Var.getClass();
        vt4Var.getClass();
        if ((i & 1) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        Object P = rv4Var.P();
        if (P == ax1.a) {
            P = s21.g(rv4Var);
        }
        return lbe.e(nq7Var, (yu7) P, null, z2, null, vt4Var, 24);
    }

    public static int u(long j, byte[] bArr, int i, int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    return v1d.c(i, fxc.g(j, bArr), fxc.g(j + 1, bArr));
                }
                cp8.i();
                return 0;
            }
            return v1d.b(i, fxc.g(j, bArr));
        }
        q1d q1dVar = v1d.a;
        if (i > -12) {
            return -1;
        }
        return i;
    }

    public static void v(boolean z, String str, Object... objArr) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String g(byte[] r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q1d.g(byte[], int, int):java.lang.String");
    }

    public final int o(byte[] bArr, int i, int i2) {
        long j;
        int i3;
        int i4 = i;
        switch (this.a) {
            case 0:
                break;
            default:
                if ((i4 | i2 | (bArr.length - i2)) >= 0) {
                    long j2 = i4;
                    int i5 = (int) (i2 - j2);
                    if (i5 < 16) {
                        j = 1;
                        i3 = 0;
                    } else {
                        int i6 = 8 - (((int) j2) & 7);
                        long j3 = j2;
                        j = 1;
                        i3 = 0;
                        while (true) {
                            if (i3 < i6) {
                                long j4 = j3 + 1;
                                if (fxc.g(j3, bArr) >= 0) {
                                    i3++;
                                    j3 = j4;
                                }
                            } else {
                                while (true) {
                                    int i7 = i3 + 8;
                                    if (i7 <= i5) {
                                        if ((fxc.c.h(bArr, fxc.f + j3) & (-9187201950435737472L)) == 0) {
                                            j3 += 8;
                                            i3 = i7;
                                        }
                                    }
                                }
                                while (true) {
                                    if (i3 < i5) {
                                        long j5 = j3 + 1;
                                        if (fxc.g(j3, bArr) >= 0) {
                                            i3++;
                                            j3 = j5;
                                        }
                                    } else {
                                        i3 = i5;
                                    }
                                }
                            }
                        }
                    }
                    int i8 = i5 - i3;
                    long j6 = j2 + i3;
                    while (true) {
                        byte b2 = 0;
                        while (true) {
                            if (i8 > 0) {
                                long j7 = j6 + j;
                                b2 = fxc.g(j6, bArr);
                                if (b2 >= 0) {
                                    i8--;
                                    j6 = j7;
                                } else {
                                    j6 = j7;
                                }
                            }
                        }
                        if (i8 == 0) {
                            return 0;
                        }
                        int i9 = i8 - 1;
                        if (b2 < -32) {
                            if (i9 != 0) {
                                i8 -= 2;
                                if (b2 >= -62) {
                                    long j8 = j6 + j;
                                    if (fxc.g(j6, bArr) <= -65) {
                                        j6 = j8;
                                    }
                                }
                            } else {
                                return b2;
                            }
                        } else if (b2 < -16) {
                            if (i9 < 2) {
                                return u(j6, bArr, b2, i9);
                            }
                            i8 -= 3;
                            long j9 = j6 + j;
                            byte g = fxc.g(j6, bArr);
                            if (g <= -65 && ((b2 != -32 || g >= -96) && (b2 != -19 || g < -96))) {
                                j6 += 2;
                                if (fxc.g(j9, bArr) > -65) {
                                }
                            }
                        } else if (i9 < 3) {
                            return u(j6, bArr, b2, i9);
                        } else {
                            i8 -= 4;
                            long j10 = j6 + j;
                            byte g2 = fxc.g(j6, bArr);
                            if (g2 <= -65) {
                                if ((((g2 + 112) + (b2 << 28)) >> 30) == 0) {
                                    long j11 = 2 + j6;
                                    if (fxc.g(j10, bArr) <= -65) {
                                        j6 += 3;
                                        if (fxc.g(j11, bArr) > -65) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return -1;
                }
                throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i4), Integer.valueOf(i2)));
        }
        while (i4 < i2 && bArr[i4] >= 0) {
            i4++;
        }
        if (i4 < i2) {
            while (i4 < i2) {
                int i10 = i4 + 1;
                byte b3 = bArr[i4];
                if (b3 < 0) {
                    if (b3 < -32) {
                        if (i10 < i2) {
                            if (b3 >= -62) {
                                i4 += 2;
                                if (bArr[i10] > -65) {
                                }
                            }
                            return -1;
                        }
                        return b3;
                    } else if (b3 < -16) {
                        if (i10 >= i2 - 1) {
                            return v1d.a(bArr, i10, i2);
                        }
                        int i11 = i4 + 2;
                        byte b4 = bArr[i10];
                        if (b4 <= -65 && ((b3 != -32 || b4 >= -96) && (b3 != -19 || b4 < -96))) {
                            i4 += 3;
                            if (bArr[i11] > -65) {
                            }
                        }
                        return -1;
                    } else if (i10 >= i2 - 2) {
                        return v1d.a(bArr, i10, i2);
                    } else {
                        int i12 = i4 + 2;
                        byte b5 = bArr[i10];
                        if (b5 <= -65) {
                            if ((((b5 + 112) + (b3 << 28)) >> 30) == 0) {
                                int i13 = i4 + 3;
                                if (bArr[i12] <= -65) {
                                    i4 += 4;
                                    if (bArr[i13] > -65) {
                                    }
                                }
                            }
                        }
                        return -1;
                    }
                }
                i4 = i10;
            }
        }
        return 0;
    }
}

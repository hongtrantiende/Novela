package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.vbook.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wg */
/* loaded from: classes.dex */
public final class wg extends j4 implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener, Runnable {
    public static final vu7 l0;
    public final AccessibilityManager C;
    public long D;
    public List E;
    public final sg F;
    public int G;
    public int H;
    public v4 I;
    public v4 J;
    public boolean K;
    public final wu7 L;
    public final wu7 M;
    public final bwa N;
    public final bwa O;
    public int P;
    public Integer Q;
    public final a00 R;
    public boolean S;
    public long T;
    public boolean U;
    public tg V;
    public wu7 W;
    public final xu7 X;
    public final uu7 Y;
    public final uu7 Z;
    public final String a0;
    public final String b0;
    public final yx9 c0;
    public final rg d;
    public final wu7 d0;
    public c8a e0;
    public boolean f0;
    public final uu7 g0;
    public final xu7 h0;
    public final x0 i0;
    public final ArrayList j0;
    public final vg k0;
    public int e = Integer.MIN_VALUE;
    public final vg f = new vg(this, 0);

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        vu7 vu7Var = ly5.a;
        vu7 vu7Var2 = new vu7(32);
        int i = vu7Var2.b;
        if (i >= 0) {
            int i2 = i + 32;
            vu7Var2.b(i2);
            int[] iArr2 = vu7Var2.a;
            int i3 = vu7Var2.b;
            if (i != i3) {
                b00.V(i2, i, i3, iArr2, iArr2);
            }
            b00.Z(i, 0, 12, iArr, iArr2);
            vu7Var2.b += 32;
            l0 = vu7Var2;
            return;
        }
        cy7.k("");
    }

    public wg(rg rgVar) {
        this.d = rgVar;
        Object systemService = rgVar.getContext().getSystemService("accessibility");
        systemService.getClass();
        this.C = (AccessibilityManager) systemService;
        this.D = 100L;
        new Handler(Looper.getMainLooper());
        this.F = new sg(this);
        this.G = Integer.MIN_VALUE;
        this.H = Integer.MIN_VALUE;
        this.L = new wu7();
        this.M = new wu7();
        this.N = new bwa(0);
        this.O = new bwa(0);
        this.P = -1;
        this.R = new a00(0);
        this.U = true;
        wu7 wu7Var = oy5.a;
        wu7Var.getClass();
        this.W = wu7Var;
        this.X = new xu7();
        this.Y = new uu7();
        this.Z = new uu7();
        this.a0 = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.b0 = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.c0 = new yx9(11, (byte) 0);
        this.d0 = new wu7();
        this.e0 = new c8a(rgVar.getSemanticsOwner().a(), wu7Var);
        int i = iy5.a;
        this.g0 = new uu7();
        this.h0 = new xu7();
        rgVar.addOnAttachStateChangeListener(this);
        this.i0 = new x0(this, 1);
        this.j0 = new ArrayList();
        this.k0 = new vg(this, 1);
    }

    public static /* synthetic */ void D(wg wgVar, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        wgVar.C(i, i2, num, null);
    }

    public static Rect K(kwe kweVar, float f, float f2) {
        if (!(kweVar instanceof tf8) && !(kweVar instanceof uf8)) {
            return null;
        }
        rk9 E = kweVar.E();
        return new Rect((int) (E.a + f), (int) (E.b + f2), (int) (E.c + f), (int) (E.d + f2));
    }

    public static float[] M(kwe kweVar) {
        if (kweVar instanceof uf8) {
            ou9 ou9Var = ((uf8) kweVar).c;
            long j = ou9Var.h;
            long j2 = ou9Var.g;
            long j3 = ou9Var.f;
            long j4 = ou9Var.e;
            return new float[]{Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))};
        }
        return null;
    }

    public static Region N(kwe kweVar, float f, float f2) {
        if (kweVar instanceof sf8) {
            sf8 sf8Var = (sf8) kweVar;
            rk9 n = sf8Var.E().n(f, f2);
            Region region = new Region(new Rect((int) (n.a + nae.e), (int) (n.b + nae.e), (int) (n.c + nae.e), (int) (n.d + nae.e)));
            Region region2 = new Region();
            yj yjVar = sf8Var.c;
            if (yjVar instanceof yj) {
                Path path = yjVar.a;
                path.offset(f, f2);
                region2.setPath(path, region);
                return region2;
            }
            xk5.q("Unable to obtain android.graphics.Path");
        }
        return null;
    }

    public static CharSequence O(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i = 99999;
                }
                CharSequence subSequence = charSequence.subSequence(0, i);
                subSequence.getClass();
                return subSequence;
            }
        }
        return charSequence;
    }

    public static String s(b8a b8aVar) {
        ps psVar;
        if (b8aVar != null) {
            u7a u7aVar = b8aVar.d;
            tv7 tv7Var = u7aVar.a;
            k8a k8aVar = h8a.a;
            if (tv7Var.c(k8aVar)) {
                return er6.a(62, null, ",", (List) u7aVar.b(k8aVar));
            }
            k8a k8aVar2 = h8a.G;
            if (tv7Var.c(k8aVar2)) {
                Object g = tv7Var.g(k8aVar2);
                if (g == null) {
                    g = null;
                }
                ps psVar2 = (ps) g;
                if (psVar2 != null) {
                    return psVar2.b;
                }
            } else {
                Object g2 = tv7Var.g(h8a.C);
                if (g2 == null) {
                    g2 = null;
                }
                List list = (List) g2;
                if (list != null && (psVar = (ps) sl1.e0(list)) != null) {
                    return psVar.b;
                }
            }
        }
        return null;
    }

    public static final boolean w(s1a s1aVar, float f) {
        vt4 vt4Var = s1aVar.a;
        if (f >= nae.e || ((Number) vt4Var.invoke()).floatValue() <= nae.e) {
            if (f > nae.e && ((Number) vt4Var.invoke()).floatValue() < ((Number) s1aVar.b.invoke()).floatValue()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static final boolean x(s1a s1aVar) {
        vt4 vt4Var = s1aVar.a;
        boolean z = s1aVar.c;
        if (((Number) vt4Var.invoke()).floatValue() <= nae.e || z) {
            if (((Number) vt4Var.invoke()).floatValue() < ((Number) s1aVar.b.invoke()).floatValue() && z) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static final boolean y(s1a s1aVar) {
        vt4 vt4Var = s1aVar.a;
        boolean z = s1aVar.c;
        if (((Number) vt4Var.invoke()).floatValue() >= ((Number) s1aVar.b.invoke()).floatValue() || z) {
            if (((Number) vt4Var.invoke()).floatValue() > nae.e && z) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void A(b8a b8aVar, c8a c8aVar) {
        int[] iArr = yy5.a;
        xu7 xu7Var = new xu7();
        List j = b8a.j(4, b8aVar);
        od6 od6Var = b8aVar.c;
        int size = j.size();
        for (int i = 0; i < size; i++) {
            ny5 r = r();
            int i2 = ((b8a) j.get(i)).f;
            if (r.a(i2)) {
                if (!c8aVar.b.c(i2)) {
                    v(od6Var);
                    return;
                }
                xu7Var.a(i2);
            }
        }
        xu7 xu7Var2 = c8aVar.b;
        int[] iArr2 = xu7Var2.b;
        long[] jArr = xu7Var2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j2 = jArr[i3];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j2) < 128 && !xu7Var.c(iArr2[(i3 << 3) + i5])) {
                            v(od6Var);
                            return;
                        }
                        j2 >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i3++;
            }
        }
        List j3 = b8a.j(4, b8aVar);
        int size2 = j3.size();
        for (int i6 = 0; i6 < size2; i6++) {
            b8a b8aVar2 = (b8a) j3.get(i6);
            c8a c8aVar2 = (c8a) this.d0.b(b8aVar2.f);
            if (c8aVar2 != null && r().a(b8aVar2.f)) {
                A(b8aVar2, c8aVar2);
            }
        }
    }

    public final boolean B(AccessibilityEvent accessibilityEvent) {
        if (!u()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.K = true;
        }
        try {
            return ((Boolean) this.f.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.K = false;
        }
    }

    public final boolean C(int i, int i2, Integer num, List list) {
        if (i != Integer.MIN_VALUE && u()) {
            AccessibilityEvent n = n(i, i2);
            if (num != null) {
                n.setContentChangeTypes(num.intValue());
            }
            if (list != null) {
                n.setContentDescription(er6.a(62, null, ",", list));
            }
            return B(n);
        }
        return false;
    }

    public final void E(int i, int i2, String str) {
        AccessibilityEvent n = n(z(i), 32);
        n.setContentChangeTypes(i2);
        if (str != null) {
            n.getText().add(str);
        }
        B(n);
    }

    public final void F(int i) {
        tg tgVar = this.V;
        if (tgVar != null) {
            b8a b8aVar = tgVar.a;
            if (i != b8aVar.f) {
                return;
            }
            if (SystemClock.uptimeMillis() - tgVar.f <= 1000) {
                AccessibilityEvent n = n(z(b8aVar.f), 131072);
                n.setFromIndex(tgVar.d);
                n.setToIndex(tgVar.e);
                n.setAction(tgVar.b);
                n.setMovementGranularity(tgVar.c);
                n.getText().add(s(b8aVar));
                B(n);
            }
        }
        this.V = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:361:0x0127, code lost:
        if (defpackage.c16.i(r1, r13) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:0x04ce, code lost:
        if (r1.isEmpty() == false) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x04ff, code lost:
        if (r5 != null) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:544:0x0504, code lost:
        if (r5 == null) goto L201;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(defpackage.ny5 r57) {
        /*
            Method dump skipped, instructions count: 1688
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wg.G(ny5):void");
    }

    public final void H(od6 od6Var, xu7 xu7Var) {
        u7a x;
        HashMap<od6, kp> layoutNodeToHolder;
        if (od6Var.J()) {
            qp androidViewsHandler = this.d.getAndroidViewsHandler();
            if (androidViewsHandler == null || (layoutNodeToHolder = androidViewsHandler.getLayoutNodeToHolder()) == null || !layoutNodeToHolder.containsKey(od6Var)) {
                od6 od6Var2 = null;
                if (!od6Var.c0.j(8)) {
                    od6Var = od6Var.v();
                    while (true) {
                        if (od6Var != null) {
                            if (od6Var.c0.j(8)) {
                                break;
                            }
                            od6Var = od6Var.v();
                        } else {
                            od6Var = null;
                            break;
                        }
                    }
                }
                if (od6Var != null && (x = od6Var.x()) != null) {
                    if (!x.c) {
                        od6 v = od6Var.v();
                        while (true) {
                            if (v != null) {
                                u7a x2 = v.x();
                                if (x2 != null && x2.c) {
                                    od6Var2 = v;
                                    break;
                                }
                                v = v.v();
                            } else {
                                break;
                            }
                        }
                        if (od6Var2 != null) {
                            od6Var = od6Var2;
                        }
                    }
                    int i = od6Var.b;
                    if (xu7Var.a(i)) {
                        D(this, z(i), 2048, 1, 8);
                    }
                }
            }
        }
    }

    public final void I(od6 od6Var) {
        HashMap<od6, kp> layoutNodeToHolder;
        if (od6Var.J()) {
            qp androidViewsHandler = this.d.getAndroidViewsHandler();
            if (androidViewsHandler == null || (layoutNodeToHolder = androidViewsHandler.getLayoutNodeToHolder()) == null || !layoutNodeToHolder.containsKey(od6Var)) {
                int i = od6Var.b;
                s1a s1aVar = (s1a) this.L.b(i);
                s1a s1aVar2 = (s1a) this.M.b(i);
                if (s1aVar == null && s1aVar2 == null) {
                    return;
                }
                AccessibilityEvent n = n(i, 4096);
                if (s1aVar != null) {
                    n.setScrollX((int) ((Number) s1aVar.a.invoke()).floatValue());
                    n.setMaxScrollX((int) ((Number) s1aVar.b.invoke()).floatValue());
                }
                if (s1aVar2 != null) {
                    n.setScrollY((int) ((Number) s1aVar2.a.invoke()).floatValue());
                    n.setMaxScrollY((int) ((Number) s1aVar2.b.invoke()).floatValue());
                }
                B(n);
            }
        }
    }

    public final boolean J(b8a b8aVar, int i, int i2, boolean z) {
        String s;
        Integer num;
        Integer num2;
        u7a u7aVar = b8aVar.d;
        int i3 = b8aVar.f;
        k8a k8aVar = s7a.j;
        boolean z2 = false;
        if (u7aVar.a.c(k8aVar) && kqe.d(b8aVar)) {
            mu4 mu4Var = (mu4) ((g4) b8aVar.d.b(k8aVar)).b;
            if (mu4Var != null) {
                return ((Boolean) mu4Var.c(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.P) && (s = s(b8aVar)) != null) {
            this.P = (i < 0 || i != i2 || i2 > s.length()) ? -1 : -1;
            if (s.length() > 0) {
                z2 = true;
            }
            int z3 = z(i3);
            Integer num3 = null;
            if (z2) {
                num = Integer.valueOf(this.P);
            } else {
                num = null;
            }
            if (z2) {
                num2 = Integer.valueOf(this.P);
            } else {
                num2 = null;
            }
            if (z2) {
                num3 = Integer.valueOf(s.length());
            }
            B(o(z3, num, num2, num3, s));
            F(i3);
            return true;
        }
        return false;
    }

    public final Rect L(float f, float f2, float f3, float f4) {
        long floatToRawIntBits = Float.floatToRawIntBits(f);
        rg rgVar = this.d;
        long t = rgVar.t((Float.floatToRawIntBits(f2) & 4294967295L) | (floatToRawIntBits << 32));
        long t2 = rgVar.t((Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
        int i = (int) (t >> 32);
        int i2 = (int) (t2 >> 32);
        int i3 = (int) (t & 4294967295L);
        int i4 = (int) (t2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x013f, code lost:
        r28 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0149, code lost:
        if (((r7 & ((~r7) << 6)) & r20) == 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x014b, code lost:
        r25 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P() {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wg.P():void");
    }

    @Override // defpackage.j4
    public final n07 b(View view) {
        return this.F;
    }

    /* JADX WARN: Removed duplicated region for block: B:206:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:301:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(int r21, defpackage.v4 r22, java.lang.String r23, android.os.Bundle r24) {
        /*
            Method dump skipped, instructions count: 782
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wg.j(int, v4, java.lang.String, android.os.Bundle):void");
    }

    public final Rect k(d8a d8aVar) {
        uy5 uy5Var = d8aVar.b;
        return L(uy5Var.a, uy5Var.b, uy5Var.c, uy5Var.d);
    }

    public final boolean l(long j, int i, boolean z) {
        k8a k8aVar;
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i3;
        if (c16.i(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            ny5 r = r();
            if (!y78.d(j, 9205357640488583168L) && (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                if (z) {
                    k8aVar = h8a.w;
                } else if (!z) {
                    k8aVar = h8a.v;
                } else {
                    xk5.o();
                    return false;
                }
                Object[] objArr = r.c;
                long[] jArr = r.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    boolean z6 = false;
                    while (true) {
                        long j2 = jArr[i4];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8;
                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                            int i7 = 0;
                            while (i7 < i6) {
                                if ((j2 & 255) < 128) {
                                    d8a d8aVar = (d8a) objArr[(i4 << 3) + i7];
                                    uy5 uy5Var = d8aVar.b;
                                    i2 = i5;
                                    float f = uy5Var.b;
                                    float f2 = uy5Var.c;
                                    float f3 = uy5Var.d;
                                    float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                                    float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                                    if (intBitsToFloat >= uy5Var.a) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (intBitsToFloat < f2) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    boolean z7 = z2 & z3;
                                    if (intBitsToFloat2 >= f) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    boolean z8 = z7 & z4;
                                    if (intBitsToFloat2 < f3) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (z5 & z8) {
                                        Object g = d8aVar.a.d.a.g(k8aVar);
                                        if (g == null) {
                                            g = null;
                                        }
                                        s1a s1aVar = (s1a) g;
                                        if (s1aVar != null) {
                                            boolean z9 = s1aVar.c;
                                            if (z9) {
                                                i3 = -i;
                                            } else {
                                                i3 = i;
                                            }
                                            if (i == 0 && z9) {
                                                i3 = -1;
                                            }
                                            vt4 vt4Var = s1aVar.a;
                                            if (i3 < 0) {
                                                if (((Number) vt4Var.invoke()).floatValue() <= nae.e) {
                                                }
                                                z6 = true;
                                            } else {
                                                if (((Number) vt4Var.invoke()).floatValue() >= ((Number) s1aVar.b.invoke()).floatValue()) {
                                                }
                                                z6 = true;
                                            }
                                        }
                                    }
                                } else {
                                    i2 = i5;
                                }
                                j2 >>= i2;
                                i7++;
                                i5 = i2;
                            }
                            if (i6 != i5) {
                                return z6;
                            }
                        }
                        if (i4 != length) {
                            i4++;
                        } else {
                            return z6;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void m() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (u()) {
                A(this.d.getSemanticsOwner().a(), this.e0);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                G(r());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    P();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public final AccessibilityEvent n(int i, int i2) {
        d8a d8aVar;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        rg rgVar = this.d;
        obtain.setPackageName(rgVar.getContext().getPackageName());
        obtain.setSource(rgVar, i);
        if (u() && (d8aVar = (d8a) r().b(i)) != null) {
            b8a b8aVar = d8aVar.a;
            obtain.setPassword(b8aVar.d.a.c(h8a.N));
            Object g = b8aVar.d.a.g(h8a.o);
            if (g == null) {
                g = null;
            }
            boolean i3 = c16.i(g, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                k4.B(obtain, i3);
            }
        }
        return obtain;
    }

    public final AccessibilityEvent o(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent n = n(i, 8192);
        if (num != null) {
            n.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            n.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            n.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            n.getText().add(charSequence);
        }
        return n;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.E = null;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.E = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager = this.C;
        if (accessibilityManager.isEnabled()) {
            this.E = null;
        }
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        rg rgVar = this.d;
        Handler handler = rgVar.getHandler();
        if (handler != null) {
            handler.removeCallbacks(this);
        }
        Handler handler2 = rgVar.getHandler();
        if (handler2 != null) {
            handler2.removeCallbacks(this.i0);
        }
        this.S = false;
        this.f0 = false;
        AccessibilityManager accessibilityManager = this.C;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    public final int p(b8a b8aVar) {
        u7a u7aVar = b8aVar.d;
        if (!u7aVar.a.c(h8a.a)) {
            k8a k8aVar = h8a.H;
            if (u7aVar.a.c(k8aVar)) {
                return (int) (((fxb) u7aVar.b(k8aVar)).a & 4294967295L);
            }
        }
        return this.P;
    }

    public final int q(b8a b8aVar) {
        u7a u7aVar = b8aVar.d;
        if (!u7aVar.a.c(h8a.a)) {
            k8a k8aVar = h8a.H;
            if (u7aVar.a.c(k8aVar)) {
                return (int) (((fxb) u7aVar.b(k8aVar)).a >> 32);
            }
        }
        return this.P;
    }

    public final ny5 r() {
        b8a b8aVar;
        if (this.U) {
            this.U = false;
            rg rgVar = this.d;
            this.W = bue.i(rgVar.getSemanticsOwner(), kg.c);
            if (u()) {
                wu7 wu7Var = this.W;
                Resources resources = rgVar.getContext().getResources();
                uu7 uu7Var = this.Y;
                uu7Var.a();
                uu7 uu7Var2 = this.Z;
                uu7Var2.a();
                d8a d8aVar = (d8a) wu7Var.b(-1);
                if (d8aVar != null) {
                    b8aVar = d8aVar.a;
                } else {
                    b8aVar = null;
                }
                b8aVar.getClass();
                ArrayList b = m8a.b(b8aVar, new jc(wu7Var, 3), new jc(resources, 4), tl1.A(b8aVar));
                int i = 1;
                int size = b.size() - 1;
                if (1 <= size) {
                    while (true) {
                        int i2 = ((b8a) b.get(i - 1)).f;
                        int i3 = ((b8a) b.get(i)).f;
                        uu7Var.f(i2, i3);
                        uu7Var2.f(i3, i2);
                        if (i == size) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.W;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xu7 xu7Var;
        a00 a00Var = this.R;
        int i = 0;
        this.S = false;
        this.T = SystemClock.uptimeMillis();
        try {
            if (u()) {
                int i2 = a00Var.c;
                while (true) {
                    xu7Var = this.h0;
                    if (i >= i2) {
                        break;
                    }
                    od6 od6Var = (od6) a00Var.b[i];
                    H(od6Var, xu7Var);
                    I(od6Var);
                    i++;
                }
                xu7Var.b();
                if (!this.f0) {
                    this.f0 = true;
                    this.i0.run();
                }
            }
            a00Var.clear();
            this.L.c();
            this.M.c();
            a00Var.clear();
        } catch (Throwable th) {
            a00Var.clear();
            throw th;
        }
    }

    public final rk9 t(b8a b8aVar, Rect rect, wea weaVar) {
        ug ugVar = new ug(weaVar);
        od6 od6Var = b8aVar.c;
        mq7 mq7Var = (mq7) od6Var.c0.C;
        z7a z7aVar = null;
        if ((mq7Var.d & 8) != 0) {
            loop0: while (true) {
                if (mq7Var == null) {
                    break;
                }
                if ((mq7Var.c & 8) != 0) {
                    mq7 mq7Var2 = mq7Var;
                    gw7 gw7Var = null;
                    while (mq7Var2 != null) {
                        if (mq7Var2 instanceof z7a) {
                            ((z7a) mq7Var2).m1(ugVar);
                            if (ugVar.a) {
                                z7aVar = mq7Var2;
                                break loop0;
                            }
                        } else if ((mq7Var2.c & 8) != 0 && (mq7Var2 instanceof m03)) {
                            int i = 0;
                            for (mq7 mq7Var3 = ((m03) mq7Var2).L; mq7Var3 != null; mq7Var3 = mq7Var3.f) {
                                if ((mq7Var3.c & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        mq7Var2 = mq7Var3;
                                    } else {
                                        if (gw7Var == null) {
                                            gw7Var = new gw7(new mq7[16], 0);
                                        }
                                        if (mq7Var2 != null) {
                                            gw7Var.b(mq7Var2);
                                            mq7Var2 = null;
                                        }
                                        gw7Var.b(mq7Var3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        mq7Var2 = voe.h(gw7Var);
                    }
                }
                if ((mq7Var.d & 8) == 0) {
                    break;
                }
                mq7Var = mq7Var.f;
            }
        }
        z7a z7aVar2 = z7aVar;
        if (z7aVar2 != null && ((mq7) z7aVar2).a.J) {
            i38 u = voe.u(z7aVar2);
            rk9 g0 = obe.t(u).g0(u, false);
            Rect L = L(g0.a, g0.b, g0.c, g0.d);
            float f = L.left - rect.left;
            float f2 = L.top - rect.top;
            return new rk9(f, f2, L.width() + f, L.height() + f2);
        }
        return obe.q((i38) od6Var.c0.e, false);
    }

    public final boolean u() {
        AccessibilityManager accessibilityManager = this.C;
        if (accessibilityManager.isEnabled()) {
            List<AccessibilityServiceInfo> list = this.E;
            if (list == null) {
                list = accessibilityManager.getEnabledAccessibilityServiceList(-1);
                this.E = list;
            }
            if (!list.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void v(od6 od6Var) {
        if (this.R.add(od6Var) && u() && !this.S) {
            this.S = true;
            long uptimeMillis = (this.T + this.D) - SystemClock.uptimeMillis();
            int i = (uptimeMillis > 0L ? 1 : (uptimeMillis == 0L ? 0 : -1));
            rg rgVar = this.d;
            if (i < 0) {
                rgVar.post(this);
            } else {
                rgVar.postDelayed(this, uptimeMillis);
            }
        }
    }

    public final int z(int i) {
        if (i == this.d.getSemanticsOwner().a().f) {
            return -1;
        }
        return i;
    }
}

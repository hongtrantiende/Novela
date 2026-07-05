package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import com.vbook.android.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rg  reason: default package */
/* loaded from: classes.dex */
public final class rg extends ViewGroup implements wg8, hu9, o27, dv2, lf8, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, nm4 {
    public static Class f1;
    public static Method g1;
    public static Method h1;
    public static jb j1;
    public static Method k1;
    public static Method l1;
    public tub A0;
    public final AtomicReference B0;
    public os9 C;
    public w03 C0;
    public final rz D;
    public final aw7 D0;
    public final ag E;
    public final hm8 E0;
    public final hm8 F;
    public ow5 F0;
    public final View G;
    public final rq7 G0;
    public final rm4 H;
    public po H0;
    public d82 I;
    public MotionEvent I0;
    public final si J;
    public long J0;
    public final hm8 K;
    public final hvc K0;
    public final h23 L;
    public final kv7 L0;
    public final hkd M;
    public float M0;
    public final od6 N;
    public float N0;
    public final wu7 O;
    public float O0;
    public final vk9 P;
    public float P0;
    public final e8a Q;
    public final og Q0;
    public final wg R;
    public final ag R0;
    public final kh S;
    public boolean S0;
    public final ij T;
    public lu4 T0;
    public final be0 U;
    public final uu5 U0;
    public final kv7 V;
    public final gg V0;
    public kv7 W;
    public final gg W0;
    public boolean X0;
    public boolean Y0;
    public boolean Z0;
    public vw1 a;
    public boolean a0;
    public final zz8 a1;
    public long b;
    public boolean b0;
    public View b1;
    public final boolean c;
    public final mr7 c0;
    public final mg c1;
    public ju5 d;
    public final vz0 d0;
    public int d1;
    public ao6 e;
    public final hm8 e0;
    public bo6 f;
    public final h23 f0;
    public final bf g0;
    public final cf h0;
    public boolean i0;
    public final yg8 j0;
    public boolean k0;
    public qp l0;
    public x02 m0;
    public boolean n0;
    public final y27 o0;
    public long p0;
    public final int[] q0;
    public final float[] r0;
    public final Matrix s0;
    public final float[] t0;
    public final float[] u0;
    public long v0;
    public boolean w0;
    public long x0;
    public xt4 y0;
    public vub z0;
    public static final abf e1 = new abf(15);
    public static final kv7 i1 = new kv7();

    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, vz0] */
    /* JADX WARN: Type inference failed for: r0v53, types: [rq7, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v60, types: [uu5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [ps3, mq7] */
    public rg(Context context, vw1 vw1Var) {
        super(context);
        bf bfVar;
        cf cfVar;
        tc6 tc6Var;
        this.a = vw1Var;
        this.b = 9205357640488583168L;
        this.c = true;
        this.C = kh5.R;
        this.D = new rz();
        this.E = new ag(this, 0);
        this.F = new hm8(rqe.a(context), r0f.L);
        this.H = new rm4(this, this);
        vw1Var.f();
        px1 px1Var = vw1Var.c;
        px1Var.getClass();
        this.I = px1Var.k();
        this.J = new si();
        this.K = yae.z(Boolean.FALSE);
        this.L = yae.q(new gg(this, 0));
        this.M = new hkd(this);
        od6 od6Var = new od6(3);
        od6Var.h0(lu9.c);
        od6Var.e0(getDensity());
        od6Var.j0(getViewConfiguration());
        od6Var.i0(new pg(this).a0(((rm4) getFocusOwner()).e).a0(getDragAndDropManager().c));
        this.N = od6Var;
        wu7 wu7Var = oy5.a;
        this.O = new wu7();
        this.P = new vk9(getLayoutNodes(), this);
        this.Q = new e8a(getRoot(), new mq7(), getLayoutNodes());
        wg wgVar = new wg(this);
        this.R = wgVar;
        kh khVar = new kh(this, new v7(0, this, eh.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1, 2));
        this.S = khVar;
        this.T = new ij(this);
        this.U = new be0();
        this.V = new kv7();
        this.c0 = new mr7();
        od6 root = getRoot();
        ?? obj = new Object();
        obj.b = root;
        obj.c = new x65((wv5) root.c0.d);
        obj.d = new mu9(29, false);
        obj.e = new a75();
        this.d0 = obj;
        this.e0 = yae.z(new Configuration(context.getResources().getConfiguration()));
        this.f0 = yae.q(new gg(this, 2));
        if (e()) {
            bfVar = new bf(this, getAutofillTree());
        } else {
            bfVar = null;
        }
        this.g0 = bfVar;
        if (e()) {
            cfVar = new cf(new yw8(context), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        } else {
            cfVar = null;
        }
        this.h0 = cfVar;
        this.j0 = new yg8(new lg(this, 1));
        this.o0 = new y27(getRoot());
        this.p0 = 9223372034707292159L;
        this.q0 = new int[]{0, 0};
        this.r0 = l27.a();
        this.s0 = new Matrix();
        this.t0 = l27.a();
        this.u0 = l27.a();
        this.v0 = -1L;
        this.x0 = 9187343241974906880L;
        this.B0 = new AtomicReference(null);
        this.D0 = vw1Var.p;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int[] iArr = lm4.a;
        tc6 tc6Var2 = tc6.a;
        if (layoutDirection != 0) {
            if (layoutDirection != 1) {
                tc6Var = null;
            } else {
                tc6Var = tc6.b;
            }
        } else {
            tc6Var = tc6Var2;
        }
        this.E0 = yae.z(tc6Var != null ? tc6Var : tc6Var2);
        ?? obj2 = new Object();
        new gw7(new tg0[16], 0);
        new gw7(new g99[16], 0);
        new gw7(new od6[16], 0);
        new gw7(new g99[16], 0);
        this.G0 = obj2;
        this.K0 = new hvc(2);
        this.L0 = new kv7();
        this.M0 = Float.NaN;
        this.N0 = Float.NaN;
        this.O0 = Float.NaN;
        this.P0 = Float.NaN;
        this.Q0 = new og(this, 0);
        this.R0 = new ag(this, 1);
        this.T0 = new cg(this, 0);
        lg lgVar = new lg(this, 0);
        ?? obj3 = new Object();
        obj3.c = lgVar;
        obj3.b = 0;
        obj3.d = new GestureDetector(context, new tu5(obj3));
        this.U0 = obj3;
        this.V0 = new gg(this, 4);
        this.W0 = new gg(this, 1);
        addOnAttachStateChangeListener(khVar);
        setWillNotDraw(false);
        setFocusable(true);
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            dh.a.a(this, 1, false);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        rcd.c(this, wgVar);
        setOnDragListener(getDragAndDropManager());
        if (i >= 29) {
            yg.a.a(this);
        }
        if (m()) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            this.G = view;
            addView(view, -1);
        }
        this.a1 = i >= 31 ? new zz8(1) : null;
        this.c1 = new mg(this);
    }

    public static final void b(rg rgVar, int i, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int d;
        wg wgVar = rgVar.R;
        if (c16.i(str, wgVar.a0)) {
            int d2 = wgVar.Y.d(i);
            if (d2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, d2);
            }
        } else if (c16.i(str, wgVar.b0) && (d = wgVar.Z.d(i)) != -1) {
            accessibilityNodeInfo.getExtras().putInt(str, d);
        }
    }

    public static boolean e() {
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    public static void f(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof rg) {
                ((rg) childAt).x();
            } else if (childAt instanceof ViewGroup) {
                f((ViewGroup) childAt);
            }
        }
    }

    public static long g(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    long j = size;
                    return j | (j << 32);
                }
                vm1.d();
                return 0L;
            }
            return 2147483647L;
        }
        return size;
    }

    private final o61 getCanvasHolder() {
        return this.a.u;
    }

    private final boolean getDerivedIsAttached() {
        return ((Boolean) this.L.getValue()).booleanValue();
    }

    private final vub getLegacyTextInputServiceAndroid() {
        vub vubVar = this.z0;
        if (vubVar == null) {
            vub vubVar2 = new vub(getView(), this);
            this.z0 = vubVar2;
            return vubVar2;
        }
        return vubVar;
    }

    public static void k(od6 od6Var) {
        od6Var.E();
        gw7 z = od6Var.z();
        Object[] objArr = z.a;
        int i = z.c;
        for (int i2 = 0; i2 < i; i2++) {
            k((od6) objArr[i2]);
        }
    }

    public static boolean m() {
        if (Build.VERSION.SDK_INT >= 35) {
            return true;
        }
        return false;
    }

    public static boolean n(MotionEvent motionEvent) {
        boolean z;
        if ((Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) < 2139095040) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                if ((Float.floatToRawIntBits(motionEvent.getX(i)) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getY(i)) & Integer.MAX_VALUE) < 2139095040 && (Build.VERSION.SDK_INT < 29 || nr7.a.a(motionEvent, i))) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    private final void setAttached(boolean z) {
        this.K.setValue(Boolean.valueOf(z));
    }

    private void setDensity(r13 r13Var) {
        this.F.setValue(r13Var);
    }

    private void setLayoutDirection(tc6 tc6Var) {
        this.E0.setValue(tc6Var);
    }

    public final void A(od6 od6Var, boolean z, boolean z2) {
        boolean z3;
        sd6 sd6Var = od6Var.d0;
        s16 s16Var = s16.d;
        y27 y27Var = this.o0;
        if (z) {
            ij1 ij1Var = y27Var.b;
            int ordinal = sd6Var.d.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                xk5.o();
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            if ((!sd6Var.e && !sd6Var.f) || z2) {
                sd6Var.f = true;
                sd6Var.g = true;
                a37 a37Var = sd6Var.p;
                a37Var.S = true;
                a37Var.T = true;
                if (!od6Var.n0) {
                    od6 v = od6Var.v();
                    if (c16.i(od6Var.L(), Boolean.TRUE) && ((v == null || !v.d0.e) && (v == null || !v.d0.f))) {
                        ij1Var.a(od6Var, s16.b);
                    } else if (od6Var.K() && ((v == null || !v.q()) && (v == null || !v.r()))) {
                        ij1Var.a(od6Var, s16Var);
                    }
                    if (!y27Var.d) {
                        K(null);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        y27Var.getClass();
        int ordinal2 = sd6Var.d.ordinal();
        if (ordinal2 != 0 && ordinal2 != 1 && ordinal2 != 2 && ordinal2 != 3) {
            if (ordinal2 == 4) {
                od6 v2 = od6Var.v();
                if (v2 != null && !v2.K()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (!z2) {
                    if (!od6Var.r()) {
                        if (od6Var.q() && od6Var.K() == z3 && od6Var.K() == sd6Var.p.Q) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                a37 a37Var2 = sd6Var.p;
                a37Var2.S = true;
                a37Var2.T = true;
                if (!od6Var.n0 && a37Var2.Q && z3) {
                    if ((v2 == null || !v2.q()) && (v2 == null || !v2.r())) {
                        y27Var.b.a(od6Var, s16Var);
                    }
                    if (!y27Var.d) {
                        K(null);
                        return;
                    }
                    return;
                }
                return;
            }
            xk5.o();
        }
    }

    public final void B() {
        wg wgVar = this.R;
        wgVar.U = true;
        Handler handler = wgVar.d.getHandler();
        if (handler != null && wgVar.u() && !wgVar.f0) {
            wgVar.f0 = true;
            handler.post(wgVar.i0);
        }
        kh khVar = this.S;
        khVar.C = true;
        khVar.e();
    }

    public final void D(ViewStructure viewStructure) {
        cf autofillManager = getAutofillManager();
        if (autofillManager != null) {
            od6 od6Var = autofillManager.b.a;
            AutofillId autofillId = autofillManager.C;
            String str = autofillManager.e;
            vk9 vk9Var = autofillManager.d;
            k27.x(viewStructure, od6Var, autofillId, str, vk9Var);
            Object[] objArr = i78.a;
            kv7 kv7Var = new kv7(2);
            kv7Var.a(od6Var);
            kv7Var.a(viewStructure);
            while (kv7Var.i()) {
                Object k = kv7Var.k(kv7Var.b - 1);
                k.getClass();
                ViewStructure viewStructure2 = (ViewStructure) k;
                Object k2 = kv7Var.k(kv7Var.b - 1);
                k2.getClass();
                iv7 iv7Var = (iv7) ((od6) k2).o();
                int i = ((gw7) iv7Var.b).c;
                for (int i2 = 0; i2 < i; i2++) {
                    od6 od6Var2 = (od6) iv7Var.get(i2);
                    if (!od6Var2.n0 && od6Var2.J() && od6Var2.K()) {
                        u7a x = od6Var2.x();
                        if (x != null) {
                            tv7 tv7Var = x.a;
                            if (tv7Var.b(s7a.g) || tv7Var.b(s7a.h) || tv7Var.b(h8a.r) || tv7Var.b(h8a.s) || (Build.VERSION.SDK_INT >= 34 && tv7Var.b(i8a.c))) {
                                ViewStructure newChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
                                k27.x(newChild, od6Var2, autofillManager.C, str, vk9Var);
                                kv7Var.a(od6Var2);
                                kv7Var.a(newChild);
                            }
                        }
                        kv7Var.a(od6Var2);
                        kv7Var.a(viewStructure2);
                    }
                }
            }
        }
        bf m13getAutofill = m13getAutofill();
        if (m13getAutofill != null) {
            be0 be0Var = m13getAutofill.b;
            LinkedHashMap linkedHashMap = be0Var.a;
            LinkedHashMap linkedHashMap2 = be0Var.a;
            if (!linkedHashMap.isEmpty()) {
                int addChildCount = viewStructure.addChildCount(linkedHashMap2.size());
                Iterator it = linkedHashMap2.entrySet().iterator();
                if (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    int intValue = ((Number) entry.getKey()).intValue();
                    if (entry.getValue() != null) {
                        vm1.h();
                        return;
                    }
                    ViewStructure newChild2 = viewStructure.newChild(addChildCount);
                    ay5.u(newChild2, m13getAutofill.c, intValue);
                    newChild2.setId(intValue, m13getAutofill.a.getContext().getPackageName(), null, null);
                    ay5.v(newChild2, 1);
                    throw null;
                }
            }
        }
    }

    public final void E() {
        if (!this.w0) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (currentAnimationTimeMillis != this.v0) {
                this.v0 = currentAnimationTimeMillis;
                H();
                ViewParent parent = getParent();
                View view = this;
                while (parent instanceof ViewGroup) {
                    view = (View) parent;
                    parent = ((ViewGroup) view).getParent();
                }
                int[] iArr = this.q0;
                view.getLocationOnScreen(iArr);
                view.getLocationInWindow(iArr);
                this.x0 = (Float.floatToRawIntBits(iArr[0] - iArr[0]) << 32) | (Float.floatToRawIntBits(iArr[1] - iArr[1]) & 4294967295L);
            }
        }
    }

    public final void F(MotionEvent motionEvent) {
        this.v0 = AnimationUtils.currentAnimationTimeMillis();
        H();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        long c = l27.c((Float.floatToRawIntBits(y) & 4294967295L) | (Float.floatToRawIntBits(x) << 32), this.t0);
        this.x0 = (Float.floatToRawIntBits(motionEvent.getRawX() - Float.intBitsToFloat((int) (c >> 32))) << 32) | (Float.floatToRawIntBits(motionEvent.getRawY() - Float.intBitsToFloat((int) (c & 4294967295L))) & 4294967295L);
    }

    public final void H() {
        int i = Build.VERSION.SDK_INT;
        float[] fArr = this.t0;
        int[] iArr = this.q0;
        if (i >= 29) {
            j51.a.a(this, fArr, this.s0, iArr);
        } else {
            l27.f(fArr);
            hbe.l0(this, fArr, this.r0, iArr);
        }
        nc2.k(fArr, this.u0);
    }

    public final boolean I() {
        if (isFocused()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    public final void J(vt4 vt4Var) {
        rz rzVar = this.D;
        boolean isEmpty = rzVar.isEmpty();
        rzVar.addLast(vt4Var);
        if (isEmpty) {
            Handler handler = getHandler();
            if (handler != null) {
                handler.postAtFrontOfQueue(this.E);
            } else {
                vs.m("schedule is called when outOfFrameExecutor is not available (view is detached)");
            }
        }
    }

    public final void K(od6 od6Var) {
        if (!isLayoutRequested() && isAttachedToWindow()) {
            if (od6Var != null) {
                while (od6Var != null && od6Var.s() == md6.a) {
                    if (!this.n0) {
                        od6 v = od6Var.v();
                        if (v == null) {
                            break;
                        }
                        long j = ((wv5) v.c0.d).d;
                        if (x02.g(j) && x02.f(j)) {
                            break;
                        }
                    }
                    od6Var = od6Var.v();
                }
                if (od6Var == getRoot()) {
                    requestLayout();
                    return;
                }
            }
            if (getWidth() != 0 && getHeight() != 0) {
                invalidate();
            } else {
                requestLayout();
            }
        }
    }

    public final long L(long j) {
        E();
        return l27.c((Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.x0 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.x0 >> 32))) << 32), this.u0);
    }

    public final int M(MotionEvent motionEvent) {
        Object obj;
        if (this.X0) {
            this.X0 = false;
            zk6 zk6Var = this.a.t;
            int metaState = motionEvent.getMetaState();
            zk6Var.getClass();
            pid.a.setValue(new h19(metaState));
        }
        mr7 mr7Var = this.c0;
        eb5 c = mr7Var.c(this, motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        vz0 vz0Var = this.d0;
        if (c != null) {
            List list = (List) c.b;
            int size = list.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    obj = list.get(size);
                    if (((b19) obj).e && (actionMasked == 0 || actionMasked == 5)) {
                        break;
                    } else if (i < 0) {
                        break;
                    } else {
                        size = i;
                    }
                }
            }
            obj = null;
            b19 b19Var = (b19) obj;
            if (b19Var != null) {
                this.b = b19Var.d;
            }
            int a = vz0Var.a(c, this, p(motionEvent));
            c.c = null;
            if ((actionMasked != 0 && actionMasked != 5) || (a & 1) != 0) {
                return a;
            }
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            mr7Var.c.delete(pointerId);
            mr7Var.b.delete(pointerId);
            return a;
        }
        if (!vz0Var.a) {
            ((my6) ((mu9) vz0Var.d).a).a();
            ((x65) vz0Var.c).c();
        }
        return 0;
    }

    public final void N(MotionEvent motionEvent, int i, long j, boolean z) {
        int i2;
        int buttonState;
        long downTime;
        int i3;
        int actionMasked = motionEvent.getActionMasked();
        int i4 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i4 = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            i4 = 0;
        }
        int pointerCount = motionEvent.getPointerCount();
        if (i4 >= 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i5 = pointerCount - i2;
        if (i5 == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            pointerPropertiesArr[i6] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[i5];
        for (int i7 = 0; i7 < i5; i7++) {
            pointerCoordsArr[i7] = new MotionEvent.PointerCoords();
        }
        for (int i8 = 0; i8 < i5; i8++) {
            if (i4 >= 0 && i4 <= i8) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            int i9 = i3 + i8;
            motionEvent.getPointerProperties(i9, pointerPropertiesArr[i8]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i8];
            motionEvent.getPointerCoords(i9, pointerCoords);
            float f = pointerCoords.x;
            float f2 = pointerCoords.y;
            long t = t((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (t >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (t & 4294967295L));
        }
        if (z) {
            buttonState = 0;
        } else {
            buttonState = motionEvent.getButtonState();
        }
        if (motionEvent.getDownTime() == motionEvent.getEventTime()) {
            downTime = j;
        } else {
            downTime = motionEvent.getDownTime();
        }
        MotionEvent obtain = MotionEvent.obtain(downTime, j, i, i5, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), buttonState, motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        eb5 c = this.c0.c(this, obtain);
        c.getClass();
        this.d0.a(c, this, true);
        obtain.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O(defpackage.lu4 r8, defpackage.n42 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.qg
            if (r0 == 0) goto L13
            r0 = r9
            qg r0 = (defpackage.qg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qg r0 = new qg
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2b
            if (r1 == r2) goto L27
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return
        L27:
            defpackage.hre.r(r9)
            goto L4b
        L2b:
            defpackage.hre.r(r9)
            r9 = r2
            lg r2 = new lg
            r1 = 2
            r2.<init>(r7, r1)
            r0.c = r9
            z45 r1 = new z45
            r5 = 0
            r6 = 19
            java.util.concurrent.atomic.AtomicReference r3 = r7.B0
            r4 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.Object r7 = defpackage.k27.p(r1, r0)
            n82 r8 = defpackage.n82.a
            if (r7 != r8) goto L4b
            return
        L4b:
            defpackage.ls2.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rg.O(lu4, n42):void");
    }

    public final void P(Configuration configuration) {
        Configuration configuration2 = getConfiguration();
        if (!c16.i(configuration2, configuration)) {
            setConfiguration(new Configuration(configuration));
            if (configuration2.fontScale != configuration.fontScale || configuration2.densityDpi != configuration.densityDpi) {
                setDensity(rqe.a(getContext()));
            }
        }
    }

    @Override // defpackage.dv2
    public final void Q(un6 un6Var) {
        h61 h61Var;
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(abf.t());
        }
        bo6 bo6Var = this.f;
        if (bo6Var != null) {
            ao6 ao6Var = this.e;
            ao6Var.getClass();
            uwd uwdVar = bo6Var.a;
            j07 j07Var = (j07) uwdVar.b;
            if (j07Var.a && !j07Var.c) {
                try {
                    h61Var = ((und) ao6Var).a.v(new ik(bo6Var, 17));
                } catch (CancellationException unused) {
                    j07 j07Var2 = (j07) uwdVar.b;
                    if (!j07Var2.b) {
                        if (j07Var2.c) {
                            f39.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                        }
                        j07Var2.a();
                        j07Var2.c = true;
                    }
                    h61Var = null;
                }
                h61 h61Var2 = bo6Var.d;
                if (h61Var2 != null) {
                    h61Var2.cancel();
                }
                bo6Var.d = h61Var;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R() {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rg.R():void");
    }

    public final void S(float f) {
        if (m()) {
            if (f > nae.e) {
                if (Float.isNaN(this.M0) || f > this.M0) {
                    this.M0 = f;
                }
            } else if (f < nae.e) {
                if (Float.isNaN(this.N0) || f < this.N0) {
                    this.N0 = f;
                }
            }
        }
    }

    @Override // defpackage.nm4
    public final void a(hn4 hn4Var, hn4 hn4Var2) {
        boolean z;
        kn knVar;
        boolean z2;
        kn knVar2;
        boolean z3;
        if (hn4Var != null) {
            hn4 hn4Var3 = hn4Var;
            if (!hn4Var3.a.J) {
                lv5.c("visitAncestors called on an unattached node");
            }
            mq7 mq7Var = hn4Var3.a;
            od6 v = voe.v(hn4Var);
            uv7 uv7Var = null;
            ArrayList arrayList = null;
            while (v != null) {
                if ((((mq7) v.c0.C).d & 2097152) != 0) {
                    while (mq7Var != null) {
                        if ((mq7Var.c & 2097152) != 0) {
                            mq7 mq7Var2 = mq7Var;
                            gw7 gw7Var = null;
                            while (mq7Var2 != null) {
                                if (mq7Var2 instanceof su5) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(mq7Var2);
                                    z3 = false;
                                } else {
                                    z3 = true;
                                }
                                if (z3 && (mq7Var2.c & 2097152) != 0 && (mq7Var2 instanceof m03)) {
                                    int i = 0;
                                    for (mq7 mq7Var3 = ((m03) mq7Var2).L; mq7Var3 != null; mq7Var3 = mq7Var3.f) {
                                        if ((mq7Var3.c & 2097152) != 0) {
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
                        mq7Var = mq7Var.e;
                    }
                }
                v = v.v();
                if (v != null && (knVar2 = v.c0) != null) {
                    mq7Var = (hkb) knVar2.f;
                } else {
                    mq7Var = null;
                }
            }
            if (arrayList != null) {
                if (hn4Var2 != null) {
                    if (!hn4Var2.a.J) {
                        lv5.c("visitAncestors called on an unattached node");
                    }
                    mq7 mq7Var4 = hn4Var2.a;
                    od6 v2 = voe.v(hn4Var2);
                    uv7 uv7Var2 = null;
                    while (v2 != null) {
                        if ((((mq7) v2.c0.C).d & 2097152) != 0) {
                            while (mq7Var4 != null) {
                                if ((mq7Var4.c & 2097152) != 0) {
                                    mq7 mq7Var5 = mq7Var4;
                                    gw7 gw7Var2 = null;
                                    while (mq7Var5 != null) {
                                        if (mq7Var5 instanceof su5) {
                                            if (uv7Var2 == null) {
                                                uv7 uv7Var3 = uz9.a;
                                                uv7Var2 = new uv7();
                                            }
                                            uv7Var2.a(mq7Var5);
                                            z2 = false;
                                        } else {
                                            z2 = true;
                                        }
                                        if (z2 && (mq7Var5.c & 2097152) != 0 && (mq7Var5 instanceof m03)) {
                                            int i2 = 0;
                                            for (mq7 mq7Var6 = ((m03) mq7Var5).L; mq7Var6 != null; mq7Var6 = mq7Var6.f) {
                                                if ((mq7Var6.c & 2097152) != 0) {
                                                    i2++;
                                                    if (i2 == 1) {
                                                        mq7Var5 = mq7Var6;
                                                    } else {
                                                        if (gw7Var2 == null) {
                                                            gw7Var2 = new gw7(new mq7[16], 0);
                                                        }
                                                        if (mq7Var5 != null) {
                                                            gw7Var2.b(mq7Var5);
                                                            mq7Var5 = null;
                                                        }
                                                        gw7Var2.b(mq7Var6);
                                                    }
                                                }
                                            }
                                            if (i2 == 1) {
                                            }
                                        }
                                        mq7Var5 = voe.h(gw7Var2);
                                    }
                                }
                                mq7Var4 = mq7Var4.e;
                            }
                        }
                        v2 = v2.v();
                        if (v2 != null && (knVar = v2.c0) != null) {
                            mq7Var4 = (hkb) knVar.f;
                        } else {
                            mq7Var4 = null;
                        }
                    }
                    uv7Var = uv7Var2;
                }
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    su5 su5Var = (su5) arrayList.get(i3);
                    if (uv7Var != null) {
                        z = uv7Var.c(su5Var);
                    } else {
                        z = false;
                    }
                    if (!z) {
                        su5Var.O0();
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        hn4 hn4Var = ((rm4) getFocusOwner()).c;
        if (hn4Var.J) {
            if (!hn4Var.a.J) {
                lv5.c("visitSubtreeIf called on an unattached node");
            }
            gw7 gw7Var = new gw7(new mq7[16], 0);
            mq7 mq7Var = hn4Var.a;
            mq7 mq7Var2 = mq7Var.f;
            if (mq7Var2 == null) {
                voe.g(gw7Var, mq7Var);
            } else {
                gw7Var.b(mq7Var2);
            }
            while (true) {
                int i3 = gw7Var.c;
                if (i3 != 0) {
                    mq7 mq7Var3 = (mq7) gw7Var.k(i3 - 1);
                    if ((mq7Var3.d & 1024) != 0) {
                        for (mq7 mq7Var4 = mq7Var3; mq7Var4 != null && mq7Var4.J; mq7Var4 = mq7Var4.f) {
                            if ((mq7Var4.c & 1024) != 0) {
                                mq7 mq7Var5 = mq7Var4;
                                gw7 gw7Var2 = null;
                                while (mq7Var5 != null) {
                                    if (mq7Var5 instanceof hn4) {
                                        hn4 hn4Var2 = (hn4) mq7Var5;
                                        if (hn4Var2.J && hn4Var2.J1().a) {
                                            super.addFocusables(arrayList, i, i2);
                                            hn4 hn4Var3 = ((rm4) getFocusOwner()).c;
                                            if (hn4Var3.J) {
                                                if (!hn4Var3.a.J) {
                                                    lv5.c("visitSubtreeIf called on an unattached node");
                                                }
                                                gw7 gw7Var3 = new gw7(new mq7[16], 0);
                                                mq7 mq7Var6 = hn4Var3.a;
                                                mq7 mq7Var7 = mq7Var6.f;
                                                if (mq7Var7 == null) {
                                                    voe.g(gw7Var3, mq7Var6);
                                                } else {
                                                    gw7Var3.b(mq7Var7);
                                                }
                                                while (true) {
                                                    int i4 = gw7Var3.c;
                                                    if (i4 == 0) {
                                                        break;
                                                    }
                                                    mq7 mq7Var8 = (mq7) gw7Var3.k(i4 - 1);
                                                    if ((mq7Var8.d & 1024) != 0) {
                                                        for (mq7 mq7Var9 = mq7Var8; mq7Var9 != null && mq7Var9.J; mq7Var9 = mq7Var9.f) {
                                                            if ((mq7Var9.c & 1024) != 0) {
                                                                mq7 mq7Var10 = mq7Var9;
                                                                gw7 gw7Var4 = null;
                                                                while (mq7Var10 != null) {
                                                                    if (mq7Var10 instanceof hn4) {
                                                                        hn4 hn4Var4 = (hn4) mq7Var10;
                                                                        if (hn4Var4.J) {
                                                                            vm4 J1 = hn4Var4.J1();
                                                                            if (hn4Var4.J && !hn4Var4.K && J1.a) {
                                                                                return;
                                                                            }
                                                                        }
                                                                    } else if ((mq7Var10.c & 1024) != 0 && (mq7Var10 instanceof m03)) {
                                                                        int i5 = 0;
                                                                        for (mq7 mq7Var11 = ((m03) mq7Var10).L; mq7Var11 != null; mq7Var11 = mq7Var11.f) {
                                                                            if ((mq7Var11.c & 1024) != 0) {
                                                                                i5++;
                                                                                if (i5 == 1) {
                                                                                    mq7Var10 = mq7Var11;
                                                                                } else {
                                                                                    if (gw7Var4 == null) {
                                                                                        gw7Var4 = new gw7(new mq7[16], 0);
                                                                                    }
                                                                                    if (mq7Var10 != null) {
                                                                                        gw7Var4.b(mq7Var10);
                                                                                        mq7Var10 = null;
                                                                                    }
                                                                                    gw7Var4.b(mq7Var11);
                                                                                }
                                                                            }
                                                                        }
                                                                        if (i5 == 1) {
                                                                        }
                                                                    }
                                                                    mq7Var10 = voe.h(gw7Var4);
                                                                }
                                                                continue;
                                                            }
                                                        }
                                                    }
                                                    voe.g(gw7Var3, mq7Var8);
                                                }
                                            }
                                            if (arrayList != null) {
                                                arrayList.remove(this);
                                                return;
                                            }
                                            return;
                                        }
                                    } else if ((mq7Var5.c & 1024) != 0 && (mq7Var5 instanceof m03)) {
                                        int i6 = 0;
                                        for (mq7 mq7Var12 = ((m03) mq7Var5).L; mq7Var12 != null; mq7Var12 = mq7Var12.f) {
                                            if ((mq7Var12.c & 1024) != 0) {
                                                i6++;
                                                if (i6 == 1) {
                                                    mq7Var5 = mq7Var12;
                                                } else {
                                                    if (gw7Var2 == null) {
                                                        gw7Var2 = new gw7(new mq7[16], 0);
                                                    }
                                                    if (mq7Var5 != null) {
                                                        gw7Var2.b(mq7Var5);
                                                        mq7Var5 = null;
                                                    }
                                                    gw7Var2.b(mq7Var12);
                                                }
                                            }
                                        }
                                        if (i6 == 1) {
                                        }
                                    }
                                    mq7Var5 = voe.h(gw7Var2);
                                }
                                continue;
                            }
                        }
                    }
                    voe.g(gw7Var, mq7Var3);
                } else {
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        if (e()) {
            cf autofillManager = getAutofillManager();
            if (autofillManager != null) {
                autofillManager.b(sparseArray);
            }
            bf m13getAutofill = m13getAutofill();
            if (m13getAutofill != null) {
                h50.t(m13getAutofill, sparseArray);
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.R.l(this.b, i, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.R.l(this.b, i, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        kv7 kv7Var = this.V;
        if (!isAttachedToWindow()) {
            k(getRoot());
        }
        u(true);
        dra.j().m();
        this.a0 = true;
        Trace.beginSection("AndroidOwner:draw");
        try {
            o61 canvasHolder = getCanvasHolder();
            sf sfVar = canvasHolder.a;
            Canvas canvas2 = sfVar.a;
            sfVar.a = canvas;
            getRoot().j(sfVar, null);
            canvasHolder.a.a = canvas2;
            if (kv7Var.i()) {
                int i = kv7Var.b;
                for (int i2 = 0; i2 < i; i2++) {
                    ((s15) ((vg8) kv7Var.f(i2))).g();
                }
            }
            int i3 = add.a;
            kv7Var.d();
            this.a0 = false;
            Trace.endSection();
            kv7 kv7Var2 = this.W;
            if (kv7Var2 != null) {
                kv7Var.b(kv7Var2);
                kv7Var2.d();
            }
            if (m()) {
                if (Float.compare(this.M0, this.O0) != 0) {
                    float f = this.M0;
                    this.O0 = f;
                    av.a(this, f);
                }
                View view = this.G;
                if (view != null) {
                    if (Float.compare(this.N0, this.P0) != 0) {
                        float f2 = this.N0;
                        this.P0 = f2;
                        av.a(view, f2);
                    }
                    if (!Float.isNaN(this.N0)) {
                        view.invalidate();
                        drawChild(canvas, view, getDrawingTime());
                    }
                }
                this.M0 = Float.NaN;
                this.N0 = Float.NaN;
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:274:0x0459, code lost:
        if ((r2 / r3) >= 5.0f) goto L646;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v18, types: [hkb] */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v42, types: [hkb] */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v47, types: [hkb] */
    /* JADX WARN: Type inference failed for: r2v75 */
    /* JADX WARN: Type inference failed for: r2v76 */
    /* JADX WARN: Type inference failed for: r2v79, types: [hkb] */
    /* JADX WARN: Type inference failed for: r33v0 */
    /* JADX WARN: Type inference failed for: r33v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r33v2 */
    /* JADX WARN: Type inference failed for: r39v0 */
    /* JADX WARN: Type inference failed for: r39v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r39v2 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27, types: [su5, f03] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, kj] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v28, types: [gw7] */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35, types: [su5, f03] */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v54 */
    /* JADX WARN: Type inference failed for: r4v55 */
    /* JADX WARN: Type inference failed for: r4v56 */
    /* JADX WARN: Type inference failed for: r4v64 */
    /* JADX WARN: Type inference failed for: r4v65 */
    /* JADX WARN: Type inference failed for: r4v68 */
    /* JADX WARN: Type inference failed for: r4v69 */
    /* JADX WARN: Type inference failed for: r4v70 */
    /* JADX WARN: Type inference failed for: r4v72 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v55 */
    /* JADX WARN: Type inference failed for: r5v56, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r5v60 */
    /* JADX WARN: Type inference failed for: r5v61 */
    /* JADX WARN: Type inference failed for: r5v66, types: [gw7] */
    /* JADX WARN: Type inference failed for: r5v67 */
    /* JADX WARN: Type inference failed for: r5v68 */
    /* JADX WARN: Type inference failed for: r5v69 */
    /* JADX WARN: Type inference failed for: r5v83 */
    /* JADX WARN: Type inference failed for: r5v84 */
    /* JADX WARN: Type inference failed for: r5v87 */
    /* JADX WARN: Type inference failed for: r5v88 */
    /* JADX WARN: Type inference failed for: r5v89 */
    /* JADX WARN: Type inference failed for: r5v91 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15, types: [gw7] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v69 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25, types: [gw7] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v35 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchGenericMotionEvent(android.view.MotionEvent r44) {
        /*
            Method dump skipped, instructions count: 2056
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rg.dispatchGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0167, code lost:
        if (r(r24) == false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0163  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rg.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (isFocused()) {
            zk6 zk6Var = this.a.t;
            int metaState = keyEvent.getMetaState();
            zk6Var.getClass();
            pid.a.setValue(new h19(metaState));
            if (!((rm4) getFocusOwner()).d(keyEvent, zx1.O) && !super.dispatchKeyEvent(keyEvent)) {
                return false;
            }
            return true;
        }
        return ((rm4) getFocusOwner()).d(keyEvent, new hg(0, this, keyEvent));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        kn knVar;
        if (isFocused()) {
            rm4 rm4Var = (rm4) getFocusOwner();
            if (rm4Var.d.e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                hn4 j = dae.j(rm4Var.c);
                if (j != null) {
                    if (!j.a.J) {
                        lv5.c("visitAncestors called on an unattached node");
                    }
                    mq7 mq7Var = j.a;
                    od6 v = voe.v(j);
                    while (v != null) {
                        if ((((mq7) v.c0.C).d & 131072) != 0) {
                            while (mq7Var != null) {
                                if ((mq7Var.c & 131072) != 0) {
                                    mq7 mq7Var2 = mq7Var;
                                    gw7 gw7Var = null;
                                    while (mq7Var2 != null) {
                                        if ((mq7Var2.c & 131072) != 0 && (mq7Var2 instanceof m03)) {
                                            int i = 0;
                                            for (mq7 mq7Var3 = ((m03) mq7Var2).L; mq7Var3 != null; mq7Var3 = mq7Var3.f) {
                                                if ((mq7Var3.c & 131072) != 0) {
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
                                mq7Var = mq7Var.e;
                            }
                        }
                        v = v.v();
                        if (v != null && (knVar = v.c0) != null) {
                            mq7Var = (hkb) knVar.f;
                        } else {
                            mq7Var = null;
                        }
                    }
                }
            }
        }
        if (!super.dispatchKeyEventPreIme(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        if (!e()) {
            return;
        }
        this.Z0 = true;
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            this.Z0 = false;
            D(viewStructure);
        } catch (Throwable th) {
            this.Z0 = false;
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            xg.a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        View view;
        Object b80Var;
        hn4 f;
        if (this.S0) {
            ag agVar = this.R0;
            removeCallbacks(agVar);
            MotionEvent motionEvent2 = this.I0;
            motionEvent2.getClass();
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.S0 = false;
            } else {
                agVar.run();
            }
        }
        if (!n(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || r(motionEvent))) {
            int j = j(motionEvent);
            if ((j & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
                z = false;
            } else {
                z = true;
            }
            if (!motionEvent.isFromSource(8194) && !motionEvent.isFromSource(1048584)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z && z2) {
                ViewParent parent = getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                } else {
                    view = null;
                }
                if (view == null || (b80Var = view.getTag(R.id.auto_clear_focus_behavior_tag)) == null) {
                    b80Var = new b80(1);
                }
                if (b80Var.equals(new b80(1)) && (f = ((rm4) getFocusOwner()).f()) != null) {
                    i38 u = voe.u(f);
                    if (!obe.t(u).g0(u, true).a((Float.floatToRawIntBits(motionEvent.getX()) << 32) | (Float.floatToRawIntBits(motionEvent.getY()) & 4294967295L))) {
                        ((rm4) getFocusOwner()).b(8, false, true);
                    }
                }
            }
            if ((j & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final View findViewByAccessibilityIdTraversal(int i) {
        abf abfVar = e1;
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(abfVar, Integer.valueOf(i));
                if (invoke instanceof View) {
                    return (View) invoke;
                }
                return null;
            }
            return abf.o(this, i);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [zl9, java.lang.Object] */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        int i2;
        if (view != null && !this.o0.c) {
            View rootView = getRootView();
            rootView.getClass();
            View findNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) rootView, view, i);
            rk9 rk9Var = null;
            if (findNextFocus == null || !eh.l(this, findNextFocus)) {
                findNextFocus = null;
            }
            if (view == this) {
                hn4 j = dae.j(((rm4) getFocusOwner()).c);
                if (j != null) {
                    rk9Var = dae.m(j);
                }
                if (rk9Var == null) {
                    rk9Var = lm4.a(view, this);
                }
            } else {
                rk9Var = lm4.a(view, this);
            }
            em4 d = lm4.d(i);
            if (d != null) {
                i2 = d.a;
            } else {
                i2 = 6;
            }
            ?? obj = new Object();
            if (((rm4) getFocusOwner()).e(i2, rk9Var, new jg(0, obj)) == null) {
                return view;
            }
            Object obj2 = obj.a;
            if (obj2 == null) {
                if (findNextFocus == null) {
                    return super.focusSearch(view, i);
                }
            } else if (findNextFocus == null || i2 == 1 || i2 == 2 || yae.w(dae.m((hn4) obj2), lm4.a(findNextFocus, this), rk9Var, i2)) {
                return this;
            }
            return findNextFocus;
        }
        return super.focusSearch(view, i);
    }

    public p4 getAccessibilityManager() {
        return this.a.k;
    }

    public final qp getAndroidViewsHandler() {
        return this.l0;
    }

    public be0 getAutofillTree() {
        return this.U;
    }

    public pj1 getClipboard() {
        return this.a.n;
    }

    public qj1 getClipboardManager() {
        return this.a.m;
    }

    public final vw1 getComposeViewContext() {
        return this.a;
    }

    public final boolean getComposeViewContextIncrementedDuringInit$ui() {
        return this.Y0;
    }

    public final Configuration getConfiguration() {
        return (Configuration) this.e0.getValue();
    }

    public final kh getContentCaptureManager$ui() {
        return this.S;
    }

    public d82 getCoroutineContext() {
        return this.I;
    }

    public r13 getDensity() {
        return (r13) this.F.getValue();
    }

    public rk9 getEmbeddedViewFocusRect() {
        if (isFocused()) {
            hn4 j = dae.j(((rm4) getFocusOwner()).c);
            if (j == null) {
                return null;
            }
            return dae.m(j);
        }
        View findFocus = findFocus();
        if (findFocus == null) {
            return null;
        }
        return lm4.a(findFocus, this);
    }

    public pm4 getFocusOwner() {
        return this.H;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        rk9 embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.a);
            rect.top = Math.round(embeddedViewFocusRect.b);
            rect.right = Math.round(embeddedViewFocusRect.c);
            rect.bottom = Math.round(embeddedViewFocusRect.d);
            return;
        }
        if (!c16.i(((rm4) getFocusOwner()).e(6, null, kg.b), Boolean.TRUE)) {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        } else {
            super.getFocusedRect(rect);
        }
    }

    public do4 getFontFamilyResolver() {
        return (do4) this.D0.getValue();
    }

    public bo4 getFontLoader() {
        return this.a.o;
    }

    public final ao6 getFrameEndScheduler$ui() {
        return this.e;
    }

    public m15 getGraphicsContext() {
        return this.T;
    }

    public s35 getHapticFeedBack() {
        return this.a.q;
    }

    public boolean getHasPendingMeasureOrLayout() {
        if (!this.o0.b.P() && this.D.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    public ow5 getInputModeManager() {
        int i;
        ow5 ow5Var = this.F0;
        if (ow5Var == null) {
            if (isInTouchMode()) {
                i = 1;
            } else {
                i = 2;
            }
            ow5Var = new ow5(i);
            this.F0 = ow5Var;
        }
        return ow5Var;
    }

    public final hkd getInsetsWatcher() {
        return this.M;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui() {
        return this.v0;
    }

    @Override // android.view.View, android.view.ViewParent
    public tc6 getLayoutDirection() {
        return (tc6) this.E0.getValue();
    }

    public ov6 getLocaleList() {
        return (ov6) this.f0.getValue();
    }

    public long getMeasureIteration() {
        y27 y27Var = this.o0;
        if (!y27Var.c) {
            lv5.a("measureIteration should be only used during the measure/layout pass");
        }
        return y27Var.g;
    }

    public rq7 getModifierLocalManager() {
        return this.G0;
    }

    public rg getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    public lw8 getPlacementScope() {
        int i = nw8.b;
        return new sy6(this, 1);
    }

    public final lu4 getPlayNavigationSoundEffect$ui() {
        return this.T0;
    }

    public x09 getPointerIconService() {
        return this.c1;
    }

    /* renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui  reason: not valid java name */
    public final ju5 m11getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui() {
        return this.d;
    }

    public vk9 getRectManager() {
        return this.P;
    }

    public os9 getRetainedValuesStore() {
        return this.C;
    }

    public od6 getRoot() {
        return this.N;
    }

    public final boolean getScrollCaptureInProgress$ui() {
        zz8 zz8Var;
        if (Build.VERSION.SDK_INT >= 31 && (zz8Var = this.a1) != null) {
            return ((Boolean) ((hm8) zz8Var.a).getValue()).booleanValue();
        }
        return false;
    }

    public e8a getSemanticsOwner() {
        return this.Q;
    }

    public qd6 getSharedDrawScope() {
        return this.a.s;
    }

    public boolean getShowLayoutBounds() {
        if (Build.VERSION.SDK_INT >= 30) {
            return uu.a.a(this);
        }
        return this.k0;
    }

    public yg8 getSnapshotObserver() {
        return this.j0;
    }

    public bsa getSoftwareKeyboardController() {
        w03 w03Var = this.C0;
        if (w03Var == null) {
            w03 w03Var2 = new w03(getTextInputService());
            this.C0 = w03Var2;
            return w03Var2;
        }
        return w03Var;
    }

    public tub getTextInputService() {
        tub tubVar = this.A0;
        if (tubVar == null) {
            tub tubVar2 = new tub(getLegacyTextInputServiceAndroid());
            this.A0 = tubVar2;
            return tubVar2;
        }
        return tubVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [v2c, java.lang.Object, po] */
    public v2c getTextToolbar() {
        po poVar = this.H0;
        if (poVar == null) {
            ?? obj = new Object();
            new iv8(new ik(obj, 1));
            this.H0 = obj;
            return obj;
        }
        return poVar;
    }

    public final gu9 getUncaughtExceptionHandler$ui() {
        return null;
    }

    public ucd getViewConfiguration() {
        return this.a.r;
    }

    public oid getWindowInfo() {
        return this.a.t;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025 A[LOOP_START] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.vg8 h(defpackage.lu4 r8, defpackage.f38 r9, defpackage.p15 r10) {
        /*
            r7 = this;
            if (r10 == 0) goto Ld
            s15 r0 = new s15
            r2 = 0
            r3 = r7
            r4 = r8
            r5 = r9
            r1 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        Ld:
            r3 = r7
            r4 = r8
            r5 = r9
        L10:
            hvc r7 = r3.K0
            java.lang.Object r8 = r7.c
            java.lang.ref.ReferenceQueue r8 = (java.lang.ref.ReferenceQueue) r8
            java.lang.Object r7 = r7.b
            gw7 r7 = (defpackage.gw7) r7
            java.lang.ref.Reference r8 = r8.poll()
            if (r8 == 0) goto L23
            r7.j(r8)
        L23:
            if (r8 != 0) goto L10
        L25:
            int r8 = r7.c
            r9 = 0
            if (r8 == 0) goto L39
            int r8 = r8 + (-1)
            java.lang.Object r8 = r7.k(r8)
            java.lang.ref.Reference r8 = (java.lang.ref.Reference) r8
            java.lang.Object r8 = r8.get()
            if (r8 == 0) goto L25
            goto L3a
        L39:
            r8 = r9
        L3a:
            vg8 r8 = (defpackage.vg8) r8
            if (r8 == 0) goto L89
            r7 = r8
            s15 r7 = (defpackage.s15) r7
            m15 r10 = r7.b
            if (r10 == 0) goto L82
            p15 r0 = r7.a
            boolean r0 = r0.s
            if (r0 != 0) goto L50
            java.lang.String r0 = "layer should have been released before reuse"
            defpackage.lv5.a(r0)
        L50:
            p15 r10 = r10.c()
            r7.a = r10
            r10 = 0
            r7.C = r10
            r7.d = r4
            r7.e = r5
            r7.M = r10
            r7.N = r10
            r0 = 1
            r7.O = r0
            float[] r0 = r7.D
            defpackage.l27.f(r0)
            float[] r0 = r7.E
            if (r0 == 0) goto L70
            defpackage.l27.f(r0)
        L70:
            long r0 = defpackage.ckc.b
            r7.K = r0
            r7.P = r10
            r0 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            r7.f = r0
            r7.L = r9
            r7.J = r10
            return r8
        L82:
            java.lang.String r7 = "currently reuse is only supported when we manage the layer lifecycle"
            gt1 r7 = defpackage.a82.f(r7)
            throw r7
        L89:
            s15 r1 = new s15
            m15 r7 = r3.getGraphicsContext()
            p15 r2 = r7.c()
            r6 = r5
            r5 = r4
            r4 = r3
            m15 r3 = r4.getGraphicsContext()
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rg.h(lu4, f38, p15):vg8");
    }

    public final void i(od6 od6Var, boolean z) {
        this.o0.h(od6Var, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0144 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015c A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x016e A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0171 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0180 A[Catch: all -> 0x0076, TRY_ENTER, TryCatch #0 {all -> 0x0076, blocks: (B:14:0x0034, B:16:0x003e, B:22:0x004e, B:38:0x007d, B:40:0x0081, B:41:0x0093, B:50:0x00a6, B:52:0x00ac, B:120:0x0180, B:121:0x018c, B:25:0x0056, B:31:0x0062, B:34:0x006a), top: B:144:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01a4 A[Catch: all -> 0x01bf, TryCatch #3 {all -> 0x01bf, blocks: (B:122:0x0190, B:126:0x019c, B:128:0x01a4, B:130:0x01ae, B:129:0x01a7), top: B:149:0x0190 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01a7 A[Catch: all -> 0x01bf, TryCatch #3 {all -> 0x01bf, blocks: (B:122:0x0190, B:126:0x019c, B:128:0x01a4, B:130:0x01ae, B:129:0x01a7), top: B:149:0x0190 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004e A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:14:0x0034, B:16:0x003e, B:22:0x004e, B:38:0x007d, B:40:0x0081, B:41:0x0093, B:50:0x00a6, B:52:0x00ac, B:120:0x0180, B:121:0x018c, B:25:0x0056, B:31:0x0062, B:34:0x006a), top: B:144:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00da A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00eb A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011f A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0129 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int j(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rg.j(android.view.MotionEvent):int");
    }

    public final void l(od6 od6Var) {
        this.o0.s(od6Var, false);
        gw7 z = od6Var.z();
        Object[] objArr = z.a;
        int i = z.c;
        for (int i2 = 0; i2 < i; i2++) {
            l((od6) objArr[i2]);
        }
    }

    @Override // defpackage.dv2
    public final void o(un6 un6Var) {
        bo6 bo6Var = this.f;
        if (bo6Var != null) {
            j07 j07Var = (j07) bo6Var.a.b;
            if (j07Var.a && !j07Var.c) {
                h61 h61Var = bo6Var.d;
                if (h61Var != null) {
                    h61Var.cancel();
                }
                bo6Var.d = null;
            } else if (!j07Var.b) {
                if (!j07Var.c) {
                    f39.a("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
                }
                if (!j07Var.d.i()) {
                    f39.a("Attempted to start retaining exited values with pending exited values");
                }
                j07Var.c = false;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, ldd] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        os9 os9Var;
        bo6 bo6Var;
        super.onAttachedToWindow();
        if (!getRoot().J()) {
            getRoot().d(this);
        }
        int i = 1;
        setAttached(true);
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(abf.t());
        }
        this.M.onViewAttachedToWindow(this);
        if (!this.Y0) {
            this.a.d();
        }
        int i2 = 0;
        this.Y0 = false;
        l(getRoot());
        k(getRoot());
        getSnapshotObserver().a.e();
        rg outOfFrameExecutor = getOutOfFrameExecutor();
        if (outOfFrameExecutor != null) {
            outOfFrameExecutor.J(new gg(this, 3));
            this.a.c();
            vw1 vw1Var = this.a;
            vw1Var.f();
            sdd sddVar = vw1Var.f;
            ao6 ao6Var = this.e;
            if (sddVar != null && ao6Var != null) {
                qdd i3 = sddVar.i();
                ?? obj = new Object();
                ob2 ob2Var = ob2.b;
                i3.getClass();
                ob2Var.getClass();
                odd oddVar = new odd(i3, (ldd) obj, ob2Var);
                gi1 a = cm9.a(co6.class);
                String f = a.f();
                if (f != null) {
                    ViewParent parent = getParent();
                    parent.getClass();
                    int id = ((View) parent).getId();
                    wu7 wu7Var = ((co6) oddVar.a(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(f))).b;
                    Object b = wu7Var.b(id);
                    if (b == null) {
                        b = new kv7(1);
                        wu7Var.i(id, b);
                    }
                    kv7 kv7Var = (kv7) b;
                    Object[] objArr = kv7Var.a;
                    int i4 = kv7Var.b;
                    while (true) {
                        if (i2 < i4) {
                            bo6Var = objArr[i2];
                            if (!((bo6) bo6Var).c) {
                                break;
                            }
                            i2++;
                        } else {
                            bo6Var = null;
                            break;
                        }
                    }
                    bo6 bo6Var2 = bo6Var;
                    if (bo6Var2 == null) {
                        bo6Var2 = new bo6();
                        kv7Var.a(bo6Var2);
                    }
                    bo6Var2.c = true;
                    this.f = bo6Var2;
                    os9Var = bo6Var2.b;
                } else {
                    vs.m("Local and anonymous classes can not be ViewModels");
                    return;
                }
            } else {
                os9Var = null;
            }
            if (os9Var == null) {
                os9Var = kh5.R;
            }
            this.C = os9Var;
            xt4 xt4Var = this.y0;
            if (xt4Var != null) {
                xt4Var.invoke(this.a);
                this.y0 = null;
            }
            xn6 k = this.a.c().k();
            k.a(this);
            k.a(this.S);
            ow5 inputModeManager = getInputModeManager();
            if (!isInTouchMode()) {
                i = 2;
            }
            inputModeManager.a.setValue(new mw5(i));
            getViewTreeObserver().addOnGlobalLayoutListener(this);
            getViewTreeObserver().addOnScrollChangedListener(this);
            getViewTreeObserver().addOnTouchModeChangeListener(this);
            if (Build.VERSION.SDK_INT >= 31) {
                bh.a.b(this);
            }
            cf autofillManager = getAutofillManager();
            if (autofillManager != null) {
                ((rm4) getFocusOwner()).g.a(autofillManager);
                getSemanticsOwner().d.a(autofillManager);
            }
            ((rm4) getFocusOwner()).g.a(this);
            return;
        }
        vs.k("Expected the view to be attached to window.");
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        Object obj;
        lw5 lw5Var;
        nba nbaVar = (nba) this.B0.get();
        Object obj2 = null;
        if (nbaVar != null) {
            obj = nbaVar.b;
        } else {
            obj = null;
        }
        kk kkVar = (kk) obj;
        if (kkVar == null) {
            return getLegacyTextInputServiceAndroid().d;
        }
        nba nbaVar2 = (nba) kkVar.d.get();
        if (nbaVar2 != null) {
            obj2 = nbaVar2.b;
        }
        if (((lw5) obj2) != null && (!lw5Var.e)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        P(configuration);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0133  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r18) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rg.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        kh khVar = this.S;
        khVar.getClass();
        ih.o(khVar, jArr, consumer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setAttached(false);
        this.M.onViewDetachedFromWindow(this);
        View view = this.G;
        if (m() && view != null) {
            removeView(view);
        }
        int i = Build.VERSION.SDK_INT;
        if (i > 28) {
            kv7 kv7Var = i1;
            synchronized (kv7Var) {
                kv7Var.j(this);
            }
        }
        this.a.b();
        sra sraVar = getSnapshotObserver().a;
        d89 d89Var = sraVar.h;
        if (d89Var != null) {
            d89Var.a();
        }
        sraVar.a();
        xn6 k = this.a.c().k();
        k.f(this.S);
        k.f(this);
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        bo6 bo6Var = this.f;
        if (bo6Var != null) {
            bo6Var.c = false;
        }
        this.f = null;
        if (i >= 31) {
            bh.a.a(this);
        }
        cf autofillManager = getAutofillManager();
        if (autofillManager != null) {
            getSemanticsOwner().d.j(autofillManager);
            ((rm4) getFocusOwner()).g.j(autofillManager);
        }
        vk9 rectManager = getRectManager();
        rectManager.g = rectManager.d.b(0L, 0L, null, 0, 0);
        getRectManager().a();
        vk9 rectManager2 = getRectManager();
        bg bgVar = rectManager2.i;
        if (bgVar != null) {
            rectManager2.b.removeCallbacks(bgVar);
            rectManager2.i = null;
        }
        ((rm4) getFocusOwner()).g.j(this);
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!z && !hasFocus()) {
            rm4 rm4Var = (rm4) getFocusOwner();
            cae.z(rm4Var.c, true);
            if (rm4Var.f() != null) {
                hn4 f = rm4Var.f();
                rm4Var.i(null);
                if (f != null) {
                    f.I1(dn4.a, dn4.c);
                }
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.v0 = 0L;
        R();
        int i = Build.VERSION.SDK_INT;
        if (32 <= i && i < 34) {
            P(getResources().getConfiguration());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("AndroidOwner:onLayout");
        try {
            this.v0 = 0L;
            this.o0.m(this.V0);
            this.m0 = null;
            R();
            qp qpVar = this.l0;
            if (qpVar != null) {
                Trace.beginSection("AndroidOwner:viewLayout");
                qpVar.layout(0, 0, i3 - i, i4 - i2);
                Trace.endSection();
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        y27 y27Var = this.o0;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!getRoot().J()) {
                getRoot().d(this);
            }
            if (!isAttachedToWindow()) {
                l(getRoot());
            }
            long g = g(i);
            long g2 = g(i2);
            long q = ak0.q((int) (g >>> 32), (int) (g & 4294967295L), (int) (g2 >>> 32), (int) (4294967295L & g2));
            x02 x02Var = this.m0;
            if (x02Var == null) {
                this.m0 = new x02(q);
                this.n0 = false;
            } else if (!x02.c(x02Var.a, q)) {
                this.n0 = true;
            }
            y27Var.t(q);
            y27Var.o();
            setMeasuredDimension(getRoot().d0.p.a, getRoot().d0.p.b);
            qp qpVar = this.l0;
            if (qpVar != null) {
                Trace.beginSection("AndroidOwner:androidViewMeasure");
                qpVar.measure(View.MeasureSpec.makeMeasureSpec(getRoot().d0.p.a, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().d0.p.b, 1073741824));
                Trace.endSection();
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        if (e() && viewStructure != null && !this.Z0) {
            D(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        w09 w09Var;
        int toolType = motionEvent.getToolType(i);
        if (!motionEvent.isFromSource(8194) && motionEvent.isFromSource(16386) && ((toolType == 2 || toolType == 4) && (w09Var = ((mg) getPointerIconService()).a) != null)) {
            Context context = getContext();
            if (w09Var instanceof lk) {
                return PointerIcon.getSystemIcon(context, ((lk) w09Var).b);
            }
            return PointerIcon.getSystemIcon(context, 1000);
        }
        return super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        tc6 tc6Var;
        if (this.c) {
            int[] iArr = lm4.a;
            tc6 tc6Var2 = tc6.a;
            if (i != 0) {
                if (i != 1) {
                    tc6Var = null;
                } else {
                    tc6Var = tc6.b;
                }
            } else {
                tc6Var = tc6Var2;
            }
            if (tc6Var != null) {
                tc6Var2 = tc6Var;
            }
            setLayoutDirection(tc6Var2);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        zz8 zz8Var;
        if (Build.VERSION.SDK_INT >= 31 && (zz8Var = this.a1) != null) {
            zz8Var.a(this, getSemanticsOwner(), getCoroutineContext(), consumer);
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        R();
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        int i;
        ow5 inputModeManager = getInputModeManager();
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        inputModeManager.a.setValue(new mw5(i));
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        kh khVar = this.S;
        khVar.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (c16.i(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            ih.e(khVar, longSparseArray);
        } else {
            khVar.a.post(new b9(2, khVar, longSparseArray));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean t;
        this.X0 = true;
        super.onWindowFocusChanged(z);
        if (z && Build.VERSION.SDK_INT < 30 && getShowLayoutBounds() != (t = abf.t())) {
            setShowLayoutBounds(t);
            k(getRoot());
        }
    }

    public final boolean p(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (nae.e <= x && x <= getWidth() && nae.e <= y && y <= getHeight()) {
            return true;
        }
        return false;
    }

    public final boolean r(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        if (motionEvent.getPointerCount() != 1 || (motionEvent2 = this.I0) == null || motionEvent2.getPointerCount() != motionEvent.getPointerCount() || motionEvent.getRawX() != motionEvent2.getRawX() || motionEvent.getRawY() != motionEvent2.getRawY()) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        int i2;
        rk9 rk9Var;
        if (!isFocused()) {
            em4 d = lm4.d(i);
            if (d != null) {
                i2 = d.a;
            } else {
                i2 = 7;
            }
            pm4 focusOwner = getFocusOwner();
            if (rect != null) {
                rk9Var = ipe.D(rect);
            } else {
                rk9Var = null;
            }
            Boolean e = ((rm4) focusOwner).e(i2, rk9Var, new ng(i2, 0));
            Boolean bool = Boolean.TRUE;
            if (!c16.i(e, bool)) {
                if (!c16.i(((rm4) getFocusOwner()).e(i2, null, new ng(i2, 1)), bool)) {
                    if (!hasFocus() || (i2 != 1 && i2 != 2)) {
                        return false;
                    }
                    return ((rm4) getFocusOwner()).h(i2);
                }
            }
        }
        return true;
    }

    public final void s(float[] fArr) {
        E();
        l27.j(fArr, this.t0);
        eh.m(fArr, Float.intBitsToFloat((int) (this.x0 >> 32)), Float.intBitsToFloat((int) (this.x0 & 4294967295L)), this.r0);
    }

    public void setAccessibilityEventBatchIntervalMillis(long j) {
        this.R.D = j;
    }

    public final void setAndroidViewsHandler(qp qpVar) {
        this.l0 = qpVar;
    }

    public final void setComposeViewContext(vw1 vw1Var) {
        vw1 vw1Var2 = this.a;
        if (vw1Var == vw1Var2) {
            return;
        }
        if (isAttachedToWindow()) {
            vw1Var2.b();
            vw1Var.d();
        }
        this.a = vw1Var;
    }

    public final void setComposeViewContextIncrementedDuringInit$ui(boolean z) {
        this.Y0 = z;
    }

    public final void setConfiguration(Configuration configuration) {
        this.e0.setValue(configuration);
    }

    public void setCoroutineContext(d82 d82Var) {
        this.I = d82Var;
    }

    public final void setFrameEndScheduler$ui(ao6 ao6Var) {
        this.e = ao6Var;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui(long j) {
        this.v0 = j;
    }

    public final void setOnReadyForComposition(xt4 xt4Var) {
        getDerivedIsAttached();
        if (!isAttachedToWindow() && !this.Y0) {
            this.y0 = xt4Var;
        } else {
            xt4Var.invoke(this.a);
        }
    }

    public final void setPlayNavigationSoundEffect$ui(lu4 lu4Var) {
        this.T0 = lu4Var;
    }

    /* renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui  reason: not valid java name */
    public final void m12setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(ju5 ju5Var) {
        this.d = ju5Var;
    }

    public void setShowLayoutBounds(boolean z) {
        this.k0 = z;
    }

    public void setUncaughtExceptionHandler(gu9 gu9Var) {
        this.o0.getClass();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final long t(long j) {
        E();
        long c = l27.c(j, this.t0);
        return (Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.x0 >> 32)) + Float.intBitsToFloat((int) (c >> 32))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.x0 & 4294967295L)) + Float.intBitsToFloat((int) (c & 4294967295L))) & 4294967295L);
    }

    public final void u(boolean z) {
        gg ggVar;
        y27 y27Var = this.o0;
        if (!y27Var.b.P() && ((gw7) y27Var.e.b).c == 0) {
            return;
        }
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            if (z) {
                ggVar = this.V0;
            } else {
                ggVar = this.W0;
            }
            if (y27Var.m(ggVar)) {
                requestLayout();
            }
            y27Var.c(false);
            getRectManager().a();
            if (this.b0) {
                getViewTreeObserver().dispatchOnGlobalLayout();
                this.b0 = false;
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void v(od6 od6Var, long j) {
        y27 y27Var = this.o0;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            y27Var.n(od6Var, j);
            if (!y27Var.b.P()) {
                y27Var.c(false);
                getRectManager().a();
                this.W0.invoke();
                if (this.b0) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.b0 = false;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    public final boolean w(int i) {
        View view;
        if (i != 7 && i != 8) {
            Integer c = lm4.c(i);
            if (c != null) {
                int intValue = c.intValue();
                hn4 f = ((rm4) getFocusOwner()).f();
                if (f != null) {
                    Integer c2 = lm4.c(i);
                    if (c2 != null) {
                        int intValue2 = c2.intValue();
                        wcd wcdVar = voe.v(f).L;
                        if (wcdVar != null) {
                            view = wcdVar.getInteropView();
                        } else {
                            view = null;
                        }
                        View findFocus = findFocus();
                        FocusFinder focusFinder = FocusFinder.getInstance();
                        View rootView = getRootView();
                        rootView.getClass();
                        View findNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, findFocus, intValue2);
                        if (findNextFocus == null || view == null || !eh.l(view, findNextFocus)) {
                            findNextFocus = null;
                        }
                        if (findNextFocus != null) {
                            return lm4.b(findNextFocus, Integer.valueOf(intValue), null);
                        }
                    } else {
                        throw a82.f("Invalid focus direction");
                    }
                } else {
                    vs.k("findNextViewInEmbeddedView called when owner does not have anything focused.");
                    return false;
                }
            } else {
                throw a82.f("Invalid focus direction");
            }
        }
        return false;
    }

    public final void x() {
        kv7 kv7Var;
        cf autofillManager;
        Object[] objArr;
        if (this.i0) {
            sra sraVar = getSnapshotObserver().a;
            synchronized (sraVar.g) {
                try {
                    gw7 gw7Var = sraVar.f;
                    int i = gw7Var.c;
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        objArr = gw7Var.a;
                        if (i2 >= i) {
                            break;
                        }
                        rra rraVar = (rra) objArr[i2];
                        rraVar.d();
                        if (!rraVar.f.j()) {
                            i3++;
                        } else if (i3 > 0) {
                            Object[] objArr2 = gw7Var.a;
                            objArr2[i2 - i3] = objArr2[i2];
                        }
                        i2++;
                    }
                    int i4 = i - i3;
                    Arrays.fill(objArr, i4, i, (Object) null);
                    gw7Var.c = i4;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.i0 = false;
        }
        qp qpVar = this.l0;
        if (qpVar != null) {
            f(qpVar);
        }
        if (e() && (autofillManager = getAutofillManager()) != null) {
            xu7 xu7Var = autofillManager.D;
            if (xu7Var.d == 0 && autofillManager.E) {
                autofillManager.a.a();
                autofillManager.E = false;
            }
            if (xu7Var.d != 0) {
                autofillManager.E = true;
            }
        }
        while (this.L0.i() && this.L0.f(0) != null) {
            int i5 = this.L0.b;
            int i6 = 0;
            while (true) {
                kv7Var = this.L0;
                if (i6 < i5) {
                    vt4 vt4Var = (vt4) kv7Var.f(i6);
                    this.L0.n(i6, null);
                    if (vt4Var != null) {
                        vt4Var.invoke();
                    }
                    i6++;
                }
            }
            kv7Var.l(0, i5);
        }
    }

    public final void y(od6 od6Var) {
        wg wgVar = this.R;
        wgVar.U = true;
        if (wgVar.u()) {
            wgVar.v(od6Var);
        }
        kh khVar = this.S;
        khVar.C = true;
        khVar.e();
    }

    public final void z(od6 od6Var, boolean z, boolean z2, boolean z3) {
        od6 v;
        od6 v2;
        y27 y27Var = this.o0;
        if (z) {
            ij1 ij1Var = y27Var.b;
            od6 od6Var2 = od6Var.E;
            sd6 sd6Var = od6Var.d0;
            if (od6Var2 == null) {
                lv5.c("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
            }
            int ordinal = sd6Var.d.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2 && ordinal != 3) {
                        if (ordinal == 4) {
                            if (!sd6Var.e || z2) {
                                sd6Var.e = true;
                                sd6Var.p.R = true;
                                if (!od6Var.n0) {
                                    if ((!c16.i(od6Var.L(), Boolean.TRUE) && !y27.j(od6Var)) || ((v = od6Var.v()) != null && v.d0.e)) {
                                        if ((od6Var.K() || y27.k(od6Var)) && ((v2 = od6Var.v()) == null || !v2.r())) {
                                            ij1Var.a(od6Var, s16.c);
                                        }
                                    } else {
                                        ij1Var.a(od6Var, s16.a);
                                    }
                                    if (!y27Var.d && z3) {
                                        K(od6Var);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        xk5.o();
                        return;
                    }
                } else {
                    return;
                }
            }
            y27Var.h.b(new x27(od6Var, true, z2));
        } else if (y27Var.s(od6Var, z2) && z3) {
            K(od6Var);
        }
    }

    /* renamed from: getAutofill */
    public bf m13getAutofill() {
        return this.g0;
    }

    public cf getAutofillManager() {
        return this.h0;
    }

    public si getDragAndDropManager() {
        return this.J;
    }

    public wu7 getLayoutNodes() {
        return this.O;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.width = i;
        generateDefaultLayoutParams.height = i2;
        addViewInLayout(view, -1, generateDefaultLayoutParams, true);
    }

    @d23
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui$annotations() {
    }

    public static /* synthetic */ void getPlayNavigationSoundEffect$ui$annotations() {
    }

    /* renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations  reason: not valid java name */
    public static /* synthetic */ void m10getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    @d23
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public static /* synthetic */ void getWindowInfo$annotations() {
    }

    public hu9 getRootForTest() {
        return this;
    }

    public View getView() {
        return this;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public final void setUncaughtExceptionHandler$ui(gu9 gu9Var) {
    }
}

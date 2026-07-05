package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.vbook.android.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {
    public static final int[] S0 = {16843830};
    public static final float T0 = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean U0 = true;
    public static final boolean V0 = true;
    public static final Class[] W0;
    public static final wk9 X0;
    public static final ol9 Y0;
    public hl9 A0;
    public ArrayList B0;
    public final hvc C;
    public boolean C0;
    public boolean D;
    public boolean D0;
    public final Rect E;
    public final n07 E0;
    public final Rect F;
    public boolean F0;
    public final RectF G;
    public tl9 G0;
    public yk9 H;
    public final int[] H0;
    public el9 I;
    public f18 I0;
    public final ArrayList J;
    public final int[] J0;
    public final ArrayList K;
    public final int[] K0;
    public final ArrayList L;
    public final int[] L0;
    public cb4 M;
    public final ArrayList M0;
    public boolean N;
    public final og N0;
    public boolean O;
    public boolean O0;
    public boolean P;
    public int P0;
    public int Q;
    public int Q0;
    public boolean R;
    public final l97 R0;
    public boolean S;
    public boolean T;
    public int U;
    public final AccessibilityManager V;
    public boolean W;
    public final float a;
    public boolean a0;
    public final v28 b;
    public int b0;
    public final kl9 c;
    public int c0;
    public ml9 d;
    public bl9 d0;
    public final bm1 e;
    public EdgeEffect e0;
    public final ij1 f;
    public EdgeEffect f0;
    public EdgeEffect g0;
    public EdgeEffect h0;
    public cl9 i0;
    public int j0;
    public int k0;
    public VelocityTracker l0;
    public int m0;
    public int n0;
    public int o0;
    public int p0;
    public int q0;
    public final int r0;
    public final int s0;
    public final float t0;
    public final float u0;
    public boolean v0;
    public final ql9 w0;
    public yv4 x0;
    public final wh1 y0;
    public final nl9 z0;

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, ol9] */
    /* JADX WARN: Type inference failed for: r0v9, types: [wk9, java.lang.Object] */
    static {
        Class cls = Integer.TYPE;
        W0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        X0 = new Object();
        Y0 = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [cl9, yu2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, nl9] */
    /* JADX WARN: Type inference failed for: r3v45, types: [java.lang.Object] */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        wh1 wh1Var;
        float a;
        float a2;
        boolean z;
        int i2;
        char c;
        char c2;
        ?? r19;
        TypedArray typedArray;
        int i3;
        ClassLoader classLoader;
        Constructor constructor;
        Object[] objArr;
        this.b = new v28(2);
        this.c = new kl9(this);
        this.C = new hvc(1);
        this.E = new Rect();
        this.F = new Rect();
        this.G = new RectF();
        this.J = new ArrayList();
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.Q = 0;
        this.W = false;
        this.a0 = false;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = Y0;
        ?? obj = new Object();
        obj.a = null;
        obj.b = new ArrayList();
        obj.c = 120L;
        obj.d = 120L;
        obj.e = 250L;
        obj.f = 250L;
        obj.g = true;
        obj.h = new ArrayList();
        obj.i = new ArrayList();
        obj.j = new ArrayList();
        obj.k = new ArrayList();
        obj.l = new ArrayList();
        obj.m = new ArrayList();
        obj.n = new ArrayList();
        obj.o = new ArrayList();
        obj.p = new ArrayList();
        obj.q = new ArrayList();
        obj.r = new ArrayList();
        this.i0 = obj;
        this.j0 = 0;
        this.k0 = -1;
        this.t0 = Float.MIN_VALUE;
        this.u0 = Float.MIN_VALUE;
        this.v0 = true;
        this.w0 = new ql9(this);
        if (V0) {
            wh1Var = new Object();
        } else {
            wh1Var = null;
        }
        this.y0 = wh1Var;
        ?? obj2 = new Object();
        obj2.a = 0;
        obj2.b = 0;
        obj2.c = 1;
        obj2.d = 0;
        obj2.e = false;
        obj2.f = false;
        obj2.g = false;
        obj2.h = false;
        obj2.i = false;
        obj2.j = false;
        this.z0 = obj2;
        this.C0 = false;
        this.D0 = false;
        n07 n07Var = new n07(this, 28);
        this.E0 = n07Var;
        this.F0 = false;
        this.H0 = new int[2];
        this.J0 = new int[2];
        this.K0 = new int[2];
        this.L0 = new int[2];
        this.M0 = new ArrayList();
        this.N0 = new og(this, 8);
        this.P0 = 0;
        this.Q0 = 0;
        this.R0 = new l97(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.q0 = viewConfiguration.getScaledTouchSlop();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26) {
            Method method = vcd.a;
            a = h50.q(viewConfiguration);
        } else {
            a = vcd.a(viewConfiguration, context);
        }
        this.t0 = a;
        if (i4 >= 26) {
            a2 = h50.r(viewConfiguration);
        } else {
            a2 = vcd.a(viewConfiguration, context);
        }
        this.u0 = a2;
        this.r0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.s0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        if (getOverScrollMode() == 2) {
            z = true;
        } else {
            z = false;
        }
        setWillNotDraw(z);
        this.i0.a = n07Var;
        this.e = new bm1(new xk9(this, 0));
        this.f = new ij1(new g99(this, 1));
        Field field = rcd.a;
        if (i4 >= 26) {
            i2 = mcd.a(this);
        } else {
            i2 = 0;
        }
        if (i2 == 0 && i4 >= 26) {
            mcd.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.V = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new tl9(this));
        int[] iArr = eg9.a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        rcd.b(this, context, iArr, attributeSet, obtainStyledAttributes, i);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.D = obtainStyledAttributes.getBoolean(1, true);
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
                Resources resources = getContext().getResources();
                c = 3;
                c2 = 2;
                r19 = 1;
                typedArray = obtainStyledAttributes;
                i3 = 4;
                new cb4(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(R.dimen.fastscroll_margin));
            } else {
                vs.m("Trying to set fast scroller without both required drawables.".concat(w()));
                throw null;
            }
        } else {
            c = 3;
            c2 = 2;
            r19 = 1;
            typedArray = obtainStyledAttributes;
            i3 = 4;
        }
        typedArray.recycle();
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    trim = context.getPackageName() + trim;
                } else if (!trim.contains(".")) {
                    trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                }
                String str = trim;
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class asSubclass = Class.forName(str, false, classLoader).asSubclass(el9.class);
                    try {
                        constructor = asSubclass.getConstructor(W0);
                        objArr = new Object[i3];
                        objArr[0] = context;
                        objArr[r19] = attributeSet;
                        objArr[c2] = Integer.valueOf(i);
                        objArr[c] = 0;
                    } catch (NoSuchMethodException e) {
                        try {
                            constructor = asSubclass.getConstructor(null);
                            objArr = null;
                        } catch (NoSuchMethodException e2) {
                            e2.initCause(e);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e2);
                        }
                    }
                    constructor.setAccessible(r19);
                    setLayoutManager((el9) constructor.newInstance(objArr));
                } catch (ClassCastException e3) {
                    cp8.l(attributeSet.getPositionDescription(), ": Class is not a LayoutManager ", str, e3);
                    throw null;
                } catch (ClassNotFoundException e4) {
                    cp8.l(attributeSet.getPositionDescription(), ": Unable to find LayoutManager ", str, e4);
                    throw null;
                } catch (IllegalAccessException e5) {
                    cp8.l(attributeSet.getPositionDescription(), ": Cannot access non-public constructor ", str, e5);
                    throw null;
                } catch (InstantiationException e6) {
                    cp8.l(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e6);
                    throw null;
                } catch (InvocationTargetException e7) {
                    cp8.l(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e7);
                    throw null;
                }
            }
        }
        int[] iArr2 = S0;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        rcd.b(this, context, iArr2, attributeSet, obtainStyledAttributes2, i);
        boolean z2 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
        setTag(R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    public static RecyclerView B(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView B = B(viewGroup.getChildAt(i));
            if (B != null) {
                return B;
            }
        }
        return null;
    }

    public static rl9 F(View view) {
        if (view == null) {
            return null;
        }
        return ((fl9) view.getLayoutParams()).a;
    }

    public static void g(rl9 rl9Var) {
        WeakReference weakReference = rl9Var.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view != rl9Var.a) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        view = null;
                    }
                } else {
                    return;
                }
            }
            rl9Var.b = null;
        }
    }

    private f18 getScrollingChildHelper() {
        if (this.I0 == null) {
            this.I0 = new f18(this);
        }
        return this.I0;
    }

    public static int j(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && sve.n(edgeEffect) != nae.e) {
            int round = Math.round(sve.t(edgeEffect, ((-i) * 4.0f) / i2, 0.5f) * ((-i2) / 4.0f));
            if (round != i) {
                edgeEffect.finish();
            }
            return i - round;
        } else if (i < 0 && edgeEffect2 != null && sve.n(edgeEffect2) != nae.e) {
            float f = i2;
            int round2 = Math.round(sve.t(edgeEffect2, (i * 4.0f) / f, 0.5f) * (f / 4.0f));
            if (round2 != i) {
                edgeEffect2.finish();
            }
            return i - round2;
        } else {
            return i;
        }
    }

    public final void A(int[] iArr) {
        ij1 ij1Var = this.f;
        int y = ij1Var.y();
        if (y == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < y; i3++) {
            rl9 F = F(ij1Var.x(i3));
            if (!F.n()) {
                int b = F.b();
                if (b < i) {
                    i = b;
                }
                if (b > i2) {
                    i2 = b;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public final rl9 C(int i) {
        rl9 rl9Var = null;
        if (this.W) {
            return null;
        }
        ij1 ij1Var = this.f;
        int I = ij1Var.I();
        for (int i2 = 0; i2 < I; i2++) {
            rl9 F = F(ij1Var.H(i2));
            if (F != null && !F.g() && D(F) == i) {
                if (((ArrayList) ij1Var.d).contains(F.a)) {
                    rl9Var = F;
                } else {
                    return F;
                }
            }
        }
        return rl9Var;
    }

    public final int D(rl9 rl9Var) {
        if ((rl9Var.i & 524) == 0 && rl9Var.d()) {
            int i = rl9Var.c;
            ArrayList arrayList = (ArrayList) this.e.f;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                i7 i7Var = (i7) arrayList.get(i2);
                int i3 = i7Var.a;
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 8) {
                            int i4 = i7Var.b;
                            if (i4 == i) {
                                i = i7Var.c;
                            } else {
                                if (i4 < i) {
                                    i--;
                                }
                                if (i7Var.c <= i) {
                                    i++;
                                }
                            }
                        }
                    } else {
                        int i5 = i7Var.b;
                        if (i5 <= i) {
                            int i6 = i7Var.c;
                            if (i5 + i6 <= i) {
                                i -= i6;
                            }
                        } else {
                            continue;
                        }
                    }
                } else if (i7Var.b <= i) {
                    i += i7Var.c;
                }
            }
            return i;
        }
        return -1;
    }

    public final rl9 E(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            vm1.g("View ", view, " is not a direct child of ", this);
            return null;
        }
        return F(view);
    }

    public final Rect G(View view) {
        fl9 fl9Var = (fl9) view.getLayoutParams();
        boolean z = fl9Var.c;
        Rect rect = fl9Var.b;
        if (!z || (this.z0.f && (fl9Var.a.j() || fl9Var.a.e()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.K;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.E;
            rect2.set(0, 0, 0, 0);
            ((cb4) arrayList.get(i)).getClass();
            ((fl9) view.getLayoutParams()).a.getClass();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        fl9Var.c = false;
        return rect;
    }

    public final boolean H() {
        if (this.P && !this.W && ((ArrayList) this.e.f).size() <= 0) {
            return false;
        }
        return true;
    }

    public final boolean I() {
        if (this.b0 > 0) {
            return true;
        }
        return false;
    }

    public final void J() {
        ij1 ij1Var = this.f;
        int I = ij1Var.I();
        for (int i = 0; i < I; i++) {
            ((fl9) ij1Var.H(i).getLayoutParams()).c = true;
        }
        ArrayList arrayList = (ArrayList) this.c.e;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            fl9 fl9Var = (fl9) ((rl9) arrayList.get(i2)).a.getLayoutParams();
            if (fl9Var != null) {
                fl9Var.c = true;
            }
        }
    }

    public final void K(int i, int i2, boolean z) {
        int i3 = i + i2;
        ij1 ij1Var = this.f;
        int I = ij1Var.I();
        for (int i4 = 0; i4 < I; i4++) {
            rl9 F = F(ij1Var.H(i4));
            if (F != null && !F.n()) {
                int i5 = F.c;
                nl9 nl9Var = this.z0;
                if (i5 >= i3) {
                    F.k(-i2, z);
                    nl9Var.e = true;
                } else if (i5 >= i) {
                    F.a(8);
                    F.k(-i2, z);
                    F.c = i - 1;
                    nl9Var.e = true;
                }
            }
        }
        kl9 kl9Var = this.c;
        ArrayList arrayList = (ArrayList) kl9Var.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            rl9 rl9Var = (rl9) arrayList.get(size);
            if (rl9Var != null) {
                int i6 = rl9Var.c;
                if (i6 >= i3) {
                    rl9Var.k(-i2, z);
                } else if (i6 >= i) {
                    rl9Var.a(8);
                    kl9Var.j(size);
                }
            }
        }
        requestLayout();
    }

    public final void L() {
        this.b0++;
    }

    public final void M(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.b0 - 1;
        this.b0 = i2;
        if (i2 < 1) {
            this.b0 = 0;
            if (z) {
                int i3 = this.U;
                this.U = 0;
                if (i3 != 0 && (accessibilityManager = this.V) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.M0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    rl9 rl9Var = (rl9) arrayList.get(size);
                    if (rl9Var.a.getParent() == this && !rl9Var.n() && (i = rl9Var.p) != -1) {
                        View view = rl9Var.a;
                        Field field = rcd.a;
                        view.setImportantForAccessibility(i);
                        rl9Var.p = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void N(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.k0) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.k0 = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.o0 = x;
            this.m0 = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.p0 = y;
            this.n0 = y;
        }
    }

    public final void O() {
        if (!this.F0 && this.N) {
            Field field = rcd.a;
            postOnAnimation(this.N0);
            this.F0 = true;
        }
    }

    public final void P(rl9 rl9Var, vf9 vf9Var) {
        rl9Var.i &= -8193;
        boolean z = this.z0.g;
        hvc hvcVar = this.C;
        if (z && rl9Var.j() && !rl9Var.g() && !rl9Var.n()) {
            this.H.getClass();
            ((my6) hvcVar.c).d(rl9Var, rl9Var.c);
        }
        jla jlaVar = (jla) hvcVar.b;
        ycd ycdVar = (ycd) jlaVar.get(rl9Var);
        if (ycdVar == null) {
            ycdVar = ycd.a();
            jlaVar.put(rl9Var, ycdVar);
        }
        ycdVar.b = vf9Var;
        ycdVar.a |= 4;
    }

    public final int Q(int i, float f) {
        float height = f / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.e0;
        float f2 = nae.e;
        if (edgeEffect != null && sve.n(edgeEffect) != nae.e) {
            boolean canScrollHorizontally = canScrollHorizontally(-1);
            EdgeEffect edgeEffect2 = this.e0;
            if (canScrollHorizontally) {
                edgeEffect2.onRelease();
            } else {
                float f3 = -sve.t(edgeEffect2, -width, 1.0f - height);
                if (sve.n(this.e0) == nae.e) {
                    this.e0.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect3 = this.g0;
            if (edgeEffect3 != null && sve.n(edgeEffect3) != nae.e) {
                boolean canScrollHorizontally2 = canScrollHorizontally(1);
                EdgeEffect edgeEffect4 = this.g0;
                if (canScrollHorizontally2) {
                    edgeEffect4.onRelease();
                } else {
                    float t = sve.t(edgeEffect4, width, height);
                    if (sve.n(this.g0) == nae.e) {
                        this.g0.onRelease();
                    }
                    f2 = t;
                }
                invalidate();
            }
        }
        return Math.round(f2 * getWidth());
    }

    public final int R(int i, float f) {
        float width = f / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.f0;
        float f2 = nae.e;
        if (edgeEffect != null && sve.n(edgeEffect) != nae.e) {
            boolean canScrollVertically = canScrollVertically(-1);
            EdgeEffect edgeEffect2 = this.f0;
            if (canScrollVertically) {
                edgeEffect2.onRelease();
            } else {
                float f3 = -sve.t(edgeEffect2, -height, width);
                if (sve.n(this.f0) == nae.e) {
                    this.f0.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect3 = this.h0;
            if (edgeEffect3 != null && sve.n(edgeEffect3) != nae.e) {
                boolean canScrollVertically2 = canScrollVertically(1);
                EdgeEffect edgeEffect4 = this.h0;
                if (canScrollVertically2) {
                    edgeEffect4.onRelease();
                } else {
                    float t = sve.t(edgeEffect4, height, 1.0f - width);
                    if (sve.n(this.h0) == nae.e) {
                        this.h0.onRelease();
                    }
                    f2 = t;
                }
                invalidate();
            }
        }
        return Math.round(f2 * getHeight());
    }

    public final void S(View view, View view2) {
        View view3;
        boolean z;
        if (view2 != null) {
            view3 = view2;
        } else {
            view3 = view;
        }
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.E;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof fl9) {
            fl9 fl9Var = (fl9) layoutParams;
            if (!fl9Var.c) {
                Rect rect2 = fl9Var.b;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        el9 el9Var = this.I;
        boolean z2 = !this.P;
        if (view2 == null) {
            z = true;
        } else {
            z = false;
        }
        el9Var.j0(this, view, this.E, z2, z);
    }

    public final void T() {
        VelocityTracker velocityTracker = this.l0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z = false;
        a0(0);
        EdgeEffect edgeEffect = this.e0;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.e0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.f0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.g0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.g0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.h0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.h0.isFinished();
        }
        if (z) {
            Field field = rcd.a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean U(int r18, int r19, android.view.MotionEvent r20, int r21) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.U(int, int, android.view.MotionEvent, int):boolean");
    }

    public final void V(int[] iArr, int i, int i2) {
        int i3;
        int i4;
        rl9 rl9Var;
        Y();
        L();
        int i5 = sic.a;
        Trace.beginSection("RV Scroll");
        nl9 nl9Var = this.z0;
        x(nl9Var);
        kl9 kl9Var = this.c;
        if (i != 0) {
            i3 = this.I.l0(i, kl9Var, nl9Var);
        } else {
            i3 = 0;
        }
        if (i2 != 0) {
            i4 = this.I.m0(i2, kl9Var, nl9Var);
        } else {
            i4 = 0;
        }
        Trace.endSection();
        ij1 ij1Var = this.f;
        int y = ij1Var.y();
        for (int i6 = 0; i6 < y; i6++) {
            View x = ij1Var.x(i6);
            rl9 E = E(x);
            if (E != null && (rl9Var = E.h) != null) {
                View view = rl9Var.a;
                int left = x.getLeft();
                int top = x.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        M(true);
        Z(false);
        if (iArr != null) {
            iArr[0] = i3;
            iArr[1] = i4;
        }
    }

    public final boolean W(EdgeEffect edgeEffect, int i, int i2) {
        if (i <= 0) {
            float f = this.a * 0.015f;
            double log = Math.log((Math.abs(-i) * 0.35f) / f);
            double d = T0;
            if (((float) (Math.exp((d / (d - 1.0d)) * log) * f)) < sve.n(edgeEffect) * i2) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void X(int i, int i2, boolean z) {
        int i3;
        int i4;
        boolean z2;
        int height;
        int i5;
        el9 el9Var = this.I;
        if (el9Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.S) {
            if (!el9Var.c()) {
                i3 = 0;
            } else {
                i3 = i;
            }
            if (!this.I.d()) {
                i4 = 0;
            } else {
                i4 = i2;
            }
            if (i3 == 0 && i4 == 0) {
                return;
            }
            if (z) {
                if (i3 != 0) {
                    i5 = 1;
                } else {
                    i5 = 0;
                }
                if (i4 != 0) {
                    i5 |= 2;
                }
                getScrollingChildHelper().g(i5, 1);
            }
            ql9 ql9Var = this.w0;
            RecyclerView recyclerView = ql9Var.C;
            int abs = Math.abs(i3);
            int abs2 = Math.abs(i4);
            if (abs > abs2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                height = recyclerView.getWidth();
            } else {
                height = recyclerView.getHeight();
            }
            if (!z2) {
                abs = abs2;
            }
            int min = Math.min((int) (((abs / height) + 1.0f) * 300.0f), 2000);
            Interpolator interpolator = ql9Var.d;
            wk9 wk9Var = X0;
            if (interpolator != wk9Var) {
                ql9Var.d = wk9Var;
                ql9Var.c = new OverScroller(recyclerView.getContext(), wk9Var);
            }
            ql9Var.b = 0;
            ql9Var.a = 0;
            recyclerView.setScrollState(2);
            ql9Var.c.startScroll(0, 0, i3, i4, min);
            if (ql9Var.e) {
                ql9Var.f = true;
                return;
            }
            RecyclerView recyclerView2 = ql9Var.C;
            recyclerView2.removeCallbacks(ql9Var);
            Field field = rcd.a;
            recyclerView2.postOnAnimation(ql9Var);
        }
    }

    public final void Y() {
        int i = this.Q + 1;
        this.Q = i;
        if (i == 1 && !this.S) {
            this.R = false;
        }
    }

    public final void Z(boolean z) {
        if (this.Q < 1) {
            this.Q = 1;
        }
        if (!z && !this.S) {
            this.R = false;
        }
        if (this.Q == 1) {
            if (z && this.R && !this.S && this.I != null && this.H != null) {
                m();
            }
            if (!this.S) {
                this.R = false;
            }
        }
        this.Q--;
    }

    public final void a0(int i) {
        getScrollingChildHelper().h(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        el9 el9Var = this.I;
        if (el9Var != null) {
            el9Var.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof fl9) && this.I.e((fl9) layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        el9 el9Var = this.I;
        if (el9Var != null && el9Var.c()) {
            return this.I.i(this.z0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        el9 el9Var = this.I;
        if (el9Var != null && el9Var.c()) {
            return this.I.j(this.z0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        el9 el9Var = this.I;
        if (el9Var != null && el9Var.c()) {
            return this.I.k(this.z0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        el9 el9Var = this.I;
        if (el9Var != null && el9Var.d()) {
            return this.I.l(this.z0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        el9 el9Var = this.I;
        if (el9Var != null && el9Var.d()) {
            return this.I.m(this.z0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        el9 el9Var = this.I;
        if (el9Var != null && el9Var.d()) {
            return this.I.n(this.z0);
        }
        return 0;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().d(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        boolean z4;
        int i2;
        int i3;
        super.draw(canvas);
        ArrayList arrayList = this.K;
        int size = arrayList.size();
        boolean z5 = false;
        int i4 = 0;
        while (true) {
            z = true;
            if (i4 >= size) {
                break;
            }
            cb4 cb4Var = (cb4) arrayList.get(i4);
            if (cb4Var.q == cb4Var.s.getWidth() && cb4Var.r == cb4Var.s.getHeight()) {
                if (cb4Var.A != 0) {
                    if (cb4Var.t) {
                        int i5 = cb4Var.q;
                        int i6 = cb4Var.e;
                        int i7 = i5 - i6;
                        int i8 = cb4Var.l;
                        int i9 = cb4Var.k;
                        int i10 = i8 - (i9 / 2);
                        StateListDrawable stateListDrawable = cb4Var.c;
                        stateListDrawable.setBounds(0, 0, i6, i9);
                        Drawable drawable = cb4Var.d;
                        drawable.setBounds(0, 0, cb4Var.f, cb4Var.r);
                        RecyclerView recyclerView = cb4Var.s;
                        Field field = rcd.a;
                        if (recyclerView.getLayoutDirection() == 1) {
                            drawable.draw(canvas);
                            canvas.translate(i6, i10);
                            canvas.scale(-1.0f, 1.0f);
                            stateListDrawable.draw(canvas);
                            canvas.scale(-1.0f, 1.0f);
                            canvas.translate(-i6, -i10);
                        } else {
                            canvas.translate(i7, nae.e);
                            drawable.draw(canvas);
                            canvas.translate(nae.e, i10);
                            stateListDrawable.draw(canvas);
                            canvas.translate(-i7, -i10);
                        }
                    }
                    if (cb4Var.u) {
                        int i11 = cb4Var.r;
                        int i12 = cb4Var.i;
                        int i13 = i11 - i12;
                        int i14 = cb4Var.o;
                        int i15 = cb4Var.n;
                        StateListDrawable stateListDrawable2 = cb4Var.g;
                        stateListDrawable2.setBounds(0, 0, i15, i12);
                        Drawable drawable2 = cb4Var.h;
                        drawable2.setBounds(0, 0, cb4Var.q, cb4Var.j);
                        canvas.translate(nae.e, i13);
                        drawable2.draw(canvas);
                        canvas.translate(i14 - (i15 / 2), nae.e);
                        stateListDrawable2.draw(canvas);
                        canvas.translate(-i3, -i13);
                    }
                }
            } else {
                cb4Var.q = cb4Var.s.getWidth();
                cb4Var.r = cb4Var.s.getHeight();
                cb4Var.d(0);
            }
            i4++;
        }
        EdgeEffect edgeEffect = this.e0;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            int save = canvas.save();
            if (this.D) {
                i2 = getPaddingBottom();
            } else {
                i2 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + i2, nae.e);
            EdgeEffect edgeEffect2 = this.e0;
            if (edgeEffect2 != null && edgeEffect2.draw(canvas)) {
                z2 = true;
            } else {
                z2 = false;
            }
            canvas.restoreToCount(save);
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect3 = this.f0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.D) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f0;
            if (edgeEffect4 != null && edgeEffect4.draw(canvas)) {
                z4 = true;
            } else {
                z4 = false;
            }
            z2 |= z4;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.g0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.D) {
                i = getPaddingTop();
            } else {
                i = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate(i, -width);
            EdgeEffect edgeEffect6 = this.g0;
            if (edgeEffect6 != null && edgeEffect6.draw(canvas)) {
                z3 = true;
            } else {
                z3 = false;
            }
            z2 |= z3;
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.h0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.D) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.h0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z5 = true;
            }
            z2 |= z5;
            canvas.restoreToCount(save4);
        }
        if (z2 || this.i0 == null || arrayList.size() <= 0 || !this.i0.f()) {
            z = z2;
        }
        if (z) {
            Field field2 = rcd.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final void e(rl9 rl9Var) {
        boolean z;
        View view = rl9Var.a;
        if (view.getParent() == this) {
            z = true;
        } else {
            z = false;
        }
        this.c.o(E(view));
        boolean i = rl9Var.i();
        ij1 ij1Var = this.f;
        if (i) {
            ij1Var.k(view, -1, view.getLayoutParams(), true);
        } else if (!z) {
            ij1Var.c(view, -1, true);
        } else {
            int indexOfChild = ((RecyclerView) ((g99) ij1Var.b).b).indexOfChild(view);
            if (indexOfChild >= 0) {
                ((zg1) ij1Var.c).K(indexOfChild);
                ij1Var.M(view);
                return;
            }
            cp8.s(view, "view is not a child, cannot hide ");
        }
    }

    public final void f(String str) {
        if (I()) {
            if (str == null) {
                vs.k("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(w()));
            } else {
                vs.k(str);
            }
        } else if (this.c0 > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(w()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0162, code lost:
        if (r16 > 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0180, code lost:
        if (r5 > 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0183, code lost:
        if (r16 < 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0186, code lost:
        if (r5 < 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x018e, code lost:
        if ((r5 * r6) <= 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0196, code lost:
        if ((r5 * r6) >= 0) goto L116;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0110  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View focusSearch(android.view.View r18, int r19) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        el9 el9Var = this.I;
        if (el9Var != null) {
            return el9Var.q();
        }
        vs.k("RecyclerView has no LayoutManager".concat(w()));
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        el9 el9Var = this.I;
        if (el9Var != null) {
            return el9Var.r(getContext(), attributeSet);
        }
        vs.k("RecyclerView has no LayoutManager".concat(w()));
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public yk9 getAdapter() {
        return this.H;
    }

    @Override // android.view.View
    public int getBaseline() {
        el9 el9Var = this.I;
        if (el9Var != null) {
            el9Var.getClass();
            return -1;
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.D;
    }

    public tl9 getCompatAccessibilityDelegate() {
        return this.G0;
    }

    public bl9 getEdgeEffectFactory() {
        return this.d0;
    }

    public cl9 getItemAnimator() {
        return this.i0;
    }

    public int getItemDecorationCount() {
        return this.K.size();
    }

    public el9 getLayoutManager() {
        return this.I;
    }

    public int getMaxFlingVelocity() {
        return this.s0;
    }

    public int getMinFlingVelocity() {
        return this.r0;
    }

    public long getNanoTime() {
        if (V0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public gl9 getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.v0;
    }

    public jl9 getRecycledViewPool() {
        return this.c.c();
    }

    public int getScrollState() {
        return this.j0;
    }

    public final void h() {
        ij1 ij1Var = this.f;
        int I = ij1Var.I();
        for (int i = 0; i < I; i++) {
            rl9 F = F(ij1Var.H(i));
            if (!F.n()) {
                F.d = -1;
                F.f = -1;
            }
        }
        kl9 kl9Var = this.c;
        ArrayList arrayList = (ArrayList) kl9Var.c;
        ArrayList arrayList2 = (ArrayList) kl9Var.e;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            rl9 rl9Var = (rl9) arrayList2.get(i2);
            rl9Var.d = -1;
            rl9Var.f = -1;
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            rl9 rl9Var2 = (rl9) arrayList.get(i3);
            rl9Var2.d = -1;
            rl9Var2.f = -1;
        }
        ArrayList arrayList3 = (ArrayList) kl9Var.d;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                rl9 rl9Var3 = (rl9) ((ArrayList) kl9Var.d).get(i4);
                rl9Var3.d = -1;
                rl9Var3.f = -1;
            }
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.e0;
        if (edgeEffect != null && !edgeEffect.isFinished() && i > 0) {
            this.e0.onRelease();
            z = this.e0.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.g0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.g0.onRelease();
            z |= this.g0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f0.onRelease();
            z |= this.f0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.h0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.h0.onRelease();
            z |= this.h0.isFinished();
        }
        if (z) {
            Field field = rcd.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.N;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.S;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public final void k() {
        if (this.P && !this.W) {
            bm1 bm1Var = this.e;
            if (((ArrayList) bm1Var.f).size() > 0) {
                bm1Var.getClass();
                if (((ArrayList) bm1Var.f).size() > 0) {
                    int i = sic.a;
                    Trace.beginSection("RV FullInvalidate");
                    m();
                    Trace.endSection();
                    return;
                }
                return;
            }
            return;
        }
        int i2 = sic.a;
        Trace.beginSection("RV FullInvalidate");
        m();
        Trace.endSection();
    }

    public final void l(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        Field field = rcd.a;
        setMeasuredDimension(el9.f(i, paddingRight, getMinimumWidth()), el9.f(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:155:0x0342, code lost:
        if (((java.util.ArrayList) r7.d).contains(getFocusedChild()) == false) goto L191;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0276  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m() {
        /*
            Method dump skipped, instructions count: 950
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:248:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x023f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:381:0x03e9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:384:0x03cc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n() {
        /*
            Method dump skipped, instructions count: 1368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.n():void");
    }

    public final void o() {
        boolean z;
        Y();
        L();
        nl9 nl9Var = this.z0;
        nl9Var.a(6);
        this.e.r();
        nl9Var.d = this.H.a();
        nl9Var.b = 0;
        if (this.d != null) {
            yk9 yk9Var = this.H;
            int C = a82.C(yk9Var.b);
            if (C == 1 ? yk9Var.a() > 0 : C != 2) {
                Parcelable parcelable = this.d.c;
                if (parcelable != null) {
                    this.I.c0(parcelable);
                }
                this.d = null;
            }
        }
        nl9Var.f = false;
        this.I.a0(this.c, nl9Var);
        nl9Var.e = false;
        if (nl9Var.i && this.i0 != null) {
            z = true;
        } else {
            z = false;
        }
        nl9Var.i = z;
        nl9Var.c = 4;
        M(true);
        Z(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
        if (r1 >= 30.0f) goto L18;
     */
    /* JADX WARN: Type inference failed for: r1v3, types: [yv4, java.lang.Object] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.b0 = r0
            r1 = 1
            r5.N = r1
            boolean r2 = r5.P
            if (r2 == 0) goto L15
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = r1
            goto L16
        L15:
            r2 = r0
        L16:
            r5.P = r2
            kl9 r2 = r5.c
            r2.f()
            el9 r2 = r5.I
            if (r2 == 0) goto L26
            r2.f = r1
            r2.O(r5)
        L26:
            r5.F0 = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.V0
            if (r0 == 0) goto L7b
            java.lang.ThreadLocal r0 = defpackage.yv4.e
            java.lang.Object r1 = r0.get()
            yv4 r1 = (defpackage.yv4) r1
            r5.x0 = r1
            if (r1 != 0) goto L74
            yv4 r1 = new yv4
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.a = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.d = r2
            r5.x0 = r1
            java.lang.reflect.Field r1 = defpackage.rcd.a
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L66
            if (r1 == 0) goto L66
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L66
            goto L68
        L66:
            r1 = 1114636288(0x42700000, float:60.0)
        L68:
            yv4 r2 = r5.x0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.c = r3
            r0.set(r2)
        L74:
            yv4 r0 = r5.x0
            java.util.ArrayList r0 = r0.a
            r0.add(r5)
        L7b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        yv4 yv4Var;
        super.onDetachedFromWindow();
        cl9 cl9Var = this.i0;
        if (cl9Var != null) {
            cl9Var.e();
        }
        int i = 0;
        setScrollState(0);
        ql9 ql9Var = this.w0;
        ql9Var.C.removeCallbacks(ql9Var);
        ql9Var.c.abortAnimation();
        this.N = false;
        el9 el9Var = this.I;
        if (el9Var != null) {
            el9Var.f = false;
            el9Var.P(this);
        }
        this.M0.clear();
        removeCallbacks(this.N0);
        this.C.getClass();
        do {
        } while (ycd.d.a() != null);
        kl9 kl9Var = this.c;
        ArrayList arrayList = (ArrayList) kl9Var.e;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            c16.k(((rl9) arrayList.get(i2)).a);
        }
        kl9Var.g(((RecyclerView) kl9Var.h).H, false);
        while (i < getChildCount()) {
            int i3 = i + 1;
            View childAt = getChildAt(i);
            if (childAt != null) {
                ArrayList arrayList2 = c16.o(childAt).a;
                for (int x = tl1.x(arrayList2); -1 < x; x--) {
                    ((scd) arrayList2.get(x)).a.e();
                }
                i = i3;
            } else {
                xk5.r();
                return;
            }
        }
        if (V0 && (yv4Var = this.x0) != null) {
            yv4Var.a.remove(this);
            this.x0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.K;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((cb4) arrayList.get(i)).getClass();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (!this.S) {
            this.M = null;
            if (z(motionEvent)) {
                T();
                setScrollState(0);
                return true;
            }
            el9 el9Var = this.I;
            if (el9Var != null) {
                boolean c = el9Var.c();
                boolean d = this.I.d();
                if (this.l0 == null) {
                    this.l0 = VelocityTracker.obtain();
                }
                this.l0.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked != 0) {
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked != 3) {
                                if (actionMasked != 5) {
                                    if (actionMasked == 6) {
                                        N(motionEvent);
                                    }
                                } else {
                                    this.k0 = motionEvent.getPointerId(actionIndex);
                                    int x = (int) (motionEvent.getX(actionIndex) + 0.5f);
                                    this.o0 = x;
                                    this.m0 = x;
                                    int y = (int) (motionEvent.getY(actionIndex) + 0.5f);
                                    this.p0 = y;
                                    this.n0 = y;
                                }
                            } else {
                                T();
                                setScrollState(0);
                            }
                        } else {
                            int findPointerIndex = motionEvent.findPointerIndex(this.k0);
                            if (findPointerIndex < 0) {
                                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.k0 + " not found. Did any MotionEvents get skipped?");
                                return false;
                            }
                            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                            if (this.j0 != 1) {
                                int i = x2 - this.m0;
                                int i2 = y2 - this.n0;
                                if (c && Math.abs(i) > this.q0) {
                                    this.o0 = x2;
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (d && Math.abs(i2) > this.q0) {
                                    this.p0 = y2;
                                    z2 = true;
                                }
                                if (z2) {
                                    setScrollState(1);
                                }
                            }
                        }
                    } else {
                        this.l0.clear();
                        a0(0);
                    }
                } else {
                    if (this.T) {
                        this.T = false;
                    }
                    this.k0 = motionEvent.getPointerId(0);
                    int x3 = (int) (motionEvent.getX() + 0.5f);
                    this.o0 = x3;
                    this.m0 = x3;
                    int y3 = (int) (motionEvent.getY() + 0.5f);
                    this.p0 = y3;
                    this.n0 = y3;
                    EdgeEffect edgeEffect = this.e0;
                    if (edgeEffect != null && sve.n(edgeEffect) != nae.e && !canScrollHorizontally(-1)) {
                        sve.t(this.e0, nae.e, 1.0f - (motionEvent.getY() / getHeight()));
                        z = true;
                    } else {
                        z = false;
                    }
                    EdgeEffect edgeEffect2 = this.g0;
                    boolean z3 = z;
                    if (edgeEffect2 != null) {
                        z3 = z;
                        if (sve.n(edgeEffect2) != nae.e) {
                            z3 = z;
                            if (!canScrollHorizontally(1)) {
                                sve.t(this.g0, nae.e, motionEvent.getY() / getHeight());
                                z3 = true;
                            }
                        }
                    }
                    EdgeEffect edgeEffect3 = this.f0;
                    boolean z4 = z3;
                    if (edgeEffect3 != null) {
                        z4 = z3;
                        if (sve.n(edgeEffect3) != nae.e) {
                            z4 = z3;
                            if (!canScrollVertically(-1)) {
                                sve.t(this.f0, nae.e, motionEvent.getX() / getWidth());
                                z4 = true;
                            }
                        }
                    }
                    EdgeEffect edgeEffect4 = this.h0;
                    boolean z5 = z4;
                    if (edgeEffect4 != null) {
                        z5 = z4;
                        if (sve.n(edgeEffect4) != nae.e) {
                            z5 = z4;
                            if (!canScrollVertically(1)) {
                                sve.t(this.h0, nae.e, 1.0f - (motionEvent.getX() / getWidth()));
                                z5 = true;
                            }
                        }
                    }
                    if (z5 || this.j0 == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        a0(1);
                    }
                    int[] iArr = this.K0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i3 = c;
                    if (d) {
                        i3 = (c ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i3, 0);
                }
                if (this.j0 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = sic.a;
        Trace.beginSection("RV OnLayout");
        m();
        Trace.endSection();
        this.P = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        el9 el9Var = this.I;
        if (el9Var == null) {
            l(i, i2);
            return;
        }
        boolean I = el9Var.I();
        boolean z = false;
        nl9 nl9Var = this.z0;
        if (I) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.I.b.l(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.O0 = z;
            if (!z && this.H != null) {
                if (nl9Var.c == 1) {
                    n();
                }
                this.I.o0(i, i2);
                nl9Var.h = true;
                o();
                this.I.q0(i, i2);
                if (this.I.t0()) {
                    this.I.o0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    nl9Var.h = true;
                    o();
                    this.I.q0(i, i2);
                }
                this.P0 = getMeasuredWidth();
                this.Q0 = getMeasuredHeight();
            }
        } else if (this.O) {
            this.I.b.l(i, i2);
        } else if (nl9Var.j) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        } else {
            yk9 yk9Var = this.H;
            if (yk9Var != null) {
                nl9Var.d = yk9Var.a();
            } else {
                nl9Var.d = 0;
            }
            Y();
            this.I.b.l(i, i2);
            Z(false);
            nl9Var.f = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (I()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ml9)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ml9 ml9Var = (ml9) parcelable;
        this.d = ml9Var;
        super.onRestoreInstanceState(ml9Var.a);
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, ml9, a0] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? a0Var = new a0(super.onSaveInstanceState());
        ml9 ml9Var = this.d;
        if (ml9Var != null) {
            a0Var.c = ml9Var.c;
            return a0Var;
        }
        el9 el9Var = this.I;
        if (el9Var != null) {
            a0Var.c = el9Var.d0();
            return a0Var;
        }
        a0Var.c = null;
        return a0Var;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.h0 = null;
        this.f0 = null;
        this.g0 = null;
        this.e0 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:206:0x03a3, code lost:
        if (r2 == 0) goto L97;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0387 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x039f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 1041
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean p(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, i3, iArr, iArr2);
    }

    public final void q(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().d(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final void r(int i, int i2) {
        this.c0++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        hl9 hl9Var = this.A0;
        if (hl9Var != null) {
            hl9Var.a(this);
        }
        ArrayList arrayList = this.B0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((hl9) this.B0.get(size)).a(this);
            }
        }
        this.c0--;
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        rl9 F = F(view);
        if (F != null) {
            if (F.i()) {
                F.i &= -257;
            } else if (!F.n()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(F);
                vs.l(sb, w());
                return;
            }
        }
        view.clearAnimation();
        F(view);
        yk9 yk9Var = this.H;
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        this.I.getClass();
        if (!I() && view2 != null) {
            S(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.I.j0(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.L;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((cb4) arrayList.get(i)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.Q == 0 && !this.S) {
            super.requestLayout();
        } else {
            this.R = true;
        }
    }

    public final void s() {
        if (this.h0 != null) {
            return;
        }
        ((ol9) this.d0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.h0 = edgeEffect;
        if (this.D) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        el9 el9Var = this.I;
        if (el9Var == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.S) {
            boolean c = el9Var.c();
            boolean d = this.I.d();
            if (!c && !d) {
                return;
            }
            if (!c) {
                i = 0;
            }
            if (!d) {
                i2 = 0;
            }
            U(i, i2, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i;
        if (I()) {
            int i2 = 0;
            if (accessibilityEvent != null) {
                i = accessibilityEvent.getContentChangeTypes();
            } else {
                i = 0;
            }
            if (i != 0) {
                i2 = i;
            }
            this.U |= i2;
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(tl9 tl9Var) {
        this.G0 = tl9Var;
        rcd.c(this, tl9Var);
    }

    public void setAdapter(yk9 yk9Var) {
        setLayoutFrozen(false);
        yk9 yk9Var2 = this.H;
        v28 v28Var = this.b;
        if (yk9Var2 != null) {
            yk9Var2.a.unregisterObserver(v28Var);
            this.H.getClass();
        }
        cl9 cl9Var = this.i0;
        if (cl9Var != null) {
            cl9Var.e();
        }
        el9 el9Var = this.I;
        kl9 kl9Var = this.c;
        if (el9Var != null) {
            el9Var.f0(kl9Var);
            this.I.g0(kl9Var);
        }
        ((ArrayList) kl9Var.c).clear();
        kl9Var.i();
        bm1 bm1Var = this.e;
        bm1Var.X((ArrayList) bm1Var.f);
        bm1Var.X((ArrayList) bm1Var.c);
        yk9 yk9Var3 = this.H;
        this.H = yk9Var;
        if (yk9Var != null) {
            yk9Var.a.registerObserver(v28Var);
        }
        el9 el9Var2 = this.I;
        if (el9Var2 != null) {
            el9Var2.N();
        }
        yk9 yk9Var4 = this.H;
        ((ArrayList) kl9Var.c).clear();
        kl9Var.i();
        kl9Var.g(yk9Var3, true);
        jl9 c = kl9Var.c();
        if (yk9Var3 != null) {
            c.b--;
        }
        if (c.b == 0) {
            SparseArray sparseArray = c.a;
            for (int i = 0; i < sparseArray.size(); i++) {
                il9 il9Var = (il9) sparseArray.valueAt(i);
                ArrayList arrayList = il9Var.a;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    c16.k(((rl9) obj).a);
                }
                il9Var.a.clear();
            }
        }
        if (yk9Var4 != null) {
            c.b++;
        }
        kl9Var.f();
        this.z0.e = true;
        this.a0 = this.a0;
        this.W = true;
        ij1 ij1Var = this.f;
        int I = ij1Var.I();
        for (int i3 = 0; i3 < I; i3++) {
            rl9 F = F(ij1Var.H(i3));
            if (F != null && !F.n()) {
                F.a(6);
            }
        }
        J();
        ArrayList arrayList2 = (ArrayList) kl9Var.e;
        int size2 = arrayList2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            rl9 rl9Var = (rl9) arrayList2.get(i4);
            if (rl9Var != null) {
                rl9Var.a(6);
                rl9Var.a(1024);
            }
        }
        kl9Var.i();
        requestLayout();
    }

    public void setChildDrawingOrderCallback(al9 al9Var) {
        if (al9Var == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.D) {
            this.h0 = null;
            this.f0 = null;
            this.g0 = null;
            this.e0 = null;
        }
        this.D = z;
        super.setClipToPadding(z);
        if (this.P) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(bl9 bl9Var) {
        bl9Var.getClass();
        this.d0 = bl9Var;
        this.h0 = null;
        this.f0 = null;
        this.g0 = null;
        this.e0 = null;
    }

    public void setHasFixedSize(boolean z) {
        this.O = z;
    }

    public void setItemAnimator(cl9 cl9Var) {
        cl9 cl9Var2 = this.i0;
        if (cl9Var2 != null) {
            cl9Var2.e();
            this.i0.a = null;
        }
        this.i0 = cl9Var;
        if (cl9Var != null) {
            cl9Var.a = this.E0;
        }
    }

    public void setItemViewCacheSize(int i) {
        kl9 kl9Var = this.c;
        kl9Var.a = i;
        kl9Var.p();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(el9 el9Var) {
        RecyclerView recyclerView;
        if (el9Var == this.I) {
            return;
        }
        setScrollState(0);
        ql9 ql9Var = this.w0;
        ql9Var.C.removeCallbacks(ql9Var);
        ql9Var.c.abortAnimation();
        el9 el9Var2 = this.I;
        kl9 kl9Var = this.c;
        if (el9Var2 != null) {
            cl9 cl9Var = this.i0;
            if (cl9Var != null) {
                cl9Var.e();
            }
            this.I.f0(kl9Var);
            this.I.g0(kl9Var);
            ((ArrayList) kl9Var.c).clear();
            kl9Var.i();
            if (this.N) {
                el9 el9Var3 = this.I;
                el9Var3.f = false;
                el9Var3.P(this);
            }
            this.I.r0(null);
            this.I = null;
        } else {
            ((ArrayList) kl9Var.c).clear();
            kl9Var.i();
        }
        ij1 ij1Var = this.f;
        ((zg1) ij1Var.c).J();
        ArrayList arrayList = (ArrayList) ij1Var.d;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = (RecyclerView) ((g99) ij1Var.b).b;
            if (size < 0) {
                break;
            }
            rl9 F = F((View) arrayList.get(size));
            if (F != null) {
                int i = F.o;
                if (recyclerView.I()) {
                    F.p = i;
                    recyclerView.M0.add(F);
                } else {
                    View view = F.a;
                    Field field = rcd.a;
                    view.setImportantForAccessibility(i);
                }
                F.o = 0;
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            F(childAt);
            yk9 yk9Var = recyclerView.H;
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.I = el9Var;
        if (el9Var != null) {
            if (el9Var.b == null) {
                el9Var.r0(this);
                if (this.N) {
                    el9 el9Var4 = this.I;
                    el9Var4.f = true;
                    el9Var4.O(this);
                }
            } else {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(el9Var);
                String w = el9Var.b.w();
                sb.append(" is already attached to a RecyclerView:");
                sb.append(w);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        kl9Var.p();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
        } else {
            vs.m("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        f18 scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            ViewGroup viewGroup = scrollingChildHelper.c;
            Field field = rcd.a;
            viewGroup.stopNestedScroll();
        }
        scrollingChildHelper.d = z;
    }

    @Deprecated
    public void setOnScrollListener(hl9 hl9Var) {
        this.A0 = hl9Var;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.v0 = z;
    }

    public void setRecycledViewPool(jl9 jl9Var) {
        jl9 jl9Var2;
        kl9 kl9Var = this.c;
        RecyclerView recyclerView = (RecyclerView) kl9Var.h;
        kl9Var.g(recyclerView.H, false);
        if (((jl9) kl9Var.g) != null) {
            jl9Var2.b--;
        }
        kl9Var.g = jl9Var;
        if (jl9Var != null && recyclerView.getAdapter() != null) {
            ((jl9) kl9Var.g).b++;
        }
        kl9Var.f();
    }

    public void setScrollState(int i) {
        if (i != this.j0) {
            this.j0 = i;
            if (i != 2) {
                ql9 ql9Var = this.w0;
                ql9Var.C.removeCallbacks(ql9Var);
                ql9Var.c.abortAnimation();
            }
            el9 el9Var = this.I;
            if (el9Var != null) {
                el9Var.e0(i);
            }
            ArrayList arrayList = this.B0;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((hl9) this.B0.get(size)).getClass();
                }
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
            } else {
                this.q0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.q0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(pl9 pl9Var) {
        this.c.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.S) {
            f("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.S = false;
                if (this.R && this.I != null && this.H != null) {
                    requestLayout();
                }
                this.R = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, nae.e, nae.e, 0));
            this.S = true;
            this.T = true;
            setScrollState(0);
            ql9 ql9Var = this.w0;
            ql9Var.C.removeCallbacks(ql9Var);
            ql9Var.c.abortAnimation();
        }
    }

    public final void t() {
        if (this.e0 != null) {
            return;
        }
        ((ol9) this.d0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.e0 = edgeEffect;
        if (this.D) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void u() {
        if (this.g0 != null) {
            return;
        }
        ((ol9) this.d0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.g0 = edgeEffect;
        if (this.D) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void v() {
        if (this.f0 != null) {
            return;
        }
        ((ol9) this.d0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f0 = edgeEffect;
        if (this.D) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String w() {
        return " " + super.toString() + ", adapter:" + this.H + ", layout:" + this.I + ", context:" + getContext();
    }

    public final void x(nl9 nl9Var) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.w0.c;
            overScroller.getFinalX();
            overScroller.getCurrX();
            nl9Var.getClass();
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        nl9Var.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View y(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            return r3
        L17:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.y(android.view.View):android.view.View");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean z(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r12.getAction()
            java.util.ArrayList r1 = r11.L
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        Lc:
            if (r4 >= r2) goto L64
            java.lang.Object r5 = r1.get(r4)
            cb4 r5 = (defpackage.cb4) r5
            int r6 = r5.v
            r7 = 1
            r8 = 2
            if (r6 != r7) goto L59
            float r6 = r12.getX()
            float r9 = r12.getY()
            boolean r6 = r5.b(r6, r9)
            float r9 = r12.getX()
            float r10 = r12.getY()
            boolean r9 = r5.a(r9, r10)
            int r10 = r12.getAction()
            if (r10 != 0) goto L61
            if (r6 != 0) goto L3c
            if (r9 == 0) goto L61
        L3c:
            if (r9 == 0) goto L49
            r5.w = r7
            float r6 = r12.getX()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.p = r6
            goto L55
        L49:
            if (r6 == 0) goto L55
            r5.w = r8
            float r6 = r12.getY()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.m = r6
        L55:
            r5.d(r8)
            goto L5b
        L59:
            if (r6 != r8) goto L61
        L5b:
            r6 = 3
            if (r0 == r6) goto L61
            r11.M = r5
            return r7
        L61:
            int r4 = r4 + 1
            goto Lc
        L64:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.z(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        el9 el9Var = this.I;
        if (el9Var != null) {
            return el9Var.s(layoutParams);
        }
        vs.k("RecyclerView has no LayoutManager".concat(w()));
        return null;
    }

    public void setOnFlingListener(gl9 gl9Var) {
    }

    @Deprecated
    public void setRecyclerListener(ll9 ll9Var) {
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.recyclerViewStyle);
    }

    public RecyclerView(Context context) {
        this(context, null);
    }
}

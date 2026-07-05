package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.vbook.android.R;
import java.util.UUID;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i29  reason: default package */
/* loaded from: classes.dex */
public final class i29 extends z0 implements zz7 {
    public vt4 F;
    public m29 G;
    public String H;
    public final View I;
    public final boolean J;
    public final h88 K;
    public final WindowManager L;
    public final WindowManager.LayoutParams M;
    public l29 N;
    public tc6 O;
    public final hm8 P;
    public final hm8 Q;
    public uy5 R;
    public final h23 S;
    public final Rect T;
    public final sra U;
    public final h73 V;
    public nb8 W;
    public final yz7 a0;
    public final hm8 b0;
    public boolean c0;
    public final int[] d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v21, types: [h73, java.lang.Object, e08] */
    public i29(vt4 vt4Var, m29 m29Var, String str, View view, r13 r13Var, l29 l29Var, UUID uuid, boolean z) {
        super(view.getContext());
        h88 h88Var;
        boolean z2;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            h88Var = new h88(1);
        } else if (i >= 29) {
            h88Var = new h88(1);
        } else {
            h88Var = new h88(1);
        }
        this.F = vt4Var;
        this.G = m29Var;
        this.H = str;
        this.I = view;
        this.J = z;
        this.K = h88Var;
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        this.L = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        m29 m29Var2 = this.G;
        boolean b = tk.b(view);
        boolean z3 = m29Var2.b;
        int i2 = m29Var2.a;
        if (z3 && b) {
            i2 |= 8192;
        } else if (z3 && !b) {
            i2 &= -8193;
        }
        layoutParams.flags = i2;
        layoutParams.type = this.G.f;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.M = layoutParams;
        this.N = l29Var;
        this.O = tc6.a;
        this.P = yae.z(null);
        this.Q = yae.z(null);
        this.S = yae.q(new ik(this, 20));
        this.T = new Rect();
        this.U = new sra(new pk(this, 3));
        ?? obj = new Object();
        this.V = obj;
        hf0 hf0Var = new hf0(this);
        yz7 yz7Var = new yz7(null);
        yz7.a(yz7Var, hf0Var);
        yz7Var.b(obj);
        this.a0 = yz7Var;
        setId(16908290);
        setTag(R.id.view_tree_lifecycle_owner, iue.O(view));
        setTag(R.id.view_tree_view_model_store_owner, kue.h(view));
        setTag(R.id.view_tree_saved_state_registry_owner, jue.I(view));
        setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
        yz7 navigationEventDispatcher = getNavigationEventDispatcher();
        m29 m29Var3 = this.G;
        if ((m29Var3.a & 8) == 0 && m29Var3.c) {
            z2 = true;
        } else {
            z2 = false;
        }
        navigationEventDispatcher.d();
        if (navigationEventDispatcher.c != z2) {
            navigationEventDispatcher.c = z2;
            navigationEventDispatcher.d.b();
        }
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(r13Var.L0(8.0f));
        setOutlineProvider(new y53(1));
        this.b0 = yae.z(vu1.a);
        this.d0 = new int[2];
    }

    private final lu4 getContent() {
        return (lu4) this.b0.getValue();
    }

    private final uy5 getDisplayBounds() {
        int i = this.G.a & 512;
        View view = this.I;
        Rect rect = this.T;
        h88 h88Var = this.K;
        if (i == 0) {
            h88Var.getClass();
            view.getWindowVisibleDisplayFrame(rect);
        } else {
            h88Var.p(view, rect);
        }
        return new uy5(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final sc6 getParentLayoutCoordinates() {
        return (sc6) this.Q.getValue();
    }

    private final void setContent(lu4 lu4Var) {
        this.b0.setValue(lu4Var);
    }

    private final void setParentLayoutCoordinates(sc6 sc6Var) {
        this.Q.setValue(sc6Var);
    }

    @Override // defpackage.z0
    public final void a(int i, rv4 rv4Var) {
        int i2;
        boolean z;
        rv4Var.g0(-857613600);
        if (rv4Var.h(this)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            getContent().invoke(rv4Var, 0);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new y0(this, i, 9);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.G.c) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            } else if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                this.V.a();
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.z0
    public final void g(boolean z, int i, int i2, int i3, int i4) {
        super.g(z, i, i2, i3, i4);
        this.G.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.M;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.K.getClass();
        this.L.updateViewLayout(this, layoutParams);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.S.getValue()).booleanValue();
    }

    @Override // defpackage.zz7
    public yz7 getNavigationEventDispatcher() {
        return this.a0;
    }

    public final WindowManager.LayoutParams getParams$ui() {
        return this.M;
    }

    public final tc6 getParentLayoutDirection() {
        return this.O;
    }

    /* renamed from: getPopupContentSize-bOM6tXw  reason: not valid java name */
    public final zy5 m6getPopupContentSizebOM6tXw() {
        return (zy5) this.P.getValue();
    }

    public final l29 getPositionProvider() {
        return this.N;
    }

    @Override // defpackage.z0
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.c0;
    }

    public final String getTestTag() {
        return this.H;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    @Override // defpackage.z0
    public final void h(int i, int i2) {
        this.G.getClass();
        uy5 displayBounds = getDisplayBounds();
        super.h(View.MeasureSpec.makeMeasureSpec(displayBounds.e(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(displayBounds.b(), Integer.MIN_VALUE));
    }

    public final void o(px1 px1Var, lu4 lu4Var) {
        setParentCompositionContext(px1Var);
        setContent(lu4Var);
        this.c0 = true;
    }

    @Override // defpackage.z0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.U.e();
        if (this.G.c && Build.VERSION.SDK_INT >= 33) {
            r4.v(this, getNavigationEventDispatcher(), new pk(this, 2));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        sra sraVar = this.U;
        d89 d89Var = sraVar.h;
        if (d89Var != null) {
            d89Var.a();
        }
        sraVar.a();
        if (Build.VERSION.SDK_INT < 33) {
            return;
        }
        nb8 nb8Var = this.W;
        if (nb8Var != null) {
            yz7 navigationEventDispatcher = getNavigationEventDispatcher();
            navigationEventDispatcher.getClass();
            navigationEventDispatcher.d();
            if (navigationEventDispatcher.g.h(nb8Var)) {
                f08 f08Var = navigationEventDispatcher.d;
                f08Var.getClass();
                f08Var.k.h(nb8Var);
                f08Var.j.h(nb8Var);
                f08Var.i.h(nb8Var);
                nb8Var.a = null;
                nb8Var.c();
            }
        }
        this.W = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.G.d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < nae.e || motionEvent.getX() >= getWidth() || motionEvent.getY() < nae.e || motionEvent.getY() >= getHeight())) {
            vt4 vt4Var = this.F;
            if (vt4Var != null) {
                vt4Var.invoke();
                return true;
            }
        } else if (motionEvent != null && motionEvent.getAction() == 4) {
            vt4 vt4Var2 = this.F;
            if (vt4Var2 != null) {
                vt4Var2.invoke();
            }
        } else {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public final void p(vt4 vt4Var, m29 m29Var, String str, tc6 tc6Var) {
        boolean z;
        this.F = vt4Var;
        this.H = str;
        int i = 0;
        if (!c16.i(this.G, m29Var)) {
            m29Var.getClass();
            this.G = m29Var;
            yz7 navigationEventDispatcher = getNavigationEventDispatcher();
            m29 m29Var2 = this.G;
            if ((m29Var2.a & 8) == 0 && m29Var2.c) {
                z = true;
            } else {
                z = false;
            }
            navigationEventDispatcher.d();
            if (navigationEventDispatcher.c != z) {
                navigationEventDispatcher.c = z;
                navigationEventDispatcher.d.b();
            }
            boolean b = tk.b(this.I);
            boolean z2 = m29Var.b;
            int i2 = m29Var.a;
            if (z2 && b) {
                i2 |= 8192;
            } else if (z2 && !b) {
                i2 &= -8193;
            }
            WindowManager.LayoutParams layoutParams = this.M;
            layoutParams.flags = i2;
            this.K.getClass();
            this.L.updateViewLayout(this, layoutParams);
        }
        int ordinal = tc6Var.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                i = 1;
            } else {
                xk5.o();
                return;
            }
        }
        super.setLayoutDirection(i);
    }

    public final void q() {
        long m;
        sc6 parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.t()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates != null) {
                long a = parentLayoutCoordinates.a();
                if (this.J) {
                    m = parentLayoutCoordinates.L(0L);
                } else {
                    m = parentLayoutCoordinates.m(0L);
                }
                uy5 b = pc2.b((Math.round(Float.intBitsToFloat((int) (m >> 32))) << 32) | (4294967295L & Math.round(Float.intBitsToFloat((int) (m & 4294967295L)))), a);
                if (!b.equals(this.R)) {
                    this.R = b;
                    s();
                }
            }
        }
    }

    public final void r(sc6 sc6Var) {
        setParentLayoutCoordinates(sc6Var);
        q();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [yl9, java.lang.Object] */
    public final void s() {
        zy5 m6getPopupContentSizebOM6tXw;
        uy5 uy5Var = this.R;
        if (uy5Var != null && (m6getPopupContentSizebOM6tXw = m6getPopupContentSizebOM6tXw()) != null) {
            long j = m6getPopupContentSizebOM6tXw.a;
            uy5 displayBounds = getDisplayBounds();
            long b = (displayBounds.b() & 4294967295L) | (displayBounds.e() << 32);
            ?? obj = new Object();
            obj.a = 0L;
            this.U.d(this, vt3.Y, new h29(obj, this, uy5Var, b, j));
            long j2 = obj.a;
            WindowManager.LayoutParams layoutParams = this.M;
            layoutParams.x = (int) (j2 >> 32);
            layoutParams.y = (int) (j2 & 4294967295L);
            boolean z = this.G.e;
            h88 h88Var = this.K;
            if (z) {
                h88Var.s(this, (int) (b >> 32), (int) (b & 4294967295L));
            }
            h88Var.getClass();
            this.L.updateViewLayout(this, layoutParams);
        }
    }

    public final void setParentLayoutDirection(tc6 tc6Var) {
        this.O = tc6Var;
    }

    /* renamed from: setPopupContentSize-fhxjrPA  reason: not valid java name */
    public final void m7setPopupContentSizefhxjrPA(zy5 zy5Var) {
        this.P.setValue(zy5Var);
    }

    public final void setPositionProvider(l29 l29Var) {
        this.N = l29Var;
    }

    public final void setTestTag(String str) {
        this.H = str;
    }

    public static /* synthetic */ void getParams$ui$annotations() {
    }

    public z0 getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }
}

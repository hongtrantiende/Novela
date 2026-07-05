package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.vbook.android.R;
import java.lang.ref.WeakReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z0  reason: default package */
/* loaded from: classes.dex */
public abstract class z0 extends ViewGroup {
    public boolean C;
    public boolean D;
    public boolean E;
    public WeakReference a;
    public IBinder b;
    public rnd c;
    public px1 d;
    public vw1 e;
    public xb2 f;

    public z0(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        hj hjVar = new hj(this, 1);
        addOnAttachStateChangeListener(hjVar);
        scd scdVar = new scd(this);
        c16.o(this).a.add(scdVar);
        this.f = new xb2(4, this, hjVar, scdVar);
    }

    private final void setParentContext(px1 px1Var) {
        if (this.d != px1Var) {
            this.d = px1Var;
            if (px1Var != null) {
                this.a = null;
            }
            rnd rndVar = this.c;
            if (rndVar != null) {
                rndVar.a();
                this.c = null;
                if (isAttachedToWindow()) {
                    f();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.b != iBinder) {
            this.b = iBinder;
            this.a = null;
        }
    }

    public abstract void a(int i, rv4 rv4Var);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        c();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        c();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public final void b() {
        if (isAttachedToWindow()) {
            setPreviousAttachedWindowToken(getWindowToken());
            if (this.e == null) {
                rg rgVar = null;
                if (getChildCount() != 0) {
                    View childAt = getChildAt(0);
                    if (childAt instanceof rg) {
                        rgVar = (rg) childAt;
                    }
                }
                if (rgVar != null) {
                    rgVar.setComposeViewContext(l(aye.i(this), rgVar.getComposeViewContext()));
                }
            }
            if (getShouldCreateCompositionOnAttachedToWindow()) {
                f();
            }
        }
    }

    public final void c() {
        if (this.D) {
            return;
        }
        xk5.q(hl5.n("Cannot add views to ", getClass().getSimpleName(), "; only Compose content is supported"));
    }

    public final void d() {
        vw1 vw1Var;
        View view;
        if (this.d == null && !isAttachedToWindow() && ((vw1Var = this.e) == null || (view = vw1Var.a) == null || !view.isAttachedToWindow())) {
            vs.k("createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference.");
        } else {
            f();
        }
    }

    public final void e() {
        rg rgVar;
        View childAt = getChildAt(0);
        if (childAt instanceof rg) {
            rgVar = (rg) childAt;
        } else {
            rgVar = null;
        }
        if (rgVar != null && rgVar.Y0) {
            rgVar.a.b();
            rgVar.Y0 = false;
        }
        rnd rndVar = this.c;
        if (rndVar != null) {
            rndVar.a();
        }
        this.c = null;
        requestLayout();
    }

    public final void f() {
        if (this.c == null) {
            try {
                this.D = true;
                Trace.beginSection("Compose:initializeView");
                vw1 vw1Var = this.e;
                if (vw1Var == null) {
                    vw1Var = j();
                }
                this.c = vnd.a(this, vw1Var, new tu1(new y0(this, 0), true, 1003123809));
                Trace.endSection();
            } finally {
                this.D = false;
            }
        }
    }

    public void g(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    /* renamed from: getAutoClearFocusBehavior-4UtRPd4  reason: not valid java name */
    public final int m20getAutoClearFocusBehavior4UtRPd4() {
        b80 b80Var;
        Object tag = getTag(R.id.auto_clear_focus_behavior_tag);
        if (tag instanceof b80) {
            b80Var = (b80) tag;
        } else {
            b80Var = null;
        }
        if (b80Var != null) {
            return b80Var.a;
        }
        return 1;
    }

    public final vw1 getComposeViewContext$ui() {
        return this.e;
    }

    public final boolean getHasComposition() {
        if (this.c != null) {
            return true;
        }
        return false;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.C;
    }

    public void h(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        if (this.E && !super.isTransitionGroup()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.vw1 j() {
        /*
            r9 = this;
            int r0 = r9.getChildCount()
            r1 = 0
            if (r0 != 0) goto L9
        L7:
            r0 = r1
            goto L1c
        L9:
            r0 = 0
            android.view.View r0 = r9.getChildAt(r0)
            boolean r2 = r0 instanceof defpackage.rg
            if (r2 == 0) goto L15
            rg r0 = (defpackage.rg) r0
            goto L16
        L15:
            r0 = r1
        L16:
            if (r0 == 0) goto L7
            vw1 r0 = r0.getComposeViewContext()
        L1c:
            android.view.View r4 = defpackage.aye.i(r9)
            vw1 r2 = defpackage.aye.j(r4)
            if (r2 != 0) goto L87
            px1 r5 = r9.k()
            un6 r9 = defpackage.iue.O(r4)
            if (r9 != 0) goto L3a
            if (r0 == 0) goto L37
            un6 r9 = r0.c()
            goto L38
        L37:
            r9 = r1
        L38:
            if (r9 == 0) goto L3c
        L3a:
            r6 = r9
            goto L42
        L3c:
            java.lang.String r9 = "Composed into the View which doesn't propagate ViewTreeLifecycleOwner!"
            defpackage.vs.k(r9)
            return r1
        L42:
            ty9 r9 = defpackage.jue.I(r4)
            if (r9 != 0) goto L56
            if (r0 == 0) goto L53
            r0.f()
            ty9 r9 = r0.e
            r9.getClass()
            goto L54
        L53:
            r9 = r1
        L54:
            if (r9 == 0) goto L58
        L56:
            r7 = r9
            goto L5e
        L58:
            java.lang.String r9 = "Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!"
            defpackage.vs.k(r9)
            return r1
        L5e:
            sdd r9 = defpackage.kue.h(r4)
            if (r9 != 0) goto L6d
            if (r0 == 0) goto L6b
            r0.f()
            sdd r1 = r0.f
        L6b:
            r8 = r1
            goto L6e
        L6d:
            r8 = r9
        L6e:
            vw1 r2 = new vw1
            android.view.View r9 = defpackage.aye.i(r4)
            vw1 r3 = defpackage.aye.j(r9)
            r2.<init>(r3, r4, r5, r6, r7, r8)
            java.lang.ref.WeakReference r9 = new java.lang.ref.WeakReference
            r9.<init>(r2)
            r0 = 2131361872(0x7f0a0050, float:1.8343509E38)
            r4.setTag(r0, r9)
            return r2
        L87:
            vw1 r9 = r9.l(r4, r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z0.j():vw1");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006a, code lost:
        if (r3 > 0) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Type inference failed for: r0v0, types: [px1] */
    /* JADX WARN: Type inference failed for: r0v1, types: [px1] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [kk9] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.px1 k() {
        /*
            r5 = this;
            px1 r0 = r5.d
            if (r0 != 0) goto L8c
            px1 r0 = defpackage.ukd.a(r5)
            if (r0 == 0) goto Lb
            goto L20
        Lb:
            android.view.ViewParent r1 = r5.getParent()
        Lf:
            if (r0 != 0) goto L20
            boolean r2 = r1 instanceof android.view.View
            if (r2 == 0) goto L20
            android.view.View r1 = (android.view.View) r1
            px1 r0 = defpackage.ukd.a(r1)
            android.view.ViewParent r1 = defpackage.gue.q(r1)
            goto Lf
        L20:
            ik9 r1 = defpackage.ik9.b
            r2 = 0
            if (r0 == 0) goto L48
            boolean r3 = r0 instanceof defpackage.kk9
            if (r3 == 0) goto L3d
            r3 = r0
            kk9 r3 = (defpackage.kk9) r3
            cza r3 = r3.v
            java.lang.Object r3 = r3.getValue()
            ik9 r3 = (defpackage.ik9) r3
            int r3 = r3.compareTo(r1)
            if (r3 <= 0) goto L3b
            goto L3d
        L3b:
            r3 = r2
            goto L3e
        L3d:
            r3 = r0
        L3e:
            if (r3 == 0) goto L49
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r3)
            r5.a = r4
            goto L49
        L48:
            r0 = r2
        L49:
            if (r0 != 0) goto L8c
            java.lang.ref.WeakReference r0 = r5.a
            if (r0 == 0) goto L6d
            java.lang.Object r0 = r0.get()
            px1 r0 = (defpackage.px1) r0
            if (r0 == 0) goto L6d
            boolean r3 = r0 instanceof defpackage.kk9
            if (r3 == 0) goto L6e
            r3 = r0
            kk9 r3 = (defpackage.kk9) r3
            cza r3 = r3.v
            java.lang.Object r3 = r3.getValue()
            ik9 r3 = (defpackage.ik9) r3
            int r3 = r3.compareTo(r1)
            if (r3 <= 0) goto L6d
            goto L6e
        L6d:
            r0 = r2
        L6e:
            if (r0 != 0) goto L8c
            kk9 r0 = defpackage.ukd.b(r5)
            cza r3 = r0.v
            java.lang.Object r3 = r3.getValue()
            ik9 r3 = (defpackage.ik9) r3
            int r1 = r3.compareTo(r1)
            if (r1 <= 0) goto L83
            r2 = r0
        L83:
            if (r2 == 0) goto L8c
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r2)
            r5.a = r1
        L8c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z0.k():px1");
    }

    public final vw1 l(View view, vw1 vw1Var) {
        px1 k = k();
        un6 O = iue.O(view);
        sdd h = kue.h(view);
        ty9 I = jue.I(view);
        vw1Var.f();
        px1 px1Var = vw1Var.c;
        px1Var.getClass();
        if (k == px1Var && O == vw1Var.c()) {
            vw1Var.f();
            if (h == vw1Var.f) {
                vw1Var.f();
                ty9 ty9Var = vw1Var.e;
                ty9Var.getClass();
                if (I == ty9Var) {
                    return vw1Var;
                }
            }
        }
        d82 k2 = k.k();
        vw1Var.f();
        px1 px1Var2 = vw1Var.c;
        px1Var2.getClass();
        if (k2 != px1Var2.k()) {
            e();
        }
        if (O == null) {
            O = vw1Var.c();
        }
        un6 un6Var = O;
        if (I == null) {
            vw1Var.f();
            I = vw1Var.e;
            I.getClass();
        }
        vw1 vw1Var2 = new vw1(vw1Var, view, k, un6Var, I, h);
        view.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(vw1Var2));
        return vw1Var2;
    }

    public final void m(vw1 vw1Var) {
        boolean z;
        rg rgVar;
        rnd rndVar = this.c;
        if (rndVar != null && !rndVar.b.x()) {
            z = true;
        } else {
            z = false;
        }
        e();
        View childAt = getChildAt(0);
        if (childAt instanceof rg) {
            rgVar = (rg) childAt;
        } else {
            rgVar = null;
        }
        if (vw1Var != null) {
            if (rgVar != null) {
                rgVar.setComposeViewContext(vw1Var);
            }
            if (z) {
                f();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        tv7 tv7Var = ukd.a;
        ViewParent q = gue.q(this);
        View view = this;
        while (q instanceof View) {
            View view2 = (View) q;
            if (view2.getId() == 16908290) {
                break;
            }
            view = view2;
            q = view2.getParent();
        }
        if (view.getParent() == null) {
            getHandler().postAtFrontOfQueue(new x0(this, 0));
        } else {
            b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        g(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        f();
        h(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    /* renamed from: setAutoClearFocusBehavior-17tfJxM  reason: not valid java name */
    public final void m21setAutoClearFocusBehavior17tfJxM(int i) {
        setTag(R.id.auto_clear_focus_behavior_tag, new b80(i));
    }

    public final void setComposeViewContext$ui(vw1 vw1Var) {
        if (this.e == vw1Var) {
            return;
        }
        this.e = vw1Var;
        m(vw1Var);
    }

    public final void setParentCompositionContext(px1 px1Var) {
        setParentContext(px1Var);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.C = z;
        View childAt = getChildAt(0);
        if (childAt != null) {
            ((rg) ((wg8) childAt)).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.E = true;
    }

    public final void setViewCompositionStrategy(tcd tcdVar) {
        xb2 xb2Var = this.f;
        if (xb2Var != null) {
            xb2Var.invoke();
        }
        ((hud) tcdVar).getClass();
        hj hjVar = new hj(this, 1);
        addOnAttachStateChangeListener(hjVar);
        scd scdVar = new scd(this);
        c16.o(this).a.add(scdVar);
        this.f = new xb2(4, this, hjVar, scdVar);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        c();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        c();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        c();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, i, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}

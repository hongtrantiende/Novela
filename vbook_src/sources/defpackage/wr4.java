package defpackage;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.vbook.android.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wr4  reason: default package */
/* loaded from: classes.dex */
public final class wr4 extends FrameLayout {
    public final ArrayList a;
    public final ArrayList b;
    public View.OnApplyWindowInsetsListener c;
    public boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wr4(Context context, AttributeSet attributeSet, hs4 hs4Var) {
        super(context, attributeSet);
        ur4 ur4Var;
        String str;
        context.getClass();
        attributeSet.getClass();
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.d = true;
        String classAttribute = attributeSet.getClassAttribute();
        int i = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bg9.b, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        rr4 C = hs4Var.C(id);
        if (classAttribute != null && C == null) {
            if (id == -1) {
                if (string != null) {
                    str = " with tag ".concat(string);
                } else {
                    str = "";
                }
                vs.k(hl5.n("FragmentContainerView must have an android:id to add Fragment ", classAttribute, str));
                throw null;
            }
            bs4 H = hs4Var.H();
            context.getClassLoader();
            rr4 a = H.a(classAttribute);
            a.getClass();
            a.T = id;
            a.U = id;
            a.V = string;
            a.P = hs4Var;
            tr4 tr4Var = hs4Var.w;
            a.Q = tr4Var;
            a.a0 = true;
            if (tr4Var == null) {
                ur4Var = null;
            } else {
                ur4Var = tr4Var.c;
            }
            if (ur4Var != null) {
                a.a0 = true;
            }
            uf0 uf0Var = new uf0(hs4Var);
            uf0Var.o = true;
            a.b0 = this;
            a.L = true;
            uf0Var.f(getId(), a, string);
            if (!uf0Var.g) {
                hs4 hs4Var2 = uf0Var.q;
                if (hs4Var2.w != null && !hs4Var2.J) {
                    hs4Var2.z(true);
                    uf0 uf0Var2 = hs4Var2.h;
                    if (uf0Var2 != null) {
                        uf0Var2.r = false;
                        uf0Var2.d();
                        if (hs4.K(3)) {
                            Log.d("FragmentManager", "Reversing mTransitioningOp " + hs4Var2.h + " as part of execSingleAction for action " + uf0Var);
                        }
                        hs4Var2.h.e(false, false);
                        hs4Var2.h.a(hs4Var2.L, hs4Var2.M);
                        ArrayList arrayList = hs4Var2.h.a;
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            rr4 rr4Var = ((qs4) obj).b;
                            if (rr4Var != null) {
                                rr4Var.I = false;
                            }
                        }
                        hs4Var2.h = null;
                    }
                    uf0Var.a(hs4Var2.L, hs4Var2.M);
                    hs4Var2.b = true;
                    try {
                        hs4Var2.U(hs4Var2.L, hs4Var2.M);
                        hs4Var2.d();
                        hs4Var2.f0();
                        hs4Var2.v();
                        ((HashMap) hs4Var2.c.c).values().removeAll(Collections.singleton(null));
                    } catch (Throwable th) {
                        hs4Var2.d();
                        throw th;
                    }
                }
            } else {
                vs.k("This transaction is already being added to the back stack");
                throw null;
            }
        }
        ArrayList w = hs4Var.c.w();
        int size2 = w.size();
        while (i < size2) {
            Object obj2 = w.get(i);
            i++;
            int i3 = ((ns4) obj2).c.U;
            getId();
        }
    }

    public final void a(View view) {
        if (this.b.contains(view)) {
            this.a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        rr4 rr4Var;
        view.getClass();
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof rr4) {
            rr4Var = (rr4) tag;
        } else {
            rr4Var = null;
        }
        if (rr4Var != null) {
            super.addView(view, i, layoutParams);
        } else {
            vm1.e(view, " is not associated with a Fragment.", "Views added to a FragmentContainerView must be associated with a Fragment. View ");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        tjd tjdVar;
        WindowInsets a;
        windowInsets.getClass();
        tjd c = tjd.c(windowInsets, null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.c;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            onApplyWindowInsets.getClass();
            tjdVar = tjd.c(onApplyWindowInsets, null);
        } else {
            Field field = rcd.a;
            WindowInsets b = c.b();
            if (b != null && !b.equals(b)) {
                c = tjd.c(b, this);
            }
            tjdVar = c;
        }
        if (!tjdVar.a.s()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                Field field2 = rcd.a;
                WindowInsets b2 = tjdVar.b();
                if (b2 != null) {
                    if (Build.VERSION.SDK_INT >= 30) {
                        a = pcd.a(childAt, b2);
                    } else {
                        a = icd.a(childAt, b2);
                    }
                    if (!a.equals(b2)) {
                        tjd.c(a, childAt);
                    }
                }
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.getClass();
        if (this.d) {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                super.drawChild(canvas, (View) obj, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        canvas.getClass();
        view.getClass();
        if (this.d) {
            ArrayList arrayList = this.a;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        view.getClass();
        this.b.remove(view);
        if (this.a.remove(view)) {
            this.d = true;
        }
        super.endViewTransition(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v20, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    public final <F extends rr4> F getFragment() {
        rr4 rr4Var;
        ur4 ur4Var;
        hs4 hs4Var;
        wr4 wr4Var = this;
        while (true) {
            if (wr4Var != 0) {
                Object tag = wr4Var.getTag(R.id.fragment_container_view_tag);
                if (tag instanceof rr4) {
                    rr4Var = (rr4) tag;
                } else {
                    rr4Var = null;
                }
                if (rr4Var != null) {
                    break;
                }
                ViewParent parent = wr4Var.getParent();
                if (parent instanceof View) {
                    wr4Var = (View) parent;
                } else {
                    wr4Var = 0;
                }
            } else {
                rr4Var = null;
                break;
            }
        }
        if (rr4Var != null) {
            if (rr4Var.Q != null && rr4Var.G) {
                hs4Var = rr4Var.m();
            } else {
                throw new IllegalStateException("The Fragment " + rr4Var + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
        } else {
            Context context = getContext();
            while (true) {
                if (context instanceof ContextWrapper) {
                    if (context instanceof ur4) {
                        ur4Var = (ur4) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    ur4Var = null;
                    break;
                }
            }
            if (ur4Var != null) {
                hs4Var = ((tr4) ur4Var.R.a).f;
            } else {
                fb4.g(this, " is not within a subclass of FragmentActivity.", "View ");
                return null;
            }
        }
        return (F) hs4Var.C(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        windowInsets.getClass();
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 < childCount) {
                View childAt = getChildAt(childCount);
                childAt.getClass();
                a(childAt);
            } else {
                super.removeAllViewsInLayout();
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        view.getClass();
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        childAt.getClass();
        a(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        view.getClass();
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            childAt.getClass();
            a(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            childAt.getClass();
            a(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.d = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        view.getClass();
        if (view.getParent() == this) {
            this.b.add(view);
        }
        super.startViewTransition(view);
    }
}

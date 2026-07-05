package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sl9  reason: default package */
/* loaded from: classes.dex */
public final class sl9 extends j4 {
    public final tl9 d;
    public final WeakHashMap e = new WeakHashMap();

    public sl9(tl9 tl9Var) {
        this.d = tl9Var;
    }

    @Override // defpackage.j4
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        j4 j4Var = (j4) this.e.get(view);
        if (j4Var != null) {
            return j4Var.a(view, accessibilityEvent);
        }
        return this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // defpackage.j4
    public final n07 b(View view) {
        j4 j4Var = (j4) this.e.get(view);
        if (j4Var != null) {
            return j4Var.b(view);
        }
        return super.b(view);
    }

    @Override // defpackage.j4
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        j4 j4Var = (j4) this.e.get(view);
        if (j4Var != null) {
            j4Var.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // defpackage.j4
    public final void d(View view, v4 v4Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = v4Var.a;
        tl9 tl9Var = this.d;
        RecyclerView recyclerView = tl9Var.d;
        RecyclerView recyclerView2 = tl9Var.d;
        boolean H = recyclerView.H();
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        if (!H && recyclerView2.getLayoutManager() != null) {
            recyclerView2.getLayoutManager().U(view, v4Var);
            j4 j4Var = (j4) this.e.get(view);
            if (j4Var != null) {
                j4Var.d(view, v4Var);
                return;
            } else {
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                return;
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    @Override // defpackage.j4
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        j4 j4Var = (j4) this.e.get(view);
        if (j4Var != null) {
            j4Var.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // defpackage.j4
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        j4 j4Var = (j4) this.e.get(viewGroup);
        if (j4Var != null) {
            return j4Var.f(viewGroup, view, accessibilityEvent);
        }
        return this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // defpackage.j4
    public final boolean g(View view, int i, Bundle bundle) {
        tl9 tl9Var = this.d;
        RecyclerView recyclerView = tl9Var.d;
        RecyclerView recyclerView2 = tl9Var.d;
        if (!recyclerView.H() && recyclerView2.getLayoutManager() != null) {
            j4 j4Var = (j4) this.e.get(view);
            if (j4Var != null) {
                if (j4Var.g(view, i, bundle)) {
                    return true;
                }
            } else if (super.g(view, i, bundle)) {
                return true;
            }
            kl9 kl9Var = recyclerView2.getLayoutManager().b.c;
            return false;
        }
        return super.g(view, i, bundle);
    }

    @Override // defpackage.j4
    public final void h(View view, int i) {
        j4 j4Var = (j4) this.e.get(view);
        if (j4Var != null) {
            j4Var.h(view, i);
        } else {
            super.h(view, i);
        }
    }

    @Override // defpackage.j4
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        j4 j4Var = (j4) this.e.get(view);
        if (j4Var != null) {
            j4Var.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}

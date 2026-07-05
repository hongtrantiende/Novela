package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tl9  reason: default package */
/* loaded from: classes.dex */
public final class tl9 extends j4 {
    public final RecyclerView d;
    public final sl9 e;

    public tl9(RecyclerView recyclerView) {
        this.d = recyclerView;
        sl9 sl9Var = this.e;
        if (sl9Var != null) {
            this.e = sl9Var;
        } else {
            this.e = new sl9(this);
        }
    }

    @Override // defpackage.j4
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !this.d.H()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().R(accessibilityEvent);
            }
        }
    }

    @Override // defpackage.j4
    public final void d(View view, v4 v4Var) {
        this.a.onInitializeAccessibilityNodeInfo(view, v4Var.a);
        RecyclerView recyclerView = this.d;
        if (!recyclerView.H() && recyclerView.getLayoutManager() != null) {
            el9 layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.b;
            layoutManager.S(recyclerView2.c, recyclerView2.z0, v4Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4 A[ADDED_TO_REGION] */
    @Override // defpackage.j4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(android.view.View r5, int r6, android.os.Bundle r7) {
        /*
            r4 = this;
            boolean r5 = super.g(r5, r6, r7)
            r7 = 1
            if (r5 == 0) goto L8
            return r7
        L8:
            androidx.recyclerview.widget.RecyclerView r4 = r4.d
            boolean r5 = r4.H()
            r0 = 0
            if (r5 != 0) goto Lad
            el9 r5 = r4.getLayoutManager()
            if (r5 == 0) goto Lad
            el9 r4 = r4.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView r5 = r4.b
            kl9 r5 = r5.c
            int r5 = r4.n
            int r1 = r4.m
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            androidx.recyclerview.widget.RecyclerView r3 = r4.b
            android.graphics.Matrix r3 = r3.getMatrix()
            boolean r3 = r3.isIdentity()
            if (r3 == 0) goto L44
            androidx.recyclerview.widget.RecyclerView r3 = r4.b
            boolean r3 = r3.getGlobalVisibleRect(r2)
            if (r3 == 0) goto L44
            int r5 = r2.height()
            int r1 = r2.width()
        L44:
            r2 = 4096(0x1000, float:5.74E-42)
            if (r6 == r2) goto L7b
            r2 = 8192(0x2000, float:1.148E-41)
            if (r6 == r2) goto L4f
            r5 = r0
            r6 = r5
            goto La2
        L4f:
            androidx.recyclerview.widget.RecyclerView r6 = r4.b
            r2 = -1
            boolean r6 = r6.canScrollVertically(r2)
            if (r6 == 0) goto L64
            int r6 = r4.D()
            int r5 = r5 - r6
            int r6 = r4.A()
            int r5 = r5 - r6
            int r5 = -r5
            goto L65
        L64:
            r5 = r0
        L65:
            androidx.recyclerview.widget.RecyclerView r6 = r4.b
            boolean r6 = r6.canScrollHorizontally(r2)
            if (r6 == 0) goto L79
            int r6 = r4.B()
            int r1 = r1 - r6
            int r6 = r4.C()
            int r1 = r1 - r6
            int r6 = -r1
            goto La2
        L79:
            r6 = r0
            goto La2
        L7b:
            androidx.recyclerview.widget.RecyclerView r6 = r4.b
            boolean r6 = r6.canScrollVertically(r7)
            if (r6 == 0) goto L8e
            int r6 = r4.D()
            int r5 = r5 - r6
            int r6 = r4.A()
            int r5 = r5 - r6
            goto L8f
        L8e:
            r5 = r0
        L8f:
            androidx.recyclerview.widget.RecyclerView r6 = r4.b
            boolean r6 = r6.canScrollHorizontally(r7)
            if (r6 == 0) goto L79
            int r6 = r4.B()
            int r1 = r1 - r6
            int r6 = r4.C()
            int r6 = r1 - r6
        La2:
            if (r5 != 0) goto La7
            if (r6 != 0) goto La7
            goto Lad
        La7:
            androidx.recyclerview.widget.RecyclerView r4 = r4.b
            r4.X(r6, r5, r7)
            return r7
        Lad:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tl9.g(android.view.View, int, android.os.Bundle):boolean");
    }
}

package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f18  reason: default package */
/* loaded from: classes.dex */
public final class f18 {
    public ViewParent a;
    public ViewParent b;
    public final ViewGroup c;
    public boolean d;
    public int[] e;

    public f18(ViewGroup viewGroup) {
        this.c = viewGroup;
    }

    public final boolean a(float f, float f2, boolean z) {
        ViewParent e;
        if (this.d && (e = e(0)) != null) {
            try {
                return e.onNestedFling(this.c, f, f2, z);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + e + " does not implement interface method onNestedFling", e2);
            }
        }
        return false;
    }

    public final boolean b(float f, float f2) {
        ViewParent e;
        if (this.d && (e = e(0)) != null) {
            try {
                return e.onNestedPreFling(this.c, f, f2);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + e + " does not implement interface method onNestedPreFling", e2);
            }
        }
        return false;
    }

    public final boolean c(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        ViewParent e;
        int i4;
        int i5;
        if (!this.d || (e = e(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            if (this.e == null) {
                this.e = new int[2];
            }
            iArr = this.e;
        }
        iArr[0] = 0;
        iArr[1] = 0;
        if (e instanceof g18) {
            ((g18) e).e(i, i2, i3, iArr);
        } else if (i3 == 0) {
            try {
                e.onNestedPreScroll(viewGroup, i, i2, iArr);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + e + " does not implement interface method onNestedPreScroll", e2);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        if (iArr[0] == 0 && iArr[1] == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(int r15, int r16, int r17, int r18, int[] r19, int r20, int[] r21) {
        /*
            r14 = this;
            r1 = r19
            r7 = r20
            boolean r0 = r14.d
            r9 = 0
            if (r0 == 0) goto Lb0
            android.view.ViewParent r2 = r14.e(r7)
            if (r2 != 0) goto L11
            goto Lb0
        L11:
            r10 = 1
            if (r15 != 0) goto L22
            if (r16 != 0) goto L22
            if (r17 != 0) goto L22
            if (r18 == 0) goto L1b
            goto L22
        L1b:
            if (r1 == 0) goto Lb0
            r1[r9] = r9
            r1[r10] = r9
            return r9
        L22:
            android.view.ViewGroup r11 = r14.c
            if (r1 == 0) goto L30
            r11.getLocationInWindow(r1)
            r0 = r1[r9]
            r3 = r1[r10]
            r12 = r0
            r13 = r3
            goto L32
        L30:
            r12 = r9
            r13 = r12
        L32:
            if (r21 != 0) goto L45
            int[] r0 = r14.e
            if (r0 != 0) goto L3d
            r0 = 2
            int[] r0 = new int[r0]
            r14.e = r0
        L3d:
            int[] r14 = r14.e
            r14[r9] = r9
            r14[r10] = r9
            r8 = r14
            goto L47
        L45:
            r8 = r21
        L47:
            boolean r14 = r2 instanceof defpackage.g18
            if (r14 == 0) goto L59
            g18 r2 = (defpackage.g18) r2
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r2.d(r3, r4, r5, r6, r7, r8)
        L57:
            r3 = r11
            goto La0
        L59:
            r14 = r8[r9]
            int r14 = r14 + r17
            r8[r9] = r14
            r14 = r8[r10]
            int r14 = r14 + r18
            r8[r10] = r14
            boolean r14 = r2 instanceof defpackage.g18
            if (r14 == 0) goto L78
            g18 r2 = (defpackage.g18) r2
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r20
            r2.b(r3, r4, r5, r6, r7)
            goto L57
        L78:
            if (r20 != 0) goto L57
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r3 = r11
            r2.onNestedScroll(r3, r4, r5, r6, r7)     // Catch: java.lang.AbstractMethodError -> L86
            goto La0
        L86:
            r0 = move-exception
            r14 = r0
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r0 = "ViewParent "
            r15.<init>(r0)
            r15.append(r2)
            java.lang.String r0 = " does not implement interface method onNestedScroll"
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            java.lang.String r0 = "ViewParentCompat"
            android.util.Log.e(r0, r15, r14)
        La0:
            if (r1 == 0) goto Laf
            r3.getLocationInWindow(r1)
            r14 = r1[r9]
            int r14 = r14 - r12
            r1[r9] = r14
            r14 = r1[r10]
            int r14 = r14 - r13
            r1[r10] = r14
        Laf:
            return r10
        Lb0:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f18.d(int, int, int, int, int[], int, int[]):boolean");
    }

    public final ViewParent e(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return this.b;
        }
        return this.a;
    }

    public final boolean f(int i) {
        if (e(i) != null) {
            return true;
        }
        return false;
    }

    public final boolean g(int i, int i2) {
        boolean onStartNestedScroll;
        if (!f(i2)) {
            if (this.d) {
                View view = this.c;
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z = parent instanceof g18;
                    if (z) {
                        onStartNestedScroll = ((g18) parent).j(i);
                    } else {
                        if (i2 == 0) {
                            try {
                                onStartNestedScroll = parent.onStartNestedScroll(view2, view, i);
                            } catch (AbstractMethodError e) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e);
                            }
                        }
                        onStartNestedScroll = false;
                    }
                    if (onStartNestedScroll) {
                        if (i2 != 0) {
                            if (i2 == 1) {
                                this.b = parent;
                            }
                        } else {
                            this.a = parent;
                        }
                        if (z) {
                            ((g18) parent).f(view2, view, i, i2);
                        } else if (i2 == 0) {
                            try {
                                parent.onNestedScrollAccepted(view2, view, i);
                            } catch (AbstractMethodError e2) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e2);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view2 = parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void h(int i) {
        ViewParent e = e(i);
        if (e != null) {
            boolean z = e instanceof g18;
            ViewGroup viewGroup = this.c;
            if (z) {
                ((g18) e).g(viewGroup, i);
            } else if (i == 0) {
                try {
                    e.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + e + " does not implement interface method onStopNestedScroll", e2);
                }
            }
            if (i != 0) {
                if (i == 1) {
                    this.b = null;
                    return;
                }
                return;
            }
            this.a = null;
        }
    }
}

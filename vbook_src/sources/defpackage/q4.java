package defpackage;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q4  reason: default package */
/* loaded from: classes.dex */
public final class q4 {
    public static final q4 d;
    public static final q4 e;
    public static final q4 f;
    public static final q4 g;
    public static final q4 h;
    public static final q4 i;
    public static final q4 j;
    public static final q4 k;
    public final Object a;
    public final int b;
    public final Class c;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction15 = null;
        new q4(1, (String) null);
        new q4(2, (String) null);
        new q4(4, (String) null);
        new q4(8, (String) null);
        new q4(16, (String) null);
        new q4(32, (String) null);
        d = new q4(64, (String) null);
        e = new q4((int) Token.CASE, (String) null);
        new q4(256, b5.class);
        new q4(512, b5.class);
        new q4(1024, c5.class);
        new q4(2048, c5.class);
        f = new q4(4096, (String) null);
        g = new q4(8192, (String) null);
        new q4(16384, (String) null);
        new q4(32768, (String) null);
        new q4((int) Parser.ARGC_LIMIT, (String) null);
        new q4(131072, g5.class);
        new q4(262144, (String) null);
        new q4(524288, (String) null);
        new q4(1048576, (String) null);
        new q4(2097152, h5.class);
        new q4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, null, null, null);
        new q4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, null, null, e5.class);
        h = new q4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, null, null, null);
        i = new q4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, null, null, null);
        j = new q4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, null, null, null);
        k = new q4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, null, null, null);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            accessibilityAction = sz0.f();
        } else {
            accessibilityAction = null;
        }
        new q4(accessibilityAction, 16908358, null, null, null);
        if (i2 >= 29) {
            accessibilityAction2 = sz0.v();
        } else {
            accessibilityAction2 = null;
        }
        new q4(accessibilityAction2, 16908359, null, null, null);
        if (i2 >= 29) {
            accessibilityAction3 = sz0.w();
        } else {
            accessibilityAction3 = null;
        }
        new q4(accessibilityAction3, 16908360, null, null, null);
        if (i2 >= 29) {
            accessibilityAction4 = sz0.x();
        } else {
            accessibilityAction4 = null;
        }
        new q4(accessibilityAction4, 16908361, null, null, null);
        new q4(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, null, null, null);
        new q4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, 16908349, null, null, f5.class);
        if (i2 >= 26) {
            accessibilityAction5 = sz0.j();
        } else {
            accessibilityAction5 = null;
        }
        new q4(accessibilityAction5, 16908354, null, null, d5.class);
        if (i2 >= 28) {
            accessibilityAction6 = sz0.k();
        } else {
            accessibilityAction6 = null;
        }
        new q4(accessibilityAction6, 16908356, null, null, null);
        if (i2 >= 28) {
            accessibilityAction7 = sz0.l();
        } else {
            accessibilityAction7 = null;
        }
        new q4(accessibilityAction7, 16908357, null, null, null);
        if (i2 >= 30) {
            accessibilityAction8 = sz0.i();
        } else {
            accessibilityAction8 = null;
        }
        new q4(accessibilityAction8, 16908362, null, null, null);
        if (i2 >= 30) {
            accessibilityAction9 = sz0.o();
        } else {
            accessibilityAction9 = null;
        }
        new q4(accessibilityAction9, 16908372, null, null, null);
        if (i2 >= 32) {
            accessibilityAction10 = sz0.q();
        } else {
            accessibilityAction10 = null;
        }
        new q4(accessibilityAction10, 16908373, null, null, null);
        if (i2 >= 32) {
            accessibilityAction11 = sz0.s();
        } else {
            accessibilityAction11 = null;
        }
        new q4(accessibilityAction11, 16908374, null, null, null);
        if (i2 >= 32) {
            accessibilityAction12 = sz0.t();
        } else {
            accessibilityAction12 = null;
        }
        new q4(accessibilityAction12, 16908375, null, null, null);
        if (i2 >= 33) {
            accessibilityAction13 = sz0.u();
        } else {
            accessibilityAction13 = null;
        }
        new q4(accessibilityAction13, 16908376, null, null, null);
        if (i2 >= 34) {
            accessibilityAction14 = k4.i();
        } else {
            accessibilityAction14 = null;
        }
        new q4(accessibilityAction14, 16908382, null, null, null);
        int i3 = dz0.a;
        if (i2 >= 36 && cz0.a() >= 3600001) {
            accessibilityAction15 = t4.a();
        }
        new q4(accessibilityAction15, 16908383, null, null, null);
    }

    public q4(Object obj, int i2, CharSequence charSequence, i5 i5Var, Class cls) {
        this.b = i2;
        if (obj == null) {
            this.a = new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence);
        } else {
            this.a = obj;
        }
        this.c = cls;
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof q4)) {
            return false;
        }
        Object obj2 = ((q4) obj).a;
        Object obj3 = this.a;
        if (obj3 == null) {
            if (obj2 != null) {
                return false;
            }
            return true;
        } else if (!obj3.equals(obj2)) {
            return false;
        } else {
            return true;
        }
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String d2 = v4.d(this.b);
        if (d2.equals("ACTION_UNKNOWN")) {
            Object obj = this.a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                d2 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(d2);
        return sb.toString();
    }

    public q4(int i2, Class cls) {
        this(null, i2, null, null, cls);
    }

    public q4(int i2, String str) {
        this(null, i2, str, null, null);
    }
}

package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tjd  reason: default package */
/* loaded from: classes.dex */
public final class tjd {
    public static final tjd b;
    public final qjd a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            b = ojd.x;
        } else if (i >= 30) {
            b = mjd.w;
        } else {
            b = qjd.b;
        }
    }

    public tjd(tjd tjdVar) {
        if (tjdVar != null) {
            qjd qjdVar = tjdVar.a;
            int i = Build.VERSION.SDK_INT;
            if (i >= 35 && (qjdVar instanceof pjd)) {
                this.a = new pjd(this, (pjd) qjdVar);
            } else if (i >= 34 && (qjdVar instanceof ojd)) {
                this.a = new ojd(this, (ojd) qjdVar);
            } else if (i >= 31 && (qjdVar instanceof njd)) {
                this.a = new njd(this, (njd) qjdVar);
            } else if (i >= 30 && (qjdVar instanceof mjd)) {
                this.a = new mjd(this, (mjd) qjdVar);
            } else if (i >= 29 && (qjdVar instanceof ljd)) {
                this.a = new ljd(this, (ljd) qjdVar);
            } else if (i >= 28 && (qjdVar instanceof kjd)) {
                this.a = new kjd(this, (kjd) qjdVar);
            } else if (qjdVar instanceof jjd) {
                this.a = new jjd(this, (jjd) qjdVar);
            } else if (qjdVar instanceof ijd) {
                this.a = new ijd(this, (ijd) qjdVar);
            } else {
                this.a = new qjd(this);
            }
            qjdVar.e(this);
            return;
        }
        this.a = new qjd(this);
    }

    public static cx5 a(cx5 cx5Var, int i, int i2, int i3, int i4) {
        int max = Math.max(0, cx5Var.a - i);
        int max2 = Math.max(0, cx5Var.b - i2);
        int max3 = Math.max(0, cx5Var.c - i3);
        int max4 = Math.max(0, cx5Var.d - i4);
        if (max == i && max2 == i2 && max3 == i3 && max4 == i4) {
            return cx5Var;
        }
        return cx5.b(max, max2, max3, max4);
    }

    public static tjd c(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        tjd tjdVar = new tjd(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            Field field = rcd.a;
            tjd a = lcd.a(view);
            qjd qjdVar = tjdVar.a;
            qjdVar.y(a);
            View rootView = view.getRootView();
            qjdVar.d(rootView);
            qjdVar.p(rootView);
            qjdVar.q();
            qjdVar.A(view.getWindowSystemUiVisibility());
        }
        return tjdVar;
    }

    public final WindowInsets b() {
        qjd qjdVar = this.a;
        if (qjdVar instanceof ijd) {
            return ((ijd) qjdVar).c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tjd)) {
            return false;
        }
        return Objects.equals(this.a, ((tjd) obj).a);
    }

    public final int hashCode() {
        qjd qjdVar = this.a;
        if (qjdVar == null) {
            return 0;
        }
        return qjdVar.hashCode();
    }

    public tjd(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.a = new pjd(this, windowInsets);
        } else if (i >= 34) {
            this.a = new ojd(this, windowInsets);
        } else if (i >= 31) {
            this.a = new njd(this, windowInsets);
        } else if (i >= 30) {
            this.a = new mjd(this, windowInsets);
        } else if (i >= 29) {
            this.a = new ljd(this, windowInsets);
        } else if (i >= 28) {
            this.a = new kjd(this, windowInsets);
        } else {
            this.a = new jjd(this, windowInsets);
        }
    }
}

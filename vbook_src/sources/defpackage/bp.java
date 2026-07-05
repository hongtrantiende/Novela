package defpackage;

import android.os.Build;
import android.view.ViewConfiguration;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bp  reason: default package */
/* loaded from: classes.dex */
public final class bp implements ucd {
    public final ViewConfiguration a;

    public bp(ViewConfiguration viewConfiguration) {
        this.a = viewConfiguration;
    }

    @Override // defpackage.ucd
    public final long a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // defpackage.ucd
    public final long b() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // defpackage.ucd
    public final float c() {
        if (Build.VERSION.SDK_INT >= 34) {
            return k4.o(this.a);
        }
        return 2.0f;
    }

    @Override // defpackage.ucd
    public final float e() {
        return this.a.getScaledMaximumFlingVelocity();
    }

    @Override // defpackage.ucd
    public final float f() {
        return this.a.getScaledTouchSlop();
    }

    @Override // defpackage.ucd
    public final float g() {
        if (Build.VERSION.SDK_INT >= 34) {
            return k4.n(this.a);
        }
        return 16.0f;
    }
}

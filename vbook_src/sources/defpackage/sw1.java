package defpackage;

import com.reader.android.MainActivity;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sw1  reason: default package */
/* loaded from: classes.dex */
public final class sw1 extends z0 {
    public final hm8 F;
    public boolean G;

    public sw1(MainActivity mainActivity) {
        super(mainActivity);
        this.F = yae.z(null);
    }

    @Override // defpackage.z0
    public final void a(int i, rv4 rv4Var) {
        int i2;
        boolean z;
        rv4Var.g0(420213850);
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
            lu4 lu4Var = (lu4) this.F.getValue();
            if (lu4Var == null) {
                rv4Var.e0(-1238823553);
            } else {
                rv4Var.e0(98585282);
                lu4Var.invoke(rv4Var, 0);
            }
            rv4Var.q(false);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new y0(this, i, 5);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return sw1.class.getName();
    }

    @Override // defpackage.z0
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.G;
    }

    public final void setContent(lu4 lu4Var) {
        this.G = true;
        this.F.setValue(lu4Var);
        if (!isAttachedToWindow() && getComposeViewContext$ui() == null) {
            return;
        }
        d();
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}

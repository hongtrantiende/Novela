package defpackage;

import android.os.Build;
import android.os.Bundle;
import java.io.Serializable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zu2  reason: default package */
/* loaded from: classes.dex */
public final class zu2 implements s76 {
    public static final zu2 b = new zu2();
    public final q9a a = aze.m("java.io.Serializable", new o9a[0]);

    @Override // defpackage.s76
    public final o9a e() {
        return this.a;
    }

    @Override // defpackage.s76
    /* renamed from: f */
    public final Serializable c(yq2 yq2Var) {
        Serializable serializable;
        if (yq2Var instanceof iy9) {
            iy9 iy9Var = (iy9) yq2Var;
            Bundle bundle = iy9Var.e;
            bundle.getClass();
            String str = iy9Var.g;
            gi1 a = cm9.a(Serializable.class);
            str.getClass();
            Class B = nmd.B(a);
            if (Build.VERSION.SDK_INT >= 34) {
                serializable = r4.n(bundle, str, B);
            } else {
                serializable = bundle.getSerializable(str);
                if (!B.isInstance(serializable)) {
                    serializable = null;
                }
            }
            if (serializable != null) {
                return serializable;
            }
            gwe.l(str);
            throw null;
        }
        p1a.k(am8.x(this.a.a, yq2Var));
        return null;
    }

    @Override // defpackage.s76
    /* renamed from: g */
    public final void a(jbe jbeVar, Serializable serializable) {
        serializable.getClass();
        if (jbeVar instanceof jy9) {
            jy9 jy9Var = (jy9) jbeVar;
            Bundle bundle = jy9Var.C;
            String str = jy9Var.E;
            str.getClass();
            bundle.putSerializable(str, serializable);
            return;
        }
        p1a.k(am8.y(this.a.a, jbeVar));
    }
}

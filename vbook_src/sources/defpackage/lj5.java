package defpackage;

import android.os.Bundle;
import android.os.IBinder;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lj5  reason: default package */
/* loaded from: classes.dex */
public abstract class lj5 implements s76 {
    public static final q9a a = aze.m("android.os.IBinder", new o9a[0]);

    public static IBinder f(yq2 yq2Var) {
        if (yq2Var instanceof iy9) {
            iy9 iy9Var = (iy9) yq2Var;
            Bundle bundle = iy9Var.e;
            bundle.getClass();
            String str = iy9Var.g;
            str.getClass();
            IBinder binder = bundle.getBinder(str);
            if (binder != null) {
                return binder;
            }
            gwe.l(str);
            throw null;
        }
        p1a.k(am8.x(a.a, yq2Var));
        return null;
    }
}

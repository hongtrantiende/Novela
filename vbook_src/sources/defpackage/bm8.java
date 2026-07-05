package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bm8  reason: default package */
/* loaded from: classes.dex */
public abstract class bm8 implements s76 {
    public static final q9a a = aze.m("kotlin.Array<android.os.Parcelable>", new o9a[0]);

    public static Parcelable[] f(yq2 yq2Var) {
        Parcelable[] parcelableArray;
        if (yq2Var instanceof iy9) {
            iy9 iy9Var = (iy9) yq2Var;
            Bundle bundle = iy9Var.e;
            bundle.getClass();
            String str = iy9Var.g;
            gi1 a2 = cm9.a(Parcelable.class);
            str.getClass();
            Class B = nmd.B(a2);
            if (Build.VERSION.SDK_INT >= 34) {
                parcelableArray = (Parcelable[]) r4.l(bundle, str, B);
            } else {
                parcelableArray = bundle.getParcelableArray(str);
            }
            if (parcelableArray == null) {
                parcelableArray = null;
            }
            if (parcelableArray != null) {
                return parcelableArray;
            }
            gwe.l(str);
            throw null;
        }
        p1a.k(am8.x(a.a, yq2Var));
        return null;
    }
}

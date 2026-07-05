package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cm8  reason: default package */
/* loaded from: classes.dex */
public final class cm8 implements s76 {
    public static final cm8 a = new Object();
    public static final q9a b = aze.m("kotlin.collections.List<android.os.Parcelable>", new o9a[0]);

    @Override // defpackage.s76
    public final o9a e() {
        return b;
    }

    @Override // defpackage.s76
    /* renamed from: f */
    public final ArrayList c(yq2 yq2Var) {
        ArrayList parcelableArrayList;
        if (yq2Var instanceof iy9) {
            iy9 iy9Var = (iy9) yq2Var;
            Bundle bundle = iy9Var.e;
            bundle.getClass();
            String str = iy9Var.g;
            gi1 a2 = cm9.a(Parcelable.class);
            str.getClass();
            Class B = nmd.B(a2);
            if (Build.VERSION.SDK_INT >= 34) {
                parcelableArrayList = r4.m(bundle, str, B);
            } else {
                parcelableArrayList = bundle.getParcelableArrayList(str);
            }
            if (parcelableArrayList != null) {
                return parcelableArrayList;
            }
            gwe.l(str);
            throw null;
        }
        p1a.k(am8.x(b.a, yq2Var));
        return null;
    }

    @Override // defpackage.s76
    /* renamed from: g */
    public final void a(jbe jbeVar, List list) {
        list.getClass();
        if (jbeVar instanceof jy9) {
            jy9 jy9Var = (jy9) jbeVar;
            Bundle bundle = jy9Var.C;
            String str = jy9Var.E;
            str.getClass();
            bundle.putParcelableArrayList(str, iwe.n(list));
            return;
        }
        p1a.k(am8.y(b.a, jbeVar));
    }
}

package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kw2  reason: default package */
/* loaded from: classes.dex */
public final class kw2 implements s76 {
    public static final kw2 b = new kw2();
    public final q9a a = aze.m("android.os.Parcelable", new o9a[0]);

    @Override // defpackage.s76
    public final o9a e() {
        return this.a;
    }

    @Override // defpackage.s76
    /* renamed from: f */
    public final Parcelable c(yq2 yq2Var) {
        if (yq2Var instanceof iy9) {
            iy9 iy9Var = (iy9) yq2Var;
            Bundle bundle = iy9Var.e;
            bundle.getClass();
            String str = iy9Var.g;
            gi1 a = cm9.a(Parcelable.class);
            str.getClass();
            Parcelable parcelable = (Parcelable) oc2.D(bundle, str, nmd.B(a));
            if (parcelable != null) {
                return parcelable;
            }
            gwe.l(str);
            throw null;
        }
        p1a.k(am8.x(this.a.a, yq2Var));
        return null;
    }

    @Override // defpackage.s76
    /* renamed from: g */
    public final void a(jbe jbeVar, Parcelable parcelable) {
        parcelable.getClass();
        if (jbeVar instanceof jy9) {
            jy9 jy9Var = (jy9) jbeVar;
            Bundle bundle = jy9Var.C;
            String str = jy9Var.E;
            str.getClass();
            bundle.putParcelable(str, parcelable);
            return;
        }
        p1a.k(am8.y(this.a.a, jbeVar));
    }
}

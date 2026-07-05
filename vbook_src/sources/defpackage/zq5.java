package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zq5 */
/* loaded from: classes.dex */
public final class zq5 {
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final long f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final yq5 j;
    public boolean k;

    public zq5(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, int i2) {
        long j2;
        int i3;
        boolean z2;
        str = (i2 & 1) != 0 ? "" : str;
        if ((i2 & 32) != 0) {
            j2 = zl1.i;
        } else {
            j2 = j;
        }
        if ((i2 & 64) != 0) {
            i3 = 5;
        } else {
            i3 = i;
        }
        if ((i2 & Token.CASE) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = j2;
        this.g = i3;
        this.h = z2;
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        yq5 yq5Var = new yq5(null, nae.e, nae.e, nae.e, nae.e, nae.e, nae.e, nae.e, null, 1023);
        this.j = yq5Var;
        arrayList.add(yq5Var);
    }

    public static /* synthetic */ void b(zq5 zq5Var, String str, List list) {
        zq5Var.a(str, nae.e, nae.e, nae.e, 1.0f, 1.0f, nae.e, nae.e, list);
    }

    public static /* synthetic */ void d(zq5 zq5Var, ArrayList arrayList, int i, esa esaVar, esa esaVar2, float f, int i2, int i3, float f2) {
        zq5Var.c(1.0f, 1.0f, f, f2, nae.e, 1.0f, nae.e, i, i2, i3, esaVar, esaVar2, "", arrayList);
    }

    public final void a(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list) {
        if (this.k) {
            lv5.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        this.i.add(new yq5(str, f, f2, f3, f4, f5, f6, f7, list, 512));
    }

    public final void c(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i, int i2, int i3, hy0 hy0Var, hy0 hy0Var2, String str, List list) {
        if (this.k) {
            lv5.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ((yq5) nk2.n(1, this.i)).j.add(new n4d(f, f2, f3, f4, f5, f6, f7, i, i2, i3, hy0Var, hy0Var2, str, list));
    }

    public final ar5 e() {
        if (this.k) {
            lv5.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (this.i.size() > 1) {
            f();
        }
        yq5 yq5Var = this.j;
        ar5 ar5Var = new ar5(this.a, this.b, this.c, this.d, this.e, new j4d(yq5Var.a, yq5Var.b, yq5Var.c, yq5Var.d, yq5Var.e, yq5Var.f, yq5Var.g, yq5Var.h, yq5Var.i, yq5Var.j), this.f, this.g, this.h);
        this.k = true;
        return ar5Var;
    }

    public final void f() {
        if (this.k) {
            lv5.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ArrayList arrayList = this.i;
        yq5 yq5Var = (yq5) a82.h(1, arrayList);
        ((yq5) nk2.n(1, arrayList)).j.add(new j4d(yq5Var.a, yq5Var.b, yq5Var.c, yq5Var.d, yq5Var.e, yq5Var.f, yq5Var.g, yq5Var.h, yq5Var.i, yq5Var.j));
    }
}

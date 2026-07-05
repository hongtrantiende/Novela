package defpackage;

import android.text.TextUtils;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ajc  reason: default package */
/* loaded from: classes.dex */
public final class ajc {
    public final int a;
    public final String b;
    public final int c;
    public final vq4[] d;
    public int e;

    static {
        a2d.K(0);
        a2d.K(1);
    }

    public ajc(String str, vq4... vq4VarArr) {
        boolean z;
        int i;
        if (vq4VarArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        wq9.s(z);
        this.b = str;
        this.d = vq4VarArr;
        this.a = vq4VarArr.length;
        String str2 = vq4VarArr[0].o;
        if (TextUtils.isEmpty(str2)) {
            i = lc7.i(vq4VarArr[0].n);
        } else {
            i = lc7.i(str2);
        }
        this.c = i;
        String str3 = vq4VarArr[0].d;
        str3 = (str3 == null || str3.equals("und")) ? "" : "";
        int i2 = vq4VarArr[0].f | 16384;
        for (int i3 = 1; i3 < vq4VarArr.length; i3++) {
            String str4 = vq4VarArr[i3].d;
            if (!str3.equals((str4 == null || str4.equals("und")) ? "" : "")) {
                b("languages", vq4VarArr[0].d, i3, vq4VarArr[i3].d);
                return;
            } else if (i2 != (vq4VarArr[i3].f | 16384)) {
                b("role flags", Integer.toBinaryString(vq4VarArr[0].f), i3, Integer.toBinaryString(vq4VarArr[i3].f));
                return;
            }
        }
    }

    public static void b(String str, String str2, int i, String str3) {
        StringBuilder y = nk2.y("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        y.append(str3);
        y.append("' (track ");
        y.append(i);
        y.append(")");
        st0.i("TrackGroup", "", new IllegalStateException(y.toString()));
    }

    public final int a(vq4 vq4Var) {
        int i = 0;
        while (true) {
            vq4[] vq4VarArr = this.d;
            if (i < vq4VarArr.length) {
                if (vq4Var == vq4VarArr[i]) {
                    return i;
                }
                i++;
            } else {
                return -1;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ajc.class == obj.getClass()) {
            ajc ajcVar = (ajc) obj;
            if (this.b.equals(ajcVar.b) && Arrays.equals(this.d, ajcVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.e == 0) {
            this.e = Arrays.hashCode(this.d) + eub.j(527, 31, this.b);
        }
        return this.e;
    }

    public final String toString() {
        return this.b + ": " + Arrays.toString(this.d);
    }
}

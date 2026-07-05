package defpackage;

import android.net.Uri;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a7  reason: default package */
/* loaded from: classes.dex */
public final class a7 {
    public final int a;
    public final int b;
    public final Uri[] c;
    public final f57[] d;
    public final int[] e;
    public final long[] f;
    public final String[] g;
    public final b7[] h;

    static {
        a82.s(0, 1, 2, 3, 4);
        a82.s(5, 6, 7, 8, 9);
        a2d.K(10);
        a2d.K(11);
    }

    public a7(int i, int i2, int[] iArr, f57[] f57VarArr, long[] jArr, String[] strArr, b7[] b7VarArr) {
        boolean z;
        Uri uri;
        int i3 = 0;
        if (iArr.length == f57VarArr.length) {
            z = true;
        } else {
            z = false;
        }
        wq9.s(z);
        wq9.s(iArr.length == b7VarArr.length);
        this.a = i;
        this.b = i2;
        this.e = iArr;
        this.d = f57VarArr;
        this.f = jArr;
        this.c = new Uri[f57VarArr.length];
        while (true) {
            Uri[] uriArr = this.c;
            if (i3 < uriArr.length) {
                f57 f57Var = f57VarArr[i3];
                if (f57Var == null) {
                    uri = null;
                } else {
                    c57 c57Var = f57Var.b;
                    c57Var.getClass();
                    uri = c57Var.a;
                }
                uriArr[i3] = uri;
                i3++;
            } else {
                this.g = strArr;
                this.h = b7VarArr;
                return;
            }
        }
    }

    public final int a(int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.e;
            if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                break;
            }
            i3++;
        }
        return i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a7.class == obj.getClass()) {
            a7 a7Var = (a7) obj;
            if (this.a == a7Var.a && this.b == a7Var.b && Arrays.equals(this.d, a7Var.d) && Arrays.equals(this.e, a7Var.e) && Arrays.equals(this.f, a7Var.f) && Arrays.equals(this.g, a7Var.g) && Arrays.equals(this.h, a7Var.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.d);
        int hashCode2 = Arrays.hashCode(this.e);
        int hashCode3 = Arrays.hashCode(this.f);
        return (Arrays.hashCode(this.h) + ((((hashCode3 + ((hashCode2 + ((hashCode + (((this.a * 31) + this.b) * 961)) * 31)) * 31)) * 29791) + Arrays.hashCode(this.g)) * 31)) * 31;
    }
}

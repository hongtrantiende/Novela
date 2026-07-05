package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tu7  reason: default package */
/* loaded from: classes.dex */
public final class tu7 {
    public float[] a;
    public int b;

    public tu7(int i) {
        float[] fArr;
        if (i == 0) {
            fArr = aj4.a;
        } else {
            fArr = new float[i];
        }
        this.a = fArr;
    }

    public static String c(tu7 tu7Var, int i) {
        String str;
        String str2 = "";
        if ((i & 2) != 0) {
            str = "";
        } else {
            str = "[";
        }
        if ((i & 4) == 0) {
            str2 = "]";
        }
        tu7Var.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str);
        float[] fArr = tu7Var.a;
        int i2 = tu7Var.b;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            float f = fArr[i3];
            if (i3 != 0) {
                sb.append((CharSequence) ", ");
            }
            if (i3 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            sb.append(f);
            i3++;
        }
        sb.append((CharSequence) str2);
        return sb.toString();
    }

    public final void a(float f) {
        int i = this.b + 1;
        float[] fArr = this.a;
        if (fArr.length < i) {
            this.a = Arrays.copyOf(fArr, Math.max(i, (fArr.length * 3) / 2));
        }
        float[] fArr2 = this.a;
        int i2 = this.b;
        fArr2[i2] = f;
        this.b = i2 + 1;
    }

    public final float b(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        cy7.k("Index must be between 0 and size");
        return nae.e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tu7) {
            tu7 tu7Var = (tu7) obj;
            int i = tu7Var.b;
            int i2 = this.b;
            if (i == i2) {
                float[] fArr = this.a;
                float[] fArr2 = tu7Var.a;
                ty5 F = dce.F(0, i2);
                int i3 = F.a;
                int i4 = F.b;
                if (i3 <= i4) {
                    while (fArr[i3] == fArr2[i3]) {
                        if (i3 != i4) {
                            i3++;
                        } else {
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        float[] fArr = this.a;
        int i = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += Float.hashCode(fArr[i3]) * 31;
        }
        return i2;
    }

    public final String toString() {
        return c(this, 25);
    }
}

package defpackage;

import java.util.Arrays;
import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yx7  reason: default package */
/* loaded from: classes3.dex */
public final class yx7 implements Iterable, j76 {
    public int c;
    public String[] a = new String[10];
    public int[] b = new int[20];
    public final xx7 d = new xx7(this);

    public final void a(String str, String str2) {
        int i;
        String obj;
        int i2 = this.c;
        if (i2 >= 1) {
            i = this.b[i2 - 1];
        } else {
            i = 0;
        }
        int i3 = this.b[i2];
        while (i < i3) {
            if (e(i).equals(str) && c(i).equals(str2)) {
                return;
            }
            i++;
        }
        int i4 = this.b[this.c] * 2;
        int i5 = i4 + 1;
        String[] strArr = this.a;
        if (i5 >= strArr.length) {
            this.a = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        String[] strArr2 = this.a;
        String obj2 = str.toString();
        String str3 = "";
        if (obj2 == null) {
            obj2 = "";
        }
        strArr2[i4] = obj2;
        String[] strArr3 = this.a;
        if (str2 != null && (obj = str2.toString()) != null) {
            str3 = obj;
        }
        strArr3[i5] = str3;
        int[] iArr = this.b;
        int i6 = this.c;
        iArr[i6] = iArr[i6] + 1;
    }

    public final void b() {
        int i;
        int i2 = this.c;
        if (i2 == 0) {
            i = 0;
        } else {
            i = (this.b[i2 - 1] * 2) / 2;
        }
        ty5 F = dce.F(i, (this.b[i2] * 2) / 2);
        int i3 = F.a;
        int i4 = F.b;
        if (i3 <= i4) {
            while (true) {
                String[] strArr = this.a;
                int i5 = i3 * 2;
                strArr[i5] = null;
                strArr[i5 + 1] = null;
                if (i3 == i4) {
                    break;
                }
                i3++;
            }
        }
        int[] iArr = this.b;
        int i6 = this.c;
        iArr[i6] = 0;
        this.c = i6 - 1;
    }

    public final String c(int i) {
        String str = this.a[(i * 2) + 1];
        str.getClass();
        return str;
    }

    public final String d(String str) {
        str.getClass();
        String obj = str.toString();
        int f = f();
        do {
            f--;
            if (f < 0) {
                int hashCode = obj.hashCode();
                if (hashCode != 0) {
                    if (hashCode != 118807) {
                        if (hashCode == 114177052 && obj.equals("xmlns")) {
                            return "http://www.w3.org/2000/xmlns/";
                        }
                    } else if (obj.equals("xml")) {
                        return "http://www.w3.org/XML/1998/namespace";
                    }
                } else if (obj.equals("")) {
                    return "";
                }
                return null;
            }
        } while (!c16.i(obj, e(f)));
        return c(f);
    }

    public final String e(int i) {
        String str = this.a[i * 2];
        str.getClass();
        return str;
    }

    public final int f() {
        return this.b[this.c];
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b2(this, 2);
    }
}

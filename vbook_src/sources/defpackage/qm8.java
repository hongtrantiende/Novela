package defpackage;

import java.util.Locale;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qm8  reason: default package */
/* loaded from: classes.dex */
public final class qm8 {
    public static final qm8 c = new qm8(false, false);
    public static final qm8 d = new qm8(true, true);
    public final boolean a;
    public final boolean b;

    public /* synthetic */ qm8(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public void a(j40 j40Var) {
        if (!this.b && j40Var != null) {
            int i = j40Var.a;
            for (int i2 = 0; i2 < i; i2++) {
                String str = j40Var.b[i2];
                str.getClass();
                if (str.length() <= 1 || str.charAt(0) != '/') {
                    String[] strArr = j40Var.b;
                    String lowerCase = str.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    strArr[i2] = lowerCase;
                }
            }
        }
    }

    public String b(String str) {
        int i;
        boolean z;
        int length = str.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            if (!z2) {
                i = i2;
            } else {
                i = length;
            }
            if (c16.l(str.charAt(i), 32) <= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z2) {
                if (!z) {
                    z2 = true;
                } else {
                    i2++;
                }
            } else if (!z) {
                break;
            } else {
                length--;
            }
        }
        String obj = str.subSequence(i2, length + 1).toString();
        if (!this.a) {
            if (obj != null) {
                String lowerCase = obj.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                return lowerCase;
            }
            return "";
        }
        return obj;
    }
}

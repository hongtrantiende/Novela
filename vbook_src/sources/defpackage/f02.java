package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f02  reason: default package */
/* loaded from: classes3.dex */
public final class f02 implements v38 {
    public final String a;

    public f02(String str) {
        str.getClass();
        this.a = str;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, yq4] */
    @Override // defpackage.xq4
    public final yq4 a() {
        this.a.getClass();
        return new Object();
    }

    @Override // defpackage.xq4
    public final zm8 b() {
        List r;
        String str;
        String str2 = this.a;
        int length = str2.length();
        ks3 ks3Var = ks3.a;
        if (length == 0) {
            r = ks3Var;
        } else {
            jq6 t = tl1.t();
            String str3 = "";
            if (jqe.t(str2.charAt(0))) {
                int length2 = str2.length();
                int i = 0;
                while (true) {
                    if (i < length2) {
                        if (!jqe.t(str2.charAt(i))) {
                            str = str2.substring(0, i);
                            break;
                        }
                        i++;
                    } else {
                        str = str2;
                        break;
                    }
                }
                t.add(new z68(tl1.A(new g02(str))));
                int length3 = str2.length();
                int i2 = 0;
                while (true) {
                    if (i2 >= length3) {
                        str2 = "";
                        break;
                    } else if (!jqe.t(str2.charAt(i2))) {
                        str2 = str2.substring(i2);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            if (str2.length() > 0) {
                if (jqe.t(str2.charAt(str2.length() - 1))) {
                    int length4 = str2.length();
                    while (true) {
                        length4--;
                        if (-1 >= length4) {
                            break;
                        } else if (!jqe.t(str2.charAt(length4))) {
                            str3 = str2.substring(0, length4 + 1);
                            break;
                        }
                    }
                    t.add(new vw8(str3));
                    int length5 = str2.length() - 1;
                    while (true) {
                        if (-1 >= length5) {
                            break;
                        } else if (!jqe.t(str2.charAt(length5))) {
                            str2 = str2.substring(length5 + 1);
                            break;
                        } else {
                            length5--;
                        }
                    }
                    t.add(new z68(tl1.A(new g02(str2))));
                } else {
                    t.add(new vw8(str2));
                }
            }
            r = tl1.r(t);
        }
        return new zm8(r, ks3Var);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f02) {
            if (c16.i(this.a, ((f02) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return s21.p(new StringBuilder("ConstantFormatStructure("), this.a, ')');
    }
}

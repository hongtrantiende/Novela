package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bi1  reason: default package */
/* loaded from: classes3.dex */
public final class bi1 {
    public final byte[] a;

    public bi1(fi1 fi1Var, di1 di1Var, Object... objArr) {
        int c;
        byte[] bArr = new byte[(objArr.length * 2) + 4];
        this.a = bArr;
        fi1.I(bArr, fi1Var.k.f(di1Var), 0);
        fi1.I(bArr, objArr.length, 2);
        for (int i = 0; i < objArr.length; i++) {
            h02 h02Var = fi1Var.k;
            Object obj = objArr[i];
            h02Var.getClass();
            if (!(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short)) {
                if (obj instanceof Character) {
                    c = h02Var.c(((Character) obj).charValue());
                } else if (obj instanceof Boolean) {
                    c = h02Var.c(((Boolean) obj).booleanValue() ? 1 : 0);
                } else if (obj instanceof Float) {
                    float floatValue = ((Float) obj).floatValue();
                    h02Var.j(5);
                    byte[] bArr2 = h02Var.l;
                    int i2 = h02Var.h;
                    h02Var.h = i2 + 1;
                    bArr2[i2] = 4;
                    h02Var.h = fi1.J(h02Var.l, Float.floatToIntBits(floatValue), h02Var.h);
                    h02Var.k.put(Integer.valueOf(h02Var.i), (byte) 4);
                    int i3 = h02Var.i;
                    h02Var.i = i3 + 1;
                    c = i3;
                } else if (obj instanceof Long) {
                    c = h02Var.d(((Long) obj).longValue());
                } else if (obj instanceof Double) {
                    c = h02Var.b(((Double) obj).doubleValue());
                } else if (obj instanceof String) {
                    c = h02Var.e((String) obj);
                } else if (obj instanceof di1) {
                    c = h02Var.f((di1) obj);
                } else {
                    vs.m("value ".concat(String.valueOf(obj)));
                    throw null;
                }
            } else {
                c = h02Var.c(((Number) obj).intValue());
            }
            fi1.I(this.a, c, (i * 2) + 4);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bi1) {
            if (Arrays.equals(this.a, ((bi1) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ~Arrays.hashCode(this.a);
    }
}

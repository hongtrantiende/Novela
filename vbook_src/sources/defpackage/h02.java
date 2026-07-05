package defpackage;

import java.util.HashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h02  reason: default package */
/* loaded from: classes3.dex */
public final class h02 {
    public final fi1 a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public final HashMap g = new HashMap();
    public final HashMap j = new HashMap();
    public final HashMap k = new HashMap();
    public int i = 1;
    public byte[] l = new byte[256];
    public int h = 0;

    public h02(fi1 fi1Var) {
        this.a = fi1Var;
    }

    public static int l(int i, int i2, String str) {
        int i3 = 65535;
        if ((i2 - i) * 3 > 65535) {
            while (i != i2) {
                char charAt = str.charAt(i);
                if (charAt != 0 && charAt <= 127) {
                    i3--;
                } else if (charAt < 2047) {
                    i3 -= 2;
                } else {
                    i3 -= 3;
                }
                if (i3 < 0) {
                    return i;
                }
                i++;
            }
        }
        return i2;
    }

    public final short a(String str) {
        String str2;
        HashMap hashMap = this.f;
        int intValue = ((Integer) hashMap.getOrDefault(str, -1)).intValue();
        if (intValue == -1) {
            if (str.indexOf(46) > 0) {
                String replace = str.replace('.', '/');
                Integer num = (Integer) hashMap.getOrDefault(replace, -1);
                int intValue2 = num.intValue();
                if (intValue2 != -1) {
                    hashMap.put(str, num);
                }
                str2 = replace;
                intValue = intValue2;
            } else {
                str2 = str;
            }
            if (intValue == -1) {
                short i = i(str2);
                j(3);
                byte[] bArr = this.l;
                int i2 = this.h;
                int i3 = i2 + 1;
                this.h = i3;
                bArr[i2] = 7;
                this.h = fi1.I(bArr, i, i3);
                intValue = this.i;
                this.i = intValue + 1;
                hashMap.put(str2, Integer.valueOf(intValue));
                if (!str.equals(str2)) {
                    hashMap.put(str, Integer.valueOf(intValue));
                }
            }
        }
        m(intValue, str);
        this.k.put(Integer.valueOf(intValue), (byte) 7);
        return (short) intValue;
    }

    public final int b(double d) {
        j(9);
        byte[] bArr = this.l;
        int i = this.h;
        this.h = i + 1;
        bArr[i] = 6;
        long doubleToLongBits = Double.doubleToLongBits(d);
        byte[] bArr2 = this.l;
        int i2 = (int) (doubleToLongBits >>> 32);
        this.h = fi1.J(bArr2, (int) doubleToLongBits, fi1.J(bArr2, i2, this.h));
        int i3 = this.i;
        this.i = i3 + 2;
        this.k.put(Integer.valueOf(i3), (byte) 6);
        return i3;
    }

    public final int c(int i) {
        j(5);
        byte[] bArr = this.l;
        int i2 = this.h;
        int i3 = i2 + 1;
        this.h = i3;
        bArr[i2] = 3;
        this.h = fi1.J(bArr, i, i3);
        this.k.put(Integer.valueOf(this.i), (byte) 3);
        int i4 = this.i;
        this.i = i4 + 1;
        return (short) i4;
    }

    public final int d(long j) {
        j(9);
        byte[] bArr = this.l;
        int i = this.h;
        int i2 = i + 1;
        this.h = i2;
        bArr[i] = 5;
        this.h = fi1.J(bArr, (int) j, fi1.J(bArr, (int) (j >>> 32), i2));
        int i3 = this.i;
        this.i = i3 + 2;
        this.k.put(Integer.valueOf(i3), (byte) 5);
        return i3;
    }

    public final int e(String str) {
        int i = i(str) & 65535;
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = this.b;
        int intValue = ((Integer) hashMap.getOrDefault(valueOf, -1)).intValue();
        if (intValue == -1) {
            intValue = this.i;
            this.i = intValue + 1;
            j(3);
            byte[] bArr = this.l;
            int i2 = this.h;
            int i3 = i2 + 1;
            this.h = i3;
            bArr[i2] = 8;
            this.h = fi1.I(bArr, i, i3);
            hashMap.put(Integer.valueOf(i), Integer.valueOf(intValue));
        }
        this.k.put(Integer.valueOf(intValue), (byte) 8);
        return intValue;
    }

    public final short f(di1 di1Var) {
        HashMap hashMap = this.g;
        int intValue = ((Integer) hashMap.getOrDefault(di1Var, -1)).intValue();
        if (intValue == -1) {
            di1Var.getClass();
            short g = g("org.mozilla.javascript.optimizer.Bootstrapper", "bootstrap", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;");
            j(4);
            byte[] bArr = this.l;
            int i = this.h;
            int i2 = i + 1;
            this.h = i2;
            bArr[i] = 15;
            int i3 = i + 2;
            this.h = i3;
            bArr[i2] = 6;
            this.h = fi1.I(bArr, g, i3);
            intValue = this.i;
            this.i = intValue + 1;
            hashMap.put(di1Var, Integer.valueOf(intValue));
            this.k.put(Integer.valueOf(intValue), (byte) 15);
        }
        return (short) intValue;
    }

    public final short g(String str, String str2, String str3) {
        cc4 cc4Var = new cc4(str, str2, str3);
        HashMap hashMap = this.e;
        int intValue = ((Integer) hashMap.getOrDefault(cc4Var, -1)).intValue();
        if (intValue == -1) {
            short h = h(str2, str3);
            short a = a(str);
            j(5);
            byte[] bArr = this.l;
            int i = this.h;
            int i2 = i + 1;
            this.h = i2;
            bArr[i] = 10;
            int I = fi1.I(bArr, a, i2);
            this.h = I;
            this.h = fi1.I(this.l, h, I);
            intValue = this.i;
            this.i = intValue + 1;
            hashMap.put(cc4Var, Integer.valueOf(intValue));
        }
        m(intValue, cc4Var);
        this.k.put(Integer.valueOf(intValue), (byte) 10);
        return (short) intValue;
    }

    public final short h(String str, String str2) {
        short i = i(str);
        short i2 = i(str2);
        j(5);
        byte[] bArr = this.l;
        int i3 = this.h;
        int i4 = i3 + 1;
        this.h = i4;
        bArr[i3] = 12;
        int I = fi1.I(bArr, i, i4);
        this.h = I;
        this.h = fi1.I(this.l, i2, I);
        this.k.put(Integer.valueOf(this.i), (byte) 12);
        int i5 = this.i;
        this.i = i5 + 1;
        return (short) i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final short i(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h02.i(java.lang.String):short");
    }

    public final void j(int i) {
        int i2 = this.h;
        int i3 = i2 + i;
        byte[] bArr = this.l;
        if (i3 > bArr.length) {
            int length = bArr.length * 2;
            if (i2 + i > length) {
                length = i2 + i;
            }
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, i2);
            this.l = bArr2;
        }
    }

    public final Object k(int i) {
        return this.j.get(Integer.valueOf(i));
    }

    public final void m(int i, Object obj) {
        this.j.put(Integer.valueOf(i), obj);
    }
}

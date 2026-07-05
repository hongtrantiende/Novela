package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zc7  reason: default package */
/* loaded from: classes.dex */
public final class zc7 {
    public int a;
    public int b;
    public int c;
    public Object d;
    public Object e;

    public zc7(int i, int i2, int i3) {
        String str;
        if (i == Integer.MIN_VALUE) {
            str = "";
        } else {
            str = i + "/";
        }
        this.d = str;
        this.a = i2;
        this.b = i3;
        this.c = Integer.MIN_VALUE;
        this.e = "";
    }

    public void a() {
        int i;
        int i2 = this.c;
        if (i2 == Integer.MIN_VALUE) {
            i = this.a;
        } else {
            i = i2 + this.b;
        }
        this.c = i;
        this.e = ((String) this.d) + this.c;
    }

    public void b() {
        if (this.c != Integer.MIN_VALUE) {
            return;
        }
        vs.k("generateNewId() must be called before retrieving ids.");
    }

    public byte c() {
        int i = this.a;
        ad7 ad7Var = (ad7) this.e;
        fl8 fl8Var = ad7Var.e;
        if (i < fl8Var.b) {
            u01 u01Var = (u01) this.d;
            int length = u01Var.b.length - u01Var.c;
            byte b = 0;
            if (Math.max(0, length) == 0) {
                int i2 = this.a + 1;
                this.a = i2;
                if (i2 < fl8Var.b) {
                    this.d = new u01(ad7Var.e(i2), 0, (byte) 0);
                }
            }
            u01 u01Var2 = (u01) this.d;
            int i3 = u01Var2.c;
            u01Var2.c = i3 + 1;
            byte[] bArr = u01Var2.b;
            if (i3 >= 0 && i3 < bArr.length) {
                b = bArr[i3];
            }
            this.b--;
            this.c++;
            return b;
        }
        return (byte) -1;
    }

    public void d(long j) {
        ad7 ad7Var = (ad7) this.e;
        ArrayList arrayList = ad7Var.l;
        if (j == 0) {
            return;
        }
        int min = Math.min(this.b, (int) j);
        u01 u01Var = (u01) this.d;
        int length = u01Var.b.length - u01Var.c;
        int i = 0;
        if (min < Math.max(0, length)) {
            ((u01) this.d).c += min;
            this.b -= min;
            this.c += min;
            return;
        }
        int abs = Math.abs(tl1.o(arrayList, Integer.valueOf(this.c + min)) + 1);
        this.a = abs;
        this.d = new u01(ad7Var.e(abs), 0, (byte) 0);
        Integer num = (Integer) sl1.f0(this.a - 1, arrayList);
        if (num != null) {
            i = num.intValue();
        }
        u01 u01Var2 = (u01) this.d;
        int i2 = this.c;
        u01Var2.c += (i2 + min) - i;
        this.b -= min;
        this.c = i2 + min;
    }

    public zc7(int i, int i2) {
        this(Integer.MIN_VALUE, i, i2);
    }

    public zc7(ad7 ad7Var) {
        this.e = ad7Var;
        this.a = -1;
        this.d = new u01(new byte[0], 0, (byte) 0);
        this.b = ((Number) sl1.j0(ad7Var.l)).intValue();
    }
}

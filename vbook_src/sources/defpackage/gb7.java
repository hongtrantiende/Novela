package defpackage;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.mozilla.javascript.Token;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gb7  reason: default package */
/* loaded from: classes.dex */
public final class gb7 implements j0a {
    public static final int[] n = new int[0];
    public static final Unsafe o = gxc.i();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final x2 e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;
    public final i28 j;
    public final qq6 k;
    public final ewc l;
    public final e17 m;

    public gb7(int[] iArr, Object[] objArr, int i, int i2, x2 x2Var, int[] iArr2, int i3, int i4, i28 i28Var, qq6 qq6Var, ewc ewcVar, p74 p74Var, e17 e17Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = x2Var instanceof qw4;
        this.g = iArr2;
        this.h = i3;
        this.i = i4;
        this.j = i28Var;
        this.k = qq6Var;
        this.l = ewcVar;
        this.e = x2Var;
        this.m = e17Var;
    }

    public static Field F(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder o2 = a82.o("Field ", str, " for ");
            o2.append(cls.getName());
            o2.append(" not found. Known fields are ");
            o2.append(Arrays.toString(declaredFields));
            throw new RuntimeException(o2.toString());
        }
    }

    public static int K(int i) {
        return (i & 267386880) >>> 20;
    }

    public static boolean p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof qw4) {
            return ((qw4) obj).h();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.gb7 w(defpackage.eh9 r36, defpackage.i28 r37, defpackage.qq6 r38, defpackage.ewc r39, defpackage.p74 r40, defpackage.e17 r41) {
        /*
            Method dump skipped, instructions count: 1058
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb7.w(eh9, i28, qq6, ewc, p74, e17):gb7");
    }

    public static long x(int i) {
        return i & 1048575;
    }

    public static int y(Object obj, long j) {
        return ((Integer) gxc.c.h(obj, j)).intValue();
    }

    public static long z(Object obj, long j) {
        return ((Long) gxc.c.h(obj, j)).longValue();
    }

    public final int A(int i) {
        if (i >= this.c && i <= this.d) {
            int[] iArr = this.a;
            int length = (iArr.length / 3) - 1;
            int i2 = 0;
            while (i2 <= length) {
                int i3 = (length + i2) >>> 1;
                int i4 = i3 * 3;
                int i5 = iArr[i4];
                if (i == i5) {
                    return i4;
                }
                if (i < i5) {
                    length = i3 - 1;
                } else {
                    i2 = i3 + 1;
                }
            }
            return -1;
        }
        return -1;
    }

    public final void B(Object obj, long j, vh1 vh1Var, j0a j0aVar, z54 z54Var) {
        int B;
        this.k.getClass();
        tz5 a = qq6.a(obj, j);
        xb1 xb1Var = (xb1) vh1Var.e;
        int i = vh1Var.b;
        if ((i & 7) == 3) {
            do {
                qw4 d = j0aVar.d();
                vh1Var.h(d, j0aVar, z54Var);
                j0aVar.b(d);
                ((c99) a).add(d);
                if (!xb1Var.c() && vh1Var.d == 0) {
                    B = xb1Var.B();
                } else {
                    return;
                }
            } while (B == i);
            vh1Var.d = B;
            return;
        }
        throw q16.b();
    }

    public final void C(Object obj, int i, vh1 vh1Var, j0a j0aVar, z54 z54Var) {
        int B;
        this.k.getClass();
        tz5 a = qq6.a(obj, i & 1048575);
        xb1 xb1Var = (xb1) vh1Var.e;
        int i2 = vh1Var.b;
        if ((i2 & 7) == 2) {
            do {
                qw4 d = j0aVar.d();
                vh1Var.k(d, j0aVar, z54Var);
                j0aVar.b(d);
                ((c99) a).add(d);
                if (!xb1Var.c() && vh1Var.d == 0) {
                    B = xb1Var.B();
                } else {
                    return;
                }
            } while (B == i2);
            vh1Var.d = B;
            return;
        }
        throw q16.b();
    }

    public final void D(int i, vh1 vh1Var, Object obj) {
        if ((536870912 & i) != 0) {
            vh1Var.n0(2);
            gxc.o(obj, i & 1048575, ((xb1) vh1Var.e).A());
        } else if (this.f) {
            vh1Var.n0(2);
            gxc.o(obj, i & 1048575, ((xb1) vh1Var.e).z());
        } else {
            gxc.o(obj, i & 1048575, vh1Var.q());
        }
    }

    public final void E(int i, vh1 vh1Var, Object obj) {
        boolean z;
        if ((536870912 & i) != 0) {
            z = true;
        } else {
            z = false;
        }
        qq6 qq6Var = this.k;
        if (z) {
            qq6Var.getClass();
            vh1Var.e0(qq6.a(obj, i & 1048575), true);
            return;
        }
        qq6Var.getClass();
        vh1Var.e0(qq6.a(obj, i & 1048575), false);
    }

    public final void G(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        gxc.m(j, obj, (1 << (i2 >>> 20)) | gxc.c.f(obj, j));
    }

    public final void H(int i, Object obj, int i2) {
        gxc.m(this.a[i2 + 2] & 1048575, obj, i);
    }

    public final void I(Object obj, int i, x2 x2Var) {
        o.putObject(obj, L(i) & 1048575, x2Var);
        G(i, obj);
    }

    public final void J(Object obj, int i, int i2, x2 x2Var) {
        o.putObject(obj, L(i2) & 1048575, x2Var);
        H(i, obj, i2);
    }

    public final int L(int i) {
        return this.a[i + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void M(Object obj, n07 n07Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        Iterator it;
        int j;
        int size;
        int i7;
        int a;
        int i8;
        int i9;
        int j2;
        int size2;
        int i10;
        gb7 gb7Var = this;
        int[] iArr = gb7Var.a;
        int length = iArr.length;
        Unsafe unsafe = o;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            int L = gb7Var.L(i13);
            int i15 = iArr[i13];
            int K = K(L);
            int i16 = 1;
            if (K <= 17) {
                int i17 = iArr[i13 + 2];
                int i18 = i17 & i11;
                if (i18 != i12) {
                    if (i18 == i11) {
                        i14 = 0;
                    } else {
                        i14 = unsafe.getInt(obj, i18);
                    }
                    i12 = i18;
                }
                i = L;
                i2 = 1 << (i17 >>> 20);
            } else {
                i = L;
                i2 = 0;
            }
            long j3 = i & i11;
            switch (K) {
                case 0:
                    if (gb7Var.o(obj, i13, i12, i14, i2)) {
                        double d = gxc.c.d(obj, j3);
                        fl1 fl1Var = (fl1) n07Var.b;
                        fl1Var.getClass();
                        fl1Var.t(i15, Double.doubleToRawLongBits(d));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (gb7Var.o(obj, i13, i12, i14, i2)) {
                        float e = gxc.c.e(obj, j3);
                        fl1 fl1Var2 = (fl1) n07Var.b;
                        fl1Var2.getClass();
                        fl1Var2.r(i15, Float.floatToRawIntBits(e));
                    }
                    gb7Var = this;
                    break;
                case 2:
                    if (gb7Var.o(obj, i13, i12, i14, i2)) {
                        ((fl1) n07Var.b).E(i15, unsafe.getLong(obj, j3));
                    }
                    gb7Var = this;
                    break;
                case 3:
                    if (gb7Var.o(obj, i13, i12, i14, i2)) {
                        ((fl1) n07Var.b).E(i15, unsafe.getLong(obj, j3));
                    }
                    gb7Var = this;
                    break;
                case 4:
                    if (gb7Var.o(obj, i13, i12, i14, i2)) {
                        ((fl1) n07Var.b).v(i15, unsafe.getInt(obj, j3));
                    }
                    gb7Var = this;
                    break;
                case 5:
                    if (gb7Var.o(obj, i13, i12, i14, i2)) {
                        ((fl1) n07Var.b).t(i15, unsafe.getLong(obj, j3));
                    }
                    gb7Var = this;
                    break;
                case 6:
                    if (gb7Var.o(obj, i13, i12, i14, i2)) {
                        ((fl1) n07Var.b).r(i15, unsafe.getInt(obj, j3));
                    }
                    gb7Var = this;
                    break;
                case 7:
                    if (gb7Var.o(obj, i13, i12, i14, i2)) {
                        ((fl1) n07Var.b).o(i15, gxc.c.c(obj, j3));
                    }
                    gb7Var = this;
                    break;
                case 8:
                    if (gb7Var.o(obj, i13, i12, i14, i2)) {
                        Object object = unsafe.getObject(obj, j3);
                        if (object instanceof String) {
                            ((fl1) n07Var.b).z(i15, (String) object);
                        } else {
                            ((fl1) n07Var.b).p(i15, (c31) object);
                        }
                    }
                    gb7Var = this;
                    break;
                case 9:
                    if (gb7Var.o(obj, i13, i12, i14, i2)) {
                        ((fl1) n07Var.b).y(i15, (x2) unsafe.getObject(obj, j3), gb7Var.m(i13));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (gb7Var.o(obj, i13, i12, i14, i2)) {
                        ((fl1) n07Var.b).p(i15, (c31) unsafe.getObject(obj, j3));
                    }
                    gb7Var = this;
                    break;
                case 11:
                    if (gb7Var.o(obj, i13, i12, i14, i2)) {
                        ((fl1) n07Var.b).C(i15, unsafe.getInt(obj, j3));
                    }
                    gb7Var = this;
                    break;
                case 12:
                    if (gb7Var.o(obj, i13, i12, i14, i2)) {
                        ((fl1) n07Var.b).v(i15, unsafe.getInt(obj, j3));
                    }
                    gb7Var = this;
                    break;
                case 13:
                    if (gb7Var.o(obj, i13, i12, i14, i2)) {
                        ((fl1) n07Var.b).r(i15, unsafe.getInt(obj, j3));
                    }
                    gb7Var = this;
                    break;
                case 14:
                    if (gb7Var.o(obj, i13, i12, i14, i2)) {
                        ((fl1) n07Var.b).t(i15, unsafe.getLong(obj, j3));
                    }
                    gb7Var = this;
                    break;
                case 15:
                    if (gb7Var.o(obj, i13, i12, i14, i2)) {
                        int i19 = unsafe.getInt(obj, j3);
                        ((fl1) n07Var.b).C(i15, (i19 >> 31) ^ (i19 << 1));
                    }
                    gb7Var = this;
                    break;
                case 16:
                    if (gb7Var.o(obj, i13, i12, i14, i2)) {
                        long j4 = unsafe.getLong(obj, j3);
                        ((fl1) n07Var.b).E(i15, (j4 >> 63) ^ (j4 << 1));
                    }
                    gb7Var = this;
                    break;
                case 17:
                    if (gb7Var.o(obj, i13, i12, i14, i2)) {
                        n07Var.s(i15, unsafe.getObject(obj, j3), gb7Var.m(i13));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    i3 = i12;
                    i4 = i14;
                    o0a.n(iArr[i13], (List) unsafe.getObject(obj, j3), n07Var, false);
                    i12 = i3;
                    i14 = i4;
                    break;
                case 19:
                    i3 = i12;
                    i4 = i14;
                    o0a.r(iArr[i13], (List) unsafe.getObject(obj, j3), n07Var, false);
                    i12 = i3;
                    i14 = i4;
                    break;
                case 20:
                    i3 = i12;
                    i4 = i14;
                    o0a.t(iArr[i13], (List) unsafe.getObject(obj, j3), n07Var, false);
                    i12 = i3;
                    i14 = i4;
                    break;
                case 21:
                    i3 = i12;
                    i4 = i14;
                    o0a.z(iArr[i13], (List) unsafe.getObject(obj, j3), n07Var, false);
                    i12 = i3;
                    i14 = i4;
                    break;
                case 22:
                    i3 = i12;
                    i4 = i14;
                    o0a.s(iArr[i13], (List) unsafe.getObject(obj, j3), n07Var, false);
                    i12 = i3;
                    i14 = i4;
                    break;
                case 23:
                    i3 = i12;
                    i4 = i14;
                    o0a.q(iArr[i13], (List) unsafe.getObject(obj, j3), n07Var, false);
                    i12 = i3;
                    i14 = i4;
                    break;
                case 24:
                    i3 = i12;
                    i4 = i14;
                    o0a.p(iArr[i13], (List) unsafe.getObject(obj, j3), n07Var, false);
                    i12 = i3;
                    i14 = i4;
                    break;
                case 25:
                    i3 = i12;
                    i4 = i14;
                    o0a.m(iArr[i13], (List) unsafe.getObject(obj, j3), n07Var, false);
                    i12 = i3;
                    i14 = i4;
                    break;
                case 26:
                    i5 = i12;
                    i6 = i14;
                    int i20 = iArr[i13];
                    List list = (List) unsafe.getObject(obj, j3);
                    Class cls = o0a.a;
                    if (list != null && !list.isEmpty()) {
                        n07Var.getClass();
                        for (int i21 = 0; i21 < list.size(); i21++) {
                            ((fl1) n07Var.b).z(i20, (String) list.get(i21));
                        }
                    }
                    i12 = i5;
                    i14 = i6;
                    break;
                case 27:
                    i5 = i12;
                    i6 = i14;
                    int i22 = iArr[i13];
                    List list2 = (List) unsafe.getObject(obj, j3);
                    j0a m = gb7Var.m(i13);
                    Class cls2 = o0a.a;
                    if (list2 != null && !list2.isEmpty()) {
                        n07Var.getClass();
                        for (int i23 = 0; i23 < list2.size(); i23++) {
                            ((fl1) n07Var.b).y(i22, (x2) list2.get(i23), m);
                        }
                    }
                    i12 = i5;
                    i14 = i6;
                    break;
                case 28:
                    i5 = i12;
                    i6 = i14;
                    int i24 = iArr[i13];
                    List list3 = (List) unsafe.getObject(obj, j3);
                    Class cls3 = o0a.a;
                    if (list3 != null && !list3.isEmpty()) {
                        n07Var.getClass();
                        for (int i25 = 0; i25 < list3.size(); i25++) {
                            ((fl1) n07Var.b).p(i24, (c31) list3.get(i25));
                        }
                    }
                    i12 = i5;
                    i14 = i6;
                    break;
                case 29:
                    i3 = i12;
                    i4 = i14;
                    z = false;
                    o0a.y(iArr[i13], (List) unsafe.getObject(obj, j3), n07Var, false);
                    i12 = i3;
                    i14 = i4;
                    break;
                case 30:
                    i3 = i12;
                    i4 = i14;
                    z = false;
                    o0a.o(iArr[i13], (List) unsafe.getObject(obj, j3), n07Var, false);
                    i12 = i3;
                    i14 = i4;
                    break;
                case 31:
                    i3 = i12;
                    i4 = i14;
                    z = false;
                    o0a.u(iArr[i13], (List) unsafe.getObject(obj, j3), n07Var, false);
                    i12 = i3;
                    i14 = i4;
                    break;
                case 32:
                    i3 = i12;
                    i4 = i14;
                    z = false;
                    o0a.v(iArr[i13], (List) unsafe.getObject(obj, j3), n07Var, false);
                    i12 = i3;
                    i14 = i4;
                    break;
                case Token.GETPROP /* 33 */:
                    i3 = i12;
                    i4 = i14;
                    z = false;
                    o0a.w(iArr[i13], (List) unsafe.getObject(obj, j3), n07Var, false);
                    i12 = i3;
                    i14 = i4;
                    break;
                case Token.GETPROPNOWARN /* 34 */:
                    i3 = i12;
                    i4 = i14;
                    z = false;
                    o0a.x(iArr[i13], (List) unsafe.getObject(obj, j3), n07Var, false);
                    i12 = i3;
                    i14 = i4;
                    break;
                case Token.GETPROP_SUPER /* 35 */:
                    i5 = i12;
                    i6 = i14;
                    o0a.n(iArr[i13], (List) unsafe.getObject(obj, j3), n07Var, true);
                    i12 = i5;
                    i14 = i6;
                    break;
                case Token.GETPROPNOWARN_SUPER /* 36 */:
                    i5 = i12;
                    i6 = i14;
                    o0a.r(iArr[i13], (List) unsafe.getObject(obj, j3), n07Var, true);
                    i12 = i5;
                    i14 = i6;
                    break;
                case Token.SETPROP /* 37 */:
                    i5 = i12;
                    i6 = i14;
                    o0a.t(iArr[i13], (List) unsafe.getObject(obj, j3), n07Var, true);
                    i12 = i5;
                    i14 = i6;
                    break;
                case Token.SETPROP_SUPER /* 38 */:
                    i5 = i12;
                    i6 = i14;
                    o0a.z(iArr[i13], (List) unsafe.getObject(obj, j3), n07Var, true);
                    i12 = i5;
                    i14 = i6;
                    break;
                case Token.GETELEM /* 39 */:
                    i5 = i12;
                    i6 = i14;
                    o0a.s(iArr[i13], (List) unsafe.getObject(obj, j3), n07Var, true);
                    i12 = i5;
                    i14 = i6;
                    break;
                case Token.GETELEM_SUPER /* 40 */:
                    i5 = i12;
                    i6 = i14;
                    o0a.q(iArr[i13], (List) unsafe.getObject(obj, j3), n07Var, true);
                    i12 = i5;
                    i14 = i6;
                    break;
                case Token.SETELEM /* 41 */:
                    i5 = i12;
                    i6 = i14;
                    o0a.p(iArr[i13], (List) unsafe.getObject(obj, j3), n07Var, true);
                    i12 = i5;
                    i14 = i6;
                    break;
                case Token.SETELEM_SUPER /* 42 */:
                    i5 = i12;
                    i6 = i14;
                    o0a.m(iArr[i13], (List) unsafe.getObject(obj, j3), n07Var, true);
                    i12 = i5;
                    i14 = i6;
                    break;
                case Token.CALL /* 43 */:
                    i5 = i12;
                    i6 = i14;
                    o0a.y(iArr[i13], (List) unsafe.getObject(obj, j3), n07Var, true);
                    i12 = i5;
                    i14 = i6;
                    break;
                case Token.NAME /* 44 */:
                    i5 = i12;
                    i6 = i14;
                    o0a.o(iArr[i13], (List) unsafe.getObject(obj, j3), n07Var, true);
                    i12 = i5;
                    i14 = i6;
                    break;
                case Token.NUMBER /* 45 */:
                    i5 = i12;
                    i6 = i14;
                    o0a.u(iArr[i13], (List) unsafe.getObject(obj, j3), n07Var, true);
                    i12 = i5;
                    i14 = i6;
                    break;
                case Token.STRING /* 46 */:
                    i5 = i12;
                    i6 = i14;
                    o0a.v(iArr[i13], (List) unsafe.getObject(obj, j3), n07Var, true);
                    i12 = i5;
                    i14 = i6;
                    break;
                case Token.NULL /* 47 */:
                    i5 = i12;
                    i6 = i14;
                    o0a.w(iArr[i13], (List) unsafe.getObject(obj, j3), n07Var, true);
                    i12 = i5;
                    i14 = i6;
                    break;
                case Token.THIS /* 48 */:
                    i5 = i12;
                    i6 = i14;
                    o0a.x(iArr[i13], (List) unsafe.getObject(obj, j3), n07Var, true);
                    i12 = i5;
                    i14 = i6;
                    break;
                case Token.FALSE /* 49 */:
                    i5 = i12;
                    i6 = i14;
                    int i26 = iArr[i13];
                    List list4 = (List) unsafe.getObject(obj, j3);
                    j0a m2 = gb7Var.m(i13);
                    Class cls4 = o0a.a;
                    if (list4 != null && !list4.isEmpty()) {
                        n07Var.getClass();
                        for (int i27 = 0; i27 < list4.size(); i27++) {
                            n07Var.s(i26, list4.get(i27), m2);
                        }
                    }
                    i12 = i5;
                    i14 = i6;
                    break;
                case Token.TRUE /* 50 */:
                    Object object2 = unsafe.getObject(obj, j3);
                    if (object2 != null) {
                        int i28 = 2;
                        Object obj2 = gb7Var.b[(i13 / 3) * 2];
                        gb7Var.m.getClass();
                        zg4 zg4Var = ((w07) obj2).a;
                        fld fldVar = (fld) zg4Var.c;
                        fld fldVar2 = (fld) zg4Var.b;
                        fl1 fl1Var3 = (fl1) n07Var.b;
                        fl1Var3.getClass();
                        Iterator it2 = ((b17) object2).entrySet().iterator();
                        while (it2.hasNext()) {
                            Map.Entry entry = (Map.Entry) it2.next();
                            fl1Var3.B(i15, i28);
                            int i29 = i28;
                            Object key = entry.getKey();
                            int i30 = i16;
                            Object value = entry.getValue();
                            int i31 = ec4.c;
                            int h = fl1.h(i30);
                            int i32 = i12;
                            zkd zkdVar = fld.d;
                            if (fldVar2 == zkdVar) {
                                h *= 2;
                            }
                            int i33 = i14;
                            switch (fldVar2.ordinal()) {
                                case 0:
                                    it = it2;
                                    ((Double) key).getClass();
                                    j = 8;
                                    break;
                                case 1:
                                    it = it2;
                                    ((Float) key).getClass();
                                    j = 4;
                                    break;
                                case 2:
                                    it = it2;
                                    j = fl1.j(((Long) key).longValue());
                                    break;
                                case 3:
                                    it = it2;
                                    j = fl1.j(((Long) key).longValue());
                                    break;
                                case 4:
                                    it = it2;
                                    j = fl1.j(((Integer) key).intValue());
                                    break;
                                case 5:
                                    it = it2;
                                    ((Long) key).getClass();
                                    j = 8;
                                    break;
                                case 6:
                                    it = it2;
                                    ((Integer) key).getClass();
                                    j = 4;
                                    break;
                                case 7:
                                    it = it2;
                                    ((Boolean) key).getClass();
                                    j = i30;
                                    break;
                                case 8:
                                    it = it2;
                                    if (key instanceof c31) {
                                        size = ((c31) key).size();
                                        i7 = fl1.i(size);
                                        j = size + i7;
                                        break;
                                    } else {
                                        j = fl1.g((String) key);
                                        break;
                                    }
                                case 9:
                                    it = it2;
                                    a = ((qw4) ((x2) key)).a(null);
                                    j = a;
                                    break;
                                case 10:
                                    it = it2;
                                    int a2 = ((qw4) ((x2) key)).a(null);
                                    a = a2 + fl1.i(a2);
                                    j = a;
                                    break;
                                case 11:
                                    it = it2;
                                    if (key instanceof c31) {
                                        size = ((c31) key).size();
                                        i7 = fl1.i(size);
                                    } else {
                                        size = ((byte[]) key).length;
                                        i7 = fl1.i(size);
                                    }
                                    j = size + i7;
                                    break;
                                case 12:
                                    it = it2;
                                    j = fl1.i(((Integer) key).intValue());
                                    break;
                                case 13:
                                    it = it2;
                                    j = fl1.j(((Integer) key).intValue());
                                    break;
                                case 14:
                                    ((Integer) key).getClass();
                                    it = it2;
                                    j = 4;
                                    break;
                                case 15:
                                    ((Long) key).getClass();
                                    it = it2;
                                    j = 8;
                                    break;
                                case 16:
                                    int intValue = ((Integer) key).intValue();
                                    i8 = fl1.i((intValue << 1) ^ (intValue >> 31));
                                    it = it2;
                                    j = i8;
                                    break;
                                case 17:
                                    long longValue = ((Long) key).longValue();
                                    i8 = fl1.j((longValue << i30) ^ (longValue >> 63));
                                    it = it2;
                                    j = i8;
                                    break;
                                default:
                                    cy7.e("There is no way to get here, but the compiler thinks otherwise.");
                                    return;
                            }
                            int i34 = j + h;
                            int h2 = fl1.h(i29);
                            if (fldVar == zkdVar) {
                                h2 *= 2;
                            }
                            switch (fldVar.ordinal()) {
                                case 0:
                                    i9 = i34;
                                    ((Double) value).getClass();
                                    j2 = 8;
                                    break;
                                case 1:
                                    i9 = i34;
                                    ((Float) value).getClass();
                                    j2 = 4;
                                    break;
                                case 2:
                                    i9 = i34;
                                    j2 = fl1.j(((Long) value).longValue());
                                    break;
                                case 3:
                                    i9 = i34;
                                    j2 = fl1.j(((Long) value).longValue());
                                    break;
                                case 4:
                                    i9 = i34;
                                    j2 = fl1.j(((Integer) value).intValue());
                                    break;
                                case 5:
                                    i9 = i34;
                                    ((Long) value).getClass();
                                    j2 = 8;
                                    break;
                                case 6:
                                    i9 = i34;
                                    ((Integer) value).getClass();
                                    j2 = 4;
                                    break;
                                case 7:
                                    i9 = i34;
                                    ((Boolean) value).getClass();
                                    j2 = i30;
                                    break;
                                case 8:
                                    i9 = i34;
                                    if (value instanceof c31) {
                                        size2 = ((c31) value).size();
                                        i10 = fl1.i(size2);
                                        j2 = size2 + i10;
                                        break;
                                    } else {
                                        j2 = fl1.g((String) value);
                                        break;
                                    }
                                case 9:
                                    i9 = i34;
                                    j2 = ((qw4) ((x2) value)).a(null);
                                    break;
                                case 10:
                                    i9 = i34;
                                    size2 = ((qw4) ((x2) value)).a(null);
                                    i10 = fl1.i(size2);
                                    j2 = size2 + i10;
                                    break;
                                case 11:
                                    i9 = i34;
                                    if (value instanceof c31) {
                                        size2 = ((c31) value).size();
                                        i10 = fl1.i(size2);
                                    } else {
                                        size2 = ((byte[]) value).length;
                                        i10 = fl1.i(size2);
                                    }
                                    j2 = size2 + i10;
                                    break;
                                case 12:
                                    i9 = i34;
                                    j2 = fl1.i(((Integer) value).intValue());
                                    break;
                                case 13:
                                    i9 = i34;
                                    j2 = fl1.j(((Integer) value).intValue());
                                    break;
                                case 14:
                                    ((Integer) value).getClass();
                                    i9 = i34;
                                    j2 = 4;
                                    break;
                                case 15:
                                    ((Long) value).getClass();
                                    i9 = i34;
                                    j2 = 8;
                                    break;
                                case 16:
                                    int intValue2 = ((Integer) value).intValue();
                                    j2 = fl1.i((intValue2 >> 31) ^ (intValue2 << 1));
                                    i9 = i34;
                                    break;
                                case 17:
                                    long longValue2 = ((Long) value).longValue();
                                    j2 = fl1.j((longValue2 << i30) ^ (longValue2 >> 63));
                                    i9 = i34;
                                    break;
                                default:
                                    cy7.e("There is no way to get here, but the compiler thinks otherwise.");
                                    return;
                            }
                            fl1Var3.D(j2 + h2 + i9);
                            Object key2 = entry.getKey();
                            Object value2 = entry.getValue();
                            ec4.b(fl1Var3, fldVar2, i30, key2);
                            ec4.b(fl1Var3, fldVar, i29, value2);
                            i28 = i29;
                            i12 = i32;
                            it2 = it;
                            i14 = i33;
                            i16 = 1;
                        }
                    }
                    i5 = i12;
                    i6 = i14;
                    i12 = i5;
                    i14 = i6;
                    break;
                case Token.SHEQ /* 51 */:
                    if (gb7Var.q(i15, obj, i13)) {
                        double doubleValue = ((Double) gxc.c.h(obj, j3)).doubleValue();
                        fl1 fl1Var4 = (fl1) n07Var.b;
                        fl1Var4.getClass();
                        fl1Var4.t(i15, Double.doubleToRawLongBits(doubleValue));
                    }
                    break;
                case Token.SHNE /* 52 */:
                    if (gb7Var.q(i15, obj, i13)) {
                        float floatValue = ((Float) gxc.c.h(obj, j3)).floatValue();
                        fl1 fl1Var5 = (fl1) n07Var.b;
                        fl1Var5.getClass();
                        fl1Var5.r(i15, Float.floatToRawIntBits(floatValue));
                    }
                    break;
                case Token.REGEXP /* 53 */:
                    if (gb7Var.q(i15, obj, i13)) {
                        ((fl1) n07Var.b).E(i15, z(obj, j3));
                    }
                    break;
                case Token.BINDNAME /* 54 */:
                    if (gb7Var.q(i15, obj, i13)) {
                        ((fl1) n07Var.b).E(i15, z(obj, j3));
                    }
                    break;
                case Token.THROW /* 55 */:
                    if (gb7Var.q(i15, obj, i13)) {
                        ((fl1) n07Var.b).v(i15, y(obj, j3));
                    }
                    break;
                case Token.RETHROW /* 56 */:
                    if (gb7Var.q(i15, obj, i13)) {
                        ((fl1) n07Var.b).t(i15, z(obj, j3));
                    }
                    break;
                case Token.IN /* 57 */:
                    if (gb7Var.q(i15, obj, i13)) {
                        ((fl1) n07Var.b).r(i15, y(obj, j3));
                    }
                    break;
                case Token.INSTANCEOF /* 58 */:
                    if (gb7Var.q(i15, obj, i13)) {
                        ((fl1) n07Var.b).o(i15, ((Boolean) gxc.c.h(obj, j3)).booleanValue());
                    }
                    break;
                case Token.LOCAL_LOAD /* 59 */:
                    if (gb7Var.q(i15, obj, i13)) {
                        Object object3 = unsafe.getObject(obj, j3);
                        if (object3 instanceof String) {
                            ((fl1) n07Var.b).z(i15, (String) object3);
                        } else {
                            ((fl1) n07Var.b).p(i15, (c31) object3);
                        }
                    }
                    break;
                case Token.GETVAR /* 60 */:
                    if (gb7Var.q(i15, obj, i13)) {
                        ((fl1) n07Var.b).y(i15, (x2) unsafe.getObject(obj, j3), gb7Var.m(i13));
                    }
                    break;
                case Token.SETVAR /* 61 */:
                    if (gb7Var.q(i15, obj, i13)) {
                        ((fl1) n07Var.b).p(i15, (c31) unsafe.getObject(obj, j3));
                    }
                    break;
                case Token.CATCH_SCOPE /* 62 */:
                    if (gb7Var.q(i15, obj, i13)) {
                        ((fl1) n07Var.b).C(i15, y(obj, j3));
                    }
                    break;
                case Token.ENUM_INIT_KEYS /* 63 */:
                    if (gb7Var.q(i15, obj, i13)) {
                        ((fl1) n07Var.b).v(i15, y(obj, j3));
                    }
                    break;
                case Token.ENUM_INIT_VALUES /* 64 */:
                    if (gb7Var.q(i15, obj, i13)) {
                        ((fl1) n07Var.b).r(i15, y(obj, j3));
                    }
                    break;
                case Token.ENUM_INIT_ARRAY /* 65 */:
                    if (gb7Var.q(i15, obj, i13)) {
                        ((fl1) n07Var.b).t(i15, z(obj, j3));
                    }
                    break;
                case Token.ENUM_INIT_VALUES_IN_ORDER /* 66 */:
                    if (gb7Var.q(i15, obj, i13)) {
                        int y = y(obj, j3);
                        ((fl1) n07Var.b).C(i15, (y >> 31) ^ (y << 1));
                    }
                    break;
                case Token.ENUM_NEXT /* 67 */:
                    if (gb7Var.q(i15, obj, i13)) {
                        long z2 = z(obj, j3);
                        ((fl1) n07Var.b).E(i15, (z2 << 1) ^ (z2 >> 63));
                    }
                    break;
                case Token.ENUM_ID /* 68 */:
                    if (gb7Var.q(i15, obj, i13)) {
                        n07Var.s(i15, unsafe.getObject(obj, j3), gb7Var.m(i13));
                    }
                    break;
            }
            i13 += 3;
            i11 = 1048575;
        }
        gb7Var.l.getClass();
        ((qw4) obj).unknownFields.d(n07Var);
    }

    @Override // defpackage.j0a
    public final void a(Object obj, Object obj2) {
        Object obj3;
        if (p(obj)) {
            obj2.getClass();
            int i = 0;
            while (true) {
                int[] iArr = this.a;
                if (i < iArr.length) {
                    int L = L(i);
                    long j = 1048575 & L;
                    int i2 = iArr[i];
                    switch (K(L)) {
                        case 0:
                            if (n(i, obj2)) {
                                dxc dxcVar = gxc.c;
                                obj3 = obj;
                                dxcVar.l(obj3, j, dxcVar.d(obj2, j));
                                G(i, obj3);
                                continue;
                                i += 3;
                                obj = obj3;
                            }
                            break;
                        case 1:
                            if (n(i, obj2)) {
                                dxc dxcVar2 = gxc.c;
                                dxcVar2.m(obj, j, dxcVar2.e(obj2, j));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 2:
                            if (n(i, obj2)) {
                                gxc.n(obj, j, gxc.c.g(obj2, j));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 3:
                            if (n(i, obj2)) {
                                gxc.n(obj, j, gxc.c.g(obj2, j));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 4:
                            if (n(i, obj2)) {
                                gxc.m(j, obj, gxc.c.f(obj2, j));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 5:
                            if (n(i, obj2)) {
                                gxc.n(obj, j, gxc.c.g(obj2, j));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 6:
                            if (n(i, obj2)) {
                                gxc.m(j, obj, gxc.c.f(obj2, j));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 7:
                            if (n(i, obj2)) {
                                dxc dxcVar3 = gxc.c;
                                dxcVar3.j(obj, j, dxcVar3.c(obj2, j));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 8:
                            if (n(i, obj2)) {
                                gxc.o(obj, j, gxc.c.h(obj2, j));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 9:
                            s(i, obj, obj2);
                            break;
                        case 10:
                            if (n(i, obj2)) {
                                gxc.o(obj, j, gxc.c.h(obj2, j));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 11:
                            if (n(i, obj2)) {
                                gxc.m(j, obj, gxc.c.f(obj2, j));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 12:
                            if (n(i, obj2)) {
                                gxc.m(j, obj, gxc.c.f(obj2, j));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 13:
                            if (n(i, obj2)) {
                                gxc.m(j, obj, gxc.c.f(obj2, j));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 14:
                            if (n(i, obj2)) {
                                gxc.n(obj, j, gxc.c.g(obj2, j));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 15:
                            if (n(i, obj2)) {
                                gxc.m(j, obj, gxc.c.f(obj2, j));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 16:
                            if (n(i, obj2)) {
                                gxc.n(obj, j, gxc.c.g(obj2, j));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 17:
                            s(i, obj, obj2);
                            break;
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case Token.GETPROP /* 33 */:
                        case Token.GETPROPNOWARN /* 34 */:
                        case Token.GETPROP_SUPER /* 35 */:
                        case Token.GETPROPNOWARN_SUPER /* 36 */:
                        case Token.SETPROP /* 37 */:
                        case Token.SETPROP_SUPER /* 38 */:
                        case Token.GETELEM /* 39 */:
                        case Token.GETELEM_SUPER /* 40 */:
                        case Token.SETELEM /* 41 */:
                        case Token.SETELEM_SUPER /* 42 */:
                        case Token.CALL /* 43 */:
                        case Token.NAME /* 44 */:
                        case Token.NUMBER /* 45 */:
                        case Token.STRING /* 46 */:
                        case Token.NULL /* 47 */:
                        case Token.THIS /* 48 */:
                        case Token.FALSE /* 49 */:
                            this.k.getClass();
                            dxc dxcVar4 = gxc.c;
                            tz5 tz5Var = (tz5) dxcVar4.h(obj, j);
                            tz5 tz5Var2 = (tz5) dxcVar4.h(obj2, j);
                            int i3 = ((c99) tz5Var).c;
                            int i4 = ((c99) tz5Var2).c;
                            if (i3 > 0 && i4 > 0) {
                                if (!((c99) tz5Var).a) {
                                    tz5Var = ((c99) tz5Var).c(i4 + i3);
                                }
                                ((c99) tz5Var).addAll(tz5Var2);
                            }
                            if (i3 > 0) {
                                tz5Var2 = tz5Var;
                            }
                            gxc.o(obj, j, tz5Var2);
                            break;
                        case Token.TRUE /* 50 */:
                            Class cls = o0a.a;
                            dxc dxcVar5 = gxc.c;
                            Object h = dxcVar5.h(obj, j);
                            Object h2 = dxcVar5.h(obj2, j);
                            this.m.getClass();
                            gxc.o(obj, j, e17.a(h, h2));
                            break;
                        case Token.SHEQ /* 51 */:
                        case Token.SHNE /* 52 */:
                        case Token.REGEXP /* 53 */:
                        case Token.BINDNAME /* 54 */:
                        case Token.THROW /* 55 */:
                        case Token.RETHROW /* 56 */:
                        case Token.IN /* 57 */:
                        case Token.INSTANCEOF /* 58 */:
                        case Token.LOCAL_LOAD /* 59 */:
                            if (q(i2, obj2, i)) {
                                gxc.o(obj, j, gxc.c.h(obj2, j));
                                H(i2, obj, i);
                                break;
                            }
                            break;
                        case Token.GETVAR /* 60 */:
                            t(i, obj, obj2);
                            break;
                        case Token.SETVAR /* 61 */:
                        case Token.CATCH_SCOPE /* 62 */:
                        case Token.ENUM_INIT_KEYS /* 63 */:
                        case Token.ENUM_INIT_VALUES /* 64 */:
                        case Token.ENUM_INIT_ARRAY /* 65 */:
                        case Token.ENUM_INIT_VALUES_IN_ORDER /* 66 */:
                        case Token.ENUM_NEXT /* 67 */:
                            if (q(i2, obj2, i)) {
                                gxc.o(obj, j, gxc.c.h(obj2, j));
                                H(i2, obj, i);
                                break;
                            }
                            break;
                        case Token.ENUM_ID /* 68 */:
                            t(i, obj, obj2);
                            break;
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                } else {
                    o0a.k(this.l, obj, obj2);
                    return;
                }
            }
        } else {
            vs.m(rs8.i(obj, "Mutating immutable message: "));
        }
    }

    @Override // defpackage.j0a
    public final void b(Object obj) {
        if (p(obj)) {
            if (obj instanceof qw4) {
                qw4 qw4Var = (qw4) obj;
                qw4Var.l(Integer.MAX_VALUE);
                qw4Var.memoizedHashCode = 0;
                qw4Var.i();
            }
            int[] iArr = this.a;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int L = L(i);
                long j = 1048575 & L;
                int K = K(L);
                if (K != 9) {
                    if (K != 60 && K != 68) {
                        switch (K) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case Token.GETPROP /* 33 */:
                            case Token.GETPROPNOWARN /* 34 */:
                            case Token.GETPROP_SUPER /* 35 */:
                            case Token.GETPROPNOWARN_SUPER /* 36 */:
                            case Token.SETPROP /* 37 */:
                            case Token.SETPROP_SUPER /* 38 */:
                            case Token.GETELEM /* 39 */:
                            case Token.GETELEM_SUPER /* 40 */:
                            case Token.SETELEM /* 41 */:
                            case Token.SETELEM_SUPER /* 42 */:
                            case Token.CALL /* 43 */:
                            case Token.NAME /* 44 */:
                            case Token.NUMBER /* 45 */:
                            case Token.STRING /* 46 */:
                            case Token.NULL /* 47 */:
                            case Token.THIS /* 48 */:
                            case Token.FALSE /* 49 */:
                                this.k.getClass();
                                c99 c99Var = (c99) ((tz5) gxc.c.h(obj, j));
                                if (c99Var.a) {
                                    c99Var.a = false;
                                    break;
                                } else {
                                    break;
                                }
                            case Token.TRUE /* 50 */:
                                Unsafe unsafe = o;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.m.getClass();
                                    ((b17) object).a = false;
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (q(iArr[i], obj, i)) {
                        m(i).b(o.getObject(obj, j));
                    }
                }
                if (n(i, obj)) {
                    m(i).b(o.getObject(obj, j));
                }
            }
            this.l.getClass();
            bwc bwcVar = ((qw4) obj).unknownFields;
            if (bwcVar.e) {
                bwcVar.e = false;
            }
        }
    }

    @Override // defpackage.j0a
    public final boolean c(Object obj) {
        int i;
        int i2;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.h) {
            int i7 = this.g[i6];
            int[] iArr = this.a;
            int i8 = iArr[i7];
            int L = L(i7);
            int i9 = iArr[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = o.getInt(obj, i10);
                }
                i2 = i7;
                i3 = i5;
                i = i10;
            } else {
                int i12 = i5;
                i = i4;
                i2 = i7;
                i3 = i12;
            }
            if ((268435456 & L) == 0 || o(obj, i2, i, i3, i11)) {
                int K = K(L);
                if (K != 9 && K != 17) {
                    if (K != 27) {
                        if (K != 60 && K != 68) {
                            if (K != 49) {
                                if (K != 50) {
                                    continue;
                                } else {
                                    Object h = gxc.c.h(obj, L & 1048575);
                                    this.m.getClass();
                                    b17 b17Var = (b17) h;
                                    if (b17Var.isEmpty()) {
                                        continue;
                                    } else {
                                        if (((fld) ((w07) this.b[(i2 / 3) * 2]).a.c).a != hld.MESSAGE) {
                                            continue;
                                        } else {
                                            j0a j0aVar = null;
                                            for (Object obj2 : b17Var.values()) {
                                                if (j0aVar == null) {
                                                    j0aVar = z89.c.a(obj2.getClass());
                                                }
                                                if (!j0aVar.c(obj2)) {
                                                }
                                            }
                                            continue;
                                        }
                                    }
                                }
                                i6++;
                                i4 = i;
                                i5 = i3;
                            }
                        } else {
                            if (q(i8, obj, i2)) {
                                if (!m(i2).c(gxc.c.h(obj, L & 1048575))) {
                                }
                            } else {
                                continue;
                            }
                            i6++;
                            i4 = i;
                            i5 = i3;
                        }
                    }
                    List list = (List) gxc.c.h(obj, L & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        j0a m = m(i2);
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            if (m.c(list.get(i13))) {
                            }
                        }
                        continue;
                    }
                    i6++;
                    i4 = i;
                    i5 = i3;
                } else {
                    if (o(obj, i2, i, i3, i11)) {
                        if (!m(i2).c(gxc.c.h(obj, L & 1048575))) {
                        }
                    } else {
                        continue;
                    }
                    i6++;
                    i4 = i;
                    i5 = i3;
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.j0a
    public final qw4 d() {
        this.j.getClass();
        return ((qw4) this.e).j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01ec, code lost:
        if (java.lang.Double.doubleToLongBits(r5.d(r12, r7)) == java.lang.Double.doubleToLongBits(r5.d(r13, r7))) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
        if (defpackage.o0a.l(r9.h(r12, r7), r9.h(r13, r7)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
        if (defpackage.o0a.l(r5.h(r12, r7), r5.h(r13, r7)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008a, code lost:
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009e, code lost:
        if (r5.f(r12, r7) == r5.f(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b4, code lost:
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c8, code lost:
        if (r5.f(r12, r7) == r5.f(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00dc, code lost:
        if (r5.f(r12, r7) == r5.f(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f0, code lost:
        if (r5.f(r12, r7) == r5.f(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0108, code lost:
        if (defpackage.o0a.l(r5.h(r12, r7), r5.h(r13, r7)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0120, code lost:
        if (defpackage.o0a.l(r5.h(r12, r7), r5.h(r13, r7)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0138, code lost:
        if (defpackage.o0a.l(r5.h(r12, r7), r5.h(r13, r7)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x014c, code lost:
        if (r5.c(r12, r7) == r5.c(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0160, code lost:
        if (r5.f(r12, r7) == r5.f(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0176, code lost:
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x018a, code lost:
        if (r5.f(r12, r7) == r5.f(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x019f, code lost:
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01b4, code lost:
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01cf, code lost:
        if (java.lang.Float.floatToIntBits(r5.e(r12, r7)) == java.lang.Float.floatToIntBits(r5.e(r13, r7))) goto L85;
     */
    @Override // defpackage.j0a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(defpackage.qw4 r12, defpackage.qw4 r13) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb7.e(qw4, qw4):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00df, code lost:
        if (r4 != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e1, code lost:
        r8 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e2, code lost:
        r3 = r8 + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0216, code lost:
        if (r4 != false) goto L52;
     */
    @Override // defpackage.j0a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(defpackage.qw4 r12) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb7.f(qw4):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x06b8 A[Catch: all -> 0x0430, TryCatch #1 {all -> 0x0430, blocks: (B:141:0x06b3, B:143:0x06b8, B:144:0x06bd, B:101:0x0416, B:103:0x041d, B:106:0x0433, B:107:0x0446, B:108:0x0459, B:109:0x046c, B:110:0x047f, B:111:0x0493, B:112:0x04a7, B:113:0x04bb, B:114:0x04d4, B:115:0x04f0, B:116:0x050c, B:117:0x0529, B:118:0x0546, B:119:0x0565, B:120:0x0581, B:121:0x0596, B:122:0x05b0, B:123:0x05bd, B:124:0x05db, B:125:0x05f8, B:126:0x0615, B:127:0x0631, B:128:0x064d, B:129:0x0669, B:130:0x0688, B:131:0x069d, B:135:0x06a8), top: B:162:0x06b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x06da A[LOOP:3: B:152:0x06d8->B:153:0x06da, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x06e4  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x06c3 A[SYNTHETIC] */
    @Override // defpackage.j0a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(java.lang.Object r19, defpackage.vh1 r20, defpackage.z54 r21) {
        /*
            Method dump skipped, instructions count: 1926
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb7.g(java.lang.Object, vh1, z54):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.j0a
    public final int h(qw4 qw4Var) {
        int i;
        int h;
        int h2;
        int h3;
        int j;
        int h4;
        int j2;
        int h5;
        int h6;
        int g;
        int f;
        int i2;
        int c;
        int i3;
        int i4;
        int h7;
        int size;
        int i5;
        int h8;
        int h9;
        int h10;
        int size2;
        int h11;
        int i6;
        int i7;
        int i8;
        int i9;
        int j3;
        int size3;
        int i10;
        int j4;
        int size4;
        int i11;
        int h12;
        int h13;
        int h14;
        int j5;
        int h15;
        int j6;
        int h16;
        int g2;
        int i12;
        gb7 gb7Var = this;
        qw4 qw4Var2 = qw4Var;
        Unsafe unsafe = o;
        int i13 = 1048575;
        int i14 = 1048575;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            int[] iArr = gb7Var.a;
            if (i15 < iArr.length) {
                int L = gb7Var.L(i15);
                int K = K(L);
                int i18 = iArr[i15];
                int i19 = iArr[i15 + 2];
                int i20 = i19 & i13;
                int i21 = 1;
                if (K <= 17) {
                    if (i20 != i14) {
                        if (i20 == i13) {
                            i16 = 0;
                        } else {
                            i16 = unsafe.getInt(qw4Var2, i20);
                        }
                        i14 = i20;
                    }
                    i = 1 << (i19 >>> 20);
                } else {
                    i = 0;
                }
                long j7 = L & i13;
                if (K >= hc4.b.a) {
                    int i22 = hc4.c.a;
                }
                char c2 = '?';
                switch (K) {
                    case 0:
                        if (gb7Var.o(qw4Var2, i15, i14, i16, i)) {
                            h = fl1.h(i18) + 8;
                            i17 += h;
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (gb7Var.o(qw4Var2, i15, i14, i16, i)) {
                            h2 = fl1.h(i18);
                            h6 = h2 + 4;
                            i17 += h6;
                        }
                        gb7Var = this;
                        qw4Var2 = qw4Var;
                        break;
                    case 2:
                        if (gb7Var.o(qw4Var2, i15, i14, i16, i)) {
                            long j8 = unsafe.getLong(qw4Var2, j7);
                            h3 = fl1.h(i18);
                            j = fl1.j(j8);
                            i17 += j + h3;
                        }
                        gb7Var = this;
                        break;
                    case 3:
                        if (gb7Var.o(qw4Var2, i15, i14, i16, i)) {
                            long j9 = unsafe.getLong(qw4Var2, j7);
                            h3 = fl1.h(i18);
                            j = fl1.j(j9);
                            i17 += j + h3;
                        }
                        gb7Var = this;
                        break;
                    case 4:
                        if (gb7Var.o(qw4Var2, i15, i14, i16, i)) {
                            int i23 = unsafe.getInt(qw4Var2, j7);
                            h4 = fl1.h(i18);
                            j2 = fl1.j(i23);
                            f = j2 + h4;
                            i17 += f;
                        }
                        gb7Var = this;
                        break;
                    case 5:
                        if (gb7Var.o(qw4Var2, i15, i14, i16, i)) {
                            h5 = fl1.h(i18);
                            h6 = h5 + 8;
                            i17 += h6;
                        }
                        gb7Var = this;
                        qw4Var2 = qw4Var;
                        break;
                    case 6:
                        if (gb7Var.o(qw4Var2, i15, i14, i16, i)) {
                            h2 = fl1.h(i18);
                            h6 = h2 + 4;
                            i17 += h6;
                        }
                        gb7Var = this;
                        qw4Var2 = qw4Var;
                        break;
                    case 7:
                        if (gb7Var.o(qw4Var2, i15, i14, i16, i)) {
                            h6 = fl1.h(i18) + 1;
                            i17 += h6;
                        }
                        gb7Var = this;
                        qw4Var2 = qw4Var;
                        break;
                    case 8:
                        if (gb7Var.o(qw4Var2, i15, i14, i16, i)) {
                            Object object = unsafe.getObject(qw4Var2, j7);
                            if (object instanceof c31) {
                                g = fl1.f(i18, (c31) object);
                            } else {
                                g = fl1.g((String) object) + fl1.h(i18);
                            }
                            i17 = g + i17;
                        }
                        gb7Var = this;
                        break;
                    case 9:
                        if (gb7Var.o(qw4Var2, i15, i14, i16, i)) {
                            Object object2 = unsafe.getObject(qw4Var2, j7);
                            j0a m = gb7Var.m(i15);
                            Class cls = o0a.a;
                            int h17 = fl1.h(i18);
                            int a = ((x2) object2).a(m);
                            i17 += fl1.i(a) + a + h17;
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (gb7Var.o(qw4Var2, i15, i14, i16, i)) {
                            f = fl1.f(i18, (c31) unsafe.getObject(qw4Var2, j7));
                            i17 += f;
                        }
                        gb7Var = this;
                        break;
                    case 11:
                        if (gb7Var.o(qw4Var2, i15, i14, i16, i)) {
                            int i24 = unsafe.getInt(qw4Var2, j7);
                            h4 = fl1.h(i18);
                            j2 = fl1.i(i24);
                            f = j2 + h4;
                            i17 += f;
                        }
                        gb7Var = this;
                        break;
                    case 12:
                        if (gb7Var.o(qw4Var2, i15, i14, i16, i)) {
                            int i25 = unsafe.getInt(qw4Var2, j7);
                            h4 = fl1.h(i18);
                            j2 = fl1.j(i25);
                            f = j2 + h4;
                            i17 += f;
                        }
                        gb7Var = this;
                        break;
                    case 13:
                        if (gb7Var.o(qw4Var2, i15, i14, i16, i)) {
                            h2 = fl1.h(i18);
                            h6 = h2 + 4;
                            i17 += h6;
                        }
                        gb7Var = this;
                        qw4Var2 = qw4Var;
                        break;
                    case 14:
                        if (gb7Var.o(qw4Var2, i15, i14, i16, i)) {
                            h5 = fl1.h(i18);
                            h6 = h5 + 8;
                            i17 += h6;
                        }
                        gb7Var = this;
                        qw4Var2 = qw4Var;
                        break;
                    case 15:
                        if (gb7Var.o(qw4Var2, i15, i14, i16, i)) {
                            int i26 = unsafe.getInt(qw4Var2, j7);
                            h4 = fl1.h(i18);
                            j2 = fl1.i((i26 >> 31) ^ (i26 << 1));
                            f = j2 + h4;
                            i17 += f;
                        }
                        gb7Var = this;
                        break;
                    case 16:
                        if (gb7Var.o(qw4Var2, i15, i14, i16, i)) {
                            long j10 = unsafe.getLong(qw4Var2, j7);
                            h3 = fl1.h(i18);
                            j = fl1.j((j10 >> 63) ^ (j10 << 1));
                            i17 += j + h3;
                        }
                        gb7Var = this;
                        break;
                    case 17:
                        if (gb7Var.o(qw4Var2, i15, i14, i16, i)) {
                            h = ((x2) unsafe.getObject(qw4Var2, j7)).a(gb7Var.m(i15)) + (fl1.h(i18) * 2);
                            i17 += h;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        i2 = i14;
                        c = o0a.c(i18, (List) unsafe.getObject(qw4Var2, j7));
                        i17 += c;
                        i14 = i2;
                        break;
                    case 19:
                        i2 = i14;
                        c = o0a.b(i18, (List) unsafe.getObject(qw4Var2, j7));
                        i17 += c;
                        i14 = i2;
                        break;
                    case 20:
                        i2 = i14;
                        i3 = i16;
                        i4 = 0;
                        List list = (List) unsafe.getObject(qw4Var2, j7);
                        Class cls2 = o0a.a;
                        if (list.size() != 0) {
                            h7 = (fl1.h(i18) * list.size()) + o0a.e(list);
                            i17 += h7;
                            i16 = i3;
                            i14 = i2;
                            break;
                        }
                        h7 = i4;
                        i17 += h7;
                        i16 = i3;
                        i14 = i2;
                    case 21:
                        i2 = i14;
                        i3 = i16;
                        i4 = 0;
                        List list2 = (List) unsafe.getObject(qw4Var2, j7);
                        Class cls3 = o0a.a;
                        size = list2.size();
                        if (size != 0) {
                            i5 = o0a.i(list2);
                            h8 = fl1.h(i18);
                            h7 = (h8 * size) + i5;
                            i17 += h7;
                            i16 = i3;
                            i14 = i2;
                            break;
                        }
                        h7 = i4;
                        i17 += h7;
                        i16 = i3;
                        i14 = i2;
                    case 22:
                        i2 = i14;
                        i3 = i16;
                        i4 = 0;
                        List list3 = (List) unsafe.getObject(qw4Var2, j7);
                        Class cls4 = o0a.a;
                        size = list3.size();
                        if (size != 0) {
                            i5 = o0a.d(list3);
                            h8 = fl1.h(i18);
                            h7 = (h8 * size) + i5;
                            i17 += h7;
                            i16 = i3;
                            i14 = i2;
                            break;
                        }
                        h7 = i4;
                        i17 += h7;
                        i16 = i3;
                        i14 = i2;
                    case 23:
                        i2 = i14;
                        c = o0a.c(i18, (List) unsafe.getObject(qw4Var2, j7));
                        i17 += c;
                        i14 = i2;
                        break;
                    case 24:
                        i2 = i14;
                        c = o0a.b(i18, (List) unsafe.getObject(qw4Var2, j7));
                        i17 += c;
                        i14 = i2;
                        break;
                    case 25:
                        i2 = i14;
                        i3 = i16;
                        Class cls5 = o0a.a;
                        int size5 = ((List) unsafe.getObject(qw4Var2, j7)).size();
                        if (size5 == 0) {
                            h9 = 0;
                        } else {
                            h9 = (fl1.h(i18) + 1) * size5;
                        }
                        i17 += h9;
                        i16 = i3;
                        i14 = i2;
                        break;
                    case 26:
                        i2 = i14;
                        i3 = i16;
                        i4 = 0;
                        List list4 = (List) unsafe.getObject(qw4Var2, j7);
                        Class cls6 = o0a.a;
                        int size6 = list4.size();
                        if (size6 != 0) {
                            h7 = fl1.h(i18) * size6;
                            for (int i27 = 0; i27 < size6; i27++) {
                                Object obj = list4.get(i27);
                                if (obj instanceof c31) {
                                    int size7 = ((c31) obj).size();
                                    h7 = fl1.i(size7) + size7 + h7;
                                } else {
                                    h7 = fl1.g((String) obj) + h7;
                                }
                            }
                            i17 += h7;
                            i16 = i3;
                            i14 = i2;
                            break;
                        }
                        h7 = i4;
                        i17 += h7;
                        i16 = i3;
                        i14 = i2;
                    case 27:
                        i2 = i14;
                        i3 = i16;
                        List list5 = (List) unsafe.getObject(qw4Var2, j7);
                        j0a m2 = gb7Var.m(i15);
                        Class cls7 = o0a.a;
                        int size8 = list5.size();
                        if (size8 == 0) {
                            h10 = 0;
                        } else {
                            h10 = fl1.h(i18) * size8;
                            for (int i28 = 0; i28 < size8; i28++) {
                                int a2 = ((x2) list5.get(i28)).a(m2);
                                h10 += fl1.i(a2) + a2;
                            }
                        }
                        i17 += h10;
                        i16 = i3;
                        i14 = i2;
                        break;
                    case 28:
                        i2 = i14;
                        i3 = i16;
                        i4 = 0;
                        List list6 = (List) unsafe.getObject(qw4Var2, j7);
                        Class cls8 = o0a.a;
                        int size9 = list6.size();
                        if (size9 != 0) {
                            h7 = fl1.h(i18) * size9;
                            for (int i29 = 0; i29 < list6.size(); i29++) {
                                int size10 = ((c31) list6.get(i29)).size();
                                h7 += fl1.i(size10) + size10;
                            }
                            i17 += h7;
                            i16 = i3;
                            i14 = i2;
                            break;
                        }
                        h7 = i4;
                        i17 += h7;
                        i16 = i3;
                        i14 = i2;
                    case 29:
                        i2 = i14;
                        i3 = i16;
                        i4 = 0;
                        List list7 = (List) unsafe.getObject(qw4Var2, j7);
                        Class cls9 = o0a.a;
                        size = list7.size();
                        if (size != 0) {
                            i5 = o0a.h(list7);
                            h8 = fl1.h(i18);
                            h7 = (h8 * size) + i5;
                            i17 += h7;
                            i16 = i3;
                            i14 = i2;
                            break;
                        }
                        h7 = i4;
                        i17 += h7;
                        i16 = i3;
                        i14 = i2;
                    case 30:
                        i2 = i14;
                        i3 = i16;
                        i4 = 0;
                        List list8 = (List) unsafe.getObject(qw4Var2, j7);
                        Class cls10 = o0a.a;
                        size = list8.size();
                        if (size != 0) {
                            i5 = o0a.a(list8);
                            h8 = fl1.h(i18);
                            h7 = (h8 * size) + i5;
                            i17 += h7;
                            i16 = i3;
                            i14 = i2;
                            break;
                        }
                        h7 = i4;
                        i17 += h7;
                        i16 = i3;
                        i14 = i2;
                    case 31:
                        i2 = i14;
                        c = o0a.b(i18, (List) unsafe.getObject(qw4Var2, j7));
                        i17 += c;
                        i14 = i2;
                        break;
                    case 32:
                        i2 = i14;
                        c = o0a.c(i18, (List) unsafe.getObject(qw4Var2, j7));
                        i17 += c;
                        i14 = i2;
                        break;
                    case Token.GETPROP /* 33 */:
                        i2 = i14;
                        i3 = i16;
                        i4 = 0;
                        List list9 = (List) unsafe.getObject(qw4Var2, j7);
                        Class cls11 = o0a.a;
                        size = list9.size();
                        if (size != 0) {
                            i5 = o0a.f(list9);
                            h8 = fl1.h(i18);
                            h7 = (h8 * size) + i5;
                            i17 += h7;
                            i16 = i3;
                            i14 = i2;
                            break;
                        }
                        h7 = i4;
                        i17 += h7;
                        i16 = i3;
                        i14 = i2;
                    case Token.GETPROPNOWARN /* 34 */:
                        i2 = i14;
                        i3 = i16;
                        i4 = 0;
                        List list10 = (List) unsafe.getObject(qw4Var2, j7);
                        Class cls12 = o0a.a;
                        size = list10.size();
                        if (size != 0) {
                            i5 = o0a.g(list10);
                            h8 = fl1.h(i18);
                            h7 = (h8 * size) + i5;
                            i17 += h7;
                            i16 = i3;
                            i14 = i2;
                            break;
                        }
                        h7 = i4;
                        i17 += h7;
                        i16 = i3;
                        i14 = i2;
                    case Token.GETPROP_SUPER /* 35 */:
                        i2 = i14;
                        i3 = i16;
                        Class cls13 = o0a.a;
                        size2 = ((List) unsafe.getObject(qw4Var2, j7)).size() * 8;
                        if (size2 > 0) {
                            h11 = fl1.h(i18);
                            i6 = fl1.i(size2);
                            i17 += i6 + h11 + size2;
                        }
                        i16 = i3;
                        i14 = i2;
                        break;
                    case Token.GETPROPNOWARN_SUPER /* 36 */:
                        i2 = i14;
                        i3 = i16;
                        Class cls14 = o0a.a;
                        size2 = ((List) unsafe.getObject(qw4Var2, j7)).size() * 4;
                        if (size2 > 0) {
                            h11 = fl1.h(i18);
                            i6 = fl1.i(size2);
                            i17 += i6 + h11 + size2;
                        }
                        i16 = i3;
                        i14 = i2;
                        break;
                    case Token.SETPROP /* 37 */:
                        i2 = i14;
                        i3 = i16;
                        size2 = o0a.e((List) unsafe.getObject(qw4Var2, j7));
                        if (size2 > 0) {
                            h11 = fl1.h(i18);
                            i6 = fl1.i(size2);
                            i17 += i6 + h11 + size2;
                        }
                        i16 = i3;
                        i14 = i2;
                        break;
                    case Token.SETPROP_SUPER /* 38 */:
                        i2 = i14;
                        i3 = i16;
                        size2 = o0a.i((List) unsafe.getObject(qw4Var2, j7));
                        if (size2 > 0) {
                            h11 = fl1.h(i18);
                            i6 = fl1.i(size2);
                            i17 += i6 + h11 + size2;
                        }
                        i16 = i3;
                        i14 = i2;
                        break;
                    case Token.GETELEM /* 39 */:
                        i2 = i14;
                        i3 = i16;
                        size2 = o0a.d((List) unsafe.getObject(qw4Var2, j7));
                        if (size2 > 0) {
                            h11 = fl1.h(i18);
                            i6 = fl1.i(size2);
                            i17 += i6 + h11 + size2;
                        }
                        i16 = i3;
                        i14 = i2;
                        break;
                    case Token.GETELEM_SUPER /* 40 */:
                        i2 = i14;
                        i3 = i16;
                        Class cls15 = o0a.a;
                        size2 = ((List) unsafe.getObject(qw4Var2, j7)).size() * 8;
                        if (size2 > 0) {
                            h11 = fl1.h(i18);
                            i6 = fl1.i(size2);
                            i17 += i6 + h11 + size2;
                        }
                        i16 = i3;
                        i14 = i2;
                        break;
                    case Token.SETELEM /* 41 */:
                        i2 = i14;
                        i3 = i16;
                        Class cls16 = o0a.a;
                        size2 = ((List) unsafe.getObject(qw4Var2, j7)).size() * 4;
                        if (size2 > 0) {
                            h11 = fl1.h(i18);
                            i6 = fl1.i(size2);
                            i17 += i6 + h11 + size2;
                        }
                        i16 = i3;
                        i14 = i2;
                        break;
                    case Token.SETELEM_SUPER /* 42 */:
                        i2 = i14;
                        i3 = i16;
                        Class cls17 = o0a.a;
                        size2 = ((List) unsafe.getObject(qw4Var2, j7)).size();
                        if (size2 > 0) {
                            h11 = fl1.h(i18);
                            i6 = fl1.i(size2);
                            i17 += i6 + h11 + size2;
                        }
                        i16 = i3;
                        i14 = i2;
                        break;
                    case Token.CALL /* 43 */:
                        i2 = i14;
                        i3 = i16;
                        size2 = o0a.h((List) unsafe.getObject(qw4Var2, j7));
                        if (size2 > 0) {
                            h11 = fl1.h(i18);
                            i6 = fl1.i(size2);
                            i17 += i6 + h11 + size2;
                        }
                        i16 = i3;
                        i14 = i2;
                        break;
                    case Token.NAME /* 44 */:
                        i2 = i14;
                        i3 = i16;
                        size2 = o0a.a((List) unsafe.getObject(qw4Var2, j7));
                        if (size2 > 0) {
                            h11 = fl1.h(i18);
                            i6 = fl1.i(size2);
                            i17 += i6 + h11 + size2;
                        }
                        i16 = i3;
                        i14 = i2;
                        break;
                    case Token.NUMBER /* 45 */:
                        i2 = i14;
                        i3 = i16;
                        Class cls18 = o0a.a;
                        size2 = ((List) unsafe.getObject(qw4Var2, j7)).size() * 4;
                        if (size2 > 0) {
                            h11 = fl1.h(i18);
                            i6 = fl1.i(size2);
                            i17 += i6 + h11 + size2;
                        }
                        i16 = i3;
                        i14 = i2;
                        break;
                    case Token.STRING /* 46 */:
                        i2 = i14;
                        i3 = i16;
                        Class cls19 = o0a.a;
                        size2 = ((List) unsafe.getObject(qw4Var2, j7)).size() * 8;
                        if (size2 > 0) {
                            h11 = fl1.h(i18);
                            i6 = fl1.i(size2);
                            i17 += i6 + h11 + size2;
                        }
                        i16 = i3;
                        i14 = i2;
                        break;
                    case Token.NULL /* 47 */:
                        i2 = i14;
                        i3 = i16;
                        size2 = o0a.f((List) unsafe.getObject(qw4Var2, j7));
                        if (size2 > 0) {
                            h11 = fl1.h(i18);
                            i6 = fl1.i(size2);
                            i17 += i6 + h11 + size2;
                        }
                        i16 = i3;
                        i14 = i2;
                        break;
                    case Token.THIS /* 48 */:
                        i2 = i14;
                        i3 = i16;
                        size2 = o0a.g((List) unsafe.getObject(qw4Var2, j7));
                        if (size2 > 0) {
                            h11 = fl1.h(i18);
                            i6 = fl1.i(size2);
                            i17 += i6 + h11 + size2;
                        }
                        i16 = i3;
                        i14 = i2;
                        break;
                    case Token.FALSE /* 49 */:
                        i2 = i14;
                        i3 = i16;
                        List list11 = (List) unsafe.getObject(qw4Var2, j7);
                        j0a m3 = gb7Var.m(i15);
                        Class cls20 = o0a.a;
                        int size11 = list11.size();
                        if (size11 == 0) {
                            i7 = 0;
                        } else {
                            i7 = 0;
                            for (int i30 = 0; i30 < size11; i30++) {
                                i7 += ((x2) list11.get(i30)).a(m3) + (fl1.h(i18) * 2);
                            }
                        }
                        i17 += i7;
                        i16 = i3;
                        i14 = i2;
                        break;
                    case Token.TRUE /* 50 */:
                        Object object3 = unsafe.getObject(qw4Var2, j7);
                        Object obj2 = gb7Var.b[(i15 / 3) * 2];
                        gb7Var.m.getClass();
                        b17 b17Var = (b17) object3;
                        w07 w07Var = (w07) obj2;
                        if (b17Var.isEmpty()) {
                            i8 = 0;
                        } else {
                            i8 = 0;
                            for (Map.Entry entry : b17Var.entrySet()) {
                                Object key = entry.getKey();
                                Object value = entry.getValue();
                                w07Var.getClass();
                                int h18 = fl1.h(i18);
                                zg4 zg4Var = w07Var.a;
                                char c3 = c2;
                                fld fldVar = (fld) zg4Var.b;
                                int i31 = ec4.c;
                                int h19 = fl1.h(i21);
                                int i32 = i21;
                                zkd zkdVar = fld.d;
                                if (fldVar == zkdVar) {
                                    h19 *= 2;
                                }
                                int i33 = i14;
                                switch (fldVar.ordinal()) {
                                    case 0:
                                        i9 = i16;
                                        ((Double) key).getClass();
                                        j3 = 8;
                                        break;
                                    case 1:
                                        i9 = i16;
                                        ((Float) key).getClass();
                                        j3 = 4;
                                        break;
                                    case 2:
                                        i9 = i16;
                                        j3 = fl1.j(((Long) key).longValue());
                                        break;
                                    case 3:
                                        i9 = i16;
                                        j3 = fl1.j(((Long) key).longValue());
                                        break;
                                    case 4:
                                        i9 = i16;
                                        j3 = fl1.j(((Integer) key).intValue());
                                        break;
                                    case 5:
                                        i9 = i16;
                                        ((Long) key).getClass();
                                        j3 = 8;
                                        break;
                                    case 6:
                                        i9 = i16;
                                        ((Integer) key).getClass();
                                        j3 = 4;
                                        break;
                                    case 7:
                                        i9 = i16;
                                        ((Boolean) key).getClass();
                                        j3 = i32;
                                        break;
                                    case 8:
                                        i9 = i16;
                                        if (key instanceof c31) {
                                            size3 = ((c31) key).size();
                                            i10 = fl1.i(size3);
                                            j3 = i10 + size3;
                                            break;
                                        } else {
                                            j3 = fl1.g((String) key);
                                            break;
                                        }
                                    case 9:
                                        i9 = i16;
                                        j3 = ((qw4) ((x2) key)).a(null);
                                        break;
                                    case 10:
                                        i9 = i16;
                                        int a3 = ((qw4) ((x2) key)).a(null);
                                        j3 = fl1.i(a3) + a3;
                                        break;
                                    case 11:
                                        i9 = i16;
                                        if (key instanceof c31) {
                                            size3 = ((c31) key).size();
                                            i10 = fl1.i(size3);
                                        } else {
                                            size3 = ((byte[]) key).length;
                                            i10 = fl1.i(size3);
                                        }
                                        j3 = i10 + size3;
                                        break;
                                    case 12:
                                        i9 = i16;
                                        j3 = fl1.i(((Integer) key).intValue());
                                        break;
                                    case 13:
                                        i9 = i16;
                                        j3 = fl1.j(((Integer) key).intValue());
                                        break;
                                    case 14:
                                        ((Integer) key).getClass();
                                        i9 = i16;
                                        j3 = 4;
                                        break;
                                    case 15:
                                        ((Long) key).getClass();
                                        i9 = i16;
                                        j3 = 8;
                                        break;
                                    case 16:
                                        int intValue = ((Integer) key).intValue();
                                        j3 = fl1.i((intValue >> 31) ^ (intValue << 1));
                                        i9 = i16;
                                        break;
                                    case 17:
                                        long longValue = ((Long) key).longValue();
                                        j3 = fl1.j((longValue << i32) ^ (longValue >> c3));
                                        i9 = i16;
                                        break;
                                    default:
                                        cy7.e("There is no way to get here, but the compiler thinks otherwise.");
                                        return 0;
                                }
                                int i34 = j3 + h19;
                                fld fldVar2 = (fld) zg4Var.c;
                                int h20 = fl1.h(2);
                                if (fldVar2 == zkdVar) {
                                    h20 *= 2;
                                }
                                switch (fldVar2.ordinal()) {
                                    case 0:
                                        ((Double) value).getClass();
                                        j4 = 8;
                                        break;
                                    case 1:
                                        ((Float) value).getClass();
                                        j4 = 4;
                                        break;
                                    case 2:
                                        j4 = fl1.j(((Long) value).longValue());
                                        break;
                                    case 3:
                                        j4 = fl1.j(((Long) value).longValue());
                                        break;
                                    case 4:
                                        j4 = fl1.j(((Integer) value).intValue());
                                        break;
                                    case 5:
                                        ((Long) value).getClass();
                                        j4 = 8;
                                        break;
                                    case 6:
                                        ((Integer) value).getClass();
                                        j4 = 4;
                                        break;
                                    case 7:
                                        ((Boolean) value).getClass();
                                        j4 = i32;
                                        break;
                                    case 8:
                                        if (value instanceof c31) {
                                            size4 = ((c31) value).size();
                                            i11 = fl1.i(size4);
                                            j4 = size4 + i11;
                                            break;
                                        } else {
                                            j4 = fl1.g((String) value);
                                            break;
                                        }
                                    case 9:
                                        j4 = ((qw4) ((x2) value)).a(null);
                                        break;
                                    case 10:
                                        size4 = ((qw4) ((x2) value)).a(null);
                                        i11 = fl1.i(size4);
                                        j4 = size4 + i11;
                                        break;
                                    case 11:
                                        if (value instanceof c31) {
                                            size4 = ((c31) value).size();
                                            i11 = fl1.i(size4);
                                        } else {
                                            size4 = ((byte[]) value).length;
                                            i11 = fl1.i(size4);
                                        }
                                        j4 = size4 + i11;
                                        break;
                                    case 12:
                                        j4 = fl1.i(((Integer) value).intValue());
                                        break;
                                    case 13:
                                        j4 = fl1.j(((Integer) value).intValue());
                                        break;
                                    case 14:
                                        ((Integer) value).getClass();
                                        j4 = 4;
                                        break;
                                    case 15:
                                        ((Long) value).getClass();
                                        j4 = 8;
                                        break;
                                    case 16:
                                        int intValue2 = ((Integer) value).intValue();
                                        j4 = fl1.i((intValue2 >> 31) ^ (intValue2 << 1));
                                        break;
                                    case 17:
                                        long longValue2 = ((Long) value).longValue();
                                        j4 = fl1.j((longValue2 << i32) ^ (longValue2 >> c3));
                                        break;
                                    default:
                                        cy7.e("There is no way to get here, but the compiler thinks otherwise.");
                                        return 0;
                                }
                                int i35 = j4 + h20 + i34;
                                i8 += fl1.i(i35) + i35 + h18;
                                i16 = i9;
                                c2 = c3;
                                i21 = i32;
                                i14 = i33;
                            }
                        }
                        i2 = i14;
                        i3 = i16;
                        i17 += i8;
                        i16 = i3;
                        i14 = i2;
                        break;
                    case Token.SHEQ /* 51 */:
                        if (gb7Var.q(i18, qw4Var2, i15)) {
                            h12 = fl1.h(i18);
                            h16 = h12 + 8;
                            i17 += h16;
                        }
                        break;
                    case Token.SHNE /* 52 */:
                        if (gb7Var.q(i18, qw4Var2, i15)) {
                            h13 = fl1.h(i18);
                            h16 = h13 + 4;
                            i17 += h16;
                        }
                        break;
                    case Token.REGEXP /* 53 */:
                        if (gb7Var.q(i18, qw4Var2, i15)) {
                            long z = z(qw4Var2, j7);
                            h14 = fl1.h(i18);
                            j5 = fl1.j(z);
                            i12 = j5 + h14;
                            i17 += i12;
                        }
                        break;
                    case Token.BINDNAME /* 54 */:
                        if (gb7Var.q(i18, qw4Var2, i15)) {
                            long z2 = z(qw4Var2, j7);
                            h14 = fl1.h(i18);
                            j5 = fl1.j(z2);
                            i12 = j5 + h14;
                            i17 += i12;
                        }
                        break;
                    case Token.THROW /* 55 */:
                        if (gb7Var.q(i18, qw4Var2, i15)) {
                            int y = y(qw4Var2, j7);
                            h15 = fl1.h(i18);
                            j6 = fl1.j(y);
                            h16 = j6 + h15;
                            i17 += h16;
                        }
                        break;
                    case Token.RETHROW /* 56 */:
                        if (gb7Var.q(i18, qw4Var2, i15)) {
                            h12 = fl1.h(i18);
                            h16 = h12 + 8;
                            i17 += h16;
                        }
                        break;
                    case Token.IN /* 57 */:
                        if (gb7Var.q(i18, qw4Var2, i15)) {
                            h13 = fl1.h(i18);
                            h16 = h13 + 4;
                            i17 += h16;
                        }
                        break;
                    case Token.INSTANCEOF /* 58 */:
                        if (gb7Var.q(i18, qw4Var2, i15)) {
                            h16 = fl1.h(i18) + 1;
                            i17 += h16;
                        }
                        break;
                    case Token.LOCAL_LOAD /* 59 */:
                        if (gb7Var.q(i18, qw4Var2, i15)) {
                            Object object4 = unsafe.getObject(qw4Var2, j7);
                            if (object4 instanceof c31) {
                                g2 = fl1.f(i18, (c31) object4);
                            } else {
                                g2 = fl1.g((String) object4) + fl1.h(i18);
                            }
                            i17 = g2 + i17;
                        }
                        break;
                    case Token.GETVAR /* 60 */:
                        if (gb7Var.q(i18, qw4Var2, i15)) {
                            Object object5 = unsafe.getObject(qw4Var2, j7);
                            j0a m4 = gb7Var.m(i15);
                            Class cls21 = o0a.a;
                            int h21 = fl1.h(i18);
                            int a4 = ((x2) object5).a(m4);
                            i12 = fl1.i(a4) + a4 + h21;
                            i17 += i12;
                        }
                        break;
                    case Token.SETVAR /* 61 */:
                        if (gb7Var.q(i18, qw4Var2, i15)) {
                            h16 = fl1.f(i18, (c31) unsafe.getObject(qw4Var2, j7));
                            i17 += h16;
                        }
                        break;
                    case Token.CATCH_SCOPE /* 62 */:
                        if (gb7Var.q(i18, qw4Var2, i15)) {
                            int y2 = y(qw4Var2, j7);
                            h15 = fl1.h(i18);
                            j6 = fl1.i(y2);
                            h16 = j6 + h15;
                            i17 += h16;
                        }
                        break;
                    case Token.ENUM_INIT_KEYS /* 63 */:
                        if (gb7Var.q(i18, qw4Var2, i15)) {
                            int y3 = y(qw4Var2, j7);
                            h15 = fl1.h(i18);
                            j6 = fl1.j(y3);
                            h16 = j6 + h15;
                            i17 += h16;
                        }
                        break;
                    case Token.ENUM_INIT_VALUES /* 64 */:
                        if (gb7Var.q(i18, qw4Var2, i15)) {
                            h13 = fl1.h(i18);
                            h16 = h13 + 4;
                            i17 += h16;
                        }
                        break;
                    case Token.ENUM_INIT_ARRAY /* 65 */:
                        if (gb7Var.q(i18, qw4Var2, i15)) {
                            h12 = fl1.h(i18);
                            h16 = h12 + 8;
                            i17 += h16;
                        }
                        break;
                    case Token.ENUM_INIT_VALUES_IN_ORDER /* 66 */:
                        if (gb7Var.q(i18, qw4Var2, i15)) {
                            int y4 = y(qw4Var2, j7);
                            h15 = fl1.h(i18);
                            j6 = fl1.i((y4 >> 31) ^ (y4 << 1));
                            h16 = j6 + h15;
                            i17 += h16;
                        }
                        break;
                    case Token.ENUM_NEXT /* 67 */:
                        if (gb7Var.q(i18, qw4Var2, i15)) {
                            long z3 = z(qw4Var2, j7);
                            h14 = fl1.h(i18);
                            j5 = fl1.j((z3 << 1) ^ (z3 >> 63));
                            i12 = j5 + h14;
                            i17 += i12;
                        }
                        break;
                    case Token.ENUM_ID /* 68 */:
                        if (gb7Var.q(i18, qw4Var2, i15)) {
                            h16 = ((x2) unsafe.getObject(qw4Var2, j7)).a(gb7Var.m(i15)) + (fl1.h(i18) * 2);
                            i17 += h16;
                        }
                        break;
                }
                i15 += 3;
                i13 = 1048575;
            } else {
                gb7Var.l.getClass();
                return qw4Var2.unknownFields.b() + i17;
            }
        }
    }

    @Override // defpackage.j0a
    public final void i(Object obj, n07 n07Var) {
        n07Var.getClass();
        M(obj, n07Var);
    }

    public final boolean j(qw4 qw4Var, qw4 qw4Var2, int i) {
        if (n(i, qw4Var) == n(i, qw4Var2)) {
            return true;
        }
        return false;
    }

    public final void k(int i, Object obj, Object obj2) {
        int i2 = this.a[i];
        if (gxc.c.h(obj, L(i) & 1048575) == null) {
            return;
        }
        l(i);
    }

    public final void l(int i) {
        if (this.b[hl5.b(i, 3, 2, 1)] == null) {
            return;
        }
        vm1.h();
    }

    public final j0a m(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        j0a j0aVar = (j0a) objArr[i2];
        if (j0aVar != null) {
            return j0aVar;
        }
        j0a a = z89.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = a;
        return a;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0110 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0111 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n(int r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb7.n(int, java.lang.Object):boolean");
    }

    public final boolean o(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return n(i, obj);
        }
        if ((i3 & i4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean q(int i, Object obj, int i2) {
        if (gxc.c.f(obj, this.a[i2 + 2] & 1048575) == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009f, code lost:
        r9.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a2, code lost:
        r10.h(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a5, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(java.lang.Object r8, int r9, java.lang.Object r10, defpackage.z54 r11, defpackage.vh1 r12) {
        /*
            r7 = this;
            int r9 = r7.L(r9)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r9 & r0
            long r0 = (long) r9
            dxc r9 = defpackage.gxc.c
            java.lang.Object r9 = r9.h(r8, r0)
            e17 r7 = r7.m
            if (r9 != 0) goto L20
            r7.getClass()
            b17 r9 = defpackage.b17.b
            b17 r9 = r9.b()
            defpackage.gxc.o(r8, r0, r9)
            goto L37
        L20:
            r7.getClass()
            r2 = r9
            b17 r2 = (defpackage.b17) r2
            boolean r2 = r2.a
            if (r2 != 0) goto L37
            b17 r2 = defpackage.b17.b
            b17 r2 = r2.b()
            defpackage.e17.a(r2, r9)
            defpackage.gxc.o(r8, r0, r2)
            r9 = r2
        L37:
            r7.getClass()
            b17 r9 = (defpackage.b17) r9
            w07 r10 = (defpackage.w07) r10
            zg4 r7 = r10.a
            r8 = 2
            r12.n0(r8)
            java.lang.Object r10 = r12.e
            xb1 r10 = (defpackage.xb1) r10
            int r0 = r10.C()
            int r0 = r10.j(r0)
            java.lang.Object r1 = r7.d
            java.lang.String r2 = ""
            r3 = r1
        L55:
            int r4 = r12.b()     // Catch: java.lang.Throwable -> L79
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L9f
            boolean r5 = r10.c()     // Catch: java.lang.Throwable -> L79
            if (r5 == 0) goto L65
            goto L9f
        L65:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L88
            if (r4 == r8) goto L7b
            boolean r4 = r12.o0()     // Catch: java.lang.Throwable -> L79 defpackage.n16 -> L92
            if (r4 == 0) goto L73
            goto L55
        L73:
            q16 r4 = new q16     // Catch: java.lang.Throwable -> L79 defpackage.n16 -> L92
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L79 defpackage.n16 -> L92
            throw r4     // Catch: java.lang.Throwable -> L79 defpackage.n16 -> L92
        L79:
            r7 = move-exception
            goto La6
        L7b:
            java.lang.Object r4 = r7.c     // Catch: java.lang.Throwable -> L79 defpackage.n16 -> L92
            fld r4 = (defpackage.fld) r4     // Catch: java.lang.Throwable -> L79 defpackage.n16 -> L92
            java.lang.Class r5 = r1.getClass()     // Catch: java.lang.Throwable -> L79 defpackage.n16 -> L92
            java.lang.Object r3 = r12.B(r4, r5, r11)     // Catch: java.lang.Throwable -> L79 defpackage.n16 -> L92
            goto L55
        L88:
            java.lang.Object r4 = r7.b     // Catch: java.lang.Throwable -> L79 defpackage.n16 -> L92
            fld r4 = (defpackage.fld) r4     // Catch: java.lang.Throwable -> L79 defpackage.n16 -> L92
            r5 = 0
            java.lang.Object r2 = r12.B(r4, r5, r5)     // Catch: java.lang.Throwable -> L79 defpackage.n16 -> L92
            goto L55
        L92:
            boolean r4 = r12.o0()     // Catch: java.lang.Throwable -> L79
            if (r4 == 0) goto L99
            goto L55
        L99:
            q16 r7 = new q16     // Catch: java.lang.Throwable -> L79
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L79
            throw r7     // Catch: java.lang.Throwable -> L79
        L9f:
            r9.put(r2, r3)     // Catch: java.lang.Throwable -> L79
            r10.h(r0)
            return
        La6:
            r10.h(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb7.r(java.lang.Object, int, java.lang.Object, z54, vh1):void");
    }

    public final void s(int i, Object obj, Object obj2) {
        if (!n(i, obj2)) {
            return;
        }
        long L = L(i) & 1048575;
        Unsafe unsafe = o;
        Object object = unsafe.getObject(obj2, L);
        if (object != null) {
            j0a m = m(i);
            if (!n(i, obj)) {
                if (!p(object)) {
                    unsafe.putObject(obj, L, object);
                } else {
                    qw4 d = m.d();
                    m.a(d, object);
                    unsafe.putObject(obj, L, d);
                }
                G(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, L);
            if (!p(object2)) {
                qw4 d2 = m.d();
                m.a(d2, object2);
                unsafe.putObject(obj, L, d2);
                object2 = d2;
            }
            m.a(object2, object);
            return;
        }
        xk5.i(this.a[i], obj2);
    }

    public final void t(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (!q(i2, obj2, i)) {
            return;
        }
        long L = L(i) & 1048575;
        Unsafe unsafe = o;
        Object object = unsafe.getObject(obj2, L);
        if (object != null) {
            j0a m = m(i);
            if (!q(i2, obj, i)) {
                if (!p(object)) {
                    unsafe.putObject(obj, L, object);
                } else {
                    qw4 d = m.d();
                    m.a(d, object);
                    unsafe.putObject(obj, L, d);
                }
                H(i2, obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, L);
            if (!p(object2)) {
                qw4 d2 = m.d();
                m.a(d2, object2);
                unsafe.putObject(obj, L, d2);
                object2 = d2;
            }
            m.a(object2, object);
            return;
        }
        xk5.i(iArr[i], obj2);
    }

    public final Object u(int i, Object obj) {
        j0a m = m(i);
        long L = L(i) & 1048575;
        if (!n(i, obj)) {
            return m.d();
        }
        Object object = o.getObject(obj, L);
        if (p(object)) {
            return object;
        }
        qw4 d = m.d();
        if (object != null) {
            m.a(d, object);
        }
        return d;
    }

    public final Object v(int i, Object obj, int i2) {
        j0a m = m(i2);
        if (!q(i, obj, i2)) {
            return m.d();
        }
        Object object = o.getObject(obj, L(i2) & 1048575);
        if (p(object)) {
            return object;
        }
        qw4 d = m.d();
        if (object != null) {
            m.a(d, object);
        }
        return d;
    }
}

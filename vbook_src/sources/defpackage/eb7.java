package defpackage;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.mozilla.javascript.Token;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: eb7  reason: default package */
/* loaded from: classes.dex */
public final class eb7 implements h0a {
    public static final int[] n = new int[0];
    public static final Unsafe o = exc.i();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final w2 e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;
    public final g28 j;
    public final pq6 k;
    public final cwc l;
    public final c17 m;

    public eb7(int[] iArr, Object[] objArr, int i, int i2, w2 w2Var, int[] iArr2, int i3, int i4, g28 g28Var, pq6 pq6Var, cwc cwcVar, n74 n74Var, c17 c17Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = w2Var instanceof ow4;
        this.g = iArr2;
        this.h = i3;
        this.i = i4;
        this.j = g28Var;
        this.k = pq6Var;
        this.l = cwcVar;
        this.e = w2Var;
        this.m = c17Var;
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
        if (obj instanceof ow4) {
            return ((ow4) obj).f();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.eb7 w(defpackage.ch9 r36, defpackage.g28 r37, defpackage.pq6 r38, defpackage.cwc r39, defpackage.n74 r40, defpackage.c17 r41) {
        /*
            Method dump skipped, instructions count: 1058
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eb7.w(ch9, g28, pq6, cwc, n74, c17):eb7");
    }

    public static long x(int i) {
        return i & 1048575;
    }

    public static int y(Object obj, long j) {
        return ((Integer) exc.c.h(obj, j)).intValue();
    }

    public static long z(Object obj, long j) {
        return ((Long) exc.c.h(obj, j)).longValue();
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

    public final void B(Object obj, long j, vh1 vh1Var, h0a h0aVar, x54 x54Var) {
        int B;
        this.k.getClass();
        sz5 a = pq6.a(obj, j);
        xb1 xb1Var = (xb1) vh1Var.e;
        int i = vh1Var.b;
        if ((i & 7) == 3) {
            do {
                ow4 d = h0aVar.d();
                vh1Var.f(d, h0aVar, x54Var);
                h0aVar.b(d);
                ((a99) a).add(d);
                if (!xb1Var.c() && vh1Var.d == 0) {
                    B = xb1Var.B();
                } else {
                    return;
                }
            } while (B == i);
            vh1Var.d = B;
            return;
        }
        throw o16.b();
    }

    public final void C(Object obj, int i, vh1 vh1Var, h0a h0aVar, x54 x54Var) {
        int B;
        this.k.getClass();
        sz5 a = pq6.a(obj, i & 1048575);
        xb1 xb1Var = (xb1) vh1Var.e;
        int i2 = vh1Var.b;
        if ((i2 & 7) == 2) {
            do {
                ow4 d = h0aVar.d();
                vh1Var.i(d, h0aVar, x54Var);
                h0aVar.b(d);
                ((a99) a).add(d);
                if (!xb1Var.c() && vh1Var.d == 0) {
                    B = xb1Var.B();
                } else {
                    return;
                }
            } while (B == i2);
            vh1Var.d = B;
            return;
        }
        throw o16.b();
    }

    public final void D(int i, vh1 vh1Var, Object obj) {
        if ((536870912 & i) != 0) {
            vh1Var.n0(2);
            exc.o(obj, i & 1048575, ((xb1) vh1Var.e).A());
        } else if (this.f) {
            vh1Var.n0(2);
            exc.o(obj, i & 1048575, ((xb1) vh1Var.e).z());
        } else {
            exc.o(obj, i & 1048575, vh1Var.o());
        }
    }

    public final void E(int i, vh1 vh1Var, Object obj) {
        boolean z;
        if ((536870912 & i) != 0) {
            z = true;
        } else {
            z = false;
        }
        pq6 pq6Var = this.k;
        if (z) {
            pq6Var.getClass();
            vh1Var.d0(pq6.a(obj, i & 1048575), true);
            return;
        }
        pq6Var.getClass();
        vh1Var.d0(pq6.a(obj, i & 1048575), false);
    }

    public final void G(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        exc.m(j, obj, (1 << (i2 >>> 20)) | exc.c.f(obj, j));
    }

    public final void H(int i, Object obj, int i2) {
        exc.m(this.a[i2 + 2] & 1048575, obj, i);
    }

    public final void I(Object obj, int i, w2 w2Var) {
        o.putObject(obj, L(i) & 1048575, w2Var);
        G(i, obj);
    }

    public final void J(Object obj, int i, int i2, w2 w2Var) {
        o.putObject(obj, L(i2) & 1048575, w2Var);
        H(i, obj, i2);
    }

    public final int L(int i) {
        return this.a[i + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void M(Object obj, fz4 fz4Var) {
        int i;
        int i2;
        boolean z;
        eb7 eb7Var = this;
        int[] iArr = eb7Var.a;
        int length = iArr.length;
        Unsafe unsafe = o;
        int i3 = 1048575;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            int L = eb7Var.L(i5);
            int i7 = iArr[i5];
            int K = K(L);
            if (K <= 17) {
                int i8 = iArr[i5 + 2];
                int i9 = i8 & i3;
                if (i9 != i4) {
                    if (i9 == i3) {
                        i6 = 0;
                    } else {
                        i6 = unsafe.getInt(obj, i9);
                    }
                    i4 = i9;
                }
                i = L;
                i2 = 1 << (i8 >>> 20);
            } else {
                i = L;
                i2 = 0;
            }
            long j = i & i3;
            switch (K) {
                case 0:
                    if (eb7Var.o(obj, i5, i4, i6, i2)) {
                        double d = exc.c.d(obj, j);
                        el1 el1Var = (el1) fz4Var.a;
                        el1Var.getClass();
                        el1Var.r(i7, Double.doubleToRawLongBits(d));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (eb7Var.o(obj, i5, i4, i6, i2)) {
                        float e = exc.c.e(obj, j);
                        el1 el1Var2 = (el1) fz4Var.a;
                        el1Var2.getClass();
                        el1Var2.p(i7, Float.floatToRawIntBits(e));
                    }
                    eb7Var = this;
                    break;
                case 2:
                    if (eb7Var.o(obj, i5, i4, i6, i2)) {
                        ((el1) fz4Var.a).B(i7, unsafe.getLong(obj, j));
                    }
                    eb7Var = this;
                    break;
                case 3:
                    if (eb7Var.o(obj, i5, i4, i6, i2)) {
                        ((el1) fz4Var.a).B(i7, unsafe.getLong(obj, j));
                    }
                    eb7Var = this;
                    break;
                case 4:
                    if (eb7Var.o(obj, i5, i4, i6, i2)) {
                        ((el1) fz4Var.a).t(i7, unsafe.getInt(obj, j));
                    }
                    eb7Var = this;
                    break;
                case 5:
                    if (eb7Var.o(obj, i5, i4, i6, i2)) {
                        ((el1) fz4Var.a).r(i7, unsafe.getLong(obj, j));
                    }
                    eb7Var = this;
                    break;
                case 6:
                    if (eb7Var.o(obj, i5, i4, i6, i2)) {
                        ((el1) fz4Var.a).p(i7, unsafe.getInt(obj, j));
                    }
                    eb7Var = this;
                    break;
                case 7:
                    if (eb7Var.o(obj, i5, i4, i6, i2)) {
                        ((el1) fz4Var.a).n(i7, exc.c.c(obj, j));
                    }
                    eb7Var = this;
                    break;
                case 8:
                    if (eb7Var.o(obj, i5, i4, i6, i2)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            ((el1) fz4Var.a).x(i7, (String) object);
                        } else {
                            ((el1) fz4Var.a).o(i7, (a31) object);
                        }
                    }
                    eb7Var = this;
                    break;
                case 9:
                    if (eb7Var.o(obj, i5, i4, i6, i2)) {
                        ((el1) fz4Var.a).w(i7, (w2) unsafe.getObject(obj, j), eb7Var.m(i5));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (eb7Var.o(obj, i5, i4, i6, i2)) {
                        ((el1) fz4Var.a).o(i7, (a31) unsafe.getObject(obj, j));
                    }
                    eb7Var = this;
                    break;
                case 11:
                    if (eb7Var.o(obj, i5, i4, i6, i2)) {
                        ((el1) fz4Var.a).z(i7, unsafe.getInt(obj, j));
                    }
                    eb7Var = this;
                    break;
                case 12:
                    if (eb7Var.o(obj, i5, i4, i6, i2)) {
                        ((el1) fz4Var.a).t(i7, unsafe.getInt(obj, j));
                    }
                    eb7Var = this;
                    break;
                case 13:
                    if (eb7Var.o(obj, i5, i4, i6, i2)) {
                        ((el1) fz4Var.a).p(i7, unsafe.getInt(obj, j));
                    }
                    eb7Var = this;
                    break;
                case 14:
                    if (eb7Var.o(obj, i5, i4, i6, i2)) {
                        ((el1) fz4Var.a).r(i7, unsafe.getLong(obj, j));
                    }
                    eb7Var = this;
                    break;
                case 15:
                    if (eb7Var.o(obj, i5, i4, i6, i2)) {
                        int i10 = unsafe.getInt(obj, j);
                        ((el1) fz4Var.a).z(i7, (i10 >> 31) ^ (i10 << 1));
                    }
                    eb7Var = this;
                    break;
                case 16:
                    if (eb7Var.o(obj, i5, i4, i6, i2)) {
                        long j2 = unsafe.getLong(obj, j);
                        ((el1) fz4Var.a).B(i7, (j2 >> 63) ^ (j2 << 1));
                    }
                    eb7Var = this;
                    break;
                case 17:
                    if (eb7Var.o(obj, i5, i4, i6, i2)) {
                        fz4Var.D0(i7, unsafe.getObject(obj, j), eb7Var.m(i5));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    m0a.n(iArr[i5], (List) unsafe.getObject(obj, j), fz4Var, false);
                    break;
                case 19:
                    m0a.r(iArr[i5], (List) unsafe.getObject(obj, j), fz4Var, false);
                    break;
                case 20:
                    m0a.t(iArr[i5], (List) unsafe.getObject(obj, j), fz4Var, false);
                    break;
                case 21:
                    m0a.z(iArr[i5], (List) unsafe.getObject(obj, j), fz4Var, false);
                    break;
                case 22:
                    m0a.s(iArr[i5], (List) unsafe.getObject(obj, j), fz4Var, false);
                    break;
                case 23:
                    m0a.q(iArr[i5], (List) unsafe.getObject(obj, j), fz4Var, false);
                    break;
                case 24:
                    m0a.p(iArr[i5], (List) unsafe.getObject(obj, j), fz4Var, false);
                    break;
                case 25:
                    m0a.m(iArr[i5], (List) unsafe.getObject(obj, j), fz4Var, false);
                    break;
                case 26:
                    int i11 = iArr[i5];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = m0a.a;
                    if (list != null && !list.isEmpty()) {
                        fz4Var.getClass();
                        for (int i12 = 0; i12 < list.size(); i12++) {
                            ((el1) fz4Var.a).x(i11, (String) list.get(i12));
                        }
                    }
                    break;
                case 27:
                    int i13 = iArr[i5];
                    List list2 = (List) unsafe.getObject(obj, j);
                    h0a m = eb7Var.m(i5);
                    Class cls2 = m0a.a;
                    if (list2 != null && !list2.isEmpty()) {
                        fz4Var.getClass();
                        for (int i14 = 0; i14 < list2.size(); i14++) {
                            ((el1) fz4Var.a).w(i13, (w2) list2.get(i14), m);
                        }
                    }
                    break;
                case 28:
                    int i15 = iArr[i5];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = m0a.a;
                    if (list3 != null && !list3.isEmpty()) {
                        fz4Var.getClass();
                        for (int i16 = 0; i16 < list3.size(); i16++) {
                            ((el1) fz4Var.a).o(i15, (a31) list3.get(i16));
                        }
                    }
                    break;
                case 29:
                    z = false;
                    m0a.y(iArr[i5], (List) unsafe.getObject(obj, j), fz4Var, false);
                    break;
                case 30:
                    z = false;
                    m0a.o(iArr[i5], (List) unsafe.getObject(obj, j), fz4Var, false);
                    break;
                case 31:
                    z = false;
                    m0a.u(iArr[i5], (List) unsafe.getObject(obj, j), fz4Var, false);
                    break;
                case 32:
                    z = false;
                    m0a.v(iArr[i5], (List) unsafe.getObject(obj, j), fz4Var, false);
                    break;
                case Token.GETPROP /* 33 */:
                    z = false;
                    m0a.w(iArr[i5], (List) unsafe.getObject(obj, j), fz4Var, false);
                    break;
                case Token.GETPROPNOWARN /* 34 */:
                    z = false;
                    m0a.x(iArr[i5], (List) unsafe.getObject(obj, j), fz4Var, false);
                    break;
                case Token.GETPROP_SUPER /* 35 */:
                    m0a.n(iArr[i5], (List) unsafe.getObject(obj, j), fz4Var, true);
                    break;
                case Token.GETPROPNOWARN_SUPER /* 36 */:
                    m0a.r(iArr[i5], (List) unsafe.getObject(obj, j), fz4Var, true);
                    break;
                case Token.SETPROP /* 37 */:
                    m0a.t(iArr[i5], (List) unsafe.getObject(obj, j), fz4Var, true);
                    break;
                case Token.SETPROP_SUPER /* 38 */:
                    m0a.z(iArr[i5], (List) unsafe.getObject(obj, j), fz4Var, true);
                    break;
                case Token.GETELEM /* 39 */:
                    m0a.s(iArr[i5], (List) unsafe.getObject(obj, j), fz4Var, true);
                    break;
                case Token.GETELEM_SUPER /* 40 */:
                    m0a.q(iArr[i5], (List) unsafe.getObject(obj, j), fz4Var, true);
                    break;
                case Token.SETELEM /* 41 */:
                    m0a.p(iArr[i5], (List) unsafe.getObject(obj, j), fz4Var, true);
                    break;
                case Token.SETELEM_SUPER /* 42 */:
                    m0a.m(iArr[i5], (List) unsafe.getObject(obj, j), fz4Var, true);
                    break;
                case Token.CALL /* 43 */:
                    m0a.y(iArr[i5], (List) unsafe.getObject(obj, j), fz4Var, true);
                    break;
                case Token.NAME /* 44 */:
                    m0a.o(iArr[i5], (List) unsafe.getObject(obj, j), fz4Var, true);
                    break;
                case Token.NUMBER /* 45 */:
                    m0a.u(iArr[i5], (List) unsafe.getObject(obj, j), fz4Var, true);
                    break;
                case Token.STRING /* 46 */:
                    m0a.v(iArr[i5], (List) unsafe.getObject(obj, j), fz4Var, true);
                    break;
                case Token.NULL /* 47 */:
                    m0a.w(iArr[i5], (List) unsafe.getObject(obj, j), fz4Var, true);
                    break;
                case Token.THIS /* 48 */:
                    m0a.x(iArr[i5], (List) unsafe.getObject(obj, j), fz4Var, true);
                    break;
                case Token.FALSE /* 49 */:
                    int i17 = iArr[i5];
                    List list4 = (List) unsafe.getObject(obj, j);
                    h0a m2 = eb7Var.m(i5);
                    Class cls4 = m0a.a;
                    if (list4 != null && !list4.isEmpty()) {
                        fz4Var.getClass();
                        for (int i18 = 0; i18 < list4.size(); i18++) {
                            fz4Var.D0(i17, list4.get(i18), m2);
                        }
                    }
                    break;
                case Token.TRUE /* 50 */:
                    if (unsafe.getObject(obj, j) != null) {
                        Object obj2 = eb7Var.b[(i5 / 3) * 2];
                        eb7Var.m.getClass();
                        a82.x(obj2);
                        throw null;
                    }
                    break;
                case Token.SHEQ /* 51 */:
                    if (eb7Var.q(i7, obj, i5)) {
                        double doubleValue = ((Double) exc.c.h(obj, j)).doubleValue();
                        el1 el1Var3 = (el1) fz4Var.a;
                        el1Var3.getClass();
                        el1Var3.r(i7, Double.doubleToRawLongBits(doubleValue));
                    }
                    break;
                case Token.SHNE /* 52 */:
                    if (eb7Var.q(i7, obj, i5)) {
                        float floatValue = ((Float) exc.c.h(obj, j)).floatValue();
                        el1 el1Var4 = (el1) fz4Var.a;
                        el1Var4.getClass();
                        el1Var4.p(i7, Float.floatToRawIntBits(floatValue));
                    }
                    break;
                case Token.REGEXP /* 53 */:
                    if (eb7Var.q(i7, obj, i5)) {
                        ((el1) fz4Var.a).B(i7, z(obj, j));
                    }
                    break;
                case Token.BINDNAME /* 54 */:
                    if (eb7Var.q(i7, obj, i5)) {
                        ((el1) fz4Var.a).B(i7, z(obj, j));
                    }
                    break;
                case Token.THROW /* 55 */:
                    if (eb7Var.q(i7, obj, i5)) {
                        ((el1) fz4Var.a).t(i7, y(obj, j));
                    }
                    break;
                case Token.RETHROW /* 56 */:
                    if (eb7Var.q(i7, obj, i5)) {
                        ((el1) fz4Var.a).r(i7, z(obj, j));
                    }
                    break;
                case Token.IN /* 57 */:
                    if (eb7Var.q(i7, obj, i5)) {
                        ((el1) fz4Var.a).p(i7, y(obj, j));
                    }
                    break;
                case Token.INSTANCEOF /* 58 */:
                    if (eb7Var.q(i7, obj, i5)) {
                        ((el1) fz4Var.a).n(i7, ((Boolean) exc.c.h(obj, j)).booleanValue());
                    }
                    break;
                case Token.LOCAL_LOAD /* 59 */:
                    if (eb7Var.q(i7, obj, i5)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof String) {
                            ((el1) fz4Var.a).x(i7, (String) object2);
                        } else {
                            ((el1) fz4Var.a).o(i7, (a31) object2);
                        }
                    }
                    break;
                case Token.GETVAR /* 60 */:
                    if (eb7Var.q(i7, obj, i5)) {
                        ((el1) fz4Var.a).w(i7, (w2) unsafe.getObject(obj, j), eb7Var.m(i5));
                    }
                    break;
                case Token.SETVAR /* 61 */:
                    if (eb7Var.q(i7, obj, i5)) {
                        ((el1) fz4Var.a).o(i7, (a31) unsafe.getObject(obj, j));
                    }
                    break;
                case Token.CATCH_SCOPE /* 62 */:
                    if (eb7Var.q(i7, obj, i5)) {
                        ((el1) fz4Var.a).z(i7, y(obj, j));
                    }
                    break;
                case Token.ENUM_INIT_KEYS /* 63 */:
                    if (eb7Var.q(i7, obj, i5)) {
                        ((el1) fz4Var.a).t(i7, y(obj, j));
                    }
                    break;
                case Token.ENUM_INIT_VALUES /* 64 */:
                    if (eb7Var.q(i7, obj, i5)) {
                        ((el1) fz4Var.a).p(i7, y(obj, j));
                    }
                    break;
                case Token.ENUM_INIT_ARRAY /* 65 */:
                    if (eb7Var.q(i7, obj, i5)) {
                        ((el1) fz4Var.a).r(i7, z(obj, j));
                    }
                    break;
                case Token.ENUM_INIT_VALUES_IN_ORDER /* 66 */:
                    if (eb7Var.q(i7, obj, i5)) {
                        int y = y(obj, j);
                        ((el1) fz4Var.a).z(i7, (y >> 31) ^ (y << 1));
                    }
                    break;
                case Token.ENUM_NEXT /* 67 */:
                    if (eb7Var.q(i7, obj, i5)) {
                        long z2 = z(obj, j);
                        ((el1) fz4Var.a).B(i7, (z2 << 1) ^ (z2 >> 63));
                    }
                    break;
                case Token.ENUM_ID /* 68 */:
                    if (eb7Var.q(i7, obj, i5)) {
                        fz4Var.D0(i7, unsafe.getObject(obj, j), eb7Var.m(i5));
                    }
                    break;
            }
            i5 += 3;
            i3 = 1048575;
        }
        eb7Var.l.getClass();
        ((ow4) obj).unknownFields.d(fz4Var);
    }

    @Override // defpackage.h0a
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
                                bxc bxcVar = exc.c;
                                obj3 = obj;
                                bxcVar.l(obj3, j, bxcVar.d(obj2, j));
                                G(i, obj3);
                                continue;
                                i += 3;
                                obj = obj3;
                            }
                            break;
                        case 1:
                            if (n(i, obj2)) {
                                bxc bxcVar2 = exc.c;
                                bxcVar2.m(obj, j, bxcVar2.e(obj2, j));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 2:
                            if (n(i, obj2)) {
                                exc.n(obj, j, exc.c.g(obj2, j));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 3:
                            if (n(i, obj2)) {
                                exc.n(obj, j, exc.c.g(obj2, j));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 4:
                            if (n(i, obj2)) {
                                exc.m(j, obj, exc.c.f(obj2, j));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 5:
                            if (n(i, obj2)) {
                                exc.n(obj, j, exc.c.g(obj2, j));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 6:
                            if (n(i, obj2)) {
                                exc.m(j, obj, exc.c.f(obj2, j));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 7:
                            if (n(i, obj2)) {
                                bxc bxcVar3 = exc.c;
                                bxcVar3.j(obj, j, bxcVar3.c(obj2, j));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 8:
                            if (n(i, obj2)) {
                                exc.o(obj, j, exc.c.h(obj2, j));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 9:
                            s(i, obj, obj2);
                            break;
                        case 10:
                            if (n(i, obj2)) {
                                exc.o(obj, j, exc.c.h(obj2, j));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 11:
                            if (n(i, obj2)) {
                                exc.m(j, obj, exc.c.f(obj2, j));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 12:
                            if (n(i, obj2)) {
                                exc.m(j, obj, exc.c.f(obj2, j));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 13:
                            if (n(i, obj2)) {
                                exc.m(j, obj, exc.c.f(obj2, j));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 14:
                            if (n(i, obj2)) {
                                exc.n(obj, j, exc.c.g(obj2, j));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 15:
                            if (n(i, obj2)) {
                                exc.m(j, obj, exc.c.f(obj2, j));
                                G(i, obj);
                                break;
                            }
                            break;
                        case 16:
                            if (n(i, obj2)) {
                                exc.n(obj, j, exc.c.g(obj2, j));
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
                            bxc bxcVar4 = exc.c;
                            sz5 sz5Var = (sz5) bxcVar4.h(obj, j);
                            sz5 sz5Var2 = (sz5) bxcVar4.h(obj2, j);
                            int i3 = ((a99) sz5Var).c;
                            int i4 = ((a99) sz5Var2).c;
                            if (i3 > 0 && i4 > 0) {
                                if (!((a99) sz5Var).a) {
                                    sz5Var = ((a99) sz5Var).c(i4 + i3);
                                }
                                ((a99) sz5Var).addAll(sz5Var2);
                            }
                            if (i3 > 0) {
                                sz5Var2 = sz5Var;
                            }
                            exc.o(obj, j, sz5Var2);
                            break;
                        case Token.TRUE /* 50 */:
                            Class cls = m0a.a;
                            bxc bxcVar5 = exc.c;
                            Object h = bxcVar5.h(obj, j);
                            Object h2 = bxcVar5.h(obj2, j);
                            this.m.getClass();
                            exc.o(obj, j, c17.a(h, h2));
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
                                exc.o(obj, j, exc.c.h(obj2, j));
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
                                exc.o(obj, j, exc.c.h(obj2, j));
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
                    m0a.k(this.l, obj, obj2);
                    return;
                }
            }
        } else {
            vs.m(rs8.i(obj, "Mutating immutable message: "));
        }
    }

    @Override // defpackage.h0a
    public final void b(Object obj) {
        if (p(obj)) {
            if (obj instanceof ow4) {
                ow4 ow4Var = (ow4) obj;
                ow4Var.j(Integer.MAX_VALUE);
                ow4Var.memoizedHashCode = 0;
                ow4Var.g();
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
                                a99 a99Var = (a99) ((sz5) exc.c.h(obj, j));
                                if (a99Var.a) {
                                    a99Var.a = false;
                                    break;
                                } else {
                                    break;
                                }
                            case Token.TRUE /* 50 */:
                                Unsafe unsafe = o;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.m.getClass();
                                    ((z07) object).a = false;
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
            zvc zvcVar = ((ow4) obj).unknownFields;
            if (zvcVar.e) {
                zvcVar.e = false;
            }
        }
    }

    @Override // defpackage.h0a
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
                                    Object h = exc.c.h(obj, L & 1048575);
                                    this.m.getClass();
                                    if (!((z07) h).isEmpty()) {
                                        a82.x(this.b[(i2 / 3) * 2]);
                                        throw null;
                                    }
                                }
                            }
                        } else if (q(i8, obj, i2)) {
                            if (!m(i2).c(exc.c.h(obj, L & 1048575))) {
                            }
                        } else {
                            continue;
                        }
                        i6++;
                        i4 = i;
                        i5 = i3;
                    }
                    List list = (List) exc.c.h(obj, L & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        h0a m = m(i2);
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
                        if (!m(i2).c(exc.c.h(obj, L & 1048575))) {
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

    @Override // defpackage.h0a
    public final ow4 d() {
        this.j.getClass();
        return ((ow4) this.e).h();
    }

    @Override // defpackage.h0a
    public final int e(ow4 ow4Var) {
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
        int h7;
        int a;
        int i2;
        int f;
        int h8;
        int a2;
        int c;
        int h9;
        int size;
        int i3;
        int h10;
        int h11;
        int h12;
        int size2;
        int h13;
        int i4;
        int i5;
        int h14;
        int h15;
        int j3;
        int h16;
        int j4;
        int g2;
        int i6;
        eb7 eb7Var = this;
        ow4 ow4Var2 = ow4Var;
        Unsafe unsafe = o;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 1048575;
        while (true) {
            int[] iArr = eb7Var.a;
            if (i7 < iArr.length) {
                int L = eb7Var.L(i7);
                int K = K(L);
                int i11 = iArr[i7];
                int i12 = iArr[i7 + 2];
                int i13 = i12 & 1048575;
                if (K <= 17) {
                    if (i13 != i10) {
                        if (i13 == 1048575) {
                            i8 = 0;
                        } else {
                            i8 = unsafe.getInt(ow4Var2, i13);
                        }
                        i10 = i13;
                    }
                    i = 1 << (i12 >>> 20);
                } else {
                    i = 0;
                }
                long j5 = L & 1048575;
                if (K >= gc4.b.a) {
                    int i14 = gc4.c.a;
                }
                switch (K) {
                    case 0:
                        if (eb7Var.o(ow4Var2, i7, i10, i8, i)) {
                            h = el1.h(i11);
                            c = h + 8;
                            i9 += c;
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (eb7Var.o(ow4Var2, i7, i10, i8, i)) {
                            h2 = el1.h(i11);
                            h6 = h2 + 4;
                            i9 += h6;
                        }
                        eb7Var = this;
                        ow4Var2 = ow4Var;
                        break;
                    case 2:
                        if (eb7Var.o(ow4Var2, i7, i10, i8, i)) {
                            long j6 = unsafe.getLong(ow4Var2, j5);
                            h3 = el1.h(i11);
                            j = el1.j(j6);
                            i9 += j + h3;
                        }
                        eb7Var = this;
                        break;
                    case 3:
                        if (eb7Var.o(ow4Var2, i7, i10, i8, i)) {
                            long j7 = unsafe.getLong(ow4Var2, j5);
                            h3 = el1.h(i11);
                            j = el1.j(j7);
                            i9 += j + h3;
                        }
                        eb7Var = this;
                        break;
                    case 4:
                        if (eb7Var.o(ow4Var2, i7, i10, i8, i)) {
                            int i15 = unsafe.getInt(ow4Var2, j5);
                            h4 = el1.h(i11);
                            j2 = el1.j(i15);
                            f = j2 + h4;
                            i9 += f;
                        }
                        eb7Var = this;
                        break;
                    case 5:
                        if (eb7Var.o(ow4Var2, i7, i10, i8, i)) {
                            h5 = el1.h(i11);
                            h6 = h5 + 8;
                            i9 += h6;
                        }
                        eb7Var = this;
                        ow4Var2 = ow4Var;
                        break;
                    case 6:
                        if (eb7Var.o(ow4Var2, i7, i10, i8, i)) {
                            h2 = el1.h(i11);
                            h6 = h2 + 4;
                            i9 += h6;
                        }
                        eb7Var = this;
                        ow4Var2 = ow4Var;
                        break;
                    case 7:
                        if (eb7Var.o(ow4Var2, i7, i10, i8, i)) {
                            h6 = el1.h(i11) + 1;
                            i9 += h6;
                        }
                        eb7Var = this;
                        ow4Var2 = ow4Var;
                        break;
                    case 8:
                        if (eb7Var.o(ow4Var2, i7, i10, i8, i)) {
                            Object object = unsafe.getObject(ow4Var2, j5);
                            if (object instanceof a31) {
                                g = el1.f(i11, (a31) object);
                            } else {
                                g = el1.g((String) object) + el1.h(i11);
                            }
                            i9 = g + i9;
                        }
                        eb7Var = this;
                        break;
                    case 9:
                        if (eb7Var.o(ow4Var2, i7, i10, i8, i)) {
                            Object object2 = unsafe.getObject(ow4Var2, j5);
                            h0a m = eb7Var.m(i7);
                            Class cls = m0a.a;
                            h7 = el1.h(i11);
                            a = ((w2) object2).a(m);
                            i2 = el1.i(a);
                            i6 = i2 + a + h7;
                            i9 += i6;
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (eb7Var.o(ow4Var2, i7, i10, i8, i)) {
                            f = el1.f(i11, (a31) unsafe.getObject(ow4Var2, j5));
                            i9 += f;
                        }
                        eb7Var = this;
                        break;
                    case 11:
                        if (eb7Var.o(ow4Var2, i7, i10, i8, i)) {
                            int i16 = unsafe.getInt(ow4Var2, j5);
                            h4 = el1.h(i11);
                            j2 = el1.i(i16);
                            f = j2 + h4;
                            i9 += f;
                        }
                        eb7Var = this;
                        break;
                    case 12:
                        if (eb7Var.o(ow4Var2, i7, i10, i8, i)) {
                            int i17 = unsafe.getInt(ow4Var2, j5);
                            h4 = el1.h(i11);
                            j2 = el1.j(i17);
                            f = j2 + h4;
                            i9 += f;
                        }
                        eb7Var = this;
                        break;
                    case 13:
                        if (eb7Var.o(ow4Var2, i7, i10, i8, i)) {
                            h2 = el1.h(i11);
                            h6 = h2 + 4;
                            i9 += h6;
                        }
                        eb7Var = this;
                        ow4Var2 = ow4Var;
                        break;
                    case 14:
                        if (eb7Var.o(ow4Var2, i7, i10, i8, i)) {
                            h5 = el1.h(i11);
                            h6 = h5 + 8;
                            i9 += h6;
                        }
                        eb7Var = this;
                        ow4Var2 = ow4Var;
                        break;
                    case 15:
                        if (eb7Var.o(ow4Var2, i7, i10, i8, i)) {
                            int i18 = unsafe.getInt(ow4Var2, j5);
                            h4 = el1.h(i11);
                            j2 = el1.i((i18 >> 31) ^ (i18 << 1));
                            f = j2 + h4;
                            i9 += f;
                        }
                        eb7Var = this;
                        break;
                    case 16:
                        if (eb7Var.o(ow4Var2, i7, i10, i8, i)) {
                            long j8 = unsafe.getLong(ow4Var2, j5);
                            h3 = el1.h(i11);
                            j = el1.j((j8 << 1) ^ (j8 >> 63));
                            i9 += j + h3;
                        }
                        eb7Var = this;
                        break;
                    case 17:
                        if (eb7Var.o(ow4Var2, i7, i10, i8, i)) {
                            h0a m2 = eb7Var.m(i7);
                            h8 = el1.h(i11) * 2;
                            a2 = ((w2) unsafe.getObject(ow4Var2, j5)).a(m2);
                            c = a2 + h8;
                            i9 += c;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        c = m0a.c(i11, (List) unsafe.getObject(ow4Var2, j5));
                        i9 += c;
                        break;
                    case 19:
                        c = m0a.b(i11, (List) unsafe.getObject(ow4Var2, j5));
                        i9 += c;
                        break;
                    case 20:
                        List list = (List) unsafe.getObject(ow4Var2, j5);
                        Class cls2 = m0a.a;
                        if (list.size() != 0) {
                            h9 = (el1.h(i11) * list.size()) + m0a.e(list);
                            i9 += h9;
                            break;
                        }
                        h9 = 0;
                        i9 += h9;
                    case 21:
                        List list2 = (List) unsafe.getObject(ow4Var2, j5);
                        Class cls3 = m0a.a;
                        size = list2.size();
                        if (size != 0) {
                            i3 = m0a.i(list2);
                            h10 = el1.h(i11);
                            h9 = (h10 * size) + i3;
                            i9 += h9;
                            break;
                        }
                        h9 = 0;
                        i9 += h9;
                    case 22:
                        List list3 = (List) unsafe.getObject(ow4Var2, j5);
                        Class cls4 = m0a.a;
                        size = list3.size();
                        if (size != 0) {
                            i3 = m0a.d(list3);
                            h10 = el1.h(i11);
                            h9 = (h10 * size) + i3;
                            i9 += h9;
                            break;
                        }
                        h9 = 0;
                        i9 += h9;
                    case 23:
                        c = m0a.c(i11, (List) unsafe.getObject(ow4Var2, j5));
                        i9 += c;
                        break;
                    case 24:
                        c = m0a.b(i11, (List) unsafe.getObject(ow4Var2, j5));
                        i9 += c;
                        break;
                    case 25:
                        Class cls5 = m0a.a;
                        int size3 = ((List) unsafe.getObject(ow4Var2, j5)).size();
                        if (size3 == 0) {
                            h11 = 0;
                        } else {
                            h11 = (el1.h(i11) + 1) * size3;
                        }
                        i9 += h11;
                        break;
                    case 26:
                        List list4 = (List) unsafe.getObject(ow4Var2, j5);
                        Class cls6 = m0a.a;
                        int size4 = list4.size();
                        if (size4 != 0) {
                            h9 = el1.h(i11) * size4;
                            for (int i19 = 0; i19 < size4; i19++) {
                                Object obj = list4.get(i19);
                                if (obj instanceof a31) {
                                    int size5 = ((a31) obj).size();
                                    h9 = el1.i(size5) + size5 + h9;
                                } else {
                                    h9 = el1.g((String) obj) + h9;
                                }
                            }
                            i9 += h9;
                            break;
                        }
                        h9 = 0;
                        i9 += h9;
                    case 27:
                        List list5 = (List) unsafe.getObject(ow4Var2, j5);
                        h0a m3 = eb7Var.m(i7);
                        Class cls7 = m0a.a;
                        int size6 = list5.size();
                        if (size6 == 0) {
                            h12 = 0;
                        } else {
                            h12 = el1.h(i11) * size6;
                            for (int i20 = 0; i20 < size6; i20++) {
                                int a3 = ((w2) list5.get(i20)).a(m3);
                                h12 += el1.i(a3) + a3;
                            }
                        }
                        i9 += h12;
                        break;
                    case 28:
                        List list6 = (List) unsafe.getObject(ow4Var2, j5);
                        Class cls8 = m0a.a;
                        int size7 = list6.size();
                        if (size7 != 0) {
                            h9 = el1.h(i11) * size7;
                            for (int i21 = 0; i21 < list6.size(); i21++) {
                                int size8 = ((a31) list6.get(i21)).size();
                                h9 += el1.i(size8) + size8;
                            }
                            i9 += h9;
                            break;
                        }
                        h9 = 0;
                        i9 += h9;
                    case 29:
                        List list7 = (List) unsafe.getObject(ow4Var2, j5);
                        Class cls9 = m0a.a;
                        size = list7.size();
                        if (size != 0) {
                            i3 = m0a.h(list7);
                            h10 = el1.h(i11);
                            h9 = (h10 * size) + i3;
                            i9 += h9;
                            break;
                        }
                        h9 = 0;
                        i9 += h9;
                    case 30:
                        List list8 = (List) unsafe.getObject(ow4Var2, j5);
                        Class cls10 = m0a.a;
                        size = list8.size();
                        if (size != 0) {
                            i3 = m0a.a(list8);
                            h10 = el1.h(i11);
                            h9 = (h10 * size) + i3;
                            i9 += h9;
                            break;
                        }
                        h9 = 0;
                        i9 += h9;
                    case 31:
                        c = m0a.b(i11, (List) unsafe.getObject(ow4Var2, j5));
                        i9 += c;
                        break;
                    case 32:
                        c = m0a.c(i11, (List) unsafe.getObject(ow4Var2, j5));
                        i9 += c;
                        break;
                    case Token.GETPROP /* 33 */:
                        List list9 = (List) unsafe.getObject(ow4Var2, j5);
                        Class cls11 = m0a.a;
                        size = list9.size();
                        if (size != 0) {
                            i3 = m0a.f(list9);
                            h10 = el1.h(i11);
                            h9 = (h10 * size) + i3;
                            i9 += h9;
                            break;
                        }
                        h9 = 0;
                        i9 += h9;
                    case Token.GETPROPNOWARN /* 34 */:
                        List list10 = (List) unsafe.getObject(ow4Var2, j5);
                        Class cls12 = m0a.a;
                        size = list10.size();
                        if (size != 0) {
                            i3 = m0a.g(list10);
                            h10 = el1.h(i11);
                            h9 = (h10 * size) + i3;
                            i9 += h9;
                            break;
                        }
                        h9 = 0;
                        i9 += h9;
                    case Token.GETPROP_SUPER /* 35 */:
                        Class cls13 = m0a.a;
                        size2 = ((List) unsafe.getObject(ow4Var2, j5)).size() * 8;
                        if (size2 > 0) {
                            h13 = el1.h(i11);
                            i4 = el1.i(size2);
                            i9 += i4 + h13 + size2;
                            break;
                        } else {
                            break;
                        }
                    case Token.GETPROPNOWARN_SUPER /* 36 */:
                        Class cls14 = m0a.a;
                        size2 = ((List) unsafe.getObject(ow4Var2, j5)).size() * 4;
                        if (size2 > 0) {
                            h13 = el1.h(i11);
                            i4 = el1.i(size2);
                            i9 += i4 + h13 + size2;
                            break;
                        } else {
                            break;
                        }
                    case Token.SETPROP /* 37 */:
                        size2 = m0a.e((List) unsafe.getObject(ow4Var2, j5));
                        if (size2 > 0) {
                            h13 = el1.h(i11);
                            i4 = el1.i(size2);
                            i9 += i4 + h13 + size2;
                            break;
                        } else {
                            break;
                        }
                    case Token.SETPROP_SUPER /* 38 */:
                        size2 = m0a.i((List) unsafe.getObject(ow4Var2, j5));
                        if (size2 > 0) {
                            h13 = el1.h(i11);
                            i4 = el1.i(size2);
                            i9 += i4 + h13 + size2;
                            break;
                        } else {
                            break;
                        }
                    case Token.GETELEM /* 39 */:
                        size2 = m0a.d((List) unsafe.getObject(ow4Var2, j5));
                        if (size2 > 0) {
                            h13 = el1.h(i11);
                            i4 = el1.i(size2);
                            i9 += i4 + h13 + size2;
                            break;
                        } else {
                            break;
                        }
                    case Token.GETELEM_SUPER /* 40 */:
                        Class cls15 = m0a.a;
                        size2 = ((List) unsafe.getObject(ow4Var2, j5)).size() * 8;
                        if (size2 > 0) {
                            h13 = el1.h(i11);
                            i4 = el1.i(size2);
                            i9 += i4 + h13 + size2;
                            break;
                        } else {
                            break;
                        }
                    case Token.SETELEM /* 41 */:
                        Class cls16 = m0a.a;
                        size2 = ((List) unsafe.getObject(ow4Var2, j5)).size() * 4;
                        if (size2 > 0) {
                            h13 = el1.h(i11);
                            i4 = el1.i(size2);
                            i9 += i4 + h13 + size2;
                            break;
                        } else {
                            break;
                        }
                    case Token.SETELEM_SUPER /* 42 */:
                        Class cls17 = m0a.a;
                        size2 = ((List) unsafe.getObject(ow4Var2, j5)).size();
                        if (size2 > 0) {
                            h13 = el1.h(i11);
                            i4 = el1.i(size2);
                            i9 += i4 + h13 + size2;
                            break;
                        } else {
                            break;
                        }
                    case Token.CALL /* 43 */:
                        size2 = m0a.h((List) unsafe.getObject(ow4Var2, j5));
                        if (size2 > 0) {
                            h13 = el1.h(i11);
                            i4 = el1.i(size2);
                            i9 += i4 + h13 + size2;
                            break;
                        } else {
                            break;
                        }
                    case Token.NAME /* 44 */:
                        size2 = m0a.a((List) unsafe.getObject(ow4Var2, j5));
                        if (size2 > 0) {
                            h13 = el1.h(i11);
                            i4 = el1.i(size2);
                            i9 += i4 + h13 + size2;
                            break;
                        } else {
                            break;
                        }
                    case Token.NUMBER /* 45 */:
                        Class cls18 = m0a.a;
                        size2 = ((List) unsafe.getObject(ow4Var2, j5)).size() * 4;
                        if (size2 > 0) {
                            h13 = el1.h(i11);
                            i4 = el1.i(size2);
                            i9 += i4 + h13 + size2;
                            break;
                        } else {
                            break;
                        }
                    case Token.STRING /* 46 */:
                        Class cls19 = m0a.a;
                        size2 = ((List) unsafe.getObject(ow4Var2, j5)).size() * 8;
                        if (size2 > 0) {
                            h13 = el1.h(i11);
                            i4 = el1.i(size2);
                            i9 += i4 + h13 + size2;
                            break;
                        } else {
                            break;
                        }
                    case Token.NULL /* 47 */:
                        size2 = m0a.f((List) unsafe.getObject(ow4Var2, j5));
                        if (size2 > 0) {
                            h13 = el1.h(i11);
                            i4 = el1.i(size2);
                            i9 += i4 + h13 + size2;
                            break;
                        } else {
                            break;
                        }
                    case Token.THIS /* 48 */:
                        size2 = m0a.g((List) unsafe.getObject(ow4Var2, j5));
                        if (size2 > 0) {
                            h13 = el1.h(i11);
                            i4 = el1.i(size2);
                            i9 += i4 + h13 + size2;
                            break;
                        } else {
                            break;
                        }
                    case Token.FALSE /* 49 */:
                        List list11 = (List) unsafe.getObject(ow4Var2, j5);
                        h0a m4 = eb7Var.m(i7);
                        Class cls20 = m0a.a;
                        int size9 = list11.size();
                        if (size9 == 0) {
                            i5 = 0;
                        } else {
                            i5 = 0;
                            for (int i22 = 0; i22 < size9; i22++) {
                                i5 += ((w2) list11.get(i22)).a(m4) + (el1.h(i11) * 2);
                            }
                        }
                        i9 += i5;
                        break;
                    case Token.TRUE /* 50 */:
                        Object object3 = unsafe.getObject(ow4Var2, j5);
                        Object obj2 = eb7Var.b[(i7 / 3) * 2];
                        eb7Var.m.getClass();
                        z07 z07Var = (z07) object3;
                        if (obj2 == null) {
                            if (z07Var.isEmpty()) {
                                continue;
                            } else {
                                Iterator it = z07Var.entrySet().iterator();
                                if (it.hasNext()) {
                                    Map.Entry entry = (Map.Entry) it.next();
                                    entry.getKey();
                                    entry.getValue();
                                    throw null;
                                }
                                break;
                            }
                        } else {
                            vm1.h();
                            return 0;
                        }
                    case Token.SHEQ /* 51 */:
                        if (eb7Var.q(i11, ow4Var2, i7)) {
                            h = el1.h(i11);
                            c = h + 8;
                            i9 += c;
                            break;
                        } else {
                            break;
                        }
                    case Token.SHNE /* 52 */:
                        if (eb7Var.q(i11, ow4Var2, i7)) {
                            h14 = el1.h(i11);
                            c = h14 + 4;
                            i9 += c;
                            break;
                        } else {
                            break;
                        }
                    case Token.REGEXP /* 53 */:
                        if (eb7Var.q(i11, ow4Var2, i7)) {
                            long z = z(ow4Var2, j5);
                            h15 = el1.h(i11);
                            j3 = el1.j(z);
                            i6 = j3 + h15;
                            i9 += i6;
                            break;
                        } else {
                            break;
                        }
                    case Token.BINDNAME /* 54 */:
                        if (eb7Var.q(i11, ow4Var2, i7)) {
                            long z2 = z(ow4Var2, j5);
                            h15 = el1.h(i11);
                            j3 = el1.j(z2);
                            i6 = j3 + h15;
                            i9 += i6;
                            break;
                        } else {
                            break;
                        }
                    case Token.THROW /* 55 */:
                        if (eb7Var.q(i11, ow4Var2, i7)) {
                            int y = y(ow4Var2, j5);
                            h16 = el1.h(i11);
                            j4 = el1.j(y);
                            c = j4 + h16;
                            i9 += c;
                            break;
                        } else {
                            break;
                        }
                    case Token.RETHROW /* 56 */:
                        if (eb7Var.q(i11, ow4Var2, i7)) {
                            h = el1.h(i11);
                            c = h + 8;
                            i9 += c;
                            break;
                        } else {
                            break;
                        }
                    case Token.IN /* 57 */:
                        if (eb7Var.q(i11, ow4Var2, i7)) {
                            h14 = el1.h(i11);
                            c = h14 + 4;
                            i9 += c;
                            break;
                        } else {
                            break;
                        }
                    case Token.INSTANCEOF /* 58 */:
                        if (eb7Var.q(i11, ow4Var2, i7)) {
                            c = el1.h(i11) + 1;
                            i9 += c;
                            break;
                        } else {
                            break;
                        }
                    case Token.LOCAL_LOAD /* 59 */:
                        if (eb7Var.q(i11, ow4Var2, i7)) {
                            Object object4 = unsafe.getObject(ow4Var2, j5);
                            if (object4 instanceof a31) {
                                g2 = el1.f(i11, (a31) object4);
                            } else {
                                g2 = el1.g((String) object4) + el1.h(i11);
                            }
                            i9 = g2 + i9;
                            break;
                        } else {
                            break;
                        }
                    case Token.GETVAR /* 60 */:
                        if (eb7Var.q(i11, ow4Var2, i7)) {
                            Object object5 = unsafe.getObject(ow4Var2, j5);
                            h0a m5 = eb7Var.m(i7);
                            Class cls21 = m0a.a;
                            h7 = el1.h(i11);
                            a = ((w2) object5).a(m5);
                            i2 = el1.i(a);
                            i6 = i2 + a + h7;
                            i9 += i6;
                            break;
                        } else {
                            break;
                        }
                    case Token.SETVAR /* 61 */:
                        if (eb7Var.q(i11, ow4Var2, i7)) {
                            c = el1.f(i11, (a31) unsafe.getObject(ow4Var2, j5));
                            i9 += c;
                            break;
                        } else {
                            break;
                        }
                    case Token.CATCH_SCOPE /* 62 */:
                        if (eb7Var.q(i11, ow4Var2, i7)) {
                            int y2 = y(ow4Var2, j5);
                            h16 = el1.h(i11);
                            j4 = el1.i(y2);
                            c = j4 + h16;
                            i9 += c;
                            break;
                        } else {
                            break;
                        }
                    case Token.ENUM_INIT_KEYS /* 63 */:
                        if (eb7Var.q(i11, ow4Var2, i7)) {
                            int y3 = y(ow4Var2, j5);
                            h16 = el1.h(i11);
                            j4 = el1.j(y3);
                            c = j4 + h16;
                            i9 += c;
                            break;
                        } else {
                            break;
                        }
                    case Token.ENUM_INIT_VALUES /* 64 */:
                        if (eb7Var.q(i11, ow4Var2, i7)) {
                            h14 = el1.h(i11);
                            c = h14 + 4;
                            i9 += c;
                            break;
                        } else {
                            break;
                        }
                    case Token.ENUM_INIT_ARRAY /* 65 */:
                        if (eb7Var.q(i11, ow4Var2, i7)) {
                            h = el1.h(i11);
                            c = h + 8;
                            i9 += c;
                            break;
                        } else {
                            break;
                        }
                    case Token.ENUM_INIT_VALUES_IN_ORDER /* 66 */:
                        if (eb7Var.q(i11, ow4Var2, i7)) {
                            int y4 = y(ow4Var2, j5);
                            h16 = el1.h(i11);
                            j4 = el1.i((y4 >> 31) ^ (y4 << 1));
                            c = j4 + h16;
                            i9 += c;
                            break;
                        } else {
                            break;
                        }
                    case Token.ENUM_NEXT /* 67 */:
                        if (eb7Var.q(i11, ow4Var2, i7)) {
                            long z3 = z(ow4Var2, j5);
                            h15 = el1.h(i11);
                            j3 = el1.j((z3 << 1) ^ (z3 >> 63));
                            i6 = j3 + h15;
                            i9 += i6;
                            break;
                        } else {
                            break;
                        }
                    case Token.ENUM_ID /* 68 */:
                        if (eb7Var.q(i11, ow4Var2, i7)) {
                            h0a m6 = eb7Var.m(i7);
                            h8 = el1.h(i11) * 2;
                            a2 = ((w2) unsafe.getObject(ow4Var2, j5)).a(m6);
                            c = a2 + h8;
                            i9 += c;
                            break;
                        } else {
                            break;
                        }
                }
                i7 += 3;
            } else {
                eb7Var.l.getClass();
                return ow4Var2.unknownFields.b() + i9;
            }
        }
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
    @Override // defpackage.h0a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(defpackage.ow4 r12) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eb7.f(ow4):int");
    }

    @Override // defpackage.h0a
    public final void g(Object obj, fz4 fz4Var) {
        fz4Var.getClass();
        M(obj, fz4Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01ec, code lost:
        if (java.lang.Double.doubleToLongBits(r5.d(r12, r7)) == java.lang.Double.doubleToLongBits(r5.d(r13, r7))) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
        if (defpackage.m0a.l(r9.h(r12, r7), r9.h(r13, r7)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
        if (defpackage.m0a.l(r5.h(r12, r7), r5.h(r13, r7)) != false) goto L85;
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
        if (defpackage.m0a.l(r5.h(r12, r7), r5.h(r13, r7)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0120, code lost:
        if (defpackage.m0a.l(r5.h(r12, r7), r5.h(r13, r7)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0138, code lost:
        if (defpackage.m0a.l(r5.h(r12, r7), r5.h(r13, r7)) != false) goto L85;
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
    @Override // defpackage.h0a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(defpackage.ow4 r12, defpackage.ow4 r13) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eb7.h(ow4, ow4):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x0712 A[Catch: all -> 0x045f, TryCatch #12 {all -> 0x045f, blocks: (B:145:0x070d, B:147:0x0712, B:148:0x0717, B:107:0x045a, B:110:0x0462, B:111:0x0477, B:112:0x048c, B:113:0x04a1, B:114:0x04b6, B:115:0x04cb, B:116:0x04e0, B:117:0x04f5, B:118:0x050a, B:119:0x0524, B:120:0x0540, B:121:0x055d, B:122:0x057a, B:123:0x0597, B:124:0x05b7, B:125:0x05d4, B:126:0x05e9, B:127:0x0604, B:128:0x0611, B:129:0x0630, B:130:0x064d, B:131:0x066a, B:132:0x0687, B:133:0x06a4, B:134:0x06c1, B:135:0x06df, B:139:0x06fd), top: B:185:0x070d }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x073b A[LOOP:3: B:158:0x0739->B:159:0x073b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0745  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x071e A[SYNTHETIC] */
    @Override // defpackage.h0a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.Object r21, defpackage.vh1 r22, defpackage.x54 r23) {
        /*
            Method dump skipped, instructions count: 2022
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eb7.i(java.lang.Object, vh1, x54):void");
    }

    public final boolean j(ow4 ow4Var, ow4 ow4Var2, int i) {
        if (n(i, ow4Var) == n(i, ow4Var2)) {
            return true;
        }
        return false;
    }

    public final void k(int i, Object obj, Object obj2) {
        int i2 = this.a[i];
        if (exc.c.h(obj, L(i) & 1048575) == null) {
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

    public final h0a m(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        h0a h0aVar = (h0a) objArr[i2];
        if (h0aVar != null) {
            return h0aVar;
        }
        h0a a = w89.c.a((Class) objArr[i2 + 1]);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eb7.n(int, java.lang.Object):boolean");
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
        if (exc.c.f(obj, this.a[i2 + 2] & 1048575) == i) {
            return true;
        }
        return false;
    }

    public final void r(int i, Object obj, Object obj2) {
        long L = L(i) & 1048575;
        Object h = exc.c.h(obj, L);
        c17 c17Var = this.m;
        if (h != null) {
            c17Var.getClass();
            if (!((z07) h).a) {
                z07 c = z07.b.c();
                c17.a(c, h);
                exc.o(obj, L, c);
                h = c;
            }
        } else {
            c17Var.getClass();
            h = z07.b.c();
            exc.o(obj, L, h);
        }
        c17Var.getClass();
        z07 z07Var = (z07) h;
        a82.x(obj2);
        throw null;
    }

    public final void s(int i, Object obj, Object obj2) {
        if (!n(i, obj2)) {
            return;
        }
        long L = L(i) & 1048575;
        Unsafe unsafe = o;
        Object object = unsafe.getObject(obj2, L);
        if (object != null) {
            h0a m = m(i);
            if (!n(i, obj)) {
                if (!p(object)) {
                    unsafe.putObject(obj, L, object);
                } else {
                    ow4 d = m.d();
                    m.a(d, object);
                    unsafe.putObject(obj, L, d);
                }
                G(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, L);
            if (!p(object2)) {
                ow4 d2 = m.d();
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
            h0a m = m(i);
            if (!q(i2, obj, i)) {
                if (!p(object)) {
                    unsafe.putObject(obj, L, object);
                } else {
                    ow4 d = m.d();
                    m.a(d, object);
                    unsafe.putObject(obj, L, d);
                }
                H(i2, obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, L);
            if (!p(object2)) {
                ow4 d2 = m.d();
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
        h0a m = m(i);
        long L = L(i) & 1048575;
        if (!n(i, obj)) {
            return m.d();
        }
        Object object = o.getObject(obj, L);
        if (p(object)) {
            return object;
        }
        ow4 d = m.d();
        if (object != null) {
            m.a(d, object);
        }
        return d;
    }

    public final Object v(int i, Object obj, int i2) {
        h0a m = m(i2);
        if (!q(i, obj, i2)) {
            return m.d();
        }
        Object object = o.getObject(obj, L(i2) & 1048575);
        if (p(object)) {
            return object;
        }
        ow4 d = m.d();
        if (object != null) {
            m.a(d, object);
        }
        return d;
    }
}

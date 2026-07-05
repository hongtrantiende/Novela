package defpackage;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.mozilla.javascript.Token;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c2e  reason: default package */
/* loaded from: classes.dex */
public final class c2e implements m2e {
    public static final int[] k = new int[0];
    public static final Unsafe l = e3e.l();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final hzd e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;
    public final zj1 j;

    public c2e(int[] iArr, Object[] objArr, int i, int i2, hzd hzdVar, int[] iArr2, int i3, int i4, zj1 zj1Var, h88 h88Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = hzdVar instanceof o0e;
        this.g = iArr2;
        this.h = i3;
        this.i = i4;
        this.j = zj1Var;
        this.e = hzdVar;
    }

    public static int j(int i) {
        return (i >>> 20) & 255;
    }

    public static boolean k(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof o0e) {
            return ((o0e) obj).g();
        }
        return true;
    }

    public static void l(Object obj) {
        if (k(obj)) {
            return;
        }
        vs.m("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    public static int m(Object obj, long j) {
        return ((Integer) e3e.i(obj, j)).intValue();
    }

    public static long n(Object obj, long j) {
        return ((Long) e3e.i(obj, j)).longValue();
    }

    public static final int v(byte[] bArr, int i, int i2, i3e i3eVar, Class cls, lzd lzdVar) {
        i3e i3eVar2 = i3e.c;
        boolean z = false;
        switch (i3eVar.ordinal()) {
            case 0:
                int i3 = i + 8;
                lzdVar.c = Double.valueOf(Double.longBitsToDouble(fca.J(bArr, i)));
                return i3;
            case 1:
                int i4 = i + 4;
                lzdVar.c = Float.valueOf(Float.intBitsToFloat(fca.I(bArr, i)));
                return i4;
            case 2:
            case 3:
                int H = fca.H(bArr, i, lzdVar);
                lzdVar.c = Long.valueOf(lzdVar.b);
                return H;
            case 4:
            case 12:
            case 13:
                int F = fca.F(bArr, i, lzdVar);
                lzdVar.c = Integer.valueOf(lzdVar.a);
                return F;
            case 5:
            case 15:
                int i5 = i + 8;
                lzdVar.c = Long.valueOf(fca.J(bArr, i));
                return i5;
            case 6:
            case 14:
                int i6 = i + 4;
                lzdVar.c = Integer.valueOf(fca.I(bArr, i));
                return i6;
            case 7:
                int H2 = fca.H(bArr, i, lzdVar);
                if (lzdVar.b != 0) {
                    z = true;
                }
                lzdVar.c = Boolean.valueOf(z);
                return H2;
            case 8:
                return fca.K(bArr, i, lzdVar);
            case 9:
            default:
                cy7.e("unsupported field type.");
                return 0;
            case 10:
                m2e a = i2e.c.a(cls);
                o0e zza = a.zza();
                int M = fca.M(zza, a, bArr, i, i2, lzdVar);
                a.c(zza);
                lzdVar.c = zza;
                return M;
            case 11:
                return fca.L(bArr, i, lzdVar);
            case 16:
                int F2 = fca.F(bArr, i, lzdVar);
                lzdVar.c = Integer.valueOf(dcc.p(lzdVar.a));
                return F2;
            case 17:
                int H3 = fca.H(bArr, i, lzdVar);
                lzdVar.c = Long.valueOf(dcc.q(lzdVar.b));
                return H3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0354  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.c2e x(defpackage.k2e r35, defpackage.zj1 r36, defpackage.h88 r37) {
        /*
            Method dump skipped, instructions count: 1038
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c2e.x(k2e, zj1, h88):c2e");
    }

    public static Field y(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(arrays).length());
            nk2.C(sb, "Field ", str, " for ", name);
            cp8.p(s21.q(sb, " not found. Known fields are ", arrays), e);
            return null;
        }
    }

    public final void A(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (!s(i2, obj2, i)) {
            return;
        }
        Unsafe unsafe = l;
        long i3 = i(i) & 1048575;
        Object object = unsafe.getObject(obj2, i3);
        if (object != null) {
            m2e B = B(i);
            if (!s(i2, obj, i)) {
                if (!k(object)) {
                    unsafe.putObject(obj, i3, object);
                } else {
                    o0e zza = B.zza();
                    B.a(zza, object);
                    unsafe.putObject(obj, i3, zza);
                }
                t(i2, obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, i3);
            if (!k(object2)) {
                o0e zza2 = B.zza();
                B.a(zza2, object2);
                unsafe.putObject(obj, i3, zza2);
                object2 = zza2;
            }
            B.a(object2, object);
            return;
        }
        int i4 = iArr[i];
        String obj3 = obj2.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 38 + obj3.length());
        sb.append("Source subfield ");
        sb.append(i4);
        sb.append(" is present but null: ");
        sb.append(obj3);
        throw new IllegalStateException(sb.toString());
    }

    public final m2e B(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.b;
        m2e m2eVar = (m2e) objArr[i3];
        if (m2eVar != null) {
            return m2eVar;
        }
        m2e a = i2e.c.a((Class) objArr[i3 + 1]);
        objArr[i3] = a;
        return a;
    }

    public final Object C(int i) {
        int i2 = i / 3;
        return this.b[i2 + i2];
    }

    public final bzd D(int i) {
        int i2 = i / 3;
        return (bzd) this.b[i2 + i2 + 1];
    }

    public final Object E(int i, Object obj) {
        m2e B = B(i);
        int i2 = i(i) & 1048575;
        if (!q(i, obj)) {
            return B.zza();
        }
        Object object = l.getObject(obj, i2);
        if (k(object)) {
            return object;
        }
        o0e zza = B.zza();
        if (object != null) {
            B.a(zza, object);
        }
        return zza;
    }

    public final void F(int i, Object obj, Object obj2) {
        l.putObject(obj, i(i) & 1048575, obj2);
        r(i, obj);
    }

    public final Object G(int i, Object obj, int i2) {
        m2e B = B(i2);
        if (!s(i, obj, i2)) {
            return B.zza();
        }
        Object object = l.getObject(obj, i(i2) & 1048575);
        if (k(object)) {
            return object;
        }
        o0e zza = B.zza();
        if (object != null) {
            B.a(zza, object);
        }
        return zza;
    }

    public final void H(int i, Object obj, Object obj2, int i2) {
        l.putObject(obj, i(i2) & 1048575, obj2);
        t(i, obj, i2);
    }

    public final Object I(Object obj, int i, Object obj2, zj1 zj1Var, Object obj3) {
        bzd D;
        int i2 = this.a[i];
        Object i3 = e3e.i(obj, i(i) & 1048575);
        if (i3 == null || (D = D(i)) == null) {
            return obj2;
        }
        yx9 yx9Var = ((q1e) C(i)).a;
        Iterator it = ((r1e) i3).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!D.a(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    zj1Var.getClass();
                    obj2 = zj1.t(obj3);
                }
                int b = q1e.b(yx9Var, entry.getKey(), entry.getValue());
                rzd rzdVar = szd.b;
                byte[] bArr = new byte[b];
                boolean z = g0e.b;
                wzd wzdVar = new wzd(bArr, b);
                try {
                    q1e.a(wzdVar, yx9Var, entry.getKey(), entry.getValue());
                    if (wzdVar.x() <= 0) {
                        if (wzdVar.x() >= 0) {
                            rzd rzdVar2 = new rzd(bArr);
                            zj1Var.getClass();
                            ((x2e) obj2).d((i2 << 3) | 2, rzdVar2);
                            it.remove();
                        } else {
                            vs.k("Wrote more data than expected.");
                            return null;
                        }
                    } else {
                        vs.k("Did not write as much data as expected.");
                        return null;
                    }
                } catch (IOException e) {
                    fb4.l(e);
                    return null;
                }
            }
        }
        return obj2;
    }

    public final void J(int i, vh1 vh1Var, Object obj) {
        boolean z;
        dcc dccVar = (dcc) vh1Var.e;
        if ((536870912 & i) != 0) {
            z = true;
        } else {
            z = false;
        }
        long j = i & 1048575;
        if (z) {
            vh1Var.F0(2);
            e3e.j(obj, j, dccVar.D());
        } else if (this.f) {
            vh1Var.F0(2);
            e3e.j(obj, j, dccVar.C());
        } else {
            e3e.j(obj, j, vh1Var.m1());
        }
    }

    @Override // defpackage.m2e
    public final void a(Object obj, Object obj2) {
        Object obj3;
        l(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i < iArr.length) {
                int i2 = i(i);
                int i3 = 1048575 & i2;
                int j = j(i2);
                int i4 = iArr[i];
                long j2 = i3;
                switch (j) {
                    case 0:
                        if (q(i, obj2)) {
                            c3e c3eVar = e3e.c;
                            obj3 = obj;
                            c3eVar.X(obj3, j2, c3eVar.V(obj2, j2));
                            r(i, obj3);
                            continue;
                            i += 3;
                            obj = obj3;
                        }
                        break;
                    case 1:
                        if (q(i, obj2)) {
                            c3e c3eVar2 = e3e.c;
                            c3eVar2.U(obj, j2, c3eVar2.T(obj2, j2));
                            r(i, obj);
                            break;
                        }
                        break;
                    case 2:
                        if (q(i, obj2)) {
                            e3e.h(obj, j2, e3e.g(obj2, j2));
                            r(i, obj);
                            break;
                        }
                        break;
                    case 3:
                        if (q(i, obj2)) {
                            e3e.h(obj, j2, e3e.g(obj2, j2));
                            r(i, obj);
                            break;
                        }
                        break;
                    case 4:
                        if (q(i, obj2)) {
                            e3e.f(j2, obj, e3e.e(obj2, j2));
                            r(i, obj);
                            break;
                        }
                        break;
                    case 5:
                        if (q(i, obj2)) {
                            e3e.h(obj, j2, e3e.g(obj2, j2));
                            r(i, obj);
                            break;
                        }
                        break;
                    case 6:
                        if (q(i, obj2)) {
                            e3e.f(j2, obj, e3e.e(obj2, j2));
                            r(i, obj);
                            break;
                        }
                        break;
                    case 7:
                        if (q(i, obj2)) {
                            c3e c3eVar3 = e3e.c;
                            c3eVar3.S(obj, j2, c3eVar3.R(obj2, j2));
                            r(i, obj);
                            break;
                        }
                        break;
                    case 8:
                        if (q(i, obj2)) {
                            e3e.j(obj, j2, e3e.i(obj2, j2));
                            r(i, obj);
                            break;
                        }
                        break;
                    case 9:
                        z(i, obj, obj2);
                        break;
                    case 10:
                        if (q(i, obj2)) {
                            e3e.j(obj, j2, e3e.i(obj2, j2));
                            r(i, obj);
                            break;
                        }
                        break;
                    case 11:
                        if (q(i, obj2)) {
                            e3e.f(j2, obj, e3e.e(obj2, j2));
                            r(i, obj);
                            break;
                        }
                        break;
                    case 12:
                        if (q(i, obj2)) {
                            e3e.f(j2, obj, e3e.e(obj2, j2));
                            r(i, obj);
                            break;
                        }
                        break;
                    case 13:
                        if (q(i, obj2)) {
                            e3e.f(j2, obj, e3e.e(obj2, j2));
                            r(i, obj);
                            break;
                        }
                        break;
                    case 14:
                        if (q(i, obj2)) {
                            e3e.h(obj, j2, e3e.g(obj2, j2));
                            r(i, obj);
                            break;
                        }
                        break;
                    case 15:
                        if (q(i, obj2)) {
                            e3e.f(j2, obj, e3e.e(obj2, j2));
                            r(i, obj);
                            break;
                        }
                        break;
                    case 16:
                        if (q(i, obj2)) {
                            e3e.h(obj, j2, e3e.g(obj2, j2));
                            r(i, obj);
                            break;
                        }
                        break;
                    case 17:
                        z(i, obj, obj2);
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
                        f1e f1eVar = (f1e) e3e.i(obj, j2);
                        f1e f1eVar2 = (f1e) e3e.i(obj2, j2);
                        int size = f1eVar.size();
                        int size2 = f1eVar2.size();
                        if (size > 0 && size2 > 0) {
                            if (!((jzd) f1eVar).a) {
                                f1eVar = f1eVar.zzg(size2 + size);
                            }
                            f1eVar.addAll(f1eVar2);
                        }
                        if (size > 0) {
                            f1eVar2 = f1eVar;
                        }
                        e3e.j(obj, j2, f1eVar2);
                        break;
                    case Token.TRUE /* 50 */:
                        zj1 zj1Var = n2e.a;
                        e3e.j(obj, j2, pq8.d(e3e.i(obj, j2), e3e.i(obj2, j2)));
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
                        if (s(i4, obj2, i)) {
                            e3e.j(obj, j2, e3e.i(obj2, j2));
                            t(i4, obj, i);
                            break;
                        }
                        break;
                    case Token.GETVAR /* 60 */:
                        A(i, obj, obj2);
                        break;
                    case Token.SETVAR /* 61 */:
                    case Token.CATCH_SCOPE /* 62 */:
                    case Token.ENUM_INIT_KEYS /* 63 */:
                    case Token.ENUM_INIT_VALUES /* 64 */:
                    case Token.ENUM_INIT_ARRAY /* 65 */:
                    case Token.ENUM_INIT_VALUES_IN_ORDER /* 66 */:
                    case Token.ENUM_NEXT /* 67 */:
                        if (s(i4, obj2, i)) {
                            e3e.j(obj, j2, e3e.i(obj2, j2));
                            t(i4, obj, i);
                            break;
                        }
                        break;
                    case Token.ENUM_ID /* 68 */:
                        A(i, obj, obj2);
                        break;
                }
                obj3 = obj;
                i += 3;
                obj = obj3;
            } else {
                n2e.b(obj, obj2);
                return;
            }
        }
    }

    @Override // defpackage.m2e
    public final int b(hzd hzdVar) {
        int i;
        int a;
        int b;
        int a2;
        int b2;
        int a3;
        int c;
        int i2;
        int a4;
        int i3;
        int i4;
        int c2;
        int a5;
        int size;
        int s;
        int a6;
        int a7;
        int b3;
        int a8;
        int size2;
        int a9;
        int i5;
        int a10;
        int b4;
        int a11;
        int b5;
        int m;
        int a12;
        c2e c2eVar = this;
        hzd hzdVar2 = hzdVar;
        Unsafe unsafe = l;
        int i6 = 1048575;
        int i7 = 1048575;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = c2eVar.a;
            if (i8 < iArr.length) {
                int i11 = c2eVar.i(i8);
                int j = j(i11);
                int i12 = iArr[i8];
                int i13 = iArr[i8 + 2];
                int i14 = i13 & i6;
                if (j <= 17) {
                    if (i14 != i7) {
                        if (i14 == i6) {
                            i9 = 0;
                        } else {
                            i9 = unsafe.getInt(hzdVar2, i14);
                        }
                        i7 = i14;
                    }
                    i = 1 << (i13 >>> 20);
                } else {
                    i = 0;
                }
                int i15 = i11 & i6;
                if (j >= k0e.b.a) {
                    k0e.c.getClass();
                }
                long j2 = i15;
                switch (j) {
                    case 0:
                        if (!c2eVar.p(hzdVar2, i8, i7, i9, i)) {
                            break;
                        }
                        i10 = eub.g(i12 << 3, 8, i10);
                        break;
                    case 1:
                        if (!c2eVar.p(hzdVar2, i8, i7, i9, i)) {
                            break;
                        }
                        i10 = eub.g(i12 << 3, 4, i10);
                        break;
                    case 2:
                        if (c2eVar.p(hzdVar2, i8, i7, i9, i)) {
                            long j3 = unsafe.getLong(hzdVar2, j2);
                            a = g0e.a(i12 << 3);
                            b = g0e.b(j3);
                            i3 = b + a;
                            i10 += i3;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (c2eVar.p(hzdVar2, i8, i7, i9, i)) {
                            long j4 = unsafe.getLong(hzdVar2, j2);
                            a = g0e.a(i12 << 3);
                            b = g0e.b(j4);
                            i3 = b + a;
                            i10 += i3;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (c2eVar.p(hzdVar2, i8, i7, i9, i)) {
                            a = g0e.a(i12 << 3);
                            b = g0e.b(unsafe.getInt(hzdVar2, j2));
                            i3 = b + a;
                            i10 += i3;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (!c2eVar.p(hzdVar2, i8, i7, i9, i)) {
                            break;
                        }
                        i10 = eub.g(i12 << 3, 8, i10);
                        break;
                    case 6:
                        if (!c2eVar.p(hzdVar2, i8, i7, i9, i)) {
                            break;
                        }
                        i10 = eub.g(i12 << 3, 4, i10);
                        break;
                    case 7:
                        if (c2eVar.p(hzdVar2, i8, i7, i9, i)) {
                            i10 = eub.g(i12 << 3, 1, i10);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (c2eVar.p(hzdVar2, i8, i7, i9, i)) {
                            int i16 = i12 << 3;
                            Object object = unsafe.getObject(hzdVar2, j2);
                            if (object instanceof szd) {
                                a2 = g0e.a(i16);
                                b2 = ((szd) object).b();
                            } else {
                                a2 = g0e.a(i16);
                                b2 = h3e.b((String) object);
                            }
                            i10 = eub.h(b2, b2, a2, i10);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (c2eVar.p(hzdVar2, i8, i7, i9, i)) {
                            Object object2 = unsafe.getObject(hzdVar2, j2);
                            m2e B = c2eVar.B(i8);
                            zj1 zj1Var = n2e.a;
                            a3 = g0e.a(i12 << 3);
                            c = ((hzd) object2).c(B);
                            i10 = eub.h(c, c, a3, i10);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (c2eVar.p(hzdVar2, i8, i7, i9, i)) {
                            a2 = g0e.a(i12 << 3);
                            b2 = ((szd) unsafe.getObject(hzdVar2, j2)).b();
                            i10 = eub.h(b2, b2, a2, i10);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (c2eVar.p(hzdVar2, i8, i7, i9, i)) {
                            i2 = unsafe.getInt(hzdVar2, j2);
                            a4 = g0e.a(i12 << 3);
                            i10 = eub.g(i2, a4, i10);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (c2eVar.p(hzdVar2, i8, i7, i9, i)) {
                            a = g0e.a(i12 << 3);
                            b = g0e.b(unsafe.getInt(hzdVar2, j2));
                            i3 = b + a;
                            i10 += i3;
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (!c2eVar.p(hzdVar2, i8, i7, i9, i)) {
                            break;
                        }
                        i10 = eub.g(i12 << 3, 4, i10);
                        break;
                    case 14:
                        if (!c2eVar.p(hzdVar2, i8, i7, i9, i)) {
                            break;
                        }
                        i10 = eub.g(i12 << 3, 8, i10);
                        break;
                    case 15:
                        if (c2eVar.p(hzdVar2, i8, i7, i9, i)) {
                            int i17 = unsafe.getInt(hzdVar2, j2);
                            a4 = g0e.a(i12 << 3);
                            i2 = (i17 >> 31) ^ (i17 + i17);
                            i10 = eub.g(i2, a4, i10);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (c2eVar.p(hzdVar2, i8, i7, i9, i)) {
                            long j5 = unsafe.getLong(hzdVar2, j2);
                            a = g0e.a(i12 << 3);
                            b = g0e.b((j5 >> 63) ^ (j5 + j5));
                            i3 = b + a;
                            i10 += i3;
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (c2eVar.p(hzdVar2, i8, i7, i9, i)) {
                            m2e B2 = c2eVar.B(i8);
                            zj1 zj1Var2 = n2e.a;
                            int a13 = g0e.a(i12 << 3);
                            i4 = a13 + a13;
                            c2 = ((hzd) unsafe.getObject(hzdVar2, j2)).c(B2);
                            i3 = c2 + i4;
                            i10 += i3;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        i3 = n2e.z(i12, (List) unsafe.getObject(hzdVar2, j2));
                        i10 += i3;
                        break;
                    case 19:
                        i3 = n2e.y(i12, (List) unsafe.getObject(hzdVar2, j2));
                        i10 += i3;
                        break;
                    case 20:
                        List list = (List) unsafe.getObject(hzdVar2, j2);
                        zj1 zj1Var3 = n2e.a;
                        if (list.size() != 0) {
                            a5 = (g0e.a(i12 << 3) * list.size()) + n2e.r(list);
                            i10 += a5;
                            break;
                        }
                        a5 = 0;
                        i10 += a5;
                    case 21:
                        List list2 = (List) unsafe.getObject(hzdVar2, j2);
                        zj1 zj1Var4 = n2e.a;
                        size = list2.size();
                        if (size != 0) {
                            s = n2e.s(list2);
                            a6 = g0e.a(i12 << 3);
                            a7 = (a6 * size) + s;
                            i10 += a7;
                            break;
                        }
                        a7 = 0;
                        i10 += a7;
                    case 22:
                        List list3 = (List) unsafe.getObject(hzdVar2, j2);
                        zj1 zj1Var5 = n2e.a;
                        size = list3.size();
                        if (size != 0) {
                            s = n2e.v(list3);
                            a6 = g0e.a(i12 << 3);
                            a7 = (a6 * size) + s;
                            i10 += a7;
                            break;
                        }
                        a7 = 0;
                        i10 += a7;
                    case 23:
                        i3 = n2e.z(i12, (List) unsafe.getObject(hzdVar2, j2));
                        i10 += i3;
                        break;
                    case 24:
                        i3 = n2e.y(i12, (List) unsafe.getObject(hzdVar2, j2));
                        i10 += i3;
                        break;
                    case 25:
                        zj1 zj1Var6 = n2e.a;
                        int size3 = ((List) unsafe.getObject(hzdVar2, j2)).size();
                        if (size3 != 0) {
                            a5 = (g0e.a(i12 << 3) + 1) * size3;
                            i10 += a5;
                            break;
                        }
                        a5 = 0;
                        i10 += a5;
                    case 26:
                        List list4 = (List) unsafe.getObject(hzdVar2, j2);
                        zj1 zj1Var7 = n2e.a;
                        int size4 = list4.size();
                        if (size4 != 0) {
                            a7 = g0e.a(i12 << 3) * size4;
                            for (int i18 = 0; i18 < size4; i18++) {
                                Object obj = list4.get(i18);
                                if (obj instanceof szd) {
                                    b3 = ((szd) obj).b();
                                } else {
                                    b3 = h3e.b((String) obj);
                                }
                                a7 = eub.g(b3, b3, a7);
                            }
                            i10 += a7;
                            break;
                        }
                        a7 = 0;
                        i10 += a7;
                    case 27:
                        List list5 = (List) unsafe.getObject(hzdVar2, j2);
                        m2e B3 = c2eVar.B(i8);
                        zj1 zj1Var8 = n2e.a;
                        int size5 = list5.size();
                        if (size5 == 0) {
                            a8 = 0;
                        } else {
                            a8 = g0e.a(i12 << 3) * size5;
                            for (int i19 = 0; i19 < size5; i19++) {
                                int c3 = ((hzd) list5.get(i19)).c(B3);
                                a8 = eub.g(c3, c3, a8);
                            }
                        }
                        i10 += a8;
                        break;
                    case 28:
                        List list6 = (List) unsafe.getObject(hzdVar2, j2);
                        zj1 zj1Var9 = n2e.a;
                        int size6 = list6.size();
                        if (size6 != 0) {
                            a7 = g0e.a(i12 << 3) * size6;
                            for (int i20 = 0; i20 < list6.size(); i20++) {
                                int b6 = ((szd) list6.get(i20)).b();
                                a7 = eub.g(b6, b6, a7);
                            }
                            i10 += a7;
                            break;
                        }
                        a7 = 0;
                        i10 += a7;
                    case 29:
                        List list7 = (List) unsafe.getObject(hzdVar2, j2);
                        zj1 zj1Var10 = n2e.a;
                        size = list7.size();
                        if (size != 0) {
                            s = n2e.w(list7);
                            a6 = g0e.a(i12 << 3);
                            a7 = (a6 * size) + s;
                            i10 += a7;
                            break;
                        }
                        a7 = 0;
                        i10 += a7;
                    case 30:
                        List list8 = (List) unsafe.getObject(hzdVar2, j2);
                        zj1 zj1Var11 = n2e.a;
                        size = list8.size();
                        if (size != 0) {
                            s = n2e.u(list8);
                            a6 = g0e.a(i12 << 3);
                            a7 = (a6 * size) + s;
                            i10 += a7;
                            break;
                        }
                        a7 = 0;
                        i10 += a7;
                    case 31:
                        i3 = n2e.y(i12, (List) unsafe.getObject(hzdVar2, j2));
                        i10 += i3;
                        break;
                    case 32:
                        i3 = n2e.z(i12, (List) unsafe.getObject(hzdVar2, j2));
                        i10 += i3;
                        break;
                    case Token.GETPROP /* 33 */:
                        List list9 = (List) unsafe.getObject(hzdVar2, j2);
                        zj1 zj1Var12 = n2e.a;
                        size = list9.size();
                        if (size != 0) {
                            s = n2e.x(list9);
                            a6 = g0e.a(i12 << 3);
                            a7 = (a6 * size) + s;
                            i10 += a7;
                            break;
                        }
                        a7 = 0;
                        i10 += a7;
                    case Token.GETPROPNOWARN /* 34 */:
                        List list10 = (List) unsafe.getObject(hzdVar2, j2);
                        zj1 zj1Var13 = n2e.a;
                        size = list10.size();
                        if (size != 0) {
                            s = n2e.t(list10);
                            a6 = g0e.a(i12 << 3);
                            a7 = (a6 * size) + s;
                            i10 += a7;
                            break;
                        }
                        a7 = 0;
                        i10 += a7;
                    case Token.GETPROP_SUPER /* 35 */:
                        zj1 zj1Var14 = n2e.a;
                        size2 = ((List) unsafe.getObject(hzdVar2, j2)).size() * 8;
                        if (size2 > 0) {
                            a9 = g0e.a(i12 << 3);
                            i10 = eub.h(size2, a9, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case Token.GETPROPNOWARN_SUPER /* 36 */:
                        zj1 zj1Var15 = n2e.a;
                        size2 = ((List) unsafe.getObject(hzdVar2, j2)).size() * 4;
                        if (size2 > 0) {
                            a9 = g0e.a(i12 << 3);
                            i10 = eub.h(size2, a9, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case Token.SETPROP /* 37 */:
                        size2 = n2e.r((List) unsafe.getObject(hzdVar2, j2));
                        if (size2 > 0) {
                            a9 = g0e.a(i12 << 3);
                            i10 = eub.h(size2, a9, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case Token.SETPROP_SUPER /* 38 */:
                        size2 = n2e.s((List) unsafe.getObject(hzdVar2, j2));
                        if (size2 > 0) {
                            a9 = g0e.a(i12 << 3);
                            i10 = eub.h(size2, a9, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case Token.GETELEM /* 39 */:
                        size2 = n2e.v((List) unsafe.getObject(hzdVar2, j2));
                        if (size2 > 0) {
                            a9 = g0e.a(i12 << 3);
                            i10 = eub.h(size2, a9, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case Token.GETELEM_SUPER /* 40 */:
                        zj1 zj1Var16 = n2e.a;
                        size2 = ((List) unsafe.getObject(hzdVar2, j2)).size() * 8;
                        if (size2 > 0) {
                            a9 = g0e.a(i12 << 3);
                            i10 = eub.h(size2, a9, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case Token.SETELEM /* 41 */:
                        zj1 zj1Var17 = n2e.a;
                        size2 = ((List) unsafe.getObject(hzdVar2, j2)).size() * 4;
                        if (size2 > 0) {
                            a9 = g0e.a(i12 << 3);
                            i10 = eub.h(size2, a9, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case Token.SETELEM_SUPER /* 42 */:
                        zj1 zj1Var18 = n2e.a;
                        size2 = ((List) unsafe.getObject(hzdVar2, j2)).size();
                        if (size2 > 0) {
                            a9 = g0e.a(i12 << 3);
                            i10 = eub.h(size2, a9, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case Token.CALL /* 43 */:
                        size2 = n2e.w((List) unsafe.getObject(hzdVar2, j2));
                        if (size2 > 0) {
                            a9 = g0e.a(i12 << 3);
                            i10 = eub.h(size2, a9, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case Token.NAME /* 44 */:
                        size2 = n2e.u((List) unsafe.getObject(hzdVar2, j2));
                        if (size2 > 0) {
                            a9 = g0e.a(i12 << 3);
                            i10 = eub.h(size2, a9, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case Token.NUMBER /* 45 */:
                        zj1 zj1Var19 = n2e.a;
                        size2 = ((List) unsafe.getObject(hzdVar2, j2)).size() * 4;
                        if (size2 > 0) {
                            a9 = g0e.a(i12 << 3);
                            i10 = eub.h(size2, a9, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case Token.STRING /* 46 */:
                        zj1 zj1Var20 = n2e.a;
                        size2 = ((List) unsafe.getObject(hzdVar2, j2)).size() * 8;
                        if (size2 > 0) {
                            a9 = g0e.a(i12 << 3);
                            i10 = eub.h(size2, a9, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case Token.NULL /* 47 */:
                        size2 = n2e.x((List) unsafe.getObject(hzdVar2, j2));
                        if (size2 > 0) {
                            a9 = g0e.a(i12 << 3);
                            i10 = eub.h(size2, a9, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case Token.THIS /* 48 */:
                        size2 = n2e.t((List) unsafe.getObject(hzdVar2, j2));
                        if (size2 > 0) {
                            a9 = g0e.a(i12 << 3);
                            i10 = eub.h(size2, a9, size2, i10);
                            break;
                        } else {
                            break;
                        }
                    case Token.FALSE /* 49 */:
                        List list11 = (List) unsafe.getObject(hzdVar2, j2);
                        m2e B4 = c2eVar.B(i8);
                        zj1 zj1Var21 = n2e.a;
                        int size7 = list11.size();
                        if (size7 == 0) {
                            i5 = 0;
                        } else {
                            i5 = 0;
                            for (int i21 = 0; i21 < size7; i21++) {
                                int a14 = g0e.a(i12 << 3);
                                i5 += ((hzd) list11.get(i21)).c(B4) + a14 + a14;
                            }
                        }
                        i10 += i5;
                        break;
                    case Token.TRUE /* 50 */:
                        r1e r1eVar = (r1e) unsafe.getObject(hzdVar2, j2);
                        q1e q1eVar = (q1e) c2eVar.C(i8);
                        if (!r1eVar.isEmpty()) {
                            a7 = 0;
                            for (Map.Entry entry : r1eVar.entrySet()) {
                                Object key = entry.getKey();
                                Object value = entry.getValue();
                                yx9 yx9Var = q1eVar.a;
                                int a15 = g0e.a(i12 << 3);
                                int b7 = q1e.b(yx9Var, key, value);
                                a7 = eub.h(b7, b7, a15, a7);
                            }
                            i10 += a7;
                            break;
                        }
                        a7 = 0;
                        i10 += a7;
                    case Token.SHEQ /* 51 */:
                        if (!c2eVar.s(i12, hzdVar2, i8)) {
                            break;
                        }
                        i10 = eub.g(i12 << 3, 8, i10);
                        break;
                    case Token.SHNE /* 52 */:
                        if (!c2eVar.s(i12, hzdVar2, i8)) {
                            break;
                        }
                        i10 = eub.g(i12 << 3, 4, i10);
                        break;
                    case Token.REGEXP /* 53 */:
                        if (c2eVar.s(i12, hzdVar2, i8)) {
                            long n = n(hzdVar2, j2);
                            a10 = g0e.a(i12 << 3);
                            b4 = g0e.b(n);
                            i10 += b4 + a10;
                            break;
                        } else {
                            break;
                        }
                    case Token.BINDNAME /* 54 */:
                        if (c2eVar.s(i12, hzdVar2, i8)) {
                            long n2 = n(hzdVar2, j2);
                            a10 = g0e.a(i12 << 3);
                            b4 = g0e.b(n2);
                            i10 += b4 + a10;
                            break;
                        } else {
                            break;
                        }
                    case Token.THROW /* 55 */:
                        if (c2eVar.s(i12, hzdVar2, i8)) {
                            a10 = g0e.a(i12 << 3);
                            b4 = g0e.b(m(hzdVar2, j2));
                            i10 += b4 + a10;
                            break;
                        } else {
                            break;
                        }
                    case Token.RETHROW /* 56 */:
                        if (!c2eVar.s(i12, hzdVar2, i8)) {
                            break;
                        }
                        i10 = eub.g(i12 << 3, 8, i10);
                        break;
                    case Token.IN /* 57 */:
                        if (!c2eVar.s(i12, hzdVar2, i8)) {
                            break;
                        }
                        i10 = eub.g(i12 << 3, 4, i10);
                        break;
                    case Token.INSTANCEOF /* 58 */:
                        if (c2eVar.s(i12, hzdVar2, i8)) {
                            i10 = eub.g(i12 << 3, 1, i10);
                            break;
                        } else {
                            break;
                        }
                    case Token.LOCAL_LOAD /* 59 */:
                        if (c2eVar.s(i12, hzdVar2, i8)) {
                            int i22 = i12 << 3;
                            Object object3 = unsafe.getObject(hzdVar2, j2);
                            if (object3 instanceof szd) {
                                a11 = g0e.a(i22);
                                b5 = ((szd) object3).b();
                            } else {
                                a11 = g0e.a(i22);
                                b5 = h3e.b((String) object3);
                            }
                            i10 = eub.h(b5, b5, a11, i10);
                            break;
                        } else {
                            break;
                        }
                    case Token.GETVAR /* 60 */:
                        if (c2eVar.s(i12, hzdVar2, i8)) {
                            Object object4 = unsafe.getObject(hzdVar2, j2);
                            m2e B5 = c2eVar.B(i8);
                            zj1 zj1Var22 = n2e.a;
                            a3 = g0e.a(i12 << 3);
                            c = ((hzd) object4).c(B5);
                            i10 = eub.h(c, c, a3, i10);
                            break;
                        } else {
                            break;
                        }
                    case Token.SETVAR /* 61 */:
                        if (c2eVar.s(i12, hzdVar2, i8)) {
                            a11 = g0e.a(i12 << 3);
                            b5 = ((szd) unsafe.getObject(hzdVar2, j2)).b();
                            i10 = eub.h(b5, b5, a11, i10);
                            break;
                        } else {
                            break;
                        }
                    case Token.CATCH_SCOPE /* 62 */:
                        if (c2eVar.s(i12, hzdVar2, i8)) {
                            m = m(hzdVar2, j2);
                            a12 = g0e.a(i12 << 3);
                            i10 = eub.g(m, a12, i10);
                            break;
                        } else {
                            break;
                        }
                    case Token.ENUM_INIT_KEYS /* 63 */:
                        if (c2eVar.s(i12, hzdVar2, i8)) {
                            a10 = g0e.a(i12 << 3);
                            b4 = g0e.b(m(hzdVar2, j2));
                            i10 += b4 + a10;
                            break;
                        } else {
                            break;
                        }
                    case Token.ENUM_INIT_VALUES /* 64 */:
                        if (!c2eVar.s(i12, hzdVar2, i8)) {
                            break;
                        }
                        i10 = eub.g(i12 << 3, 4, i10);
                        break;
                    case Token.ENUM_INIT_ARRAY /* 65 */:
                        if (!c2eVar.s(i12, hzdVar2, i8)) {
                            break;
                        }
                        i10 = eub.g(i12 << 3, 8, i10);
                        break;
                    case Token.ENUM_INIT_VALUES_IN_ORDER /* 66 */:
                        if (c2eVar.s(i12, hzdVar2, i8)) {
                            int m2 = m(hzdVar2, j2);
                            a12 = g0e.a(i12 << 3);
                            m = (m2 >> 31) ^ (m2 + m2);
                            i10 = eub.g(m, a12, i10);
                            break;
                        } else {
                            break;
                        }
                    case Token.ENUM_NEXT /* 67 */:
                        if (c2eVar.s(i12, hzdVar2, i8)) {
                            long n3 = n(hzdVar2, j2);
                            a10 = g0e.a(i12 << 3);
                            b4 = g0e.b((n3 >> 63) ^ (n3 + n3));
                            i10 += b4 + a10;
                            break;
                        } else {
                            break;
                        }
                    case Token.ENUM_ID /* 68 */:
                        if (c2eVar.s(i12, hzdVar2, i8)) {
                            m2e B6 = c2eVar.B(i8);
                            zj1 zj1Var23 = n2e.a;
                            int a16 = g0e.a(i12 << 3);
                            i4 = a16 + a16;
                            c2 = ((hzd) unsafe.getObject(hzdVar2, j2)).c(B6);
                            i3 = c2 + i4;
                            i10 += i3;
                            break;
                        } else {
                            break;
                        }
                }
                i8 += 3;
                c2eVar = this;
                hzdVar2 = hzdVar;
                i6 = 1048575;
            } else {
                return ((o0e) hzdVar).zzc.c() + i10;
            }
        }
    }

    @Override // defpackage.m2e
    public final void c(Object obj) {
        if (k(obj)) {
            if (obj instanceof o0e) {
                o0e o0eVar = (o0e) obj;
                o0eVar.l();
                o0eVar.zza = 0;
                o0eVar.h();
            }
            int i = 0;
            while (true) {
                int[] iArr = this.a;
                if (i < iArr.length) {
                    int i2 = i(i);
                    int i3 = 1048575 & i2;
                    int j = j(i2);
                    long j2 = i3;
                    if (j != 9) {
                        if (j != 60 && j != 68) {
                            switch (j) {
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
                                    jzd jzdVar = (jzd) ((f1e) e3e.i(obj, j2));
                                    if (!jzdVar.a) {
                                        break;
                                    } else {
                                        jzdVar.a = false;
                                        break;
                                    }
                                case Token.TRUE /* 50 */:
                                    Unsafe unsafe = l;
                                    Object object = unsafe.getObject(obj, j2);
                                    if (object == null) {
                                        break;
                                    } else {
                                        ((r1e) object).a = false;
                                        unsafe.putObject(obj, j2, object);
                                        break;
                                    }
                            }
                        } else if (s(iArr[i], obj, i)) {
                            B(i).c(l.getObject(obj, j2));
                        }
                        i += 3;
                    }
                    if (q(i, obj)) {
                        B(i).c(l.getObject(obj, j2));
                    }
                    i += 3;
                } else {
                    this.j.getClass();
                    x2e x2eVar = ((o0e) obj).zzc;
                    if (x2eVar.e) {
                        x2eVar.e = false;
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // defpackage.m2e
    public final int d(o0e o0eVar) {
        int i;
        int i2;
        long doubleToLongBits;
        int i3;
        int floatToIntBits;
        int i4;
        int i5;
        int i6 = 0;
        for (int i7 = 0; i7 < this.a.length; i7 += 3) {
            int i8 = i(i7);
            int j = j(i8);
            if (j <= 50 || j >= 69) {
                long j2 = i8 & 1048575;
                int i9 = 37;
                switch (j) {
                    case 0:
                        i2 = i6 * 53;
                        doubleToLongBits = Double.doubleToLongBits(e3e.c.V(o0eVar, j2));
                        byte[] bArr = d1e.a;
                        i4 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i6 = i2 + i4;
                        break;
                    case 1:
                        i3 = i6 * 53;
                        floatToIntBits = Float.floatToIntBits(e3e.c.T(o0eVar, j2));
                        i6 = i3 + floatToIntBits;
                        break;
                    case 2:
                        i2 = i6 * 53;
                        doubleToLongBits = e3e.g(o0eVar, j2);
                        byte[] bArr2 = d1e.a;
                        i4 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i6 = i2 + i4;
                        break;
                    case 3:
                        i2 = i6 * 53;
                        doubleToLongBits = e3e.g(o0eVar, j2);
                        byte[] bArr3 = d1e.a;
                        i4 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i6 = i2 + i4;
                        break;
                    case 4:
                        i3 = i6 * 53;
                        floatToIntBits = e3e.e(o0eVar, j2);
                        i6 = i3 + floatToIntBits;
                        break;
                    case 5:
                        i2 = i6 * 53;
                        doubleToLongBits = e3e.g(o0eVar, j2);
                        byte[] bArr4 = d1e.a;
                        i4 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i6 = i2 + i4;
                        break;
                    case 6:
                        i3 = i6 * 53;
                        floatToIntBits = e3e.e(o0eVar, j2);
                        i6 = i3 + floatToIntBits;
                        break;
                    case 7:
                        i2 = i6 * 53;
                        boolean R = e3e.c.R(o0eVar, j2);
                        byte[] bArr5 = d1e.a;
                        if (R) {
                            i4 = 1231;
                        } else {
                            i4 = 1237;
                        }
                        i6 = i2 + i4;
                        break;
                    case 8:
                        i3 = i6 * 53;
                        floatToIntBits = ((String) e3e.i(o0eVar, j2)).hashCode();
                        i6 = i3 + floatToIntBits;
                        break;
                    case 9:
                        i5 = i6 * 53;
                        Object i10 = e3e.i(o0eVar, j2);
                        if (i10 != null) {
                            i9 = i10.hashCode();
                        }
                        i6 = i5 + i9;
                        break;
                    case 10:
                        i3 = i6 * 53;
                        floatToIntBits = e3e.i(o0eVar, j2).hashCode();
                        i6 = i3 + floatToIntBits;
                        break;
                    case 11:
                        i3 = i6 * 53;
                        floatToIntBits = e3e.e(o0eVar, j2);
                        i6 = i3 + floatToIntBits;
                        break;
                    case 12:
                        i3 = i6 * 53;
                        floatToIntBits = e3e.e(o0eVar, j2);
                        i6 = i3 + floatToIntBits;
                        break;
                    case 13:
                        i3 = i6 * 53;
                        floatToIntBits = e3e.e(o0eVar, j2);
                        i6 = i3 + floatToIntBits;
                        break;
                    case 14:
                        i2 = i6 * 53;
                        doubleToLongBits = e3e.g(o0eVar, j2);
                        byte[] bArr6 = d1e.a;
                        i4 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i6 = i2 + i4;
                        break;
                    case 15:
                        i3 = i6 * 53;
                        floatToIntBits = e3e.e(o0eVar, j2);
                        i6 = i3 + floatToIntBits;
                        break;
                    case 16:
                        i2 = i6 * 53;
                        doubleToLongBits = e3e.g(o0eVar, j2);
                        byte[] bArr7 = d1e.a;
                        i4 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i6 = i2 + i4;
                        break;
                    case 17:
                        i5 = i6 * 53;
                        Object i11 = e3e.i(o0eVar, j2);
                        if (i11 != null) {
                            i9 = i11.hashCode();
                        }
                        i6 = i5 + i9;
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
                        i3 = i6 * 53;
                        floatToIntBits = e3e.i(o0eVar, j2).hashCode();
                        i6 = i3 + floatToIntBits;
                        break;
                    case Token.TRUE /* 50 */:
                        i3 = i6 * 53;
                        floatToIntBits = e3e.i(o0eVar, j2).hashCode();
                        i6 = i3 + floatToIntBits;
                        break;
                }
            }
        }
        int i12 = this.i;
        while (true) {
            int[] iArr = this.g;
            if (i12 < iArr.length) {
                if (!s(0, o0eVar, iArr[i12])) {
                    i6 = e3e.i(o0eVar, i(i) & 1048575).hashCode() + (i6 * 53);
                }
                i12++;
            } else {
                return o0eVar.zzc.hashCode() + (i6 * 53);
            }
        }
    }

    @Override // defpackage.m2e
    public final void e(Object obj, byte[] bArr, int i, int i2, lzd lzdVar) {
        w(obj, bArr, i, i2, 0, lzdVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:209:0x07d7  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x07e3  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x07ef A[LOOP:1: B:216:0x07ed->B:217:0x07ef, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0800  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x07ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x07bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:347:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.m2e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.lang.Object r22, defpackage.vh1 r23, defpackage.h0e r24) {
        /*
            Method dump skipped, instructions count: 2202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c2e.f(java.lang.Object, vh1, h0e):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x01d1, code lost:
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0218 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01d1 A[SYNTHETIC] */
    @Override // defpackage.m2e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(defpackage.o0e r9, defpackage.o0e r10) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c2e.g(o0e, o0e):boolean");
    }

    @Override // defpackage.m2e
    public final void h(Object obj, bp9 bp9Var) {
        int[] iArr;
        int i;
        c2e c2eVar = this;
        g0e g0eVar = (g0e) bp9Var.b;
        Unsafe unsafe = l;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int[] iArr2 = c2eVar.a;
            if (i4 < iArr2.length) {
                int i6 = c2eVar.i(i4);
                int j = j(i6);
                int i7 = iArr2[i4];
                if (j <= 17) {
                    int i8 = iArr2[i4 + 2];
                    int i9 = i8 & i2;
                    if (i9 != i3) {
                        if (i9 == i2) {
                            i5 = 0;
                        } else {
                            i5 = unsafe.getInt(obj, i9);
                        }
                        i3 = i9;
                    }
                    iArr = iArr2;
                    i = 1 << (i8 >>> 20);
                } else {
                    iArr = iArr2;
                    i = 0;
                }
                long j2 = i6 & i2;
                switch (j) {
                    case 0:
                        if (c2eVar.p(obj, i4, i3, i5, i)) {
                            g0eVar.i(i7, Double.doubleToRawLongBits(e3e.c.V(obj, j2)));
                            continue;
                        }
                        i4 += 3;
                        i2 = 1048575;
                        c2eVar = this;
                    case 1:
                        if (c2eVar.p(obj, i4, i3, i5, i)) {
                            g0eVar.g(i7, Float.floatToRawIntBits(e3e.c.T(obj, j2)));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i2 = 1048575;
                        c2eVar = this;
                    case 2:
                        if (c2eVar.p(obj, i4, i3, i5, i)) {
                            g0eVar.h(i7, unsafe.getLong(obj, j2));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i2 = 1048575;
                        c2eVar = this;
                    case 3:
                        if (c2eVar.p(obj, i4, i3, i5, i)) {
                            g0eVar.h(i7, unsafe.getLong(obj, j2));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i2 = 1048575;
                        c2eVar = this;
                    case 4:
                        if (c2eVar.p(obj, i4, i3, i5, i)) {
                            g0eVar.e(i7, unsafe.getInt(obj, j2));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i2 = 1048575;
                        c2eVar = this;
                    case 5:
                        if (c2eVar.p(obj, i4, i3, i5, i)) {
                            g0eVar.i(i7, unsafe.getLong(obj, j2));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i2 = 1048575;
                        c2eVar = this;
                    case 6:
                        if (c2eVar.p(obj, i4, i3, i5, i)) {
                            g0eVar.g(i7, unsafe.getInt(obj, j2));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i2 = 1048575;
                        c2eVar = this;
                    case 7:
                        if (c2eVar.p(obj, i4, i3, i5, i)) {
                            g0eVar.j(i7, e3e.c.R(obj, j2));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i2 = 1048575;
                        c2eVar = this;
                    case 8:
                        if (c2eVar.p(obj, i4, i3, i5, i)) {
                            Object object = unsafe.getObject(obj, j2);
                            if (object instanceof String) {
                                g0eVar.k(i7, (String) object);
                            } else {
                                g0eVar.l(i7, (szd) object);
                            }
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i2 = 1048575;
                        c2eVar = this;
                    case 9:
                        if (c2eVar.p(obj, i4, i3, i5, i)) {
                            bp9Var.A(i7, unsafe.getObject(obj, j2), c2eVar.B(i4));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i2 = 1048575;
                        c2eVar = this;
                    case 10:
                        if (c2eVar.p(obj, i4, i3, i5, i)) {
                            g0eVar.l(i7, (szd) unsafe.getObject(obj, j2));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i2 = 1048575;
                        c2eVar = this;
                    case 11:
                        if (c2eVar.p(obj, i4, i3, i5, i)) {
                            g0eVar.f(i7, unsafe.getInt(obj, j2));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i2 = 1048575;
                        c2eVar = this;
                    case 12:
                        if (c2eVar.p(obj, i4, i3, i5, i)) {
                            g0eVar.e(i7, unsafe.getInt(obj, j2));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i2 = 1048575;
                        c2eVar = this;
                    case 13:
                        if (c2eVar.p(obj, i4, i3, i5, i)) {
                            g0eVar.g(i7, unsafe.getInt(obj, j2));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i2 = 1048575;
                        c2eVar = this;
                    case 14:
                        if (c2eVar.p(obj, i4, i3, i5, i)) {
                            g0eVar.i(i7, unsafe.getLong(obj, j2));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i2 = 1048575;
                        c2eVar = this;
                    case 15:
                        if (c2eVar.p(obj, i4, i3, i5, i)) {
                            int i10 = unsafe.getInt(obj, j2);
                            g0eVar.f(i7, (i10 >> 31) ^ (i10 + i10));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i2 = 1048575;
                        c2eVar = this;
                    case 16:
                        if (c2eVar.p(obj, i4, i3, i5, i)) {
                            long j3 = unsafe.getLong(obj, j2);
                            g0eVar.h(i7, (j3 >> 63) ^ (j3 + j3));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i2 = 1048575;
                        c2eVar = this;
                    case 17:
                        if (c2eVar.p(obj, i4, i3, i5, i)) {
                            Object object2 = unsafe.getObject(obj, j2);
                            g0eVar.d(i7, 3);
                            c2eVar.B(i4).h((hzd) object2, bp9Var);
                            g0eVar.d(i7, 4);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i2 = 1048575;
                        c2eVar = this;
                    case 18:
                        n2e.d(iArr[i4], (List) unsafe.getObject(obj, j2), bp9Var, false);
                        continue;
                        i4 += 3;
                        i2 = 1048575;
                        c2eVar = this;
                    case 19:
                        n2e.e(iArr[i4], (List) unsafe.getObject(obj, j2), bp9Var, false);
                        continue;
                        i4 += 3;
                        i2 = 1048575;
                        c2eVar = this;
                    case 20:
                        n2e.f(iArr[i4], (List) unsafe.getObject(obj, j2), bp9Var, false);
                        continue;
                        i4 += 3;
                        i2 = 1048575;
                        c2eVar = this;
                    case 21:
                        n2e.g(iArr[i4], (List) unsafe.getObject(obj, j2), bp9Var, false);
                        continue;
                        i4 += 3;
                        i2 = 1048575;
                        c2eVar = this;
                    case 22:
                        n2e.k(iArr[i4], (List) unsafe.getObject(obj, j2), bp9Var, false);
                        continue;
                        i4 += 3;
                        i2 = 1048575;
                        c2eVar = this;
                    case 23:
                        n2e.i(iArr[i4], (List) unsafe.getObject(obj, j2), bp9Var, false);
                        continue;
                        i4 += 3;
                        i2 = 1048575;
                        c2eVar = this;
                    case 24:
                        n2e.n(iArr[i4], (List) unsafe.getObject(obj, j2), bp9Var, false);
                        continue;
                        i4 += 3;
                        i2 = 1048575;
                        c2eVar = this;
                    case 25:
                        n2e.q(iArr[i4], (List) unsafe.getObject(obj, j2), bp9Var, false);
                        continue;
                        i4 += 3;
                        i2 = 1048575;
                        c2eVar = this;
                    case 26:
                        int i11 = iArr[i4];
                        List list = (List) unsafe.getObject(obj, j2);
                        zj1 zj1Var = n2e.a;
                        if (list != null && !list.isEmpty()) {
                            for (int i12 = 0; i12 < list.size(); i12++) {
                                g0eVar.k(i11, (String) list.get(i12));
                            }
                            break;
                        }
                        break;
                    case 27:
                        int i13 = iArr[i4];
                        List list2 = (List) unsafe.getObject(obj, j2);
                        m2e B = c2eVar.B(i4);
                        zj1 zj1Var2 = n2e.a;
                        if (list2 != null && !list2.isEmpty()) {
                            for (int i14 = 0; i14 < list2.size(); i14++) {
                                bp9Var.A(i13, list2.get(i14), B);
                            }
                            break;
                        }
                        break;
                    case 28:
                        int i15 = iArr[i4];
                        List list3 = (List) unsafe.getObject(obj, j2);
                        zj1 zj1Var3 = n2e.a;
                        if (list3 != null && !list3.isEmpty()) {
                            for (int i16 = 0; i16 < list3.size(); i16++) {
                                g0eVar.l(i15, (szd) list3.get(i16));
                            }
                            break;
                        }
                        break;
                    case 29:
                        n2e.l(iArr[i4], (List) unsafe.getObject(obj, j2), bp9Var, false);
                        continue;
                        i4 += 3;
                        i2 = 1048575;
                        c2eVar = this;
                    case 30:
                        n2e.p(iArr[i4], (List) unsafe.getObject(obj, j2), bp9Var, false);
                        continue;
                        i4 += 3;
                        i2 = 1048575;
                        c2eVar = this;
                    case 31:
                        n2e.o(iArr[i4], (List) unsafe.getObject(obj, j2), bp9Var, false);
                        continue;
                        i4 += 3;
                        i2 = 1048575;
                        c2eVar = this;
                    case 32:
                        n2e.j(iArr[i4], (List) unsafe.getObject(obj, j2), bp9Var, false);
                        continue;
                        i4 += 3;
                        i2 = 1048575;
                        c2eVar = this;
                    case Token.GETPROP /* 33 */:
                        n2e.m(iArr[i4], (List) unsafe.getObject(obj, j2), bp9Var, false);
                        continue;
                        i4 += 3;
                        i2 = 1048575;
                        c2eVar = this;
                    case Token.GETPROPNOWARN /* 34 */:
                        n2e.h(iArr[i4], (List) unsafe.getObject(obj, j2), bp9Var, false);
                        continue;
                        i4 += 3;
                        i2 = 1048575;
                        c2eVar = this;
                    case Token.GETPROP_SUPER /* 35 */:
                        n2e.d(iArr[i4], (List) unsafe.getObject(obj, j2), bp9Var, true);
                        break;
                    case Token.GETPROPNOWARN_SUPER /* 36 */:
                        n2e.e(iArr[i4], (List) unsafe.getObject(obj, j2), bp9Var, true);
                        break;
                    case Token.SETPROP /* 37 */:
                        n2e.f(iArr[i4], (List) unsafe.getObject(obj, j2), bp9Var, true);
                        break;
                    case Token.SETPROP_SUPER /* 38 */:
                        n2e.g(iArr[i4], (List) unsafe.getObject(obj, j2), bp9Var, true);
                        break;
                    case Token.GETELEM /* 39 */:
                        n2e.k(iArr[i4], (List) unsafe.getObject(obj, j2), bp9Var, true);
                        break;
                    case Token.GETELEM_SUPER /* 40 */:
                        n2e.i(iArr[i4], (List) unsafe.getObject(obj, j2), bp9Var, true);
                        break;
                    case Token.SETELEM /* 41 */:
                        n2e.n(iArr[i4], (List) unsafe.getObject(obj, j2), bp9Var, true);
                        break;
                    case Token.SETELEM_SUPER /* 42 */:
                        n2e.q(iArr[i4], (List) unsafe.getObject(obj, j2), bp9Var, true);
                        break;
                    case Token.CALL /* 43 */:
                        n2e.l(iArr[i4], (List) unsafe.getObject(obj, j2), bp9Var, true);
                        break;
                    case Token.NAME /* 44 */:
                        n2e.p(iArr[i4], (List) unsafe.getObject(obj, j2), bp9Var, true);
                        break;
                    case Token.NUMBER /* 45 */:
                        n2e.o(iArr[i4], (List) unsafe.getObject(obj, j2), bp9Var, true);
                        break;
                    case Token.STRING /* 46 */:
                        n2e.j(iArr[i4], (List) unsafe.getObject(obj, j2), bp9Var, true);
                        break;
                    case Token.NULL /* 47 */:
                        n2e.m(iArr[i4], (List) unsafe.getObject(obj, j2), bp9Var, true);
                        break;
                    case Token.THIS /* 48 */:
                        n2e.h(iArr[i4], (List) unsafe.getObject(obj, j2), bp9Var, true);
                        break;
                    case Token.FALSE /* 49 */:
                        int i17 = iArr[i4];
                        List list4 = (List) unsafe.getObject(obj, j2);
                        m2e B2 = c2eVar.B(i4);
                        zj1 zj1Var4 = n2e.a;
                        if (list4 != null && !list4.isEmpty()) {
                            for (int i18 = 0; i18 < list4.size(); i18++) {
                                g0eVar.d(i17, 3);
                                B2.h((hzd) list4.get(i18), bp9Var);
                                g0eVar.d(i17, 4);
                            }
                            break;
                        }
                        break;
                    case Token.TRUE /* 50 */:
                        Object object3 = unsafe.getObject(obj, j2);
                        if (object3 != null) {
                            yx9 yx9Var = ((q1e) c2eVar.C(i4)).a;
                            for (Map.Entry entry : ((r1e) object3).entrySet()) {
                                g0eVar.d(i7, 2);
                                g0eVar.r(q1e.b(yx9Var, entry.getKey(), entry.getValue()));
                                q1e.a(g0eVar, yx9Var, entry.getKey(), entry.getValue());
                            }
                            break;
                        }
                        break;
                    case Token.SHEQ /* 51 */:
                        if (c2eVar.s(i7, obj, i4)) {
                            g0eVar.i(i7, Double.doubleToRawLongBits(((Double) e3e.i(obj, j2)).doubleValue()));
                            break;
                        }
                        break;
                    case Token.SHNE /* 52 */:
                        if (c2eVar.s(i7, obj, i4)) {
                            g0eVar.g(i7, Float.floatToRawIntBits(((Float) e3e.i(obj, j2)).floatValue()));
                            break;
                        }
                        break;
                    case Token.REGEXP /* 53 */:
                        if (c2eVar.s(i7, obj, i4)) {
                            g0eVar.h(i7, n(obj, j2));
                            break;
                        }
                        break;
                    case Token.BINDNAME /* 54 */:
                        if (c2eVar.s(i7, obj, i4)) {
                            g0eVar.h(i7, n(obj, j2));
                            break;
                        }
                        break;
                    case Token.THROW /* 55 */:
                        if (c2eVar.s(i7, obj, i4)) {
                            g0eVar.e(i7, m(obj, j2));
                            break;
                        }
                        break;
                    case Token.RETHROW /* 56 */:
                        if (c2eVar.s(i7, obj, i4)) {
                            g0eVar.i(i7, n(obj, j2));
                            break;
                        }
                        break;
                    case Token.IN /* 57 */:
                        if (c2eVar.s(i7, obj, i4)) {
                            g0eVar.g(i7, m(obj, j2));
                            break;
                        }
                        break;
                    case Token.INSTANCEOF /* 58 */:
                        if (c2eVar.s(i7, obj, i4)) {
                            g0eVar.j(i7, ((Boolean) e3e.i(obj, j2)).booleanValue());
                            break;
                        }
                        break;
                    case Token.LOCAL_LOAD /* 59 */:
                        if (c2eVar.s(i7, obj, i4)) {
                            Object object4 = unsafe.getObject(obj, j2);
                            if (object4 instanceof String) {
                                g0eVar.k(i7, (String) object4);
                                break;
                            } else {
                                g0eVar.l(i7, (szd) object4);
                                break;
                            }
                        }
                        break;
                    case Token.GETVAR /* 60 */:
                        if (c2eVar.s(i7, obj, i4)) {
                            bp9Var.A(i7, unsafe.getObject(obj, j2), c2eVar.B(i4));
                            break;
                        }
                        break;
                    case Token.SETVAR /* 61 */:
                        if (c2eVar.s(i7, obj, i4)) {
                            g0eVar.l(i7, (szd) unsafe.getObject(obj, j2));
                            break;
                        }
                        break;
                    case Token.CATCH_SCOPE /* 62 */:
                        if (c2eVar.s(i7, obj, i4)) {
                            g0eVar.f(i7, m(obj, j2));
                            break;
                        }
                        break;
                    case Token.ENUM_INIT_KEYS /* 63 */:
                        if (c2eVar.s(i7, obj, i4)) {
                            g0eVar.e(i7, m(obj, j2));
                            break;
                        }
                        break;
                    case Token.ENUM_INIT_VALUES /* 64 */:
                        if (c2eVar.s(i7, obj, i4)) {
                            g0eVar.g(i7, m(obj, j2));
                            break;
                        }
                        break;
                    case Token.ENUM_INIT_ARRAY /* 65 */:
                        if (c2eVar.s(i7, obj, i4)) {
                            g0eVar.i(i7, n(obj, j2));
                            break;
                        }
                        break;
                    case Token.ENUM_INIT_VALUES_IN_ORDER /* 66 */:
                        if (c2eVar.s(i7, obj, i4)) {
                            int m = m(obj, j2);
                            g0eVar.f(i7, (m >> 31) ^ (m + m));
                            break;
                        }
                        break;
                    case Token.ENUM_NEXT /* 67 */:
                        if (c2eVar.s(i7, obj, i4)) {
                            long n = n(obj, j2);
                            g0eVar.h(i7, (n >> 63) ^ (n + n));
                            break;
                        }
                        break;
                    case Token.ENUM_ID /* 68 */:
                        if (c2eVar.s(i7, obj, i4)) {
                            Object object5 = unsafe.getObject(obj, j2);
                            g0eVar.d(i7, 3);
                            c2eVar.B(i4).h((hzd) object5, bp9Var);
                            g0eVar.d(i7, 4);
                            break;
                        }
                        break;
                }
                i4 += 3;
                i2 = 1048575;
                c2eVar = this;
            } else {
                ((o0e) obj).zzc.b(bp9Var);
                return;
            }
        }
    }

    public final int i(int i) {
        return this.a[i + 1];
    }

    public final boolean o(o0e o0eVar, o0e o0eVar2, int i) {
        if (q(i, o0eVar) == q(i, o0eVar2)) {
            return true;
        }
        return false;
    }

    public final boolean p(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return q(i, obj);
        }
        if ((i3 & i4) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x00f5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f6 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(int r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c2e.q(int, java.lang.Object):boolean");
    }

    public final void r(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        e3e.f(j, obj, (1 << (i2 >>> 20)) | e3e.e(obj, j));
    }

    public final boolean s(int i, Object obj, int i2) {
        if (e3e.e(obj, this.a[i2 + 2] & 1048575) == i) {
            return true;
        }
        return false;
    }

    public final void t(int i, Object obj, int i2) {
        e3e.f(this.a[i2 + 2] & 1048575, obj, i);
    }

    public final int u(int i, int i2) {
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
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

    /* JADX WARN: Code restructure failed: missing block: B:438:0x0a8a, code lost:
        defpackage.hfd.s("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x0a8f, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x0d0b, code lost:
        r0 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x0d3f, code lost:
        if (r0 == 1048575) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x0d41, code lost:
        r9.putInt(r8, r0, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x0d45, code lost:
        r1 = r34;
        r3 = null;
        r9 = r1.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x0d4e, code lost:
        if (r9 >= r1.i) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x0d50, code lost:
        r0 = r1;
        r3 = (defpackage.x2e) r0.I(r8, r1.g[r9], r3, r1.j, r35);
        r9 = r9 + 1;
        r8 = r35;
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x0d67, code lost:
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x0d68, code lost:
        if (r3 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:544:0x0d6a, code lost:
        r0.j.getClass();
        ((defpackage.o0e) r35).zzc = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:545:0x0d75, code lost:
        if (r7 != 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:546:0x0d77, code lost:
        if (r13 != r6) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:548:0x0d7a, code lost:
        defpackage.hfd.s("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:549:0x0d7f, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:551:0x0d82, code lost:
        if (r13 > r6) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:552:0x0d84, code lost:
        if (r15 != r7) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:553:0x0d86, code lost:
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:554:0x0d87, code lost:
        defpackage.hfd.s("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:555:0x0d8a, code lost:
        return 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:211:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x06d2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:209:0x05ac -> B:210:0x05ad). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:245:0x0672 -> B:246:0x0673). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:266:0x06ce -> B:267:0x06d0). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int w(java.lang.Object r35, byte[] r36, int r37, int r38, int r39, defpackage.lzd r40) {
        /*
            Method dump skipped, instructions count: 3612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c2e.w(java.lang.Object, byte[], int, int, int, lzd):int");
    }

    public final void z(int i, Object obj, Object obj2) {
        if (!q(i, obj2)) {
            return;
        }
        Unsafe unsafe = l;
        long i2 = i(i) & 1048575;
        Object object = unsafe.getObject(obj2, i2);
        if (object != null) {
            m2e B = B(i);
            if (!q(i, obj)) {
                if (!k(object)) {
                    unsafe.putObject(obj, i2, object);
                } else {
                    o0e zza = B.zza();
                    B.a(zza, object);
                    unsafe.putObject(obj, i2, zza);
                }
                r(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, i2);
            if (!k(object2)) {
                o0e zza2 = B.zza();
                B.a(zza2, object2);
                unsafe.putObject(obj, i2, zza2);
                object2 = zza2;
            }
            B.a(object2, object);
            return;
        }
        int i3 = this.a[i];
        String obj3 = obj2.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 38 + obj3.length());
        sb.append("Source subfield ");
        sb.append(i3);
        sb.append(" is present but null: ");
        sb.append(obj3);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.m2e
    public final o0e zza() {
        return ((o0e) this.e).i();
    }

    @Override // defpackage.m2e
    public final boolean zzl(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i3 < this.h) {
            int i6 = this.g[i3];
            int i7 = this.i(i6);
            int[] iArr = this.a;
            int i8 = iArr[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i5) {
                if (i9 != 1048575) {
                    i4 = l.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i5;
                i2 = i4;
            }
            c2e c2eVar = this;
            Object obj2 = obj;
            if ((268435456 & i7) == 0 || c2eVar.p(obj2, i6, i, i2, i10)) {
                int j = j(i7);
                if (j != 9 && j != 17) {
                    if (j != 27) {
                        if (j != 60 && j != 68) {
                            if (j != 49) {
                                if (j != 50) {
                                    continue;
                                } else {
                                    r1e r1eVar = (r1e) e3e.i(obj2, i7 & 1048575);
                                    if (!r1eVar.isEmpty() && ((i3e) ((q1e) c2eVar.C(i6)).a.c).a == j3e.E) {
                                        m2e m2eVar = null;
                                        for (Object obj3 : r1eVar.values()) {
                                            if (m2eVar == null) {
                                                m2eVar = i2e.c.a(obj3.getClass());
                                            }
                                            if (!m2eVar.zzl(obj3)) {
                                            }
                                        }
                                        continue;
                                    }
                                }
                                i3++;
                                this = c2eVar;
                                obj = obj2;
                                i5 = i;
                                i4 = i2;
                            }
                        } else {
                            if (c2eVar.s(iArr[i6], obj2, i6) && !c2eVar.B(i6).zzl(e3e.i(obj2, i7 & 1048575))) {
                            }
                            i3++;
                            this = c2eVar;
                            obj = obj2;
                            i5 = i;
                            i4 = i2;
                        }
                    }
                    List list = (List) e3e.i(obj2, i7 & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        m2e B = c2eVar.B(i6);
                        for (int i11 = 0; i11 < list.size(); i11++) {
                            if (B.zzl(list.get(i11))) {
                            }
                        }
                        continue;
                    }
                    i3++;
                    this = c2eVar;
                    obj = obj2;
                    i5 = i;
                    i4 = i2;
                } else {
                    if (c2eVar.p(obj2, i6, i, i2, i10) && !c2eVar.B(i6).zzl(e3e.i(obj2, i7 & 1048575))) {
                    }
                    i3++;
                    this = c2eVar;
                    obj = obj2;
                    i5 = i;
                    i4 = i2;
                }
            }
            return false;
        }
        return true;
    }
}

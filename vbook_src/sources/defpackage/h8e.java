package defpackage;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import org.mozilla.javascript.Token;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h8e  reason: default package */
/* loaded from: classes.dex */
public final class h8e implements o8e {
    public static final int[] j = new int[0];
    public static final Unsafe k = b9e.g();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final i6e e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;

    public h8e(int[] iArr, Object[] objArr, int i, int i2, i6e i6eVar, int[] iArr2, int i3, int i4, v28 v28Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = i6eVar instanceof m7e;
        this.g = iArr2;
        this.h = i3;
        this.i = i4;
        this.e = i6eVar;
    }

    public static long D(Object obj, long j2) {
        return ((Long) b9e.m(obj, j2)).longValue();
    }

    public static void H(Object obj) {
        if (I(obj)) {
            return;
        }
        vs.m("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    public static boolean I(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof m7e) {
            return ((m7e) obj).s();
        }
        return true;
    }

    public static Field n(Class cls, String str) {
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
            StringBuilder y = nk2.y("Field ", str, " for ", name, " not found. Known fields are ");
            y.append(arrays);
            throw new RuntimeException(y.toString(), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0331  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.h8e o(defpackage.n8e r34, defpackage.v28 r35) {
        /*
            Method dump skipped, instructions count: 1002
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h8e.o(n8e, v28):h8e");
    }

    public static int z(Object obj, long j2) {
        return ((Integer) b9e.m(obj, j2)).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x010f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0110 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A(int r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h8e.A(int, java.lang.Object):boolean");
    }

    public final boolean B(int i, Object obj, int i2) {
        if (b9e.c.j(obj, this.a[i2 + 2] & 1048575) == i) {
            return true;
        }
        return false;
    }

    public final boolean C(m7e m7eVar, m7e m7eVar2, int i) {
        if (A(i, m7eVar) == A(i, m7eVar2)) {
            return true;
        }
        return false;
    }

    public final void E(int i) {
        if (this.b[((i / 3) << 1) + 1] == null) {
            return;
        }
        vm1.h();
    }

    public final o8e F(int i) {
        int i2 = (i / 3) << 1;
        Object[] objArr = this.b;
        o8e o8eVar = (o8e) objArr[i2];
        if (o8eVar != null) {
            return o8eVar;
        }
        o8e a = m8e.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = a;
        return a;
    }

    public final Object G(int i) {
        return this.b[(i / 3) << 1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x01c8, code lost:
        if (java.lang.Float.floatToIntBits(r4.h(r12, r8)) != java.lang.Float.floatToIntBits(r4.h(r13, r8))) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01e6, code lost:
        if (java.lang.Double.doubleToLongBits(r4.a(r12, r8)) != java.lang.Double.doubleToLongBits(r4.a(r13, r8))) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
        if (defpackage.oc2.K(defpackage.b9e.m(r12, r8), defpackage.b9e.m(r13, r8)) != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
        if (defpackage.oc2.K(defpackage.b9e.m(r12, r8), defpackage.b9e.m(r13, r8)) != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0089, code lost:
        if (r4.k(r12, r8) != r4.k(r13, r8)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009c, code lost:
        if (r4.j(r12, r8) != r4.j(r13, r8)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b1, code lost:
        if (r4.k(r12, r8) != r4.k(r13, r8)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c4, code lost:
        if (r4.j(r12, r8) != r4.j(r13, r8)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d8, code lost:
        if (r4.j(r12, r8) != r4.j(r13, r8)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ec, code lost:
        if (r4.j(r12, r8) != r4.j(r13, r8)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0102, code lost:
        if (defpackage.oc2.K(defpackage.b9e.m(r12, r8), defpackage.b9e.m(r13, r8)) != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0118, code lost:
        if (defpackage.oc2.K(defpackage.b9e.m(r12, r8), defpackage.b9e.m(r13, r8)) != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x012e, code lost:
        if (defpackage.oc2.K(defpackage.b9e.m(r12, r8), defpackage.b9e.m(r13, r8)) != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0142, code lost:
        if (r4.i(r12, r8) != r4.i(r13, r8)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0156, code lost:
        if (r4.j(r12, r8) != r4.j(r13, r8)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x016c, code lost:
        if (r4.k(r12, r8) != r4.k(r13, r8)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0180, code lost:
        if (r4.j(r12, r8) != r4.j(r13, r8)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0196, code lost:
        if (r4.k(r12, r8) != r4.k(r13, r8)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01ac, code lost:
        if (r4.k(r12, r8) != r4.k(r13, r8)) goto L16;
     */
    @Override // defpackage.o8e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(defpackage.m7e r12, defpackage.m7e r13) {
        /*
            Method dump skipped, instructions count: 710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h8e.a(m7e, m7e):boolean");
    }

    @Override // defpackage.o8e
    public final boolean b(Object obj) {
        int i;
        int i2;
        h8e h8eVar;
        Object obj2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i4 < this.h) {
            int i6 = this.g[i4];
            int y = this.y(i6);
            int[] iArr = this.a;
            int i7 = iArr[i6 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i3) {
                if (i8 != 1048575) {
                    i5 = k.getInt(obj, i8);
                }
                i2 = i5;
                i = i8;
            } else {
                i = i3;
                i2 = i5;
            }
            if ((268435456 & y) != 0) {
                h8eVar = this;
                obj2 = obj;
                if (!h8eVar.t(obj2, i6, i, i2, i9)) {
                    return false;
                }
            } else {
                h8eVar = this;
                obj2 = obj;
            }
            int i10 = (267386880 & y) >>> 20;
            if (i10 != 9 && i10 != 17) {
                if (i10 != 27) {
                    if (i10 != 60 && i10 != 68) {
                        if (i10 != 49) {
                            if (i10 == 50 && !((a8e) b9e.m(obj2, y & 1048575)).isEmpty()) {
                                if (h8eVar.G(i6) != null) {
                                    vm1.h();
                                    return false;
                                }
                                throw new NoSuchMethodError();
                            }
                        }
                    } else if (h8eVar.B(iArr[i6], obj2, i6) && !h8eVar.F(i6).b(b9e.m(obj2, y & 1048575))) {
                        return false;
                    }
                    i4++;
                    this = h8eVar;
                    obj = obj2;
                    i3 = i;
                    i5 = i2;
                }
                List list = (List) b9e.m(obj2, y & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    o8e F = h8eVar.F(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!F.b(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                }
                i4++;
                this = h8eVar;
                obj = obj2;
                i3 = i;
                i5 = i2;
            } else {
                if (h8eVar.t(obj2, i6, i, i2, i9) && !h8eVar.F(i6).b(b9e.m(obj2, y & 1048575))) {
                    return false;
                }
                i4++;
                this = h8eVar;
                obj = obj2;
                i3 = i;
                i5 = i2;
            }
        }
        return true;
    }

    @Override // defpackage.o8e
    public final int c(m7e m7eVar) {
        int i;
        int i2;
        int b;
        int i3;
        int length = this.a.length;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5 += 3) {
            int y = y(i5);
            int i6 = (267386880 & y) >>> 20;
            if (i6 <= 50 || i6 >= 69) {
                long j2 = 1048575 & y;
                int i7 = 37;
                switch (i6) {
                    case 0:
                        i2 = i4 * 53;
                        b = n7e.b(Double.doubleToLongBits(b9e.c.a(m7eVar, j2)));
                        i4 = i2 + b;
                        break;
                    case 1:
                        i2 = i4 * 53;
                        b = Float.floatToIntBits(b9e.c.h(m7eVar, j2));
                        i4 = i2 + b;
                        break;
                    case 2:
                        i2 = i4 * 53;
                        b = n7e.b(b9e.c.k(m7eVar, j2));
                        i4 = i2 + b;
                        break;
                    case 3:
                        i2 = i4 * 53;
                        b = n7e.b(b9e.c.k(m7eVar, j2));
                        i4 = i2 + b;
                        break;
                    case 4:
                        i2 = i4 * 53;
                        b = b9e.c.j(m7eVar, j2);
                        i4 = i2 + b;
                        break;
                    case 5:
                        i2 = i4 * 53;
                        b = n7e.b(b9e.c.k(m7eVar, j2));
                        i4 = i2 + b;
                        break;
                    case 6:
                        i2 = i4 * 53;
                        b = b9e.c.j(m7eVar, j2);
                        i4 = i2 + b;
                        break;
                    case 7:
                        int i8 = i4 * 53;
                        boolean i9 = b9e.c.i(m7eVar, j2);
                        byte[] bArr = n7e.a;
                        if (i9) {
                            i3 = 1231;
                        } else {
                            i3 = 1237;
                        }
                        i4 = i8 + i3;
                        break;
                    case 8:
                        i2 = i4 * 53;
                        b = ((String) b9e.m(m7eVar, j2)).hashCode();
                        i4 = i2 + b;
                        break;
                    case 9:
                        Object m = b9e.m(m7eVar, j2);
                        if (m != null) {
                            i7 = m.hashCode();
                        }
                        i4 = (i4 * 53) + i7;
                        break;
                    case 10:
                        i2 = i4 * 53;
                        b = b9e.m(m7eVar, j2).hashCode();
                        i4 = i2 + b;
                        break;
                    case 11:
                        i2 = i4 * 53;
                        b = b9e.c.j(m7eVar, j2);
                        i4 = i2 + b;
                        break;
                    case 12:
                        i2 = i4 * 53;
                        b = b9e.c.j(m7eVar, j2);
                        i4 = i2 + b;
                        break;
                    case 13:
                        i2 = i4 * 53;
                        b = b9e.c.j(m7eVar, j2);
                        i4 = i2 + b;
                        break;
                    case 14:
                        i2 = i4 * 53;
                        b = n7e.b(b9e.c.k(m7eVar, j2));
                        i4 = i2 + b;
                        break;
                    case 15:
                        i2 = i4 * 53;
                        b = b9e.c.j(m7eVar, j2);
                        i4 = i2 + b;
                        break;
                    case 16:
                        i2 = i4 * 53;
                        b = n7e.b(b9e.c.k(m7eVar, j2));
                        i4 = i2 + b;
                        break;
                    case 17:
                        Object m2 = b9e.m(m7eVar, j2);
                        if (m2 != null) {
                            i7 = m2.hashCode();
                        }
                        i4 = (i4 * 53) + i7;
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
                        i2 = i4 * 53;
                        b = b9e.m(m7eVar, j2).hashCode();
                        i4 = i2 + b;
                        break;
                    case Token.TRUE /* 50 */:
                        i2 = i4 * 53;
                        b = b9e.m(m7eVar, j2).hashCode();
                        i4 = i2 + b;
                        break;
                }
            }
        }
        int i10 = this.i;
        while (true) {
            int[] iArr = this.g;
            if (i10 < iArr.length) {
                if (!B(0, m7eVar, iArr[i10])) {
                    i4 = b9e.m(m7eVar, y(i) & 1048575).hashCode() + (i4 * 53);
                }
                i10++;
            } else {
                return m7eVar.zzb.hashCode() + (i4 * 53);
            }
        }
    }

    @Override // defpackage.o8e
    public final void d(Object obj) {
        if (I(obj)) {
            if (obj instanceof m7e) {
                m7e m7eVar = (m7e) obj;
                m7eVar.m(Integer.MAX_VALUE);
                m7eVar.zza = 0;
                m7eVar.r();
            }
            int[] iArr = this.a;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int y = y(i);
                long j2 = 1048575 & y;
                int i2 = (y & 267386880) >>> 20;
                if (i2 != 9) {
                    if (i2 != 60 && i2 != 68) {
                        switch (i2) {
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
                                l8e l8eVar = (l8e) ((v7e) b9e.m(obj, j2));
                                if (l8eVar.a) {
                                    l8eVar.a = false;
                                    break;
                                } else {
                                    break;
                                }
                            case Token.TRUE /* 50 */:
                                Unsafe unsafe = k;
                                Object object = unsafe.getObject(obj, j2);
                                if (object != null) {
                                    ((a8e) object).a = false;
                                    unsafe.putObject(obj, j2, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (B(iArr[i], obj, i)) {
                        F(i).d(k.getObject(obj, j2));
                    }
                }
                if (A(i, obj)) {
                    F(i).d(k.getObject(obj, j2));
                }
            }
            x8e x8eVar = ((m7e) obj).zzb;
            if (x8eVar.e) {
                x8eVar.e = false;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [long] */
    /* JADX WARN: Type inference failed for: r17v3 */
    @Override // defpackage.o8e
    public final void e(Object obj, k57 k57Var) {
        ?? r17;
        int i;
        int i2;
        boolean z;
        h8e h8eVar = this;
        e7e e7eVar = (e7e) k57Var.b;
        int[] iArr = h8eVar.a;
        int length = iArr.length;
        Unsafe unsafe = k;
        int i3 = 1048575;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            int y = h8eVar.y(i5);
            int i7 = iArr[i5];
            int i8 = (267386880 & y) >>> 20;
            if (i8 <= 17) {
                int i9 = iArr[i5 + 2];
                r17 = 1;
                int i10 = i9 & i3;
                if (i10 != i4) {
                    if (i10 == i3) {
                        i6 = 0;
                    } else {
                        i6 = unsafe.getInt(obj, i10);
                    }
                    i4 = i10;
                }
                i = y;
                i2 = 1 << (i9 >>> 20);
            } else {
                r17 = 1;
                i = y;
                i2 = 0;
            }
            long j2 = i & i3;
            switch (i8) {
                case 0:
                    if (h8eVar.t(obj, i5, i4, i6, i2)) {
                        double a = b9e.c.a(obj, j2);
                        e7eVar.getClass();
                        e7eVar.d(i7, Double.doubleToRawLongBits(a));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (h8eVar.t(obj, i5, i4, i6, i2)) {
                        float h = b9e.c.h(obj, j2);
                        e7eVar.getClass();
                        e7eVar.c(i7, Float.floatToRawIntBits(h));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (h8eVar.t(obj, i5, i4, i6, i2)) {
                        e7eVar.l(i7, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (h8eVar.t(obj, i5, i4, i6, i2)) {
                        e7eVar.l(i7, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (h8eVar.t(obj, i5, i4, i6, i2)) {
                        e7eVar.k(i7, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (h8eVar.t(obj, i5, i4, i6, i2)) {
                        e7eVar.d(i7, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (h8eVar.t(obj, i5, i4, i6, i2)) {
                        e7eVar.c(i7, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (h8eVar.t(obj, i5, i4, i6, i2)) {
                        e7eVar.g(i7, b9e.c.i(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (h8eVar.t(obj, i5, i4, i6, i2)) {
                        Object object = unsafe.getObject(obj, j2);
                        if (object instanceof String) {
                            e7eVar.e(i7, (String) object);
                            break;
                        } else {
                            e7eVar.f(i7, (s6e) object);
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (h8eVar.t(obj, i5, i4, i6, i2)) {
                        k57Var.M(i7, unsafe.getObject(obj, j2), h8eVar.F(i5));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (h8eVar.t(obj, i5, i4, i6, i2)) {
                        e7eVar.f(i7, (s6e) unsafe.getObject(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (h8eVar.t(obj, i5, i4, i6, i2)) {
                        e7eVar.q(i7, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (h8eVar.t(obj, i5, i4, i6, i2)) {
                        e7eVar.k(i7, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (h8eVar.t(obj, i5, i4, i6, i2)) {
                        e7eVar.c(i7, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (h8eVar.t(obj, i5, i4, i6, i2)) {
                        e7eVar.d(i7, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (h8eVar.t(obj, i5, i4, i6, i2)) {
                        int i11 = unsafe.getInt(obj, j2);
                        e7eVar.q(i7, (i11 >> 31) ^ (i11 << 1));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (h8eVar.t(obj, i5, i4, i6, i2)) {
                        long j3 = unsafe.getLong(obj, j2);
                        e7eVar.l(i7, (j3 >> 63) ^ (j3 << 1));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (h8eVar.t(obj, i5, i4, i6, i2)) {
                        Object object2 = unsafe.getObject(obj, j2);
                        e7eVar.p(i7, 3);
                        h8eVar.F(i5).e((i6e) object2, k57Var);
                        e7eVar.p(i7, 4);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    oc2.N(iArr[i5], (List) unsafe.getObject(obj, j2), k57Var, false);
                    break;
                case 19:
                    oc2.U(iArr[i5], (List) unsafe.getObject(obj, j2), k57Var, false);
                    break;
                case 20:
                    oc2.Y(iArr[i5], (List) unsafe.getObject(obj, j2), k57Var, false);
                    break;
                case 21:
                    oc2.g0(iArr[i5], (List) unsafe.getObject(obj, j2), k57Var, false);
                    break;
                case 22:
                    oc2.W(iArr[i5], (List) unsafe.getObject(obj, j2), k57Var, false);
                    break;
                case 23:
                    oc2.S(iArr[i5], (List) unsafe.getObject(obj, j2), k57Var, false);
                    break;
                case 24:
                    oc2.Q(iArr[i5], (List) unsafe.getObject(obj, j2), k57Var, false);
                    break;
                case 25:
                    oc2.I(iArr[i5], (List) unsafe.getObject(obj, j2), k57Var, false);
                    break;
                case 26:
                    int i12 = iArr[i5];
                    List list = (List) unsafe.getObject(obj, j2);
                    if (list != null && !list.isEmpty()) {
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            e7eVar.e(i12, (String) list.get(i13));
                        }
                    }
                    break;
                case 27:
                    int i14 = iArr[i5];
                    List list2 = (List) unsafe.getObject(obj, j2);
                    o8e F = h8eVar.F(i5);
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i15 = 0; i15 < list2.size(); i15++) {
                            k57Var.M(i14, list2.get(i15), F);
                        }
                    }
                    break;
                case 28:
                    int i16 = iArr[i5];
                    List list3 = (List) unsafe.getObject(obj, j2);
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i17 = 0; i17 < list3.size(); i17++) {
                            e7eVar.f(i16, (s6e) list3.get(i17));
                        }
                    }
                    break;
                case 29:
                    z = false;
                    oc2.f0(iArr[i5], (List) unsafe.getObject(obj, j2), k57Var, false);
                    break;
                case 30:
                    z = false;
                    oc2.P(iArr[i5], (List) unsafe.getObject(obj, j2), k57Var, false);
                    break;
                case 31:
                    z = false;
                    oc2.a0(iArr[i5], (List) unsafe.getObject(obj, j2), k57Var, false);
                    break;
                case 32:
                    z = false;
                    oc2.c0(iArr[i5], (List) unsafe.getObject(obj, j2), k57Var, false);
                    break;
                case Token.GETPROP /* 33 */:
                    z = false;
                    oc2.d0(iArr[i5], (List) unsafe.getObject(obj, j2), k57Var, false);
                    break;
                case Token.GETPROPNOWARN /* 34 */:
                    z = false;
                    oc2.e0(iArr[i5], (List) unsafe.getObject(obj, j2), k57Var, false);
                    break;
                case Token.GETPROP_SUPER /* 35 */:
                    oc2.N(iArr[i5], (List) unsafe.getObject(obj, j2), k57Var, r17);
                    break;
                case Token.GETPROPNOWARN_SUPER /* 36 */:
                    oc2.U(iArr[i5], (List) unsafe.getObject(obj, j2), k57Var, r17);
                    break;
                case Token.SETPROP /* 37 */:
                    oc2.Y(iArr[i5], (List) unsafe.getObject(obj, j2), k57Var, r17);
                    break;
                case Token.SETPROP_SUPER /* 38 */:
                    oc2.g0(iArr[i5], (List) unsafe.getObject(obj, j2), k57Var, r17);
                    break;
                case Token.GETELEM /* 39 */:
                    oc2.W(iArr[i5], (List) unsafe.getObject(obj, j2), k57Var, r17);
                    break;
                case Token.GETELEM_SUPER /* 40 */:
                    oc2.S(iArr[i5], (List) unsafe.getObject(obj, j2), k57Var, r17);
                    break;
                case Token.SETELEM /* 41 */:
                    oc2.Q(iArr[i5], (List) unsafe.getObject(obj, j2), k57Var, r17);
                    break;
                case Token.SETELEM_SUPER /* 42 */:
                    oc2.I(iArr[i5], (List) unsafe.getObject(obj, j2), k57Var, r17);
                    break;
                case Token.CALL /* 43 */:
                    oc2.f0(iArr[i5], (List) unsafe.getObject(obj, j2), k57Var, r17);
                    break;
                case Token.NAME /* 44 */:
                    oc2.P(iArr[i5], (List) unsafe.getObject(obj, j2), k57Var, r17);
                    break;
                case Token.NUMBER /* 45 */:
                    oc2.a0(iArr[i5], (List) unsafe.getObject(obj, j2), k57Var, r17);
                    break;
                case Token.STRING /* 46 */:
                    oc2.c0(iArr[i5], (List) unsafe.getObject(obj, j2), k57Var, r17);
                    break;
                case Token.NULL /* 47 */:
                    oc2.d0(iArr[i5], (List) unsafe.getObject(obj, j2), k57Var, r17);
                    break;
                case Token.THIS /* 48 */:
                    oc2.e0(iArr[i5], (List) unsafe.getObject(obj, j2), k57Var, r17);
                    break;
                case Token.FALSE /* 49 */:
                    int i18 = iArr[i5];
                    List list4 = (List) unsafe.getObject(obj, j2);
                    o8e F2 = h8eVar.F(i5);
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i19 = 0; i19 < list4.size(); i19++) {
                            e7eVar.p(i18, 3);
                            F2.e((i6e) list4.get(i19), k57Var);
                            e7eVar.p(i18, 4);
                        }
                    }
                    break;
                case Token.TRUE /* 50 */:
                    if (unsafe.getObject(obj, j2) != null) {
                        if (h8eVar.G(i5) != null) {
                            vm1.h();
                            return;
                        }
                        throw new NoSuchMethodError();
                    }
                    break;
                case Token.SHEQ /* 51 */:
                    if (h8eVar.B(i7, obj, i5)) {
                        double doubleValue = ((Double) b9e.m(obj, j2)).doubleValue();
                        e7eVar.getClass();
                        e7eVar.d(i7, Double.doubleToRawLongBits(doubleValue));
                    }
                    break;
                case Token.SHNE /* 52 */:
                    if (h8eVar.B(i7, obj, i5)) {
                        float floatValue = ((Float) b9e.m(obj, j2)).floatValue();
                        e7eVar.getClass();
                        e7eVar.c(i7, Float.floatToRawIntBits(floatValue));
                    }
                    break;
                case Token.REGEXP /* 53 */:
                    if (h8eVar.B(i7, obj, i5)) {
                        e7eVar.l(i7, D(obj, j2));
                    }
                    break;
                case Token.BINDNAME /* 54 */:
                    if (h8eVar.B(i7, obj, i5)) {
                        e7eVar.l(i7, D(obj, j2));
                    }
                    break;
                case Token.THROW /* 55 */:
                    if (h8eVar.B(i7, obj, i5)) {
                        e7eVar.k(i7, z(obj, j2));
                    }
                    break;
                case Token.RETHROW /* 56 */:
                    if (h8eVar.B(i7, obj, i5)) {
                        e7eVar.d(i7, D(obj, j2));
                    }
                    break;
                case Token.IN /* 57 */:
                    if (h8eVar.B(i7, obj, i5)) {
                        e7eVar.c(i7, z(obj, j2));
                    }
                    break;
                case Token.INSTANCEOF /* 58 */:
                    if (h8eVar.B(i7, obj, i5)) {
                        e7eVar.g(i7, ((Boolean) b9e.m(obj, j2)).booleanValue());
                    }
                    break;
                case Token.LOCAL_LOAD /* 59 */:
                    if (h8eVar.B(i7, obj, i5)) {
                        Object object3 = unsafe.getObject(obj, j2);
                        if (object3 instanceof String) {
                            e7eVar.e(i7, (String) object3);
                        } else {
                            e7eVar.f(i7, (s6e) object3);
                        }
                    }
                    break;
                case Token.GETVAR /* 60 */:
                    if (h8eVar.B(i7, obj, i5)) {
                        k57Var.M(i7, unsafe.getObject(obj, j2), h8eVar.F(i5));
                    }
                    break;
                case Token.SETVAR /* 61 */:
                    if (h8eVar.B(i7, obj, i5)) {
                        e7eVar.f(i7, (s6e) unsafe.getObject(obj, j2));
                    }
                    break;
                case Token.CATCH_SCOPE /* 62 */:
                    if (h8eVar.B(i7, obj, i5)) {
                        e7eVar.q(i7, z(obj, j2));
                    }
                    break;
                case Token.ENUM_INIT_KEYS /* 63 */:
                    if (h8eVar.B(i7, obj, i5)) {
                        e7eVar.k(i7, z(obj, j2));
                    }
                    break;
                case Token.ENUM_INIT_VALUES /* 64 */:
                    if (h8eVar.B(i7, obj, i5)) {
                        e7eVar.c(i7, z(obj, j2));
                    }
                    break;
                case Token.ENUM_INIT_ARRAY /* 65 */:
                    if (h8eVar.B(i7, obj, i5)) {
                        e7eVar.d(i7, D(obj, j2));
                    }
                    break;
                case Token.ENUM_INIT_VALUES_IN_ORDER /* 66 */:
                    if (h8eVar.B(i7, obj, i5)) {
                        int z2 = z(obj, j2);
                        e7eVar.q(i7, (z2 >> 31) ^ (z2 << 1));
                    }
                    break;
                case Token.ENUM_NEXT /* 67 */:
                    if (h8eVar.B(i7, obj, i5)) {
                        long D = D(obj, j2);
                        e7eVar.l(i7, (D >> 63) ^ (D << r17));
                    }
                    break;
                case Token.ENUM_ID /* 68 */:
                    if (h8eVar.B(i7, obj, i5)) {
                        Object object4 = unsafe.getObject(obj, j2);
                        e7eVar.p(i7, 3);
                        h8eVar.F(i5).e((i6e) object4, k57Var);
                        e7eVar.p(i7, 4);
                    }
                    break;
            }
            i5 += 3;
            i3 = 1048575;
            h8eVar = this;
        }
        ((m7e) obj).zzb.d(k57Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:245:0x0591, code lost:
        if (r0.t(r1, r2, r3, r4, r5) != false) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0593, code lost:
        r9 = defpackage.eub.y(r12 << 3, 8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x05a1, code lost:
        if (r0.t(r1, r2, r3, r4, r5) != false) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x05a3, code lost:
        r9 = defpackage.eub.y(r12 << 3, 4, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x063d, code lost:
        if (r0.t(r1, r2, r3, r4, r5) != false) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0645, code lost:
        if (r0.t(r1, r2, r3, r4, r5) != false) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0690, code lost:
        if (r0.t(r1, r2, r3, r4, r5) != false) goto L286;
     */
    @Override // defpackage.o8e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(defpackage.m7e r18) {
        /*
            Method dump skipped, instructions count: 1856
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h8e.f(m7e):int");
    }

    @Override // defpackage.o8e
    public final void g(Object obj, byte[] bArr, int i, int i2, lzd lzdVar) {
        k(obj, bArr, i, i2, 0, lzdVar);
    }

    @Override // defpackage.o8e
    public final void h(Object obj, Object obj2) {
        Object obj3;
        H(obj);
        byte[] bArr = n7e.a;
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i < iArr.length) {
                int y = y(i);
                long j2 = 1048575 & y;
                int i2 = iArr[i];
                switch ((y & 267386880) >>> 20) {
                    case 0:
                        if (A(i, obj2)) {
                            a9e a9eVar = b9e.c;
                            obj3 = obj;
                            a9eVar.d(obj3, j2, a9eVar.a(obj2, j2));
                            v(i, obj3);
                            continue;
                            i += 3;
                            obj = obj3;
                        }
                        break;
                    case 1:
                        if (A(i, obj2)) {
                            a9e a9eVar2 = b9e.c;
                            a9eVar2.e(obj, j2, a9eVar2.h(obj2, j2));
                            v(i, obj);
                            break;
                        }
                        break;
                    case 2:
                        if (A(i, obj2)) {
                            b9e.c(obj, j2, b9e.c.k(obj2, j2));
                            v(i, obj);
                            break;
                        }
                        break;
                    case 3:
                        if (A(i, obj2)) {
                            b9e.c(obj, j2, b9e.c.k(obj2, j2));
                            v(i, obj);
                            break;
                        }
                        break;
                    case 4:
                        if (A(i, obj2)) {
                            b9e.b(j2, obj, b9e.c.j(obj2, j2));
                            v(i, obj);
                            break;
                        }
                        break;
                    case 5:
                        if (A(i, obj2)) {
                            b9e.c(obj, j2, b9e.c.k(obj2, j2));
                            v(i, obj);
                            break;
                        }
                        break;
                    case 6:
                        if (A(i, obj2)) {
                            b9e.b(j2, obj, b9e.c.j(obj2, j2));
                            v(i, obj);
                            break;
                        }
                        break;
                    case 7:
                        if (A(i, obj2)) {
                            a9e a9eVar3 = b9e.c;
                            a9eVar3.g(obj, j2, a9eVar3.i(obj2, j2));
                            v(i, obj);
                            break;
                        }
                        break;
                    case 8:
                        if (A(i, obj2)) {
                            b9e.d(obj, j2, b9e.m(obj2, j2));
                            v(i, obj);
                            break;
                        }
                        break;
                    case 9:
                        s(obj, obj2, i);
                        break;
                    case 10:
                        if (A(i, obj2)) {
                            b9e.d(obj, j2, b9e.m(obj2, j2));
                            v(i, obj);
                            break;
                        }
                        break;
                    case 11:
                        if (A(i, obj2)) {
                            b9e.b(j2, obj, b9e.c.j(obj2, j2));
                            v(i, obj);
                            break;
                        }
                        break;
                    case 12:
                        if (A(i, obj2)) {
                            b9e.b(j2, obj, b9e.c.j(obj2, j2));
                            v(i, obj);
                            break;
                        }
                        break;
                    case 13:
                        if (A(i, obj2)) {
                            b9e.b(j2, obj, b9e.c.j(obj2, j2));
                            v(i, obj);
                            break;
                        }
                        break;
                    case 14:
                        if (A(i, obj2)) {
                            b9e.c(obj, j2, b9e.c.k(obj2, j2));
                            v(i, obj);
                            break;
                        }
                        break;
                    case 15:
                        if (A(i, obj2)) {
                            b9e.b(j2, obj, b9e.c.j(obj2, j2));
                            v(i, obj);
                            break;
                        }
                        break;
                    case 16:
                        if (A(i, obj2)) {
                            b9e.c(obj, j2, b9e.c.k(obj2, j2));
                            v(i, obj);
                            break;
                        }
                        break;
                    case 17:
                        s(obj, obj2, i);
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
                        v7e v7eVar = (v7e) b9e.m(obj, j2);
                        v7e v7eVar2 = (v7e) b9e.m(obj2, j2);
                        int i3 = ((l8e) v7eVar).c;
                        int i4 = ((l8e) v7eVar2).c;
                        if (i3 > 0 && i4 > 0) {
                            if (!((l8e) v7eVar).a) {
                                v7eVar = ((l8e) v7eVar).b(i4 + i3);
                            }
                            ((l8e) v7eVar).addAll(v7eVar2);
                        }
                        if (i3 > 0) {
                            v7eVar2 = v7eVar;
                        }
                        b9e.d(obj, j2, v7eVar2);
                        break;
                    case Token.TRUE /* 50 */:
                        b9e.d(obj, j2, c16.A(b9e.m(obj, j2), b9e.m(obj2, j2)));
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
                        if (B(i2, obj2, i)) {
                            b9e.d(obj, j2, b9e.m(obj2, j2));
                            w(i2, obj, i);
                            break;
                        }
                        break;
                    case Token.GETVAR /* 60 */:
                        x(i, obj, obj2);
                        break;
                    case Token.SETVAR /* 61 */:
                    case Token.CATCH_SCOPE /* 62 */:
                    case Token.ENUM_INIT_KEYS /* 63 */:
                    case Token.ENUM_INIT_VALUES /* 64 */:
                    case Token.ENUM_INIT_ARRAY /* 65 */:
                    case Token.ENUM_INIT_VALUES_IN_ORDER /* 66 */:
                    case Token.ENUM_NEXT /* 67 */:
                        if (B(i2, obj2, i)) {
                            b9e.d(obj, j2, b9e.m(obj2, j2));
                            w(i2, obj, i);
                            break;
                        }
                        break;
                    case Token.ENUM_ID /* 68 */:
                        x(i, obj, obj2);
                        break;
                }
                obj3 = obj;
                i += 3;
                obj = obj3;
            } else {
                oc2.J(obj, obj2);
                return;
            }
        }
    }

    @Override // defpackage.o8e
    public final void i(Object obj, vh1 vh1Var, g7e g7eVar) {
        int i;
        int[] iArr = this.g;
        int i2 = this.i;
        int i3 = this.h;
        byte[] bArr = n7e.a;
        g7eVar.getClass();
        H(obj);
        x8e x8eVar = null;
        while (true) {
            try {
                int U0 = vh1Var.U0();
                if (U0 >= this.c && U0 <= this.d) {
                    i = j(U0, 0);
                } else {
                    i = -1;
                }
                int i4 = i;
                if (i4 < 0) {
                    if (U0 == Integer.MAX_VALUE) {
                        while (i3 < i2) {
                            r(obj, iArr[i3], x8eVar);
                            i3++;
                        }
                        if (x8eVar != null) {
                            ((m7e) obj).zzb = x8eVar;
                            return;
                        }
                        return;
                    }
                    if (x8eVar == null) {
                        x8eVar = j55.C(obj);
                    }
                    if (!j55.B(0, vh1Var, x8eVar)) {
                        while (i3 < i2) {
                            r(obj, iArr[i3], x8eVar);
                            i3++;
                        }
                        if (x8eVar != null) {
                            ((m7e) obj).zzb = x8eVar;
                            return;
                        }
                        return;
                    }
                } else {
                    int y = y(i4);
                    boolean z = true;
                    switch ((267386880 & y) >>> 20) {
                        case 0:
                            vh1Var.R0(1);
                            b9e.c.d(obj, y & 1048575, ((xb1) vh1Var.e).I());
                            v(i4, obj);
                            continue;
                        case 1:
                            vh1Var.R0(5);
                            b9e.c.e(obj, y & 1048575, ((xb1) vh1Var.e).P());
                            v(i4, obj);
                            continue;
                        case 2:
                            vh1Var.R0(0);
                            b9e.c(obj, y & 1048575, ((xb1) vh1Var.e).d0());
                            v(i4, obj);
                            continue;
                        case 3:
                            vh1Var.R0(0);
                            b9e.c(obj, y & 1048575, ((xb1) vh1Var.e).g0());
                            v(i4, obj);
                            continue;
                        case 4:
                            vh1Var.R0(0);
                            b9e.b(y & 1048575, obj, ((xb1) vh1Var.e).X());
                            v(i4, obj);
                            continue;
                        case 5:
                            vh1Var.R0(1);
                            b9e.c(obj, y & 1048575, ((xb1) vh1Var.e).c0());
                            v(i4, obj);
                            continue;
                        case 6:
                            vh1Var.R0(5);
                            b9e.b(y & 1048575, obj, ((xb1) vh1Var.e).W());
                            v(i4, obj);
                            continue;
                        case 7:
                            vh1Var.R0(0);
                            b9e.c.g(obj, y & 1048575, ((xb1) vh1Var.e).l0());
                            v(i4, obj);
                            continue;
                        case 8:
                            p(y, vh1Var, obj);
                            v(i4, obj);
                            continue;
                        case 9:
                            Object obj2 = (i6e) l(i4, obj);
                            o8e F = F(i4);
                            vh1Var.R0(2);
                            vh1Var.X0(obj2, F, g7eVar);
                            u(i4, obj, obj2);
                            continue;
                        case 10:
                            b9e.d(obj, y & 1048575, vh1Var.k1());
                            v(i4, obj);
                            continue;
                        case 11:
                            vh1Var.R0(0);
                            b9e.b(y & 1048575, obj, ((xb1) vh1Var.e).b0());
                            v(i4, obj);
                            continue;
                        case 12:
                            vh1Var.R0(0);
                            int U = ((xb1) vh1Var.e).U();
                            E(i4);
                            b9e.b(y & 1048575, obj, U);
                            v(i4, obj);
                            continue;
                        case 13:
                            vh1Var.R0(5);
                            b9e.b(y & 1048575, obj, ((xb1) vh1Var.e).Y());
                            v(i4, obj);
                            continue;
                        case 14:
                            vh1Var.R0(1);
                            b9e.c(obj, y & 1048575, ((xb1) vh1Var.e).e0());
                            v(i4, obj);
                            continue;
                        case 15:
                            vh1Var.R0(0);
                            b9e.b(y & 1048575, obj, ((xb1) vh1Var.e).Z());
                            v(i4, obj);
                            continue;
                        case 16:
                            vh1Var.R0(0);
                            b9e.c(obj, y & 1048575, ((xb1) vh1Var.e).f0());
                            v(i4, obj);
                            continue;
                        case 17:
                            Object obj3 = (i6e) l(i4, obj);
                            o8e F2 = F(i4);
                            vh1Var.R0(3);
                            vh1Var.V0(obj3, F2, g7eVar);
                            u(i4, obj, obj3);
                            continue;
                        case 18:
                            vh1Var.W0(b16.Q(obj, y & 1048575));
                            continue;
                        case 19:
                            vh1Var.b1(b16.Q(obj, y & 1048575));
                            continue;
                        case 20:
                            vh1Var.d1(b16.Q(obj, y & 1048575));
                            continue;
                        case 21:
                            vh1Var.n1(b16.Q(obj, y & 1048575));
                            continue;
                        case 22:
                            vh1Var.c1(b16.Q(obj, y & 1048575));
                            continue;
                        case 23:
                            vh1Var.a1(b16.Q(obj, y & 1048575));
                            continue;
                        case 24:
                            vh1Var.Z0(b16.Q(obj, y & 1048575));
                            continue;
                        case 25:
                            vh1Var.N0(b16.Q(obj, y & 1048575));
                            continue;
                        case 26:
                            if ((536870912 & y) == 0) {
                                z = false;
                            }
                            if (z) {
                                vh1Var.j1(b16.Q(obj, y & 1048575));
                                break;
                            } else {
                                vh1Var.i1(b16.Q(obj, y & 1048575));
                                continue;
                            }
                        case 27:
                            vh1Var.T0(b16.Q(obj, y & 1048575), F(i4), g7eVar);
                            continue;
                        case 28:
                            vh1Var.S0(b16.Q(obj, y & 1048575));
                            continue;
                        case 29:
                            vh1Var.l1(b16.Q(obj, y & 1048575));
                            continue;
                        case 30:
                            vh1Var.Y0(b16.Q(obj, y & 1048575));
                            E(i4);
                            continue;
                        case 31:
                            vh1Var.e1(b16.Q(obj, y & 1048575));
                            continue;
                        case 32:
                            vh1Var.f1(b16.Q(obj, y & 1048575));
                            continue;
                        case Token.GETPROP /* 33 */:
                            vh1Var.g1(b16.Q(obj, y & 1048575));
                            continue;
                        case Token.GETPROPNOWARN /* 34 */:
                            vh1Var.h1(b16.Q(obj, y & 1048575));
                            continue;
                        case Token.GETPROP_SUPER /* 35 */:
                            vh1Var.W0(b16.Q(obj, y & 1048575));
                            continue;
                        case Token.GETPROPNOWARN_SUPER /* 36 */:
                            vh1Var.b1(b16.Q(obj, y & 1048575));
                            continue;
                        case Token.SETPROP /* 37 */:
                            vh1Var.d1(b16.Q(obj, y & 1048575));
                            continue;
                        case Token.SETPROP_SUPER /* 38 */:
                            vh1Var.n1(b16.Q(obj, y & 1048575));
                            continue;
                        case Token.GETELEM /* 39 */:
                            vh1Var.c1(b16.Q(obj, y & 1048575));
                            continue;
                        case Token.GETELEM_SUPER /* 40 */:
                            vh1Var.a1(b16.Q(obj, y & 1048575));
                            continue;
                        case Token.SETELEM /* 41 */:
                            vh1Var.Z0(b16.Q(obj, y & 1048575));
                            continue;
                        case Token.SETELEM_SUPER /* 42 */:
                            vh1Var.N0(b16.Q(obj, y & 1048575));
                            continue;
                        case Token.CALL /* 43 */:
                            vh1Var.l1(b16.Q(obj, y & 1048575));
                            continue;
                        case Token.NAME /* 44 */:
                            vh1Var.Y0(b16.Q(obj, y & 1048575));
                            E(i4);
                            continue;
                        case Token.NUMBER /* 45 */:
                            vh1Var.e1(b16.Q(obj, y & 1048575));
                            continue;
                        case Token.STRING /* 46 */:
                            vh1Var.f1(b16.Q(obj, y & 1048575));
                            continue;
                        case Token.NULL /* 47 */:
                            vh1Var.g1(b16.Q(obj, y & 1048575));
                            continue;
                        case Token.THIS /* 48 */:
                            vh1Var.h1(b16.Q(obj, y & 1048575));
                            continue;
                        case Token.FALSE /* 49 */:
                            vh1Var.O0(b16.Q(obj, y & 1048575), F(i4), g7eVar);
                            continue;
                        case Token.TRUE /* 50 */:
                            Object G = G(i4);
                            long y2 = y(i4) & 1048575;
                            Object m = b9e.m(obj, y2);
                            if (m != null) {
                                if (!((a8e) m).a) {
                                    a8e b = a8e.b.b();
                                    c16.A(b, m);
                                    b9e.d(obj, y2, b);
                                    m = b;
                                }
                            } else {
                                m = a8e.b.b();
                                b9e.d(obj, y2, m);
                            }
                            c16.B(m);
                            if (G == null) {
                                throw new NoSuchMethodError();
                            }
                            throw new ClassCastException();
                        case Token.SHEQ /* 51 */:
                            vh1Var.R0(1);
                            b9e.d(obj, y & 1048575, Double.valueOf(((xb1) vh1Var.e).I()));
                            w(U0, obj, i4);
                            continue;
                        case Token.SHNE /* 52 */:
                            vh1Var.R0(5);
                            b9e.d(obj, y & 1048575, Float.valueOf(((xb1) vh1Var.e).P()));
                            w(U0, obj, i4);
                            continue;
                        case Token.REGEXP /* 53 */:
                            vh1Var.R0(0);
                            b9e.d(obj, y & 1048575, Long.valueOf(((xb1) vh1Var.e).d0()));
                            w(U0, obj, i4);
                            continue;
                        case Token.BINDNAME /* 54 */:
                            vh1Var.R0(0);
                            b9e.d(obj, y & 1048575, Long.valueOf(((xb1) vh1Var.e).g0()));
                            w(U0, obj, i4);
                            continue;
                        case Token.THROW /* 55 */:
                            vh1Var.R0(0);
                            b9e.d(obj, y & 1048575, Integer.valueOf(((xb1) vh1Var.e).X()));
                            w(U0, obj, i4);
                            continue;
                        case Token.RETHROW /* 56 */:
                            vh1Var.R0(1);
                            b9e.d(obj, y & 1048575, Long.valueOf(((xb1) vh1Var.e).c0()));
                            w(U0, obj, i4);
                            continue;
                        case Token.IN /* 57 */:
                            vh1Var.R0(5);
                            b9e.d(obj, y & 1048575, Integer.valueOf(((xb1) vh1Var.e).W()));
                            w(U0, obj, i4);
                            continue;
                        case Token.INSTANCEOF /* 58 */:
                            vh1Var.R0(0);
                            b9e.d(obj, y & 1048575, Boolean.valueOf(((xb1) vh1Var.e).l0()));
                            w(U0, obj, i4);
                            continue;
                        case Token.LOCAL_LOAD /* 59 */:
                            p(y, vh1Var, obj);
                            w(U0, obj, i4);
                            continue;
                        case Token.GETVAR /* 60 */:
                            Object obj4 = (i6e) m(U0, obj, i4);
                            o8e F3 = F(i4);
                            vh1Var.R0(2);
                            vh1Var.X0(obj4, F3, g7eVar);
                            q(U0, obj, obj4, i4);
                            continue;
                        case Token.SETVAR /* 61 */:
                            b9e.d(obj, y & 1048575, vh1Var.k1());
                            w(U0, obj, i4);
                            continue;
                        case Token.CATCH_SCOPE /* 62 */:
                            vh1Var.R0(0);
                            b9e.d(obj, y & 1048575, Integer.valueOf(((xb1) vh1Var.e).b0()));
                            w(U0, obj, i4);
                            continue;
                        case Token.ENUM_INIT_KEYS /* 63 */:
                            vh1Var.R0(0);
                            int U2 = ((xb1) vh1Var.e).U();
                            E(i4);
                            b9e.d(obj, y & 1048575, Integer.valueOf(U2));
                            w(U0, obj, i4);
                            continue;
                        case Token.ENUM_INIT_VALUES /* 64 */:
                            vh1Var.R0(5);
                            b9e.d(obj, y & 1048575, Integer.valueOf(((xb1) vh1Var.e).Y()));
                            w(U0, obj, i4);
                            continue;
                        case Token.ENUM_INIT_ARRAY /* 65 */:
                            vh1Var.R0(1);
                            b9e.d(obj, y & 1048575, Long.valueOf(((xb1) vh1Var.e).e0()));
                            w(U0, obj, i4);
                            continue;
                        case Token.ENUM_INIT_VALUES_IN_ORDER /* 66 */:
                            vh1Var.R0(0);
                            b9e.d(obj, y & 1048575, Integer.valueOf(((xb1) vh1Var.e).Z()));
                            w(U0, obj, i4);
                            continue;
                        case Token.ENUM_NEXT /* 67 */:
                            vh1Var.R0(0);
                            b9e.d(obj, y & 1048575, Long.valueOf(((xb1) vh1Var.e).f0()));
                            w(U0, obj, i4);
                            continue;
                        case Token.ENUM_ID /* 68 */:
                            Object obj5 = (i6e) m(U0, obj, i4);
                            o8e F4 = F(i4);
                            vh1Var.R0(3);
                            vh1Var.V0(obj5, F4, g7eVar);
                            q(U0, obj, obj5, i4);
                            continue;
                        default:
                            if (x8eVar == null) {
                                try {
                                    x8eVar = j55.C(obj);
                                } catch (y7e unused) {
                                    if (x8eVar == null) {
                                        x8eVar = j55.C(obj);
                                    }
                                    if (!j55.B(0, vh1Var, x8eVar)) {
                                        while (i3 < i2) {
                                            r(obj, iArr[i3], x8eVar);
                                            i3++;
                                        }
                                        if (x8eVar != null) {
                                            ((m7e) obj).zzb = x8eVar;
                                            return;
                                        }
                                        return;
                                    }
                                    break;
                                }
                            }
                            if (!j55.B(0, vh1Var, x8eVar)) {
                                while (i3 < i2) {
                                    r(obj, iArr[i3], x8eVar);
                                    i3++;
                                }
                                if (x8eVar != null) {
                                    ((m7e) obj).zzb = x8eVar;
                                    return;
                                }
                                return;
                            }
                            continue;
                    }
                }
            } catch (Throwable th) {
                while (i3 < i2) {
                    r(obj, iArr[i3], x8eVar);
                    i3++;
                }
                if (x8eVar != null) {
                    ((m7e) obj).zzb = x8eVar;
                }
                throw th;
            }
        }
    }

    public final int j(int i, int i2) {
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

    /* JADX WARN: Code restructure failed: missing block: B:415:0x0a3d, code lost:
        if (r9 == r8) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x0a3f, code lost:
        r35.putInt(r2, r9, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x0a45, code lost:
        r1 = r32.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x0a4b, code lost:
        if (r1 >= r32.i) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x0a4d, code lost:
        r(r2, r32.g[r1], null);
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0a58, code lost:
        if (r37 != 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x0a5a, code lost:
        if (r4 != r5) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x0a61, code lost:
        throw defpackage.w7e.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x0a62, code lost:
        if (r4 > r5) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x0a64, code lost:
        if (r15 != r37) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x0a66, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x0a6b, code lost:
        throw defpackage.w7e.f();
     */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0520  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:188:0x051d -> B:189:0x051e). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int k(java.lang.Object r33, byte[] r34, int r35, int r36, int r37, defpackage.lzd r38) {
        /*
            Method dump skipped, instructions count: 2816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h8e.k(java.lang.Object, byte[], int, int, int, lzd):int");
    }

    public final Object l(int i, Object obj) {
        o8e F = F(i);
        long y = y(i) & 1048575;
        if (!A(i, obj)) {
            return F.zza();
        }
        Object object = k.getObject(obj, y);
        if (I(object)) {
            return object;
        }
        m7e zza = F.zza();
        if (object != null) {
            F.h(zza, object);
        }
        return zza;
    }

    public final Object m(int i, Object obj, int i2) {
        o8e F = F(i2);
        if (!B(i, obj, i2)) {
            return F.zza();
        }
        Object object = k.getObject(obj, y(i2) & 1048575);
        if (I(object)) {
            return object;
        }
        m7e zza = F.zza();
        if (object != null) {
            F.h(zza, object);
        }
        return zza;
    }

    public final void p(int i, vh1 vh1Var, Object obj) {
        if ((536870912 & i) != 0) {
            vh1Var.R0(2);
            b9e.d(obj, i & 1048575, ((xb1) vh1Var.e).j0());
        } else if (this.f) {
            vh1Var.R0(2);
            b9e.d(obj, i & 1048575, ((xb1) vh1Var.e).i0());
        } else {
            b9e.d(obj, i & 1048575, vh1Var.k1());
        }
    }

    public final void q(int i, Object obj, Object obj2, int i2) {
        k.putObject(obj, y(i2) & 1048575, obj2);
        w(i, obj, i2);
    }

    public final void r(Object obj, int i, Object obj2) {
        int i2 = this.a[i];
        if (b9e.m(obj, y(i) & 1048575) == null) {
            return;
        }
        E(i);
    }

    public final void s(Object obj, Object obj2, int i) {
        if (!A(i, obj2)) {
            return;
        }
        long y = y(i) & 1048575;
        Unsafe unsafe = k;
        Object object = unsafe.getObject(obj2, y);
        if (object != null) {
            o8e F = F(i);
            if (!A(i, obj)) {
                if (!I(object)) {
                    unsafe.putObject(obj, y, object);
                } else {
                    m7e zza = F.zza();
                    F.h(zza, object);
                    unsafe.putObject(obj, y, zza);
                }
                v(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, y);
            if (!I(object2)) {
                m7e zza2 = F.zza();
                F.h(zza2, object2);
                unsafe.putObject(obj, y, zza2);
                object2 = zza2;
            }
            F.h(object2, object);
            return;
        }
        vs.k(hl5.m("Source subfield ", " is present but null: ", this.a[i], String.valueOf(obj2)));
    }

    public final boolean t(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return A(i, obj);
        }
        if ((i3 & i4) != 0) {
            return true;
        }
        return false;
    }

    public final void u(int i, Object obj, Object obj2) {
        k.putObject(obj, y(i) & 1048575, obj2);
        v(i, obj);
    }

    public final void v(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j2 = 1048575 & i2;
        if (j2 == 1048575) {
            return;
        }
        b9e.b(j2, obj, (1 << (i2 >>> 20)) | b9e.c.j(obj, j2));
    }

    public final void w(int i, Object obj, int i2) {
        b9e.b(this.a[i2 + 2] & 1048575, obj, i);
    }

    public final void x(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (!B(i2, obj2, i)) {
            return;
        }
        long y = y(i) & 1048575;
        Unsafe unsafe = k;
        Object object = unsafe.getObject(obj2, y);
        if (object != null) {
            o8e F = F(i);
            if (!B(i2, obj, i)) {
                if (!I(object)) {
                    unsafe.putObject(obj, y, object);
                } else {
                    m7e zza = F.zza();
                    F.h(zza, object);
                    unsafe.putObject(obj, y, zza);
                }
                w(i2, obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, y);
            if (!I(object2)) {
                m7e zza2 = F.zza();
                F.h(zza2, object2);
                unsafe.putObject(obj, y, zza2);
                object2 = zza2;
            }
            F.h(object2, object);
            return;
        }
        vs.k(hl5.m("Source subfield ", " is present but null: ", iArr[i], String.valueOf(obj2)));
    }

    public final int y(int i) {
        return this.a[i + 1];
    }

    @Override // defpackage.o8e
    public final m7e zza() {
        return ((m7e) this.e).p();
    }
}

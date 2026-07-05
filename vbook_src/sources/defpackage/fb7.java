package defpackage;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import org.mozilla.javascript.Token;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fb7  reason: default package */
/* loaded from: classes.dex */
public final class fb7 implements i0a {
    public static final int[] n = new int[0];
    public static final Unsafe o = fxc.j();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final pw4 e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;
    public final h28 j;
    public final oq6 k;
    public final dwc l;
    public final d17 m;

    public fb7(int[] iArr, Object[] objArr, int i, int i2, pw4 pw4Var, boolean z, int[] iArr2, int i3, int i4, h28 h28Var, oq6 oq6Var, dwc dwcVar, o74 o74Var, d17 d17Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = pw4Var instanceof pw4;
        this.g = iArr2;
        this.h = i3;
        this.i = i4;
        this.j = h28Var;
        this.k = oq6Var;
        this.l = dwcVar;
        this.e = pw4Var;
        this.m = d17Var;
    }

    public static Field D(Class cls, String str) {
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

    public static int I(int i) {
        return (i & 267386880) >>> 20;
    }

    public static boolean n(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof pw4) {
            return ((pw4) obj).e();
        }
        return true;
    }

    public static fb7 u(dh9 dh9Var, h28 h28Var, oq6 oq6Var, dwc dwcVar, o74 o74Var, d17 d17Var) {
        if (dh9Var instanceof dh9) {
            return v(dh9Var, h28Var, oq6Var, dwcVar, o74Var, d17Var);
        }
        vm1.h();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.fb7 v(defpackage.dh9 r35, defpackage.h28 r36, defpackage.oq6 r37, defpackage.dwc r38, defpackage.o74 r39, defpackage.d17 r40) {
        /*
            Method dump skipped, instructions count: 1054
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fb7.v(dh9, h28, oq6, dwc, o74, d17):fb7");
    }

    public static long w(int i) {
        return i & 1048575;
    }

    public static int x(Object obj, long j) {
        return ((Integer) fxc.c.i(obj, j)).intValue();
    }

    public static long y(Object obj, long j) {
        return ((Long) fxc.c.i(obj, j)).longValue();
    }

    public final void A(Object obj, int i, vh1 vh1Var, i0a i0aVar, y54 y54Var) {
        int B;
        List c = this.k.c(obj, i & 1048575);
        cl1 cl1Var = (cl1) vh1Var.e;
        int i2 = vh1Var.b;
        if ((i2 & 7) == 2) {
            do {
                pw4 d = i0aVar.d();
                vh1Var.j(d, i0aVar, y54Var);
                i0aVar.b(d);
                c.add(d);
                if (!cl1Var.c() && vh1Var.d == 0) {
                    B = cl1Var.B();
                } else {
                    return;
                }
            } while (B == i2);
            vh1Var.d = B;
            return;
        }
        throw p16.b();
    }

    public final void B(int i, vh1 vh1Var, Object obj) {
        cl1 cl1Var = (cl1) vh1Var.e;
        String str = "";
        if ((536870912 & i) != 0) {
            long j = i & 1048575;
            vh1Var.n0(2);
            byte[] bArr = cl1Var.e;
            int r0 = cl1Var.r0();
            int i2 = cl1Var.D;
            int i3 = cl1Var.f;
            if (r0 <= i3 - i2 && r0 > 0) {
                cl1Var.D = i2 + r0;
            } else {
                if (r0 != 0) {
                    i2 = 0;
                    if (r0 <= i3) {
                        cl1Var.v0(r0);
                        cl1Var.D = r0;
                    } else {
                        bArr = cl1Var.m0(r0);
                    }
                }
                fxc.o(obj, j, str);
            }
            str = v1d.a.g(bArr, i2, r0);
            fxc.o(obj, j, str);
        } else if (this.f) {
            long j2 = i & 1048575;
            vh1Var.n0(2);
            byte[] bArr2 = cl1Var.e;
            int r02 = cl1Var.r0();
            if (r02 > 0) {
                int i4 = cl1Var.f;
                int i5 = cl1Var.D;
                if (r02 <= i4 - i5) {
                    str = new String(bArr2, i5, r02, vz5.a);
                    cl1Var.D += r02;
                    fxc.o(obj, j2, str);
                }
            }
            if (r02 != 0) {
                if (r02 <= cl1Var.f) {
                    cl1Var.v0(r02);
                    str = new String(bArr2, cl1Var.D, r02, vz5.a);
                    cl1Var.D += r02;
                } else {
                    str = new String(cl1Var.m0(r02), vz5.a);
                }
            }
            fxc.o(obj, j2, str);
        } else {
            fxc.o(obj, i & 1048575, vh1Var.p());
        }
    }

    public final void C(int i, vh1 vh1Var, Object obj) {
        boolean z;
        if ((536870912 & i) != 0) {
            z = true;
        } else {
            z = false;
        }
        oq6 oq6Var = this.k;
        if (z) {
            vh1Var.f0(oq6Var.c(obj, i & 1048575), true);
        } else {
            vh1Var.f0(oq6Var.c(obj, i & 1048575), false);
        }
    }

    public final void E(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        fxc.m(j, obj, (1 << (i2 >>> 20)) | fxc.c.g(obj, j));
    }

    public final void F(int i, Object obj, int i2) {
        fxc.m(this.a[i2 + 2] & 1048575, obj, i);
    }

    public final void G(Object obj, int i, pw4 pw4Var) {
        o.putObject(obj, J(i) & 1048575, pw4Var);
        E(i, obj);
    }

    public final void H(Object obj, int i, int i2, pw4 pw4Var) {
        o.putObject(obj, J(i2) & 1048575, pw4Var);
        F(i, obj, i2);
    }

    public final int J(int i) {
        return this.a[i + 1];
    }

    @Override // defpackage.i0a
    public final void a(Object obj, Object obj2) {
        Object obj3;
        if (n(obj)) {
            obj2.getClass();
            int i = 0;
            while (true) {
                int[] iArr = this.a;
                if (i < iArr.length) {
                    int J = J(i);
                    long j = 1048575 & J;
                    int i2 = iArr[i];
                    switch (I(J)) {
                        case 0:
                            if (m(i, obj2)) {
                                cxc cxcVar = fxc.c;
                                obj3 = obj;
                                cxcVar.l(obj3, j, cxcVar.e(obj2, j));
                                E(i, obj3);
                                continue;
                                i += 3;
                                obj = obj3;
                            }
                            break;
                        case 1:
                            if (m(i, obj2)) {
                                cxc cxcVar2 = fxc.c;
                                cxcVar2.m(obj, j, cxcVar2.f(obj2, j));
                                E(i, obj);
                                break;
                            }
                            break;
                        case 2:
                            if (m(i, obj2)) {
                                fxc.n(obj, j, fxc.c.h(obj2, j));
                                E(i, obj);
                                break;
                            }
                            break;
                        case 3:
                            if (m(i, obj2)) {
                                fxc.n(obj, j, fxc.c.h(obj2, j));
                                E(i, obj);
                                break;
                            }
                            break;
                        case 4:
                            if (m(i, obj2)) {
                                fxc.m(j, obj, fxc.c.g(obj2, j));
                                E(i, obj);
                                break;
                            }
                            break;
                        case 5:
                            if (m(i, obj2)) {
                                fxc.n(obj, j, fxc.c.h(obj2, j));
                                E(i, obj);
                                break;
                            }
                            break;
                        case 6:
                            if (m(i, obj2)) {
                                fxc.m(j, obj, fxc.c.g(obj2, j));
                                E(i, obj);
                                break;
                            }
                            break;
                        case 7:
                            if (m(i, obj2)) {
                                cxc cxcVar3 = fxc.c;
                                cxcVar3.k(obj, j, cxcVar3.c(obj2, j));
                                E(i, obj);
                                break;
                            }
                            break;
                        case 8:
                            if (m(i, obj2)) {
                                fxc.o(obj, j, fxc.c.i(obj2, j));
                                E(i, obj);
                                break;
                            }
                            break;
                        case 9:
                            q(i, obj, obj2);
                            break;
                        case 10:
                            if (m(i, obj2)) {
                                fxc.o(obj, j, fxc.c.i(obj2, j));
                                E(i, obj);
                                break;
                            }
                            break;
                        case 11:
                            if (m(i, obj2)) {
                                fxc.m(j, obj, fxc.c.g(obj2, j));
                                E(i, obj);
                                break;
                            }
                            break;
                        case 12:
                            if (m(i, obj2)) {
                                fxc.m(j, obj, fxc.c.g(obj2, j));
                                E(i, obj);
                                break;
                            }
                            break;
                        case 13:
                            if (m(i, obj2)) {
                                fxc.m(j, obj, fxc.c.g(obj2, j));
                                E(i, obj);
                                break;
                            }
                            break;
                        case 14:
                            if (m(i, obj2)) {
                                fxc.n(obj, j, fxc.c.h(obj2, j));
                                E(i, obj);
                                break;
                            }
                            break;
                        case 15:
                            if (m(i, obj2)) {
                                fxc.m(j, obj, fxc.c.g(obj2, j));
                                E(i, obj);
                                break;
                            }
                            break;
                        case 16:
                            if (m(i, obj2)) {
                                fxc.n(obj, j, fxc.c.h(obj2, j));
                                E(i, obj);
                                break;
                            }
                            break;
                        case 17:
                            q(i, obj, obj2);
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
                            this.k.b(obj, j, obj2);
                            break;
                        case Token.TRUE /* 50 */:
                            Class cls = n0a.a;
                            cxc cxcVar4 = fxc.c;
                            Object i3 = cxcVar4.i(obj, j);
                            Object i4 = cxcVar4.i(obj2, j);
                            this.m.getClass();
                            fxc.o(obj, j, d17.a(i3, i4));
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
                            if (o(i2, obj2, i)) {
                                fxc.o(obj, j, fxc.c.i(obj2, j));
                                F(i2, obj, i);
                                break;
                            }
                            break;
                        case Token.GETVAR /* 60 */:
                            r(i, obj, obj2);
                            break;
                        case Token.SETVAR /* 61 */:
                        case Token.CATCH_SCOPE /* 62 */:
                        case Token.ENUM_INIT_KEYS /* 63 */:
                        case Token.ENUM_INIT_VALUES /* 64 */:
                        case Token.ENUM_INIT_ARRAY /* 65 */:
                        case Token.ENUM_INIT_VALUES_IN_ORDER /* 66 */:
                        case Token.ENUM_NEXT /* 67 */:
                            if (o(i2, obj2, i)) {
                                fxc.o(obj, j, fxc.c.i(obj2, j));
                                F(i2, obj, i);
                                break;
                            }
                            break;
                        case Token.ENUM_ID /* 68 */:
                            r(i, obj, obj2);
                            break;
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                } else {
                    n0a.c(this.l, obj, obj2);
                    return;
                }
            }
        } else {
            vs.m(rs8.i(obj, "Mutating immutable message: "));
        }
    }

    @Override // defpackage.i0a
    public final void b(Object obj) {
        if (!n(obj)) {
            return;
        }
        if (obj instanceof pw4) {
            pw4 pw4Var = (pw4) obj;
            pw4Var.b = (pw4Var.b & Integer.MIN_VALUE) | (Integer.MAX_VALUE & Integer.MAX_VALUE);
            pw4Var.a = 0;
            pw4Var.b &= Integer.MAX_VALUE;
        }
        int[] iArr = this.a;
        int length = iArr.length;
        for (int i = 0; i < length; i += 3) {
            int J = J(i);
            long j = 1048575 & J;
            int I = I(J);
            if (I != 9) {
                if (I != 60 && I != 68) {
                    switch (I) {
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
                            this.k.a(obj, j);
                            break;
                        case Token.TRUE /* 50 */:
                            Unsafe unsafe = o;
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                this.m.getClass();
                                ((a17) object).a = false;
                                unsafe.putObject(obj, j, object);
                                break;
                            } else {
                                break;
                            }
                    }
                } else if (o(iArr[i], obj, i)) {
                    l(i).b(o.getObject(obj, j));
                }
            }
            if (m(i, obj)) {
                l(i).b(o.getObject(obj, j));
            }
        }
        this.l.getClass();
        ((pw4) obj).c.d = false;
    }

    @Override // defpackage.i0a
    public final boolean c(Object obj) {
        boolean z;
        int i = 1048575;
        int i2 = 0;
        int i3 = 0;
        loop0: while (true) {
            boolean z2 = true;
            if (i2 >= this.h) {
                return true;
            }
            int i4 = this.g[i2];
            int[] iArr = this.a;
            int i5 = iArr[i4];
            int J = J(i4);
            int i6 = iArr[i4 + 2];
            int i7 = i6 & 1048575;
            int i8 = 1 << (i6 >>> 20);
            if (i7 != i) {
                if (i7 != 1048575) {
                    i3 = o.getInt(obj, i7);
                }
                i = i7;
            }
            if ((268435456 & J) != 0) {
                if (i == 1048575) {
                    z = m(i4, obj);
                } else if ((i3 & i8) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    break;
                }
            }
            int I = I(J);
            if (I != 9 && I != 17) {
                if (I != 27) {
                    if (I != 60 && I != 68) {
                        if (I != 49) {
                            if (I != 50) {
                                continue;
                            } else {
                                Object i9 = fxc.c.i(obj, J & 1048575);
                                this.m.getClass();
                                a17 a17Var = (a17) i9;
                                if (!a17Var.isEmpty() && ((eld) ((v07) k(i4)).a.c).a == gld.MESSAGE) {
                                    i0a i0aVar = null;
                                    for (Object obj2 : a17Var.values()) {
                                        if (i0aVar == null) {
                                            i0aVar = y89.c.a(obj2.getClass());
                                        }
                                        if (!i0aVar.c(obj2)) {
                                            break loop0;
                                        }
                                    }
                                    continue;
                                }
                            }
                            i2++;
                        }
                    } else {
                        if (o(i5, obj, i4)) {
                            if (!l(i4).c(fxc.c.i(obj, J & 1048575))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                        i2++;
                    }
                }
                List list = (List) fxc.c.i(obj, J & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    i0a l = l(i4);
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        if (!l.c(list.get(i10))) {
                            break loop0;
                        }
                    }
                    continue;
                }
                i2++;
            } else {
                if (i == 1048575) {
                    z2 = m(i4, obj);
                } else if ((i8 & i3) == 0) {
                    z2 = false;
                }
                if (z2) {
                    if (!l(i4).c(fxc.c.i(obj, J & 1048575))) {
                        break;
                    }
                } else {
                    continue;
                }
                i2++;
            }
        }
        return false;
    }

    @Override // defpackage.i0a
    public final pw4 d() {
        this.j.getClass();
        return this.e.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x0653 A[Catch: all -> 0x048b, TryCatch #8 {all -> 0x048b, blocks: (B:153:0x064e, B:155:0x0653, B:156:0x0658, B:113:0x03d0, B:115:0x03d7, B:116:0x03e7, B:117:0x03f7, B:118:0x0407, B:119:0x0417, B:120:0x0427, B:121:0x0437, B:122:0x0448, B:123:0x0459, B:124:0x046f, B:127:0x048e, B:128:0x04aa, B:129:0x04c7, B:130:0x04e3, B:131:0x0502, B:132:0x051e, B:133:0x0533, B:134:0x054d, B:135:0x055a, B:136:0x0578, B:137:0x0594, B:138:0x05b1, B:139:0x05cd, B:140:0x05e9, B:141:0x0605, B:142:0x0623, B:143:0x0638, B:147:0x0643), top: B:184:0x064e }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0678 A[LOOP:4: B:166:0x0676->B:167:0x0678, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0682  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x065e A[SYNTHETIC] */
    @Override // defpackage.i0a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(java.lang.Object r19, defpackage.vh1 r20, defpackage.y54 r21) {
        /*
            Method dump skipped, instructions count: 1828
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fb7.e(java.lang.Object, vh1, y54):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01ec, code lost:
        if (java.lang.Double.doubleToLongBits(r5.e(r12, r7)) == java.lang.Double.doubleToLongBits(r5.e(r13, r7))) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
        if (defpackage.n0a.d(r9.i(r12, r7), r9.i(r13, r7)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
        if (defpackage.n0a.d(r5.i(r12, r7), r5.i(r13, r7)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008a, code lost:
        if (r5.h(r12, r7) == r5.h(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009e, code lost:
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b4, code lost:
        if (r5.h(r12, r7) == r5.h(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c8, code lost:
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00dc, code lost:
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f0, code lost:
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0108, code lost:
        if (defpackage.n0a.d(r5.i(r12, r7), r5.i(r13, r7)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0120, code lost:
        if (defpackage.n0a.d(r5.i(r12, r7), r5.i(r13, r7)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0138, code lost:
        if (defpackage.n0a.d(r5.i(r12, r7), r5.i(r13, r7)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x014c, code lost:
        if (r5.c(r12, r7) == r5.c(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0160, code lost:
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0176, code lost:
        if (r5.h(r12, r7) == r5.h(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x018a, code lost:
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x019f, code lost:
        if (r5.h(r12, r7) == r5.h(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01b4, code lost:
        if (r5.h(r12, r7) == r5.h(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01cf, code lost:
        if (java.lang.Float.floatToIntBits(r5.f(r12, r7)) == java.lang.Float.floatToIntBits(r5.f(r13, r7))) goto L85;
     */
    @Override // defpackage.i0a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(defpackage.pw4 r12, defpackage.pw4 r13) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fb7.f(pw4, pw4):boolean");
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
    @Override // defpackage.i0a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(defpackage.pw4 r12) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fb7.g(pw4):int");
    }

    public final boolean h(pw4 pw4Var, pw4 pw4Var2, int i) {
        if (m(i, pw4Var) == m(i, pw4Var2)) {
            return true;
        }
        return false;
    }

    public final void i(int i, Object obj, Object obj2) {
        int i2 = this.a[i];
        if (fxc.c.i(obj, J(i) & 1048575) == null) {
            return;
        }
        j(i);
    }

    public final void j(int i) {
        if (this.b[hl5.b(i, 3, 2, 1)] == null) {
            return;
        }
        vm1.h();
    }

    public final Object k(int i) {
        return this.b[(i / 3) * 2];
    }

    public final i0a l(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        i0a i0aVar = (i0a) objArr[i2];
        if (i0aVar != null) {
            return i0aVar;
        }
        i0a a = y89.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = a;
        return a;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0110 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0111 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(int r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fb7.m(int, java.lang.Object):boolean");
    }

    public final boolean o(int i, Object obj, int i2) {
        if (fxc.c.g(obj, this.a[i2 + 2] & 1048575) == i) {
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
    public final void p(java.lang.Object r8, int r9, java.lang.Object r10, defpackage.y54 r11, defpackage.vh1 r12) {
        /*
            r7 = this;
            int r9 = r7.J(r9)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r9 & r0
            long r0 = (long) r9
            cxc r9 = defpackage.fxc.c
            java.lang.Object r9 = r9.i(r8, r0)
            d17 r7 = r7.m
            if (r9 != 0) goto L20
            r7.getClass()
            a17 r9 = defpackage.a17.b
            a17 r9 = r9.b()
            defpackage.fxc.o(r8, r0, r9)
            goto L37
        L20:
            r7.getClass()
            r2 = r9
            a17 r2 = (defpackage.a17) r2
            boolean r2 = r2.a
            if (r2 != 0) goto L37
            a17 r2 = defpackage.a17.b
            a17 r2 = r2.b()
            defpackage.d17.a(r2, r9)
            defpackage.fxc.o(r8, r0, r2)
            r9 = r2
        L37:
            r7.getClass()
            a17 r9 = (defpackage.a17) r9
            v07 r10 = (defpackage.v07) r10
            zg4 r7 = r10.a
            r8 = 2
            r12.n0(r8)
            java.lang.Object r10 = r12.e
            cl1 r10 = (defpackage.cl1) r10
            int r0 = r10.r0()
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
            boolean r4 = r12.o0()     // Catch: java.lang.Throwable -> L79 defpackage.m16 -> L92
            if (r4 == 0) goto L73
            goto L55
        L73:
            p16 r4 = new p16     // Catch: java.lang.Throwable -> L79 defpackage.m16 -> L92
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L79 defpackage.m16 -> L92
            throw r4     // Catch: java.lang.Throwable -> L79 defpackage.m16 -> L92
        L79:
            r7 = move-exception
            goto La6
        L7b:
            java.lang.Object r4 = r7.c     // Catch: java.lang.Throwable -> L79 defpackage.m16 -> L92
            eld r4 = (defpackage.eld) r4     // Catch: java.lang.Throwable -> L79 defpackage.m16 -> L92
            java.lang.Class r5 = r1.getClass()     // Catch: java.lang.Throwable -> L79 defpackage.m16 -> L92
            java.lang.Object r3 = r12.A(r4, r5, r11)     // Catch: java.lang.Throwable -> L79 defpackage.m16 -> L92
            goto L55
        L88:
            java.lang.Object r4 = r7.b     // Catch: java.lang.Throwable -> L79 defpackage.m16 -> L92
            eld r4 = (defpackage.eld) r4     // Catch: java.lang.Throwable -> L79 defpackage.m16 -> L92
            r5 = 0
            java.lang.Object r2 = r12.A(r4, r5, r5)     // Catch: java.lang.Throwable -> L79 defpackage.m16 -> L92
            goto L55
        L92:
            boolean r4 = r12.o0()     // Catch: java.lang.Throwable -> L79
            if (r4 == 0) goto L99
            goto L55
        L99:
            p16 r7 = new p16     // Catch: java.lang.Throwable -> L79
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fb7.p(java.lang.Object, int, java.lang.Object, y54, vh1):void");
    }

    public final void q(int i, Object obj, Object obj2) {
        if (!m(i, obj2)) {
            return;
        }
        long J = J(i) & 1048575;
        Unsafe unsafe = o;
        Object object = unsafe.getObject(obj2, J);
        if (object != null) {
            i0a l = l(i);
            if (!m(i, obj)) {
                if (!n(object)) {
                    unsafe.putObject(obj, J, object);
                } else {
                    pw4 d = l.d();
                    l.a(d, object);
                    unsafe.putObject(obj, J, d);
                }
                E(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, J);
            if (!n(object2)) {
                pw4 d2 = l.d();
                l.a(d2, object2);
                unsafe.putObject(obj, J, d2);
                object2 = d2;
            }
            l.a(object2, object);
            return;
        }
        xk5.i(this.a[i], obj2);
    }

    public final void r(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (!o(i2, obj2, i)) {
            return;
        }
        long J = J(i) & 1048575;
        Unsafe unsafe = o;
        Object object = unsafe.getObject(obj2, J);
        if (object != null) {
            i0a l = l(i);
            if (!o(i2, obj, i)) {
                if (!n(object)) {
                    unsafe.putObject(obj, J, object);
                } else {
                    pw4 d = l.d();
                    l.a(d, object);
                    unsafe.putObject(obj, J, d);
                }
                F(i2, obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, J);
            if (!n(object2)) {
                pw4 d2 = l.d();
                l.a(d2, object2);
                unsafe.putObject(obj, J, d2);
                object2 = d2;
            }
            l.a(object2, object);
            return;
        }
        xk5.i(iArr[i], obj2);
    }

    public final Object s(int i, Object obj) {
        i0a l = l(i);
        long J = J(i) & 1048575;
        if (!m(i, obj)) {
            return l.d();
        }
        Object object = o.getObject(obj, J);
        if (n(object)) {
            return object;
        }
        pw4 d = l.d();
        if (object != null) {
            l.a(d, object);
        }
        return d;
    }

    public final Object t(int i, Object obj, int i2) {
        i0a l = l(i2);
        if (!o(i, obj, i2)) {
            return l.d();
        }
        Object object = o.getObject(obj, J(i2) & 1048575);
        if (n(object)) {
            return object;
        }
        pw4 d = l.d();
        if (object != null) {
            l.a(d, object);
        }
        return d;
    }

    public final void z(Object obj, long j, vh1 vh1Var, i0a i0aVar, y54 y54Var) {
        int B;
        List c = this.k.c(obj, j);
        cl1 cl1Var = (cl1) vh1Var.e;
        int i = vh1Var.b;
        if ((i & 7) == 3) {
            do {
                pw4 d = i0aVar.d();
                vh1Var.g(d, i0aVar, y54Var);
                i0aVar.b(d);
                c.add(d);
                if (!cl1Var.c() && vh1Var.d == 0) {
                    B = cl1Var.B();
                } else {
                    return;
                }
            } while (B == i);
            vh1Var.d = B;
            return;
        }
        throw p16.b();
    }
}

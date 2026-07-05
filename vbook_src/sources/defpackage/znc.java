package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: znc  reason: default package */
/* loaded from: classes.dex */
public final class znc {
    public static final znc e = new znc(0, 0, new Object[0], null);
    public int a;
    public int b;
    public final cne c;
    public Object[] d;

    public znc(int i, int i2, Object[] objArr, cne cneVar) {
        this.a = i;
        this.b = i2;
        this.c = cneVar;
        this.d = objArr;
    }

    public static znc j(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, cne cneVar) {
        if (i3 > 30) {
            return new znc(0, 0, new Object[]{obj, obj2, obj3, obj4}, cneVar);
        }
        int o = nae.o(i, i3);
        int o2 = nae.o(i2, i3);
        if (o != o2) {
            return new znc((1 << o) | (1 << o2), 0, o < o2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, cneVar);
        }
        return new znc(0, 1 << o, new Object[]{j(i, obj, obj2, i2, obj3, obj4, i3 + 5, cneVar)}, cneVar);
    }

    public final Object[] a(int i, int i2, int i3, Object obj, Object obj2, int i4, cne cneVar) {
        int i5;
        Object obj3 = this.d[i];
        if (obj3 != null) {
            i5 = obj3.hashCode();
        } else {
            i5 = 0;
        }
        znc j = j(i5, obj3, x(i), i3, obj, obj2, i4 + 5, cneVar);
        int t = t(i2);
        int i6 = t + 1;
        Object[] objArr = this.d;
        Object[] objArr2 = new Object[objArr.length - 1];
        b00.a0(0, i, 6, objArr, objArr2);
        b00.W(i, i + 2, i6, objArr, objArr2);
        objArr2[t - 1] = j;
        b00.W(t, i6, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public final int b() {
        if (this.b == 0) {
            return this.d.length / 2;
        }
        int bitCount = Integer.bitCount(this.a);
        int length = this.d.length;
        for (int i = bitCount * 2; i < length; i++) {
            bitCount += s(i).b();
        }
        return bitCount;
    }

    public final boolean c(Object obj) {
        ry5 D = dce.D(dce.F(0, this.d.length), 2);
        int i = D.a;
        int i2 = D.b;
        int i3 = D.c;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!c16.i(obj, this.d[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i, Object obj, int i2) {
        int o = 1 << nae.o(i, i2);
        if (h(o)) {
            return c16.i(obj, this.d[f(o)]);
        } else if (i(o)) {
            znc s = s(t(o));
            if (i2 == 30) {
                return s.c(obj);
            }
            return s.d(i, obj, i2 + 5);
        } else {
            return false;
        }
    }

    public final boolean e(znc zncVar) {
        if (this != zncVar) {
            if (this.b == zncVar.b && this.a == zncVar.a) {
                int length = this.d.length;
                for (int i = 0; i < length; i++) {
                    if (this.d[i] == zncVar.d[i]) {
                    }
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int f(int i) {
        return Integer.bitCount(this.a & (i - 1)) * 2;
    }

    public final Object g(int i, Object obj, int i2) {
        int o = 1 << nae.o(i, i2);
        if (h(o)) {
            int f = f(o);
            if (c16.i(obj, this.d[f])) {
                return x(f);
            }
            return null;
        } else if (i(o)) {
            znc s = s(t(o));
            if (i2 == 30) {
                ry5 D = dce.D(dce.F(0, s.d.length), 2);
                int i3 = D.a;
                int i4 = D.b;
                int i5 = D.c;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!c16.i(obj, s.d[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        } else {
                            return null;
                        }
                    }
                    return s.x(i3);
                }
                return null;
            }
            return s.g(i, obj, i2 + 5);
        } else {
            return null;
        }
    }

    public final boolean h(int i) {
        if ((this.a & i) != 0) {
            return true;
        }
        return false;
    }

    public final boolean i(int i) {
        if ((this.b & i) != 0) {
            return true;
        }
        return false;
    }

    public final znc k(int i, au8 au8Var) {
        au8Var.c(au8Var.f - 1);
        au8Var.d = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c == au8Var.b) {
            this.d = nae.h(i, objArr);
            return this;
        }
        return new znc(0, 0, nae.h(i, objArr), au8Var.b);
    }

    public final znc l(int i, Object obj, Object obj2, int i2, au8 au8Var) {
        au8 au8Var2;
        znc l;
        int o = 1 << nae.o(i, i2);
        boolean h = h(o);
        cne cneVar = this.c;
        if (h) {
            int f = f(o);
            if (c16.i(obj, this.d[f])) {
                au8Var.d = x(f);
                if (x(f) == obj2) {
                    return this;
                }
                if (cneVar == au8Var.b) {
                    this.d[f + 1] = obj2;
                    return this;
                }
                au8Var.e++;
                Object[] objArr = this.d;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                copyOf[f + 1] = obj2;
                return new znc(this.a, this.b, copyOf, au8Var.b);
            }
            au8Var.c(au8Var.f + 1);
            cne cneVar2 = au8Var.b;
            if (cneVar == cneVar2) {
                this.d = a(f, o, i, obj, obj2, i2, cneVar2);
                this.a ^= o;
                this.b |= o;
                return this;
            }
            return new znc(this.a ^ o, this.b | o, a(f, o, i, obj, obj2, i2, cneVar2), cneVar2);
        } else if (i(o)) {
            int t = t(o);
            znc s = s(t);
            if (i2 == 30) {
                ry5 D = dce.D(dce.F(0, s.d.length), 2);
                int i3 = D.a;
                int i4 = D.b;
                int i5 = D.c;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!c16.i(obj, s.d[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    au8Var.d = s.x(i3);
                    if (s.c == au8Var.b) {
                        s.d[i3 + 1] = obj2;
                        l = s;
                    } else {
                        au8Var.e++;
                        Object[] objArr2 = s.d;
                        Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                        copyOf2[i3 + 1] = obj2;
                        l = new znc(0, 0, copyOf2, au8Var.b);
                    }
                    au8Var2 = au8Var;
                }
                au8Var.c(au8Var.f + 1);
                l = new znc(0, 0, nae.g(s.d, 0, obj, obj2), au8Var.b);
                au8Var2 = au8Var;
            } else {
                au8Var2 = au8Var;
                l = s.l(i, obj, obj2, i2 + 5, au8Var2);
            }
            if (s == l) {
                return this;
            }
            return r(t, l, au8Var2.b);
        } else {
            au8Var.c(au8Var.f + 1);
            cne cneVar3 = au8Var.b;
            int f2 = f(o);
            Object[] objArr3 = this.d;
            if (cneVar == cneVar3) {
                this.d = nae.g(objArr3, f2, obj, obj2);
                this.a |= o;
                return this;
            }
            return new znc(this.a | o, this.b, nae.g(objArr3, f2, obj, obj2), cneVar3);
        }
    }

    public final znc m(znc zncVar, int i, q13 q13Var, au8 au8Var) {
        znc zncVar2;
        Object[] objArr;
        int i2;
        int i3;
        znc j;
        int i4;
        int i5;
        int i6;
        if (this == zncVar) {
            q13Var.a += b();
            return this;
        }
        int i7 = 0;
        if (i > 30) {
            cne cneVar = au8Var.b;
            int i8 = zncVar.b;
            Object[] objArr2 = this.d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + zncVar.d.length);
            int length = this.d.length;
            ry5 D = dce.D(dce.F(0, zncVar.d.length), 2);
            int i9 = D.a;
            int i10 = D.b;
            int i11 = D.c;
            if ((i11 > 0 && i9 <= i10) || (i11 < 0 && i10 <= i9)) {
                while (true) {
                    if (!c(zncVar.d[i9])) {
                        Object[] objArr3 = zncVar.d;
                        copyOf[length] = objArr3[i9];
                        copyOf[length + 1] = objArr3[i9 + 1];
                        length += 2;
                    } else {
                        q13Var.a++;
                    }
                    if (i9 == i10) {
                        break;
                    }
                    i9 += i11;
                }
            }
            if (length != this.d.length) {
                if (length == zncVar.d.length) {
                    return zncVar;
                }
                if (length == copyOf.length) {
                    return new znc(0, 0, copyOf, cneVar);
                }
                return new znc(0, 0, Arrays.copyOf(copyOf, length), cneVar);
            }
        } else {
            int i12 = this.b | zncVar.b;
            int i13 = this.a;
            int i14 = zncVar.a;
            int i15 = i13 & i14;
            int i16 = (i13 ^ i14) & (~i12);
            while (i15 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i15);
                if (c16.i(this.d[f(lowestOneBit)], zncVar.d[zncVar.f(lowestOneBit)])) {
                    i16 |= lowestOneBit;
                } else {
                    i12 |= lowestOneBit;
                }
                i15 ^= lowestOneBit;
            }
            if ((i12 & i16) != 0) {
                e39.b("Check failed.");
            }
            if (c16.i(this.c, au8Var.b) && this.a == i16 && this.b == i12) {
                zncVar2 = this;
            } else {
                zncVar2 = new znc(i16, i12, new Object[Integer.bitCount(i12) + (Integer.bitCount(i16) * 2)], null);
            }
            int i17 = i12;
            int i18 = 0;
            while (i17 != 0) {
                int lowestOneBit2 = Integer.lowestOneBit(i17);
                Object[] objArr4 = zncVar2.d;
                int length2 = (objArr4.length - 1) - i18;
                if (i(lowestOneBit2)) {
                    j = s(t(lowestOneBit2));
                    if (zncVar.i(lowestOneBit2)) {
                        j = j.m(zncVar.s(zncVar.t(lowestOneBit2)), i + 5, q13Var, au8Var);
                        objArr = objArr4;
                    } else if (zncVar.h(lowestOneBit2)) {
                        int f = zncVar.f(lowestOneBit2);
                        Object obj = zncVar.d[f];
                        Object x = zncVar.x(f);
                        int i19 = au8Var.f;
                        if (obj != null) {
                            i6 = obj.hashCode();
                        } else {
                            i6 = i7;
                        }
                        int i20 = i6;
                        objArr = objArr4;
                        j = j.l(i20, obj, x, i + 5, au8Var);
                        if (au8Var.f == i19) {
                            q13Var.a++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (zncVar.i(lowestOneBit2)) {
                        znc s = zncVar.s(zncVar.t(lowestOneBit2));
                        if (h(lowestOneBit2)) {
                            int f2 = f(lowestOneBit2);
                            Object obj2 = this.d[f2];
                            if (obj2 != null) {
                                i4 = obj2.hashCode();
                            } else {
                                i4 = 0;
                            }
                            int i21 = i + 5;
                            if (s.d(i4, obj2, i21)) {
                                q13Var.a++;
                            } else {
                                Object x2 = x(f2);
                                if (obj2 != null) {
                                    i5 = obj2.hashCode();
                                } else {
                                    i5 = 0;
                                }
                                j = s.l(i5, obj2, x2, i21, au8Var);
                            }
                        }
                        j = s;
                    } else {
                        int f3 = f(lowestOneBit2);
                        Object obj3 = this.d[f3];
                        Object x3 = x(f3);
                        int f4 = zncVar.f(lowestOneBit2);
                        Object obj4 = zncVar.d[f4];
                        Object x4 = zncVar.x(f4);
                        if (obj3 != null) {
                            i2 = obj3.hashCode();
                        } else {
                            i2 = 0;
                        }
                        if (obj4 != null) {
                            i3 = obj4.hashCode();
                        } else {
                            i3 = 0;
                        }
                        j = j(i2, obj3, x3, i3, obj4, x4, i + 5, au8Var.b);
                    }
                }
                objArr[length2] = j;
                i18++;
                i17 ^= lowestOneBit2;
                i7 = 0;
            }
            int i22 = 0;
            while (i16 != 0) {
                int lowestOneBit3 = Integer.lowestOneBit(i16);
                int i23 = i22 * 2;
                if (!zncVar.h(lowestOneBit3)) {
                    int f5 = f(lowestOneBit3);
                    Object[] objArr5 = zncVar2.d;
                    objArr5[i23] = this.d[f5];
                    objArr5[i23 + 1] = x(f5);
                } else {
                    int f6 = zncVar.f(lowestOneBit3);
                    Object[] objArr6 = zncVar2.d;
                    objArr6[i23] = zncVar.d[f6];
                    objArr6[i23 + 1] = zncVar.x(f6);
                    if (h(lowestOneBit3)) {
                        q13Var.a++;
                    }
                }
                i22++;
                i16 ^= lowestOneBit3;
            }
            if (!e(zncVar2)) {
                if (zncVar.e(zncVar2)) {
                    return zncVar;
                }
                return zncVar2;
            }
        }
        return this;
    }

    public final znc n(int i, Object obj, int i2, au8 au8Var) {
        znc n;
        int o = 1 << nae.o(i, i2);
        if (h(o)) {
            int f = f(o);
            if (c16.i(obj, this.d[f])) {
                return p(f, o, au8Var);
            }
        } else if (i(o)) {
            int t = t(o);
            znc s = s(t);
            if (i2 == 30) {
                ry5 D = dce.D(dce.F(0, s.d.length), 2);
                int i3 = D.a;
                int i4 = D.b;
                int i5 = D.c;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!c16.i(obj, s.d[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    n = s.k(i3, au8Var);
                }
                n = s;
                break;
            }
            n = s.n(i, obj, i2 + 5, au8Var);
            return q(s, n, t, o, au8Var.b);
        }
        return this;
    }

    public final znc o(int i, Object obj, Object obj2, int i2, au8 au8Var) {
        au8 au8Var2;
        znc o;
        int o2 = 1 << nae.o(i, i2);
        if (h(o2)) {
            int f = f(o2);
            if (c16.i(obj, this.d[f]) && c16.i(obj2, x(f))) {
                return p(f, o2, au8Var);
            }
            return this;
        } else if (i(o2)) {
            int t = t(o2);
            znc s = s(t);
            if (i2 == 30) {
                ry5 D = dce.D(dce.F(0, s.d.length), 2);
                int i3 = D.a;
                int i4 = D.b;
                int i5 = D.c;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        if (c16.i(obj, s.d[i3]) && c16.i(obj2, s.x(i3))) {
                            o = s.k(i3, au8Var);
                            break;
                        } else if (i3 == i4) {
                            break;
                        } else {
                            i3 += i5;
                        }
                    }
                    au8Var2 = au8Var;
                }
                o = s;
                au8Var2 = au8Var;
            } else {
                au8Var2 = au8Var;
                o = s.o(i, obj, obj2, i2 + 5, au8Var2);
            }
            return q(s, o, t, o2, au8Var2.b);
        } else {
            return this;
        }
    }

    public final znc p(int i, int i2, au8 au8Var) {
        au8Var.c(au8Var.f - 1);
        au8Var.d = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c == au8Var.b) {
            this.d = nae.h(i, objArr);
            this.a ^= i2;
            return this;
        }
        return new znc(i2 ^ this.a, this.b, nae.h(i, objArr), au8Var.b);
    }

    public final znc q(znc zncVar, znc zncVar2, int i, int i2, cne cneVar) {
        cne cneVar2 = this.c;
        if (zncVar2 == null) {
            Object[] objArr = this.d;
            if (objArr.length == 1) {
                return null;
            }
            if (cneVar2 == cneVar) {
                this.d = nae.i(i, objArr);
                this.b ^= i2;
                return this;
            }
            return new znc(this.a, this.b ^ i2, nae.i(i, objArr), cneVar);
        } else if (cneVar2 != cneVar && zncVar == zncVar2) {
            return this;
        } else {
            return r(i, zncVar2, cneVar);
        }
    }

    public final znc r(int i, znc zncVar, cne cneVar) {
        Object[] objArr = this.d;
        if (objArr.length == 1 && zncVar.d.length == 2 && zncVar.b == 0) {
            zncVar.a = this.b;
            return zncVar;
        } else if (this.c == cneVar) {
            objArr[i] = zncVar;
            return this;
        } else {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            copyOf[i] = zncVar;
            return new znc(this.a, this.b, copyOf, cneVar);
        }
    }

    public final znc s(int i) {
        Object obj = this.d[i];
        obj.getClass();
        return (znc) obj;
    }

    public final int t(int i) {
        return (this.d.length - 1) - Integer.bitCount(this.b & (i - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c5, code lost:
        if (r14 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ce, code lost:
        if (r14 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d1, code lost:
        r14.c = w(r7, r2, (defpackage.znc) r14.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00db, code lost:
        return r14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.jt1 u(int r14, java.lang.Object r15, java.lang.Object r16, int r17) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.znc.u(int, java.lang.Object, java.lang.Object, int):jt1");
    }

    public final znc v(int i, Object obj, int i2) {
        znc v;
        int o = 1 << nae.o(i, i2);
        if (h(o)) {
            int f = f(o);
            if (c16.i(obj, this.d[f])) {
                Object[] objArr = this.d;
                if (objArr.length != 2) {
                    return new znc(this.a ^ o, this.b, nae.h(f, objArr), null);
                }
            } else {
                return this;
            }
        } else if (i(o)) {
            int t = t(o);
            znc s = s(t);
            if (i2 == 30) {
                ry5 D = dce.D(dce.F(0, s.d.length), 2);
                int i3 = D.a;
                int i4 = D.b;
                int i5 = D.c;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!c16.i(obj, s.d[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    Object[] objArr2 = s.d;
                    if (objArr2.length == 2) {
                        v = null;
                    } else {
                        v = new znc(0, 0, nae.h(i3, objArr2), null);
                    }
                }
                v = s;
                break;
            }
            v = s.v(i, obj, i2 + 5);
            if (v == null) {
                Object[] objArr3 = this.d;
                if (objArr3.length != 1) {
                    return new znc(this.a, this.b ^ o, nae.i(t, objArr3), null);
                }
            } else if (s != v) {
                return w(t, o, v);
            } else {
                return this;
            }
        } else {
            return this;
        }
        return null;
    }

    public final znc w(int i, int i2, znc zncVar) {
        Object[] objArr = zncVar.d;
        if (objArr.length == 2 && zncVar.b == 0) {
            if (this.d.length == 1) {
                zncVar.a = this.b;
                return zncVar;
            }
            int f = f(i2);
            Object[] objArr2 = this.d;
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + 1);
            b00.W(i + 2, i + 1, objArr2.length, copyOf, copyOf);
            b00.W(f + 2, f, i, copyOf, copyOf);
            copyOf[f] = obj;
            copyOf[f + 1] = obj2;
            return new znc(this.a ^ i2, this.b ^ i2, copyOf, null);
        }
        Object[] objArr3 = this.d;
        Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length);
        copyOf2[i] = zncVar;
        return new znc(this.a, this.b, copyOf2, null);
    }

    public final Object x(int i) {
        return this.d[i + 1];
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.mozilla.javascript.Parser;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ad7  reason: default package */
/* loaded from: classes.dex */
public abstract class ad7 {
    public final kj a;
    public final int b;
    public final int c;
    public final gd7 d;
    public final fl8 e;
    public final Map f;
    public final int g;
    public final v56 h;
    public final gr2 i;
    public final mfb j;
    public ArrayList k;
    public final ArrayList l;

    public ad7(kj kjVar, bd7 bd7Var, int i, int i2) {
        v56 v56Var;
        gr2 tw8Var;
        this.a = kjVar;
        this.b = i;
        this.c = i2;
        gd7 gd7Var = bd7Var.b;
        this.d = gd7Var;
        fl8 fl8Var = bd7Var.a;
        this.e = fl8Var;
        this.f = bd7Var.c;
        this.g = gd7Var.o;
        int i3 = gd7Var.d;
        if (i3 != 1252) {
            if (i3 != 65001) {
                v56Var = fd1.b;
            } else {
                v56Var = fd1.b;
            }
        } else {
            v56Var = fd1.o;
        }
        this.h = v56Var;
        int i4 = fl8Var.a;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 17480) {
                    tw8Var = new ljc(this, gd7Var);
                } else {
                    xk5.p(v56Var, "unknown compression ");
                    throw null;
                }
            } else {
                tw8Var = new jt1(Math.max(4096, fl8Var.c), 4);
            }
        } else {
            tw8Var = new tw8(0);
        }
        this.i = tw8Var;
        this.j = new mfb(new u76(this, 7));
        this.l = new ArrayList();
        int i5 = fl8Var.b;
        int i6 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            i6 += e(i7).length;
            this.l.add(Integer.valueOf(i6));
        }
    }

    public static final uw7 c(HashMap hashMap, uw7 uw7Var) {
        ArrayList arrayList;
        if (uw7Var.h == null) {
            return uw7Var;
        }
        ArrayList arrayList2 = (ArrayList) hashMap.get(Integer.valueOf(uw7Var.a));
        if (arrayList2 != null) {
            arrayList = new ArrayList(tl1.s(arrayList2, 10));
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                uw7 uw7Var2 = (uw7) obj;
                c(hashMap, uw7Var2);
                arrayList.add(uw7Var2);
            }
        } else {
            arrayList = null;
        }
        uw7Var.j = arrayList;
        return uw7Var;
    }

    public static wu5 f(u01 u01Var) {
        String f = u01Var.f(0, 4);
        if (f.equals("INDX")) {
            return new wu5(f, u01Var.k(4), u01Var.k(8), u01Var.k(20), u01Var.k(24), u01Var.k(28), u01Var.k(32), u01Var.k(36), u01Var.k(40), u01Var.k(44), u01Var.k(48), u01Var.k(52));
        }
        vs.k("Invalid INDX record");
        return null;
    }

    public final wt5 a(int i) {
        int i2;
        Iterator it;
        u01 u01Var;
        ad7 ad7Var = this;
        u01 d = d(i);
        wu5 f = f(d);
        int i3 = f.e;
        int i4 = f.b;
        byte[] bArr = d.b;
        byte[] d0 = b00.d0(bArr, i4, bArr.length);
        int i5 = 0;
        u01 u01Var2 = new u01(d0, 0, (byte) 0);
        char c = 4;
        if (u01Var2.f(0, 4).equals("TAGX")) {
            int k = u01Var2.k(4);
            char c2 = '\b';
            int k2 = u01Var2.k(8);
            int i6 = (k - 12) / 4;
            ArrayList arrayList = new ArrayList();
            u01Var2.c = 12;
            int i7 = 0;
            while (i7 < i6) {
                int i8 = u01Var2.c;
                u01Var2.c = i8 + 1;
                int m = u01Var2.m(i8);
                int i9 = u01Var2.c;
                u01Var2.c = i9 + 1;
                int m2 = u01Var2.m(i9);
                int i10 = u01Var2.c;
                u01Var2.c = i10 + 1;
                int m3 = u01Var2.m(i10);
                int i11 = u01Var2.c;
                u01Var2.c = i11 + 1;
                arrayList.add(new gkb(m, m2, m3, u01Var2.m(i11)));
                i7++;
                c = c;
            }
            HashMap hashMap = new HashMap();
            int i12 = f.l;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                i2 = 1;
                if (i13 >= i12) {
                    break;
                }
                u01 d2 = ad7Var.d(i + i3 + i13 + 1);
                byte[] bArr2 = d2.b;
                int i15 = i5;
                while (i15 < bArr2.length) {
                    int min = Math.min(i15 + 4, bArr2.length);
                    int i16 = i5;
                    int i17 = i16;
                    for (int i18 = i15; i18 < min; i18++) {
                        byte b = bArr2[i18];
                        i16 = (i16 << 7) | (b & Byte.MAX_VALUE);
                        i17++;
                        if ((b & 128) == 0) {
                        }
                    }
                    int i19 = i16;
                    int i20 = i15 + i17;
                    v56 v56Var = ad7Var.h;
                    v56Var.getClass();
                    char c3 = c2;
                    hashMap.put(Integer.valueOf(i15 + i14), v56Var.a(d2.c(i20, i19)));
                    i15 = i20 + i19;
                    c2 = c3;
                    i5 = 0;
                }
                i14 += Parser.ARGC_LIMIT;
                i13++;
                i5 = 0;
            }
            ArrayList arrayList2 = new ArrayList();
            int i21 = 0;
            while (i21 < i3) {
                u01 d3 = ad7Var.d(i + 1 + i21);
                wu5 f2 = f(d3);
                int i22 = f2.e;
                int i23 = f2.d + 4;
                int[] iArr = new int[i22];
                for (int i24 = 0; i24 < i22; i24++) {
                    int i25 = (i24 * 2) + i23;
                    iArr[i24] = (d3.m(i25 + i2) | (d3.m(i25) << 8)) & 65535;
                }
                int i26 = 0;
                while (i26 < i22) {
                    int i27 = iArr[i26];
                    byte[] bArr3 = d3.b;
                    int m4 = d3.m(i27);
                    int i28 = i27 + i2;
                    String f3 = d3.f(i28, m4);
                    ArrayList arrayList3 = new ArrayList();
                    int i29 = i28 + m4;
                    int i30 = i29 + k2;
                    int size = arrayList.size();
                    int i31 = i3;
                    int i32 = 0;
                    int i33 = 0;
                    while (i32 < size) {
                        Object obj = arrayList.get(i32);
                        int i34 = i32 + 1;
                        int i35 = size;
                        gkb gkbVar = (gkb) obj;
                        int i36 = gkbVar.d;
                        int i37 = i21;
                        int i38 = gkbVar.b;
                        int i39 = i26;
                        int i40 = gkbVar.a;
                        int i41 = i22;
                        if (i36 == 1) {
                            i33++;
                        } else {
                            int m5 = d3.m(i29 + i33);
                            int i42 = gkbVar.c;
                            int i43 = m5 & i42;
                            if (i43 == i42) {
                                if (Integer.bitCount(i42) > 1) {
                                    int min2 = Math.min(i30 + 4, bArr3.length);
                                    int i44 = i30;
                                    int i45 = 0;
                                    while (i30 < min2) {
                                        int i46 = min2;
                                        byte b2 = bArr3[i30];
                                        i45 = (i45 << 7) | (b2 & Byte.MAX_VALUE);
                                        i44++;
                                        if ((b2 & 128) != 0) {
                                            break;
                                        }
                                        i30++;
                                        min2 = i46;
                                    }
                                    arrayList3.add(new r99(i40, i38, null, Integer.valueOf(i45)));
                                    i30 = i44;
                                } else {
                                    arrayList3.add(new r99(i40, i38, 1, null));
                                }
                            } else {
                                while ((i42 & 1) == 0) {
                                    i42 >>= 1;
                                    i43 >>= 1;
                                }
                                arrayList3.add(new r99(i40, i38, Integer.valueOf(i43), null));
                            }
                        }
                        i32 = i34;
                        size = i35;
                        i21 = i37;
                        i26 = i39;
                        i22 = i41;
                    }
                    int i47 = i21;
                    int i48 = i26;
                    int i49 = i22;
                    ArrayList arrayList4 = new ArrayList();
                    HashMap hashMap2 = new HashMap();
                    Iterator it2 = arrayList3.iterator();
                    it2.getClass();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        next.getClass();
                        r99 r99Var = (r99) next;
                        ArrayList arrayList5 = new ArrayList();
                        Integer num = r99Var.c;
                        if (num != null) {
                            int intValue = num.intValue() * r99Var.b;
                            int i50 = 0;
                            while (i50 < intValue) {
                                Iterator it3 = it2;
                                u01 u01Var3 = d3;
                                int min3 = Math.min(i30 + 4, bArr3.length);
                                int i51 = i30;
                                int i52 = 0;
                                while (i30 < min3) {
                                    int i53 = min3;
                                    byte b3 = bArr3[i30];
                                    i52 = (i52 << 7) | (b3 & Byte.MAX_VALUE);
                                    i51++;
                                    if ((b3 & 128) == 0) {
                                        i30++;
                                        min3 = i53;
                                    }
                                }
                                i30 = i51;
                                arrayList5.add(Integer.valueOf(i52));
                                i50++;
                                it2 = it3;
                                d3 = u01Var3;
                            }
                            it = it2;
                            u01Var = d3;
                        } else {
                            it = it2;
                            u01Var = d3;
                            int i54 = 0;
                            while (true) {
                                Integer num2 = r99Var.d;
                                num2.getClass();
                                if (i54 < num2.intValue()) {
                                    int min4 = Math.min(i30 + 4, bArr3.length);
                                    int i55 = i30;
                                    int i56 = 0;
                                    while (true) {
                                        int i57 = i54;
                                        if (i30 < min4) {
                                            byte b4 = bArr3[i30];
                                            i56 = (i56 << 7) | (b4 & Byte.MAX_VALUE);
                                            i55++;
                                            int i58 = i57 + 1;
                                            if ((b4 & 128) == 0) {
                                                i30++;
                                                i54 = i58;
                                            } else {
                                                i30 = i55;
                                                i54 = i58;
                                                break;
                                            }
                                        } else {
                                            i30 = i55;
                                            break;
                                        }
                                    }
                                    arrayList5.add(Integer.valueOf(i56));
                                }
                            }
                        }
                        int i59 = r99Var.a;
                        au5 au5Var = new au5(i59, arrayList5);
                        arrayList4.add(au5Var);
                        hashMap2.put(Integer.valueOf(i59), au5Var);
                        it2 = it;
                        d3 = u01Var;
                    }
                    arrayList2.add(new xt5(f3, arrayList4, hashMap2));
                    i26 = i48 + 1;
                    i2 = 1;
                    i3 = i31;
                    i21 = i47;
                    i22 = i49;
                }
                i21++;
                ad7Var = this;
            }
            return new wt5(arrayList2, hashMap);
        }
        vs.k("Invalid INDX record");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Integer] */
    public final ArrayList b() {
        Integer num;
        Integer num2;
        String str;
        Integer num3;
        ArrayList arrayList;
        Integer num4;
        Integer num5;
        Integer num6;
        int i = this.d.p;
        Throwable th = null;
        if (i == -1) {
            return null;
        }
        wt5 a = a(i);
        ArrayList arrayList2 = a.a;
        ArrayList arrayList3 = new ArrayList(tl1.s(arrayList2, 10));
        int size = arrayList2.size();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            int i5 = i3 + 1;
            int i6 = i4 + 1;
            if (i4 >= 0) {
                HashMap hashMap = ((xt5) obj).c;
                au5 au5Var = (au5) hashMap.get(1);
                if (au5Var != null) {
                    num = (Integer) sl1.f0(0, au5Var.b);
                } else {
                    num = th;
                }
                au5 au5Var2 = (au5) hashMap.get(2);
                if (au5Var2 != null) {
                    num2 = (Integer) sl1.f0(0, au5Var2.b);
                } else {
                    num2 = th;
                }
                au5 au5Var3 = (au5) hashMap.get(3);
                if (au5Var3 != null) {
                    str = (String) a.b.get(sl1.f0(0, au5Var3.b));
                } else {
                    str = th;
                }
                if (str == 0) {
                    str = "";
                }
                au5 au5Var4 = (au5) hashMap.get(4);
                if (au5Var4 != null) {
                    num3 = (Integer) sl1.f0(0, au5Var4.b);
                } else {
                    num3 = th;
                }
                au5 au5Var5 = (au5) hashMap.get(6);
                if (au5Var5 != null) {
                    arrayList = au5Var5.b;
                } else {
                    arrayList = th;
                }
                au5 au5Var6 = (au5) hashMap.get(21);
                if (au5Var6 != null) {
                    num4 = (Integer) sl1.f0(0, au5Var6.b);
                } else {
                    num4 = th;
                }
                au5 au5Var7 = (au5) hashMap.get(22);
                if (au5Var7 != null) {
                    num5 = (Integer) sl1.f0(0, au5Var7.b);
                } else {
                    num5 = th;
                }
                Throwable th2 = th;
                au5 au5Var8 = (au5) hashMap.get(23);
                if (au5Var8 != null) {
                    num6 = (Integer) sl1.f0(0, au5Var8.b);
                } else {
                    num6 = th2;
                }
                arrayList3.add(new uw7(i4, num, num2, str, num3, arrayList, num4, num5, num6));
                i3 = i5;
                i4 = i6;
                th = th2;
            } else {
                Throwable th3 = th;
                tl1.M();
                throw th3;
            }
        }
        HashMap hashMap2 = new HashMap();
        int size2 = arrayList3.size();
        int i7 = 0;
        while (i7 < size2) {
            Object obj2 = arrayList3.get(i7);
            i7++;
            uw7 uw7Var = (uw7) obj2;
            Integer num7 = uw7Var.g;
            if (num7 != null) {
                Object obj3 = hashMap2.get(num7);
                if (obj3 == null) {
                    obj3 = new ArrayList();
                    hashMap2.put(num7, obj3);
                }
                ((ArrayList) obj3).add(uw7Var);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size3 = arrayList3.size();
        int i8 = 0;
        while (i8 < size3) {
            Object obj4 = arrayList3.get(i8);
            i8++;
            Integer num8 = ((uw7) obj4).e;
            if (num8 != null && num8.intValue() == 0) {
                arrayList4.add(obj4);
            }
        }
        ArrayList arrayList5 = new ArrayList(tl1.s(arrayList4, 10));
        int size4 = arrayList4.size();
        while (i2 < size4) {
            Object obj5 = arrayList4.get(i2);
            i2++;
            uw7 uw7Var2 = (uw7) obj5;
            c(hashMap2, uw7Var2);
            arrayList5.add(uw7Var2);
        }
        return arrayList5;
    }

    public final u01 d(int i) {
        return this.a.s(this.b + i);
    }

    public final byte[] e(int i) {
        boolean z;
        if (i < 0 && i >= this.e.b) {
            cy7.k("Text record index out of bounds");
            return null;
        }
        byte[] bArr = d(i + 1).b;
        int i2 = this.g;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            int bitCount = Integer.bitCount(i2 >> 1);
            bArr.getClass();
            int length = bArr.length;
            int i3 = length - 1;
            int i4 = 0;
            for (int i5 = 0; i5 < bitCount; i5++) {
                int max = Math.max(0, (length - 5) - i4);
                int max2 = Math.max(0, i3 - i4);
                int i6 = 0;
                if (max <= max2) {
                    while (true) {
                        byte b = bArr[max];
                        if ((b & 128) != 0) {
                            i6 = 0;
                        }
                        i6 = (i6 << 7) | (b & Byte.MAX_VALUE);
                        if (max != max2) {
                            max++;
                        }
                    }
                }
                i4 += i6;
            }
            if (z) {
                i4 += ((byte) (bArr[(bArr.length - 1) - i4] & 3)) + 1;
            }
            bArr = b00.d0(bArr, 0, bArr.length - i4);
        }
        return this.i.e(bArr);
    }

    public final void finalize() {
    }
}

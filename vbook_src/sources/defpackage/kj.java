package defpackage;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kj  reason: default package */
/* loaded from: classes.dex */
public final class kj implements bl0 {
    public int a;
    public Object b;
    public Object c;

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d7, code lost:
        if (r9 == null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public kj(defpackage.ty5 r13, defpackage.npe r14) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kj.<init>(ty5, npe):void");
    }

    public static int y(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int i4 = ((ak6) list.get(i3)).a - i;
            if (i4 < 0) {
                i2 = i3 + 1;
            } else if (i4 > 0) {
                size = i3 - 1;
            } else {
                return i3;
            }
        }
        return -(i2 + 1);
    }

    public void A(int i, int i2, int i3, long j) {
        int i4;
        long j2;
        char c;
        int i5;
        char c2 = '2';
        if ((((int) (j >> 50)) & 1023) > 0) {
            int i6 = tk9.b;
            long j3 = -1125899873288193L;
            int i7 = 33554431;
            char c3 = 25;
            long[] jArr = (long[]) this.b;
            long[] jArr2 = (long[]) this.c;
            int i8 = this.a;
            jArr2[0] = (j & (-1125899873288193L)) | ((i & 33554431) << 25);
            int i9 = 1;
            while (i9 > 0) {
                i9--;
                long j4 = jArr2[i9];
                int i10 = ((int) j4) & i7;
                int i11 = ((int) (j4 >> c3)) & i7;
                int i12 = ((int) (j4 >> c2)) & 1023;
                if (i12 == 1023) {
                    i4 = i8;
                } else {
                    i4 = (i12 * 3) + i11;
                }
                if (i11 >= 0) {
                    while (i11 < i8 - 2 && i11 <= i4) {
                        int i13 = i11 + 2;
                        long j5 = jArr[i13];
                        char c4 = c2;
                        int i14 = i7;
                        if ((((int) (j5 >> c3)) & i14) == i10) {
                            long j6 = jArr[i11];
                            int i15 = i11 + 1;
                            j2 = j3;
                            long j7 = jArr[i15];
                            c = c3;
                            i5 = i4;
                            jArr[i11] = ((((int) j6) + i3) & 4294967295L) | ((((int) (j6 >> 32)) + i2) << 32);
                            jArr[i15] = ((((int) j7) + i3) & 4294967295L) | ((((int) (j7 >> 32)) + i2) << 32);
                            jArr[i13] = (((j5 >> 63) & 1) << 60) | j5;
                            if ((((int) (j5 >> c4)) & 1023) > 0) {
                                int i16 = tk9.b;
                                jArr2[i9] = (j5 & j2) | (((i11 + 3) & i14) << c);
                                i9++;
                            }
                        } else {
                            j2 = j3;
                            c = c3;
                            i5 = i4;
                        }
                        i11 += 3;
                        i4 = i5;
                        c3 = c;
                        i7 = i14;
                        c2 = c4;
                        j3 = j2;
                    }
                    c3 = c3;
                    i7 = i7;
                    c2 = c2;
                    j3 = j3;
                } else {
                    return;
                }
            }
        }
    }

    public void B(String str, Object... objArr) {
        if (this.a <= 2) {
            Log.v((String) this.b, k(str, objArr));
        }
    }

    public void C(String str, mn6 mn6Var) {
        Map map = (Map) this.b;
        if (!map.containsKey(str)) {
            map.put(str, mn6Var);
            if (this.a > 0) {
                new ovd(Looper.getMainLooper(), 4).post(new gp9(3, this, mn6Var, str));
                return;
            }
            return;
        }
        vs.m(nk2.v(new StringBuilder(str.length() + 59), "LifecycleCallback with tag ", str, " already added to this fragment."));
    }

    public void D(Bundle bundle) {
        Bundle bundle2;
        this.a = 1;
        this.c = bundle;
        for (Map.Entry entry : ((Map) this.b).entrySet()) {
            mn6 mn6Var = (mn6) entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle((String) entry.getKey());
            } else {
                bundle2 = null;
            }
            mn6Var.onCreate(bundle2);
        }
    }

    public byte[] E() {
        g9e g9eVar;
        e78 e78Var;
        lh9 lh9Var = lh9.K;
        odd oddVar = (odd) this.b;
        ((zm9) this.c).i = false;
        zm9 zm9Var = (zm9) this.c;
        zm9Var.g = Boolean.FALSE;
        oddVar.b = new rxe(zm9Var);
        try {
            r0f.F();
            ite iteVar = new ite(oddVar);
            yx9 yx9Var = new yx9(23, (byte) 0);
            lh9Var.t(yx9Var);
            HashMap hashMap = new HashMap((HashMap) yx9Var.b);
            HashMap hashMap2 = new HashMap((HashMap) yx9Var.c);
            s8e s8eVar = (s8e) yx9Var.d;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                g9eVar = new g9e(byteArrayOutputStream, hashMap, hashMap2, s8eVar);
                e78Var = (e78) hashMap.get(ite.class);
            } catch (IOException unused) {
            }
            if (e78Var != null) {
                e78Var.a(iteVar, g9eVar);
                return byteArrayOutputStream.toByteArray();
            }
            throw new RuntimeException("No encoder for ".concat(String.valueOf(ite.class)));
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }

    public void F(Bundle bundle) {
        if (bundle != null) {
            for (Map.Entry entry : ((Map) this.b).entrySet()) {
                Bundle bundle2 = new Bundle();
                ((mn6) entry.getValue()).onSaveInstanceState(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    @Override // defpackage.bl0
    public al0 a(s94 s94Var, long j) {
        long j2;
        long position = s94Var.getPosition();
        int min = (int) Math.min(112800L, s94Var.getLength() - position);
        km8 km8Var = (km8) this.c;
        km8Var.J(min);
        s94Var.x(km8Var.a, 0, min);
        int i = km8Var.c;
        long j3 = -1;
        long j4 = -1;
        long j5 = -9223372036854775807L;
        while (true) {
            if (km8Var.a() >= 188) {
                byte[] bArr = km8Var.a;
                int i2 = km8Var.b;
                while (true) {
                    if (i2 < i) {
                        j2 = -9223372036854775807L;
                        if (bArr[i2] == 71) {
                            break;
                        }
                        i2++;
                    } else {
                        j2 = -9223372036854775807L;
                        break;
                    }
                }
                int i3 = i2 + 188;
                if (i3 > i) {
                    break;
                }
                long m = pae.m(km8Var, i2, this.a);
                if (m != j2) {
                    long b = ((lac) this.b).b(m);
                    if (b > j) {
                        if (j5 == j2) {
                            return new al0(b, position, -1);
                        }
                        return new al0(-9223372036854775807L, position + j4, 0);
                    }
                    j5 = b;
                    if (100000 + j5 > j) {
                        return new al0(-9223372036854775807L, position + i2, 0);
                    }
                    j4 = i2;
                }
                km8Var.M(i3);
                j3 = i3;
            } else {
                j2 = -9223372036854775807L;
                break;
            }
        }
        if (j5 != j2) {
            return new al0(j5, position + j3, -2);
        }
        return al0.d;
    }

    public void b(int i, ih6 ih6Var) {
        if (i < 0) {
            ov5.a("size should be >=0");
        }
        if (i == 0) {
            return;
        }
        q06 q06Var = new q06(this.a, i, ih6Var);
        this.a += i;
        ((gw7) this.b).b(q06Var);
    }

    public boolean c(int i, int i2) {
        int q = q(i);
        if (q != i2 && q != -1 && q != -2) {
            return false;
        }
        return true;
    }

    public rm9 d(boolean z) {
        rs5 rs5Var;
        rs5 rs5Var2;
        if (z && (rs5Var2 = (rs5) this.c) != null) {
            throw rs5Var2.a();
        }
        rm9 c = rm9.c(this.a, (Object[]) this.b, this);
        if (z && (rs5Var = (rs5) this.c) != null) {
            throw rs5Var.a();
        }
        return c;
    }

    public void e(String str, Exception exc, Object... objArr) {
        Log.e((String) this.b, k(str, objArr), exc);
    }

    @Override // defpackage.bl0
    public void f() {
        km8 km8Var = (km8) this.c;
        byte[] bArr = a2d.b;
        km8Var.getClass();
        km8Var.K(bArr, bArr.length);
    }

    public void g(String str, Object... objArr) {
        Log.e((String) this.b, k(str, objArr));
    }

    public void h(int i, int i2) {
        if (i > 131072) {
            ov5.a("Requested item capacity " + i + " is larger than max supported: 131072!");
        }
        int[] iArr = (int[]) this.b;
        if (iArr.length < i) {
            int length = iArr.length;
            while (length < i) {
                length *= 2;
            }
            int[] iArr2 = new int[length];
            b00.Z(i2, 0, 12, (int[]) this.b, iArr2);
            this.b = iArr2;
        }
    }

    public void i(int i) {
        rz rzVar = (rz) this.c;
        int i2 = this.a;
        int i3 = i - i2;
        if (i3 >= 0 && i3 < 131072) {
            h(i3 + 1, 0);
        } else {
            int max = Math.max(i - (((int[]) this.b).length / 2), 0);
            this.a = max;
            int i4 = max - i2;
            int[] iArr = (int[]) this.b;
            if (i4 >= 0) {
                if (i4 < iArr.length) {
                    b00.V(0, i4, iArr.length, iArr, iArr);
                }
                int[] iArr2 = (int[]) this.b;
                Arrays.fill(iArr2, Math.max(0, iArr2.length - i4), ((int[]) this.b).length, 0);
            } else {
                int i5 = -i4;
                if (iArr.length + i5 < 131072) {
                    h(iArr.length + i5 + 1, i5);
                } else {
                    if (i5 < iArr.length) {
                        b00.V(i5, 0, iArr.length - i5, iArr, iArr);
                    }
                    int[] iArr3 = (int[]) this.b;
                    Arrays.fill(iArr3, 0, Math.min(iArr3.length, i5), 0);
                }
            }
        }
        while (!rzVar.isEmpty() && ((ak6) rzVar.first()).a < this.a) {
            rzVar.removeFirst();
        }
        while (!rzVar.isEmpty() && ((ak6) rzVar.last()).a > this.a + ((int[]) this.b).length) {
            rzVar.removeLast();
        }
    }

    public int j(int i, int i2) {
        while (true) {
            i--;
            if (-1 >= i) {
                return -1;
            }
            if (c(i, i2)) {
                return i;
            }
        }
    }

    public String k(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return ((String) this.c).concat(str);
    }

    public q06 l(int i) {
        if (i < 0 || i >= this.a) {
            int i2 = this.a;
            ov5.e("Index " + i + ", size " + i2);
        }
        q06 q06Var = (q06) this.c;
        if (q06Var != null) {
            int i3 = q06Var.a;
            if (i < q06Var.b + i3 && i3 <= i) {
                return q06Var;
            }
        }
        gw7 gw7Var = (gw7) this.b;
        q06 q06Var2 = (q06) gw7Var.a[yz1.f(i, gw7Var)];
        this.c = q06Var2;
        return q06Var2;
    }

    public Object m(int i) {
        SparseArray sparseArray = (SparseArray) this.b;
        if (this.a == -1) {
            this.a = 0;
        }
        while (true) {
            int i2 = this.a;
            if (i2 <= 0 || i >= sparseArray.keyAt(i2)) {
                break;
            }
            this.a--;
        }
        while (this.a < sparseArray.size() - 1 && i >= sparseArray.keyAt(this.a + 1)) {
            this.a++;
        }
        return sparseArray.valueAt(this.a);
    }

    public int[] n(int i) {
        rz rzVar = (rz) this.c;
        ak6 ak6Var = (ak6) sl1.f0(y(i, rzVar), rzVar);
        if (ak6Var != null) {
            return ak6Var.b;
        }
        return null;
    }

    public int o(Object obj) {
        gv7 gv7Var = (gv7) this.b;
        int d = gv7Var.d(obj);
        if (d >= 0) {
            return gv7Var.c[d];
        }
        return -1;
    }

    public Object p(int i) {
        Object[] objArr = (Object[]) this.c;
        int i2 = i - this.a;
        if (i2 >= 0 && i2 < objArr.length) {
            return objArr[i2];
        }
        return null;
    }

    public int q(int i) {
        int i2 = this.a;
        if (i >= i2) {
            int[] iArr = (int[]) this.b;
            if (i < iArr.length + i2) {
                return iArr[i - i2] - 1;
            }
            return -1;
        }
        return -1;
    }

    public uk8 r(int i) {
        try {
            List list = (List) ((mfb) this.c).getValue();
            if (!list.isEmpty() && i < list.size()) {
                return new uk8(i, (List) list.get(i), list.size());
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public u01 s(int i) {
        int length;
        u01 u01Var = (u01) this.b;
        int i2 = this.a;
        if (i >= 0 && i < i2) {
            int[] iArr = (int[]) this.c;
            int i3 = i + 1;
            if (i3 >= 0 && i3 < iArr.length) {
                length = iArr[i3];
            } else {
                length = u01Var.b.length;
            }
            int i4 = iArr[i];
            return new u01(u01Var.c(i4, length - i4), 0, (byte) 0);
        }
        cy7.k(rs8.k("Record index ", i, i2, " out of bounds, record count "));
        return null;
    }

    public int t(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, boolean z2, boolean z3) {
        Object[] objArr;
        int i8 = i & 33554431;
        long[] jArr = (long[]) this.b;
        int i9 = this.a;
        int i10 = i9 + 3;
        this.a = i10;
        int length = jArr.length;
        if (length <= i10) {
            int max = Math.max(length * 2, i10);
            this.b = Arrays.copyOf(jArr, max);
            this.c = Arrays.copyOf((long[]) this.c, max);
        }
        long[] jArr2 = (long[]) this.b;
        jArr2[i9] = (i2 << 32) | (i3 & 4294967295L);
        jArr2[i9 + 1] = (i4 << 32) | (i5 & 4294967295L);
        boolean z4 = false;
        int i11 = i6 & 33554431;
        jArr2[i9 + 2] = ((z3 ? 1L : 0L) << 63) | ((z2 ? 1L : 0L) << 62) | ((z ? 1L : 0L) << 61) | 1152921504606846976L | (Math.min(0, 1023) << 50) | (i11 << 25) | (i & 33554431);
        if (i6 == -1) {
            return i9;
        }
        if (i7 != -4) {
            objArr = 1;
        } else {
            objArr = null;
        }
        if (objArr == null) {
            lv5.c("Inserted child " + i8 + " without valid parent index");
        }
        int i12 = i7 + 2;
        long j = jArr2[i12];
        if ((33554431 & ((int) j)) == i11) {
            z4 = true;
        }
        if (!z4) {
            lv5.c("Inserted child " + i8 + " without valid parent index or parent " + i11 + " not found");
        }
        int i13 = tk9.b;
        jArr2[i12] = ((-1151795604700004353L) & j) | (Math.min((i9 - i7) / 3, 1023) << 50);
        return i9;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object u(int r5, defpackage.n42 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.uo1
            if (r0 == 0) goto L13
            r0 = r6
            uo1 r0 = (defpackage.uo1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            uo1 r0 = new uo1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.c
            int r1 = r0.e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L30
            if (r1 != r2) goto L2a
            int r5 = r0.a
            sw7 r0 = r0.b
            defpackage.hre.r(r6)
            goto L47
        L2a:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            return r3
        L30:
            defpackage.hre.r(r6)
            java.lang.Object r6 = r4.b
            sw7 r6 = (defpackage.sw7) r6
            r0.b = r6
            r0.a = r5
            r0.e = r2
            java.lang.Object r0 = r6.o(r0)
            n82 r1 = defpackage.n82.a
            if (r0 != r1) goto L46
            return r1
        L46:
            r0 = r6
        L47:
            java.lang.Object r4 = r4.c     // Catch: java.lang.Throwable -> L5b
            java.util.Set r4 = (java.util.Set) r4     // Catch: java.lang.Throwable -> L5b
            java.util.Collection r4 = (java.util.Collection) r4     // Catch: java.lang.Throwable -> L5b
            java.lang.Integer r6 = new java.lang.Integer     // Catch: java.lang.Throwable -> L5b
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L5b
            r4.remove(r6)     // Catch: java.lang.Throwable -> L5b
            r0.q(r3)
            pvc r4 = defpackage.pvc.a
            return r4
        L5b:
            r4 = move-exception
            r0.q(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kj.u(int, n42):java.lang.Object");
    }

    public void v(Object obj, Object obj2) {
        int i = (this.a + 1) * 2;
        Object[] objArr = (Object[]) this.b;
        if (i > objArr.length) {
            this.b = Arrays.copyOf(objArr, hs5.e(objArr.length, i));
        }
        kue.d(obj, obj2);
        Object[] objArr2 = (Object[]) this.b;
        int i2 = this.a;
        int i3 = i2 * 2;
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        this.a = i2 + 1;
    }

    public void w(Set set) {
        if (set instanceof Collection) {
            int size = (set.size() + this.a) * 2;
            Object[] objArr = (Object[]) this.b;
            if (size > objArr.length) {
                this.b = Arrays.copyOf(objArr, hs5.e(objArr.length, size));
            }
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            v(entry.getKey(), entry.getValue());
        }
    }

    public void x() {
        b00.h0(0, 0, 6, (int[]) this.b);
        ((rz) this.c).clear();
    }

    public void z(int i, int i2) {
        if (i < 0) {
            ov5.a("Negative lanes are not supported");
        }
        i(i);
        ((int[]) this.b)[i - this.a] = i2 + 1;
    }

    public kj(String str, String... strArr) {
        String sb;
        if (strArr.length == 0) {
            sb = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str2 : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
            sb2.append("] ");
            sb = sb2.toString();
        }
        this.c = sb;
        this.b = str;
        int length = str.length();
        Object[] objArr = {str, 23};
        if (length <= 23) {
            int i = 2;
            while (i <= 7 && !Log.isLoggable((String) this.b, i)) {
                i++;
            }
            this.a = i;
            return;
        }
        throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.Map, jla] */
    public kj(int i, boolean z) {
        switch (i) {
            case 8:
                this.b = new gw7(new q06[16], 0);
                return;
            case 10:
                this.b = new int[]{0, 0, 0, 0, 0, 0, 0};
                this.c = new HashMap();
                return;
            case 16:
                this.b = new Object[2];
                this.c = new Object();
                return;
            case 18:
                this.b = Collections.synchronizedMap(new jla(0));
                this.a = 0;
                return;
            default:
                this.b = new int[16];
                this.c = new rz();
                return;
        }
    }

    public kj(int i, yh8 yh8Var) {
        this.a = i;
        this.b = yh8Var;
        this.c = new mfb(new u76(this, 22));
    }

    public kj(odd oddVar, int i) {
        this.c = new Object();
        this.b = oddVar;
        r0f.F();
        this.a = i;
    }

    public kj(int i) {
        this.b = new Object[i * 2];
        this.a = 0;
    }

    public kj(vq4 vq4Var, int i, String str) {
        this.b = vq4Var;
        this.a = i;
        this.c = str;
    }
}

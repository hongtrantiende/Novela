package defpackage;

import android.graphics.Point;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jt1  reason: default package */
/* loaded from: classes.dex */
public final class jt1 implements g06, gr2, ura, i0f, x00 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;

    public jt1(int i, byte b) {
        this.a = i;
        switch (i) {
            case 12:
                this.c = new ArrayList();
                this.b = Token.CASE;
                return;
            case 13:
            default:
                this.c = new LinkedHashMap();
                return;
            case 14:
                this.c = new km8(8);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x01df, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r2.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0288  */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [s6f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [s6f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [s6f, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.jt1 f(android.content.res.Resources r29, int r30, android.content.res.Resources.Theme r31) {
        /*
            Method dump skipped, instructions count: 770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jt1.f(android.content.res.Resources, int, android.content.res.Resources$Theme):jt1");
    }

    public Object a() {
        Object[] objArr = (Object[]) this.c;
        int i = this.b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object obj = objArr[i2];
        obj.getClass();
        objArr[i2] = null;
        this.b--;
        return obj;
    }

    @Override // defpackage.i0f
    public byte[] b(int i, byte[] bArr, byte[] bArr2) {
        byte[] G;
        byte[] c;
        switch (this.a) {
            case 17:
                bie bieVar = (bie) this.c;
                if (bArr2.length >= i) {
                    byte[] copyOfRange = Arrays.copyOfRange(bArr2, i, bArr2.length);
                    byte[] copyOf = Arrays.copyOf(bArr, bieVar.a);
                    int i2 = bieVar.a;
                    byte[] copyOfRange2 = Arrays.copyOfRange(bArr, i2, bieVar.b + i2);
                    odd oddVar = new odd(9, false);
                    oddVar.c = null;
                    oddVar.d = null;
                    oddVar.e = null;
                    oddVar.b = bieVar;
                    oddVar.c = new xk9(hlf.a(copyOf), 26);
                    oddVar.d = new xk9(hlf.a(copyOfRange2), 26);
                    return fkf.c(oddVar.f()).a(copyOfRange, v9e.c);
                }
                hfd.j("ciphertext too short");
                return null;
            default:
                if (bArr2.length >= i) {
                    byte[] copyOfRange3 = Arrays.copyOfRange(bArr2, i, bArr2.length);
                    jje jjeVar = new jje(4);
                    jjeVar.c = null;
                    jjeVar.d = null;
                    jjeVar.b = (lwe) this.c;
                    jjeVar.c = new xk9(hlf.a(bArr), 26);
                    uve d = jjeVar.d();
                    rjf rjfVar = new rjf(((hlf) d.g.b).b(), d.h);
                    byte[][] bArr3 = {v9e.c};
                    int length = copyOfRange3.length;
                    byte[] bArr4 = rjfVar.c;
                    if (length >= bArr4.length + 16) {
                        if (k7f.b(bArr4, copyOfRange3)) {
                            Cipher cipher = (Cipher) rjf.f.get();
                            byte[] copyOfRange4 = Arrays.copyOfRange(copyOfRange3, bArr4.length, bArr4.length + 16);
                            byte[] bArr5 = (byte[]) copyOfRange4.clone();
                            bArr5[8] = (byte) (bArr5[8] & Byte.MAX_VALUE);
                            bArr5[12] = (byte) (bArr5[12] & Byte.MAX_VALUE);
                            cipher.init(2, new SecretKeySpec(rjfVar.b, "AES"), new IvParameterSpec(bArr5));
                            int length2 = bArr4.length + 16;
                            int length3 = copyOfRange3.length - length2;
                            byte[] doFinal = cipher.doFinal(copyOfRange3, length2, length3);
                            if (length3 == 0 && doFinal == null && "The Android Project".equals(System.getProperty("java.vendor"))) {
                                doFinal = new byte[0];
                            }
                            byte[][] bArr6 = (byte[][]) Arrays.copyOf(bArr3, 2);
                            bArr6[1] = doFinal;
                            int length4 = bArr6.length;
                            s9f s9fVar = rjfVar.a;
                            if (length4 == 0) {
                                c = s9fVar.c(rjf.e, 16);
                            } else {
                                byte[] c2 = s9fVar.c(rjf.d, 16);
                                for (int i3 = 0; i3 < bArr6.length - 1; i3++) {
                                    byte[] bArr7 = bArr6[i3];
                                    if (bArr7 == null) {
                                        bArr7 = new byte[0];
                                    }
                                    c2 = yqe.G(ipe.F(c2), s9fVar.c(bArr7, 16));
                                }
                                byte[] bArr8 = bArr6[bArr6.length - 1];
                                if (bArr8.length >= 16) {
                                    if (bArr8.length >= c2.length) {
                                        int length5 = bArr8.length - c2.length;
                                        G = Arrays.copyOf(bArr8, bArr8.length);
                                        for (int i4 = 0; i4 < c2.length; i4++) {
                                            int i5 = length5 + i4;
                                            G[i5] = (byte) (G[i5] ^ c2[i4]);
                                        }
                                    } else {
                                        vs.m("xorEnd requires a.length >= b.length");
                                        return null;
                                    }
                                } else if (bArr8.length < 16) {
                                    byte[] copyOf2 = Arrays.copyOf(bArr8, 16);
                                    copyOf2[bArr8.length] = Byte.MIN_VALUE;
                                    G = yqe.G(copyOf2, ipe.F(c2));
                                } else {
                                    vs.m("x must be smaller than a block.");
                                    return null;
                                }
                                c = s9fVar.c(G, 16);
                            }
                            if (MessageDigest.isEqual(copyOfRange4, c)) {
                                return doFinal;
                            }
                            throw new AEADBadTagException("Integrity check failed.");
                        }
                        hfd.j("Decryption failed (OutputPrefix mismatch).");
                        return null;
                    }
                    hfd.j("Ciphertext too short.");
                    return null;
                }
                hfd.j("ciphertext too short");
                return null;
        }
    }

    @Override // defpackage.g06
    public void c(char c) {
        h(this.b, 1);
        int i = this.b;
        this.b = i + 1;
        ((char[]) this.c)[i] = c;
    }

    @Override // defpackage.x00
    public /* synthetic */ ListenableFuture call() {
        return ((yv) this.c).U(this.b);
    }

    public void d() {
        ml5 ml5Var;
        int i = this.b;
        this.b = i + 1;
        if (i >= 10) {
            this.b = 0;
            Iterator it = ((LinkedHashMap) this.c).values().iterator();
            while (it.hasNext()) {
                ArrayList arrayList = (ArrayList) it.next();
                if (arrayList.size() <= 1) {
                    zj9 zj9Var = (zj9) sl1.e0(arrayList);
                    if (zj9Var != null) {
                        ml5Var = (ml5) zj9Var.a.get();
                    } else {
                        ml5Var = null;
                    }
                    if (ml5Var == null) {
                        it.remove();
                    }
                } else {
                    int size = arrayList.size();
                    int i2 = 0;
                    for (int i3 = 0; i3 < size; i3++) {
                        int i4 = i3 - i2;
                        if (((zj9) arrayList.get(i4)).a.get() == null) {
                            arrayList.remove(i4);
                            i2++;
                        }
                    }
                    if (arrayList.isEmpty()) {
                        it.remove();
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // defpackage.gr2
    public byte[] e(byte[] bArr) {
        byte[] bArr2;
        bArr.getClass();
        kj kjVar = (kj) this.c;
        synchronized (kjVar.c) {
            int i = kjVar.a;
            bArr2 = null;
            if (i > 0) {
                int i2 = i - 1;
                ?? r5 = (Object[]) kjVar.b;
                ?? r6 = r5[i2];
                r5[i2] = 0;
                kjVar.a = i - 1;
                bArr2 = r6;
            }
        }
        byte[] bArr3 = bArr2;
        if (bArr3 == null) {
            bArr3 = new byte[this.b];
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < bArr.length) {
            int i5 = i3 + 1;
            int i6 = bArr[i3] & 255;
            if (1 <= i6 && i6 < 9) {
                int i7 = 0;
                while (i7 < i6) {
                    int i8 = i5 + i7;
                    if (i8 >= bArr.length) {
                        break;
                    }
                    bArr3[i4] = bArr[i8];
                    i7++;
                    i4++;
                }
                i3 = i5 + i6;
            } else {
                if (i6 <= 127) {
                    bArr3[i4] = (byte) i6;
                    i4++;
                } else if (i6 >= 192) {
                    int i9 = i4 + 1;
                    bArr3[i4] = 32;
                    i4 += 2;
                    bArr3[i9] = (byte) (i6 ^ Token.CASE);
                } else if (i5 < bArr.length) {
                    i3 += 2;
                    int i10 = (bArr[i5] & 255) | (i6 << 8);
                    int i11 = (i10 & 7) + 3;
                    int i12 = (i10 >> 3) & 2047;
                    if (1 <= i12 && i12 <= i4) {
                        int i13 = 0;
                        while (i13 < i11) {
                            bArr3[i4] = bArr3[i4 - i12];
                            i13++;
                            i4++;
                        }
                    }
                }
                i3 = i5;
            }
        }
        byte[] bArr4 = new byte[i4];
        b00.U(0, 0, i4, bArr3, bArr4);
        kj kjVar2 = (kj) this.c;
        synchronized (kjVar2.c) {
            ?? r2 = (Object[]) kjVar2.b;
            int i14 = kjVar2.a;
            for (int i15 = 0; i15 < i14; i15++) {
                if (r2[i15] == bArr3) {
                    throw new IllegalStateException("Already in the pool!");
                }
            }
            int i16 = kjVar2.a;
            if (i16 < r2.length) {
                r2[i16] = bArr3;
                kjVar2.a = i16 + 1;
            }
        }
        return bArr4;
    }

    @Override // defpackage.g06
    public void g(String str) {
        int i;
        str.getClass();
        h(this.b, str.length() + 2);
        char[] cArr = (char[]) this.c;
        int i2 = this.b;
        int i3 = i2 + 1;
        cArr[i2] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i3);
        int i4 = length + i3;
        int i5 = i3;
        while (i5 < i4) {
            char c = cArr[i5];
            byte[] bArr = w3b.b;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = str.length();
                for (int i6 = i5 - i3; i6 < length2; i6++) {
                    h(i5, 2);
                    char charAt = str.charAt(i6);
                    byte[] bArr2 = w3b.b;
                    if (charAt < bArr2.length) {
                        byte b = bArr2[charAt];
                        if (b == 0) {
                            i = i5 + 1;
                            ((char[]) this.c)[i5] = charAt;
                        } else {
                            if (b == 1) {
                                String str2 = w3b.a[charAt];
                                str2.getClass();
                                h(i5, str2.length());
                                str2.getChars(0, str2.length(), (char[]) this.c, i5);
                                int length3 = str2.length() + i5;
                                this.b = length3;
                                i5 = length3;
                            } else {
                                char[] cArr2 = (char[]) this.c;
                                cArr2[i5] = '\\';
                                cArr2[i5 + 1] = (char) b;
                                i5 += 2;
                                this.b = i5;
                            }
                        }
                    } else {
                        i = i5 + 1;
                        ((char[]) this.c)[i5] = charAt;
                    }
                    i5 = i;
                }
                h(i5, 1);
                ((char[]) this.c)[i5] = '\"';
                this.b = i5 + 1;
                return;
            }
            i5++;
        }
        cArr[i4] = '\"';
        this.b = i4 + 1;
    }

    public void h(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.c;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.c = Arrays.copyOf(cArr, i3);
        }
    }

    public void i(int i, e30 e30Var) {
        while (true) {
            int i2 = i >> 1;
            if (i2 == 0) {
                break;
            }
            e30 e30Var2 = ((e30[]) this.c)[i2];
            e30Var2.getClass();
            if (c16.m(0L, e30Var.g - e30Var2.g) <= 0) {
                break;
            }
            e30Var2.f = i;
            ((e30[]) this.c)[i] = e30Var2;
            i = i2;
        }
        ((e30[]) this.c)[i] = e30Var;
        e30Var.f = i;
    }

    @Override // defpackage.g06
    public void j(String str) {
        str.getClass();
        int length = str.length();
        if (length == 0) {
            return;
        }
        h(this.b, length);
        str.getChars(0, str.length(), (char[]) this.c, this.b);
        this.b += length;
    }

    public long k(tt2 tt2Var) {
        km8 km8Var = (km8) this.c;
        int i = 0;
        tt2Var.f(km8Var.a, 0, 1, false);
        int i2 = km8Var.a[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = Token.CASE;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        tt2Var.f(km8Var.a, 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (km8Var.a[i] & 255) + (i5 << 8);
        }
        this.b = i4 + 1 + this.b;
        return i5;
    }

    public void l(Object obj) {
        Object[] objArr = (Object[]) this.c;
        obj.getClass();
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == obj) {
                vs.k("Already in the pool!");
                return;
            }
        }
        int i3 = this.b;
        if (i3 < objArr.length) {
            objArr[i3] = obj;
            this.b = i3 + 1;
        }
    }

    public void m(e30 e30Var) {
        e30 e30Var2;
        int i = e30Var.f;
        if (i != -1) {
            int i2 = this.b;
            e30 e30Var3 = ((e30[]) this.c)[i2];
            e30Var3.getClass();
            e30Var.f = -1;
            ((e30[]) this.c)[i2] = null;
            this.b = i2 - 1;
            if (e30Var == e30Var3) {
                return;
            }
            int m = c16.m(0L, e30Var3.g - e30Var.g);
            if (m == 0) {
                ((e30[]) this.c)[i] = e30Var3;
                e30Var3.f = i;
                return;
            } else if (m < 0) {
                while (true) {
                    int i3 = i << 1;
                    int i4 = i3 + 1;
                    int i5 = this.b;
                    if (i4 <= i5) {
                        e30Var2 = ((e30[]) this.c)[i3];
                        e30Var2.getClass();
                        e30 e30Var4 = ((e30[]) this.c)[i4];
                        e30Var4.getClass();
                        if (c16.m(0L, e30Var4.g - e30Var2.g) >= 0) {
                            e30Var2 = e30Var4;
                        }
                    } else if (i3 > i5) {
                        break;
                    } else {
                        e30Var2 = ((e30[]) this.c)[i3];
                        e30Var2.getClass();
                    }
                    if (c16.m(0L, e30Var2.g - e30Var3.g) <= 0) {
                        break;
                    }
                    int i6 = e30Var2.f;
                    e30Var2.f = i;
                    ((e30[]) this.c)[i] = e30Var2;
                    i = i6;
                }
                ((e30[]) this.c)[i] = e30Var3;
                e30Var3.f = i;
                return;
            } else {
                i(i, e30Var3);
                return;
            }
        }
        vs.m("Failed requirement.");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n(defpackage.uy5 r17, defpackage.uy5 r18, float r19, defpackage.n42 r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            r2 = r20
            boolean r3 = r2 instanceof defpackage.nq8
            if (r3 == 0) goto L1a
            r3 = r2
            nq8 r3 = (defpackage.nq8) r3
            int r4 = r3.e
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1a
            int r4 = r4 - r5
            r3.e = r4
        L18:
            r14 = r3
            goto L20
        L1a:
            nq8 r3 = new nq8
            r3.<init>(r0, r2)
            goto L18
        L20:
            java.lang.Object r2 = r14.c
            int r3 = r14.e
            r4 = 1
            if (r3 == 0) goto L3c
            if (r3 != r4) goto L35
            uy5 r0 = r14.b
            uy5 r1 = r14.a
            defpackage.hre.r(r2)
            r15 = r1
            r1 = r0
            r0 = r15
            goto La5
        L35:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r0)
            r0 = 0
            return r0
        L3c:
            defpackage.hre.r(r2)
            int r2 = r17.e()
            float r2 = (float) r2
            float r2 = r2 * r19
            int r2 = (int) r2
            if (r2 >= r4) goto L4b
            r8 = r4
            goto L4c
        L4b:
            r8 = r2
        L4c:
            int r2 = r17.b()
            float r2 = (float) r2
            float r2 = r2 * r19
            int r2 = (int) r2
            if (r2 >= r4) goto L58
            r9 = r4
            goto L59
        L58:
            r9 = r2
        L59:
            java.lang.Object r2 = r0.c
            zg8 r2 = (defpackage.zg8) r2
            ch8 r5 = new ch8
            int r0 = r0.b
            r5.<init>(r0)
            int r6 = r17.e()
            int r7 = r17.b()
            int r0 = r1.a
            float r0 = (float) r0
            float r0 = r0 * r19
            int r10 = (int) r0
            int r0 = r1.b
            float r0 = (float) r0
            float r0 = r0 * r19
            int r11 = (int) r0
            int r0 = r1.e()
            float r0 = (float) r0
            float r0 = r0 * r19
            int r0 = (int) r0
            if (r0 >= r4) goto L84
            r12 = r4
            goto L85
        L84:
            r12 = r0
        L85:
            int r0 = r1.b()
            float r0 = (float) r0
            float r0 = r0 * r19
            int r0 = (int) r0
            if (r0 >= r4) goto L93
            r13 = r4
        L90:
            r0 = r17
            goto L95
        L93:
            r13 = r0
            goto L90
        L95:
            r14.a = r0
            r14.b = r1
            r14.e = r4
            r4 = r2
            java.lang.Object r2 = r4.c1(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            n82 r3 = defpackage.n82.a
            if (r2 != r3) goto La5
            return r3
        La5:
            nl5 r2 = (defpackage.nl5) r2
            pi8 r3 = new pi8
            r3.<init>(r0, r1, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jt1.n(uy5, uy5, float, n42):java.lang.Object");
    }

    public void o(h97 h97Var, ml5 ml5Var, Map map, long j) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
        Object obj = linkedHashMap.get(h97Var);
        if (obj == null) {
            obj = new ArrayList();
            linkedHashMap.put(h97Var, obj);
        }
        ArrayList arrayList = (ArrayList) obj;
        zj9 zj9Var = new zj9(new WeakReference(ml5Var), map, j);
        if (arrayList.isEmpty()) {
            arrayList.add(zj9Var);
        } else {
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                zj9 zj9Var2 = (zj9) arrayList.get(i);
                if (j >= zj9Var2.c) {
                    if (zj9Var2.a.get() == ml5Var) {
                        arrayList.set(i, zj9Var);
                    } else {
                        arrayList.add(i, zj9Var);
                    }
                } else {
                    i++;
                }
            }
        }
        d();
    }

    public String toString() {
        int i = 0;
        switch (this.a) {
            case 2:
                return new String((char[]) this.c, 0, this.b);
            case 16:
                ks5 ks5Var = (ks5) this.c;
                ArrayList arrayList = new ArrayList(ks5Var.b);
                while (true) {
                    int i2 = ks5Var.b;
                    if (i < i2) {
                        wq9.w(i, i2);
                        arrayList.add(a2d.d0(ks5Var.a[i]));
                        i++;
                    } else {
                        return "UnsupportedBrands{major=" + a2d.d0(this.b) + ", compatible=" + arrayList + "}";
                    }
                }
            default:
                return super.toString();
        }
    }

    @Override // defpackage.g06
    public void writeLong(long j) {
        j(String.valueOf(j));
    }

    @Override // defpackage.i0f
    public int zza() {
        switch (this.a) {
            case 17:
                return this.b;
            default:
                return this.b;
        }
    }

    public /* synthetic */ jt1(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    public jt1(bie bieVar) {
        this.a = 17;
        this.c = bieVar;
        this.b = bieVar.a + bieVar.b;
    }

    public jt1(lwe lweVar) {
        this.a = 18;
        this.c = lweVar;
        this.b = lweVar.a;
    }

    public jt1(int i, int i2) {
        this.a = i2;
        switch (i2) {
            case 9:
                if (i > 0) {
                    this.c = new Object[i];
                    return;
                } else {
                    vs.m("The max pool size must be > 0");
                    throw null;
                }
            default:
                this.b = i;
                this.c = new kj(16, false);
                return;
        }
    }

    public jt1(int i, zg8 zg8Var) {
        this.a = 8;
        zg8Var.getClass();
        this.b = i;
        this.c = zg8Var;
    }

    public jt1(int i, Point point) {
        this.a = 13;
        this.b = i;
        this.c = point;
    }

    public jt1(int i, int[] iArr) {
        ks5 ks5Var;
        this.a = 16;
        this.b = i;
        if (iArr != null) {
            ks5 ks5Var2 = ks5.c;
            ks5Var = iArr.length == 0 ? ks5.c : new ks5(Arrays.copyOf(iArr, iArr.length));
        } else {
            ks5Var = ks5.c;
        }
        this.c = ks5Var;
    }

    public /* synthetic */ jt1(char c, int i) {
        this.a = i;
    }

    public jt1(boolean z, boolean z2, boolean z3) {
        this.a = 5;
        this.b = (z || z2 || z3) ? 1 : 0;
    }
}

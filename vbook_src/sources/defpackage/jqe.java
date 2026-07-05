package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.net.Uri;
import android.system.Os;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jqe  reason: default package */
/* loaded from: classes.dex */
public abstract class jqe {
    public static final tu1 a = new tu1(new tx0(15), false, 713089413);
    public static final tu1 b = new tu1(new tx0(16), false, -466168373);
    public static final tu1 c = new tu1(new tx0(17), false, -1120053772);
    public static final tu1 d = new tu1(new tx0(18), false, -1018811013);
    public static final tu1 e = new tu1(new c8(24, (byte) 0), false, 741776089);
    public static final dx2 f = new dx2(0);
    public static final dx2 g = new dx2(5);
    public static final dx2 h = new dx2(6);
    public static final dx2 i = new dx2(7);
    public static final dx2 j = new dx2(8);
    public static final dx2 k = new dx2(9);
    public static final dx2 l = new dx2(10);
    public static final dx2 m = new dx2(11);
    public static final dx2 n = new dx2(1);
    public static final dx2 o = new dx2(2);
    public static final dx2 p = new dx2(3);
    public static final dx2 q = new dx2(4);
    public static final byte[] r = {112, 114, 111, 0};
    public static final byte[] s = {112, 114, 109, 0};

    public static o53[] A(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, o53[] o53VarArr) {
        String str;
        o53 o53Var;
        if (byteArrayInputStream.available() == 0) {
            return new o53[0];
        }
        if (i2 == o53VarArr.length) {
            for (int i3 = 0; i3 < i2; i3++) {
                nxe.D(byteArrayInputStream, 2);
                String str2 = new String(nxe.B(byteArrayInputStream, (int) nxe.D(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
                long D = nxe.D(byteArrayInputStream, 4);
                int D2 = (int) nxe.D(byteArrayInputStream, 2);
                if (o53VarArr.length > 0) {
                    int indexOf = str2.indexOf("!");
                    if (indexOf < 0) {
                        indexOf = str2.indexOf(":");
                    }
                    if (indexOf > 0) {
                        str = str2.substring(indexOf + 1);
                    } else {
                        str = str2;
                    }
                    for (int i4 = 0; i4 < o53VarArr.length; i4++) {
                        if (o53VarArr[i4].b.equals(str)) {
                            o53Var = o53VarArr[i4];
                            break;
                        }
                    }
                }
                o53Var = null;
                if (o53Var != null) {
                    o53Var.d = D;
                    int[] x = x(byteArrayInputStream, D2);
                    if (Arrays.equals(bArr, kqe.h)) {
                        o53Var.e = D2;
                        o53Var.h = x;
                    }
                } else {
                    vs.k("Missing profile key: ".concat(str2));
                    return null;
                }
            }
            return o53VarArr;
        }
        vs.k("Mismatched number of dex files found in metadata");
        return null;
    }

    public static o53[] B(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, kqe.e)) {
            int D = (int) nxe.D(fileInputStream, 1);
            byte[] C = nxe.C(fileInputStream, (int) nxe.D(fileInputStream, 4), (int) nxe.D(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(C);
                try {
                    o53[] C2 = C(byteArrayInputStream, str, D);
                    byteArrayInputStream.close();
                    return C2;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            vs.k("Content found after the end of file");
            return null;
        }
        vs.k("Unsupported version");
        return null;
    }

    public static o53[] C(ByteArrayInputStream byteArrayInputStream, String str, int i2) {
        int i3;
        int i4 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new o53[0];
        }
        o53[] o53VarArr = new o53[i2];
        for (int i5 = 0; i5 < i2; i5++) {
            int D = (int) nxe.D(byteArrayInputStream, 2);
            o53VarArr[i5] = new o53(str, new String(nxe.B(byteArrayInputStream, (int) nxe.D(byteArrayInputStream, 2)), StandardCharsets.UTF_8), nxe.D(byteArrayInputStream, 4), D, (int) nxe.D(byteArrayInputStream, 4), (int) nxe.D(byteArrayInputStream, 4), new int[D], new TreeMap());
        }
        int i6 = 0;
        while (i6 < i2) {
            o53 o53Var = o53VarArr[i6];
            int available = byteArrayInputStream.available();
            int i7 = o53Var.f;
            int i8 = o53Var.g;
            TreeMap treeMap = o53Var.i;
            int i9 = available - i7;
            int i10 = i4;
            while (byteArrayInputStream.available() > i9) {
                i10 += (int) nxe.D(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i10), 1);
                int D2 = (int) nxe.D(byteArrayInputStream, 2);
                while (D2 > 0) {
                    nxe.D(byteArrayInputStream, 2);
                    int D3 = (int) nxe.D(byteArrayInputStream, 1);
                    if (D3 != 6 && D3 != 7) {
                        while (D3 > 0) {
                            nxe.D(byteArrayInputStream, 1);
                            int i11 = i4;
                            int i12 = i6;
                            for (int D4 = (int) nxe.D(byteArrayInputStream, 1); D4 > 0; D4--) {
                                nxe.D(byteArrayInputStream, 2);
                            }
                            D3--;
                            i4 = i11;
                            i6 = i12;
                        }
                    }
                    D2--;
                    i4 = i4;
                    i6 = i6;
                }
            }
            int i13 = i4;
            int i14 = i6;
            if (byteArrayInputStream.available() == i9) {
                o53Var.h = x(byteArrayInputStream, o53Var.e);
                BitSet valueOf = BitSet.valueOf(nxe.B(byteArrayInputStream, (((i8 * 2) + 7) & (-8)) / 8));
                for (int i15 = i13; i15 < i8; i15++) {
                    if (valueOf.get(i15)) {
                        i3 = 2;
                    } else {
                        i3 = i13;
                    }
                    if (valueOf.get(i15 + i8)) {
                        i3 |= 4;
                    }
                    if (i3 != 0) {
                        Integer num = (Integer) treeMap.get(Integer.valueOf(i15));
                        if (num == null) {
                            num = Integer.valueOf(i13);
                        }
                        treeMap.put(Integer.valueOf(i15), Integer.valueOf(i3 | num.intValue()));
                    }
                }
                i6 = i14 + 1;
                i4 = i13;
            } else {
                vs.k("Read too much data during profile line parse");
                return null;
            }
        }
        return o53VarArr;
    }

    public static Executor D(Executor executor, yl4 yl4Var) {
        executor.getClass();
        if (executor == e73.a) {
            return executor;
        }
        return new dr7(executor, yl4Var, 0);
    }

    public static final String E(int i2, String str) {
        int f0;
        CharSequence charSequence;
        if (str.length() >= i2 + 12 && k4b.W("+-", str.charAt(0)) && (f0 = k4b.f0(str, '-', 1, 4)) >= 12) {
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (str.charAt(i4) != '0') {
                    break;
                }
                i3 = i4;
            }
            if (f0 - i3 < 12) {
                int i5 = f0 - 10;
                if (i5 >= 1) {
                    if (i5 == 1) {
                        charSequence = str.subSequence(0, str.length());
                    } else {
                        StringBuilder sb = new StringBuilder(str.length() - (f0 - 11));
                        sb.append((CharSequence) str, 0, 1);
                        sb.append((CharSequence) str, i5, str.length());
                        charSequence = sb;
                    }
                    return charSequence.toString();
                }
                cy7.k(hl5.l("End index (", ") is less than start index (1).", i5));
                return null;
            }
        }
        return str;
    }

    public static char[] F(int i2) {
        int i3 = i2 >>> 16;
        if (i3 == 0) {
            return new char[]{(char) i2};
        }
        if (i3 < 17) {
            return new char[]{(char) ((i2 >>> 10) + 55232), (char) ((i2 & 1023) + 56320)};
        }
        nqe.u(16);
        String num = Integer.toString(i2, 16);
        num.getClass();
        String upperCase = num.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        vs.m("Not a valid Unicode code point: 0x".concat(upperCase));
        return null;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean G(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, o53[] o53VarArr) {
        int i2;
        long j2;
        int length;
        byte[] bArr2 = kqe.h;
        byte[] bArr3 = kqe.g;
        byte[] bArr4 = kqe.d;
        int i3 = 0;
        if (Arrays.equals(bArr, bArr4)) {
            ArrayList arrayList = new ArrayList(3);
            ArrayList arrayList2 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                nxe.G(byteArrayOutputStream2, o53VarArr.length);
                int i4 = 2;
                int i5 = 2;
                for (o53 o53Var : o53VarArr) {
                    nxe.F(byteArrayOutputStream2, o53Var.c, 4);
                    nxe.F(byteArrayOutputStream2, o53Var.d, 4);
                    nxe.F(byteArrayOutputStream2, o53Var.g, 4);
                    String n2 = n(o53Var.a, o53Var.b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    int length2 = n2.getBytes(charset).length;
                    nxe.G(byteArrayOutputStream2, length2);
                    i5 = i5 + 14 + length2;
                    byteArrayOutputStream2.write(n2.getBytes(charset));
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (i5 == byteArray.length) {
                    ynd yndVar = new ynd(byteArray, 1, false);
                    byteArrayOutputStream2.close();
                    arrayList.add(yndVar);
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    int i6 = 0;
                    int i7 = 0;
                    while (i6 < o53VarArr.length) {
                        try {
                            o53 o53Var2 = o53VarArr[i6];
                            nxe.G(byteArrayOutputStream3, i6);
                            nxe.G(byteArrayOutputStream3, o53Var2.e);
                            i7 = i7 + 4 + (o53Var2.e * i4);
                            int[] iArr = o53Var2.h;
                            int length3 = iArr.length;
                            int i8 = i3;
                            while (i3 < length3) {
                                int i9 = iArr[i3];
                                nxe.G(byteArrayOutputStream3, i9 - i8);
                                i3++;
                                i4 = i4;
                                i8 = i9;
                            }
                            i6++;
                            i3 = 0;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    int i10 = i4;
                    byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                    if (i7 == byteArray2.length) {
                        ynd yndVar2 = new ynd(byteArray2, 3, true);
                        byteArrayOutputStream3.close();
                        arrayList.add(yndVar2);
                        byteArrayOutputStream3 = new ByteArrayOutputStream();
                        int i11 = 0;
                        for (int i12 = 0; i12 < o53VarArr.length; i12++) {
                            try {
                                o53 o53Var3 = o53VarArr[i12];
                                int i13 = 0;
                                for (Map.Entry entry : o53Var3.i.entrySet()) {
                                    i13 |= ((Integer) entry.getValue()).intValue();
                                }
                                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                                J(byteArrayOutputStream4, i13, o53Var3);
                                byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                                byteArrayOutputStream4.close();
                                ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                                K(byteArrayOutputStream5, o53Var3);
                                byte[] byteArray4 = byteArrayOutputStream5.toByteArray();
                                byteArrayOutputStream5.close();
                                nxe.G(byteArrayOutputStream3, i12);
                                int length4 = byteArray3.length + 2 + byteArray4.length;
                                int i14 = i11 + 6;
                                nxe.F(byteArrayOutputStream3, length4, 4);
                                nxe.G(byteArrayOutputStream3, i13);
                                byteArrayOutputStream3.write(byteArray3);
                                byteArrayOutputStream3.write(byteArray4);
                                i11 = i14 + length4;
                            } finally {
                                try {
                                    byteArrayOutputStream3.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                        }
                        byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
                        if (i11 == byteArray5.length) {
                            ynd yndVar3 = new ynd(byteArray5, 4, true);
                            byteArrayOutputStream3.close();
                            arrayList.add(yndVar3);
                            long size = 12 + (arrayList.size() * 16);
                            nxe.F(byteArrayOutputStream, arrayList.size(), 4);
                            int i15 = 0;
                            while (i15 < arrayList.size()) {
                                ynd yndVar4 = (ynd) arrayList.get(i15);
                                int i16 = yndVar4.a;
                                byte[] bArr5 = yndVar4.b;
                                if (i16 != 1) {
                                    i2 = i10;
                                    if (i16 != i2) {
                                        if (i16 != 3) {
                                            if (i16 != 4) {
                                                if (i16 == 5) {
                                                    j2 = 4;
                                                } else {
                                                    throw null;
                                                }
                                            } else {
                                                j2 = 3;
                                            }
                                        } else {
                                            j2 = 2;
                                        }
                                    } else {
                                        j2 = 1;
                                    }
                                } else {
                                    i2 = i10;
                                    j2 = 0;
                                }
                                nxe.F(byteArrayOutputStream, j2, 4);
                                nxe.F(byteArrayOutputStream, size, 4);
                                if (yndVar4.c) {
                                    long length5 = bArr5.length;
                                    byte[] q2 = nxe.q(bArr5);
                                    arrayList2.add(q2);
                                    nxe.F(byteArrayOutputStream, q2.length, 4);
                                    nxe.F(byteArrayOutputStream, length5, 4);
                                    length = q2.length;
                                } else {
                                    arrayList2.add(bArr5);
                                    nxe.F(byteArrayOutputStream, bArr5.length, 4);
                                    nxe.F(byteArrayOutputStream, 0L, 4);
                                    length = bArr5.length;
                                }
                                size += length;
                                i15++;
                                i10 = i2;
                            }
                            for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                                byteArrayOutputStream.write((byte[]) arrayList2.get(i17));
                            }
                            return true;
                        }
                        throw new IllegalStateException("Expected size " + i11 + ", does not match actual size " + byteArray5.length);
                    }
                    throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray2.length);
                }
                throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray.length);
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream2.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        byte[] bArr6 = kqe.e;
        if (Arrays.equals(bArr, bArr6)) {
            byte[] k2 = k(o53VarArr, bArr6);
            nxe.F(byteArrayOutputStream, o53VarArr.length, 1);
            nxe.F(byteArrayOutputStream, k2.length, 4);
            byte[] q3 = nxe.q(k2);
            nxe.F(byteArrayOutputStream, q3.length, 4);
            byteArrayOutputStream.write(q3);
            return true;
        } else if (Arrays.equals(bArr, bArr3)) {
            nxe.F(byteArrayOutputStream, o53VarArr.length, 1);
            for (o53 o53Var4 : o53VarArr) {
                String n3 = n(o53Var4.a, o53Var4.b, bArr3);
                Charset charset2 = StandardCharsets.UTF_8;
                nxe.G(byteArrayOutputStream, n3.getBytes(charset2).length);
                nxe.G(byteArrayOutputStream, o53Var4.h.length);
                nxe.F(byteArrayOutputStream, o53Var4.i.size() * 4, 4);
                nxe.F(byteArrayOutputStream, o53Var4.c, 4);
                byteArrayOutputStream.write(n3.getBytes(charset2));
                for (Integer num : o53Var4.i.keySet()) {
                    nxe.G(byteArrayOutputStream, num.intValue());
                    nxe.G(byteArrayOutputStream, 0);
                }
                for (int i18 : o53Var4.h) {
                    nxe.G(byteArrayOutputStream, i18);
                }
            }
            return true;
        } else {
            byte[] bArr7 = kqe.f;
            if (Arrays.equals(bArr, bArr7)) {
                byte[] k3 = k(o53VarArr, bArr7);
                nxe.F(byteArrayOutputStream, o53VarArr.length, 1);
                nxe.F(byteArrayOutputStream, k3.length, 4);
                byte[] q4 = nxe.q(k3);
                nxe.F(byteArrayOutputStream, q4.length, 4);
                byteArrayOutputStream.write(q4);
                return true;
            } else if (Arrays.equals(bArr, bArr2)) {
                nxe.G(byteArrayOutputStream, o53VarArr.length);
                for (o53 o53Var5 : o53VarArr) {
                    String str = o53Var5.a;
                    TreeMap treeMap = o53Var5.i;
                    String n4 = n(str, o53Var5.b, bArr2);
                    Charset charset3 = StandardCharsets.UTF_8;
                    nxe.G(byteArrayOutputStream, n4.getBytes(charset3).length);
                    nxe.G(byteArrayOutputStream, treeMap.size());
                    nxe.G(byteArrayOutputStream, o53Var5.h.length);
                    nxe.F(byteArrayOutputStream, o53Var5.c, 4);
                    byteArrayOutputStream.write(n4.getBytes(charset3));
                    for (Integer num2 : treeMap.keySet()) {
                        nxe.G(byteArrayOutputStream, num2.intValue());
                    }
                    for (int i19 : o53Var5.h) {
                        nxe.G(byteArrayOutputStream, i19);
                    }
                }
                return true;
            } else {
                return false;
            }
        }
    }

    public static void H(ByteArrayOutputStream byteArrayOutputStream, o53 o53Var) {
        K(byteArrayOutputStream, o53Var);
        int i2 = o53Var.g;
        int[] iArr = o53Var.h;
        int length = iArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = iArr[i3];
            nxe.G(byteArrayOutputStream, i5 - i4);
            i3++;
            i4 = i5;
        }
        byte[] bArr = new byte[(((i2 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : o53Var.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i6 = intValue / 8;
                bArr[i6] = (byte) (bArr[i6] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i7 = intValue + i2;
                int i8 = i7 / 8;
                bArr[i8] = (byte) ((1 << (i7 % 8)) | bArr[i8]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void I(ByteArrayOutputStream byteArrayOutputStream, o53 o53Var, String str) {
        Charset charset = StandardCharsets.UTF_8;
        nxe.G(byteArrayOutputStream, str.getBytes(charset).length);
        nxe.G(byteArrayOutputStream, o53Var.e);
        nxe.F(byteArrayOutputStream, o53Var.f, 4);
        nxe.F(byteArrayOutputStream, o53Var.c, 4);
        nxe.F(byteArrayOutputStream, o53Var.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void J(ByteArrayOutputStream byteArrayOutputStream, int i2, o53 o53Var) {
        int i3 = o53Var.g;
        byte[] bArr = new byte[(((Integer.bitCount(i2 & (-2)) * i3) + 7) & (-8)) / 8];
        for (Map.Entry entry : o53Var.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i4 = 0;
            for (int i5 = 1; i5 <= 4; i5 <<= 1) {
                if (i5 != 1 && (i5 & i2) != 0) {
                    if ((i5 & intValue2) == i5) {
                        int i6 = (i4 * i3) + intValue;
                        int i7 = i6 / 8;
                        bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
                    }
                    i4++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void K(ByteArrayOutputStream byteArrayOutputStream, o53 o53Var) {
        int i2 = 0;
        for (Map.Entry entry : o53Var.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                nxe.G(byteArrayOutputStream, intValue - i2);
                nxe.G(byteArrayOutputStream, 0);
                i2 = intValue;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [saf, z8f, java.lang.Object] */
    public static IOException L(b9f b9fVar, Uri uri, IOException iOException, String str) {
        try {
            ?? obj = new Object();
            obj.a = true;
            File file = (File) b9fVar.a(uri, obj);
            if (file.exists()) {
                if (file.isFile()) {
                    if (file.canRead()) {
                        if (file.canWrite()) {
                            return M(file, iOException, str);
                        }
                        return M(file, iOException, str);
                    } else if (file.canWrite()) {
                        return M(file, iOException, str);
                    } else {
                        return M(file, iOException, str);
                    }
                } else if (file.canRead()) {
                    if (file.canWrite()) {
                        return M(file, iOException, str);
                    }
                    return M(file, iOException, str);
                } else if (file.canWrite()) {
                    return M(file, iOException, str);
                } else {
                    return M(file, iOException, str);
                }
            }
            return M(file, iOException, str);
        } catch (IOException unused) {
            return new IOException(iOException);
        }
    }

    public static IOException M(File file, IOException iOException, String str) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return N(file, iOException, str);
        }
        if (parentFile.exists()) {
            if (parentFile.isDirectory()) {
                if (parentFile.canRead()) {
                    if (parentFile.canWrite()) {
                        return N(file, iOException, str);
                    }
                    return N(file, iOException, str);
                } else if (parentFile.canWrite()) {
                    return N(file, iOException, str);
                } else {
                    return N(file, iOException, str);
                }
            } else if (parentFile.canRead()) {
                if (parentFile.canWrite()) {
                    return N(file, iOException, str);
                }
                return N(file, iOException, str);
            } else if (parentFile.canWrite()) {
                return N(file, iOException, str);
            } else {
                return N(file, iOException, str);
            }
        }
        return N(file, iOException, str);
    }

    public static IOException N(File file, IOException iOException, String str) {
        String concat;
        try {
            Locale locale = Locale.US;
            String str2 = " canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + "] protoName[" + str + "]";
            StringBuilder sb = new StringBuilder(str2.length() + 16);
            sb.append("Inoperable file:");
            sb.append(str2);
            String sb2 = sb.toString();
            try {
                String str3 = " mode[" + Os.stat(file.getCanonicalPath()).st_mode + "]";
                StringBuilder sb3 = new StringBuilder(sb2.length() + str3.length());
                sb3.append(sb2);
                sb3.append(str3);
                concat = sb3.toString();
            } catch (Exception unused) {
            }
        } catch (IOException unused2) {
            concat = "Inoperable file:".concat(" failed");
        }
        return new IOException(concat, iOException);
    }

    public static final void a(String str, cz7 cz7Var, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        boolean z;
        boolean z2;
        str.getClass();
        cz7Var.getClass();
        rv4Var.g0(-277369051);
        if (rv4Var.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i3 | i2;
        if (rv4Var.f(cz7Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i6 = i5 | i4;
        if ((i6 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i6 & 1, z)) {
            Object[] objArr = new Object[0];
            if ((i6 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var.P();
            Object obj = ax1.a;
            if (z2 || P == obj) {
                P = new op0(str, 8);
                rv4Var.o0(P);
            }
            aw7 aw7Var = (aw7) zpe.k(objArr, (vt4) P, rv4Var, 0);
            Object[] objArr2 = new Object[0];
            Object P2 = rv4Var.P();
            if (P2 == obj) {
                P2 = new rj2(27);
                rv4Var.o0(P2);
            }
            aw7 aw7Var2 = (aw7) zpe.k(objArr2, (vt4) P2, rv4Var, 48);
            fxe.h(yqe.B((y3b) b3b.R.getValue(), new Object[]{(String) aw7Var.getValue()}, rv4Var), null, false, jce.E(2059905185, new p7(cz7Var, 20), rv4Var), jce.E(-821421046, new mr3(aw7Var2, 4), rv4Var), null, jce.E(-1018330192, new or0(cz7Var, aw7Var, 1), rv4Var), rv4Var, 1600512, 38);
            boolean booleanValue = ((Boolean) aw7Var2.getValue()).booleanValue();
            String str2 = (String) aw7Var.getValue();
            String A = yqe.A((y3b) b3b.P.getValue(), rv4Var);
            boolean f2 = rv4Var.f(aw7Var2);
            Object P3 = rv4Var.P();
            if (f2 || P3 == obj) {
                P3 = new as1(aw7Var2, 21);
                rv4Var.o0(P3);
            }
            xt4 xt4Var = (xt4) P3;
            boolean f3 = rv4Var.f(aw7Var2) | rv4Var.f(aw7Var);
            Object P4 = rv4Var.P();
            if (f3 || P4 == obj) {
                P4 = new pr0(aw7Var2, aw7Var, 5);
                rv4Var.o0(P4);
            }
            wq9.f(booleanValue, str2, A, xt4Var, (xt4) P4, rv4Var, 0);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new yp0(str, cz7Var, i2, 3);
        }
    }

    public static final long b(long j2, CharSequence charSequence) {
        int i2;
        int i3 = fxb.c;
        int i4 = (int) (j2 >> 32);
        int i5 = (int) (4294967295L & j2);
        int i6 = 10;
        if (i4 > 0) {
            i2 = Character.codePointBefore(charSequence, i4);
        } else {
            i2 = 10;
        }
        if (i5 < charSequence.length()) {
            i6 = Character.codePointAt(charSequence, i5);
        }
        if (w(i2) && (v(i6) || u(i6))) {
            do {
                i4 -= Character.charCount(i2);
                if (i4 == 0) {
                    break;
                }
                i2 = Character.codePointBefore(charSequence, i4);
            } while (w(i2));
            return sze.a(i4, i5);
        } else if (w(i6)) {
            if (v(i2) || u(i2)) {
                do {
                    i5 += Character.charCount(i6);
                    if (i5 == charSequence.length()) {
                        break;
                    }
                    i6 = Character.codePointAt(charSequence, i5);
                } while (w(i6));
                return sze.a(i4, i5);
            }
            return j2;
        } else {
            return j2;
        }
    }

    public static final long c(fvb fvbVar, long j2, long j3, sc6 sc6Var, ucd ucdVar) {
        if (fvbVar != null) {
            it7 it7Var = fvbVar.b;
            if (sc6Var != null) {
                long f0 = sc6Var.f0(j2);
                long f02 = sc6Var.f0(j3);
                int o2 = o(it7Var, f0, ucdVar);
                int o3 = o(it7Var, f02, ucdVar);
                if (o2 == -1) {
                    if (o3 == -1) {
                        return fxb.b;
                    }
                } else {
                    if (o3 != -1) {
                        o2 = Math.min(o2, o3);
                    }
                    o3 = o2;
                }
                float b2 = (it7Var.b(o3) + it7Var.f(o3)) / 2.0f;
                int i2 = (int) (f0 >> 32);
                int i3 = (int) (f02 >> 32);
                return it7Var.i(new rk9(Math.min(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3)), b2 - 0.1f, Math.max(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3)), b2 + 0.1f), 0, kh5.Y);
            }
        }
        return fxb.b;
    }

    public static final long d(ol6 ol6Var, rk9 rk9Var, rk9 rk9Var2, int i2) {
        long q2 = q(ol6Var, rk9Var, i2);
        if (fxb.d(q2)) {
            return fxb.b;
        }
        long q3 = q(ol6Var, rk9Var2, i2);
        if (fxb.d(q3)) {
            return fxb.b;
        }
        int i3 = (int) (q2 >> 32);
        int i4 = (int) (q3 & 4294967295L);
        return sze.a(Math.min(i3, i3), Math.max(i4, i4));
    }

    public static final long e(hvb hvbVar, rk9 rk9Var, rk9 rk9Var2, int i2) {
        long r2 = r(hvbVar, rk9Var, i2);
        if (fxb.d(r2)) {
            return fxb.b;
        }
        long r3 = r(hvbVar, rk9Var2, i2);
        if (fxb.d(r3)) {
            return fxb.b;
        }
        int i3 = (int) (r2 >> 32);
        int i4 = (int) (r3 & 4294967295L);
        return sze.a(Math.min(i3, i3), Math.max(i4, i4));
    }

    public static final boolean f(fvb fvbVar, int i2) {
        it7 it7Var = fvbVar.b;
        int d2 = it7Var.d(i2);
        if (i2 == fvbVar.i(d2) || i2 == it7Var.c(d2, false) ? it7Var.h(i2) != fvbVar.a(i2) : fvbVar.a(i2) != fvbVar.a(i2 - 1)) {
            return true;
        }
        return false;
    }

    public static final long g(CharSequence charSequence, int i2) {
        int i3 = i2;
        while (i3 > 0) {
            int codePointBefore = Character.codePointBefore(charSequence, i3);
            if (!v(codePointBefore)) {
                break;
            }
            i3 -= Character.charCount(codePointBefore);
        }
        while (i2 < charSequence.length()) {
            int codePointAt = Character.codePointAt(charSequence, i2);
            if (!v(codePointAt)) {
                break;
            }
            i2 += Character.charCount(codePointAt);
        }
        return sze.a(i3, i2);
    }

    public static final long h(PointF pointF) {
        return (Float.floatToRawIntBits(pointF.x) << 32) | (Float.floatToRawIntBits(pointF.y) & 4294967295L);
    }

    public static final void i(v4 v4Var, b8a b8aVar) {
        u7a u7aVar = b8aVar.d;
        tv7 tv7Var = u7aVar.a;
        Object g2 = u7aVar.a.g(h8a.z);
        g4 g4Var = null;
        if (g2 == null) {
            g2 = null;
        }
        xt9 xt9Var = (xt9) g2;
        if (kqe.d(b8aVar)) {
            if (xt9Var == null || xt9Var.a != 8) {
                Object g3 = tv7Var.g(s7a.y);
                if (g3 == null) {
                    g3 = null;
                }
                g4 g4Var2 = (g4) g3;
                if (g4Var2 != null) {
                    v4Var.b(new q4(16908358, g4Var2.a));
                }
                Object g4 = tv7Var.g(s7a.A);
                if (g4 == null) {
                    g4 = null;
                }
                g4 g4Var3 = (g4) g4;
                if (g4Var3 != null) {
                    v4Var.b(new q4(16908359, g4Var3.a));
                }
                Object g5 = tv7Var.g(s7a.z);
                if (g5 == null) {
                    g5 = null;
                }
                g4 g4Var4 = (g4) g5;
                if (g4Var4 != null) {
                    v4Var.b(new q4(16908360, g4Var4.a));
                }
                Object g6 = tv7Var.g(s7a.B);
                if (g6 != null) {
                    g4Var = g6;
                }
                g4 g4Var5 = g4Var;
                if (g4Var5 != null) {
                    v4Var.b(new q4(16908361, g4Var5.a));
                }
            }
        }
    }

    public static final List j(d38 d38Var, int i2, int i3, ArrayList arrayList, vu7 vu7Var, int i4, int i5, int i6, boolean z, xt4 xt4Var) {
        int i7;
        vu7 vu7Var2;
        wh6 wh6Var;
        int i8;
        long j2;
        int i9;
        Object obj;
        int i10;
        int max;
        long j3;
        if (d38Var != null && !arrayList.isEmpty() && (i7 = vu7Var.b) != 0) {
            int i11 = -1;
            int i12 = 0;
            if (i3 - i2 >= 0 && i7 != 0) {
                ty5 F = dce.F(0, i7);
                int i13 = F.a;
                int i14 = F.b;
                int i15 = -1;
                if (i13 <= i14) {
                    while (vu7Var.c(i13) <= i2) {
                        i15 = vu7Var.c(i13);
                        if (i13 == i14) {
                            break;
                        }
                        i13++;
                    }
                }
                if (i15 == -1) {
                    vu7Var2 = ly5.a;
                } else {
                    vu7 vu7Var3 = ly5.a;
                    vu7Var2 = new vu7(1);
                    vu7Var2.a(i15);
                }
            } else {
                vu7Var2 = ly5.a;
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            int i16 = 0;
            while (i16 < size) {
                Object obj2 = arrayList.get(i16);
                int index = ((wh6) obj2).getIndex();
                int[] iArr = vu7Var.a;
                int i17 = vu7Var.b;
                int i18 = i12;
                while (true) {
                    if (i18 >= i17) {
                        break;
                    } else if (iArr[i18] == index) {
                        arrayList3.add(obj2);
                        break;
                    } else {
                        i18++;
                    }
                }
                i16++;
                i12 = 0;
            }
            int[] iArr2 = vu7Var2.a;
            int i19 = vu7Var2.b;
            int i20 = 0;
            while (i20 < i19) {
                int i21 = iArr2[i20];
                int size2 = arrayList.size();
                int i22 = 0;
                int i23 = 0;
                while (true) {
                    if (i23 < size2) {
                        Object obj3 = arrayList.get(i23);
                        i23++;
                        if (((wh6) obj3).getIndex() == i21) {
                            break;
                        }
                        i22++;
                    } else {
                        i22 = i11;
                        break;
                    }
                }
                if (i22 == i11) {
                    wh6Var = (wh6) xt4Var.invoke(Integer.valueOf(i21));
                } else {
                    wh6Var = (wh6) arrayList.remove(i22);
                }
                int t = hif.t(wh6Var, z);
                if (i22 == i11) {
                    i8 = i20;
                    i9 = Integer.MIN_VALUE;
                } else {
                    long g2 = wh6Var.g(0);
                    if (z) {
                        i8 = i20;
                        j2 = g2 & 4294967295L;
                    } else {
                        i8 = i20;
                        j2 = g2 >> 32;
                    }
                    i9 = (int) j2;
                }
                int size3 = arrayList3.size();
                int i24 = 0;
                while (true) {
                    if (i24 < size3) {
                        obj = arrayList3.get(i24);
                        if (((wh6) obj).getIndex() != i21) {
                            break;
                        }
                        i24++;
                    } else {
                        obj = null;
                        break;
                    }
                }
                wh6 wh6Var2 = (wh6) obj;
                if (wh6Var2 != null) {
                    long g3 = wh6Var2.g(0);
                    if (z) {
                        j3 = g3 & 4294967295L;
                    } else {
                        j3 = g3 >> 32;
                    }
                    i10 = (int) j3;
                } else {
                    i10 = Integer.MIN_VALUE;
                }
                if (i9 == Integer.MIN_VALUE) {
                    max = -i4;
                } else {
                    max = Math.max(-i4, i9);
                }
                if (i10 != Integer.MIN_VALUE) {
                    max = Math.min(max, i10 - t);
                }
                wh6Var.j();
                wh6Var.k(max, 0, i5, i6);
                arrayList2.add(wh6Var);
                i20 = i8 + 1;
                i11 = -1;
            }
            return arrayList2;
        }
        return ks3.a;
    }

    public static byte[] k(o53[] o53VarArr, byte[] bArr) {
        int i2 = 0;
        int i3 = 0;
        for (o53 o53Var : o53VarArr) {
            i3 += ((((o53Var.g * 2) + 7) & (-8)) / 8) + (o53Var.e * 2) + n(o53Var.a, o53Var.b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + o53Var.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i3);
        if (Arrays.equals(bArr, kqe.f)) {
            int length = o53VarArr.length;
            while (i2 < length) {
                o53 o53Var2 = o53VarArr[i2];
                I(byteArrayOutputStream, o53Var2, n(o53Var2.a, o53Var2.b, bArr));
                H(byteArrayOutputStream, o53Var2);
                i2++;
            }
        } else {
            for (o53 o53Var3 : o53VarArr) {
                I(byteArrayOutputStream, o53Var3, n(o53Var3.a, o53Var3.b, bArr));
            }
            int length2 = o53VarArr.length;
            while (i2 < length2) {
                H(byteArrayOutputStream, o53VarArr[i2]);
                i2++;
            }
        }
        if (byteArrayOutputStream.size() == i3) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i3);
    }

    public static final int l(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        while (i2 < length) {
            if (charSequence.charAt(i2) == '\n') {
                return i2;
            }
            i2++;
        }
        return charSequence.length();
    }

    public static final int m(CharSequence charSequence, int i2) {
        while (i2 > 0) {
            if (charSequence.charAt(i2 - 1) == '\n') {
                return i2;
            }
            i2--;
        }
        return 0;
    }

    public static String n(String str, String str2, byte[] bArr) {
        Object obj;
        byte[] bArr2 = kqe.g;
        byte[] bArr3 = kqe.h;
        String str3 = "!";
        if (!Arrays.equals(bArr, bArr3) && !Arrays.equals(bArr, bArr2)) {
            obj = "!";
        } else {
            obj = ":";
        }
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else if (str2.equals("classes.dex")) {
            return str;
        } else {
            if (!str2.contains("!") && !str2.contains(":")) {
                if (!str2.endsWith(".apk")) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    return s21.q(sb, (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : ":", str2);
                }
            } else if ("!".equals(obj)) {
                return str2.replace(":", "!");
            } else {
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            }
        }
        return str2;
    }

    public static final int o(it7 it7Var, long j2, ucd ucdVar) {
        float f2;
        if (ucdVar != null) {
            f2 = ucdVar.g();
        } else {
            f2 = nae.e;
        }
        int i2 = (int) (4294967295L & j2);
        int e2 = it7Var.e(Float.intBitsToFloat(i2));
        if (Float.intBitsToFloat(i2) >= it7Var.f(e2) - f2 && Float.intBitsToFloat(i2) <= it7Var.b(e2) + f2) {
            int i3 = (int) (j2 >> 32);
            if (Float.intBitsToFloat(i3) >= (-f2) && Float.intBitsToFloat(i3) <= it7Var.d + f2) {
                return e2;
            }
            return -1;
        }
        return -1;
    }

    public static final int p(it7 it7Var, long j2, sc6 sc6Var, ucd ucdVar) {
        long f0;
        int o2;
        if (sc6Var == null || (o2 = o(it7Var, (f0 = sc6Var.f0(j2)), ucdVar)) == -1) {
            return -1;
        }
        return it7Var.g(y78.b(f0, nae.e, (it7Var.b(o2) + it7Var.f(o2)) / 2.0f, 1));
    }

    public static final long q(ol6 ol6Var, rk9 rk9Var, int i2) {
        it7 it7Var;
        gvb d2 = ol6Var.d();
        if (d2 != null) {
            it7Var = d2.a.b;
        } else {
            it7Var = null;
        }
        sc6 c2 = ol6Var.c();
        p1a p1aVar = kh5.Z;
        if (it7Var != null && c2 != null) {
            return it7Var.i(rk9Var.o(c2.f0(0L)), i2, p1aVar);
        }
        return fxb.b;
    }

    public static final long r(hvb hvbVar, rk9 rk9Var, int i2) {
        it7 it7Var;
        fvb c2 = hvbVar.c();
        if (c2 != null) {
            it7Var = c2.b;
        } else {
            it7Var = null;
        }
        sc6 e2 = hvbVar.e();
        p1a p1aVar = kh5.Z;
        if (it7Var != null && e2 != null) {
            return it7Var.i(rk9Var.o(e2.f0(0L)), i2, p1aVar);
        }
        return fxb.b;
    }

    public static final Matrix s(int i2, int i3, float f2, float f3, int i4, int i5) {
        if (i4 > 0) {
            if (i5 > 0) {
                Matrix matrix = new Matrix();
                matrix.setScale(f2 / i4, f3 / i5);
                matrix.postTranslate(-i2, -i3);
                return matrix;
            }
            vs.m("Page height must be greater than 0");
            return null;
        }
        vs.m("Page width must be greater than 0");
        return null;
    }

    public static final boolean t(char c2) {
        if ('0' > c2 || c2 >= ':') {
            return false;
        }
        return true;
    }

    public static final boolean u(int i2) {
        int type = Character.getType(i2);
        if (type != 23 && type != 20 && type != 22 && type != 30 && type != 29 && type != 24 && type != 21) {
            return false;
        }
        return true;
    }

    public static final boolean v(int i2) {
        if (!Character.isWhitespace(i2) && i2 != 160) {
            return false;
        }
        return true;
    }

    public static final boolean w(int i2) {
        int type;
        if (v(i2) && (type = Character.getType(i2)) != 14 && type != 13 && i2 != 10) {
            return true;
        }
        return false;
    }

    public static int[] x(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += (int) nxe.D(byteArrayInputStream, 2);
            iArr[i4] = i3;
        }
        return iArr;
    }

    public static o53[] y(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, o53[] o53VarArr) {
        byte[] bArr3 = kqe.i;
        if (Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(kqe.d, bArr2)) {
                if (Arrays.equals(bArr, bArr3)) {
                    int D = (int) nxe.D(fileInputStream, 1);
                    byte[] C = nxe.C(fileInputStream, (int) nxe.D(fileInputStream, 4), (int) nxe.D(fileInputStream, 4));
                    if (fileInputStream.read() <= 0) {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(C);
                        try {
                            o53[] z = z(byteArrayInputStream, D, o53VarArr);
                            byteArrayInputStream.close();
                            return z;
                        } catch (Throwable th) {
                            try {
                                byteArrayInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    vs.k("Content found after the end of file");
                    return null;
                }
                vs.k("Unsupported meta version");
                return null;
            }
            vs.k("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        } else if (Arrays.equals(bArr, kqe.j)) {
            int D2 = (int) nxe.D(fileInputStream, 2);
            byte[] C2 = nxe.C(fileInputStream, (int) nxe.D(fileInputStream, 4), (int) nxe.D(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(C2);
                try {
                    o53[] A = A(byteArrayInputStream2, bArr2, D2, o53VarArr);
                    byteArrayInputStream2.close();
                    return A;
                } catch (Throwable th3) {
                    try {
                        byteArrayInputStream2.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
            vs.k("Content found after the end of file");
            return null;
        } else {
            vs.k("Unsupported meta version");
            return null;
        }
    }

    public static o53[] z(ByteArrayInputStream byteArrayInputStream, int i2, o53[] o53VarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new o53[0];
        }
        if (i2 == o53VarArr.length) {
            String[] strArr = new String[i2];
            int[] iArr = new int[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                iArr[i3] = (int) nxe.D(byteArrayInputStream, 2);
                strArr[i3] = new String(nxe.B(byteArrayInputStream, (int) nxe.D(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            }
            for (int i4 = 0; i4 < i2; i4++) {
                o53 o53Var = o53VarArr[i4];
                if (o53Var.b.equals(strArr[i4])) {
                    int i5 = iArr[i4];
                    o53Var.e = i5;
                    o53Var.h = x(byteArrayInputStream, i5);
                } else {
                    vs.k("Order of dexfiles in metadata did not match baseline");
                    return null;
                }
            }
            return o53VarArr;
        }
        vs.k("Mismatched number of dex files found in metadata");
        return null;
    }
}

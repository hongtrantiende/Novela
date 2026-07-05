package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rae  reason: default package */
/* loaded from: classes.dex */
public abstract class rae {
    public static final float[][] a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] c = {95.047f, 100.0f, 108.883f};
    public static final float[][] d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final tu1 e = new tu1(new pv1(19), false, 2017101677);
    public static final tu1 f = new tu1(new pv1(20), false, 1619797284);
    public static final tu1 g = new tu1(new pv1(21), false, -1110750725);
    public static final tu1 h = new tu1(new pv1(22), false, -1003642859);
    public static final tu1 i = new tu1(new pv1(23), false, 38369312);
    public static final tu1 j = new tu1(new pv1(24), false, 396682760);
    public static final tu1 k = new tu1(new ov1(29), false, 1203121548);
    public static final tu1 l = new tu1(new rv1(0), false, 162784336);
    public static final tu1 m = new tu1(new rv1(1), false, 113984761);
    public static final tu1 n = new tu1(new ov1(27), false, -22042536);
    public static final tu1 o = new tu1(new ov1(28), false, -158069833);
    public static final qm1 p = qm1.d;
    public static final qm1 q = qm1.I;
    public static final qm1 r = qm1.H;
    public static final qm1 s;
    public static final qm1 t;

    static {
        qm1 qm1Var = qm1.f;
        s = qm1Var;
        t = qm1Var;
    }

    public static final long a(int i2) {
        long j2 = i2 << 32;
        int i3 = e86.V;
        return j2;
    }

    public static final void b(boolean z, String str, cs9 cs9Var, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z2;
        cs9 cs9Var2;
        boolean z3;
        xt4Var.getClass();
        xt4Var2.getClass();
        rv4Var.g0(-160793606);
        if (rv4Var.g(z)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i2 | i3;
        if (rv4Var.f(str)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4 | 384;
        if (rv4Var.h(xt4Var2)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i8 = i7 | i5;
        boolean z4 = false;
        if ((i8 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i8 & 1, z2)) {
            int i9 = i8 & 14;
            if (i9 == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i8 & Token.ASSIGN_MOD) == 32) {
                z4 = true;
            }
            boolean z5 = z3 | z4;
            Object P = rv4Var.P();
            cs9 cs9Var3 = cs9.b;
            if (z5 || P == ax1.a) {
                P = yae.z(cs9Var3);
                rv4Var.o0(P);
            }
            xb.a(z, xt4Var, null, null, null, null, jce.E(655876429, new jd1(str, 16), rv4Var), null, 0L, 0L, nae.e, null, null, null, false, false, jce.E(1297164758, new or3((aw7) P, xt4Var2), rv4Var), rv4Var, i9 | 1572912, 1572864, 65468);
            cs9Var2 = cs9Var3;
        } else {
            rv4Var.X();
            cs9Var2 = cs9Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new b62(z, str, cs9Var2, xt4Var, xt4Var2, i2, 5);
        }
    }

    public static final int c(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' <= c2 && c2 < 'G') {
            return c2 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c2);
    }

    public static final void e(ak3 ak3Var, int i2, long j2, float f2, float f3) {
        if (i2 == 1) {
            float f4 = f2 / 2.0f;
            ak3.D0(ak3Var, j2, f4, (Float.floatToRawIntBits((Float.intBitsToFloat((int) (ak3Var.b() >> 32)) - f4) - f3) << 32) | (4294967295L & Float.floatToRawIntBits(Float.intBitsToFloat((int) (ak3Var.b() & 4294967295L)) / 2.0f)), nae.e, null, 120);
            return;
        }
        ak3.R0(ak3Var, j2, (Float.floatToRawIntBits((Float.intBitsToFloat((int) (ak3Var.b() >> 32)) - f2) - f3) << 32) | (Float.floatToRawIntBits((Float.intBitsToFloat((int) (ak3Var.b() & 4294967295L)) - f2) / 2.0f) & 4294967295L), (Float.floatToRawIntBits(f2) << 32) | (4294967295L & Float.floatToRawIntBits(f2)), nae.e, null, 0, 120);
    }

    public static tf2 f(byte[] bArr) {
        boolean z;
        bArr.getClass();
        if (bArr.length <= 10240) {
            if (bArr.length == 0) {
                return tf2.b;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                byte[] bArr2 = new byte[2];
                byteArrayInputStream.read(bArr2);
                int i2 = 0;
                if (bArr2[0] == -84 && bArr2[1] == -19) {
                    z = true;
                } else {
                    z = false;
                }
                byteArrayInputStream.reset();
                if (z) {
                    ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        int readInt = objectInputStream.readInt();
                        while (i2 < readInt) {
                            linkedHashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                            i2++;
                        }
                        objectInputStream.close();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            bue.d(objectInputStream, th);
                            throw th2;
                        }
                    }
                } else {
                    DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                    try {
                        short readShort = dataInputStream.readShort();
                        if (readShort == -21521) {
                            short readShort2 = dataInputStream.readShort();
                            if (readShort2 != 1) {
                                cy7.a(a82.j(readShort2, "Unsupported version number: "));
                            }
                        } else {
                            cy7.a(a82.j(readShort, "Magic number doesn't match: "));
                        }
                        int readInt2 = dataInputStream.readInt();
                        while (i2 < readInt2) {
                            linkedHashMap.put(dataInputStream.readUTF(), g(dataInputStream, dataInputStream.readByte()));
                            i2++;
                        }
                        dataInputStream.close();
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            bue.d(dataInputStream, th3);
                            throw th4;
                        }
                    }
                }
            } catch (IOException e2) {
                r95.n().k(gi2.a, "Error in Data#fromByteArray: ", e2);
            } catch (ClassNotFoundException e3) {
                r95.n().k(gi2.a, "Error in Data#fromByteArray: ", e3);
            }
            return new tf2(linkedHashMap);
        }
        vs.k("Data cannot occupy more than 10240 bytes when serialized");
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Float[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Long[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Integer[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Boolean[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.String[], java.io.Serializable] */
    public static final Serializable g(DataInputStream dataInputStream, byte b2) {
        if (b2 == 0) {
            return null;
        }
        if (b2 == 1) {
            return Boolean.valueOf(dataInputStream.readBoolean());
        }
        if (b2 == 2) {
            return Byte.valueOf(dataInputStream.readByte());
        }
        if (b2 == 3) {
            return Integer.valueOf(dataInputStream.readInt());
        }
        if (b2 == 4) {
            return Long.valueOf(dataInputStream.readLong());
        }
        if (b2 == 5) {
            return Float.valueOf(dataInputStream.readFloat());
        }
        if (b2 == 6) {
            return Double.valueOf(dataInputStream.readDouble());
        }
        if (b2 == 7) {
            return dataInputStream.readUTF();
        }
        int i2 = 0;
        if (b2 == 8) {
            int readInt = dataInputStream.readInt();
            ?? r0 = new Boolean[readInt];
            while (i2 < readInt) {
                r0[i2] = Boolean.valueOf(dataInputStream.readBoolean());
                i2++;
            }
            return r0;
        } else if (b2 == 9) {
            int readInt2 = dataInputStream.readInt();
            ?? r02 = new Byte[readInt2];
            while (i2 < readInt2) {
                r02[i2] = Byte.valueOf(dataInputStream.readByte());
                i2++;
            }
            return r02;
        } else if (b2 == 10) {
            int readInt3 = dataInputStream.readInt();
            ?? r03 = new Integer[readInt3];
            while (i2 < readInt3) {
                r03[i2] = Integer.valueOf(dataInputStream.readInt());
                i2++;
            }
            return r03;
        } else if (b2 == 11) {
            int readInt4 = dataInputStream.readInt();
            ?? r04 = new Long[readInt4];
            while (i2 < readInt4) {
                r04[i2] = Long.valueOf(dataInputStream.readLong());
                i2++;
            }
            return r04;
        } else if (b2 == 12) {
            int readInt5 = dataInputStream.readInt();
            ?? r05 = new Float[readInt5];
            while (i2 < readInt5) {
                r05[i2] = Float.valueOf(dataInputStream.readFloat());
                i2++;
            }
            return r05;
        } else if (b2 == 13) {
            int readInt6 = dataInputStream.readInt();
            ?? r06 = new Double[readInt6];
            while (i2 < readInt6) {
                r06[i2] = Double.valueOf(dataInputStream.readDouble());
                i2++;
            }
            return r06;
        } else if (b2 == 14) {
            int readInt7 = dataInputStream.readInt();
            ?? r1 = new String[readInt7];
            while (i2 < readInt7) {
                String readUTF = dataInputStream.readUTF();
                if (c16.i(readUTF, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                    readUTF = null;
                }
                r1[i2] = readUTF;
                i2++;
            }
            return r1;
        } else {
            vs.k(a82.j(b2, "Unsupported type "));
            return null;
        }
    }

    public static int h(float f2) {
        float f3;
        boolean z;
        float f4;
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f5 = (f2 + 16.0f) / 116.0f;
        if (f2 > 8.0f) {
            f3 = f5 * f5 * f5;
        } else {
            f3 = f2 / 903.2963f;
        }
        float f6 = f5 * f5 * f5;
        if (f6 > 0.008856452f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f4 = f6;
        } else {
            f4 = ((f5 * 116.0f) - 16.0f) / 903.2963f;
        }
        if (!z) {
            f6 = ((f5 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = c;
        return tn1.a(f4 * fArr[0], f3 * fArr[1], f6 * fArr[2]);
    }

    public static float i(int i2) {
        float pow;
        float f2 = i2 / 255.0f;
        if (f2 <= 0.04045f) {
            pow = f2 / 12.92f;
        } else {
            pow = (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d);
        }
        return pow * 100.0f;
    }

    public static apc j(apc apcVar, String[] strArr, Map map) {
        int i2 = 0;
        if (apcVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (apc) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                apc apcVar2 = new apc();
                int length = strArr.length;
                while (i2 < length) {
                    apcVar2.a((apc) map.get(strArr[i2]));
                    i2++;
                }
                return apcVar2;
            }
        } else if (strArr != null && strArr.length == 1) {
            apcVar.a((apc) map.get(strArr[0]));
            return apcVar;
        } else if (strArr != null && strArr.length > 1) {
            int length2 = strArr.length;
            while (i2 < length2) {
                apcVar.a((apc) map.get(strArr[i2]));
                i2++;
            }
        }
        return apcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(int r6, java.lang.Object r7, defpackage.rf r8, defpackage.dq4 r9, int r10) {
        /*
            boolean r0 = r7 instanceof android.graphics.Typeface
            if (r0 != 0) goto L5
            return r7
        L5:
            r0 = r6 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L29
            dq4 r0 = r8.a
            boolean r0 = defpackage.c16.i(r0, r9)
            if (r0 != 0) goto L29
            dq4 r0 = defpackage.dq4.d
            int r3 = r9.compareTo(r0)
            if (r3 < 0) goto L29
            dq4 r3 = r8.a
            int r3 = r3.a
            int r0 = r0.a
            int r0 = defpackage.c16.l(r3, r0)
            if (r0 >= 0) goto L29
            r0 = r2
            goto L2a
        L29:
            r0 = r1
        L2a:
            r3 = 2
            r6 = r6 & r3
            if (r6 == 0) goto L36
            r8.getClass()
            if (r10 != 0) goto L34
            goto L36
        L34:
            r6 = r2
            goto L37
        L36:
            r6 = r1
        L37:
            if (r6 != 0) goto L3c
            if (r0 != 0) goto L3c
            return r7
        L3c:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 28
            if (r4 >= r5) goto L5d
            if (r6 == 0) goto L48
            if (r10 != r2) goto L48
            r6 = r2
            goto L49
        L48:
            r6 = r1
        L49:
            if (r6 == 0) goto L4f
            if (r0 == 0) goto L4f
            r1 = 3
            goto L56
        L4f:
            if (r0 == 0) goto L53
            r1 = r2
            goto L56
        L53:
            if (r6 == 0) goto L56
            r1 = r3
        L56:
            android.graphics.Typeface r7 = (android.graphics.Typeface) r7
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r7, r1)
            return r6
        L5d:
            if (r0 == 0) goto L62
            int r9 = r9.a
            goto L66
        L62:
            dq4 r9 = r8.a
            int r9 = r9.a
        L66:
            if (r6 == 0) goto L6c
            if (r10 != r2) goto L6f
            r1 = r2
            goto L6f
        L6c:
            r8.getClass()
        L6f:
            android.graphics.Typeface r7 = (android.graphics.Typeface) r7
            android.graphics.Typeface r6 = defpackage.ru.f(r7, r9, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rae.k(int, java.lang.Object, rf, dq4, int):java.lang.Object");
    }

    public static byte[] l(tf2 tf2Var) {
        tf2Var.getClass();
        HashMap hashMap = tf2Var.a;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeShort(-21521);
            dataOutputStream.writeShort(1);
            dataOutputStream.writeInt(hashMap.size());
            for (Map.Entry entry : hashMap.entrySet()) {
                m(dataOutputStream, (String) entry.getKey(), entry.getValue());
            }
            dataOutputStream.flush();
            if (dataOutputStream.size() <= 10240) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                dataOutputStream.close();
                byteArray.getClass();
                return byteArray;
            }
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        } catch (IOException e2) {
            r95.n().k(gi2.a, "Error in Data#toByteArray: ", e2);
            return new byte[0];
        }
    }

    public static final void m(DataOutputStream dataOutputStream, String str, Object obj) {
        int i2;
        double d2;
        float f2;
        long j2;
        int i3;
        byte b2;
        boolean z;
        if (obj == null) {
            dataOutputStream.writeByte(0);
        } else if (obj instanceof Boolean) {
            dataOutputStream.writeByte(1);
            dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
        } else if (obj instanceof Byte) {
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte(((Number) obj).byteValue());
        } else if (obj instanceof Integer) {
            dataOutputStream.writeByte(3);
            dataOutputStream.writeInt(((Number) obj).intValue());
        } else if (obj instanceof Long) {
            dataOutputStream.writeByte(4);
            dataOutputStream.writeLong(((Number) obj).longValue());
        } else if (obj instanceof Float) {
            dataOutputStream.writeByte(5);
            dataOutputStream.writeFloat(((Number) obj).floatValue());
        } else if (obj instanceof Double) {
            dataOutputStream.writeByte(6);
            dataOutputStream.writeDouble(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            dataOutputStream.writeByte(7);
            dataOutputStream.writeUTF((String) obj);
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            gi1 a2 = cm9.a(objArr.getClass());
            if (a2.equals(cm9.a(Boolean[].class))) {
                i2 = 8;
            } else if (a2.equals(cm9.a(Byte[].class))) {
                i2 = 9;
            } else if (a2.equals(cm9.a(Integer[].class))) {
                i2 = 10;
            } else if (a2.equals(cm9.a(Long[].class))) {
                i2 = 11;
            } else if (a2.equals(cm9.a(Float[].class))) {
                i2 = 12;
            } else if (a2.equals(cm9.a(Double[].class))) {
                i2 = 13;
            } else if (a2.equals(cm9.a(String[].class))) {
                i2 = 14;
            } else {
                fb4.m(cm9.a(objArr.getClass()).f(), "Unsupported value type ");
                return;
            }
            dataOutputStream.writeByte(i2);
            dataOutputStream.writeInt(objArr.length);
            for (Object obj2 : objArr) {
                String str2 = null;
                Boolean bool = null;
                Byte b3 = null;
                Integer num = null;
                Long l2 = null;
                Float f3 = null;
                Double d3 = null;
                if (i2 == 8) {
                    if (obj2 instanceof Boolean) {
                        bool = (Boolean) obj2;
                    }
                    if (bool != null) {
                        z = bool.booleanValue();
                    } else {
                        z = false;
                    }
                    dataOutputStream.writeBoolean(z);
                } else if (i2 == 9) {
                    if (obj2 instanceof Byte) {
                        b3 = (Byte) obj2;
                    }
                    if (b3 != null) {
                        b2 = b3.byteValue();
                    } else {
                        b2 = 0;
                    }
                    dataOutputStream.writeByte(b2);
                } else if (i2 == 10) {
                    if (obj2 instanceof Integer) {
                        num = (Integer) obj2;
                    }
                    if (num != null) {
                        i3 = num.intValue();
                    } else {
                        i3 = 0;
                    }
                    dataOutputStream.writeInt(i3);
                } else if (i2 == 11) {
                    if (obj2 instanceof Long) {
                        l2 = (Long) obj2;
                    }
                    if (l2 != null) {
                        j2 = l2.longValue();
                    } else {
                        j2 = 0;
                    }
                    dataOutputStream.writeLong(j2);
                } else if (i2 == 12) {
                    if (obj2 instanceof Float) {
                        f3 = (Float) obj2;
                    }
                    if (f3 != null) {
                        f2 = f3.floatValue();
                    } else {
                        f2 = nae.e;
                    }
                    dataOutputStream.writeFloat(f2);
                } else if (i2 == 13) {
                    if (obj2 instanceof Double) {
                        d3 = (Double) obj2;
                    }
                    if (d3 != null) {
                        d2 = d3.doubleValue();
                    } else {
                        d2 = 0.0d;
                    }
                    dataOutputStream.writeDouble(d2);
                } else if (i2 == 14) {
                    if (obj2 instanceof String) {
                        str2 = (String) obj2;
                    }
                    if (str2 == null) {
                        str2 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                    }
                    dataOutputStream.writeUTF(str2);
                }
            }
        } else {
            fb4.m(cm9.a(obj.getClass()).g(), "Unsupported value type ");
            return;
        }
        dataOutputStream.writeUTF(str);
    }

    public static final long n(byte[] bArr, int i2) {
        bArr.getClass();
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    public static float o() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }

    public static int p(int i2, int i3) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i3 != 0) {
            int i4 = i2 / i3;
            int i5 = i2 - (i3 * i4);
            if (i5 != 0) {
                int i6 = ((i2 ^ i3) >> 31) | 1;
                switch (doe.a[roundingMode.ordinal()]) {
                    case 1:
                        throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                    case 2:
                        return i4;
                    case 3:
                        if (i6 >= 0) {
                            return i4;
                        }
                        break;
                    case 4:
                        break;
                    case 5:
                        if (i6 <= 0) {
                            return i4;
                        }
                        break;
                    case 6:
                    case 7:
                    case 8:
                        int abs = Math.abs(i5);
                        int abs2 = abs - (Math.abs(i3) - abs);
                        if (abs2 == 0) {
                            RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                            RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                            return i4;
                        } else if (abs2 <= 0) {
                            return i4;
                        }
                        break;
                    default:
                        cp8.i();
                        return 0;
                }
                return i4 + i6;
            }
            return i4;
        }
        throw new ArithmeticException("/ by zero");
    }

    public abstract void d();
}

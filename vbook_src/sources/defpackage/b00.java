package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
/* renamed from: b00  reason: default package */
/* loaded from: classes.dex */
public abstract class b00 extends sue {
    public static List A0(float[] fArr) {
        fArr.getClass();
        int length = fArr.length;
        if (length != 0) {
            if (length != 1) {
                ArrayList arrayList = new ArrayList(fArr.length);
                for (float f : fArr) {
                    arrayList.add(Float.valueOf(f));
                }
                return arrayList;
            }
            return tl1.A(Float.valueOf(fArr[0]));
        }
        return ks3.a;
    }

    public static List B0(int[] iArr) {
        iArr.getClass();
        int length = iArr.length;
        if (length != 0) {
            if (length != 1) {
                ArrayList arrayList = new ArrayList(iArr.length);
                for (int i : iArr) {
                    arrayList.add(Integer.valueOf(i));
                }
                return arrayList;
            }
            return tl1.A(Integer.valueOf(iArr[0]));
        }
        return ks3.a;
    }

    public static List C0(long[] jArr) {
        jArr.getClass();
        int length = jArr.length;
        if (length != 0) {
            if (length != 1) {
                ArrayList arrayList = new ArrayList(jArr.length);
                for (long j : jArr) {
                    arrayList.add(Long.valueOf(j));
                }
                return arrayList;
            }
            return tl1.A(Long.valueOf(jArr[0]));
        }
        return ks3.a;
    }

    public static List D0(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                List asList = Arrays.asList(Arrays.copyOf(objArr, objArr.length));
                asList.getClass();
                return asList;
            }
            return tl1.A(objArr[0]);
        }
        return ks3.a;
    }

    public static List E0(short[] sArr) {
        sArr.getClass();
        int length = sArr.length;
        if (length != 0) {
            if (length != 1) {
                ArrayList arrayList = new ArrayList(sArr.length);
                for (short s : sArr) {
                    arrayList.add(Short.valueOf(s));
                }
                return arrayList;
            }
            return tl1.A(Short.valueOf(sArr[0]));
        }
        return ks3.a;
    }

    public static Set F0(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(p17.k(objArr.length));
                x0(objArr, linkedHashSet);
                return linkedHashSet;
            }
            return fca.B(objArr[0]);
        }
        return rs3.a;
    }

    public static boolean R(int i, int[] iArr) {
        iArr.getClass();
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                if (i == iArr[i2]) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 < 0) {
            return false;
        }
        return true;
    }

    public static boolean S(Object obj, Object[] objArr) {
        objArr.getClass();
        if (r0(obj, objArr) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean T(Object[] objArr, Object[] objArr2) {
        if (objArr != objArr2) {
            if (objArr.length == objArr2.length) {
                int length = objArr.length;
                for (int i = 0; i < length; i++) {
                    Object obj = objArr[i];
                    Object obj2 = objArr2[i];
                    if (obj != obj2) {
                        if (obj != null && obj2 != null) {
                            if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                                if (!T((Object[]) obj, (Object[]) obj2)) {
                                }
                            } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                                if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                                }
                            } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                                if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                                }
                            } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                                if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                                }
                            } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                                if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                                }
                            } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                                if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                                }
                            } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                                if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                                }
                            } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                                if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                                }
                            } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                                if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                                }
                            } else if ((obj instanceof jtc) && (obj2 instanceof jtc)) {
                                if (!Arrays.equals(((jtc) obj).a, ((jtc) obj2).a)) {
                                }
                            } else if ((obj instanceof buc) && (obj2 instanceof buc)) {
                                if (!Arrays.equals(((buc) obj).a, ((buc) obj2).a)) {
                                }
                            } else if ((obj instanceof otc) && (obj2 instanceof otc)) {
                                if (!Arrays.equals(((otc) obj).a, ((otc) obj2).a)) {
                                }
                            } else if ((obj instanceof ttc) && (obj2 instanceof ttc)) {
                                if (!Arrays.equals(((ttc) obj).a, ((ttc) obj2).a)) {
                                }
                            } else if (!obj.equals(obj2)) {
                            }
                        }
                    }
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public static void U(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        bArr2.getClass();
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    public static void V(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        iArr.getClass();
        iArr2.getClass();
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static void W(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static void X(char[] cArr, char[] cArr2, int i, int i2, int i3) {
        cArr.getClass();
        cArr2.getClass();
        System.arraycopy(cArr, i2, cArr2, i, i3 - i2);
    }

    public static void Y(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        jArr.getClass();
        jArr2.getClass();
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
    }

    public static /* synthetic */ void Z(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = iArr.length;
        }
        V(i, 0, i2, iArr, iArr2);
    }

    public static /* synthetic */ void a0(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        W(0, i, i2, objArr, objArr2);
    }

    public static void b0(int i, int i2, float[] fArr, float[] fArr2) {
        int i3;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 8) != 0) {
            i3 = fArr.length;
        } else {
            i3 = 6;
        }
        fArr.getClass();
        System.arraycopy(fArr, 0, fArr2, i, i3);
    }

    public static /* synthetic */ void c0(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = bArr.length;
        }
        U(i, i2, i3, bArr, bArr2);
    }

    public static byte[] d0(byte[] bArr, int i, int i2) {
        bArr.getClass();
        sue.m(i2, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
        copyOfRange.getClass();
        return copyOfRange;
    }

    public static Object[] e0(Object[] objArr, int i, int i2) {
        objArr.getClass();
        sue.m(i2, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i, i2);
        copyOfRange.getClass();
        return copyOfRange;
    }

    public static List f0(int i, Object[] objArr) {
        if (i >= 0) {
            int length = objArr.length - i;
            if (length < 0) {
                length = 0;
            }
            if (length >= 0) {
                if (length == 0) {
                    return ks3.a;
                }
                int length2 = objArr.length;
                if (length >= length2) {
                    return D0(objArr);
                }
                if (length == 1) {
                    return tl1.A(objArr[length2 - 1]);
                }
                List asList = Arrays.asList(e0(objArr, length2 - length, length2));
                asList.getClass();
                return asList;
            }
            p1a.k(hl5.l("Requested element count ", " is less than zero.", length));
            return null;
        }
        p1a.k(hl5.l("Requested element count ", " is less than zero.", i));
        return null;
    }

    public static void g0(int i, int i2, Object obj, Object[] objArr) {
        objArr.getClass();
        Arrays.fill(objArr, i, i2, obj);
    }

    public static void h0(int i, int i2, int i3, int[] iArr) {
        if ((i3 & 4) != 0) {
            i2 = iArr.length;
        }
        iArr.getClass();
        Arrays.fill(iArr, 0, i2, i);
    }

    public static void i0(byte[] bArr, byte b) {
        int length = bArr.length;
        bArr.getClass();
        Arrays.fill(bArr, 0, length, b);
    }

    public static void j0(long[] jArr, long j) {
        int length = jArr.length;
        jArr.getClass();
        Arrays.fill(jArr, 0, length, j);
    }

    public static ArrayList l0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object m0(Object[] objArr) {
        objArr.getClass();
        if (objArr.length != 0) {
            return objArr[0];
        }
        p1a.l("Array is empty.");
        return null;
    }

    public static Object n0(Object[] objArr) {
        objArr.getClass();
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ty5, ry5] */
    public static ty5 o0(int[] iArr) {
        return new ry5(0, iArr.length - 1, 1);
    }

    public static int p0(long[] jArr) {
        jArr.getClass();
        return jArr.length - 1;
    }

    public static Object q0(int i, Object[] objArr) {
        objArr.getClass();
        if (i >= 0 && i < objArr.length) {
            return objArr[i];
        }
        return null;
    }

    public static int r0(Object obj, Object[] objArr) {
        objArr.getClass();
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static String s0(Object[] objArr, String str, String str2, String str3, xt4 xt4Var, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        if ((i & 32) != 0) {
            xt4Var = null;
        }
        objArr.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int i2 = 0;
        for (Object obj : objArr) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) str);
            }
            hre.g(sb, obj, xt4Var);
        }
        sb.append((CharSequence) str3);
        return sb.toString();
    }

    public static Object t0(Object[] objArr) {
        if (objArr.length != 0) {
            return objArr[objArr.length - 1];
        }
        p1a.l("Array is empty.");
        return null;
    }

    public static Float u0(float[] fArr) {
        fArr.getClass();
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[fArr.length - 1]);
    }

    public static int v0(int[] iArr) {
        if (iArr.length != 0) {
            int i = iArr[0];
            int i2 = 1;
            int length = iArr.length - 1;
            if (1 <= length) {
                while (true) {
                    int i3 = iArr[i2];
                    if (i < i3) {
                        i = i3;
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            return i;
        }
        xk5.g();
        return 0;
    }

    public static char w0(char[] cArr) {
        int length = cArr.length;
        if (length != 0) {
            if (length == 1) {
                return cArr[0];
            }
            vs.m("Array has more than one element.");
            return (char) 0;
        }
        p1a.l("Array is empty.");
        return (char) 0;
    }

    public static final void x0(Object[] objArr, HashSet hashSet) {
        objArr.getClass();
        for (Object obj : objArr) {
            hashSet.add(obj);
        }
    }

    public static List y0(byte[] bArr) {
        bArr.getClass();
        int length = bArr.length;
        if (length != 0) {
            if (length != 1) {
                ArrayList arrayList = new ArrayList(bArr.length);
                for (byte b : bArr) {
                    arrayList.add(Byte.valueOf(b));
                }
                return arrayList;
            }
            return tl1.A(Byte.valueOf(bArr[0]));
        }
        return ks3.a;
    }

    public static List z0(double[] dArr) {
        dArr.getClass();
        int length = dArr.length;
        if (length != 0) {
            if (length != 1) {
                ArrayList arrayList = new ArrayList(dArr.length);
                for (double d : dArr) {
                    arrayList.add(Double.valueOf(d));
                }
                return arrayList;
            }
            return tl1.A(Double.valueOf(dArr[0]));
        }
        return ks3.a;
    }
}

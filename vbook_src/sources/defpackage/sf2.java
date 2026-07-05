package defpackage;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sf2  reason: default package */
/* loaded from: classes.dex */
public final class sf2 implements tv9 {
    public final LinkedHashMap a;

    public sf2(int i) {
        switch (i) {
            case 1:
                this.a = new LinkedHashMap();
                return;
            default:
                this.a = new LinkedHashMap();
                return;
        }
    }

    @Override // defpackage.tv9
    public sv9 a(String str, String str2) {
        LinkedHashMap linkedHashMap = this.a;
        Object obj = linkedHashMap.get(str);
        if (obj == null) {
            obj = new sl(ws0.a(str2));
            linkedHashMap.put(str, obj);
        }
        return (sv9) obj;
    }

    public tf2 b() {
        tf2 tf2Var = new tf2(this.a);
        rae.l(tf2Var);
        return tf2Var;
    }

    public List c() {
        Set keySet = this.a.keySet();
        keySet.getClass();
        return sl1.C0(keySet);
    }

    public void d(Object obj, String str) {
        Object[] objArr;
        str.getClass();
        if (obj == null) {
            obj = null;
        } else {
            gi1 a = cm9.a(obj.getClass());
            if (!a.equals(cm9.a(Boolean.TYPE)) && !a.equals(cm9.a(Byte.TYPE)) && !a.equals(cm9.a(Integer.TYPE)) && !a.equals(cm9.a(Long.TYPE)) && !a.equals(cm9.a(Float.TYPE)) && !a.equals(cm9.a(Double.TYPE)) && !a.equals(cm9.a(String.class)) && !a.equals(cm9.a(Boolean[].class)) && !a.equals(cm9.a(Byte[].class)) && !a.equals(cm9.a(Integer[].class)) && !a.equals(cm9.a(Long[].class)) && !a.equals(cm9.a(Float[].class)) && !a.equals(cm9.a(Double[].class)) && !a.equals(cm9.a(String[].class))) {
                int i = 0;
                if (a.equals(cm9.a(boolean[].class))) {
                    boolean[] zArr = (boolean[]) obj;
                    String str2 = gi2.a;
                    int length = zArr.length;
                    objArr = new Boolean[length];
                    while (i < length) {
                        objArr[i] = Boolean.valueOf(zArr[i]);
                        i++;
                    }
                } else if (a.equals(cm9.a(byte[].class))) {
                    byte[] bArr = (byte[]) obj;
                    String str3 = gi2.a;
                    int length2 = bArr.length;
                    objArr = new Byte[length2];
                    while (i < length2) {
                        objArr[i] = Byte.valueOf(bArr[i]);
                        i++;
                    }
                } else if (a.equals(cm9.a(int[].class))) {
                    int[] iArr = (int[]) obj;
                    String str4 = gi2.a;
                    int length3 = iArr.length;
                    objArr = new Integer[length3];
                    while (i < length3) {
                        objArr[i] = Integer.valueOf(iArr[i]);
                        i++;
                    }
                } else if (a.equals(cm9.a(long[].class))) {
                    long[] jArr = (long[]) obj;
                    String str5 = gi2.a;
                    int length4 = jArr.length;
                    objArr = new Long[length4];
                    while (i < length4) {
                        objArr[i] = Long.valueOf(jArr[i]);
                        i++;
                    }
                } else if (a.equals(cm9.a(float[].class))) {
                    float[] fArr = (float[]) obj;
                    String str6 = gi2.a;
                    int length5 = fArr.length;
                    objArr = new Float[length5];
                    while (i < length5) {
                        objArr[i] = Float.valueOf(fArr[i]);
                        i++;
                    }
                } else if (a.equals(cm9.a(double[].class))) {
                    double[] dArr = (double[]) obj;
                    String str7 = gi2.a;
                    int length6 = dArr.length;
                    objArr = new Double[length6];
                    while (i < length6) {
                        objArr[i] = Double.valueOf(dArr[i]);
                        i++;
                    }
                } else {
                    vm1.g("Key ", str, " has invalid type ", a);
                    return;
                }
                obj = objArr;
            }
        }
        this.a.put(str, obj);
    }

    public void e(HashMap hashMap) {
        hashMap.getClass();
        for (Map.Entry entry : hashMap.entrySet()) {
            d(entry.getValue(), (String) entry.getKey());
        }
    }

    public String f(String str) {
        str.getClass();
        byte[] bArr = (byte[]) this.a.get(str);
        if (bArr != null) {
            return new String(bArr, ed1.a);
        }
        return null;
    }

    public sf2(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }
}

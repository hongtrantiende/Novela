package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n1a  reason: default package */
/* loaded from: classes.dex */
public final class n1a extends c3e {
    public long b;
    public long[] c;
    public long[] d;

    public static Serializable Y(int i, km8 km8Var) {
        if (i != 0) {
            boolean z = false;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 8) {
                            if (i != 10) {
                                if (i != 11) {
                                    return null;
                                }
                                Date date = new Date((long) Double.longBitsToDouble(km8Var.t()));
                                km8Var.N(2);
                                return date;
                            }
                            int D = km8Var.D();
                            ArrayList arrayList = new ArrayList(D);
                            for (int i2 = 0; i2 < D; i2++) {
                                Serializable Y = Y(km8Var.z(), km8Var);
                                if (Y != null) {
                                    arrayList.add(Y);
                                }
                            }
                            return arrayList;
                        }
                        return Z(km8Var);
                    }
                    HashMap hashMap = new HashMap();
                    while (true) {
                        String a0 = a0(km8Var);
                        int z2 = km8Var.z();
                        if (z2 == 9) {
                            return hashMap;
                        }
                        Serializable Y2 = Y(z2, km8Var);
                        if (Y2 != null) {
                            hashMap.put(a0, Y2);
                        }
                    }
                } else {
                    return a0(km8Var);
                }
            } else {
                if (km8Var.z() == 1) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        } else {
            return Double.valueOf(Double.longBitsToDouble(km8Var.t()));
        }
    }

    public static HashMap Z(km8 km8Var) {
        int D = km8Var.D();
        HashMap hashMap = new HashMap(D);
        for (int i = 0; i < D; i++) {
            String a0 = a0(km8Var);
            Serializable Y = Y(km8Var.z(), km8Var);
            if (Y != null) {
                hashMap.put(a0, Y);
            }
        }
        return hashMap;
    }

    public static String a0(km8 km8Var) {
        int G = km8Var.G();
        int i = km8Var.b;
        km8Var.N(G);
        return new String(km8Var.a, i, G);
    }
}

package defpackage;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tre  reason: default package */
/* loaded from: classes.dex */
public final class tre extends cse {
    public final int a;
    public final mee b;

    public tre(mee meeVar) {
        meeVar.getClass();
        this.b = meeVar;
        jwc k = meeVar.entrySet().k();
        int i = 0;
        while (k.hasNext()) {
            Map.Entry entry = (Map.Entry) k.next();
            int a = ((cse) entry.getKey()).a();
            i = i < a ? a : i;
            int a2 = ((cse) entry.getValue()).a();
            if (i < a2) {
                i = a2;
            }
        }
        int i2 = i + 1;
        this.a = i2;
        if (i2 <= 8) {
            return;
        }
        throw new IOException("Exceeded cutoff limit for max depth of cbor value");
    }

    @Override // defpackage.cse
    public final int a() {
        return this.a;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int compareTo;
        cse cseVar = (cse) obj;
        int zza = cseVar.zza();
        int c = cse.c((byte) -96);
        if (c != zza) {
            return c - cseVar.zza();
        }
        mee meeVar = ((tre) cseVar).b;
        mee meeVar2 = this.b;
        if (meeVar2.d.size() != meeVar.d.size()) {
            return meeVar2.d.size() - meeVar.d.size();
        }
        jwc k = meeVar2.entrySet().k();
        jwc k2 = meeVar.entrySet().k();
        do {
            if (!k.hasNext() && !k2.hasNext()) {
                return 0;
            }
            Map.Entry entry = (Map.Entry) k.next();
            Map.Entry entry2 = (Map.Entry) k2.next();
            int compareTo2 = ((cse) entry.getKey()).compareTo((cse) entry2.getKey());
            if (compareTo2 != 0) {
                return compareTo2;
            }
            compareTo = ((cse) entry.getValue()).compareTo((cse) entry2.getValue());
        } while (compareTo == 0);
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tre.class != obj.getClass()) {
            return false;
        }
        return this.b.equals(((tre) obj).b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(cse.c((byte) -96)), this.b});
    }

    public final String toString() {
        mee meeVar = this.b;
        if (meeVar.isEmpty()) {
            return "{}";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        jwc k = meeVar.entrySet().k();
        while (k.hasNext()) {
            Map.Entry entry = (Map.Entry) k.next();
            linkedHashMap.put(((cse) entry.getKey()).toString().replace("\n", "\n  "), ((cse) entry.getValue()).toString().replace("\n", "\n  "));
        }
        fn8 fn8Var = new fn8(10);
        StringBuilder sb = new StringBuilder("{\n  ");
        try {
            jsc.L(sb, linkedHashMap.entrySet().iterator(), fn8Var);
            sb.append("\n}");
            return sb.toString();
        } catch (IOException e) {
            vs.j(e);
            return null;
        }
    }

    @Override // defpackage.cse
    public final int zza() {
        return cse.c((byte) -96);
    }
}

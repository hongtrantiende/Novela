package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bre  reason: default package */
/* loaded from: classes.dex */
public final class bre extends cse {
    public final vde a;
    public final int b;

    public bre(nfe nfeVar) {
        nfeVar.getClass();
        this.a = nfeVar;
        int i = 0;
        int i2 = 0;
        while (true) {
            vde vdeVar = this.a;
            if (i >= vdeVar.size()) {
                break;
            }
            int a = ((cse) vdeVar.get(i)).a();
            if (i2 < a) {
                i2 = a;
            }
            i++;
        }
        int i3 = i2 + 1;
        this.b = i3;
        if (i3 <= 8) {
            return;
        }
        throw new IOException("Exceeded cutoff limit for max depth of cbor value");
    }

    @Override // defpackage.cse
    public final int a() {
        return this.b;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        cse cseVar = (cse) obj;
        int zza = cseVar.zza();
        int c = cse.c(Byte.MIN_VALUE);
        if (c != zza) {
            return c - cseVar.zza();
        }
        vde vdeVar = ((bre) cseVar).a;
        vde vdeVar2 = this.a;
        if (vdeVar2.size() != vdeVar.size()) {
            return vdeVar2.size() - vdeVar.size();
        }
        for (int i = 0; i < vdeVar2.size(); i++) {
            int compareTo = ((cse) vdeVar2.get(i)).compareTo((cse) vdeVar.get(i));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bre.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((bre) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(cse.c(Byte.MIN_VALUE)), this.a});
    }

    public final String toString() {
        vde vdeVar = this.a;
        if (vdeVar.isEmpty()) {
            return "[]";
        }
        ArrayList arrayList = new ArrayList();
        int size = vdeVar.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((cse) vdeVar.get(i)).toString().replace("\n", "\n  "));
        }
        StringBuilder sb = new StringBuilder("[\n  ");
        Iterator it = arrayList.iterator();
        try {
            if (it.hasNext()) {
                sb.append(fn8.m(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) ",\n  ");
                    sb.append(fn8.m(it.next()));
                }
            }
            sb.append("\n]");
            return sb.toString();
        } catch (IOException e) {
            vs.j(e);
            return null;
        }
    }

    @Override // defpackage.cse
    public final int zza() {
        return cse.c(Byte.MIN_VALUE);
    }
}

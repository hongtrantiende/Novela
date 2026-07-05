package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ure  reason: default package */
/* loaded from: classes.dex */
public final class ure extends cse {
    public final String a;

    public ure(String str) {
        this.a = str;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        cse cseVar = (cse) obj;
        int zza = cseVar.zza();
        int c = cse.c((byte) 96);
        if (c != zza) {
            return c - cseVar.zza();
        }
        String str = ((ure) cseVar).a;
        int length = str.length();
        String str2 = this.a;
        if (str2.length() != length) {
            return str2.length() - str.length();
        }
        return str2.compareTo(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ure.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((ure) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(cse.c((byte) 96)), this.a});
    }

    public final String toString() {
        return s21.q(new StringBuilder("\""), this.a, "\"");
    }

    @Override // defpackage.cse
    public final int zza() {
        return cse.c((byte) 96);
    }
}

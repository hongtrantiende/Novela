package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nre  reason: default package */
/* loaded from: classes.dex */
public final class nre extends cse {
    public final long a;

    public nre(long j) {
        this.a = j;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        cse cseVar = (cse) obj;
        if (zza() != cseVar.zza()) {
            return zza() - cseVar.zza();
        }
        int i = (Math.abs(this.a) > Math.abs(((nre) cseVar).a) ? 1 : (Math.abs(this.a) == Math.abs(((nre) cseVar).a) ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i > 0) {
            return 1;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && nre.class == obj.getClass() && this.a == ((nre) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zza()), Long.valueOf(this.a)});
    }

    public final String toString() {
        return Long.toString(this.a);
    }

    @Override // defpackage.cse
    public final int zza() {
        byte b;
        if (this.a >= 0) {
            b = 0;
        } else {
            b = 32;
        }
        return cse.c(b);
    }
}

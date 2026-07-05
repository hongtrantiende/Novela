package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ere  reason: default package */
/* loaded from: classes.dex */
public final class ere extends cse {
    public final boolean a;

    public ere(boolean z) {
        this.a = z;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i;
        cse cseVar = (cse) obj;
        int zza = cseVar.zza();
        int c = cse.c((byte) -32);
        if (c != zza) {
            return c - cseVar.zza();
        }
        ere ereVar = (ere) cseVar;
        int i2 = 21;
        if (true != this.a) {
            i = 20;
        } else {
            i = 21;
        }
        if (true != ereVar.a) {
            i2 = 20;
        }
        return i - i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ere.class == obj.getClass() && this.a == ((ere) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(cse.c((byte) -32)), Boolean.valueOf(this.a)});
    }

    public final String toString() {
        return Boolean.toString(this.a);
    }

    @Override // defpackage.cse
    public final int zza() {
        return cse.c((byte) -32);
    }
}

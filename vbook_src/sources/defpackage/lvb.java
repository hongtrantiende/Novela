package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lvb  reason: default package */
/* loaded from: classes.dex */
public final class lvb {
    public final uva a;
    public final uva b;
    public final uva c;
    public final uva d;

    public lvb(uva uvaVar, uva uvaVar2, uva uvaVar3, uva uvaVar4) {
        this.a = uvaVar;
        this.b = uvaVar2;
        this.c = uvaVar3;
        this.d = uvaVar4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof lvb)) {
            return false;
        }
        lvb lvbVar = (lvb) obj;
        if (c16.i(this.a, lvbVar.a) && c16.i(this.b, lvbVar.b) && c16.i(this.c, lvbVar.c) && c16.i(this.d, lvbVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        uva uvaVar = this.a;
        if (uvaVar != null) {
            i = uvaVar.hashCode();
        } else {
            i = 0;
        }
        int i5 = i * 31;
        uva uvaVar2 = this.b;
        if (uvaVar2 != null) {
            i2 = uvaVar2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        uva uvaVar3 = this.c;
        if (uvaVar3 != null) {
            i3 = uvaVar3.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        uva uvaVar4 = this.d;
        if (uvaVar4 != null) {
            i4 = uvaVar4.hashCode();
        }
        return i7 + i4;
    }
}

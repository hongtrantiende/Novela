package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sfb  reason: default package */
/* loaded from: classes.dex */
public final class sfb {
    public static final /* synthetic */ int c = 0;
    public final long a;
    public final Boolean b;

    static {
        new sfb(0L, 3);
        new sfb(zl1.h, 2);
        sve.b(Integer.MAX_VALUE);
        sve.b(2130706432);
    }

    public sfb(long j, int i) {
        this((i & 1) != 0 ? zl1.i : j, (Boolean) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sfb)) {
            return false;
        }
        sfb sfbVar = (sfb) obj;
        if (zl1.c(this.a, sfbVar.a) && c16.i(this.b, sfbVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = zl1.j;
        int hashCode2 = Long.hashCode(this.a) * 31;
        Boolean bool = this.b;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        String i = zl1.i(this.a);
        return "SystemBarStyle(color=" + i + ", darkContent=" + this.b + ")";
    }

    public sfb(long j, Boolean bool) {
        this.a = j;
        this.b = bool;
    }
}

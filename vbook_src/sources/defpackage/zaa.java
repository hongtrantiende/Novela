package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: zaa  reason: default package */
/* loaded from: classes.dex */
public final class zaa {
    public static final yaa Companion = new Object();
    public final String a;
    public final String b;
    public final int c;
    public final long d;

    public /* synthetic */ zaa(int i, String str, String str2, int i2, long j) {
        if (15 == (i & 15)) {
            this.a = str;
            this.b = str2;
            this.c = i2;
            this.d = j;
            return;
        }
        w92.x(i, 15, xaa.a.e());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zaa)) {
            return false;
        }
        zaa zaaVar = (zaa) obj;
        if (c16.i(this.a, zaaVar.a) && c16.i(this.b, zaaVar.b) && this.c == zaaVar.c && this.d == zaaVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + hl5.a(this.c, eub.j(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.a + ", firstSessionId=" + this.b + ", sessionIndex=" + this.c + ", sessionStartTimestampUs=" + this.d + ')';
    }

    public zaa(int i, long j, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
    }
}

package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: vcb  reason: default package */
/* loaded from: classes3.dex */
public final class vcb {
    public static final ucb Companion = new Object();
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final int e;
    public final long f;

    public /* synthetic */ vcb(int i, String str, String str2, int i2, String str3, int i3, long j) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = 0;
        } else {
            this.c = i2;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = 0;
        } else {
            this.e = i3;
        }
        if ((i & 32) == 0) {
            this.f = 0L;
        } else {
            this.f = j;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vcb)) {
            return false;
        }
        vcb vcbVar = (vcb) obj;
        if (c16.i(this.a, vcbVar.a) && c16.i(this.b, vcbVar.b) && this.c == vcbVar.c && c16.i(this.d, vcbVar.d) && this.e == vcbVar.e && this.f == vcbVar.f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + hl5.a(this.e, eub.j(hl5.a(this.c, eub.j(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder y = nk2.y("SyncInfo(deviceId=", this.a, ", deviceName=", this.b, ", deviceType=");
        nk2.z(this.c, ", appVersion=", this.d, ", backupVersion=", y);
        y.append(this.e);
        y.append(", createAt=");
        y.append(this.f);
        y.append(")");
        return y.toString();
    }

    public vcb(long j, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = 0;
        this.d = str3;
        this.e = 1;
        this.f = j;
    }
}

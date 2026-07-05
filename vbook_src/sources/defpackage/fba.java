package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fba  reason: default package */
/* loaded from: classes.dex */
public final class fba {
    public final String a;
    public final String b;
    public final int c;
    public final long d;
    public final ag2 e;
    public final String f;
    public final String g;

    public fba(String str, String str2, int i, long j, ag2 ag2Var, String str3, String str4) {
        rs8.w(str, str2, str4);
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
        this.e = ag2Var;
        this.f = str3;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof fba) {
                fba fbaVar = (fba) obj;
                if (!c16.i(this.a, fbaVar.a) || !c16.i(this.b, fbaVar.b) || this.c != fbaVar.c || this.d != fbaVar.d || !this.e.equals(fbaVar.e) || !this.f.equals(fbaVar.f) || !c16.i(this.g, fbaVar.g)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.g.hashCode() + eub.j((this.e.hashCode() + hl5.c(hl5.a(this.c, eub.j(this.a.hashCode() * 31, 31, this.b), 31), this.d, 31)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionInfo(sessionId=");
        sb.append(this.a);
        sb.append(", firstSessionId=");
        sb.append(this.b);
        sb.append(", sessionIndex=");
        sb.append(this.c);
        sb.append(", eventTimestampUs=");
        sb.append(this.d);
        sb.append(", dataCollectionStatus=");
        sb.append(this.e);
        sb.append(", firebaseInstallationId=");
        sb.append(this.f);
        sb.append(", firebaseAuthenticationToken=");
        return s21.p(sb, this.g, ')');
    }
}

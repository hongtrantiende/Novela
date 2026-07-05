package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zc0  reason: default package */
/* loaded from: classes.dex */
public final class zc0 {
    public String a;
    public int b;
    public String c;
    public String d;
    public long e;
    public long f;
    public String g;
    public byte h;

    public final ad0 a() {
        if (this.h == 3 && this.b != 0) {
            String str = this.a;
            return new ad0(this.b, this.e, this.f, str, this.c, this.d, this.g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == 0) {
            sb.append(" registrationStatus");
        }
        if ((this.h & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((this.h & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        vs.k(s21.o("Missing required properties:", sb));
        return null;
    }
}

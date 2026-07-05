package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m05  reason: default package */
/* loaded from: classes3.dex */
public final class m05 {
    public static final /* synthetic */ r76[] d = {new qv7(m05.class, "accessToken", "getAccessToken()Ljava/lang/String;", 0), new qv7(m05.class, "refreshToken", "getRefreshToken()Ljava/lang/String;", 0), new qv7(m05.class, "expiresAt", "getExpiresAt()J", 0)};
    public final u68 a;
    public final u68 b;
    public final wx6 c;

    public m05() {
        mfb mfbVar = new mfb(new k24(22));
        this.a = dpe.u((h49) mfbVar.getValue(), "access_token", "");
        this.b = dpe.u((h49) mfbVar.getValue(), "refresh_token", "");
        this.c = dpe.s((h49) mfbVar.getValue(), "expires_at", 0L);
    }

    public final n05 a() {
        r76[] r76VarArr = d;
        r76 r76Var = r76VarArr[0];
        u68 u68Var = this.a;
        int length = ((String) u68Var.c(r76Var, this)).length();
        u68 u68Var2 = this.b;
        if (length == 0 && ((String) u68Var2.c(r76VarArr[1], this)).length() == 0) {
            return null;
        }
        return new n05(((Number) this.c.c(r76VarArr[2], this)).longValue(), (String) u68Var.c(r76VarArr[0], this), (String) u68Var2.c(r76VarArr[1], this));
    }
}

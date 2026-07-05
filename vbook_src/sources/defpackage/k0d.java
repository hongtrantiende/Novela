package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k0d  reason: default package */
/* loaded from: classes3.dex */
public final class k0d {
    public final u68 a;
    public final u68 b;
    public final u68 c;
    public final u68 d;
    public final u68 e;
    public final u68 f;
    public final u68 g;
    public final hy5 h;
    public final hy5 i;
    public final u68 j;
    public final u68 k;
    public final wx6 l;
    public static final /* synthetic */ r76[] n = {new qv7(k0d.class, "userId", "getUserId()Ljava/lang/String;", 0), new qv7(k0d.class, "email", "getEmail()Ljava/lang/String;", 0), new qv7(k0d.class, "token", "getToken()Ljava/lang/String;", 0), new qv7(k0d.class, "refreshToken", "getRefreshToken()Ljava/lang/String;", 0), new qv7(k0d.class, "avatar", "getAvatar()Ljava/lang/String;", 0), new qv7(k0d.class, "name", "getName()Ljava/lang/String;", 0), new qv7(k0d.class, "freeDownloadDay", "getFreeDownloadDay()Ljava/lang/String;", 0), new qv7(k0d.class, "freeDownloadCount", "getFreeDownloadCount()I", 0), new qv7(k0d.class, "role", "getRole()I", 0), new qv7(k0d.class, "color", "getColor()Ljava/lang/String;", 0), new qv7(k0d.class, "us", "getUs()Ljava/lang/String;", 0), new qv7(k0d.class, "ue", "getUe()J", 0)};
    public static final bl8 m = new bl8(7);
    public static final byte[] o = {-83, -117, -49, 18, -10, -21, -27, -44, -62, -65, -25, -105, -40, 27, -48, -83, 12, -100, 94, Byte.MAX_VALUE, -118, -86, -50, 70, -46, -93, -118, -64, 22, 85, -97, -18};
    public static final byte[] p = {39, -76, 30, 85, 106, -55, 3, -113, -46, 75, -112, 60, -31, 118, 24, -81, 82, 13, -28, 51, -103, 74, -79, 110, 7, -59, 32, -5, -120, 20, 109, -23};

    public k0d() {
        h49 o2 = v9e.o("users");
        this.a = new u68(o2, "user_id", "");
        this.b = new u68(o2, "email", "");
        this.c = new u68(o2, "token", "");
        this.d = new u68(o2, "refresh_token", "");
        this.e = new u68(o2, "avatar", "");
        this.f = new u68(o2, "name", "");
        this.g = new u68(o2, "free_download_day", "");
        this.h = new hy5(o2, "free_download_count", 0);
        this.i = new hy5(o2, "role", 0);
        this.j = new u68(o2, "color", "");
        this.k = new u68(o2, "us", "");
        this.l = new wx6(o2, "ue", 0L);
    }

    public final boolean a() {
        r76[] r76VarArr = n;
        r76 r76Var = r76VarArr[10];
        u68 u68Var = this.k;
        if (((String) u68Var.c(r76Var, this)).length() != 0) {
            long b = by5.a.k().b();
            r76 r76Var2 = r76VarArr[11];
            wx6 wx6Var = this.l;
            if (b > ((Number) wx6Var.c(r76Var2, this)).longValue()) {
                return false;
            }
            return c16.i((String) u68Var.c(r76VarArr[10], this), d(((Number) wx6Var.c(r76VarArr[11], this)).longValue()));
        }
        return false;
    }

    public final String b() {
        return (String) this.c.c(n[2], this);
    }

    public final String c() {
        return (String) this.a.c(n[0], this);
    }

    public final String d(long j) {
        String c = c();
        String b = l53.b();
        byte[] H = r4b.H(c + ":" + b + ":" + j);
        m.getClass();
        byte[] bArr = o;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr2[i] = (byte) (bArr[i] ^ p[i]);
        }
        return kxe.m(xpe.h(bArr2, H, new vv9()).a);
    }

    public final void e(boolean z) {
        u68 u68Var = this.k;
        r76[] r76VarArr = n;
        wx6 wx6Var = this.l;
        if (z) {
            long b = by5.a.k().b() + 604800000;
            wx6Var.e(r76VarArr[11], Long.valueOf(b));
            u68Var.e(r76VarArr[10], d(b));
            return;
        }
        wx6Var.e(r76VarArr[11], 0L);
        u68Var.e(r76VarArr[10], "");
    }

    public final void f(String str) {
        str.getClass();
        this.c.e(n[2], str);
    }
}

package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p05  reason: default package */
/* loaded from: classes3.dex */
public final class p05 {
    public final fw2 a = a("openid https://www.googleapis.com/auth/drive.file");
    public final fw2 b = a("openid email profile");

    /* JADX WARN: Type inference failed for: r1v0, types: [ht3, java.lang.Object] */
    public static fw2 a(String str) {
        rc8 rc8Var = new rc8();
        ?? obj = new Object();
        obj.a = null;
        obj.b = null;
        obj.c = null;
        obj.d = null;
        obj.e = null;
        obj.b = "https://accounts.google.com/o/oauth2/v2/auth";
        obj.a = "https://oauth2.googleapis.com/token";
        obj.c = "https://openidconnect.googleapis.com/v1/userinfo";
        rc8Var.b = obj;
        rc8Var.c = "564805706021-rt28p979ne9dp1asncibhj3dh24r6mrf.apps.googleusercontent.com";
        rc8Var.d = "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";
        rc8Var.f = qk1.S256;
        rc8Var.e = str;
        rc8Var.g = "com.googleusercontent.apps.564805706021-rt28p979ne9dp1asncibhj3dh24r6mrf:/oauth2callback";
        return new fw2(rc8Var);
    }
}

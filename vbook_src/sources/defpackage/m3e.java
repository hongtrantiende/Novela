package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m3e  reason: default package */
/* loaded from: classes.dex */
public abstract class m3e {
    public static final h4f a;
    public static volatile String b;
    public static final xk9 c;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, k32] */
    static {
        k3e k3eVar = k3e.b;
        int i = ts5.c;
        x4f x4fVar = new x4f(k3eVar, true, tm9.F);
        ?? obj = new Object();
        obj.b = x4fVar;
        c = new xk9((Object) obj, 23);
        a = new h4f("__phenotype_server_token", obj, "");
        b = null;
    }

    public static String a() {
        return (String) a.get();
    }
}

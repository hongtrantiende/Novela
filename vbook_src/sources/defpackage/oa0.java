package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oa0  reason: default package */
/* loaded from: classes.dex */
public final class oa0 implements e78 {
    public static final oa0 a = new Object();
    public static final ac4 b = ac4.a("eventType");
    public static final ac4 c = ac4.a("sessionData");
    public static final ac4 d = ac4.a("applicationInfo");

    @Override // defpackage.ws3
    public final void a(Object obj, Object obj2) {
        aba abaVar = (aba) obj;
        f78 f78Var = (f78) obj2;
        abaVar.getClass();
        f78Var.a(b, jy3.SESSION_START);
        f78Var.a(c, abaVar.a);
        f78Var.a(d, abaVar.b);
    }
}

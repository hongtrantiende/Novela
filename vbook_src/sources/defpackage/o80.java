package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o80  reason: default package */
/* loaded from: classes.dex */
public final class o80 implements e78 {
    public static final o80 a = new Object();
    public static final ac4 b = ac4.a("baseAddress");
    public static final ac4 c = ac4.a("size");
    public static final ac4 d = ac4.a("name");
    public static final ac4 e = ac4.a("uuid");

    @Override // defpackage.ws3
    public final void a(Object obj, Object obj2) {
        byte[] bArr;
        z92 z92Var = (z92) obj;
        f78 f78Var = (f78) obj2;
        f78Var.g(b, ((pb0) z92Var).a);
        pb0 pb0Var = (pb0) z92Var;
        f78Var.g(c, pb0Var.b);
        f78Var.a(d, pb0Var.c);
        String str = pb0Var.d;
        if (str != null) {
            bArr = str.getBytes(qa2.a);
        } else {
            bArr = null;
        }
        f78Var.a(e, bArr);
    }
}

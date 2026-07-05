package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e17  reason: default package */
/* loaded from: classes.dex */
public final class e17 {
    public static b17 a(Object obj, Object obj2) {
        b17 b17Var = (b17) obj;
        b17 b17Var2 = (b17) obj2;
        if (!b17Var2.isEmpty()) {
            if (!b17Var.a) {
                b17Var = b17Var.b();
            }
            b17Var.a();
            if (!b17Var2.isEmpty()) {
                b17Var.putAll(b17Var2);
            }
        }
        return b17Var;
    }
}

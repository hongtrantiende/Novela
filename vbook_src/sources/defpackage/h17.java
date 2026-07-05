package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h17  reason: default package */
/* loaded from: classes.dex */
public abstract class h17 {
    public static final e17 a;
    public static final e17 b;

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, e17] */
    static {
        z89 z89Var = z89.c;
        e17 e17Var = null;
        try {
            e17Var = (e17) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = e17Var;
        b = new Object();
    }
}

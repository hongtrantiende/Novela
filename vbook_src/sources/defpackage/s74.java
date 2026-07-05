package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s74  reason: default package */
/* loaded from: classes.dex */
public abstract class s74 {
    public static final p74 a = new Object();
    public static final p74 b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p74] */
    static {
        z89 z89Var = z89.c;
        p74 p74Var = null;
        try {
            p74Var = (p74) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = p74Var;
    }
}

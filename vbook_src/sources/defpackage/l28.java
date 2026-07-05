package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l28  reason: default package */
/* loaded from: classes.dex */
public abstract class l28 {
    public static final i28 a;
    public static final i28 b;

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, i28] */
    static {
        z89 z89Var = z89.c;
        i28 i28Var = null;
        try {
            i28Var = (i28) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = i28Var;
        b = new Object();
    }
}

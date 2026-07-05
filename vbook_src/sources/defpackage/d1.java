package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d1  reason: default package */
/* loaded from: classes3.dex */
public abstract class d1 {
    public abstract f51 a();

    public abstract b72 b();

    public final Object c(String str) {
        String str2;
        try {
            zm8 zm8Var = a().c;
            zm8Var.getClass();
            try {
                return d(nye.x(zm8Var, str, b()));
            } catch (IllegalArgumentException e) {
                String message = e.getMessage();
                if (message == null) {
                    str2 = "The value parsed from '" + ((Object) str) + "' is invalid";
                } else {
                    str2 = message + " (when parsing '" + ((Object) str) + "')";
                }
                throw new IllegalArgumentException(str2, e);
            }
        } catch (om8 e2) {
            throw new IllegalArgumentException("Failed to parse value from '" + ((Object) str) + '\'', e2);
        }
    }

    public abstract Object d(b72 b72Var);
}

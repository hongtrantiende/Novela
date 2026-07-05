package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q2e  reason: default package */
/* loaded from: classes.dex */
public abstract class q2e {
    public static final yz a = new jla(0);
    public static final yz b = new jla(0);

    public static void a(String str) {
        yz yzVar = a;
        synchronized (yzVar) {
            if (yzVar.get(str) != null) {
                throw new ClassCastException();
            }
        }
        throw new IllegalStateException("Tried to get the emulator widget endpoint, but no emulator endpoint overrides found.");
    }

    public static String b(String str) {
        yz yzVar = a;
        synchronized (yzVar) {
            if (yzVar.get(str) != null) {
                throw new ClassCastException();
            }
        }
        return "https://".concat("www.googleapis.com/identitytoolkit/v3/relyingparty");
    }
}

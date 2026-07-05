package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x51  reason: default package */
/* loaded from: classes.dex */
public final class x51 implements tm4 {
    public static final x51 a = new Object();
    public static Boolean b;

    @Override // defpackage.tm4
    public final boolean b() {
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw a82.f("canFocus is read before it is written");
    }

    @Override // defpackage.tm4
    public final void d(boolean z) {
        b = Boolean.valueOf(z);
    }
}
